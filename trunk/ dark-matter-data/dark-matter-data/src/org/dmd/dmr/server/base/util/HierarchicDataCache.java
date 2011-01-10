package org.dmd.dmr.server.base.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcValueException;
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
	protected TreeMap<String,HierarchicObject>	data;
	
	public HierarchicDataCache(){
		root = new HierarchicObject();
		data = new TreeMap<String, HierarchicObject>();
	}
	
	/**
	 * Returns the root object which has no name or other asociated data.
	 * @return the root.
	 */
	public HierarchicObject getRoot(){
		return(root);
	}
	
	public void addObject(HierarchicObject ho){
		if (ho.getParentFQN() == null){
			root.addSubComponent(ho);
			
			data.put(ho.getFQN(), ho);
		}
		else{
			HierarchicObject parent = find(ho.getParentFQN());
			
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
	
	public void deleteObject(String FQN){
		HierarchicObject ho = find(FQN);
		
		if (ho != null){
			try {
				ho.getParentObject().removeSubComponent(ho);
			} catch (ResultException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			data.remove(FQN);
		}
	}

	public HierarchicObject find(String name) {
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
	@Override
	public DmcNamedObjectIF findNamedObject(String name) {
		return(data.get(name));
	}
	
}
