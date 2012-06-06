package org.dmd.util.count;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.util.BooleanVar;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultSet;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.CommandLine;
import org.dmd.util.parsing.StringArrayList;
/**
 * The countMain class provides the mainline logic for the count utility.
 * @author Peter Strong
 * @version 1.0
 */

public class CodeCountMain {

    StringBuffer  help;   /* A block comment with code */

                            /* Single line block comment */

    /**
     * Key: String (package name)
     * Value: TreeMap (Key: filename, Value countInfo)
     */
    TreeMap<String,TreeMap<String,CodeCountInfo>>         packages;

    PrintfFormat    nameFormat;
    PrintfFormat    totalFormat;
    PrintfFormat    numFormat;
    PrintfFormat    colFormat;

    int             longestName;

    BooleanVar          helpFlag    = new BooleanVar();
    BooleanVar          recursiveFlag    = new BooleanVar();
    StringBuffer        ofn         = new StringBuffer("");
	StringBuffer		workspace	= new StringBuffer();
    StringBuffer        inDir       = new StringBuffer();
    StringBuffer        outDir      = new StringBuffer("./out");
    StringArrayList     skip        = new StringArrayList();

    BufferedWriter      out;

    /**
     * We parse the specified schema and generate code accordingly.
     * @param args The program arguments.
     */
    public void run(String[] args) {
        CommandLine         cl          = new CommandLine();
        ResultSet           rs          = new ResultSet();

        nameFormat = new PrintfFormat("%-30s");
        numFormat  = new PrintfFormat("%10d");
        colFormat  = new PrintfFormat("%10s");
        longestName = 0;

        packages    = new TreeMap<String,TreeMap<String,CodeCountInfo>>();
        out         = null;

        help = new StringBuffer();
        //            ***************************************************************************
        help.append("count -h -workspace -id -of -r -skip\n\n");
        help.append("The code count tool provides a simple code count mechansism. It indicates the\n");
        help.append("number of source, comment, import and blank lines in a set of Java files\n");
        help.append("and how many files are auto generated.\n");
        help.append("\n");
        help.append("-h          Dumps the help information\n");
        help.append("\n");
        help.append("-workspace  Indicates the workspace prefix.\n");
        help.append("\n");
        help.append("-id         Indicates the directory beneath the workspace at which parsing should start. \n");
        help.append("\n");
        help.append("-of         The output file name.\n");
        help.append("\n");
        help.append("-r          Indicates that you want to recurse through all subdirectories. \n");
        help.append("\n");
        help.append("-skip      (suffix) Indicates that you want to skip subdirectories that end with the \n");
        help.append("           specified suffix.\n");
        help.append("\n");
        help.append("\n");

        cl.addOption("-h",helpFlag,"Dumps the help message.");
        cl.addOption("-o",ofn,"Output file name.");
        cl.addOption("-workspace", 	workspace, 	"The workspace prefix");
        cl.addOption("-indir",inDir,"The input directory");
        cl.addOption("-of",outDir,"The output directory");
        cl.addOption("-r",recursiveFlag,"Recurses through all subdirectories.");
        cl.addOption("-skip",skip,"Skips the specified directory.");

        cl.parseArgs(args);

        if (ofn.length() > 0){
            try {
                out = new BufferedWriter(new FileWriter(ofn.toString()));
            } catch (IOException e) {
                System.out.println("IO Error:\n" + e);
                System.exit(1);
            }
        }

        // println("The args " + args[0] + "\n");

        if ((args.length == 0) || helpFlag.booleanValue() == true){
            println(help.toString());
            System.exit(0);
        }

        if (workspace.length() == 0){
        	System.err.println("You must specify the -workspace argument");
        	System.exit(1);
        }
        
        String startDir = workspace.toString();
        
        if (inDir.length() > 0){
        	startDir = startDir + File.separator + inDir.toString();
        }

        readDirectory(rs,startDir);

        nameFormat = new PrintfFormat("%-" + longestName + "s");
        totalFormat = new PrintfFormat("%" + longestName + "s");
        dumpInfo();

        println(rs.toString());

        if (out != null){
            try {
                System.out.println("Output written to " + ofn.toString());
                out.close();
            } catch (IOException e) {
                System.out.println("IO Error:\n" + e);
                System.exit(1);
            }
        }

        System.exit(0);
    }

    boolean readDirectory(ResultSet rs, String dirName){
        boolean rc          = true;
        File    codeDir   = new File(dirName);

        if (skip.size() > 0){
            for(int i=0; i<skip.size(); i++){
                if (dirName.endsWith((String)skip.get(i))){
                    System.out.println("Skipping directory: " + dirName);
                    return(true);
                }
            }
        }

        if (!codeDir.exists()){
            rs.addResult(Result.FATAL,"Couldn't access code directory: " + dirName);
            rc = false;
        }
        else{
            String      fullname        = null;
            File        currFile    = null;
            String[]    dirList     = codeDir.list();

            for(int i=0; i<dirList.length;i++){
                fullname = codeDir.getAbsolutePath() + File.separatorChar + dirList[i];
                currFile = new File(fullname);
                if (currFile.isDirectory()){
                    if (recursiveFlag.booleanValue()){
                        if (!this.readDirectory(rs,fullname))
                            rc = false;
                    }
                }
                else{
                    if (fullname.endsWith(".java")){
                        if (!parseFile(rs,fullname,dirList[i])){
                            rc = false;
                            break;
                        }
                    }
                }
            }
        }

        return(rc);
    }

    /**
     * Reads an individual file.
     * @param rs Place to pass back results.
     * @param fullname The absolute name of the file.
     * @param justfile Just the file name.
     */
    boolean parseFile(ResultSet rs, String fullname, String justname){
        boolean     rc          = true;
        CodeCountInfo   info        = new CodeCountInfo(fullname,justname);
        boolean     codeFound   = false;

// println("File: " + fullname);
        if (justname.length() > longestName)
            longestName = justname.length();

        try {
            LineNumberReader in = new LineNumberReader(new FileReader(fullname));
            String tmpstr;
            String str;
            while ((tmpstr = in.readLine()) != null) {
                str = tmpstr.trim();
// println(in.getLineNumber() + ": " + str);
                if (str.length() == 0)
                    info.blankCount++;
                else if (str.startsWith("import")){
                    info.importCount++;
                    codeFound = true;
                }
                else if (str.startsWith("package") && (!codeFound)){
                    info.importCount++;
                    info.setPackage(str);
                }
                else if (str.lastIndexOf("/*") != -1){
// println("block start");
                    // We have a block comment
                    if (!processBlock(str,in,info,rs)){
                        rc = false;
                        break;
                    }
                }
                else if (str.startsWith("/"))
                    info.commentCount++;
                else{
                    codeFound = true;
                    info.codeCount++;
                }
            }
            info.totalLines = in.getLineNumber();

            in.close();
        }
        catch (IOException e) {
            rs.addResult(Result.FATAL,e.toString());
            rs.lastResult().moreMessages("Occurred while reading file: " + fullname);
            rc = false;
        }

        if (rc){
            // println(info.formatInfo(nameFormat,numFormat));
            addCountInfo(info);
        }

        return(rc);
    }

    /**
     * We come here if we find a \/* on a line. We now have to determine
     * some other things.
     */
    boolean processBlock(String curr, LineNumberReader in, CodeCountInfo info, ResultSet rs){
        boolean rc = true;

        if (curr.lastIndexOf("*/") != -1){
            // The comment also ends on this line, see if the comment is the
            // whole line.
            if (curr.startsWith("/*") && curr.endsWith("*/")){
                info.commentCount++;
// println("SLBC: #" + curr + "#");
                return(rc);
            }
            // Otherwise, we assume that there's some code on the line and count
            // it as code
            info.codeCount++;
// println("BCWC: #" + curr + "#");
            return(rc);
        }

        // Otherwise, we have a multi-line comment - hunt for the end
        try{
            int startLine = in.getLineNumber();
            String  str;

            while ((str = in.readLine()) != null) {
                if (str.lastIndexOf("*/") != -1){
                    info.commentCount += (in.getLineNumber() - startLine + 1);
// println("MLBC: start " + startLine + "  end " + in.getLineNumber());
                    break;
                }
            }
        }
        catch (IOException e) {
            rs.addResult(Result.FATAL,e.toString());
            rs.lastResult().moreMessages("Occurred while reading file: " + info.fileName);
            rc = false;
        }

        return(rc);
    }

    /**
     * Adds a countInfo instance to our master tree.
     */
    void addCountInfo(CodeCountInfo info){
    	TreeMap<String,CodeCountInfo> curr = (TreeMap<String,CodeCountInfo>)packages.get(info.packageName);

        if (curr == null){
            curr = new TreeMap<String,CodeCountInfo>();
            packages.put(info.packageName,curr);
        }

        curr.put(info.fileName,info);
    }

    /**
     * Dumps the complete set of info.
     */
    void dumpInfo(){
        Iterator<String>    			packit  	= packages.keySet().iterator();
        TreeMap<String,CodeCountInfo>   infotree    = null;
        Iterator<CodeCountInfo>    		infoit  	= null;
        String      					pname   	= null;
        CodeCountInfo   				info    	= null;

        int         regFiles    = 0;
        int         autoFiles   = 0;

        int         regFilesG    = 0;
        int         autoFilesG   = 0;

        // Package regular count
        int         stotal  = 0;
        int         ctotal  = 0;
        int         itotal  = 0;
        int         btotal  = 0;
        int         gtotal  = 0;

        // Package auto count
        int         astotal  = 0;
        int         actotal  = 0;
        int         aitotal  = 0;
        int         abtotal  = 0;
        int         agtotal  = 0;

        // Grand totals
        int         stotalG  = 0;
        int         ctotalG  = 0;
        int         itotalG  = 0;
        int         btotalG  = 0;
        int         gtotalG  = 0;

        int         astotalG  = 0;
        int         actotalG  = 0;
        int         aitotalG  = 0;
        int         abtotalG  = 0;
        int         agtotalG  = 0;

        while(packit.hasNext()){
            stotal = ctotal = itotal = btotal = gtotal = 0;
            astotal = actotal = aitotal = abtotal = agtotal = 0;
            regFiles = autoFiles = 0;

            pname = (String)packit.next();
            println(pname + ":");
            println(nameFormat.sprintf("File")
            + colFormat.sprintf("Src")
            + colFormat.sprintf("Comment")
            + colFormat.sprintf("Import")
            + colFormat.sprintf("Blank")
            + colFormat.sprintf("Total"));

            infotree = (TreeMap<String,CodeCountInfo>)packages.get(pname);

            infoit = infotree.values().iterator();
            while(infoit.hasNext()){
                info = infoit.next();
                println(info.formatInfo(nameFormat,numFormat));

                if (info.auto){
                    astotal += info.codeCount;
                    actotal += info.commentCount;
                    aitotal += info.importCount;
                    abtotal += info.blankCount;
                    agtotal += info.totalLines;
                    autoFiles++;
                }
                else{
                    stotal += info.codeCount;
                    ctotal += info.commentCount;
                    itotal += info.importCount;
                    btotal += info.blankCount;
                    gtotal += info.totalLines;
                    regFiles++;
                }
            }
            println(totalFormat.sprintf("Regular files:")
            + numFormat.sprintf(stotal)
            + numFormat.sprintf(ctotal)
            + numFormat.sprintf(itotal)
            + numFormat.sprintf(btotal)
            + numFormat.sprintf(gtotal));

            println(totalFormat.sprintf("Auto-generated:")
            + numFormat.sprintf(astotal)
            + numFormat.sprintf(actotal)
            + numFormat.sprintf(aitotal)
            + numFormat.sprintf(abtotal)
            + numFormat.sprintf(agtotal));

            println(totalFormat.sprintf("Package total:")
            + numFormat.sprintf(stotal + astotal)
            + numFormat.sprintf(ctotal + actotal)
            + numFormat.sprintf(itotal + aitotal)
            + numFormat.sprintf(btotal + abtotal)
            + numFormat.sprintf(gtotal + agtotal) + "\n");

            stotalG += stotal;
            ctotalG += ctotal;
            itotalG += itotal;
            btotalG += btotal;
            gtotalG += gtotal;

            astotalG += astotal;
            actotalG += actotal;
            aitotalG += aitotal;
            abtotalG += abtotal;
            agtotalG += agtotal;

            regFilesG += regFiles;
            autoFilesG += autoFiles;
        }

        println("\n");
        println(nameFormat.sprintf("System Totals")
        + colFormat.sprintf("Src")
        + colFormat.sprintf("Comment")
        + colFormat.sprintf("Import")
        + colFormat.sprintf("Blank")
        + colFormat.sprintf("Total"));

        println(totalFormat.sprintf("Regular files:")
        + numFormat.sprintf(stotalG)
        + numFormat.sprintf(ctotalG)
        + numFormat.sprintf(itotalG)
        + numFormat.sprintf(btotalG)
        + numFormat.sprintf(gtotalG));

        println(totalFormat.sprintf("Auto-generated:")
        + numFormat.sprintf(astotalG)
        + numFormat.sprintf(actotalG)
        + numFormat.sprintf(aitotalG)
        + numFormat.sprintf(abtotalG)
        + numFormat.sprintf(agtotalG));

        println(totalFormat.sprintf("System totals:")
        + numFormat.sprintf(stotalG + astotalG)
        + numFormat.sprintf(ctotalG + actotalG)
        + numFormat.sprintf(itotalG + aitotalG)
        + numFormat.sprintf(btotalG + abtotalG)
        + numFormat.sprintf(gtotalG + agtotalG) + "\n");

        println(nameFormat.sprintf("File count:"));
        println(totalFormat.sprintf("Regular files:") + regFilesG);
        println(totalFormat.sprintf("Auto-generated:") + autoFilesG);
        println(totalFormat.sprintf("Total:") + (regFilesG + autoFilesG));
    }

    /**
     * Prints to either standard out or the output file if specified.
     */
    void println(String s){
        if (out == null){
            System.out.println(s);
        }
        else{
            try {
                out.write(s + "\n");
            } catch (IOException e) {
                System.out.println("IO Error:\n" + e);
                System.exit(1);
            }
        }
    }
}
 
