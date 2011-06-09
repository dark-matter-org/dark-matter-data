//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:922)
import org.dmd.dmc.*;                                         // If any attributes
import org.dmd.dms.*;                                         // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor
import org.dmd.dmv.server.extended.ClassRule;                 // Derived class
import org.dmd.dmv.server.extended.MustRule;                  // Required for getModificationRecorder()
import org.dmd.dmv.shared.generated.dmo.MustRuleDMO;          // Class not auxiliary or abstract

/**
 * The MustRule verifies that an object has its must attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MustRuleDMW extends ClassRule {

    public MustRuleDMW() {
        super(new MustRuleDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._MustRule);
    }

    public MustRuleDMW(DmcTypeModifierMV mods) {
        super(new MustRuleDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._MustRule);
    }

    public MustRule getModificationRecorder(){
        MustRule rc = new MustRule();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MustRuleDMW(MustRuleDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._MustRule);
    }

    public MustRuleDMO getDMO() {
        return((MustRuleDMO) core);
    }

    protected MustRuleDMW(MustRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getRuleTitle(){
        return(((MustRuleDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((MustRuleDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setRuleTitle(String value){
        ((MustRuleDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remRuleTitle(){
        ((MustRuleDMO) core).remRuleTitle();
    }


}
