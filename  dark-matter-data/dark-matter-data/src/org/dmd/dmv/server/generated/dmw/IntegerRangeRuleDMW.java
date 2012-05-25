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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                // If any attributes - (BaseDMWGeneratorNewest.java:887)
import org.dmd.dms.*;                                                // Always 2 - (BaseDMWGeneratorNewest.java:872)
import org.dmd.dms.generated.dmo.MetaDMSAG;                          // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:876)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:875)
import org.dmd.dmv.server.extended.AttributeRule;                    // Derived class - (BaseDMWGeneratorNewest.java:1043)
import org.dmd.dmv.server.extended.IntegerRangeRule;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:880)
import org.dmd.dmv.shared.generated.dmo.IntegerRangeRuleDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1047)


/**
 * null
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class IntegerRangeRuleDMW extends AttributeRule {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public IntegerRangeRuleDMW() {
        super(new IntegerRangeRuleDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._IntegerRangeRule);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public IntegerRangeRuleDMW(DmcTypeModifierMV mods) {
        super(new IntegerRangeRuleDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._IntegerRangeRule);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public IntegerRangeRule getModificationRecorder(){
        IntegerRangeRule rc = new IntegerRangeRule();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public IntegerRangeRuleDMW(IntegerRangeRuleDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._IntegerRangeRule);
    }

    public IntegerRangeRule cloneIt() {
        IntegerRangeRule rc = new IntegerRangeRule();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public IntegerRangeRuleDMO getDMO() {
        return((IntegerRangeRuleDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected IntegerRangeRuleDMW(IntegerRangeRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public String getRuleTitle(){
        return(((IntegerRangeRuleDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((IntegerRangeRuleDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setRuleTitle(String value){
        ((IntegerRangeRuleDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remRuleTitle(){
        ((IntegerRangeRuleDMO) core).remRuleTitle();
    }


}
