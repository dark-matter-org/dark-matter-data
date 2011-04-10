//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.dmo.MetaASAG;
import org.dmd.dms.generated.types.DmcTypeModifierMV;

/**
 * The DmcOmni (short for omnipresent) provides a single point of access to information
 * and settings that is useful in the operational environment of Dark Matter Objects.
 */
public class DmcOmni implements DmcNameResolverIF {

	// Our singleton handle
	protected static DmcOmni 			omni;
	
	// Indicates if we want to track back references at the DMO level
	boolean								trackBackRefs;
	
	// Indicates if we're supported lazy resolution of object references
	boolean								lazyResolution;
	
	// While doing lazy resolution, if we are unable to find an object, this
	// option tells us what to do. If it's true, we will toast the object 
	// reference, thus "healing" the broken link. If you've provided a logger,
	// the dead reference will be logged.
	boolean								cleanUpDeadRefs;
	
	// The logger through which various log messages can be sent
	DmcLoggerIF							logger;
	
	// The set of things that can resolve object names for us. This allows for
	// lazy resolution of object references at the DMO level.
	ArrayList<DmcNameResolverIF>		resolvers;
	
	// The map where we store dmdID to DmcAttributeInfo for all Attribute
	// Schemas (ASAGs) that have been loaded
	TreeMap<Integer,DmcAttributeInfo>	idToInfo;
	
	// The cache that will be notified of required reference modifications
	// when an object with backrefs is deleted. This is only used if backref
	// tracking is enabled.
	DmcCacheIF							cache;
	
	/**
	 * Protected constructor called when the omni singleton is required.
	 */
	protected DmcOmni(){
		init();
	}
	
	/**
	 * Resets the DmcOmni to its initial state.
	 */
	public void reset(){
		init();
	}
	
	/**
	 * Initailizes our values.
	 */
	void init(){
		trackBackRefs 	= false;
		lazyResolution	= false;
		cleanUpDeadRefs	= false;
		logger			= null;
		resolvers		= null;
		idToInfo		= new TreeMap<Integer, DmcAttributeInfo>();
		cache			= null;
		
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
	
	/**
	 * Turns backref tracking on/off.
	 * @param f set to true to turn it on.
	 */
	public void backRefTracking(boolean f){
		trackBackRefs = f;
	}
	
	/**
	 * @return true if lazy resolution is turned on.
	 */
	public boolean lazyResolution(){
		return(lazyResolution);
	}
	
	/**
	 * Turns lazy resolution on/off.
	 * @param f set to true to turn it on.
	 */
	public void lazyResolution(boolean f){
		lazyResolution = f;
	}
	
	/**
	 * @return true if clean up of dead references is turned on.
	 */
	public boolean cleanUpDeadRefs(){
		return(cleanUpDeadRefs);
	}
	
	/**
	 * Turns clean up of dead references on/off.
	 * @param f set to true to turn it on.
	 */
	public void cleanUpDeadRefs(boolean f){
		cleanUpDeadRefs = f;
	}
	
	/**
	 * @return the logger if it has been set.
	 */
	public DmcLoggerIF logger(){
		return(logger);
	}
	
	/**
	 * Sets the logger.
	 * @param l the logger.
	 */
	public void logger(DmcLoggerIF l){
		logger = l;
	}
	
	/**
	 * This method is called from DmcTypeNamedObjectREF when it is unable to resolve a reference.
	 * @param referrer The object that had the reference.
	 * @param viaAttribute The object reference attribute.
	 * @param referenceTo The name that couldn't be resolved.
	 */
	public void logDeadReference(DmcObject referrer, DmcAttribute<?> viaAttribute, DmcObjectNameIF referenceTo){
		if (logger != null){
			logger.logDeadReference(referrer, viaAttribute, referenceTo);
		}
	}
	
	/**
	 * Adds a name resolver. Any number of resolvers may be added. When resolving a name, the
	 * resolvers will be consulted in the order in which they were added. Name resolution stops
	 * after the first positive name resolution, meaning that your name resolvers should have
	 * mutually exclusive name spaces.
	 * @param res The name resolver.
	 */
	public void addResolver(DmcNameResolverIF res){
		if (resolvers == null)
			resolvers = new ArrayList<DmcNameResolverIF>();
		
		resolvers.add(res);
	}
	
	/**
	 * Attribute Schema Auto Generated (ASAGs) are generated by the DMO Generator utility and
	 * placed in the generated/dmo folder. ASAGs contain a mapping from Dark Matter Data IDs (dmdID)
	 * to the attributes they identify). Since dmdIDs are the only things stored at the DmcAttribute
	 * level, we have to be able to access the DmcAttributeInfo when it is lost in whatever
	 * communication mechanism is being used between client/server, browser/servlet etc. The DmcOmni
	 * provides access to these mappings.
	 * @param schema
	 */
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
	 * Sets the implementor of the DmcCacheIF that will be notified when objects with backrefs
	 * are deleted.
	 * @param c The cache.
	 */
	public void setCacheIF(DmcCacheIF c){
		cache = c;
	}
	
	public void removeReferences(DmcTypeModifierMV mods){
		// NOTE: all of the backref modifiers are stored in modifier that gets passed in, however
		// each Modifier is for a different object (potentially). We have to apply each Modifier
		// as a single operation, thus we create a new DmcTypeModifierMV and add the single Modifier
		// to it. We don;t attempt to reuse the same modifier because these may be used in events.
		Iterator<Modifier> it = mods.getMV();
		while(it.hasNext()){
			DmcTypeModifierMV single = new DmcTypeModifierMV();
			Modifier mod = it.next();
			try {
				// Add the Modifier to our temporary 
				single.add(mod);
				
				if (cache == null)
					((DmcObject)mod.getReferringObject()).applyModifier(single);
				else
					cache.applyModification(mod.getReferringObject(), single);
				
			} catch (DmcValueException e) {
				throw(new IllegalStateException("Adding a prebuilt Modifier to a DmcTypeModifierMV shouldn't thrown an exception."));
			} catch (DmcValueExceptionSet e) {
				throw(new IllegalStateException("Removing a back reference shouldn't thrown an exception."));
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
	
	/**
	 * This method displays the currently loaded attribute schemas in dmdID order.
	 */
	public void dumpASAG(){
		for(DmcAttributeInfo ai : idToInfo.values()){
			System.out.println(ai.toString());
		}
	
	}
	
}
