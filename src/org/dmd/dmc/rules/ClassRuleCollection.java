package org.dmd.dmc.rules;

import java.util.ArrayList;


public abstract class ClassRuleCollection<I> extends RuleCollection<I> {

	// Global rules of this type that apply to all classes
	protected ArrayList<I> 	globalRules;
	
	public ClassRuleCollection() {

	}

}
