package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.dmo.ComplexTypeDefinitionDMO;
import org.dmd.dms.generated.types.Part;
import org.dmd.dmv.shared.generated.dmo.PartCheckerRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.PartCheckerRuleBaseImpl;

public class PartCheckerRule extends PartCheckerRuleBaseImpl {
	
	public PartCheckerRule(){
		
	}

	public PartCheckerRule(PartCheckerRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj) throws DmcRuleExceptionSet {
		ComplexTypeDefinitionDMO dmo = (ComplexTypeDefinitionDMO) obj;
		
//		System.err.println("PartCheckerRule applied to " + dmo.getName() + "\n");
		DmcRuleExceptionSet ex = null;
		
		Iterator<Part> optparts = dmo.getOptionalPart();
		Iterator<Part> reqparts = dmo.getRequiredPart();
		boolean multiValued = false;
		int		reqCount = 0;
		
		if (reqparts != null){
			// Check that the greedy flag is only specified on the last required part of
			// a type composed of only required parts
			while(reqparts.hasNext()){
				Part reqpart = reqparts.next();
				
				reqCount++;
				
				// Hang on to this so that we know if we need further checking
				if ((reqpart.getMultivalued() != null) && (reqpart.getMultivalued()))
					multiValued = true;
				
				if ( (reqpart.getGreedy() != null) && reqpart.getGreedy()){
					if (optparts != null){
						if (ex == null)
							ex = new DmcRuleExceptionSet();
						ex.add(new DmcRuleException("The greedy flag can only be used on a ComplexTypeDefinition without optionalParts", this));
					}
					if (reqparts.hasNext()){
						if (ex == null)
							ex = new DmcRuleExceptionSet();
						ex.add(new DmcRuleException("The greedy flag can only be specified on the final requiredPart in a ComplexTypeDefinition", this));
					}
				}
			}
			
			if (multiValued){
				// You can only use multi-valued on a single required part
				if (reqCount != 1){
					if (ex == null)
						ex = new DmcRuleExceptionSet();
					ex.add(new DmcRuleException("The multivalued flag can only be specified on a requiredPart if it's the only part in a ComplexTypeDefinition", this));
				}
				
				reqparts = dmo.getRequiredPart();
				Part reqpart = reqparts.next();
				
				if ((reqpart.getGreedy() != null) && (reqpart.getGreedy())){
					if (ex == null)
						ex = new DmcRuleExceptionSet();
					ex.add(new DmcRuleException("The greedy flag can't be used with the multivalued flag on a single requiredPart in a ComplexTypeDefinition", this));
				}
				
			}

		}
		if (ex != null)
			throw(ex);

	}

}
