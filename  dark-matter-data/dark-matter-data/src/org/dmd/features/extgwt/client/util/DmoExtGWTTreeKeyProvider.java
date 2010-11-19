package org.dmd.features.extgwt.client.util;

import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;

import com.extjs.gxt.ui.client.data.ModelKeyProvider;

/**
 * The DmoExtGWTTreeKeyProvider provides a ModelKeyProvider implementation that accesses the
 * Fully Qualified Name (FQN) of a DmoExtGWTTreeNode.
 */
public class DmoExtGWTTreeKeyProvider implements ModelKeyProvider<DmoExtGWTTreeNode<LDAPHierarchicObjectDMO>>{

	@Override
	public String getKey(DmoExtGWTTreeNode<LDAPHierarchicObjectDMO> model) {
		return(model.getFQN());
	}

}
