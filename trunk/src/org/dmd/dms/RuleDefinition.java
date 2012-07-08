package org.dmd.dms;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.RuleDefinitionDMO;
import org.dmd.dms.generated.dmw.RuleDefinitionDMW;
import org.dmd.dms.generated.enums.OperationalContextEnum;

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
}
