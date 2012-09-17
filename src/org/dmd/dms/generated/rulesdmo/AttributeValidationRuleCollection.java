package org.dmd.dms.generated.rulesdmo;

import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.rules.AttributeRuleCollection;
import org.dmd.dmc.rules.AttributeRuleKey;
import org.dmd.dmc.rules.ClassRuleKey;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.RuleIF;
import org.dmd.dmc.rules.RuleKey;
import org.dmd.dms.generated.enums.RuleTypeEnum;

public class AttributeValidationRuleCollection extends AttributeRuleCollection<AttributeValidationIF> {
	
	public AttributeValidationRuleCollection(){
		rules = new TreeMap<RuleKey, AttributeValidationIF>();
	}

	@Override
	public void addRule(RuleIF rule) {
		RuleKey key = null;
		
		if (rule instanceof AttributeValidationIF){
			if (rule.getRuleType() == RuleTypeEnum.ATTRIBUTE)
				key = new AttributeRuleKey(rule.getApplyToAttribute(), rule.getApplyToClass());
			else
				key = new ClassRuleKey(rule.getApplyToClass());
		}
		
	}

	public void execute(DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		
	}
	
}
