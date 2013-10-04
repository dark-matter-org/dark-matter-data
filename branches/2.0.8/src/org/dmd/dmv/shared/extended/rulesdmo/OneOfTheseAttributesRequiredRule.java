package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.types.AttributeDefinitionREF;
import org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.OneOfTheseAttributesRequiredRuleBaseImpl;

public class OneOfTheseAttributesRequiredRule extends OneOfTheseAttributesRequiredRuleBaseImpl {
	
	public OneOfTheseAttributesRequiredRule(){
		
	}
	
	public OneOfTheseAttributesRequiredRule(OneOfTheseAttributesRequiredRuleDataDMO dmo){
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj) throws DmcRuleExceptionSet {
		Iterator<AttributeDefinitionREF> possibilities = ruleDMO.getOnePossibility();
		int found = 0;
		while(possibilities.hasNext()){
			AttributeDefinitionREF attr = possibilities.next();
			if (obj.get(attr.getObjectName().getNameString()) != null)
				found++;
		}
		
		if (found == 0){
			// We haven't found any of the attributes - complain
			DmcRuleExceptionSet ex = new DmcRuleExceptionSet();
			possibilities = ruleDMO.getOnePossibility();
			
			ex.add(new DmcRuleException("The object must include at least one of these attributes: " + getPossibilities(), this));
			throw(ex);
		}
		else{
			// We've found at least one, but check if we only want one.
			if (ruleDMO.isAndOnlyOne() && (found>1)){
				DmcRuleExceptionSet ex = new DmcRuleExceptionSet();
				possibilities = ruleDMO.getOnePossibility();
				
				ex.add(new DmcRuleException("The object must include only one of these attributes: " + getPossibilities(), this));
				throw(ex);
			}
		}
	}

	private String getPossibilities(){
		StringBuffer sb = new StringBuffer();
		Iterator<AttributeDefinitionREF> possibilities = ruleDMO.getOnePossibility();
		while(possibilities.hasNext()){
			sb.append(possibilities.next().getObjectName().getNameString());
			if (possibilities.hasNext())
				sb.append(", ");
		}
		
		return(sb.toString());
	}

}
