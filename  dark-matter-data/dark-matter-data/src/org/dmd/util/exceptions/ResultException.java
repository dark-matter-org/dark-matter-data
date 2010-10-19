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

import java.util.Iterator;

/**
 * The ResultException encapsulates a ResultSet that can be populated with a
 * variety of errors/warning when it's thrown. Once created, add your information
 * to the public result member.
 */
@SuppressWarnings("serial")
public class ResultException extends Exception {

    /**
     * The result set.
     */
    public ResultSet result;

    /**
     * Constructs a new result set exception.
     */
    public ResultException() {
        result = new ResultSet();
    }

    /**
     * Constructs a new result set exception with a detailed message.
     * @param s String the message
     */
    public ResultException(String s) {
        result = new ResultSet();
        result.addResult(Result.ERROR, s);
    }

    /**
     * Constructs a new result set exception with info from the exception.
     * @param e The exception on which the ResultExcpetion is based.
     */
    public ResultException(Exception e) {
    	this((String)null);
        this.addErrorWithStack(e.getMessage(), DebugInfo.extractTheStack(e));
    }

    /**
     * Constructs a new result set exception with a result set.
     * @param rs ResultSet the result set
     */
    public ResultException(ResultSet rs) {
        this((rs.lastResult() != null) ? rs.lastResult().message() : "Empty result set", rs);
    }

    /**
     * Constructs a new result set exception with a detailed message and a
     * result set.
     * @param s String the message
     * @param rs ResultSet the result set
     */
    public ResultException(String s, ResultSet rs) {
        super(s);
        result = new ResultSet();
        if (rs != null) {
            result.addResults(rs);
        }
    }

    /**
     * Dumps the result set.
     */
    public String toString(){
        return(result.toString());
    }

    /**
     * This is a convenience function to populate an existing result set with
     * the contents of this exception. This is a stop gap mechanism until the day
     * we eliminate direct use of result sets.
     */
    @SuppressWarnings("unchecked")
	public void populate(ResultSet rs){
        if (result != null){
            Iterator it = result.iterator();
            while(it.hasNext()){
                Result r = (Result)it.next();
                rs.addResult(new Result(r));
            }
        }
    }

    /**
     * A convenience method to add a Result.ERROR.
     * @param msg String the error message
     */
    public void addError(String msg){
        result.addResult(Result.ERROR,msg);
    }

    /**
     * A convenience method to add a Result.ERROR with a stack trace in the
     * moreMessages part.
     * @param msg String the error message
     * @param stack String the stack trace
     */
    public void addErrorWithStack(String msg, String stack){
        result.addResult(Result.ERROR,msg);
        result.lastResult().moreMessages(stack);
    }

    /**
     * A convenience method to add a Result.ERROR with a stack trace in the
     * moreMessages part.
     * @param msg String the error message
     * @param exception The exception whose stack we'll display.
     */
    public void addErrorWithStack(String msg, Exception exception){
        result.addResult(Result.ERROR,msg);
        result.lastResult().moreMessages(DebugInfo.extractTheStack(exception));
    }

    /**
     * A convenience method to add a Result.FATAL with a stack trace in the
     * moreMessages part.
     * @param msg String the error message
     * @param exception The exception whose stack we'll display.
     */
    public void addFatalWithStack(String msg, Exception exception){
        result.addResult(Result.FATAL, msg);
        result.lastResult().moreMessages(DebugInfo.extractTheStack(exception));
    }
    
    /**
     * A convenience function to set the file and line number on the last result
     * that was added.
     * @param f The file name.
     * @param l The line number.
     */
    public void setLocationInfo(String f, int l){
    	result.lastResult().fileName(f);
    	result.lastResult().lineNumber(l);
    }
    
    /**
     * Adds more messages to the last result.
     * @param msg The message to be added.
     */
    public void moreMessages(String msg){
    	result.lastResult().moreMessages(msg);
    }
}
