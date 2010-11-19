package org.dmd.features.extgwt.client.widget.treepanel;

import java.util.TreeMap;

import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;
import org.dmd.features.extgwt.client.util.DmoExtGWTTreeKeyProvider;
import org.dmd.features.extgwt.client.util.DmoExtGWTTreeModelComparer;

import com.extjs.gxt.ui.client.store.TreeStore;

/**
 * The DmdTreeStore provides some convenience mechanisms in conjunction with the 
 * DmoExtGWTTreeNode wrapper objects. 
 */
public class DmdTreeStore extends TreeStore<DmoExtGWTTreeNode<LDAPHierarchicObjectDMO>> {

	// We maintain a map by FQN so that we can easily add objects to the hierarchy
	TreeMap<String,DmoExtGWTTreeNode<LDAPHierarchicObjectDMO>> objMap;
	
	public DmdTreeStore(){
		super();
		this.setKeyProvider(new DmoExtGWTTreeKeyProvider());
		this.setModelComparer(new DmoExtGWTTreeModelComparer());
		objMap = new TreeMap<String, DmoExtGWTTreeNode<LDAPHierarchicObjectDMO>>();
	}
	
	@SuppressWarnings("unchecked")
	public void add(DmoExtGWTTreeNode node){
		
		if (node.getParentFQN() == null){
			// This is a root node
			super.add(node,false);
		}
		else{
			DmoExtGWTTreeNode parent = objMap.get(node.getParentFQN());
			if (parent == null){
				super.add(node,false);
			}
			else{
				super.add(parent, node, false);
			}
		}
		
		objMap.put(node.getFQN(), node);
	}
	
	/**
	 * Deletes the object with the specified FQN.
	 * @param fqn The fully qualified name of the object.
	 */
	@SuppressWarnings("unchecked")
	public void delete(String fqn){
		DmoExtGWTTreeNode existing = objMap.get(fqn);
		
		if (existing != null){
			objMap.remove(fqn);
			
			super.remove(existing);
		}
	}
	
	/**
	 * Returns the object with the specified FQN if it exists.
	 * @param fqn
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public DmoExtGWTTreeNode get(String fqn){
		return(objMap.get(fqn));
	}
}
