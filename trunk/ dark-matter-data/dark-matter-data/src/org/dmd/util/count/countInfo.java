package org.dmd.util.count;

import org.dmd.util.formatting.PrintfFormat;

/**
 * This class stores information for an individual Java file.
 */

public class countInfo {

    public String   packageName;

    public String   fileName;

    public int      codeCount;

    public int      blankCount;

    public int      importCount;

    public int      commentCount;

    public int      totalLines;

    boolean         auto;

    /**
     * Constructs a new info container.
     */
    countInfo(String n){
        fileName = new String(n);

        codeCount       = 0;
        blankCount      = 0;
        importCount     = 0;
        commentCount    = 0;
        totalLines      = 0;
        auto            = false;

        if (fileName.endsWith("AG.java"))
            auto = true;
    }

    /**
     * Formats the info as a string.
     */
    public String formatInfo(PrintfFormat nameFormat, PrintfFormat numFormat){
        StringBuffer sb = new StringBuffer();

        sb.append(nameFormat.sprintf(fileName));
        sb.append(numFormat.sprintf(codeCount));
        sb.append(numFormat.sprintf(commentCount));
        sb.append(numFormat.sprintf(importCount));
        sb.append(numFormat.sprintf(blankCount));
        sb.append(numFormat.sprintf(totalLines));

        return(sb.toString());
    }

    public void setPackage(String s){
        StringBuffer sb = new StringBuffer(s);

        sb.replace(0,7,"");
        while(sb.charAt(0) == ' ')
            sb.replace(0,1,"");

        sb.setLength(sb.length()-1);

        packageName = new String(sb.toString());
    }
}
 
