package org.dmd.dms;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.RuleCategoryDMO;
import org.dmd.dms.generated.dmw.RuleCategoryDMW;

public class RuleCategory extends RuleCategoryDMW {

	public RuleCategory(){
		super(new RuleCategoryDMO(), MetaSchemaAG._RuleCategory);
	}
	
	public RuleCategory(RuleCategoryDMO obj){
		super(obj);
	}
	
	protected RuleCategory(String mn) throws DmcValueException{
		super(mn);
	}
	
}
