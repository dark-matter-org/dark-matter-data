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
// Called from: org.dmd.dms.tools.meta.MetaRuleFormatter.dumpRuleCategoryInterfaces(MetaRuleFormatter.java:143)
import java.util.ArrayList;                            // Storage for the rules - (MetaRuleFormatter.java:117)
import org.dmd.core.DmcObject;                         // Required for obj - (MetaRuleFormatter.java:60)
import org.dmd.core.DmcOmni;                           // Rule tracing support - (MetaRuleFormatter.java:120)
import org.dmd.core.rules.ClassRuleCollection;         // Class rule - (MetaRuleFormatter.java:134)
import org.dmd.core.rules.DmcRuleExceptionSet;         // Rule type - (MetaRuleFormatter.java:48)
import org.dmd.core.rules.RuleIF;                      // All rules implement this - (MetaRuleFormatter.java:49)
import org.dmd.core.schema.DmcClassInfo;               // Handle to class info - (MetaRuleFormatter.java:121)


public class InitializationRuleCollection extends ClassRuleCollection<InitializationIF> {

    public InitializationRuleCollection(){
    }

    // Generated from: org.dmd.dms.tools.meta.MetaRuleFormatter.dumpRuleCategoryInterfaces(MetaRuleFormatter.java:223)
    @Override
    public void addRule(RuleIF r){

        if (r instanceof InitializationIF){
            super.addThisRule((InitializationIF)r);
        }
    }

    /**
     * @param obj The object to be initialized
     */
    public void execute(DmcObject  obj) throws DmcRuleExceptionSet {
        DmcRuleExceptionSet rc = null;
        DmcClassInfo        cI = obj.getConstructionClassInfo();
        ArrayList<InitializationIF> ruleList = super.getRules(cI);

        if (ruleList != null){
            for(InitializationIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying: " + rule.getRuleTitle() + " to: " + cI.name);
                try {
                    rule.execute(obj);
                } catch (DmcRuleExceptionSet e) {
                    if (rc == null)
                        rc = e;
                    else
                        rc.add(e);
                    
                    if (DmcOmni.instance().ruleTracing())
                        DmcOmni.instance().ruleFailed(e);
                    
                    if (rc.immediateHalt())
                        throw(rc);
                }
            }
        }

        for(InitializationIF rule: globalRules){
            if (DmcOmni.instance().ruleTracing())
                DmcOmni.instance().ruleExecuted("Applying global: " + rule.getRuleTitle() + " to: " + cI.name);
            try {
                rule.execute(obj);
            } catch (DmcRuleExceptionSet e) {
                if (rc == null)
                    rc = e;
                else
                    rc.add(e);

                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleFailed(e);

                 if (rc.immediateHalt())
                    throw(rc);
            }
        }
        if (rc != null)
            throw(rc);
    }

}

