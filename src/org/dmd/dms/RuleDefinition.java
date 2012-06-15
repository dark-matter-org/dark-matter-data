package org.dmd.dms;

import org.dmd.dms.generated.dmo.RuleDefinitionDMO;
import org.dmd.dms.generated.dmw.RuleDefinitionDMW;

public class RuleDefinition extends RuleDefinitionDMW {

	public RuleDefinition(){
		super(new RuleDefinitionDMO(), MetaSchemaAG._RuleDefinition);
		
	}
}
