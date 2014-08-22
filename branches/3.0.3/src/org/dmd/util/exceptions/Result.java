//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.util.exceptions;

import java.util.*;

/**
 * This class provides a mechanism to indicate a variety of error and/or warning
 * information back to a caller.
 * <P>
 * Unlike an exception, an Result can be used to reflect a much more detailed
 * set of information back to a calling routine. It is especially useful for
 * interfaces that involve interaction with a user. When used in conjunction
 * with the ResultSet class, this class can be used to send back several error
 * or warning indications based on a single call to a routine.
 * @see org.dmd.util.exceptions.ResultSet
 */

public class Result {

    /**
     * Indicates that no severity information has been set.
     */
    public final static int NONE    = 0;

    /**
     * Indicates that the result is merely informational; nothing serious.
     */
    public final static int INFO    = 1;

    /**
     * Indicates that a problem was encountered but it's just a warning.
     */
    public final static int WARNING = 2;

    /**
     * Indicates that a definite error has occurred; proceed at your own risk!
     */
    public final static int ERROR   = 3;

    /**
     * Indicates that the error is so serious that you should cease whatever
     * operation you're performing.
     */
    public final static int FATAL   = 4;

    // The following constants should be kept in line with the values of the
    // RrfResponseCategoryEnumAG.

    /**
     * Indicates that the response is related to software.
     */
    public final static int CAT_SOFTWARE   = 1;

    /**
     * Indicates that the response is related to security.
     */
    public final static int CAT_SECURITY   = 2;

    /**
     * Indicates that the response is related to the database.
     */
    public final static int CAT_DATABASE   = 3;

    /**
     * Indicates that the response is related to communications.
     */
    public final static int CAT_COMMS       = 4;

    /**
     * Indicates that the response is related to an operation.
     */
    public final static int CAT_OPERATIONAL = 5;

    /**
     * The text msg of the response.
     */
    private StringBuffer    messageV;

    /**
     * Additional message lines. This is an array of StringBuffers.
     */
	private ArrayList<StringBuffer>       moreMessagesV;

    /**
     * The current number of additional messages.
     */
    private int             moreCountV;

    /**
     * The severity of the response - NONE, INFO, WARNING, ERROR, FATAL.
     */
    private int             severityV;

    /**
     * The category of the response - SOFTWARE, SECURITY, DATABASE, COMMS,
     * OPERATIONAL.
     */
    private int             categoryV;

    /**
     * If the result has to do with the contents of a file, this member
     * should have the file name.
     */
    private StringBuffer    fileNameV;

    /**
     * If the result has to do with the contents of a file, this member may
     * indicate the line number at which problem occurred.
     */
    private int             lineNumberV;

    /**
     * In some cases, the exact line where a problem occurred can't be determined;
     * in that case, this member holds an approximation of the line.
     */
    private int             nearLineNumberV;

    /**
     * If the response has to do with the processing of a particular attribute
     * value e.g. during a set() operation on a DafDataStore, this member would
     * hold the name of the attribute being manipulated.
     */
    private StringBuffer    attrNameV;

    /**
     * The unique message identifier.
     */
    private int             uniqueIDV;

    /**
    * Creates a new RResult container.
    */
	Result() {
        messageV        = new StringBuffer();
        moreMessagesV   = new ArrayList<StringBuffer>();
        moreCountV      = 0;
        severityV       = NONE;
        categoryV       = NONE;
        fileNameV       = new StringBuffer();
        lineNumberV     = -1;
        nearLineNumberV = -1;
        attrNameV       = new StringBuffer();
        uniqueIDV       = -1;
    }
	
	Result(String msg, String file, int line){
		severityV = ERROR;
		messageV = new StringBuffer(msg);
		fileNameV = new StringBuffer(file);
		lineNumberV = line;
	}

    /**
    * Creates a new RResult container from an existing one.
    */
	public Result(Result r) {
        messageV        = new StringBuffer(r.messageV.toString());
        moreMessagesV   = new ArrayList<StringBuffer>();
        moreCountV      = 0;
        for(int i=0; i<r.moreMessagesV.size(); i++){
            moreMessagesV.add(new StringBuffer(((StringBuffer)r.moreMessagesV.get(i)).toString()) );
            moreCountV++;
        }
        severityV       = r.severityV;
        categoryV       = r.categoryV;
        if (r.fileNameV.length() == 0)
            fileNameV       = new StringBuffer();
        else
            fileNameV       = new StringBuffer(r.fileNameV.toString());
        lineNumberV     = r.lineNumberV;
        nearLineNumberV = r.nearLineNumberV;
        if (r.attrNameV.length() == 0)
            attrNameV       = new StringBuffer();
        else
            attrNameV       = new StringBuffer(r.attrNameV.toString());
        uniqueIDV       = r.uniqueIDV;
    }

    /**
     * Resets the result to contain no information.
     */
    public void reset(){
        StringBuffer    sb;

        messageV.delete(0,messageV.length());
        for(int i=0;i<moreCountV;i++){
            sb = (StringBuffer) moreMessagesV.get(i);
            sb.delete(0,sb.length());
        }
        moreCountV      = 0;
        severityV       = NONE;
        categoryV       = NONE;
        fileNameV.delete(0,fileNameV.length());
        lineNumberV     = -1;
        nearLineNumberV = -1;
        attrNameV.delete(0,attrNameV.length());
        uniqueIDV       = -1;
    }

    /**
     * Resets the result to the specified severity with the specified text.
     */
    public void reset(int sev, String txt){
        this.reset();
        severityV = sev;
        messageV.append(txt);
//        System.out.println(toString());
    }

//    /**
//     * Resets the result to the specified severity with the specified text.
//     */
//    public void reset(FormattedMessage msg){
//        this.reset();
//        severityV   = msg.theMsg.getMsgSeverity().intValue();
//        categoryV   = msg.theMsg.getMsgCategory().intValue();
//        uniqueIDV   = msg.theMsg.getMsgGlobalID().intValue();
//        messageV.append(msg.formattedMsg);
//  //        System.out.println(msg.formattedMsg);
//    }

    /**
     * Returns the severity.
     */
    public int severity(){
        return(severityV);
    }

    /**
     * Returns the category.
     */
    public int category(){
        return(categoryV);
    }

    /**
     * Sets the severity.
     */
    public void severity(int s){
        switch(s){
            case NONE:      severityV = s;      break;
            case INFO:      severityV = s;      break;
            case WARNING:   severityV = s;      break;
            case ERROR:     severityV = s;      break;
            case FATAL:     severityV = s;      break;
            default:        severityV = NONE;   break;
        }
    }

    /**
     * Sets the category.
     */
    public void category(int c){
        switch(c){
            case CAT_SOFTWARE:      categoryV = c;      break;
            case CAT_SECURITY:      categoryV = c;      break;
            case CAT_DATABASE:      categoryV = c;      break;
            case CAT_COMMS:         categoryV = c;      break;
            case CAT_OPERATIONAL:   categoryV = c;      break;
            default:            categoryV = NONE;   break;
        }
    }

    /**
     * Returns the message text.
     */
    public String message(){
        return(messageV.toString());
    }

    /**
     * Sets the message text.
     */
    public void message(String s){
        messageV.delete(0,messageV.length());
        messageV.append(s);
    }

    /**
     * Returns the additional message text as an ArrayList of StringBuffers. The
     * number of additional lines is available via the moreCount() method.
     */
	public ArrayList<StringBuffer> moreMessages(){
        return(moreMessagesV);
    }

    /**
     * Adds additional message text to the result.
     */
	public void moreMessages(String s){
        StringBuffer sb = null;

        if ((moreCountV + 1) > moreMessagesV.size()){
            sb = new StringBuffer();
            moreMessagesV.add(sb);
        }
        else
            sb = (StringBuffer)moreMessagesV.get(moreCountV);

        sb.append(s);
        moreCountV++;
    }

//    /**
//     * Adds additional message text to the result.
//     */
//    public void moreMessages(MessageWithCat s){
//        StringBuffer sb = null;
//
//        if ((moreCountV + 1) > moreMessagesV.size()){
//            sb = new StringBuffer();
//            moreMessagesV.add(sb);
//        }
//        else
//            sb = (StringBuffer)moreMessagesV.get(moreCountV);
//
//        sb.append(s.formattedMsg);
//        moreCountV++;
//    }

    /**
     * Returns the file name.
     */
    public String fileName(){
        return(fileNameV.toString());
    }

    /**
     * Sets the file name.
     */
    public void fileName(String s){
        fileNameV.delete(0,fileNameV.length());
        fileNameV.append(s);
    }

    /**
     * Returns the line number.
     */
    public int lineNumber(){
        return(lineNumberV);
    }

    /**
     * Sets the line number. You can only call lineNumber() or
     * nearLineNumber() for an RResult; you can't use both at the same time. You
     * either know the exact line number or you don't.
     */
    public void lineNumber(int i){
        if (i > 0)
            lineNumberV = i;
        else
            lineNumberV = -1;
        nearLineNumberV = -1;
    }

    /**
     * Returns the approximate line number.
     */
    public int nearLineNumber(){
        return(nearLineNumberV);
    }

    /**
     * Sets the approximate line number. You can only call lineNumber() or
     * nearLineNumber() for an RResult; you can't use both at the same time. You
     * either know the exact line number or you don't.
     */
    public void nearLineNumber(int i){
        if (i > 0)
            nearLineNumberV = i;
        else
            nearLineNumberV = -1;
        lineNumberV = -1;
    }

    /**
     * Returns the attribute name.
     */
    public String attrName(){
        return(attrNameV.toString());
    }

    /**
     * Sets the attribute name.
     */
    public void attrName(String s){
        attrNameV.delete(0,attrNameV.length());
        attrNameV.append(s);
    }

    /**
     * Returns the unique message identifier.
     */
    public int uniqueID(){
        return(uniqueIDV);
    }

    /**
     * Sets the unique message identifier.
     */
    public void uniqueID(int i){
        if (i > 0)
            uniqueIDV = i;
        else
            uniqueIDV = -1;
    }

    /**
     * Returns the result as a nicely formatted string.
     */
    public String toString(){
        StringBuffer    sb = new StringBuffer();

        switch(severityV){
            case NONE:      sb.append("Info:      ");      break;
            case INFO:      sb.append("Info:      ");      break;
            case WARNING:   sb.append("Warning:   ");      break;
            case ERROR:     sb.append("Error:     ");      break;
            case FATAL:     sb.append("Fatal:     ");      break;
            default:        sb.append("Info:      ");   break;
        }

        if (messageV.length() > 0)
            sb.append(messageV.toString());
        sb.append("\n");

        if (moreCountV > 0){
            for(int i=0; i<moreCountV; i++){
                sb.append("           " + moreMessagesV.get(i).toString() + "\n");
            }
        }

        if (categoryV != NONE){
            switch(categoryV){
                case CAT_SOFTWARE:      sb.append("Category: SOFTWARE\n");      break;
                case CAT_SECURITY:      sb.append("Category: SECURITY\n");      break;
                case CAT_DATABASE:      sb.append("Category: DATABASE\n");      break;
                case CAT_COMMS:         sb.append("Category: COMMS\n");      break;
                case CAT_OPERATIONAL:   sb.append("Category: OPERATIONAL\n");      break;
                default:            sb.append("Category: NONE\n");   break;
            }
        }

        if (fileNameV.length() > 0)
            sb.append("File:      " + fileNameV.toString() + "\n");

        if (lineNumberV > 0)
            sb.append("Line:      " + lineNumberV + "\n");

        if (nearLineNumberV > 0)
            sb.append("Near line: " + nearLineNumberV + "\n");

        if (attrNameV.length() > 0)
            sb.append("Attribute: " + attrNameV.toString() + "\n");

        if (uniqueIDV > 0)
            sb.append("Unique ID: " + uniqueIDV + "\n");

        sb.append("\n");

        return(sb.toString());
    }

}

