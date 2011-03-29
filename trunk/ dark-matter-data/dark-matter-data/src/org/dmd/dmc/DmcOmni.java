package org.dmd.dmc;

import java.util.ArrayList;

/**
 * The DmcOmni (short for omnipresent) provides a single point of access to information
 * and settings that is useful in the operational environment of Dark Matter Objects.
 */
public class DmcOmni implements DmcNameResolverIF {

	protected static DmcOmni omni;
	
	// Indicates if we want to track back references at the DMO level
	boolean							trackBackRefs;
	
	// The set of things that can resolve object names for us. This allows for
	// lazy resolution of object references at the DMO level.
	ArrayList<DmcNameResolverIF>	resolvers;
	
	protected DmcOmni(){
		omni 			= this;
		trackBackRefs 	= false;
	}
	
	static public DmcOmni instance(){
		if (omni == null)
			new DmcOmni();
		return(omni);
	}
	
	/**
	 * @return true if DMO back reference tracking should be performed.
	 */
	public boolean backRefTracking(){
		return(omni.trackBackRefs);
	}
	
	public void backRefTracking(boolean f){
		omni.trackBackRefs = f;
	}
	
	public void addResolver(DmcNameResolverIF res){
		if (omni.resolvers == null)
			omni.resolvers = new ArrayList<DmcNameResolverIF>();
		
		omni.resolvers.add(res);
	}
	
	/**
	 * The DmcOmni can act as a global name resolver. This method will attempt to 
	 * find the named object in any name resolvers that have been registered.
	 */
	@Override
	public DmcObject findNamedDMO(DmcObjectNameIF name) {
		if (omni == null)
			return null;
		
		DmcObject rc = null;
		for(DmcNameResolverIF res: omni.resolvers){
			if ( (rc = res.findNamedDMO(name)) != null)
				break;
		}
		
		return(rc);
	}

	/**
	 * The DmcOmni can act as a global name resolver. This method will attempt to 
	 * find the named object in any name resolvers that have been registered.
	 */
	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectNameIF name) {
		if (omni == null)
			return null;
		
		DmcNamedObjectIF rc = null;
		
		for(DmcNameResolverIF res: omni.resolvers){
			DmcObject obj = res.findNamedDMO(name);
			if ( obj != null){
				rc = (DmcNamedObjectIF) obj;
				break;
			}
		}
		
		return(rc);
	}
	
	
	
}
