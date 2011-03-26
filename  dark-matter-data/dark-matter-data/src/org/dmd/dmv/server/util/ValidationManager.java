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
package org.dmd.dmv.server.util;

import java.util.ArrayList;

import org.dmd.dmc.DmcObject;
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
		
//		try {
			MustRule	must = new MustRule();
			must.setRuleTitle("Check for mandatory attributes.");
			globalClassRules.add(must);
			
			MayRule	may = new MayRule();
			may.setRuleTitle("Check for allowed attributes.");
			globalClassRules.add(must);
			
//		} catch (DmcValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
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
