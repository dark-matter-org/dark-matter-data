package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.ValueLengthRuleBaseImpl;

/**
 * The ValueLengthRule validates whether or not the length of the string format of
 * an attribute value conforms to the minimum/maximum lengths specified by the 
 * rule data. Either one or both of minimum/maximum length may be specified.
 */
public class ValueLengthRule extends ValueLengthRuleBaseImpl {
	
	public ValueLengthRule(){
		super();
	}
	
	public ValueLengthRule(ValueLengthRuleDataDMO dmo){
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		if ( (ruleDMO.getMinLength() != null) && (ruleDMO.getMaxLength() != null)){
			// We have both maximum and minimum
			int max = ruleDMO.getMaxLength();
			int min = ruleDMO.getMinLength();
			if (attribute.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
				
			}
			else{
				Iterator<?> it = attribute.getMV();
				while(it.hasNext()){
					Object value = it.next();
					try {
						checkMinimum(min, value.toString());
						checkMaximum(max, value.toString());
					} catch (DmcRuleException e) {
						if (rc == null)
							rc = new DmcRuleExceptionSet();
						rc.add(e);
					}
				}
			}
		}
		else if (ruleDMO.getMinLength() != null){
			// We're just checking the minimum length
		}
		else{
			// We're just checking the maximum
		}
		
		if (rc != null)
			throw(rc);
	}
	
	void checkMinimum(int length, String value) throws DmcRuleException {
		
	}

	void checkMaximum(int length, String value) throws DmcRuleException {
		
	}

}
