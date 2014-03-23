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

import java.util.Iterator;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dms.generated.dmo.RuleDataDMO;
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
	 * @return the data associated with the rule.
	 */
	public RuleDataDMO getRuleDataDMO();
	
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
	 * @return the key that uniquely identifies this rule
	 */
	public RuleKey getKey();
	
	/**
	 * @return the parameters to be substituted into a translated message
	 */
	public Iterator<String>	getMsgParam();
	
	/**
	 * @return the key of a translated message
	 */
	public String getMsgKey();
}
