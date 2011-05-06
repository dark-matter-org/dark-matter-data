//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dmr.server.base.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.FullyQualifiedName;
import org.dmd.dmr.server.base.extended.HierarchicObject;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;

/**
 * The HierarchicDataCache provides storage and access to a set of HierarchicObjects.
 */
public class HierarchicDataCache implements DmcNameResolverIF {

	// The root object
	protected HierarchicObject					root;
	
	// Key: FQN
	protected TreeMap<DmcHierarchicObjectName,HierarchicObject>	data;
	
	FullyQualifiedName nameKey;
	
	public HierarchicDataCache(){
		root = new HierarchicObject();
		data = new TreeMap<DmcHierarchicObjectName, HierarchicObject>();
		nameKey = new FullyQualifiedName();
	}
	
	/**
	 * Returns the root object which has no name or other associated data.
	 * @return the root.
	 */
	public HierarchicObject getRoot(){
		return(root);
	}
	
	public void addObject(HierarchicObject ho){
		if (ho.getFQN().getParentName() == null){
			root.addSubComponent(ho);
			
			data.put(ho.getFQN(), ho);
		}
		else{
			HierarchicObject parent = find(ho.getFQN().getParentName());
			
			if (parent == null){
				// We don't have the parent in the cache, so just add the 
				// object as an orphan
				data.put(ho.getFQN(), ho);
			}
			else{
				// we have the parent, but check to see if the object already
				// knows its parent object. If not, add it to the object.
				if (ho.getParentObject() == null)
					parent.addSubComponent(ho);
				
				data.put(ho.getFQN(), ho);
			}
		}
	}
	
	public void deleteObject(DmcHierarchicObjectName FQN){
		HierarchicObject ho = find(FQN);
		
		if (ho != null){
			try {
				ho.getParentObject().removeSubComponent(ho);
			} catch (ResultException e) {
				e.printStackTrace();
			} catch (DmcValueException e) {
				e.printStackTrace();
			}
			data.remove(FQN);
		}
	}

	public HierarchicObject find(DmcHierarchicObjectName name) {
		return(data.get(name));
	}	
	
	public void loadData(SchemaManager sm, String fn) throws ResultException, DmcValueException {
		HierarchyParser parser = new HierarchyParser(sm, this);
		
		parser.readHierarchy(fn);
	}
	
	/**
	 * Saves persistent objects to the specified file.
	 * @param ofn The out file name.
	 * @param padding The padding to be used for objects.
	 * @throws IOException
	 */
	public void savePersistentData(String ofn, int padding) throws IOException {
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        for(int i=0; i<root.size(); i++){
        	root.get(i).saveToFile(out, padding, true);
        }
        
        out.close();
	}


	////////////////////////////////////////////////////////////////////////////////
	// DmcNameResolverIF implementation
	public DmcNamedObjectIF findNamedObject(String name) {
		try {
			nameKey.setNameString(name);
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return(data.get(nameKey));
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
		return(data.get(name));
	}

	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
		HierarchicObject ho = data.get(name);
		
		if (ho == null)
			return null;
		
		return(ho.getDmcObject());
	}
	
}
