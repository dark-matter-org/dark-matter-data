package org.dmd.dmv.server.util;

import java.util.ArrayList;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.SchemaManager;
import org.dmd.dmv.server.extended.ClassRule;

/**
 * The ValidationMananger provides a central point of definition and
 * application for rules related to object defined via the Dark Matter Schema
 * mechanisms.
 */
public class ValidationManager {

	SchemaManager	schema;
	
	// Global class rules are applicable to all objects. Any ClassRule
	// that doesn't have the applyToClass attribute is considered global in
	// scope. Currently the MustRule and MayRule are the only global rules.
	ArrayList<ClassRule>	globalClassRules;
	
	public ValidationManager(SchemaManager sm){
		globalClassRules = new ArrayList<ClassRule>();
		
	}
	
	public void applyGlobalClassRules(DmcObject obj) throws DmcValueExceptionSet {
		
	}
}
