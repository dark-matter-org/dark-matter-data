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
	String fileName;
	
	// The version of the schema as indicated by the .dms file's parent folder
	// which looks like v3dot5, in which case the version would be 3.5
	String version;
	
	
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
		versionDirectory = directory.substring(0,lastSlash);
		
		lastSlash = versionDirectory.lastIndexOf(File.separatorChar);
		schemaParentDirectory = versionDirectory.substring(0,lastSlash);
		
		initializeVersion();
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
	void initializeVersion(){
		int lastSlash = directory.lastIndexOf(File.separatorChar);
		String vstring = directory.substring(lastSlash+1);
		vstring = vstring.substring(1);
		
		System.out.println("vstring = " + vstring);
		version = vstring.replaceAll("dot", ".");
		
		System.out.println("version = " + version);
	}
}
