package org.dmd.dmc.rules;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * The RuleCollection maintains a collection of rule instances on the basis of the 
 * RuleKey associated with the rule instance. 
 * @param <I> an interface that extends RuleIF
 */
public abstract class RuleCollection<I extends RuleIF> {
	
	protected TreeMap<RuleKey,RuleList<I>>	rules;

	/**
	 * Creates a new RuleCollection. 
	 */
	public RuleCollection() {
		
	}
	
	/**
	 * Attempts to add a single rule instance to the collection. Whether or not
	 * the rule is actually added will depend on whether or not the rule instance
	 * is a match for this rule collection.
	 * <p/>
	 * The generated derived class will check to see if this rule is of the type
	 * specified (<I>) for this collection.
	 * @param rule the rule to be added.
	 */
	abstract public void addRule(RuleIF rule);
	
	/**
	 * Attempts to add the rules to this collection. The ones that match this collection's
	 * interface will be added.
	 * @param rules the rules (usually from a schema)
	 */
	public void addRules(Iterator<RuleIF> rules){
		if (rules == null)
			return;
		while(rules.hasNext()){
			addRule(rules.next());
		}
	}
	

	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		sb.append(this.getClass().getName() + "\n");
		
		for(RuleKey key: rules.keySet()){
			sb.append("\n    " + key + "\n");
			RuleList<I> rl = rules.get(key);
			sb.append(rl.toString());
		}
		
		return(sb.toString());
	}

}
