package org.dmd.dmc.rules;

import java.util.ArrayList;
import java.util.HashMap;

import org.dmd.dmc.DmcAttributeInfo;

public abstract class AttributeRuleCollection<I> extends RuleCollection<I> {

	// For global attribute rules, we maintain this map keyed just by the attribute
	protected HashMap<DmcAttributeInfo,ArrayList<I>>	globalRules;
	
	public AttributeRuleCollection() {
		
	}

}
