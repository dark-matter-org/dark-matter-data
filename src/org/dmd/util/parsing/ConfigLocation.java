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
	
	// The full name of the directory where the config versions live
	String versionDirectory;
	
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
	
	// The version of the config as indicated by the .xxx file's parent folder
	// which looks like v3dot5, in which case the version would be 3.5
	// If there is no containing version folder, this will be ConfigLocation.UNKNOWN .
	String version;
	String versionDotName;
	
	// FOR JAR LOCATIONS
	
	// If the config was found in a JAR, this is the name of the JAR, for example:
	// file:F:\AASoftDev\workspace\dark-matter-data\extjars\exampleDMSchema.jar
	String jarFileName;
	
	// The directory in the JAR file where the .xxx file exists, for example:
	// /com/example/schema. NOTE: the file separators are ALWAYS forward slash "/"
	String jarDirectory;
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("ConfigLocation\n");
		sb.append("           configName: " + configName + "\n");
		sb.append("            directory: " + directory + "\n");
		sb.append("     versionDirectory: " + versionDirectory + "\n");
		sb.append("configParentDirectory: " + configParentDirectory + "\n");
		sb.append("             fileName: " + fileName + "\n");
		sb.append("               suffix: " + suffix + "\n");
		sb.append("              version: " + version + "\n");
		sb.append("       versionDotName: " + versionDotName + "\n");
		sb.append("          jarFileName: " + jarFileName + "\n");
		sb.append("         jarDirectory: " + jarDirectory + "\n\n");
		return(sb.toString());
	}
	
	/**
	 * Constructs a new DmsSchemaLocation.
	 * @param n   The name of the schema file with the .dms extension 
	 * @param dir The directory where this file was found.
	 * @param s  The config file suffix.
	 */
	public ConfigLocation(String n, String dir, String s){
		int lastSlash = -1;
		
		configName 	= n.substring(0,n.length()-4);
		directory	= dir;
		fileName 	= directory + File.separatorChar + n;
		suffix 		= s;
		
		lastSlash = directory.lastIndexOf(File.separatorChar);
		versionDirectory = directory;
		
		if (versionDirectory.indexOf("dot") == -1){
			// We don't have a version directory
			configParentDirectory = directory.substring(0,lastSlash);
			versionDirectory = null;
			version = ConfigVersion.UNKNOWN;
		}
		else{
			// We have to go up 2 levels from where the schema.dms file was found
			lastSlash = versionDirectory.lastIndexOf(File.separatorChar);
			String tmp = versionDirectory.substring(0,lastSlash);
			
			lastSlash = tmp.lastIndexOf(File.separatorChar);
			configParentDirectory = tmp.substring(0,lastSlash);
			
			initializeVersion(File.separator);
		}
		
		// Not used in this case
		jarFileName 	= null;
		jarDirectory	= null;
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
	 * @param n The name of the schema with the .dms suffix in place.
	 * @param dir The sub directory in the JAR where the schema is found.
	 * @param s  The config file suffix.
	 */
	public ConfigLocation(String j, String n, String dir, String s){
		int lastSlash = -1;

		configName 	= n.substring(0,n.length()-4);
		directory 	= dir;
		suffix 		= s;
		
		lastSlash = directory.lastIndexOf("/");
		versionDirectory = directory.substring(0,lastSlash);
		
		if (versionDirectory.indexOf("dot") == -1){
			// We don't have a version directory
			configParentDirectory = directory.substring(0,lastSlash);
			versionDirectory = null;
			version = ConfigVersion.UNKNOWN;
		}
		else{
			// We have to go up 2 levels from where the schema.dms file was found
			lastSlash = versionDirectory.lastIndexOf("/");
			String tmp = versionDirectory.substring(0,lastSlash);

			lastSlash = tmp.lastIndexOf("/");
			configParentDirectory = tmp.substring(0,lastSlash);
			initializeVersion("/");
		}

		jarFileName 	= j;
		jarDirectory	= dir;
		
//		fileName = "jar:file:/" + jarFileName + "!/" + jarDirectory + "/" + configName + ".dms";
		
		
		
//		String 	tmp = "/" + jarDirectory + "/" + configName + ".dms";
		String 	tmp = "/" + jarDirectory + "/" + configName + suffix;
		fileName = tmp.replace('\\', '/');
		
		
		
		
//		String 	tmp = "/" + jarDirectory + "/" + configName + ".dms";
//		DebugInfo.debug("tmp = " + tmp);
//		String 	fn	= tmp.replace('\\', '/');
//		try {
//			InputStreamReader isr = new InputStreamReader(getClass().getResourceAsStream(fn));
//			LineNumberReader lnr = new LineNumberReader(isr);
//            String str;
//            while ((str = lnr.readLine()) != null) {
//            	System.out.println(str);
//            }
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
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
	 * @return The version of the config in numeric form i.e. if your config was in a folder called
	 * v3dot5 the version will be "3.5". If the config file wasn't in a version directory, this will 
	 * be null.
	 */
	public String getVersion(){
		return(version);
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
	 * Parses out the version info and sets version and versionDotName
	 */
	void initializeVersion(String fs){
		int lastSlash = directory.lastIndexOf(fs);
		String vstring = directory.substring(lastSlash+1);
		vstring = vstring.substring(1);
		
//		DebugInfo.debug("vstring = " + vstring);
		version = vstring.replaceAll("dot", ".");
		versionDotName = vstring;
		
//		DebugInfo.debug("version = " + version);
	}
}
