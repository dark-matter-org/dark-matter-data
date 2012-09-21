package org.dmd.dmc.rules;

import java.util.ArrayList;
import java.util.HashMap;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;

public abstract class AttributeRuleCollection<I> extends RuleCollection<I> {

	// For global attribute rules, we maintain this map keyed just by the attribute
	protected HashMap<DmcAttributeInfo,ArrayList<I>>	globalRules;
	
	public AttributeRuleCollection() {
		
	}
	
	protected ArrayList<I> getRules(DmcAttributeInfo ai, DmcClassInfo ci){
		ArrayList<I> 		rc  = null;
    	AttributeRuleKey 	ark = new AttributeRuleKey(ai, ci);

    	return(rc);
	}

}
