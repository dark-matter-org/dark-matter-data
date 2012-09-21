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
            if (classRules == null)
                classRules = new RuleList<I>();
            classRules.addRule(rule);
        }
    }


	protected ArrayList<I> getRules(DmcClassInfo ci){
		ArrayList<I> rc  = null;
    	ClassRuleKey crk = new ClassRuleKey(ci);

    	return(rc);
	}

}
