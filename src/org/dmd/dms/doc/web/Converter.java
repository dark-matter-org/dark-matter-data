package org.dmd.dms.doc.web;

import java.util.Iterator;

/**
 * The Wiki utility class provides some useful translation functionality for alterring
 * descriptions to conform to the Google Code Wiki format. In particular, the following
 * transformations are performed:
 * <ul>
 * <li> pre format tags are translated to {{{ }}}
 * </li>
 * <li> code tags are replaced with back quotes ` `
 * </li>
 * </ul>
 * <p/>
 * When generating Wiki documentation, set the wiki flag to true, otherwise we leave
 * the tags intact for HTML 
 */
public class Converter {
	
	static boolean wiki = false;
	
	/**
	 * Depending on the setting of the WIKI flag flag, we replace preformat and code tags with
	 * the wiki conventions.
	 * @param in
	 * @return the string converted for use in either HTML or WIKI.
	 */
	static public String convert(String in){
		String rc = in;
		
		if (wiki){
			rc = rc.replaceAll("<pre>", "{{{");
			rc = rc.replaceAll("</pre>", "}}}");
			
			rc = rc.replaceAll("<code>", "`");
			rc = rc.replaceAll("</code>", "`");
		}
		
		return(rc);
	}
	
	static public void wiki(boolean f){
		wiki = f;
	}

	public static String convert(Iterator<String> descriptionWithNewlines) {
		StringBuffer sb = new StringBuffer();
		
		while(descriptionWithNewlines.hasNext()){
			String rc = descriptionWithNewlines.next();
			
			rc = rc.replaceAll("<pre>", "{{{");
			rc = rc.replaceAll("</pre>", "}}}");
			
			rc = rc.replaceAll("<code>", "`");
			rc = rc.replaceAll("</code>", "`");
			
			sb.append(rc + "\n");
		}
		
		return(sb.toString());
	}
	
	

}
