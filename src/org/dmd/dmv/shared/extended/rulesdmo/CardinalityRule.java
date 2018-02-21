package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmv.shared.generated.dmo.CardinalityRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.CardinalityRuleBaseImpl;

public class CardinalityRule extends CardinalityRuleBaseImpl {

	public CardinalityRule() {
		
	}
	
	public CardinalityRule(CardinalityRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		if (ruleDMO.getCrMinimum() == null){
			// We only have the maximum value
			
			if (attribute.getMVSize() > ruleDMO.getCrMaximum()){
				rc = new DmcRuleExceptionSet();
				rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nThe " + attribute.getName() + " attribute has more than " + ruleDMO.getCrMaximum() + " values\n\nIn object:\n" + obj.toOIF(), this));
				throw(rc);
			}
			return;
		}
		
		if (ruleDMO.getCrMaximum() == null){
			// We only have the minimum value
			
			if (attribute.getMVSize() < ruleDMO.getCrMinimum()){
				rc = new DmcRuleExceptionSet();
				rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nThe " + attribute.getName() + " attribute has less than " + ruleDMO.getCrMinimum() + " values\n\nIn object:\n" + obj.toOIF(), this));
				throw(rc);
			}

			return;
		}
		
		// If we get to here, we have both minimum and maximum
		
		if ((attribute.getMVSize() < ruleDMO.getCrMinimum()) || (attribute.getMVSize() > ruleDMO.getCrMaximum())){
			rc = new DmcRuleExceptionSet();
			rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nThe " + attribute.getName() + " attribute must have cardinality " + ruleDMO.getCrMinimum() + "-" + ruleDMO.getCrMaximum() + "\n\nIn object:\n" + obj.toOIF(), this));
		}

		if (rc != null)
			throw(rc);

	}

}
