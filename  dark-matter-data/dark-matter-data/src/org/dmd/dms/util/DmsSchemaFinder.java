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
import java.util.ArrayList;
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
	
	public DmsSchemaFinder(){
		roots = new ArrayList<String>();
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
	 */
	public void findSchemas() throws ResultException{
		for(String d : roots)
			findSchemasRecursive(d);
	}
	
	/**
	 * Recusrively descends through the directory structure looking for files
	 * that end with .dms.
	 * @param d The directory to search.
	 * @throws ResultException
	 */
	void findSchemasRecursive(String d) throws ResultException{
		File dir = new File(d);
		
		if (dir.exists()){
			String[] files = dir.list();
			
			for(String f : files){
				if (f.endsWith(".dms")){
					// Get the name of the schema - omit the .dms extension
					String name = f.substring(0,f.length()-4);
					schemas.put(name,new DmsSchemaLocation(name, d));
				}
				else{
					File curr = new File(f);
					if (curr.isDirectory())
						findSchemasRecursive(d);
				}
			}
		}
		else{
			ResultException ex = new ResultException();
			ex.addError("Specified source directory doesn't exist: " + d);
			throw(ex);
		}
	}
}
