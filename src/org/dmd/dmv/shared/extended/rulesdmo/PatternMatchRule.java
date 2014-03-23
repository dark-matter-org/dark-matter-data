package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.PatternMatchRuleBaseImpl;

public class PatternMatchRule extends PatternMatchRuleBaseImpl {

	public PatternMatchRule(){
		super();
	}
	
	public PatternMatchRule(PatternMatchRuleDataDMO patternMatchRuleDataDMO) {
		super(patternMatchRuleDataDMO);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		if (attribute.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
			String value = attribute.getSV().toString();
			
			if (!value.matches(ruleDMO.getMatchesPattern())){
				DmcRuleExceptionSet ex = new DmcRuleExceptionSet();
				ex.add(new DmcRuleException(this.getRuleTitle() + "\n" + obj.toOIF(), this));
				throw(ex);
			}
		}
		else{
			for(int i=0; i<attribute.getMVSize(); i++){
				Object valobj = attribute.getMVnth(i);
				if (valobj != null){
					String value = valobj.toString();
					
					if (!value.matches(ruleDMO.getMatchesPattern())){
						DmcRuleExceptionSet ex = new DmcRuleExceptionSet();
						ex.add(new DmcRuleException(this.getRuleTitle() + "\n" + obj.toOIF(), this));
						throw(ex);
					}
				}
			}
		}

	}

}
