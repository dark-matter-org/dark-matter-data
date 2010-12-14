package org.dmd.dmr.server.base.extended;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmr.server.base.generated.dmw.HierarchicObjectDMW;
import org.dmd.dmr.server.ldap.extended.LDAPHierarchicObject;
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
import org.dmd.dms.ClassDefinition;
import org.dmd.util.exceptions.ResultException;

/**
 * The extended HierarchicObject class provides a variety of functionality
 * that makes using hierarchic objects convenient.
 * 
 */
abstract public class HierarchicObject extends HierarchicObjectDMW implements Comparable<HierarchicObject> {
	
	// The subcomponents of this entry if they exist
    protected Vector<HierarchicObject>	subcomps;
    
    // The parent of this object or null if this is a top level object
    protected HierarchicObject			parent;
    	
    // This can be set globally to indicate if you want your subcomponents sorted by FQN
    // or not. The default is to sort them.
    static boolean				sortSubComps = true;
    
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
	abstract public void setParentObject(HierarchicObject p, boolean buildFQN) throws ResultException, DmcValueException;
	
    /**
     * This method rehomes a branch of hierarchic objects to sit beneath the specified parent. The method
     * recurses through the entire subtree and renames the objects based on the new parent.
     * @param newParent
     * @throws DmcValueException 
     */
	abstract public void resetParent(HierarchicObject newParent) throws ResultException, DmcValueException;

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
			ho.setParentObject(null);
			subcomps.remove(ho);
		}
	}

	/**
	 * Adds a subcomponent to this entry.
	 * @param ce
	 */
	public void addSubComponent(HierarchicObject ce){
		if (subcomps == null)
			subcomps = new Vector<HierarchicObject>();
		
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
    	return(this.getFQN());
    }

    /**
     * This method will save an entire hierarchy of objects to the file attached to the specified
     * writer.
     * @param out     Writer to the file you want to save in.
     * @param padding The padding to be used when formatting the object..
     */
    public void saveToFile(BufferedWriter out, int padding) throws IOException {
    	out.write(this.toOIF(padding));
    	
    	if (this.size() > 0){
    		for(int i=0; i<this.size(); i++){
    			out.write("\n");
    			this.get(i).saveToFile(out, padding);
    		}
    	}
    }
    
    /**
     * This method saves the entire hierarchy from this point to the string buffer.
     * @param sb     The buffer to which we append the object.
     * @param padding The padding to be used when formatting the object.
     */
    public void saveToBuffer(StringBuffer sb, int padding) {
    	sb.append(this.toOIF(padding));
    	
    	if (this.size() > 0){
    		if (subcomps != null)
    			Collections.sort(subcomps);
    		for(int i=0; i<this.size(); i++){
    			sb.append("\n");
    			this.get(i).saveToBuffer(sb, padding);
    		}
    	}
    }
    
    /**
     * If the object is a LDAPHierarchicObject and has the same FQN as this object, they're equal.
     */
    public boolean equals(Object obj){
    	boolean rc = true;
    	
    	if (obj instanceof LDAPHierarchicObject){
    		if (!this.getFQN().equals(((LDAPHierarchicObject)obj).getFQN()))
    			rc = false;
    	}
    	else
    		rc = false;
    	
    	return(rc);
    }
    

}
