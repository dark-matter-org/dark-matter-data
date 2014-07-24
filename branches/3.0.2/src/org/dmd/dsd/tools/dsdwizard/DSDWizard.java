package org.dmd.dsd.tools.dsdwizard;

import java.io.File;
import java.io.IOException;

import org.dmd.util.BooleanVar;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.CommandLine;

/**
 * The DSDWizard will create the basic infrastructure for the creation of a new Domain Specific Definition (DSD)
 * package based on the dark-matter definition mechanisms.
 */
public class DSDWizard {
	
	StringBuffer  	help;

	CommandLine		cl;
	BooleanVar		helpFlag	= new BooleanVar();
	StringBuffer	workspace	= new StringBuffer();
	StringBuffer	srcdir		= new StringBuffer();	// determine the package from the srcdir name
	StringBuffer	dsdname		= new StringBuffer();	// the shortform name e.g. gpb, dms etc. this is the extension for definitions of this type
//	StringBuffer	basedef		= new StringBuffer();
	StringBuffer	def1		= new StringBuffer();
	StringBuffer	def2		= new StringBuffer();
	StringBuffer	def3		= new StringBuffer();
	
	String			fullSrcdir;
	String			sharedDir;				// srcdir/shared
	String			sharedDmdconfigDir;		// srcdir/shared/dmdconfig
	String			sharedGenDir;			// srcdir/shared/generated
	String			sharedPackage;
	
	String			dmwDir;
	String			serverDmdConfigDir;		// srcdir/server/dmdconfig
	String			serverGenDir;			// srcdir/server/generated
	String			serverExtendedDir;		// srcdir/server/extended
	String			dmwPackage;
	

	public DSDWizard(String[] args) {
		
		cl = new CommandLine();
        cl.addOption("-h",     		helpFlag,	"Dumps the help message.");
        cl.addOption("-workspace",  workspace,	"Indicates the base workspace folder.");
        cl.addOption("-srcdir",  	srcdir,		"Indicates the folder where the example code will be generated.");
        cl.addOption("-dsdname",  	dsdname,	"The name of the domain specific definition pack you want to create.");
		
		cl.parseArgs(args);
	}
	
	public void run() throws ResultException, IOException{

		System.out.println("workspace: " + workspace);
		
		File ws = new File(workspace.toString());
		
		if (!ws.exists()){
			ResultException rc = new ResultException("Workspace doesn't exist: " + workspace);
			throw(rc);
		}
		
		if (!srcdir.toString().startsWith("/")){
			srcdir = new StringBuffer("/" + srcdir.toString());
		}
		
		System.out.println("srcdir: " + srcdir);
		
		fullSrcdir = workspace.toString() + srcdir.toString();
		
		File src = new File(fullSrcdir);
		
		if (!src.exists()){
			if (!src.mkdirs()){
				ResultException rc = new ResultException("Couldn't create output directory: " + fullSrcdir);
				throw(rc);
			}
			System.out.println("Created " + fullSrcdir);
		}
		
		sharedDir 			= fullSrcdir + "/shared";
		sharedGenDir 		= sharedDir + "/generated";
		sharedDmdconfigDir 	= sharedDir + "/dmdconfig";
		sharedPackage		= (srcdir + "/shared").replaceAll("/", ".").replaceFirst(".", "");
		
		dmwDir				= fullSrcdir + "/server";
		serverDmdConfigDir 	= fullSrcdir + "/server/dmdconfig";
		serverGenDir 		= fullSrcdir + "/server/generated";
		serverExtendedDir 	= fullSrcdir + "/server/extended";
		dmwPackage			= (srcdir + "/server").replaceAll("/", ".").replaceFirst(".", "");
		
		System.out.println("Packages: " + sharedPackage + "  " + dmwPackage);
		// We attempt to create the base directory structure
		
		createDir(sharedDir);
		createDir(sharedGenDir);
		createDir(sharedDmdconfigDir);
		
		createDir(serverGenDir);
		createDir(serverExtendedDir);
		createDir(serverDmdConfigDir);
		
		DSDSchemaGenerator.generateSchema(fullSrcdir, sharedPackage, dmwPackage, dsdname.toString(), def1.toString(), def2.toString(), def3.toString());
	}
	
	void createDir(String dir) throws ResultException {
		File folder = new File(dir);
		
		if (!folder.exists()){
			if (!folder.mkdirs()){
				ResultException rc = new ResultException("Couldn't create directory: " + dir);
				throw(rc);
			}
		}
		
	}

	void initHelp(){
		help = new StringBuffer();
		help.append("dsdwizard -h -workspace -srcdir -dmdid -dsdname -basedef -def1 -def2 -def3\n");
        help.append("\n");
	}
}
