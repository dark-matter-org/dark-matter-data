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

import java.io.*;
import java.util.StringTokenizer;
import java.lang.reflect.Field;

/**
 * This class allows you to generate a stack trace for inclusion in error messages.
 */
public class DebugInfo {

    /**
     * Gets a stack trace to the current point in the code.
     */
    public static String getCurrentStack(){
        StringWriter    stringWriter    = new StringWriter();
        PrintWriter     printWriter     = new PrintWriter(stringWriter);
        new Throwable().printStackTrace(printWriter);
        StringBuffer    sb = new StringBuffer(stringWriter.toString());
        String          trace = new String(stringWriter.toString());

        sb.delete(0,trace.indexOf(")")+1);

        return(new String(sb.toString()));
    }

    /**
     * Returns where the current function was called from.
     * 
     * At this level, the stack trace looks like:
     * 	at com.dmc.util.DebugInfo.getWhereWeWereCalledFrom(DebugInfo.java:35)
     * 	at com.dmc.dmd.meta.CreateMeta.dumpMetaSchema(CreateMeta.java:510)
     * 	at com.dmc.dmd.meta.CreateMeta.run(CreateMeta.java:189)
     * 	at com.dmc.dmd.meta.CreateMetaMain.main(MetaGeneratorMain.java:8)
	 * 
	 * We want the contents of the third line in the stack.
     * @return Where we're calling this function from.
     */
    public static String getWhereWeWereCalledFrom(){
        String currStack = DebugInfo.getCurrentStack();
        int    firstBracket = currStack.indexOf(')');
        int    secondBracket = currStack.indexOf(')',firstBracket+1);
        int    thirdBracket = currStack.indexOf(')',secondBracket+1);

        return("Called from: " + currStack.substring(secondBracket+6,thirdBracket+1));
    }

    /**
     * Returns where the current function was called from.
     * 
     * At this level, the stack trace looks like:
     * 	at com.dmc.util.DebugInfo.getWhereWeWereCalledFrom(DebugInfo.java:35)
     * 	at com.dmc.dmd.meta.CreateMeta.dumpMetaSchema(CreateMeta.java:510)
     * 	at com.dmc.dmd.meta.CreateMeta.run(CreateMeta.java:189)
     * 	at com.dmc.dmd.meta.CreateMetaMain.main(MetaGeneratorMain.java:8)
	 * 
	 * We want the contents of the third line in the stack.
     * @return Where we're calling this function from.
     */
    public static String getShortWhereWeWereCalledFrom(){
        String 	currStack 		= DebugInfo.getCurrentStack();
        int    	firstBracket 	= currStack.indexOf(')');
        int    	secondBracket 	= currStack.indexOf(')',firstBracket+1);
        int		thirdOpen 		= currStack.indexOf('(',secondBracket+1);
        int    	thirdBracket 	= currStack.indexOf(')',secondBracket+1);

        return(currStack.substring(thirdOpen,thirdBracket+1));
    }

    /**
     * Returns where we are calling this function from. This is useful if
     * you want to document generated code and see where the code was created
     * from.
     * 
     * At this level, the stack trace looks like:
     * 	at com.dmc.util.DebugInfo.getWhereWeWereCalledFrom(DebugInfo.java:35)
     * 	at com.dmc.dmd.meta.CreateMeta.dumpMetaSchema(CreateMeta.java:510)
     * 	at com.dmc.dmd.meta.CreateMeta.run(CreateMeta.java:189)
     * 	at com.dmc.dmd.meta.CreateMetaMain.main(MetaGeneratorMain.java:8)
	 * 
	 * We want the contents of the second line in the stack.
     * @return Where we're calling this function from.
     */
    public static String getWhereWeAreNow(){
        String currStack = DebugInfo.getCurrentStack();
        int    firstBracket = currStack.indexOf(')');
        int    secondBracket = currStack.indexOf(')',firstBracket+1);

        return(currStack.substring(firstBracket+6,secondBracket+1).trim());
    }

    /**
     * Gets the name of the current method.
     */
    public static String getCurrentMethod(){
        StringWriter    stringWriter    = new StringWriter();
        PrintWriter     printWriter     = new PrintWriter(stringWriter);
        new Throwable().printStackTrace(printWriter);
        String fullInfo = new String(stringWriter.toString());
        String token = null;

        String methodName = null;

        StringTokenizer tokenizer = new StringTokenizer( fullInfo, " " );

        if( tokenizer.countTokens() < 2)
        {
            return "NA";
        }

        for( int i=0; i < 3; i++ )
        {
         token = tokenizer.nextToken();
        }

        int iend = token.lastIndexOf('(');
        int imethod = token.lastIndexOf('.', iend);
        if (imethod == -1) {
            methodName = "NA";
        }
        else
        {
            int iclass = token.lastIndexOf ( '.' , (imethod -1) );
            if ( iclass == -1 )
                methodName = "NA";
            else
                methodName = token.substring(iclass + 1, iend);
        }

        return methodName;

    }

    /**
     * Gets the name of the current method.
     */
    public static String getCompleteCurrentMethod(){
        StringWriter    stringWriter    = new StringWriter();
        PrintWriter     printWriter     = new PrintWriter(stringWriter);
        new Throwable().printStackTrace(printWriter);
        String fullInfo = new String(stringWriter.toString());
        String token = null;

        String methodName = null;

        StringTokenizer tokenizer = new StringTokenizer( fullInfo, " " );

        if( tokenizer.countTokens() < 2)
        {
            return "NA";
        }

        for( int i=0; i < 3; i++ )
        {
         token = tokenizer.nextToken();
        }

        int iend = token.lastIndexOf('(');
        if( iend == -1 )
        {
          return "NA";
        }

        methodName = token.substring(0, iend);

        return methodName;

    }

    /**
     * Gets the current line number.
     */
    public static void getCurrentLine ()  {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        new Throwable().printStackTrace(printWriter);
        String fullInfo = new String(stringWriter.toString());
        String lineNumber = null;
        if(fullInfo == null) {
          lineNumber = "NA";
        }

        if(lineNumber == null) {
            int iend = fullInfo.lastIndexOf(')');
            int ibegin = fullInfo.lastIndexOf(':', iend -1);
            if(ibegin == -1) {
                lineNumber = "-1";
            }
            else {
                lineNumber = fullInfo.substring(ibegin + 1, iend);
            }
        }
      System.out.println(lineNumber);
    }

    /**
     * @return The line number in the file from which this method is called.
     */
    public static String getCurrentLineNumber() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        new Throwable().printStackTrace(printWriter);
        String fullInfo = new String(stringWriter.toString());
        String lineNumber = null;
        if(fullInfo == null) {
          lineNumber = "NA";
        }

System.out.println("fullInfo = " + fullInfo + "\n");

        if(lineNumber == null) {
            int iend = fullInfo.lastIndexOf(')');
            int ibegin = fullInfo.lastIndexOf(':', iend -1);
            if(ibegin == -1) {
                lineNumber = "-1";
            }
            else {
                lineNumber = fullInfo.substring(ibegin + 1, iend);
            }
        }
        return lineNumber;
    }

    @SuppressWarnings("unchecked")
	public static String getEnumerationString( Class obj, int value )
    {
            String taskName = Integer.toString(value);
            try {
              Field [] fields = obj.getDeclaredFields();
              for( int i=0; i < fields.length; i++ )
              {
                Field field = fields[i];
                try {
                  if( field.getInt(null) == value )
                  {
                    taskName = field.getName();
                    break;
                  }
                } catch( Exception e ) {

                }
              }
            } catch( Exception e ) {

            }
            return taskName;

    }

    public static void debugWithTrace(String s) {
        System.out.print(s);

        StringWriter    stringWriter    = new StringWriter();
        PrintWriter     printWriter     = new PrintWriter(stringWriter);
        new Throwable().printStackTrace(printWriter);
        StringBuffer    sb = new StringBuffer(stringWriter.toString());
        String          trace = new String(stringWriter.toString());
        sb.delete(0,trace.indexOf(")")+1);

        System.out.println(sb.toString());
    }

    /**
     * A cheap way to dump a temporary debug statement to System.out that indicates
     * where it's being dumped from.
     */
    public static void debug(String s){
        StringWriter    stringWriter    = new StringWriter();
        PrintWriter     printWriter     = new PrintWriter(stringWriter);
        new Throwable().printStackTrace(printWriter);
        String fullInfo = new String(stringWriter.toString());
        String token = null;

        String methodName = null;

        StringTokenizer tokenizer = new StringTokenizer( fullInfo, " " );

        if( tokenizer.countTokens() < 2)
        {
            System.out.println("NA - " + s);
            return;
        }

        for( int i=0; i < 3; i++ )
        {
            token = tokenizer.nextToken();
        }

        int iend = token.lastIndexOf('(');
        if( iend == -1 )
        {
            System.out.println("NA - " + s);
            return;
        }

        methodName = token.substring(0, iend);

        System.out.println(methodName + " - " + s);
    }

    /**
     * A convenience function to extract the stack from an exception as a string.
     */
    public static String extractTheStack(Exception ex){
        StringWriter sw = new StringWriter();
        PrintWriter  pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        return(sw.toString());
    }
}
