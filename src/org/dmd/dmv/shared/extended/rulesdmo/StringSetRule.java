package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmv.shared.generated.dmo.StringSetRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.StringSetRuleBaseImpl;

public class StringSetRule extends StringSetRuleBaseImpl {
	
	public StringSetRule() {
		
	}

	public StringSetRule(StringSetRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		// Note: we're guaranteed that the attribute is of type String because of of the rule
		// that enforces the fact
		if (attribute.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
			try{
				checkValue((String) attribute.getSV());
			}
			catch(DmcRuleException ex){
				if (rc == null)
					rc = new DmcRuleExceptionSet();
				rc.add(ex);				
			}
			
		}
		else{
			@SuppressWarnings("unchecked")
			Iterator<String> it = (Iterator<String>) attribute.getMV();
			while(it.hasNext()){
				try{
					checkValue(it.next());
				}
				catch(DmcRuleException ex){
					if (rc == null)
						rc = new DmcRuleExceptionSet();
					rc.add(ex);				
				}
				
			}
			
		}

		if (rc != null)
			throw(rc);
	}

	void checkValue(String value) throws DmcRuleException {
		DmcRuleException rex = null;
		
		if (!super.ruleDMO.allowedStringContains(value)){
			if (ruleDMO.getApplyToClass() == null){
				// No class, so this is a global attribute rule
				rex = new DmcRuleException(this.getRuleTitle() + "\nThis is not an allowable value for the " +
						ruleDMO.getApplyToAttribute().getObjectName() + " attribute: " + 
						value, this);
			}
			else{
				rex = new DmcRuleException(this.getRuleTitle() + "\nThis is not an allowable value for the " +
						ruleDMO.getApplyToAttribute().getObjectName() + " attribute in the" +
						ruleDMO.getApplyToClass() + " class: " +
						value, this);
			}
		}
		
		if (rex != null)
			throw(rex);
	}
}
