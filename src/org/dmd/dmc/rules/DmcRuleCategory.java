package org.dmd.dmc.rules;

import java.util.ArrayList;

public class DmcRuleCategory {
	
	Integer				categoryID;

	ArrayList<RuleIF>	attributeRules;
	
	ArrayList<RuleIF>	classRules;
	
	public DmcRuleCategory(Integer id){
		categoryID		= id;
		attributeRules 	= null;
		classRules		= null;
	}
	
	public void add(RuleIF rule){
		
	}
}
