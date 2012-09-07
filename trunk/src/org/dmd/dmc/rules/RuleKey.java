package org.dmd.dmc.rules;

/**
 * The RuleKey provides a common basis for accessing collections of rules.
 * It forces derived classes to override hashCode() and equals().
 */
public abstract class RuleKey implements Comparable<RuleKey>{

	abstract public int hashCode();
	
	abstract public boolean equals(Object obj);
	
	abstract public String toString();

	@Override
	public int compareTo(RuleKey o) {
		return(toString().compareTo(o.toString()));
	}
}
