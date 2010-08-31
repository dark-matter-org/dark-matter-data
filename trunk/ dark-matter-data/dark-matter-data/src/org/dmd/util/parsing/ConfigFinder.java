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
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.dmd.util.exceptions.ResultException;

/**
 * The ConfigFinder utility recursively hunts through the source directories of the
 * current set of Eclipse projects your have on your build path, as well as any JAR 
 * files that end with a specific suffix (e.g. *DMSchema.jar) and finds configuration
 * files that end with a specific suffix e.g. .dms .dmg etc.
 * <P>
 * Add the suffixes you're looking for by calling addSuffix(). You must provide at
 * least one suffix, or the findConfigs() method will fail.
 * <P>
 * The ConfigFinder also understands the convention of versioning your configuration
 * files by storing them in subfolders named v<#>dot<#>. For instance, for a versioned
 * schema you might have schema/v0dot1, schema/v1dot23, schema/v11dot3dot1 which would
 * represent schemas at version 0.1, 1.23 and 11.3.1 respectively.
 * <P>
 * NOTE: as indicated, the finder assumes that you're working in an Eclipse environment
 * where you have a directory structure like: project/bin project/src. The finder will
 * see the project/bin on the java.class.path and then try to find the src directory in
 * the same location.
 * <P>
 * If your development environment doesn't conform to this arrangement, you can derive
 * your own class, or, manually specify the source directories to search by priming the
 * ConfigFinder with calls to addSourceDirectory().
 */
public class ConfigFinder {

	// The source paths that we're going to search
	ArrayList<String>	sourceDirs;
	
	// The suffixes that we're going to check for
	ArrayList<String>	suffixes;
	
	ArrayList<String>	jarEndings;
	
	// The individual configs that we've found
	ArrayList<ConfigLocation>	configs;
	
	// The configs grouped into versions
	TreeMap<String,ConfigVersion>	versions;
	
	String fsep;
	
	String prefName;
	
	// The length of the longest schema name we found
	int	longest;
	
	public ConfigFinder(){
		sourceDirs 	= new ArrayList<String>();
		suffixes 	= new ArrayList<String>();
		jarEndings	= new ArrayList<String>();
		configs		= new ArrayList<ConfigLocation>();
		versions	= new TreeMap<String, ConfigVersion>();
		fsep = File.separator;
		
		loadPreferences();
	}
	
	/**
	 * @return The name of the file where additional source paths are indicated.
	 */
	public String getPrefName(){
		return(prefName);
	}
	
	/**
	 * Adds a suffix to hunt for. Generally of the form ".xxx".
	 * @param s the suffix to hunt for.
	 */
	public void addSuffix(String s){
		suffixes.add(s);
	}
	
	/**
	 * Adds a suffix to hunt for. Generally of the form ".xxx".
	 * @param e the JAR ending to hunt for.
	 */
	public void addJarEnding(String e){
		jarEndings.add(e);
	}
	
	/**
	 * Adds a source directory root to the set of paths that the finder will
	 * traverse in search of schemas.
	 * @param dir The source directory.
	 */
	public void addSourceDirectory(String dir){
		sourceDirs.add(dir);
	}
	
	/**
	 * Scans the class path (and an additional source directories) for files
	 * ending with the suffixes you've specified.
	 * @throws ResultException 
	 * @throws IOException  
	 */
	public void findConfigs() throws ResultException, IOException {
		if (suffixes.size() == 0){
			ResultException ex = new ResultException("You must specify at least one suffix to hunt for using the addSuffix() method");
			throw(ex);
		}
		
		for(String d : sourceDirs)
			findConfigsRecursive(new File(d));
		
		findConfigsOnClassPath();
	}
	
	/**
	 * Returns the versions of the specified config. If the config is specified in
	 * a file named stuff.xxx, the config name will be "stuff" (without the 
	 * .xxx file extension).
	 * @param cn The config name.
	 * @return
	 */
	public ConfigVersion getConfig(String cn){
		return(versions.get(cn));
	}
	
	public TreeMap<String,ConfigVersion> getVersions(){
		return(versions);
	}
	
	/**
	 * @return An iterator over all the configs we found.
	 */
	public Iterator<ConfigLocation> getLocations(){
		return(configs.iterator());
	}
	
	/**
	 * @return the length of the longest config name.
	 */
	public int getLongestName(){
		return(longest);
	}
	
	/**
	 * This method will check to see if the user has created a sourcedirs.txt
	 * in user_home/Application Data/DarkMatter
	 */
	void loadPreferences(){
		String userHome = System.getProperty("user.home");
		prefName = userHome + fsep + "Application Data" + fsep + "DarkMatter" + fsep + "sourcedirs.txt";
		File prefFile = new File(prefName);
		
		if (prefFile.exists()){
            try {
            	LineNumberReader in = new LineNumberReader(new FileReader(prefName));
                String str;
                while ((str = in.readLine()) != null) {
                	
                	sourceDirs.add(str.trim());
                }
                
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Recursively descends through the directory structure looking for files
	 * that end with any of the suffixes that have been specified.
	 * @param d The directory to search.
	 * @throws ResultException
	 * @throws IOException 
	 */
	void findConfigsRecursive(File dir) throws ResultException, IOException {
		if (dir.exists()){
			String[] files = dir.list();
			
			for(String f : files){
				for (String suffix : suffixes){
//					DebugInfo.debug("Checking suffix: " + suffix + " against " + f);					
					if (f.endsWith(suffix)){
						ConfigLocation newLocation = new ConfigLocation(f, dir.getCanonicalPath(),suffix);
						
						addConfig(newLocation);
						
						if (newLocation.getConfigName().length() > longest)
							longest = newLocation.getConfigName().length();
					}
					else{
						String fullname = dir.getAbsolutePath() + File.separator + f;
						File curr = new File(fullname);
						if (curr.isDirectory())
							findConfigsRecursive(curr);
					}
				}
			}
		}
		else{
			ResultException ex = new ResultException();
			ex.addError("Specified source directory doesn't exist: " + dir.getCanonicalPath());
			throw(ex);
		}
	}
	
	/**
	 * Attempts to add the new location. If the version clashes with an existing version,
	 * we pitch an exception.
	 * @param cl The new location.
	 * @throws ResultException
	 */
	void addConfig(ConfigLocation cl) throws ResultException {
//		DebugInfo.debug("*** Adding config: " + cl.getConfigName());
		
		ConfigVersion cv = versions.get(cl.getConfigName());
		
		if (cv == null){
			cv = new ConfigVersion();
			versions.put(cl.getConfigName(), cv);
		}
		
		cv.addVersion(cl);
		
		// Just add that puppy
		configs.add(cl);
	}
	
//	/**
//	 * @return A listing of the schemas we've found.
//	 */
//	public String getSchemaListing(){
//		StringBuffer sb = new StringBuffer();
//		
//		for(ConfigLocation dsl : configs.values()){
//			sb.append(dsl.getConfigName() + " -- " + dsl.getDirectory() + "\n");
//		}
//		return(sb.toString());
//	}
	
	/**
	 * This method checks the current class path for /bin directories (that, in Eclipse,
	 * give us a hint as to where the /src directories are) and JAR files whose names end
	 * with a JAR ending you've specified. Such JARs are assumed to contain files with .xxx
	 * file extensions. This mechanism allows you to easily import configs defined elsewhere,
	 * in other projects you have open or exported in JARs from other sources.
	 * @throws IOException  
	 * @throws ResultException 
	 */
	void findConfigsOnClassPath() throws IOException, ResultException {
		String[] paths = System.getProperty("java.class.path").split(";");
		for(String f : paths){
//			DebugInfo.debug(f);
			if ((jarEndings.size() > 0) && f.endsWith(".jar")){
				
				for(String jarEnding : jarEndings){
					if (f.endsWith(jarEnding)){
						// We have a JAR of interest - an example might look like:
						// file:F:\AASoftDev\workspace\dark-matter-data\extjars\exampleDMSchema.jar
						JarFile jar = new JarFile(f);	        
				        for (Enumeration<JarEntry> entries = jar.entries(); entries.hasMoreElements();)
				        {
				            String jarEntry = ((JarEntry)entries.nextElement()).getName();
//				            DebugInfo.debug(jarEntry);
				            
				            for(String suffix : suffixes){
					            if (jarEntry.endsWith(suffix)){
					            	// The jarEntry might appear as follows: /com/example/schema/example.dms
					            	// AND NOTE THAT THE FILE SEPERATORS ARE FORWARD SLASHES, NOT SYSTEM DEPENDENT!!!
					            	int lastSlash = jarEntry.lastIndexOf("/");
					            	String schemaName = jarEntry.substring(lastSlash+1);
					            	String path = jarEntry.substring(0,lastSlash);
					            	
									ConfigLocation newLocation = new ConfigLocation(f, schemaName, path, suffix);
									
									addConfig(newLocation);
									
									if (newLocation.getConfigName().length() > longest)
										longest = newLocation.getConfigName().length();
					            }
				            }
				        }
					}
				}
			}
			else if (f.endsWith(File.separator + "bin")){
				// We may have a project's bin directory here, which would mean that
				// the src should be in a parallel directory
				int lastSlash = f.lastIndexOf(File.separatorChar);
				String prefix = f.substring(0,lastSlash);
				
				File src = new File(prefix + File.separator + "src");
				
				if (src.exists()){
//					DebugInfo.debug("Source directory: " + src);
					
					findConfigsRecursive(src);
				}
			}
			
//			DebugInfo.debug("");
		}
		
	}
}
