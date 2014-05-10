package org.dmd.dms.server.extended;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.dms.server.generated.MetaSchemaAG;
import org.dmd.dms.server.generated.dmw.RuleCategoryDMW;
import org.dmd.dms.shared.generated.dmo.RuleCategoryDMO;
import org.dmd.dms.shared.generated.enums.OperationalContextEnum;


public class RuleCategory extends RuleCategoryDMW {

	public RuleCategory(){
		super(new RuleCategoryDMO(), MetaSchemaAG._RuleCategory);
	}
	
	public RuleCategory(RuleCategoryDMO obj){
		super(obj);
	}
	
	protected RuleCategory(String mn) throws DMFeedbackSet {
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
