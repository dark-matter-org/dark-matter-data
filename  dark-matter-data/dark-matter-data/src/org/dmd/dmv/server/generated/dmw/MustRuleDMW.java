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
import org.dmd.dmc.*;                                         // If any attributes - (BaseDMWGeneratorNewest.java:808)
import org.dmd.dms.*;                                         // Always 2 - (BaseDMWGeneratorNewest.java:793)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:797)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:796)
import org.dmd.dmv.server.extended.ClassRule;                 // Derived class - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dmv.server.extended.MustRule;                  // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:801)
import org.dmd.dmv.shared.generated.dmo.MustRuleDMO;          // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:947)


/**
 * The MustRule verifies that an object has its must attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class MustRuleDMW extends ClassRule {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public MustRuleDMW() {
        super(new MustRuleDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._MustRule);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public MustRuleDMW(DmcTypeModifierMV mods) {
        super(new MustRuleDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._MustRule);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public MustRule getModificationRecorder(){
        MustRule rc = new MustRule();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public MustRuleDMW(MustRuleDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._MustRule);
    }

    public MustRule cloneIt() {
        MustRule rc = new MustRule();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public MustRuleDMO getDMO() {
        return((MustRuleDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected MustRuleDMW(MustRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public String getRuleTitle(){
        return(((MustRuleDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((MustRuleDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setRuleTitle(String value){
        ((MustRuleDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remRuleTitle(){
        ((MustRuleDMO) core).remRuleTitle();
    }


}
