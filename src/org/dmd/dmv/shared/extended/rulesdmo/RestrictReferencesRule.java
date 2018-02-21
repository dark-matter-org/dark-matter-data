package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.SourceInfo;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.ClassDefinitionREF;
import org.dmd.dmv.shared.generated.dmo.RestrictReferencesRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.RestrictReferencesRuleBaseImpl;

public class RestrictReferencesRule extends RestrictReferencesRuleBaseImpl {
	
	public RestrictReferencesRule(){
		
	}
	
	public RestrictReferencesRule(RestrictReferencesRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
				
		if (attribute.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
			DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>) attribute.getSV();
			if (!ref.isResolved())
				throw(new IllegalStateException("You must resolve objects before applying the RestrictReferencesRule"));

			DmcObject refobj = (DmcObject) ref.getObject();

			try{
				checkReferencedObject(refobj);
			} catch (DmcRuleException e) {
				rc = new DmcRuleExceptionSet();
				rc.add(e);
			}

		}
		else{
			@SuppressWarnings("unchecked")
			Iterator<DmcNamedObjectREF<?>> it = (Iterator<DmcNamedObjectREF<?>>) attribute.getMV();
			while(it.hasNext()){
				DmcNamedObjectREF<?> ref = it.next();
				if (!ref.isResolved())
					throw(new IllegalStateException("You must resolve objects before applying the RestrictReferencesRule"));
				
				DmcObject refobj = (DmcObject) ref.getObject();
				
				try{
					checkReferencedObject(refobj);
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
	 * Checks that the referenced object is one of the classes in our allowedReference set.
	 * @param referencedObj the object whose class is checked
	 * @throws DmcRuleException 
	 */
	void checkReferencedObject(DmcObject referencedObj) throws DmcRuleException {
		boolean okay = false;
		
		Iterator<ClassDefinitionREF> ait = ruleDMO.getAllowedReference();
		while(ait.hasNext()){
			ClassDefinitionREF cdref = ait.next();
			
			if (referencedObj.getConstructionClassName().equals(cdref.getClassInfo().name)){
				okay = true;
				break;
			}
		}
		
		if (!okay){
			StringBuilder sb = new StringBuilder();
			ait = ruleDMO.getAllowedReference();
			while(ait.hasNext()){
				ClassDefinitionREF cdref = ait.next();
				sb.append(cdref.getClassInfo().name);
				if (ait.hasNext())
					sb.append(", ");
			}
			
			DmcRuleException rex = new DmcRuleException(this.getRuleTitle() + 
				"\nThe " + 
				ruleDMO.getApplyToAttribute().getObjectName() +
				" attribute in " + ruleDMO.getApplyToClass() +
				" must reference objects of these class(es): " + sb.toString() +"\n" +
				"The object being referenced is of type: " + referencedObj.getConstructionClassName(), this);
			
			DmcAttribute<?> file = referencedObj.get(MetaDMSAG.__file);
			DmcAttribute<?> line = referencedObj.get(MetaDMSAG.__lineNumber);
			
			if ( (file!= null) && (line != null)){
				rex.source(new SourceInfo(file.toString(), line.toString()));
			}
			
			throw(rex);
		}
	}

}
