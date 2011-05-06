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
package org.dmd.dmr.server.base.extended;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmr.server.base.generated.dmw.HierarchicObjectDMW;
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.util.exceptions.ResultException;

/**
 * The extended HierarchicObject class provides a variety of functionality
 * that makes using hierarchic objects convenient.
 * 
 */
public class HierarchicObject extends HierarchicObjectDMW implements Comparable<HierarchicObject> {
	
	private List<HierarchicObject>	subcomps;
	
	// The subcomponents of this entry if they exist
//    private Vector<HierarchicObject>	subcomps;
    
    // The parent of this object or null if this is a top level object
    protected HierarchicObject		parent;
    	
    // This can be set globally to indicate if you want your subcomponents sorted by FQN
    // or not. The default is to sort them.
    static boolean					sortSubComps = true;
    
    /**
     * This constructor is used to create a "root" object that has no data and
     * acts merely as the root of a tree of objects.
     */
    public HierarchicObject(){
    	subcomps = null;
    }
    
    /**
     * Returns an iterator over a COPY of the subcomps vector.
     * @return
     */
    public Iterator<HierarchicObject> getSubComps(){
    	if (subcomps == null)
    		return(Collections.<HierarchicObject> emptyList().iterator());
    	return(new Vector<HierarchicObject>(subcomps).iterator());
    }
    
	protected HierarchicObject(HierarchicObjectDMO obj, ClassDefinition cd) {
		super(obj,cd);
	}
	
    /**
     * Sets the global flag that indicates whether or not we sort our subcomponents
     * by their FQN or not.
     * @param f True to sort and false to leave the subcomps in the order they are added.
     */
    public static void setSort(boolean f){
    	sortSubComps = f;
    }

    /**
     * This method sets the parent object for this object and reconstructs the FQN
     * as appropriate.
     * @param p the parent object.
     * @throws ResultException if there's no value for the naming attribute.
     * @throws DmcValueException 
     */
    public void setParentObject(HierarchicObject p) throws ResultException, DmcValueException {
    	setParentObject(p,true);
    }
    
    /**
     * This method sets the parent object for this object and reconstructs the FQN
     * as appropriate. Set the buildFQN flag to false if the object already has its FQNs set e.g.
     * when it has been retrieved from the repository.
     * @param p the parent object.
     * @param buildFQN Indicates if we need to reset this object's FQNs based on the parent.
     * @throws ResultException if there's no value for the naming attribute.
     * @throws DmcValueException 
     */
	public void setParentObject(HierarchicObject p, boolean buildFQN) throws ResultException, DmcValueException {
		ResultException ex = new ResultException();
		ex.addError("Cannot set the parent of a root HierarchicObject.");
		throw(ex);
	}
	
    /**
     * This method rehomes a branch of hierarchic objects to sit beneath the specified parent. The method
     * recurses through the entire subtree and renames the objects based on the new parent.
     * @param newParent
     * @throws DmcValueException 
     */
	public void resetParent(HierarchicObject newParent) throws ResultException, DmcValueException {
		ResultException ex = new ResultException();
		ex.addError("Cannot set the reset parent of a root HierarchicObject.");
		throw(ex);
	}

    public HierarchicObject getParentObject(){
    	return(parent);
    }
    
	/**
	 * Returns the number of sub components.
	 * @return The number of subcomponents.
	 */
	public int size(){
		if (subcomps == null)
			return(0);
		
		return(subcomps.size());
	}
	
	/**
	 * Returns the subcomp at the specified index or null if there are no subcomps or if the index is
	 * out of bounds.
	 * @param i Index of the desired subcomp.
	 */
	public HierarchicObject get(int i){
		if ( (subcomps == null ) || (i > subcomps.size()-1))
			return(null);
		
		return(subcomps.get(i));
	}
	
	/**
	 * This method removes all entries in our subcomponents Vector. Note it doesn't do
	 * anything beyond that - the subcomponents are not deleted or affected in any way.
	 */
	public void removeSubcomponents(){
		if (subcomps != null){
			subcomps.clear();
			subcomps = null;
		}
	}
	
	public void removeSubComponent(HierarchicObject ho) throws ResultException, DmcValueException {
		if (subcomps != null){
//			ho.setParentObject(null);
// removed this because it changes the name of the object which means we can't
// use it down the road in events
			subcomps.remove(ho);
		}
	}

	/**
	 * Adds a subcomponent to this entry.
	 * @param ce
	 */
	public void addSubComponent(HierarchicObject ce){
		if (subcomps == null)
			subcomps = Collections.synchronizedList(new Vector<HierarchicObject>());
		
		subcomps.add(ce);
		if (sortSubComps)
			Collections.sort(subcomps);
	}
	
    /**
     * Implementation of the Comparable interface so that we can sort our children easily.
     */
    @Override
	public int compareTo(HierarchicObject o) {
		
		if (o instanceof HierarchicObject){
			HierarchicObject ho = (HierarchicObject)o;
			if (ho.getFQN() == null){
				if (this.getFQN() == null)
					return(0);
				else
					return(1);
			}
			else{
				if (this.getFQN() == null){
					return(-1);
				}
				else{
					return(this.getFQN().compareTo(ho.getFQN()));
				}
			}
			
		}
		return -1;
	}

    /**
     * We're overloading this to facilitate the way our JSON implementation will work. When objects
     * are referenced (e.g. in a GetResponse) we'll using the FQN as the object name.
     * @return String
     */
    public String getName(){
    	return(this.getFQN().getNameString());
    }

    /**
     * This method will save an entire hierarchy of objects to the file attached to the specified
     * writer.
     * @param out     Writer to the file you want to save in.
     * @param padding The padding to be used when formatting the object..
     */
    public void saveToFile(BufferedWriter out, int padding) throws IOException {
    	out.write(this.toOIF(padding) + "\n");
    	
    	if (this.size() > 0){
    		for(int i=0; i<this.size(); i++){
    			this.get(i).saveToFile(out, padding, false);
    		}
    	}
    }
    
    /**
     * This method will save an entire hierarchy of objects to the file attached to the specified
     * writer.
     * @param out     Writer to the file you want to save in.
     * @param padding The padding to be used when formatting the object..
     * @param persistentOnly If true, only persistent objects will be saved. We stop recursing
     * down a branch when we hit a TRANSIENT object.
     */
    public void saveToFile(BufferedWriter out, int padding, boolean persistentOnly) throws IOException {
    	if (persistentOnly){
    		if (this.getConstructionClass().getDataType() == DataTypeEnum.TRANSIENT)
    			return;
    	}

    	out.write(this.toOIF(padding) + "\n");
    	
    	if (this.size() > 0){
    		for(int i=0; i<this.size(); i++){
    			this.get(i).saveToFile(out, padding, persistentOnly);
    		}
    	}
    }
    
    /**
     * This method saves the entire hierarchy from this point to the string buffer.
     * @param sb     The buffer to which we append the object.
     * @param padding The padding to be used when formatting the object.
     * @param persistentOnly If true, only persistent objects will be saved. We stop recursing
     * down a branch when we hit a TRANSIENT object.
     */
    public void saveToBuffer(StringBuffer sb, int padding) {
    	sb.append(this.toOIF(padding) + "\n");
    	
    	if (this.size() > 0){
    		for(int i=0; i<this.size(); i++){
    			this.get(i).saveToBuffer(sb, padding, false);
    		}
    	}
    }
    
    /**
     * This method saves the entire hierarchy from this point to the string buffer.
     * @param sb     The buffer to which we append the object.
     * @param padding The padding to be used when formatting the object.
     * @param persistentOnly If true, only persistent objects will be saved. We stop recursing
     * down a branch when we hit a TRANSIENT object.
     */
    public void saveToBuffer(StringBuffer sb, int padding, boolean persistentOnly) {
    	if (persistentOnly){
    		if (this.getConstructionClass().getDataType() == DataTypeEnum.TRANSIENT)
    			return;
    	}
    	
    	sb.append(this.toOIF(padding) + "\n");
    	
    	if (this.size() > 0){
    		for(int i=0; i<this.size(); i++){
    			this.get(i).saveToBuffer(sb, padding, persistentOnly);
    		}
    	}
    }
    
    /**
     * If the object is a HierarchicObject and has the same FQN as this object, they're equal.
     */
    public boolean equals(Object obj){
    	boolean rc = true;
    	
    	if (obj instanceof HierarchicObject){
    		if (!this.getFQN().equals(((HierarchicObject)obj).getFQN()))
    			rc = false;
    	}
    	else
    		rc = false;
    	
    	return(rc);
    }
    

}
