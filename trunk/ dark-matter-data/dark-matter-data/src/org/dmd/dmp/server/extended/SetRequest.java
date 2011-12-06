package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.SetRequestDMW;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmw.DmwWrapper;

public class SetRequest extends SetRequestDMW {

	public SetRequest(){
		super();
	}
	
	/**
	 * Constructs a new SetRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public SetRequest(SetRequestDMO obj, HttpServletRequest req) {
		super(obj);
		request = req;
	}
	
	/**
	 * This constructor assumes that the object passed as argument has an associated modifier i.e.
	 * that it is a modification recorder; the modify attribute will be set using this information.
	 * It also assumes that the object conforms to the DmcNamedObjectIF so that the target attribute
	 * of the request can be automatically set.
	 * @param obj A named object with modification recorder.
	 */
	public SetRequest(DmwWrapper obj){
		if (obj instanceof DmcNamedObjectIF)
			setTarget(((DmcNamedObjectIF)obj).getObjectName());
		else
			throw(new IllegalStateException("The object passed to SetRequest() is not a named object."));
		
		setTargetObjectClass(obj.getConstructionClass());
		
		if (obj.getModifier() == null)
			throw(new IllegalStateException("The object passed to SetRequest() does not have a modification record."));
		else
			setModify(obj.getModifier());
			
	}
	
	/**
	 * This convenience constructor can be used when handling the removal of references
	 * to a deleted object.
	 * @param referringObject A named object.
	 * @param refRemovalMod   The modification that will remove the reference to the deleted object.
	 */
	public SetRequest(DmwWrapper referringObject, DmcTypeModifierMV refRemovalMod){
		if (referringObject instanceof DmcNamedObjectIF)
			setTarget(((DmcNamedObjectIF)referringObject).getObjectName());
		else
			throw(new IllegalStateException("The object passed to SetRequest() is not a named object."));
		
		setTargetObjectClass(referringObject.getConstructionClass());
		
		if (refRemovalMod == null)
			throw(new IllegalStateException("The modification passed to SetRequest() is null."));
		else
			setModify(refRemovalMod);
			
	}
	
	/**
	 * A convenience function to set the modify attribute directly on the
	 * underlying SetRequestDMO object.
	 * @param mods
	 */
	public void setModify(DmcTypeModifierMV mods){
		try {
			getDmcObject().add(MetaDMSAG.__modify,mods);
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Setting the modify attribute directly with a DmcTypeModifierMV shouldn't thrown an exception.",e));
		}
	}
	
	/**
	 * A convenience method to directly access the modify attribute which must be
	 * passed to the DmcObject.applyModifier() method.
	 * @return The modify attribute.
	 */
	public DmcTypeModifierMV getModifyAttribute(){
		return (DmcTypeModifierMV) (getDmcObject().get(MetaDMSAG.__modify));
	}
	
	public SetResponse getResponse(){
		SetResponse response = new SetResponse();
		
		fillStandard(response);
		
		if (getTarget() != null)
			response.setTarget(getTarget());
		
		return(response);
	}
	
	@Override
	public Response getErrorResponse(){
		SetResponse response = new SetResponse();
		fillError(response);
		return(response);
	}

}
