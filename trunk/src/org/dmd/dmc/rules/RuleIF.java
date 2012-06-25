package org.dmd.dmc.rules;

import java.util.Iterator;

import org.dmd.dms.generated.enums.RuleScopeEnum;
import org.dmd.dms.generated.enums.RuleTypeEnum;

/**
 * A convenience interface to allow access to information that is common to all rules.
 */
public interface RuleIF {

	/**
	 * @return the title of the rule.
	 */
	public String getRuleTitle();
	
	/**
	 * @return the rule scope.
	 */
	public RuleScopeEnum	getRuleScope();
	
	/**
	 * @return the rule type.
	 */
	public RuleTypeEnum	getRuleType();
	
	/**
	 * @return the identifiers of the categories to which this rule belongs.
	 */
	public Iterator<Integer>	getCategories();
}
