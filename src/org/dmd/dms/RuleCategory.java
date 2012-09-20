package org.dmd.dms;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.RuleCategoryDMO;
import org.dmd.dms.generated.dmw.RuleCategoryDMW;
import org.dmd.dms.generated.enums.OperationalContextEnum;

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
	
	public String getRuleInterface(){
		String rc = null;
		if (getOpContext() == OperationalContextEnum.DMO){
		    rc = getDefinedIn().getSchemaPackage() + ".generated.rulesdmo." + getName() + "IF";
		}
		else{
		    rc = getDefinedIn().getDmwPackage() + ".generated.rulesdmw." + getName() + "IF";
		}
		return(rc);
	}
}
