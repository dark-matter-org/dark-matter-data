//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dms.util;

import java.io.File;

/**
 * The DmsSchemaLocation simply indicates the name of a Dark Matter Schema (a file
 * with a .dms suffix) and its location on the file system.
 */
public class DmsSchemaLocation {

	// The name of the schema without the .dms extension
	String schemaName;
	
	// The full name of the directory where the .dms file exists
	String directory;
	
	// The full name of the directory where the schema versions live
	String versionDirectory;
	
	// The full name of the directory where the schema folder resides
	String schemaParentDirectory;
	
	// The full name of the .dms file
	// OR
	// When the file is found in a JAR file, it's the URL of the file, for example
	// "jar:file:" + jarFileName + "!/" + jarDirectory + "/" + schemaName + ".dms"
	// URL url = new URL(fileName);
	String fileName;
	
	// The version of the schema as indicated by the .dms file's parent folder
	// which looks like v3dot5, in which case the version would be 3.5
	// If there is no containing version folder, this will be "none".
	String version;
	String versionDotName;
	
	// FOR JAR LOCATIONS
	
	// If the schema was found in a JAR, this is the name of the JAR, for example:
	// file:F:\AASoftDev\workspace\dark-matter-data\extjars\exampleDMSchema.jar
	String jarFileName;
	
	// The directory in the JAR file where the .dms file exists, for example:
	// /com/example/schema
	String jarDirectory;
	
	/**
	 * Constructs a new DmsSchemaLocation.
	 * @param n   The name of the schema file with the .dms extension 
	 * @param dir The directory where this file was found.
	 */
	public DmsSchemaLocation(String n, String dir){
		int lastSlash = -1;
		
		schemaName 	= n.substring(0,n.length()-4);
		directory	= dir;
		fileName 	= directory + File.separatorChar + n;
		
		lastSlash = directory.lastIndexOf(File.separatorChar);
		versionDirectory = directory;
		
		if (versionDirectory.indexOf("dot") == -1){
			// We don't have a version directory
			schemaParentDirectory = directory.substring(0,lastSlash);
			versionDirectory = null;
			version = "none";
		}
		else{
			// We have to go up 2 levels from where the schema.dms file was found
			lastSlash = versionDirectory.lastIndexOf(File.separatorChar);
			String tmp = versionDirectory.substring(0,lastSlash);
			
			lastSlash = tmp.lastIndexOf(File.separatorChar);
			schemaParentDirectory = tmp.substring(0,lastSlash);
			
			initializeVersion(File.separator);
		}
		
		// Not used in this case
		jarFileName 	= null;
		jarDirectory	= null;
	}
	
	/**
	 * Constructs a new schema location that's located in a JAR file.
	 * @param j The JAR file name (that ends with DMSChema.jar). Example: 
	 * @param n The name of the schema with the .dms suffix in place.
	 * @param dir The sub directory in the JAR where the schema is found.
	 */
	public DmsSchemaLocation(String j, String n, String dir){
		int lastSlash = -1;

		schemaName 	= n.substring(0,n.length()-4);
		directory 	= dir;
		
		lastSlash = directory.lastIndexOf("/");
		versionDirectory = directory.substring(0,lastSlash);
		
		if (versionDirectory.indexOf("dot") == -1){
			// We don't have a version directory
			schemaParentDirectory = directory.substring(0,lastSlash);
			versionDirectory = null;
			version = "none";
		}
		else{
			// We have to go up 2 levels from where the schema.dms file was found
			lastSlash = versionDirectory.lastIndexOf("/");
			String tmp = versionDirectory.substring(0,lastSlash);

			lastSlash = tmp.lastIndexOf("/");
			schemaParentDirectory = tmp.substring(0,lastSlash);
			initializeVersion("/");
		}

		jarFileName 	= j;
		jarDirectory	= dir;
		
		fileName = "jar:file:" + jarFileName + "!/" + jarDirectory + "/" + schemaName + ".dms";
	}
	
	/**
	 * @return The name of the schema (i.e. the name of the .dms file without the .dms extension).
	 */
	public String getSchemaName(){
		return(schemaName);
	}
	
	/**
	 * @return The name of the directory where the .dms file resides.
	 */
	public String getDirectory(){
		return(directory);
	}
	
	/**
	 * @return The complete file name of this schema.
	 */
	public String getFileName(){
		return(fileName);
	}
	
	/**
	 * If the schema was in a JAR, this is the name of the JAR.
	 * @return The JAR file name.
	 */
	public String getJarFilename(){
		return(jarFileName);
	}
	
	/**
	 * If the schema was in a JAR, this is the name of the directory within the
	 * JAR where it was found.
	 * @return The directory path segment - the file separators in this are forward slashes.
	 */
	public String getJarDirectory(){
		return(jarDirectory);
	}
	
	/**
	 * @return The parent directory where the schema subfolder lives.
	 */
	public String getSchemaParentDirectory(){
		return(schemaParentDirectory);
	}
	
	/**
	 * @return The version of the schema in numeric form i.e. if your schema was in a folder called
	 * v3dot5 the version will be "3.5".
	 */
	public String getVersion(){
		return(version);
	}
	
	/**
	 * Parses out the version info and sets version and versionDotName
	 */
	void initializeVersion(String fs){
		int lastSlash = directory.lastIndexOf(fs);
		String vstring = directory.substring(lastSlash+1);
		vstring = vstring.substring(1);
		
		System.out.println("vstring = " + vstring);
		version = vstring.replaceAll("dot", ".");
		versionDotName = vstring;
		
		System.out.println("version = " + version);
	}
}
