package org.dmd.dmc.rules;

import java.util.Iterator;

import org.dmd.dms.generated.enums.RuleScopeEnum;
import org.dmd.dms.generated.enums.RuleTypeEnum;
import org.dmd.dms.generated.types.AttributeDefinitionREF;
import org.dmd.dms.generated.types.ClassDefinitionREF;

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

	/**
	 * @return the classes to which this rule should be applied or null if it's a global class rule.
	 */
	public Iterator<ClassDefinitionREF> getApplyToClasses();

	/**
	 * @return the attribute to which this rule should be applied or null if it's a global attribute rule.
	 */
	public AttributeDefinitionREF getApplyToAttribute();
	
	
}
