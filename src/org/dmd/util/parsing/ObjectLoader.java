package org.dmd.util.parsing;

import java.util.ArrayList;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dms.util.DmoObjectFactoryNew;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.ResultException;

/**
 * The ObjectLoader will simply load a set of DMOs from a file and pass them back.
 */
public class ObjectLoader implements DmcUncheckedOIFHandlerIF {
	
	DmcUncheckedOIFParser 	parser;
	DmoObjectFactoryNew		factory;
	
	ArrayList<DmcObject>	objects;
	
	public ObjectLoader(){
		parser = new DmcUncheckedOIFParser(this);
		factory = new DmoObjectFactoryNew(DmwOmni.instance().getSchema());
	}
	
	/**
	 * Loads a set of DMOs from the specified file. this assumes that you've initialized the
	 * the DmwOmni with the appropriate schemas.
	 * @param fn the name of the file to load
	 * @return an array of DMOs
	 * @throws DmcRuleExceptionSet  
	 * @throws DmcValueException 
	 * @throws ResultException 
	 */
	public ArrayList<DmcObject> load(String fn) throws ResultException, DmcValueException, DmcRuleExceptionSet {
		objects = new ArrayList<DmcObject>();
		
		parser.parseFile(fn);
		
		return(objects);
	}

	@Override
	public void handleObject(DmcUncheckedObject obj, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet {
		
		try {
			DmcObject dmo = factory.createObject(obj);
			objects.add(dmo);
		} catch (ClassNotFoundException e) {
			ResultException ex = new ResultException("Class not found: " + obj.getConstructionClass());
			throw(ex);
		}
	}

}
