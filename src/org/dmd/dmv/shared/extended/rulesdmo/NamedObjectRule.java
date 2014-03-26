package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.types.AttributeDefinitionREF;
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFMV;
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;
import org.dmd.dmv.shared.generated.dmo.NamedObjectRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.NamedObjectRuleBaseImpl;

public class NamedObjectRule extends NamedObjectRuleBaseImpl {
	
	public NamedObjectRule(){
		
	}
	
	public NamedObjectRule(NamedObjectRuleDataDMO dmo){
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj) throws DmcRuleExceptionSet {
		if (obj.get(MetaDMSAG.__isNamedBy) != null){
			DmcRuleExceptionSet rc = null;
			DmcTypeAttributeDefinitionREFSV ref = (DmcTypeAttributeDefinitionREFSV) obj.get(MetaDMSAG.__isNamedBy);
			AttributeDefinitionREF referredTo = ref.getSV();
			
			if (obj.get(MetaDMSAG.__must) == null){
				rc = new DmcRuleExceptionSet();
				rc.add(new DmcRuleException("You must specify the " + referredTo.getObjectName().getNameString() + " attribute as a must have attribute.", this));
			}
			else{
				DmcTypeAttributeDefinitionREFMV must = (DmcTypeAttributeDefinitionREFMV) obj.get(MetaDMSAG.__must);
				boolean haveIt = false;
				for(int i=0; i<must.getMVSize(); i++){
					AttributeDefinitionREF attr = must.getMVnth(i);
					if (attr.getObjectName().getNameString().equals(referredTo.getObjectName().getNameString())){
						haveIt = true;
						break;
					}
				}
				if (!haveIt){
					rc = new DmcRuleExceptionSet();
					rc.add(new DmcRuleException("You must specify the " + referredTo.getObjectName().getNameString() + " attribute as a must have attribute.", this));
				}
			}
			
			if (rc != null)
				throw(rc);
		}

	}

}
