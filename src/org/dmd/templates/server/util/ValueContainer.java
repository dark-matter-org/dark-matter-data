package org.dmd.templates.server.util;

import java.util.HashMap;

/**
 * The ValueContainer implements the SectionIF interface so that we
 * can inject arbitrary values into a Template. This is used to implement
 * the Template debugging mechanism which provides a comment about the
 * Template used to format sections of a TextualArtifact.
 */
public class ValueContainer implements ValueContainerIF {
	
	HashMap<String,String>	values = new HashMap<String, String>();

	public void setValue(String name, String value){
		values.put(name, value);
	}
	
	@Override
	public String getValue(String name) {
		return(values.get(name));
	}

}
