package org.dmd.features.extgwt.client.util;

import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;

import com.extjs.gxt.ui.client.data.ModelComparer;

public class DmoExtGWTTreeModelComparer implements ModelComparer<DmoExtGWTTreeNode<HierarchicObjectDMO>> {

	@Override
	public boolean equals(DmoExtGWTTreeNode<HierarchicObjectDMO> m1, DmoExtGWTTreeNode<HierarchicObjectDMO> m2) {
		boolean rc = false;
		
		if (m1 == null){
			System.out.println("DmoExtGWTTreeModelComparer null M1");
			return(rc);
		}
		if (m2 == null){
			System.out.println("DmoExtGWTTreeModelComparer null M2");
			return(rc);
		}
		
		if (m1.getFQN() == null){
			System.out.println("DmoExtGWTTreeModelComparer no FQN:\n " + m1.toOIF(15));
			return(rc);
		}
		if (m2.getFQN() == null){
			System.out.println("DmoExtGWTTreeModelComparer no FQN:\n " + m2.toOIF(15));
			return(rc);
		}
		
		return(m1.getFQN().equals(m2.getFQN()));
	}

}
