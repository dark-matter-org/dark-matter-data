package org.dmd.dmc.rules;

import java.util.ArrayList;

import org.dmd.dmc.DmcClassInfo;


public abstract class ClassRuleCollection<I> extends RuleCollection<I> {

	// Global rules of this type that apply to all classes
	protected ArrayList<I> 	globalRules;
	
	public ClassRuleCollection() {

	}

	protected ArrayList<I> getRules(DmcClassInfo ci){
		ArrayList<I> rc  = null;
    	ClassRuleKey crk = new ClassRuleKey(ci);

    	return(rc);
	}

}
