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
package org.dmd.core.rules;

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
