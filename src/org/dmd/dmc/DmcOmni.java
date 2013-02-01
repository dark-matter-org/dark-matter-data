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

import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.RuleTracerIF;
import org.dmd.dmc.types.DmcTypeDmcObjectName;
import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.dmo.MetaDMSAG;
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
	
	// Indicates if we're supported automatic resolution of object references
	// based on the application of modifiers
	boolean								autoResolution;
	
	// While doing lazy resolution, if we are unable to find an object, this
	// option tells us what to do. If it's true, we will toast the object 
	// reference, thus "healing" the broken link. If you've provided a logger,
	// the dead reference will be logged.
	boolean								cleanUpDeadRefs;
	
	// Normally, we don't track schema references because we don't always
	// have the schema objects available. However, for certain tools/utilities,
	// such as the documentation tools, we want to turn this tracking on.
	boolean								trackSchemaReferences;
	
	// The logger through which various log messages can be sent
	DmcLoggerIF							logger;
	
	// Indicates if we want to tracker the execution of rules
	boolean								traceRules;
	
	// You can specify a component to handle rule tracing information
	RuleTracerIF						ruleTracer;
	
	// The set of things that can resolve object names for us. This allows for
	// lazy resolution of object references at the DMO level.
	ArrayList<DmcNameResolverIF>		resolvers;
	
	// The map where we store dmdID to DmcClassInfo for all Dark Matter Schema
	// (DMSAGs) that have been loaded
	TreeMap<Integer,DmcClassInfo>		idToClass;
	
	TreeMap<String,DmcClassInfo>		stringToClass;
	
	// The map where we store dmdID to DmcAttributeInfo for all Dark Matter Schema
	// (DMSAGs) that have been loaded
	TreeMap<Integer,DmcAttributeInfo>	idToAttr;
	
	TreeMap<String,DmcAttributeInfo>	stringToAttribute;
	
	// A map of the name builders for each naming type. The key is the name of
	// of the type e.g. StringName, DotName etc. For any DmcObjectName instance,
	// we can getNameClass() which should be in this map. From there, we can 
	// ask the name builder to create an appropriate DmcTypeDmcObjectName to
	// to wrap the type i.e. associate its designatedNameAttribute with it.
	TreeMap<String,DmcNameBuilderIF>	nameBuilders;
	
	// A map of the filter builders for each naming type. The key is the name of
	// of the type e.g. ClassFilter, NameFilter etc. For any DmcFilter instance,
	// we can getFilterClass() which should be in this map. From there, we can 
	// ask the filter builder to create an appropriate DmcTypeDmcFilter to
	// to wrap the type i.e. associate its designatedFilterAttribute with it.
	TreeMap<String,DmcFilterBuilderIF>	filterBuilders;
	
	// The cache that will be notified of required reference modifications
	// when an object with backrefs is deleted. This is only used if backref
	// tracking is enabled.
	DmcCacheIF							cache;
	
	// Named "slices" that can be used to retrieve a subset of attributes from
	// an object. 
	TreeMap<String,DmcSliceInfo>		slices;
	
	// The set of recoginized types, either directly defined via type definitions
	// of internally created.
	TreeMap<String,DmcTypeInfo>			types;
	
//	TreeMap<String,DmcAttributeSchemaIF>	loadedSchemas;
	
	TreeMap<String,DmcCompactSchemaIF>	loadedCompactSchemas;
	
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
	 * Initializes our values.
	 */
	void init(){
		trackBackRefs 			= false;
		lazyResolution			= false;
		autoResolution			= false;
		cleanUpDeadRefs			= false;
		trackSchemaReferences	= false;
		logger					= null;
		traceRules				= false;
		ruleTracer				= null;
		resolvers				= null;
		idToClass				= new TreeMap<Integer, DmcClassInfo>();
		stringToClass			= new TreeMap<String, DmcClassInfo>();
		idToAttr				= new TreeMap<Integer, DmcAttributeInfo>();
		stringToAttribute		= new TreeMap<String, DmcAttributeInfo>();
		nameBuilders			= new TreeMap<String, DmcNameBuilderIF>();
		filterBuilders			= new TreeMap<String, DmcFilterBuilderIF>();
		slices					= new TreeMap<String, DmcSliceInfo>();
		types					= new TreeMap<String, DmcTypeInfo>();
		cache					= null;
//		loadedSchemas			= new TreeMap<String, DmcAttributeSchemaIF>();
		loadedCompactSchemas	= new TreeMap<String, DmcCompactSchemaIF>();
		
//		addAttributeSchema(MetaASAG.instance());
		addCompactSchema(MetaDMSAG.instance());
	}
	
	static public synchronized DmcOmni instance(){
		if (omni == null)
			omni = new DmcOmni();
		
		return(omni);
	}
	
	/**
	 * This method should be used with caution! Generally, we don't attempt to perform
	 * back reference tracking on schema related references, but, in certain tools/utilities,
	 * we make use of this functionality. 
	 * @param f Set to true if we want perform back reference tracking on schema related objects.
	 */
	public void setTrackSchemaReferences(boolean f){
		trackSchemaReferences = f;
	}
	
	/**
	 * This method is called from the DmcObject to determine whether or not are
	 * particular attribute should have its reference tracked.
	 * @param attributeID
	 * @return true if we want to reference track the attribute.
	 */
	public boolean trackThisAttribute(int attributeID){
		// If trackSchemaReferences is turned on, we will track all attributes
		if (trackSchemaReferences)
			return(true);
		// If trackSchemaReferences is turned off (the default), we will only
		// attempt back reference tracking if the attribute ID is beyond the
		// maximum ID of the meta schema.
		else if (attributeID > MetaDMSAG.instance().getSchemaMaxID())
			return(true);
		return(false);
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
	 * @return true if auto resolution is turned on.
	 */
	public boolean autoResolution(){
		return(autoResolution);
	}
	
	/**
	 * Turns auto resolution on/off.
	 * @param f set to true to turn it on.
	 */
	public void autoResolution(boolean f){
		autoResolution = f;
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
	public void logDeadReference(DmcObject referrer, DmcAttribute<?> viaAttribute, DmcObjectName referenceTo){
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
		if (res == null)
			throw(new IllegalStateException("Name resolver is null! Did you forget to initialize it?"));
		
		if (resolvers == null)
			resolvers = new ArrayList<DmcNameResolverIF>();
		
		resolvers.add(res);
	}
	
	/**
	 * Dark Matter Schema Auto Generated (DMSAGs) are generated by the DMO Generator utility and
	 * placed in the generated/dmo folder. DMSAGs contain a mapping from Dark Matter Data IDs (dmdID)
	 * to the attributes/classes they identify). Since dmdIDs are the only things stored at the DmcAttribute
	 * level, we have to be able to access the DmcAttributeInfo when it is lost in whatever
	 * communication mechanism is being used between client/server, browser/servlet etc. The DmcOmni
	 * provides access to these mappings.
	 * @param schema
	 */
	public void addCompactSchema(DmcCompactSchemaIF schema){
		
//DebugInfo.debug("Loading compact schema: " + schema.getSchemaName());
		// If we already have the schema, return
		if (loadedCompactSchemas.get(schema.getSchemaName()) != null)
			return;
		
		Iterator<DmcAttributeInfo> info = schema.getAttributeInfo();
		if (info != null){
			while(info.hasNext()){
				DmcAttributeInfo ai = info.next();
				DmcAttributeInfo existing = idToAttr.get(ai.id);
				if (existing != null)
					throw(new IllegalStateException("Clashing attribute IDs: " + existing + "  <>  " + ai));
				
				idToAttr.put(ai.id, ai);
				
				existing = stringToAttribute.get(ai.name);
				if (existing != null)
					throw(new IllegalStateException("Clashing attribute names: " + existing + "  <>  " + ai));
				stringToAttribute.put(ai.name, ai);
			}
		}
		
		Iterator<DmcClassInfo> cinfo = schema.getClassInfo();
		if (cinfo != null){
			while(cinfo.hasNext()){
				DmcClassInfo ci = cinfo.next();
				
//DebugInfo.debug(ci.toString());				
				DmcClassInfo existing = idToClass.get(ci.id);
				if (existing != null){
					throw(new IllegalStateException("Clashing class IDs: " + existing + "  <>  " + ci));
				}
				idToClass.put(ci.id, ci);
				
				existing = stringToClass.get(ci.name);
				if (existing != null){
					throw(new IllegalStateException("Clashing class names: " + existing + "  <>  " + ci));
				}
				stringToClass.put(ci.name, ci);
				
				if (ci.derivedFrom != null){
					ci.derivedFrom.addDerivedClass(ci);
				}
			}
		}
		
		Iterator<DmcNameBuilderIF> nbuilders = schema.getNameBuilders();
		if (nbuilders != null){
			while(nbuilders.hasNext()){
				DmcNameBuilderIF builder = nbuilders.next();
				nameBuilders.put(builder.getNameClass(), builder);
			}
		}
		
		Iterator<DmcFilterBuilderIF> fbuilders = schema.getFilterBuilders();
		if (fbuilders != null){
			while(fbuilders.hasNext()){
				DmcFilterBuilderIF builder = fbuilders.next();
				filterBuilders.put(builder.getFilterClass(), builder);
			}
		}
				
		Iterator<DmcSliceInfo> sliceIT = schema.getSliceInfo();
		if (sliceIT != null){
			while(sliceIT.hasNext()){
				DmcSliceInfo dsi = sliceIT.next();
				slices.put(dsi.getName(), dsi);
			}
		}
		
		Iterator<DmcTypeInfo> typeIT = schema.getTypeInfo();
		if (typeIT != null){
			while(typeIT.hasNext()){
				DmcTypeInfo dti = typeIT.next();
				types.put(dti.name, dti);
			}
		}
		
		loadedCompactSchemas.put(schema.getSchemaName(), schema);
	}
	
	public DmcTypeDmcObjectName<?> buildName(DmcObjectName name){
		DmcNameBuilderIF builder = nameBuilders.get(name.getNameClass());
		if (builder == null){
			throw(new IllegalStateException("No DmcNameBuilderIF available for name class: " + name.getNameClass() + " - ensure that you have loaded the appropriate ASAGs."));
		}
		
		DmcAttributeInfo ai = idToAttr.get(builder.getNameAttributeID());
			
		return(builder.getNewNameHolder(name,ai));
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
	 * Tries to find the specified class by its name.
	 * @param cn The class name.
	 * @return The class info if it's available.
	 */
	public DmcClassInfo getClassInfo(String cn){
		return(stringToClass.get(cn));
	}
	
	/**
	 * Tries to find the specified class by its id.
	 * @param id The class id.
	 * @return The class info if it's available.
	 */
	public DmcClassInfo getClassInfo(Integer id){
		return(idToClass.get(id));
	}
	
	/**
	 * @param tn the type name
	 * @return the type info.
	 */
	public DmcTypeInfo getTypeInfo(String tn){
		return(types.get(tn));
	}
	
	/**
	 * Returns the DmcAttributeInfo associate with the ID or complains bitterly that you've
	 * forgotten to prime the DmcOmni with the generated <schema>DMSchemaAG related
	 * to the identifier in question. This method is usually called by base classes like
	 * DmcAttribute when it's trying to dump things in OIF format.
	 * @param id The attribute's ID.
	 * @return the attribute info for the specified ID.
	 */
	public DmcAttributeInfo getInfo(Integer id){
		DmcAttributeInfo ai = idToAttr.get(id);
		
		if (ai == null)
			return(null);
//		if (ai == null)
//			System.out.println("DmcOmni.getInfo() - can't find: " + id);
//			throw(new IllegalStateException(" Failed to get DmcAttributeInfo for id: " + id + "  - ensure that you have loaded the attribute schema in DmcOmni."));
		
		return(ai);
	}
	
	/**
	 * Tries to find the specified attribute by its name.
	 * @param an The attribute name.
	 * @return The attribute info if it's available.
	 */
	public DmcAttributeInfo getAttributeInfo(String an){
		return(stringToAttribute.get(an));
	}
	
	/**
	 * The DmcOmni can act as a global name resolver. This method will attempt to 
	 * find the named object in any name resolvers that have been registered.
	 */
	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
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
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
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
	
	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
		DmcNamedObjectIF rc = null;
		
		for(DmcNameResolverIF res: resolvers){
			rc = res.findNamedObject(name,attributeID);
			
			if ( rc != null)
				break;
		}
		
		return(rc);
	}

	/**
	 * This method displays the currently loaded attribute schemas in dmdID order.
	 */
	public void dumpASAG(){
		for(DmcAttributeInfo ai : idToAttr.values()){
			System.out.println(ai.toString());
		}
	}
	
	/**
	 * Returns the slice information if it's available. Slice information is generated for SliceDefinitions
	 * specified as part of your schema and indicate a subset of attributes to be returned in a GetResponse.
	 * @param name the name of the slice.
	 * @return The slice information if it's available.
	 */
	public DmcSliceInfo getSliceInfo(String name){
		DmcSliceInfo rc = slices.get(name);
		
		if (rc == null)
			throw(new IllegalStateException("Unknown slice requested: " + name));
		
		return(rc);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public boolean ruleTracing(){
		return(traceRules);
	}
	
	public void ruleTracing(boolean f){
		traceRules = f;
	}
	
	public void ruleTracer(RuleTracerIF t){
		ruleTracer = t;
	}
	
	public void ruleExecuted(String info){
		if (traceRules){
			if (ruleTracer != null)
				ruleTracer.ruleExecuted(info);
		}
	}
	
	public void ruleAdded(String info){
		if (traceRules){
			if (ruleTracer != null)
				ruleTracer.ruleAdded(info);
		}
	}
	
	public void ruleFailed(DmcRuleExceptionSet errors){
		if (traceRules){
			if (ruleTracer != null)
				ruleTracer.ruleFailed(errors);
		}
	}

}
