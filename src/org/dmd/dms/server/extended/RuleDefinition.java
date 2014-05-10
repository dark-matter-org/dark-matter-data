package org.dmd.dms.server.extended;

import org.dmd.core.feedback.DMFeedback;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.rules.RuleIF;
import org.dmd.dms.server.generated.MetaSchemaAG;
import org.dmd.dms.server.generated.dmw.RuleDefinitionDMW;
import org.dmd.dms.shared.generated.dmo.RuleDefinitionDMO;
import org.dmd.dms.shared.generated.enums.OperationalContextEnum;
import org.dmd.dms.shared.generated.enums.RuleTypeEnum;
import org.dmd.util.runtime.DebugInfo;


public class RuleDefinition extends RuleDefinitionDMW {

	public RuleDefinition(){
		super(new RuleDefinitionDMO(), MetaSchemaAG._RuleDefinition);
	}
	
	public RuleDefinition(RuleDefinitionDMO obj){
		super(obj);
	}
	
	protected RuleDefinition(String mn) throws DMFeedbackSet {
		super(mn);
	}
	
	/**
	 * @return true if all categories associated with the rule are DMO context and false
	 * if any are FULLJAVA context.
	 */
	public boolean isDMOCompliant(){
		boolean rc = true;
		for(RuleCategory cat: getRuleCategory()){
			if (cat.getOpContext() == OperationalContextEnum.FULLJAVA){
				rc = false;
				break;
			}
		}
		return(rc);
	}
	
	/**
	 * @return the type of the rule, either ATTRIBUTE or CLASS. All of the categories of
	 * a rule must be of one type or the other.
	 */
	public RuleTypeEnum getRuleType(){
		RuleTypeEnum rc = RuleTypeEnum.CLASS;
		for(RuleCategory cat: getRuleCategory()){
			if (cat.getRuleType() == RuleTypeEnum.ATTRIBUTE){
				rc = RuleTypeEnum.ATTRIBUTE;
				break;
			}
		}
		return(rc);
	}
	
	public String getRuleDefinitionImport(){
		StringBuffer sb = new StringBuffer();
		
		if (isDMOCompliant()){
			sb.append(getDefinedIn().getSchemaPackage() + ".extended.rulesdmo." + getName());
		}
		else{
			sb.append(getDefinedIn().getSchemaPackage() + ".extended.rulesfulljava." + getName());
		}
		
		return(sb.toString());
	}
	
	public RuleIF newRuleInstance() throws DMFeedbackSet{
		RuleIF 		rc 			= null;
		Class<?> 	ruleClass 	= null;
		
		try {
			ruleClass = Class.forName(this.getRuleDefinitionImport());
		} catch (ClassNotFoundException e) {
			DMFeedback error = new DMFeedback("Couldn't load Java class: " + this.getRuleDefinitionImport());
			error.addToMessage(DebugInfo.getCurrentStack());
        	throw(new DMFeedbackSet(error));
		}

        try{
            rc = (RuleIF) ruleClass.newInstance();
        }
        catch(Exception e){
			DMFeedback error = new DMFeedback("Couldn't instantiate Java class: " + this.getRuleDefinitionImport());
			error.addToMessage("This may be because the class doesn't have a constructor that takes no arguments.");
			error.addToMessage(DebugInfo.getCurrentStack());
        	throw(new DMFeedbackSet(error));
        }

		return(rc);
	}
}
