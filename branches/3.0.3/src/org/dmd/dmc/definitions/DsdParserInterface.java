package org.dmd.dmc.definitions;

/**
 * The DsdParserInterface defines a parsing component that recognizes a
 * particular set of Domain Specific Definitions. This interface facilitates
 * the registration of parsers with an overall definition parsing mechanism.
 */
public interface DsdParserInterface {

	/**
	 * @return the file extension of the files that are recognized by this parser.
	 */
	public String getFileExtension();
	
	
}
