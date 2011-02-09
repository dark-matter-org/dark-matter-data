package org.dmd.features.extgwt.client.util;

import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;

import com.extjs.gxt.ui.client.data.ModelKeyProvider;

/**
 * The DmoExtGWTTreeKeyProvider provides a ModelKeyProvider implementation that accesses the
 * Fully Qualified Name (FQN) of a DmoExtGWTTreeNode.
 */
public class DmoExtGWTTreeKeyProvider implements ModelKeyProvider<DmoExtGWTTreeNode<HierarchicObjectDMO>>{

	@Override
	public String getKey(DmoExtGWTTreeNode<HierarchicObjectDMO> model) {
		return(model.getFQN());
	}

}
