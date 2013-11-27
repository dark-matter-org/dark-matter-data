package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.SourceInfo;
import org.dmd.dms.generated.dmo.DSDefinitionDMO;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.AttributeDefinitionREF;
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;
import org.dmd.dms.generated.types.TypeDefinitionREF;
import org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.ReferencedAttributeTypeRuleBaseImpl;

/**
 * The ReferencedAttributeTypeRule is used to test whether or not the attribute referred
 * to by an AttributeReference is of a particular type. This works single-valued and multi-valued
 * attributes.
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
				checkReferencedAttribute(obj, attribute, ref);
			} catch (DmcRuleException e) {
				rc = new DmcRuleExceptionSet();
				rc.add(e);
			}
		}
		else{
			for(int i=0; i<attribute.getMVSize(); i++){
				AttributeDefinitionREF ref = (AttributeDefinitionREF) attribute.getMVnth(i);
				
				try {
					checkReferencedAttribute(obj, attribute, ref);
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
	 * @param ref the attribute reference
	 * @throws DmcRuleException
	 */
	void checkReferencedAttribute(DmcObject obj, DmcAttribute<?> attribute, AttributeDefinitionREF ref) throws DmcRuleException {
		
		// This might get called when the object hasn't been resolved, so just return. This is a bit of hack
		// until we figure out an elegant way to handle schema loading and sequencing things like object resolution
		// and rule checking.
		//
		// Originally, this rule was using the DmcOmni, but that was unreliable because there was no guarantee that
		// the object we were looking for was already loaded in the DmcOmni. 
		if (ref.getObject() == null)
			return;
		
		if (ruleDMO.getAllowedValueType() != null){
			// Check the value type if it was specified
			if (ruleDMO.getAllowedValueType() != ref.getObject().getValueType()){
				DmcRuleException rex = new DmcRuleException(this.getRuleTitle() + "\n" + "Expected valueType: " + ruleDMO.getAllowedValueType() + " but " + ref.getObjectName() + " has valueType: " + ref.getObject().getValueType(), this);
				if (obj instanceof DSDefinitionDMO){
					DSDefinitionDMO def = (DSDefinitionDMO) obj;
					rex.source(new SourceInfo(def.getFile(), def.getLineNumber() + ""));
					
				}
				throw(rex);
			}
		}
		
		if (ruleDMO.getAllowedTypeSize() > 0){
			boolean typeOkay = false;
			Iterator<TypeDefinitionREF> types = ruleDMO.getAllowedType();
			while(types.hasNext()){
				TypeDefinitionREF type = types.next();
				if (type.getObjectName().getNameString().equals(ref.getObject().getValueType())){
					typeOkay = true;
					break;
				}
			}
			
			if (!typeOkay){
				DmcRuleException rex = new DmcRuleException(this.getRuleTitle() + "\n" + ref.getObjectName() + " isn't one of the expected types, it's of type: " + ref.getObject().getValueType(), this);
				if (obj instanceof DSDefinitionDMO){
					DSDefinitionDMO def = (DSDefinitionDMO) obj;
					rex.source(new SourceInfo(def.getFile(), def.getLineNumber() + ""));
				}
				throw(rex);
			}
		}
		
	}

}
