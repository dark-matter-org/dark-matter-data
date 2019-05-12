package org.dmd.templates.tools.xml;

public class XmlComment extends XmlPart {
	
	String comment;
	
	public XmlComment(String c){
		comment = c;
	}

	@Override
	public Object toString(String indent) {
		return("<!-- " + indent + comment + "-->\n");
	}

}
