package org.dmd.dms.server.extended;

import org.dmd.dms.server.generated.dmw.RuleCategoryDMW;
import org.dmd.dms.shared.generated.dmo.RuleCategoryDMO;
import org.dmd.dms.shared.generated.enums.OperationalContextEnum;


public class RuleCategory extends RuleCategoryDMW {

	public RuleCategory(){
		super();
	}
	
	public RuleCategory(RuleCategoryDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
    /**
     * This constructor is used when constructing definitions in a static DmsModule.
     * @param obj the DMO associated with this definition.
     */
	public RuleCategory(RuleCategoryDMO obj){
		super(obj);
	}

	
//	protected RuleCategory(String mn) throws DMFeedbackSet {
//		super(mn);
//	}
	
	public String getRuleInterface(){
		String rc = null;
		if (getOpContext() == OperationalContextEnum.DMO){
		    rc = getDefinedInDmsModule().getSchemaPackage() + ".generated.rulesdmo." + getName() + "IF";
		}
		else{
		    rc = getDefinedInDmsModule().getDmwPackage() + ".generated.rulesdmw." + getName() + "IF";
		}
		return(rc);
	}
}
