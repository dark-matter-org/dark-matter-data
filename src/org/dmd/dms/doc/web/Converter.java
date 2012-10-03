package org.dmd.dms.doc.web;

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
	 * 
	 * @param mode if true, the conversion is performed, otherwise the string is left as is.
	 * @param in
	 * @return
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
	
	

}
