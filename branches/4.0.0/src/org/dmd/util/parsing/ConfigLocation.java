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
package org.dmd.util.parsing;

import java.io.File;


/**
 * The ConfigLocation simply indicates the name of a config file (a file
 * with a .dms suffix) and its location on the file system.
 */
public class ConfigLocation {
	
	// The name of the config without its ".xxx" suffix
	String configName;
	
	// The full name of the directory where the config file exists
	String directory;
	
	// The full name of the directory where the config folder resides
	String configParentDirectory;
	
	// The full name of the config file
	// OR
	// When the file is found in a JAR file, it's the URL of the file, for example
	// "jar:file:" + jarFileName + "!/" + jarDirectory + "/" + configName + ".xxx"
	// URL url = new URL(fileName);
	String fileName;
	
	// The suffix of the config file
	String suffix;
		
	// FOR JAR LOCATIONS
	
	// If the config was found in a JAR, this is the name of the JAR, for example:
	// file:F:\AASoftDev\workspace\dark-matter-data\extjars\exampleDMSchema.jar
	String jarFileName;
	
	// The directory in the JAR file where the .xxx file exists, for example:
	// /com/example/schema. NOTE: the file separators are ALWAYS forward slash "/"
	String jarDirectory;
	
	// Just the jar file name. If jarFileName is: file:F:\AASoftDev\workspace\dark-matter-data\extjars\exampleDMSchema.jar
	// This will be just: exampleDMSchema.jar
	String justJarName;
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("ConfigLocation\n");
		sb.append("           configName: " + configName + "\n");
		sb.append("            directory: " + directory + "\n");
		sb.append("configParentDirectory: " + configParentDirectory + "\n");
		sb.append("             fileName: " + fileName + "\n");
		sb.append("               suffix: " + suffix + "\n");
		sb.append("          jarFileName: " + jarFileName + "\n");
		sb.append("         jarDirectory: " + jarDirectory + "\n\n");
		sb.append("          justJarName: " + justJarName + "\n\n");
		return(sb.toString());
	}
	
	/**
	 * Constructs a new config location.
	 * @param n   The name of the config file with the suffix e.g. config.suffix
	 * @param dir The directory where this file was found.
	 * @param s  The config file suffix.
	 */
	public ConfigLocation(String n, String dir, String s){
		int dotpos = n.indexOf(".");
		
		configName 	= n.substring(0,dotpos);
		directory	= dir;
		fileName 	= directory + File.separatorChar + n;
		suffix 		= s;
		
		// Not used in this case
		jarFileName 	= null;
		jarDirectory	= null;
		justJarName		= null;
	}
	
	/**
	 * @return true if the config was found in a jar and false otherwise.
	 */
	public boolean isFromJAR(){
		if (jarFileName == null)
			return(false);
		return(true);
	}
	
	/**
	 * Constructs a new schema location that's located in a JAR file.
	 * @param j The JAR file name (that ends with DMSChema.jar). Example: 
	 * @param n The name of the config file with the .whatever suffix in place.
	 * @param dir The sub directory in the JAR where the schema is found.
	 * @param s  The config file suffix.
	 */
	public ConfigLocation(String j, String n, String dir, String s){
		int lastSlash = -1;
		int lastDot = n.lastIndexOf(".");
		
		if (lastDot == -1){
			throw(new IllegalStateException("A config name must end with a . followed by an extension, this doesn't: " + n + "\nIn the following directory: " + dir));
		}
		
		configName 	= n.substring(0,lastDot);
		directory 	= dir;
		suffix 		= s;
		
		lastSlash = directory.lastIndexOf("/");

		jarFileName 	= j;
		jarDirectory	= dir;
		
		String 	tmp = "/" + jarDirectory + "/" + configName + suffix;
		fileName = tmp.replace('\\', '/');
		
		lastSlash = fileName.lastIndexOf("/");
		justJarName = fileName.substring(lastSlash+1);
		
	}
	
	/**
	 * @return The name of the schema (i.e. the name of the .dms file without the .dms extension).
	 */
	public String getConfigName(){
		return(configName);
	}
	
	/**
	 * @return The name of the directory where the config file resides.
	 */
	public String getDirectory(){
		return(directory);
	}
	
	/**
	 * The complete file name of this config file OR When the file is found in a JAR file,
	 * it's the URL of the file, for example <BR>
	 * "jar:file:" + jarFileName + "!/" + jarDirectory + "/" + configName + ".xxx" <BR>
	 * URL url = new URL(fileName);
	 * @return The file name.
	 */
	public String getFileName(){
		return(fileName);
	}
	
	/**
	 * @return The parent directory where the config subfolder lives.
	 */
	public String getConfigParentDirectory(){
		return(configParentDirectory);
	}
	
	/**
	 * If the schema was in a JAR, this is the fully qualified name of the JAR.
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
	 * If the schema was in a JAR, this is just the name of the JAR.
	 * @return The JAR file name.
	 */
	public String getJustJarFilename(){
		return(justJarName);
	}
	
}
