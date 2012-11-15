package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.AttributeDefinitionREF;
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;
import org.dmd.dms.generated.types.TypeDefinitionREF;
import org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.ReferencedAttributeTypeRuleBaseImpl;

/**
 * The ReferencedAttributeTypeRule is used to test whether or not the attribute referred
 * to by an AttributeReference is of a particular type.
 */
public class ReferencedAttributeTypeRule extends ReferencedAttributeTypeRuleBaseImpl {
	
	public ReferencedAttributeTypeRule(){
		
	}
	
	public ReferencedAttributeTypeRule(ReferencedAttributeTypeRuleDataDMO dmo){
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		// The attribute passed here will always be an AttributeDefinition reference; this
		// is enforced by rules. We just have to handle things differently for single versus
		// multi-valued attributes.
		
		if (attribute.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
			DmcTypeAttributeDefinitionREFSV refsv = (DmcTypeAttributeDefinitionREFSV) attribute;
			AttributeDefinitionREF ref = refsv.getSV();
			
			try {
				checkReferencedAttribute(obj, attribute, ref.getObjectName().getNameString());
			} catch (DmcRuleException e) {
				rc = new DmcRuleExceptionSet();
				rc.add(e);
			}
		}
		else{
			for(int i=0; i<attribute.getMVSize(); i++){
				AttributeDefinitionREF ref = (AttributeDefinitionREF) attribute.getMVnth(i);
				
				try {
					checkReferencedAttribute(obj, attribute, ref.getObjectName().getNameString());
				} catch (DmcRuleException e) {
					if (rc == null)
						rc = new DmcRuleExceptionSet();
					rc.add(e);
				}
				
			}
		}
		
		if (rc != null)
			throw(rc);
	}
	
	/**
	 * This method facilitates reuse of the basic logic for both single and multi-valued reference attributes.
	 * @param obj The object with the reference attribute.
	 * @param attribute
	 * @param attrName
	 * @throws DmcRuleException
	 */
	void checkReferencedAttribute(DmcObject obj, DmcAttribute<?> attribute, String attrName) throws DmcRuleException {
		
		// First, we try to find the definition of the attribute in question
		DmcAttributeInfo ai = DmcOmni.instance().getAttributeInfo(attrName);
		
		if (ai == null)
			throw(new DmcRuleException("Unknown attribute: " + attrName + " referred to via attribute: " + attribute.getName() + " in object: \n" + obj.toOIF(), this));
			
		if (ruleDMO.getAllowedValueType() != null){
			// Check the value type if it was specified
			if (ruleDMO.getAllowedValueType() != ai.valueType){
				throw(new DmcRuleException(this.getRuleTitle() + "\n" + "Expected valueType: " + ruleDMO.getAllowedValueType() + " but " + attrName + " has valueType: " + ai.valueType, this));
			}
		}
		
		boolean typeOkay = false;
		Iterator<TypeDefinitionREF> types = ruleDMO.getAllowedType();
		while(types.hasNext()){
			TypeDefinitionREF type = types.next();
			if (type.getObjectName().getNameString().equals(ai.type)){
				typeOkay = true;
				break;
			}
		}
		
		if (!typeOkay)
			throw(new DmcRuleException(this.getRuleTitle() + "\n" + attrName + " isn't one of the expected types, it's of type: " + ai.type, this));
		
	}

}
