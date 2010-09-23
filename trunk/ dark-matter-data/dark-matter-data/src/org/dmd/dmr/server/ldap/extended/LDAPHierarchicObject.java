package org.dmd.dmr.server.ldap.extended;

import java.util.Vector;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmr.server.base.RepositoryIF;
import org.dmd.dmr.server.ldap.generated.auxw.LDAPClassAUX;
import org.dmd.dmr.server.ldap.generated.dmw.LDAPHierarchicObjectDMW;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.generated.dmw.AttributeDefinitionDMW;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The LDAPHierarchicObject class extends the HierarchicObject class and provides
 * utilities to arrange objects into a hierarchy based on their Fully Qualified Names (FQNs).
 * FQNs are comprised of tuples of the form <CLASS>:<name attribute>/<CLASS>:name attribute>/...
 * where CLASS is the shortest form of the class name and "name attribute" is the value of the
 * naming attribute for the class.
 * <P>
 * The object will maintain a Distinguished Name (DN) value as well. For LDAP, DNs are composed of
 * tuples as well, but, they are in reverse order from FQNs, they start at the leaf of a hierarchy
 * and proceed towards the root. Also, they use the name of the naming attribute in place of the
 * CLASS (as in the FQN). However, we make things a bit easier on ourselves by provide unique 
 * naming attributes for every class so that, on the basis of the naming attribute, we can determine
 * the type of class to instantiate when we pull an object from the directory.
 * <P>
 * For example, if we have an object with the following FQN:
 * NF:nodes/MF:ab/MF:67/MF:b3
 * The corresponding DN is:
 * mfid=b3,mfid=67,mfid=ab,nfid=nodes
 * <P>
 * When the object associated with this DN is read from the directory, we simply grab the first name
 * attribute value and see what class it's associated with and instantiate that Dark Matter Wrapper object
 */
public class LDAPHierarchicObject extends LDAPHierarchicObjectDMW {

	// The subcomponents of this entry if they exist
    Vector<LDAPHierarchicObject>	subcomps;
    
    // The parent of this object or null if this is a top level object
    LDAPHierarchicObject			parent;
    
    // The contents of this string will depend on the repository being used, but,
    // in the case of an LDAP Directory, it will be set to contain the distinguished
    // name (DN) of the object. 
    String 							repositoryID;
    
    // Handle to the repository from which we were retrieved, or null if no repository 
    // was involved.
    RepositoryIF					repository;
    
    // This can be set globally to indicate if you want your subcomponents sorted by FQN
    // or not. The default is to sort them.
    static boolean					sortSubComps = true;
    

	protected LDAPHierarchicObject(DmcObject obj, ClassDefinition cd) {
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
     */
    public void setParentObject(LDAPHierarchicObject p) throws ResultException {
    	setParentObject(p,true);
    }
    
    /**
     * This method sets the parent object for this object and reconstructs the FQN
     * as appropriate. Set the buildFQN flag to false if the object already has its FQNs set e.g.
     * when it has been retrieved from the repository.
     * @param p the parent object.
     * @param buildFQN Indicates if we need to reset this object's FQNs based on the parent.
     * @throws ResultException if there's no value for the naming attribute.
     */
    @SuppressWarnings("unchecked")
	public void setParentObject(LDAPHierarchicObject p, boolean buildFQN) throws ResultException {
    	LDAPClassAUX aux = new LDAPClassAUX(this.getConstructionClass());
    	AttributeDefinitionDMW naAD = aux.getNamingAttribute();
        DmcAttribute     naAttr  = core.get(naAD.getName());
        
        if ( (p != null) && (p.getFQN() == null)){
        	// The parent hasn't been properly initialized
        	ResultException ex = new ResultException();
        	ex.addErrorWithStack("The object being set as the parent hasn't been properly initialized. Ensure that its setParentObject() function has been called.",DebugInfo.getCurrentStack());
        	throw(ex);
        }
        
    	parent = p;
    	
    	if (!buildFQN)
    		return;

        if (naAttr == null){
        	ResultException ex = new ResultException();
        	ex.addError("Missing value for naming attribute: " + naAD.getName());
        	throw(ex);
        }
        
//    	if (parent == null){
//    		this.setFqn(null, this.getConstructionClass().getShortestName() + ":" + naAttr.getString());
//    		repositoryID = naAD.getReposName() + "=" + naAttr.getString();
//    	}
//    	else{
//    		this.setFqn(null, parent.getFqn() + "/" + this.getConstructionClass().getShortestName() + ":" + naAttr.getString());
//    		this.setParentFqn(null, parent.getFqn());
//    		repositoryID =  naAD.getReposName() + "=" + naAttr.getString() + "," + parent.getRepositoryID();
//
//    		parent.addSubComponent(this);
//    	}
    	
    }
    

}
