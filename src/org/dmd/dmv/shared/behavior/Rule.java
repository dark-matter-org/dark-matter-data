package org.dmd.dmv.shared.behavior;

/**
 * The Rule class forms the basis of the dark-matter validation mechanisms. In previous
 * approaches to business logic, the predecessors of dark-matter defined rules as DMOs
 * (or their equivalent) and used wrapper/extension mechanisms to implement the behavioral
 * aspects of the rule. However, this would cause difficulties in the current scheme of
 * things because we want to have rules that can be shared across operational environments
 * and rules that are tailored to the server side as well. For the most part, the server
 * has the superset of the business logic required for an application and it's important that,
 * as much as possible, it shares rules with the client.
 * <p/>
 * In this approach, the behavior and the parameters associated with a Rule are kept separate
 * and are "merged" when the rule is applied. 
 */
public abstract class Rule {
	
	public Rule(){
		
	}

}
