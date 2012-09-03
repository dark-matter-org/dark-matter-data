package org.dmd.dmc.rules;

import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.util.exceptions.DebugInfo;
import org.junit.Test;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class DmcAttributeRuleKeyTest {

	@Test
	public void testHash(){
		DmcAttributeRuleKey ark1 = new DmcAttributeRuleKey(MetaDMSAG.__classType, null);
		assertNotSame("Hash must be non zero", 0, ark1.hashCode());
		DebugInfo.debug("Hash = " + ark1.hashCode());
		
		DmcAttributeRuleKey ark2 = new DmcAttributeRuleKey(MetaDMSAG.__classType, MetaDMSAG.__ClassDefinition);
		assertNotSame("Hash with class and without class must be different", ark1.hashCode(),ark2.hashCode());
		DebugInfo.debug("Hash1 = " + ark1.hashCode() + "  Hash2 = " + ark2.hashCode());
		
		DmcAttributeRuleKey ark3 = new DmcAttributeRuleKey(MetaDMSAG.__classType, MetaDMSAG.__TypeDefinition);
		assertNotSame("Hash with different classes must be different", ark2.hashCode(),ark3.hashCode());
		DebugInfo.debug("Hash2 = " + ark2.hashCode() + "  Hash3 = " + ark3.hashCode());
		
		DmcAttributeRuleKey ark4 = new DmcAttributeRuleKey(MetaDMSAG.__baseType, MetaDMSAG.__TypeDefinition);
		assertNotSame("Hash with different attributes must be different", ark3.hashCode(),ark4.hashCode());
		DebugInfo.debug("Hash3 = " + ark3.hashCode() + "  Hash4 = " + ark4.hashCode());
		
		DmcAttributeRuleKey ark5 = new DmcAttributeRuleKey(MetaDMSAG.__classType, MetaDMSAG.__ClassDefinition);

		int order = 0;
		
		order = ark1.compareTo(ark2);
		assertTrue("comparison must be less than 0", (order < 0));
		DebugInfo.debug("order = " + order);
		
		order = ark2.compareTo(ark1);
		assertTrue("comparison must be greater than 0", (order > 0));
		DebugInfo.debug("order = " + order);
		
		order = ark2.compareTo(ark3);
		assertTrue("comparison must be less than 0", (order < 0));
		DebugInfo.debug("order = " + order);
		
		order = ark2.compareTo(ark5);
		assertTrue("comparison must 0", (order == 0));
		DebugInfo.debug("order = " + order);
	}
	
	
}
