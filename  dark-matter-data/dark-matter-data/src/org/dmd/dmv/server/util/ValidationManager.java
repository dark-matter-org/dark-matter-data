package org.dmd.dmv.server.util;

import java.util.ArrayList;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.SchemaManager;
import org.dmd.dmv.server.extended.ClassRule;
import org.dmd.dmv.server.extended.MayRule;
import org.dmd.dmv.server.extended.MustRule;

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
		
		try {
			MustRule	must = new MustRule();
			must.setRuleTitle("Check for mandatory attributes.");
			globalClassRules.add(must);
			
			MayRule	may = new MayRule();
			may.setRuleTitle("Check for allowed attributes.");
			globalClassRules.add(must);
			
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Applies the global class rules to the specified object.
	 * @param obj The object to be validated.
	 * @throws DmcValueExceptionSet
	 */
	public void applyGlobalClassRules(DmcObject obj) throws DmcValueExceptionSet {
		for(ClassRule rule : globalClassRules){
			rule.applyRule(schema, obj);
		}
	}
}
