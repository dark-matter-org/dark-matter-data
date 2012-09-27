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
import java.util.TreeMap;

import org.dmd.dmc.DmcClassInfo;


public abstract class ClassRuleCollection<I extends RuleIF> extends RuleCollection<I> {

	// Global rules of this type that apply to all classes
	protected ArrayList<I> 	globalRules;
	
	public ClassRuleCollection() {
		globalRules = new ArrayList<I>();
		rules = new TreeMap<RuleKey, RuleList<I>>();
	}
	
    protected void addThisRule(I rule){
        if (rule.getApplyToClass() == null){
            globalRules.add(rule);
        }
        else{
            RuleList<I> classRules = rules.get(rule.getKey());
            if (classRules == null){
                classRules = new RuleList<I>();
                rules.put(rule.getKey(), classRules);
            }
            classRules.addRule(rule);
        }
    }


	protected ArrayList<I> getRules(DmcClassInfo ci){
    	ClassRuleKey crk = new ClassRuleKey(ci);
		RuleList<I> ruleList  = rules.get(crk);
		
		if (ruleList == null){
			// We didn't have rules specifically for this class, so we create a
			// place holder rule list and pass it in for initialization.
			// The next we come through for the same key, we won't have to do the
			// initialization again.
			ruleList = new RuleList<I>();
			initializeFromHere(crk, ruleList);
		}
		else{
			// We have a rule list - if it hasn't yet been initialized, we initialize it
			if (!ruleList.initialized())
				initializeFromHere(crk, ruleList);
		}
		

    	return(ruleList.getRules());
	}

	/**
	 * The first time we are asked to retrieve the rules for a particular class key, we ascend the
	 * class hierarchy and gather all of the rules that would apply to the specified class and
	 * all base classes as well. Once done, the rule list is marked as initialized and we don't bother
	 * with this exercise again.
	 * <p/>
	 * The rule list that's passed in may in fact be empty, but we may find rules defined for the class
	 * in the context of our base classes. Or, it may be that there are simply no rules for this class.
	 * The generated derived class will check for global class rules that may have to be applied.
	 * @param ark the starting rule key
	 * @param ruleList the rule list for the specified key.
	 */
	private void initializeFromHere(ClassRuleKey crk, RuleList<I> ruleList){
		DmcClassInfo base = crk.classInfo.derivedFrom;
		
		while(base != null){
			ClassRuleKey baseKey = new ClassRuleKey(base);
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
