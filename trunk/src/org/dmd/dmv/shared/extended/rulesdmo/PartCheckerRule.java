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
		if (reqparts != null){
			while(reqparts.hasNext()){
				Part reqpart = reqparts.next();
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
		}
		if (ex != null)
			throw(ex);

	}

}
