package org.dmd.dmc.rules;

import java.util.Iterator;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;
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
	 * @return the rule type.
	 */
	public RuleTypeEnum	getRuleType();
	
	/**
	 * @return the class info of the rule data.
	 */
	public DmcClassInfo getRuleClass();
	
	/**
	 * @return the identifiers of the categories to which this rule belongs.
	 */
	public Iterator<Integer>	getCategories();

	/**
	 * @return the info for the class to which this rule should be applied or null if it's a global rule. For
	 * CLASS rules, a global rule is applied to all classes. For an ATTRIBUTE rule, a global rule
	 * is applied to the attribute regardless of the class in which it exists.
	 */
	public DmcClassInfo getApplyToClass();

	/**
	 * @return the info for the attribute to which this rule should be applied or null if it's a global attribute rule.
	 */
	public DmcAttributeInfo getApplyToAttribute();
	
	/**
	 * @return the key that identifies
	 */
	public RuleKey getKey();
}
