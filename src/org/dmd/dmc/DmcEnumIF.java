package org.dmd.dmc;

/**
 * The DmcEnumIF is implemented by all generated enumerations so that you can always
 * retrieve the description/display value string associated with the enum value.
 */
public interface DmcEnumIF {

	/**
	 * @return The description/display value for an enum value.
	 */
	public String displayValue();
	
}
