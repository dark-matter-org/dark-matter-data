package org.dmd.dmc.rules;

import java.util.Iterator;

/**
 * The DmcRuleCollectionIF is implemented by collections of rule data generated from
 * the Dark Matter Schema mechanisms.
 */
public interface DmcRuleCollectionIF {

	/**
	 * @return a set of rules.
	 */
	Iterator<RuleIF>	getRules();
}
