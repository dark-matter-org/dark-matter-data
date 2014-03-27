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
package org.dmd.dmr.server.base.util;

import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmr.server.base.extended.HierarchicObject;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;


/**
 * The HierarchyParser reads a collection of HierarchicObjects and assembles them into
 * a hierarchy of objects.
 */
public class HierarchyParser implements DmcUncheckedOIFHandlerIF, DmcNameResolverIF {

	SchemaManager			schema;
	
	DmwObjectFactory		factory;
	
	DmcUncheckedOIFParser	parser;
	
	HierarchicDataCache		cache;
	
	HierarchicObject		root;
	
	AttributeDefinition		FQNAD;
	AttributeDefinition		parentFQNAD;
	
//	ArrayList<HierarchicObject>	loadedObjects;
	
	// Indicates if we want the file and line number data in the objects
	boolean					setFileAndLine;

	public HierarchyParser(SchemaManager sm, HierarchicDataCache hdc){
		schema 		= sm;
		cache		= hdc;
		FQNAD		= schema.adef("FQN");
		parentFQNAD	= schema.adef("parentFQN");
		parser		= new DmcUncheckedOIFParser(this);
		factory		= new DmwObjectFactory(schema);
		setFileAndLine = false;
	}

	public HierarchyParser(SchemaManager sm, HierarchicDataCache hdc, boolean sfal){
		schema 		= sm;
		cache		= hdc;
		FQNAD		= schema.adef("FQN");
		parentFQNAD	= schema.adef("parentFQN");
		parser		= new DmcUncheckedOIFParser(this);
		factory		= new DmwObjectFactory(schema);
		setFileAndLine	= sfal;
	}

	public HierarchicObject readHierarchy(String fn) throws ResultException, DmcValueException, DmcRuleExceptionSet {
		root	= null;
		
//		loadedObjects = new ArrayList<HierarchicObject>();
		
		parser.parseFile(fn);
		
		resolveReferences();
		
		return(root);
	}
	
//	/**
//	 * This method can be used to load multiple hierarchic structures into the same keymap. All
//	 * of the hierarchies should share a common root object (which is NOT stored in the file 
//	 * with the object being loaded). However, you must have access to the root object and
//	 * place its FQN in the byFQN map before you call this method. 
//	 * @param byFQN The mapping of objects by FQN. This must contain an entry for your root
//	 * object if you're using a common root.
//	 * @param fn The name of the file to be parsed.
//	 * @throws ResultException
//	 * @throws DmcValueException 
//	 */
//	public void readHierarchicFile(TreeMap<String,HierarchicObject> byFQN, String fn) throws ResultException, DmcValueException {
//		keyMap = byFQN;
//		
//		loadedObjects = new ArrayList<HierarchicObject>();
//		
//		parser.parseFile(fn);
//		
////		resolveReferences();
//		
//	}
//
//	/**
//	 * This method allows you to read a set of objects below a pre-existing root object.
//	 * @param existingRoot
//	 * @param fn
//	 * @return The root of the hierarchy.
//	 * @throws ResultException
//	 * @throws DmcValueException 
//	 */
//	public HierarchicObject readHierarchyBelowRoot(HierarchicObject existingRoot, String fn) throws ResultException, DmcValueException {
//		keyMap 	= new TreeMap<String, HierarchicObject>();
//		keyMap.put(existingRoot.getFQN(), existingRoot);
//		root	= existingRoot;
//		
//		loadedObjects = new ArrayList<HierarchicObject>();
//		
//		parser.parseFile(fn);
//		
////		resolveReferences();
//		
//		return(root);
//	}
	
	void resolveReferences() throws ResultException {
		ResultException	errors	= null;
		for(HierarchicObject ho : cache.data.values()){
			DebugInfo.debug(ho.getFQN().getNameString());	
			try {
				ho.resolveReferences(this);
				
				if (!setFileAndLine){
					// Remove the file and line number if not required
					ho.remFile();
					ho.remLineNumber();
				}
			} catch (DmcValueExceptionSet e) {
				
				if (errors == null)
					errors = new ResultException();
				
				errors.addError("Couldn't resolve references in object: " + " " + ho.getFQN());
				errors.setLocationInfo(ho.getFile(), ho.getLineNumber());
				
				for(DmcValueException dve : e.getExceptions()){
					errors.moreMessages(dve.getMessage());
				}
				
			}
		}
		
		if (errors != null)
			throw(errors);
	}

	@Override
	public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
		DmcHierarchicObjectName			fqn			= null;
		DmcHierarchicObjectName			parentFqn	= null;
		HierarchicObject 	newEntry 	= null;
		HierarchicObject 	parentEntry	= null;
		HierarchicObject 	currObj 	= null;
		
		try {
			currObj = (HierarchicObject) factory.createWrapper(uco);
			
			DebugInfo.debug("Loaded:\n\n" + currObj.toOIF(15));
		} catch (ClassNotFoundException e) {
			ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		}
		catch (ResultException ex){
			ex.setLocationInfo(infile, lineNumber);
			throw(ex);
		}
		
		// We always set the file and line info in case we need it for error reporting,
		// but we strip it out in resolveReferences() if it's not required
		currObj.setLineNumber(lineNumber);
		currObj.setFile(infile);

		if (currObj.getFQN() == null){
			ResultException ex = new ResultException();
			ex.addError("Missing FQN for object.");
			ex.setLocationInfo(currObj.getFile(), currObj.getLineNumber());
			throw(ex);
		}
		
		fqn = currObj.getFQN();
		
		if (currObj.getFQN().getParentName() != null)
			parentFqn = currObj.getFQN().getParentName();
		
		if (parentFqn == null){
			// We have a top level object
			currObj.setParentObject(null);
			cache.addObject(currObj);
		}
		else{
			if (cache.find(fqn) == null){
				parentEntry = cache.find(parentFqn);
			
				if (parentEntry == null){
					ResultException ex = new ResultException();
					ex.addError("Missing parent: " + parentFqn + " for object: " + fqn);
					ex.setLocationInfo(currObj.getFile(), currObj.getLineNumber());
					throw(ex);
				}
				else{
					newEntry = currObj;
					newEntry.setParentObject(parentEntry);
					
					cache.addObject(currObj);
				}
			}
			else{
				ResultException ex = new ResultException();
				ex.addError("Duplicate FQN: " + fqn);
				ex.setLocationInfo(currObj.getFile(), currObj.getLineNumber());
				throw(ex);
			}
		
			System.out.println("HierarchyParser read:\n" + newEntry.getFQN());
			
		}

	}

	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
		DmcObject rc = schema.findNamedDMO(name);
		
		if (rc == null)
			return(cache.findNamedDMO(name));
		
		return rc;
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
		DmcNamedObjectIF rc = schema.findNamedObject(name);
		
		if (rc == null)
			return(cache.findNamedObject(name));
		
		return(rc);
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
		// Don't actually use the attribute ID here
		DmcNamedObjectIF rc = schema.findNamedObject(name);
		
		if (rc == null)
			return(cache.findNamedObject(name));
		
		return(rc);
	}
	
}
