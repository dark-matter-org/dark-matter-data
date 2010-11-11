package org.dmd.util.formatting;

import java.io.BufferedWriter;
import java.io.IOException;

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
