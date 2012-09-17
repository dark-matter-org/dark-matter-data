package org.dmd.dmc.rules;

import java.util.TreeMap;

public abstract class RuleCollection<I> {
	
	protected TreeMap<RuleKey,I>	rules;

	public RuleCollection() {
		
	}
	
	abstract public void addRule(RuleIF rule);
}
