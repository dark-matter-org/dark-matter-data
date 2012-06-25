package org.dmd.dmc.rules;

import org.dmd.dms.generated.enums.RuleScopeEnum;
import org.dmd.dms.generated.enums.RuleTypeEnum;

/**
 * A convenience interface to allow access to information that is common to all rules.
 */
public interface RuleIF {

	/**
	 * @return the title of the rule.
	 */
	String getRuleTitle();
	
	/**
	 * @return the rule scope.
	 */
	RuleScopeEnum	getRuleScope();
	
	/**
	 * @return the rule type.
	 */
	RuleTypeEnum	getRuleType();
	
}
