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
package org.dmd.util.formatting;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.util.exceptions.DebugInfo;

/**
 * The CodeFormatter class contains a variety of static utility methods that
 * are useful when dumping code.
 */
public class CodeFormatter {

    /**
     * This function dumps the description of a class as a code comment. Long lines are
     * folded to 75 characters.
     * @param  comment The comment to be written
     * @param  out     The output buffer.
     * @param  indent  The indent string.
     * @throws IOException 
     */
   static public void dumpCodeComment(String comment, BufferedWriter out, String indent) throws IOException{
       StringBuffer sb = new StringBuffer();
       int             offset;

       sb.append(comment);

       while(sb.length() > 75){
           offset = 74;
           // Move back until we find a space
           while(sb.charAt(offset) != ' '){
               offset--;
               
               if (offset == -1){
            	   DebugInfo.debug("comment = " + comment);
               }
           }

           out.write(indent);
           for(int i=0;i<offset;i++){
               out.write(sb.charAt(i));
           }
           out.write("\n");
           // The subString(int,int) method seems to be missing
           // out.write(" * " + sb.subString(start,offset) + "\n");
           sb.delete(0,offset+1);
       }
       out.write(indent + sb + "\n");
   }

   /**
    * This function dumps the description of a class as a code comment. Long lines are
    * folded to 75 characters.
    * @param  comment The comment to be written
    * @param  out     The output buffer.
    * @param  indent  The indent string.
    * @throws IOException 
    */
   	static public void dumpCodeComment(String comment, StringBuffer out, String indent) {
   		StringBuffer sb = new StringBuffer();
   		int             offset;

   		sb.append(comment);

   		while(sb.length() > 75){
   			offset = 74;
   			// Move back until we find a space
   			while(sb.charAt(offset) != ' '){
   				offset--;
   			}
		
   			out.append(indent);
   			for(int i=0;i<offset;i++){
   				out.append(sb.charAt(i));
   			}
   			out.append("\n");
   			// The subString(int,int) method seems to be missing
   			// out.write(" * " + sb.subString(start,offset) + "\n");
   			sb.delete(0,offset+1);
   		}
   		out.append(indent + sb + "\n");
   	}

   	/**
   	 * Takes a fully qualified class name and returns just the class name portion.
   	 * @param fullyQualified
   	 * @return Just the class name.
   	 */
	static public String getTheClass(String fullyQualified){
		int lastDot = fullyQualified.lastIndexOf(".");
		return(fullyQualified.substring(lastDot+1));
	}
}
