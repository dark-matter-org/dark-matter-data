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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.dmd.util.exceptions.ResultException;

/**
 * The DmsSchemaFinder utility recursively hunts through a set of specified source
 * directories and finds files with a .dms (Dark Matter Schema) suffix. The convention
 * is to store schemas beneath a folder named "schema". If you wish to version your
 * schemas, create subfolders beneath schema named v<#>dot<#> and place your .dms and .dmd
 * files in the subfolder. For instance schema/v0dot1, schema/v1dot23, schema/v11dot3dot1
 */
public class DmsSchemaFinder {

	// The source paths that we're going to search
	ArrayList<String>	roots;
	
	// The schemas that we've found
	TreeMap<String,DmsSchemaLocation>	schemas;
	
	// The length of the longest schema name we found
	int	longest;
	
	public DmsSchemaFinder(){
		roots = new ArrayList<String>();
		schemas = new TreeMap<String, DmsSchemaLocation>();
	}
	
	/**
	 * Adds a source directory root to the set of paths that the finder will
	 * traverse in search of schemas.
	 * @param dir The source directory.
	 */
	public void addSourceDirectory(String dir){
		roots.add(dir);
	}
	
	/**
	 * Scans the previously specified source directories for schema specifications.
	 * @throws ResultException 
	 * @throws IOException  
	 */
	public void findSchemas() throws ResultException, IOException {
		for(String d : roots)
			findSchemasRecursive(new File(d));
		
		findSchemasOnClassPath();
	}
	
	/**
	 * Returns the location of the specified schema. If the schema is specified in
	 * a file named myschema.dms, the schema name will be "myschema" (without the 
	 * .dms file extension).
	 * @param sn
	 * @return
	 */
	public DmsSchemaLocation getLocation(String sn){
		return(schemas.get(sn));
	}
	
	/**
	 * @return An iterator over all the schemas we found.
	 */
	public Iterator<DmsSchemaLocation> getLocations(){
		return(schemas.values().iterator());
	}
	
	/**
	 * @return the length of the longest schema name.
	 */
	public int getLongestName(){
		return(longest);
	}
	
	/**
	 * Recursively descends through the directory structure looking for files
	 * that end with .dms.
	 * @param d The directory to search.
	 * @throws ResultException
	 * @throws IOException 
	 */
	void findSchemasRecursive(File dir) throws ResultException, IOException {
		if (dir.exists()){
			String[] files = dir.list();
			
			for(String f : files){
				if (f.endsWith(".dms")){
					// Don't list the metaSchema - it's not your "standard" schema ;-)
					if (f.startsWith("metaSchema"))
						continue;
					
					DmsSchemaLocation newLocation = new DmsSchemaLocation(f, dir.getCanonicalPath());
					
					schemas.put(newLocation.getSchemaName(),newLocation);
					
					if (newLocation.getSchemaName().length() > longest)
						longest = newLocation.getSchemaName().length();
				}
				else{
					String fullname = dir.getAbsolutePath() + File.separator + f;
					File curr = new File(fullname);
					if (curr.isDirectory())
						findSchemasRecursive(curr);
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
	 * @return A listing of the schemas we've found.
	 */
	public String getSchemaListing(){
		StringBuffer sb = new StringBuffer();
		
		for(DmsSchemaLocation dsl : schemas.values()){
			sb.append(dsl.getSchemaName() + " -- " + dsl.getDirectory() + "\n");
		}
		return(sb.toString());
	}
	
	/**
	 * This method checks the current class path for /bin directories (that, in Eclipse,
	 * give us a hint as to where the /src directories are) and JAR files whose names end
	 * with DMSchema.jar. Such JARs are assumed to contain files with .dms file extensions.
	 * This mechanism allows you to easily import schemas defined elsewhere, in other projects
	 * you have open or exported in JARs from other sources.
	 * @throws IOException  
	 * @throws ResultException 
	 */
	void findSchemasOnClassPath() throws IOException, ResultException {
		String[] paths = System.getProperty("java.class.path").split(";");
		for(String f : paths){
			System.out.println(f);
			if (f.endsWith("DMSchema.jar")){
				// We have a Dark Matter Schema JAR - an example might look like:
				// file:F:\AASoftDev\workspace\dark-matter-data\extjars\exampleDMSchema.jar
				System.out.println("Dark Matter JAR: " + f);
				JarFile jar = new JarFile(f);	        
		        for (Enumeration<JarEntry> entries = jar.entries(); entries.hasMoreElements();)
		        {
		            String jarEntry = ((JarEntry)entries.nextElement()).getName();
		            System.out.println(jarEntry);
		            
		            if (jarEntry.endsWith(".dms")){
		            	// The jarEntry might appear as follows:
		            	// /com/example/schema/example.dms
		            	// AND NOTE THAT THE FILE SEPERATORS ARE FORWARD SLASHSES, NOT SYSTEM DEPENDENT!!!
		            	int lastSlash = jarEntry.lastIndexOf("/");
		            	String schemaName = jarEntry.substring(lastSlash+1);
		            	String path = jarEntry.substring(0,lastSlash);
		            	
						DmsSchemaLocation newLocation = new DmsSchemaLocation(f, schemaName, path);
						
						schemas.put(newLocation.getSchemaName(),newLocation);
						
						if (newLocation.getSchemaName().length() > longest)
							longest = newLocation.getSchemaName().length();

//			            URL fu = new URL("jar:file:" + f + "!/" + jarEntry);
//			            
//			            System.out.println(fu.getFile() + "\n");
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
					System.out.println("Source directory: " + src);
					
					findSchemasRecursive(src);
				}
			}
			
			System.out.println("");
		}
		
	}
}
