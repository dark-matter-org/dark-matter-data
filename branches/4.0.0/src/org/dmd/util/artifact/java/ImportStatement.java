package org.dmd.util.artifact.java;

/**
 * A utility class to store a class name for an import and a reason for the import.
 */
public class ImportStatement {
	
	String className;
	
	String reason;

	public ImportStatement(String cn, String r){
		className 	= cn;
		reason		= r;
	}
	
}
