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
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		for(RuleIF rule: rules){
			sb.append("        " + rule.toString());
		}
		
		return(sb.toString());
	}
}
