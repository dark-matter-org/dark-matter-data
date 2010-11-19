package org.dmd.features.extgwt.client.util;

import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;

import com.extjs.gxt.ui.client.data.ModelComparer;

public class DmoExtGWTTreeModelComparer implements ModelComparer<DmoExtGWTTreeNode<LDAPHierarchicObjectDMO>> {

	@Override
	public boolean equals(DmoExtGWTTreeNode<LDAPHierarchicObjectDMO> m1,
			DmoExtGWTTreeNode<LDAPHierarchicObjectDMO> m2) {
		return(m1.getFQN().equals(m2.getFQN()));
	}

}
