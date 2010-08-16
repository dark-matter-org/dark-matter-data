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
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.util.exceptions.ResultException;

/**
 * The DmsSchemaFinder utility recursively hunts through a set of specified source
 * directories and finds files with a .dms (Dark Matter Schema) suffix.
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
					// Get the name of the schema - omit the .dms extension
					String name = f.substring(0,f.length()-4);
					schemas.put(name,new DmsSchemaLocation(name, dir.getCanonicalPath()));
					
					if (name.length() > longest)
						longest = name.length();
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
			sb.append(dsl.getName() + " -- " + dsl.getDirectory() + "\n");
		}
		return(sb.toString());
	}
}
