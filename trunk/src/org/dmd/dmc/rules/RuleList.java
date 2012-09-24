package org.dmd.dmc.rules;

import java.util.ArrayList;

/**
 * The RuleList maintains a flag to indicate if we've run up the class hierarchy to determine the complete
 * set of rules for a class of object. And maintains a list of rules if any are specified.
 * @param <E> the interface of the rules being stored.
 */
public class RuleList<E extends RuleIF> {
	
	private ArrayList<E>	rules;
	private boolean			initialized;
	
	public RuleList(){
		initialized = false;
	}
	
	public boolean initialized(){
		return(initialized);
	}
	
	public void setInitialized(){
		initialized = true;
	}
	
	public void addRule(E rule){
		if (rules == null)
			rules = new ArrayList<E>();
		rules.add(rule);
	}
	
	public ArrayList<E> getRules(){
		return(rules);
	}
}
