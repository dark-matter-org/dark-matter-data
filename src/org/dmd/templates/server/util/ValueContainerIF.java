package org.dmd.templates.server.util;

public interface ValueContainerIF {

	/**
	 * @param name the name of the value.
	 * @return The value or the empty string if it's not available.
	 */
	public String getValue(String name);

}
