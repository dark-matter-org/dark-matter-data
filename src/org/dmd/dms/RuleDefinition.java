package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.RuleIF;
import org.dmd.dms.generated.dmo.RuleDefinitionDMO;
import org.dmd.dms.generated.dmw.RuleDefinitionDMW;
import org.dmd.dms.generated.enums.OperationalContextEnum;
import org.dmd.dms.generated.enums.RuleTypeEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;

public class RuleDefinition extends RuleDefinitionDMW {

	public RuleDefinition(){
		super(new RuleDefinitionDMO(), MetaSchemaAG._RuleDefinition);
	}
	
	public RuleDefinition(RuleDefinitionDMO obj){
		super(obj);
	}
	
	protected RuleDefinition(String mn) throws DmcValueException{
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
	
	public RuleIF newRuleInstance() throws ResultException{
		RuleIF 		rc 			= null;
		Class<?> 	ruleClass 	= null;
		
		try {
			ruleClass = Class.forName(this.getRuleDefinitionImport());
		} catch (ClassNotFoundException e) {
        	ResultException ex = new ResultException();
        	ex.result.addResult(Result.FATAL,"Couldn't load Java class: " + this.getRuleDefinitionImport());
        	ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());
        	throw(ex);
		}

        try{
            rc = (RuleIF) ruleClass.newInstance();
        }
        catch(Exception e){
        	ResultException ex = new ResultException();
        	ex.result.addResult(Result.FATAL,"Couldn't instantiate Java class: " + this.getRuleDefinitionImport());
        	ex.result.lastResult().moreMessages("This may be because the class doesn't have a constructor that takes no arguments.");
        	ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());
        	throw(ex);
        }

		return(rc);
	}
}
