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
package org.dmd.util.parsing;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.dmd.dmc.DmcValueException;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;

/**
 * This class parses files that conform to Object Instance Format (OIF).
 * <P>
 * Object Instance Format is a text-based format that allows for the capture
 * of just about any type of data. The kinds of objects that can be represented
 * depend on schemas that are defined as part of a Dark Matter Schema (DMS).
 * <P>
 * At this level of parsing, no real error checking is performed - that will be
 * taken care of by the object handler that understands the specifics of the
 * schema that should be followed by the objects in the file.
 * @see #parseFile
 */

public class DmcUncheckedOIFParser {

    /**
      * Handler to which newly parsed objects will be passed.
      */
    DmcUncheckedOIFHandlerIF    handler;

    /**
     * Indicates the number of errors that the caller is willing to encounter
     * before we halt parsing.
     */
    int     allowedErrorsV;
    
    /**
     * Place to hang on to exceptions (which may include errors/warnings generated by our handler.
     */
    ResultException	exG;

    /**
      * Creates a new Object Instance Format parser. As new BasicObjects are created,
      * they will be passed to the object handler for processing.
      */
    public DmcUncheckedOIFParser(DmcUncheckedOIFHandlerIF objHandler) {
        handler         = objHandler;
        allowedErrorsV  = 0;
        exG				= null;
    }

    /**
     * Allows you to set the number of errors that you're willing to ignore during
     * the parsing. The default is to quit parsing whenever an error is encountered.
     * If you don't care how many errors you find, set the allowedErrors to -1.
     * <P>
     * The parsing will always stop if we encounter a FATAL error (as reflected
     * in the ResultSet).
     */
    public void allowedErrors(int i){
        allowedErrorsV = i;
    }

    /**
     * Parses the specified file and sends the objects to the object handler specified in
     * the constructor.
     * @param fileName The file to be parsed.
     * @throws ResultException, DmcValueException 
     */
    public void parseFile(String fileName) throws ResultException, DmcValueException {
        boolean         inObject    = false;
        String          attrName    = null;
        DmcUncheckedObject  uco      = null;
        StringBuffer    attrVal     = new StringBuffer();
        String          val         = null;
        // Note: we replace the friggin' windows backslashes with forward slashes
        String          fn          = fileName.replace('\\', '/');
        int				lastLine	= 0;

        // Reset out global exception instance
        exG = null;

        try {
            // BufferedReader in = new BufferedReader(new FileReader(fileName));
            LineNumberReader in = new LineNumberReader(new FileReader(fileName));
// System.out.println("Reading " + fileName);
            String str;
            while ((str = in.readLine()) != null) {
//DebugInfo.debug("Near line: " + in.getLineNumber());
                if (str.startsWith("*") || str.startsWith("//")){
                    // It's a comment, skip it
                }
                else{
                    StringTokenizer t = new StringTokenizer(str);

                    if (t.countTokens() != 0){
                        if (inObject == false){
                            ArrayList<String> al = new ArrayList<String>();
                            // We're starting a new object - these tokens should be the classes
                            while(t.hasMoreTokens()){
                                al.add(t.nextToken().trim());
                            }

                            uco = new DmcUncheckedObject(al,in.getLineNumber());
                            inObject = true;
                            attrName = null;
                        }
                        else{
                            // We have tokens
                            if (str.startsWith(" ")){
                                // Line continuation
                                attrVal.append(str);
                            }
                            else{
                                // A new attribute line
                                if (attrName != null){
                                    // Add the current attribute to the object
                                	val = attrVal.toString().trim();
                                    uco.addValue(attrName,new String(val));
                                }

                                // Get the new attribute name
                                attrName = t.nextToken().trim();

                                // Wipe the value buffer
                                attrVal.delete(0,attrVal.length());

                                // Reset it with the contents of the current line
                                attrVal.append(str);

                                // Trim the attribute name and leading spaces
                                attrVal.delete(0,attrName.length());
                                if (attrVal.length() == 0){
                            		// We have a missing token value
                            		ResultException ex = new ResultException();
                            		ex.addError("No value for attribute: " + attrName);
                            		ex.setLocationInfo(fileName, in.getLineNumber());
                            		throw(ex);
                                }
                                while(attrVal.charAt(0) == ' '){
                                    attrVal.delete(0,1);
                                }
                            }
                        }
                    }
                    else{
                        if (uco != null){
                            // We have a blank line which means we've reached the end of an object - pass off
                            // the current object for processing
                            inObject = false;

                            // Tack on the last attribute
                            if (attrName != null){
                                val = attrVal.toString().trim();
                                uco.addValue(attrName,new String(val));
                            }

                            try{
                            	handler.handleObject(uco,fn, in.getLineNumber());
                            }
                            catch(ResultException ex){
                            	
                            	// If this is the first exception, just hang on to it - we may
                            	// wind up adding to it later. Otherwise, just append the results
                            	// to our existing exception.
                            	if (exG == null)
                            		exG = ex;
                            	else
                            		exG.result.addResults(ex.result);
                            	
                            	if (exG.result.worst() == Result.FATAL){
                            		uco = null;
                            		break;
                            	}
                            	
                                if (allowedErrorsV == -1){
                                    // Couldn't care less about errors! Just go merrily on our way.
                                }
                                else if ((allowedErrorsV == 0) && (exG.result.errors() > 0)){
                                    // Couldn't allow errors - let's bail
                                    uco = null;
                                    break;
                                }
                                else if (exG.result.errors() >= allowedErrorsV){
                                    // We've reached the limits of our patience
                                    uco = null;
                                    break;
                                }

                            }

                            // Reset our object and go on for the next one
                            uco = null;
                        }
                    }
                }

                lastLine = in.getLineNumber();
            }
            in.close();
        }
        catch (IOException e) {
        	if (exG == null)
        		exG = new ResultException();
        	
            exG.result.addResult(Result.FATAL,e.toString());
            exG.result.lastResult().moreMessages("Occurred while reading file: " + fileName);
            uco = null;
        }

        if (uco != null){
            // Finish off for the final attribute and object
            if (attrName != null){
                // Add the current attribute to the object
                // System.out.println("Adding *" + attrVal + "*");
                val = new String(attrVal);
                uco.addValue(attrName,val.trim());
            }

            try{
            	handler.handleObject(uco,fn,lastLine);
            }
            catch(ResultException ex){
            	if (exG == null)
            		exG = ex;
            	else
            		exG.result.addResults(ex.result);
            }
        }
        
        if (exG != null)
        	throw(exG);

    }

}
 

