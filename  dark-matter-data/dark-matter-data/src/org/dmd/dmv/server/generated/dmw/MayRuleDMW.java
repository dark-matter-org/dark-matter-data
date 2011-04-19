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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmc.*;                                         // If any attributes
import org.dmd.dms.*;                                         // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor
import org.dmd.dmv.server.extended.ClassRule;                 // Derived class
import org.dmd.dmv.shared.generated.dmo.MayRuleDMO;           // Class not auxiliary or abstract

/**
 * The MustRule verifies that an object has its must attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MayRuleDMW extends ClassRule {

    public MayRuleDMW() {
        super(new MayRuleDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._MayRule);
    }

    public MayRuleDMW(DmcTypeModifierMV mods) {
        super(new MayRuleDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._MayRule);
    }

    public MayRuleDMW(MayRuleDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._MayRule);
    }

    public MayRuleDMO getDMO() {
        return((MayRuleDMO) core);
    }

    protected MayRuleDMW(MayRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public String getRuleTitle(){
        return(((MayRuleDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((MayRuleDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setRuleTitle(String value){
        ((MayRuleDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remRuleTitle(){
        ((MayRuleDMO) core).remRuleTitle();
    }


}
