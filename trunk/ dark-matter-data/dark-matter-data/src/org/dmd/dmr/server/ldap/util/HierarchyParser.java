package org.dmd.dmr.server.ldap.util;

import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmr.server.ldap.extended.LDAPHierarchicObject;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;


/**
 * The HierarchyParser reads a collection of HierarchicObjects and assembles them into
 * a hierarchy of objects.
 */
//public class HierarchyParser implements ImdGenericObjectHandlerIF, ImdNameResolverIF {
public class HierarchyParser implements DmcUncheckedOIFHandlerIF,  DmcNameResolverIF {

	SchemaManager			schema;
	
	DmwObjectFactory		factory;
	
	DmcUncheckedOIFParser	parser;
	
	LDAPHierarchicObject	root;
	
	// Key: FQN
	TreeMap<String,LDAPHierarchicObject> keyMap;
	
	AttributeDefinition		FQNAD;
	AttributeDefinition		parentFQNAD;
	
	ArrayList<LDAPHierarchicObject>	loadedObjects;

	public HierarchyParser(SchemaManager sm){
		schema 		= sm;
		FQNAD		= schema.adef("FQN");
		parentFQNAD	= schema.adef("parentFQN");
		parser		= new DmcUncheckedOIFParser(this);
		factory		= new DmwObjectFactory(schema);
	}

	public LDAPHierarchicObject readHierarchy(String fn) throws ResultException, DmcValueException {
		keyMap 	= new TreeMap<String, LDAPHierarchicObject>();
		root	= null;
		
		loadedObjects = new ArrayList<LDAPHierarchicObject>();
		
		parser.parseFile(fn);
		
//		resolveReferences();
		
		return(root);
	}
	
	/**
	 * This method can be used to load multiple hierarchic structures into the same keymap. All
	 * of the hierarchies should share a common root object (which is NOT stored in the file 
	 * with the object being loaded). However, you must have access to the root object and
	 * place its FQN in the byFQN map before you call this method. 
	 * @param byFQN The mapping of objects by FQN. This must contain an entry for your root
	 * object if you're using a common root.
	 * @param fn The name of the file to be parsed.
	 * @throws ResultException
	 * @throws DmcValueException 
	 */
	public void readHierarchicFile(TreeMap<String,LDAPHierarchicObject> byFQN, String fn) throws ResultException, DmcValueException {
		keyMap = byFQN;
		
		loadedObjects = new ArrayList<LDAPHierarchicObject>();
		
		parser.parseFile(fn);
		
//		resolveReferences();
		
	}

	/**
	 * This method allows you to read a set of objects below a pre-existing root object.
	 * @param existingRoot
	 * @param fn
	 * @return The root of the hierarchy.
	 * @throws ResultException
	 * @throws DmcValueException 
	 */
	public LDAPHierarchicObject readHierarchyBelowRoot(LDAPHierarchicObject existingRoot, String fn) throws ResultException, DmcValueException {
		keyMap 	= new TreeMap<String, LDAPHierarchicObject>();
		keyMap.put(existingRoot.getFQN(), existingRoot);
		root	= existingRoot;
		
		loadedObjects = new ArrayList<LDAPHierarchicObject>();
		
		parser.parseFile(fn);
		
//		resolveReferences();
		
		return(root);
	}
	
	void resolveReferences() throws ResultException {
		ResultException	errors	= null;
		
		for(LDAPHierarchicObject ho : loadedObjects){
			try {
				ho.resolveReferences(schema, this);
			} catch (DmcValueExceptionSet e) {
				if (errors == null)
					errors = new ResultException();
				
				errors.addError("Couldn't resolve references in object: " + " " + ho.getName());
				errors.setLocationInfo(ho.getFile(), ho.getLineNumber());
				
				for(DmcValueException dve : e.getExceptions()){
					errors.moreMessages(dve.getAttributeName() + " - " + dve.getMessage());
				}
				
			}
		}
		
		if (errors != null)
			throw(errors);
	}

	@Override
	public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
		String				 fqn			= null;
		String				 parentFqn		= null;
		LDAPHierarchicObject newEntry 		= null;
		LDAPHierarchicObject parentEntry 	= null;
		LDAPHierarchicObject currObj 		= null;
		
		try {
			currObj = (LDAPHierarchicObject) factory.createWrapper(uco);
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
		
		currObj.setLineNumber(lineNumber);
		currObj.setFile(infile);

		if (currObj.getFQN() == null){
			ResultException ex = new ResultException();
			ex.addError("Missing FQN for object.");
			ex.setLocationInfo(currObj.getFile(), currObj.getLineNumber());
			throw(ex);
		}
		
		fqn = currObj.getFQN();
		
		if (currObj.getParentFQN() != null)
			parentFqn = currObj.getParentFQN();
		
		if (parentFqn == null){
			if (root == null){
				root = currObj;
				root.setParentObject(null);
				
				keyMap.put(fqn,root);
			}
			else{
				// The only time that parent should be null is when we're dealing with the
				// root object - otherwise, it's an error
				ResultException ex = new ResultException();
				ex.addError("Missing parent for object:" + fqn);
				ex.setLocationInfo(currObj.getFile(), currObj.getLineNumber());
				throw(ex);
			}
		}
		else{
			if (keyMap.get(fqn) == null){
				parentEntry = keyMap.get(parentFqn);
			
				if (parentEntry == null){
					ResultException ex = new ResultException();
					ex.addError("Missing parent: " + parentFqn + " for object: " + fqn);
					ex.setLocationInfo(currObj.getFile(), currObj.getLineNumber());
					throw(ex);
				}
				else{
					newEntry = currObj;
					newEntry.setParentObject(parentEntry);
					
					keyMap.put(fqn, newEntry);
				}
			}
			else{
				ResultException ex = new ResultException();
				ex.addError("Duplicate fqn: " + fqn);
				ex.setLocationInfo(currObj.getFile(), currObj.getLineNumber());
				throw(ex);
			}
		
			System.out.println("HierarchyParser read:\n" + newEntry.getRepositoryID());
		}

	}

	@Override
	public DmcNamedObjectIF findNamedObject(String name) {
		return(keyMap.get(name));
	}
	
	
}
