package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.RelatedNumbersRuleBaseImpl;
import org.dmd.util.exceptions.DebugInfo;

/**
 * On the surface, this seems like a pretty trivial rule, but things get interesting
 * when you consider that we want to be able to handle comparisons between all different
 * numeric types. For simplicity, we do all comparisons using Double, but we can get into
 * difficulty when we get near the boundaries, so beware!
 * http://en.wikipedia.org/wiki/Strictfp
 * http://stackoverflow.com/questions/4349155/ieee-754-double-64-bit-floating-point-vs-long-64-bit-integer-revisited
 * 
 */
public class RelatedNumbersRule extends RelatedNumbersRuleBaseImpl {

	public RelatedNumbersRule(){
		
	}
	
	public RelatedNumbersRule(RelatedNumbersRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj) throws DmcRuleExceptionSet {
		DmcAttribute<?> lhs = obj.get(ruleDMO.getLhs().getObjectName().getNameString());
		DmcAttribute<?> rhs = obj.get(ruleDMO.getRhs().getObjectName().getNameString());
		
		// In some cases we may be applying this rule in situations where one of the attributes
		// is there and the other one isn't - in this case, don't continue with the comparison.
		// For example, see the CardinalityRule where there must be a relationship between 
		// crMinimum and crMaximum, but only if they both exist.
		if ( (lhs == null) || (rhs == null))
			return;
		
		if ( (lhs != null) && (rhs != null)){
			Double 	lv 		= null;
			Double 	rv 		= null;
			
			if (lhs.getSV() instanceof Double)
				lv = (Double) lhs.getSV();
			else if (lhs.getSV() instanceof Integer)
				lv = ((Integer)lhs.getSV()).doubleValue();
			else
				throw(new IllegalStateException("RelatedNumbersRule accepts only Double compatible values or Integer, not: " + lhs.getSV().getClass().getName()));
			
			if (rhs.getSV() instanceof Double)
				rv = (Double) rhs.getSV();
			else if (rhs.getSV() instanceof Integer)
				rv = ((Integer)rhs.getSV()).doubleValue();
			else
				throw(new IllegalStateException("RelatedNumbersRule accepts only Double compatible values or Integer, not: " + lhs.getSV().getClass().getName()));
			
			boolean	okay 	= false;
			
			// We have both values, test the relationship
			switch(ruleDMO.getNumericRelation()){
			case EQUALS:
				if (lv == rv)
					okay = true;
				break;
			case GT:
				if (lv > rv)
					okay = true;
				break;
			case GTE:
				if (lv >= rv)
					okay = true;
				break;
			case LT:
				if (lv < rv)
					okay = true;
				break;
			case LTE:
				if (lv <= rv)
					okay = true;
				break;
			case NE:
				if (lv != rv)
					okay = true;
				break;
			}
			
			if (!okay){
				DmcRuleExceptionSet ex = new DmcRuleExceptionSet();
				ex.add(new DmcRuleException(this.getRuleTitle(), this));
				throw(ex);
			}
		}
	} 

}
