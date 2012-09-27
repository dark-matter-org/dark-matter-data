//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmc.rules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;

public abstract class AttributeRuleCollection<I extends RuleIF> extends RuleCollection<I> {

	// For global attribute rules, we maintain this map keyed just by the attribute
	protected HashMap<DmcAttributeInfo,ArrayList<I>>	globalRules;
	
	public AttributeRuleCollection() {
		globalRules = new HashMap<DmcAttributeInfo, ArrayList<I>>();
		rules = new TreeMap<RuleKey, RuleList<I>>();
	}
	
	protected void addThisRule(I rule){
        if (rule.getApplyToClass() == null){
            ArrayList<I> grl = globalRules.get(rule.getApplyToAttribute());
            if (grl == null){
                grl = new ArrayList<I>();
                globalRules.put(rule.getApplyToAttribute(), grl);
            }
            grl.add(rule);
        }
        else{
            RuleList<I> attrRules = rules.get(rule.getKey());
            if (attrRules == null){
                attrRules = new RuleList<I>();
                rules.put(rule.getKey(), attrRules);
            }
            attrRules.addRule(rule);
        }
		
	}
	
	/**
	 * This method is used by generated derived classes to determine the set of class scoped
	 * rules to be applied to the specified attribute. 
	 * @param ai the attribute info
	 * @param ci the class info
	 * @return a set of rules to be applied or null if there are no class specific rules that
	 * apply to the attribute.
	 */
	protected ArrayList<I> getRules(DmcAttributeInfo ai, DmcClassInfo ci){
    	AttributeRuleKey 	ark = new AttributeRuleKey(ai, ci);
		RuleList<I>			ruleList	= rules.get(ark);
		
		if (ruleList == null){
			// We didn't have rules specifically for this attribute in this class, so
			// we create a place holder rule list and pass it in for initialization.
			// The next we come through for the same key, we won't have to do the
			// initialization again.
			ruleList = new RuleList<I>();
			initializeFromHere(ark, ruleList);
		}
		else{
			// We have a rule list - if it hasn't yet been initialized, we initialize it
			if (!ruleList.initialized())
				initializeFromHere(ark, ruleList);
		}
    	
    	return(ruleList.getRules());
	}

	/**
	 * The first time we are asked to retrieve the rules for a particular attribute key, we ascend the
	 * class hierarchy and gather all of the rules that would apply to the specified attribute in
	 * all base classes as well. Once done, the rule list is marked as initialized and we don't bother
	 * with this exercise again.
	 * <p/>
	 * The rule list that's passed in may in fact be empty, but we may find rules defined for the attribute
	 * in the context of our base classes. Or, it may be that there are simply no rules for this attribute
	 * that are particular to any class. The generated derived class will check for global attribute rules
	 * that may have to be applied.
	 * @param ark the starting rule key
	 * @param ruleList the rule list for the specified key.
	 */
	private void initializeFromHere(AttributeRuleKey ark, RuleList<I> ruleList){
		DmcClassInfo base = ark.classInfo.derivedFrom;
		
		while(base != null){
			AttributeRuleKey baseKey = new AttributeRuleKey(ark.attrInfo, base);
			RuleList<I> baseRules = rules.get(baseKey);
			
			if (baseRules != null){
				ArrayList<I> rl = baseRules.getRules();
				for(I rule: rl)
					ruleList.addRule(rule);
			}
			base = base.derivedFrom;
		}
		
		ruleList.setInitialized();
	}
}
