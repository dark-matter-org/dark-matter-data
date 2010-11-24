package org.dmd.dmr.server.ldap.extended;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmr.server.base.RepositoryIF;
import org.dmd.dmr.server.ldap.generated.auxw.LDAPAttributeAUX;
import org.dmd.dmr.server.ldap.generated.auxw.LDAPClassAUX;
import org.dmd.dmr.server.ldap.generated.dmw.LDAPHierarchicObjectDMW;
import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.generated.dmw.AttributeDefinitionDMW;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The LDAPHierarchicObject class extends the LDAPHierarchicObjectDMW class and provides
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
public class LDAPHierarchicObject extends LDAPHierarchicObjectDMW implements Comparable<LDAPHierarchicObject>{

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
    

	protected LDAPHierarchicObject(LDAPHierarchicObjectDMO obj, ClassDefinition cd) {
		super(obj,cd);
	}
	
	public LDAPHierarchicObject(){
		super();
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
    public void setParentObject(LDAPHierarchicObject p) throws ResultException, DmcValueException {
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
    @SuppressWarnings("unchecked")
	public void setParentObject(LDAPHierarchicObject p, boolean buildFQN) throws ResultException, DmcValueException {
    	AttributeDefinitionDMW naAD = LDAPClassAUX.getNamingAttribute(this.getConstructionClass());
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
        
    	if (parent == null){
    		this.setFQN(this.getConstructionClass().getShortestName() + ":" + naAttr.getString());
    		repositoryID = LDAPAttributeAUX.getReposName(naAD) + "=" + naAttr.getString();
    	}
    	else{
    		this.setFQN(parent.getFQN() + "/" + this.getConstructionClass().getShortestName() + ":" + naAttr.getString());
    		this.setParentFQN(parent.getFQN());
    		repositoryID =  LDAPAttributeAUX.getReposName(naAD) + "=" + naAttr.getString() + "," + parent.getRepositoryID();

    		parent.addSubComponent(this);
    	}
    	
    }
    
    /**
     * This method rehomes a branch of hierarchic objects to sit beneath the specified parent. The method
     * recurses through the entire subtree and renames the objects based on the new parent.
     * @param newParent
     * @throws DmcValueException 
     */
    @SuppressWarnings("unchecked")
	public void resetParent(LDAPHierarchicObject newParent) throws ResultException, DmcValueException {
    	AttributeDefinitionDMW naAD = LDAPClassAUX.getNamingAttribute(this.getConstructionClass());
        DmcAttribute     naAttr  = core.get(naAD.getName());

        if (naAttr == null){
        	ResultException ex = new ResultException();
        	ex.addError("Missing value for naming attribute: " + naAD.getName());
        	throw(ex);
        }

        if (newParent == null){
    		this.setFQN(this.getConstructionClass().getShortestName() + ":" + naAttr.getString());
    		
    		if (parent != null)
    			parent.subcomps.remove(this);
    		
    		parent = newParent;
    		repositoryID = LDAPAttributeAUX.getReposName(naAD) + "=" + naAttr.getString();
    	}
    	else{
    		// If the new parent isn't the same as our old parent, remove ourselves from
    		// the old parent (if it wasn't null)
    		if (newParent != parent){
    			if (parent != null)
    				parent.subcomps.remove(this);
    			
    			newParent.addSubComponent(this);
    		}
    		parent = newParent;
    		
    		// Rename ourselves based on the new parent
    		this.setFQN(parent.getFQN() + "/" + this.getConstructionClass().getShortestName() + ":" + naAttr.getString());
    		this.setParentFQN(parent.getFQN());
    		repositoryID =  LDAPAttributeAUX.getReposName(naAD) + "=" + naAttr.getString() + "," + parent.getRepositoryID();
    	}
        
        if (subcomps != null){
        	for(int i=0; i<subcomps.size(); i++){
        		subcomps.get(i).resetParent(this);
        	}
        }
    	
    }
    
    public LDAPHierarchicObject getParentObject(){
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
	public LDAPHierarchicObject get(int i){
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
	
	public void removeSubComponent(LDAPHierarchicObject ho) throws ResultException, DmcValueException {
		if (subcomps != null){
			ho.setParentObject(null);
			subcomps.remove(ho);
		}
	}

	/**
	 * Adds a subcomponent to this entry.
	 * @param ce
	 */
	public void addSubComponent(LDAPHierarchicObject ce){
		if (subcomps == null)
			subcomps = new Vector<LDAPHierarchicObject>();
		
		subcomps.add(ce);
		if (sortSubComps)
			Collections.sort(subcomps);
	}
	
	/**
	 * Returns the name of this object in the repository.
	 * @return The repository ID.
	 */
	@SuppressWarnings("unchecked")
	public String getRepositoryID() throws ResultException {
		if (repositoryID == null){
	    	AttributeDefinitionDMW naAD = LDAPClassAUX.getNamingAttribute(this.getConstructionClass());
	        DmcAttribute     naAttr  = core.get(naAD.getName());
	        
	        if (naAttr == null){
	        	ResultException ex = new ResultException();
	        	ex.addError("Missing value for naming attribute: " + naAD.getName());
	        	throw(ex);
	        }
	        
	    	repositoryID = LDAPAttributeAUX.getReposName(naAD) + "=" + naAttr.getString();
		}
		
		return(repositoryID);
	}
    
	/**
	 * Sets the name of this object as used in the repository.
	 * @param id
	 */
	public void setRepositoryID(String id){
		repositoryID = id;
	}
	
	public void setRepository(RepositoryIF r){
		repository = r;
	}
	
	public RepositoryIF getRepository(){
		return(repository);
	}
    
    /**
     * We're overloading this to facilitate the way our JSON implementation will work. When objects
     * are referenced (e.g. in a GetResponse) we'll using the FQN as the object name.
     * @return String
     */
    public String getName(){
    	return(this.getFQN());
    }

//    /**
//     * 
//     * @return
//     */
//    @SuppressWarnings("unchecked")
//	public void toDOM(StringBuffer sb, PrintfFormat format, String indent){
//        Iterator<DmcAttribute>	it;
//        DmcAttribute 			ga;
//        ClassDefinition 		cd;
//        
////        sb.append(indent + "{ \"" + this.getConstructionClass().getName() + "\": {\n");
//        sb.append(indent + "{\n");
//        
//
//        // this is a safe way to iterate (locking attributes for just this method won't help)
//        core.getAttributes().values().iterator();
//
//        // Dump the attribute values
//        while(it.hasNext()){
//            ga = it.next();
//            
//            if (ga.attrdef == ImdMetaSchemaAG.meta_efObjectClass){
//                if (format == null){
//                	sb.append("  " + indent + "\"objClass\": ");
//                }
//                else{
//                	sb.append(indent);
//                	sb.append("  " + format.sprintf("\"objClass\": "));
//                }
//                
//                sb.append("\"" + getConstructionClass().getName() + "\",\n");
//                
//            	continue;
//            }
//
//            attrToJSON(ga, sb, format, indent + "  ", false);
//            
//            if (it.hasNext()){
//            	sb.append(",\n");
//            }
//        }
//        
//        // Append the children
//        if (this.size() > 0){
//        	int x = this.size()-1;
//        	sb.append(",\n" + indent + "  \"children\": [\n");
//        	for(int i=0; i<this.size(); i++){
//        		this.get(i).toDOM(sb, format, indent + "    ");
//        		if (i < x)
//        			sb.append(",\n");
//        	}
//        	sb.append("\n" + indent + "  ]");
//        }
//        
//        sb.append("\n" + indent + "}");
//    }
//    
//    /**
//     * 
//     * @return
//     */
//    public void toCompactDOM(StringBuffer sb){
//        Iterator            it;
//        ImdGenericAttribute ga;
//        ImdClassDef         cd;
//        
//        sb.append("{");
//
//        // this is a safe way to iterate (locking attributes for just this method won't help)
//        it = new Vector(attributes.values()).iterator();
//
//        // Dump the attribute values
//        while(it.hasNext()){
//            ga = (ImdGenericAttribute)it.next();
//            
//            if (ga.attrdef == ImdMetaSchemaAG.meta_efObjectClass){
//                sb.append("\"objClass\":");
//                sb.append("\"" + getConstructionClass().getName() + "\",");
//            	continue;
//            }
//
//            attrToCompactJSON(ga, sb, false);
//            
//            if (it.hasNext()){
//            	sb.append(",");
//            }
//        }
//        
//        // Append the children
//        if (this.size() > 0){
//        	int x = this.size()-1;
//        	sb.append(",\"children\":[");
//        	for(int i=0; i<this.size(); i++){
//        		this.get(i).toCompactDOM(sb);
//        		if (i < x)
//        			sb.append(",");
//        	}
//        	sb.append("]");
//        }
//        
//        sb.append("}");
//    }
    
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
    
//    /**
//     * This method performs a bottom up deletion of the hierarchy starting at this object; i.e. it
//     * recurses to the leaf nodes and deletes them first. If you need to perform other logic associated
//     * with the deletion, overload this function in your own object.
//     * @param request
//     * @param response
//     */
//    public void delete(ActionAG request, ActionResponseAG response){
//    	try{
//    		if (this.getRepository() != null){
//    			if (this.size() > 0){
//    				for(int i=0; i<this.size(); i++){
//    					this.get(i).delete(request, response);
//    					this.getRepository().delete(this);
//    				}
//    			}
//    			else{
//    				this.getRepository().delete(this);
//    			}
//    		}
//    		
//    		response.setResponseType(null, ResponseTypeEnumAG.SUCCESS);
//    	}
//    	catch(ResultException ex){
//        	response.setResponseType(null, ResponseTypeEnumAG.ERROR);
//        	response.setResponseCategory(null, ResponseCategoryEnumAG.SOFTWARE);
//        	response.setResponseText(null, ex.toString());
//    	}
//
//    }

    /**
     * Implementation of the Comparable interface so that we can sort our children easily.
     */
    @Override
	public int compareTo(LDAPHierarchicObject o) {
		
		if (o instanceof LDAPHierarchicObject){
			LDAPHierarchicObject ho = (LDAPHierarchicObject)o;
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

}
