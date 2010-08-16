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
	String name;
	
	// The full name of the directory where the .dms file exists
	String directory;
	
	// The full name of the directory where the schema folder resides
	String parentDirectory;
	
	String fileName;
	
	public DmsSchemaLocation(String n, String dir){
		name = n;
		directory = dir;
		fileName = directory + File.separator + name + ".dms";
		
		int lastSlash = directory.lastIndexOf(File.separatorChar);
		parentDirectory = directory.substring(0,lastSlash);
	}
	
	public String getName(){
		return(name);
	}
	
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
	public String getParentDirectory(){
		return(parentDirectory);
	}
}
