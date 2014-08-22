package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.types.AttributeDefinitionREF;
import org.dmd.dmv.shared.generated.dmo.OnlyOneOfTheseAttributesAllowedRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.OnlyOneOfTheseAttributesAllowedRuleBaseImpl;

public class OnlyOneOfTheseAttributesAllowedRule extends OnlyOneOfTheseAttributesAllowedRuleBaseImpl {
	
	public OnlyOneOfTheseAttributesAllowedRule(){
		
	}
	
	public OnlyOneOfTheseAttributesAllowedRule(OnlyOneOfTheseAttributesAllowedRuleDataDMO dmo){
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
		
		if (found > 1){
			// We found more than one of the attributes
			DmcRuleExceptionSet ex = new DmcRuleExceptionSet();
			
			ex.add(new DmcRuleException("The object must include only one of these possible attributes: " + getPossibilities(), this));
			throw(ex);
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
