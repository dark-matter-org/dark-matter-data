//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.shared.generated.rulesdmo;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.MetaRuleFormatter.dumpRuleCategoryInterfaces(MetaRuleFormatter.java:93)
import org.dmd.core.DmcAttribute;                               // Required for attribute - (MetaRuleFormatter.java:60)
import org.dmd.core.DmcObject;                                  // Required for obj - (MetaRuleFormatter.java:60)
import org.dmd.core.interfaces.DmcUniqueNameResolverIF;         // Required for resolver - (MetaRuleFormatter.java:60)
import org.dmd.core.rules.DmcRuleExceptionSet;                  // Rule type - (MetaRuleFormatter.java:48)
import org.dmd.core.rules.RuleIF;                               // All rules implement this - (MetaRuleFormatter.java:49)



// Generated from: org.dmd.dms.tools.generation.meta.MetaRuleFormatter.dumpRuleCategoryInterfaces(MetaRuleFormatter.java:95)
public interface AttributeValidationWithResolverIF extends RuleIF {

    /**
     * @param obj The object in which the attribute exists
     * @param attribute The attribute to be validated
     * @param resolver The name resolver
     */
    public void execute(DmcObject  obj, DmcAttribute<?> attribute, DmcUniqueNameResolverIF  resolver) throws DmcRuleExceptionSet;

}

