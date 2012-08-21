package org.dmd.dmc;

import org.dmd.dms.generated.enums.OperationalContextEnum;

/**
 * The DmcRuleCategoryInfo class is used by the compact schema mechanism to store
 * information about RuleCategory definitions.
 */
public class DmcRuleCategoryInfo {

	final public String 				name;
	
	final public OperationalContextEnum	context;
	
	final public int					id;
	
	public DmcRuleCategoryInfo(String n, OperationalContextEnum oc, int i) {
		name	= n;
		context	= oc;
		id		= i;
	}
}
