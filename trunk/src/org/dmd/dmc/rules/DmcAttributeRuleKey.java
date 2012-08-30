package org.dmd.dmc.rules;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;

/**
 * The DmcAttributeRuleKey is used to identify attribute level rules by class.
 */
public class DmcAttributeRuleKey {
	
	DmcAttributeInfo	attrInfo;
	DmcClassInfo		classInfo;
	int hashCode;

	public DmcAttributeRuleKey(DmcAttributeInfo ai, DmcClassInfo ci){
		attrInfo = ai;
		classInfo = ci;
		
		int hc = 17;
		
		hc = 31 * hc + attrInfo.id;
		hc = 31 * hc + classInfo.id;
		
		hashCode = hc;
	}
	
	
	
}
