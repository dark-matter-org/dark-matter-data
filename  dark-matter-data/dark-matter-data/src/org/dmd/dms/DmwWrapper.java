package org.dmd.dms;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;
import org.dmd.dms.generated.dmo.DmwWrapperDMO;
import org.dmd.dms.generated.dmw.DmwWrapperDMW;
import org.dmd.dms.generated.types.ClassDefinitionREF;
import org.dmd.util.exceptions.DebugInfo;

public class DmwWrapper extends DmwWrapperDMW {

	/**
	 * Constructs a new DmsDefinition for use with the meta schema.
	 */
	protected DmwWrapper(DmcObject obj){
		super(obj);
	}
	
	protected DmwWrapper(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
//		try {
			if (cd != null){
				// Now that the objectClass is stored in the DmcObject as a DmcTypeClassDefinitionREF, we
				// just "resolve" the reference to point to this ClassDefinition
				DmwWrapperDMO dmo = (DmwWrapperDMO) obj;
				Iterator<ClassDefinitionREF> ocl = dmo.getObjectClass();
				if (ocl != null){
					ClassDefinitionREF cdr = ocl.next();
					if (cdr != null){
						cdr.setObject((ClassDefinitionDMO) cd.getDmcObject());
					}
				}
				
//				addObjectClass(cd);
			}
//		} catch (DmcValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

  /**
  * Adds the specified auxiliary class to the object.
  * @param cd The auxiliary class definition.
  * @throws DmcValueException  
  */
 public void addAux(ClassDefinition cd) throws DmcValueException {
	 addObjectClass(cd);
// 	if (!objectClass.contains(cd)){
// 		objectClass.add(cd);
// 		
// 		core.addAux(cd.getName());
// 	}
 }
 
 /**
  * Removes the specified auxiliary class from the object.
  * @param cd The auxiliary class definition.
  */
 public void removeAux(ClassDefinition cd){
	 
// 	objectClass.remove(cd);
// 	core.removeAux(cd.getName());
 }
 
 /**
  * Determines if the specified class is in our objectClass list.
  * @param cd The class definition.
  * @return true if the definition is there.
  */
 @SuppressWarnings("unchecked")
public boolean hasAux(ClassDefinition cd){
	 boolean rc = false;
	 DmcAttribute attr = core.get(DmwWrapperDMO.__objectClass);
	 
	 if (attr == null){
		 DebugInfo.debug("HACK HACK HACK");
		 return(core.hasAux(cd.getName()));
	 }
	 else{
		 if (attr.contains(cd.getName()))
			 rc = true;
	 }
	 
	 return(rc);
 }

}
