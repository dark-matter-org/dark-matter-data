package org.dmd.templates.server.util;

import java.io.IOException;

public class FormattedStringBuffer implements FormattedArtifactIF {
	
	StringBuffer sb = new StringBuffer();

	@Override
	public void addText(String text) throws IOException {
		sb.append(text);
	}
	
	public StringBuffer getBuffer(){
		return(sb);
	}

	public String toString(){
		return(sb.toString());
	}
	
	public void clear(){
		sb = new StringBuffer();
	}
}
