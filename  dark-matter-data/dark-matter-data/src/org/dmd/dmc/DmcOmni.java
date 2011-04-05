package org.dmd.dmc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dms.generated.dmo.MetaASAG;

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
	
	TreeMap<Integer,DmcAttributeInfo>	idToInfo;
	
	protected DmcOmni(){
		trackBackRefs 	= false;
		idToInfo		= new TreeMap<Integer, DmcAttributeInfo>();
		
		addAttributeSchema(MetaASAG.instance());
	}
	
	static public DmcOmni instance(){
		if (omni == null)
			omni = new DmcOmni();
		return(omni);
	}
	
	/**
	 * @return true if DMO back reference tracking should be performed.
	 */
	public boolean backRefTracking(){
		return(trackBackRefs);
	}
	
	public void backRefTracking(boolean f){
		trackBackRefs = f;
	}
	
	public void addResolver(DmcNameResolverIF res){
		if (resolvers == null)
			resolvers = new ArrayList<DmcNameResolverIF>();
		
		resolvers.add(res);
	}
	
	public void addAttributeSchema(DmcAttributeSchemaIF schema){
		Iterator<DmcAttributeInfo> info = schema.getInfo();
		if (info != null){
			while(info.hasNext()){
				DmcAttributeInfo ai = info.next();
				DmcAttributeInfo existing = idToInfo.get(ai.id);
				if (existing != null){
					throw(new IllegalStateException("Clashing attriutes IDs: " + existing + "  <>  " + ai));
				}
				idToInfo.put(ai.id, ai);
			}
		}
	}
	
	/**
	 * Returns the DmcAttributeInfo associate with the ID or complains bitterly that you've
	 * forgotten to prime the DmcOmni with the generated <schema>AttributeSchemaAG related
	 * to the identifier in question. this method is usually called by base classes like
	 * DmcAttribute when it's trying to dump things in OIF format.
	 * @param id The attribute's ID.
	 * @return the attribute info for the specified ID.
	 */
	public DmcAttributeInfo getInfo(Integer id){
		DmcAttributeInfo ai = idToInfo.get(id);
		
		if (ai == null)
			System.out.println("DmcOmni.getInfo() - can't find: " + id);
//			throw(new IllegalStateException(" Failed to get DmcAttributeInfo for id: " + id + "  - ensure that you have loaded the attribute schema in DmcOmni."));
		
		return(ai);
	}
	
	/**
	 * The DmcOmni can act as a global name resolver. This method will attempt to 
	 * find the named object in any name resolvers that have been registered.
	 */
	@Override
	public DmcObject findNamedDMO(DmcObjectNameIF name) {
		DmcObject rc = null;
		for(DmcNameResolverIF res: resolvers){
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
		DmcNamedObjectIF rc = null;
		
		for(DmcNameResolverIF res: resolvers){
			DmcObject obj = res.findNamedDMO(name);
			if ( obj != null){
				rc = (DmcNamedObjectIF) obj;
				break;
			}
		}
		
		return(rc);
	}
	
	public void dumpASAG(){
		for(DmcAttributeInfo ai : idToInfo.values()){
			System.out.println(ai.toString());
		}
	
	}
	
}
