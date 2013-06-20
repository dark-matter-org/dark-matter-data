package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.types.AttributeDefinitionREF;
import org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.CheckAttributesBasedOnValueRuleBaseImpl;

public class CheckAttributesBasedOnValueRule extends CheckAttributesBasedOnValueRuleBaseImpl {

	public CheckAttributesBasedOnValueRule(){
		
	}
	
	public CheckAttributesBasedOnValueRule(CheckAttributesBasedOnValueRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		DmcAttribute<?>	boa = obj.get(ruleDMO.getBasedOnAttribute().getObjectName().getNameString());
		if (boa != null){
			String value = boa.getSV().toString();
			
			if (ruleDMO.basedOnValueContains(value)){
				if (ruleDMO.getExcludeThisAttributeSize() > 0){
					Iterator<AttributeDefinitionREF> refs = ruleDMO.getExcludeThisAttributeREFs();
					while(refs.hasNext()){
						DmcAttributeInfo ai = DmcOmni.instance().getAttributeInfo(refs.next().getObjectName().getNameString());
						if (obj.get(ai) != null){
							if (rc == null)
								rc = new DmcRuleExceptionSet();
							rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nCan't have: " + ai.name, this));
						}
					}
				}
				if (ruleDMO.getIncludeThisAttributeSize() > 0){
					Iterator<AttributeDefinitionREF> refs = ruleDMO.getIncludeThisAttributeREFs();
					while(refs.hasNext()){
						DmcAttributeInfo ai = DmcOmni.instance().getAttributeInfo(refs.next().getObjectName().getNameString());
						if (obj.get(ai) == null){
							if (rc == null)
								rc = new DmcRuleExceptionSet();
							rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nMust have: " + ai.name, this));
						}
					}
					
				}
			}
		}
		
		if (rc != null)
			throw(rc);
	}

}
