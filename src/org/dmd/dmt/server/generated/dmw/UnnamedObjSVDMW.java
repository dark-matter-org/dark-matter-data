//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:975)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;         // Is reference type - (BaseDMWGenerator.java:995)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;         // Reference to unnamed object - (BaseDMWGenerator.java:1000)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjSVDMO;                 // Class not auxiliary or abstract - (BaseDMWGenerator.java:1140)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGenerator.java:1123)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class UnnamedObjSVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public UnnamedObjSVDMW() {
        super(new UnnamedObjSVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public UnnamedObjSVDMW(DmcTypeModifierMV mods) {
        super(new UnnamedObjSVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public UnnamedObjSVDMW getModificationRecorder(){
        UnnamedObjSVDMW rc = new UnnamedObjSVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public UnnamedObjSVDMW(UnnamedObjSVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjSV);
    }

    public UnnamedObjSVDMW cloneIt() {
        UnnamedObjSVDMW rc = new UnnamedObjSVDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UnnamedObjSVDMO getDMO() {
        return((UnnamedObjSVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected UnnamedObjSVDMW(UnnamedObjSVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A TestBasicObjectFixedDMW object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1289)
    public TestBasicObjectFixedDMW getSvUnnamedObj(){
        TestBasicObjectFixedDMO dmo = ((UnnamedObjSVDMO) core).getSvUnnamedObj();
        if (dmo == null)
            return(null);
        
        return((TestBasicObjectFixedDMW)dmo.getContainer());
    }

    /**
     * Sets the svUnnamedObj to the specified value.
     * @param value A value compatible with TestBasicObjectFixedREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1407)
    public void setSvUnnamedObj(TestBasicObjectFixedDMW value) {
        ((UnnamedObjSVDMO) core).setSvUnnamedObj(value.getDMO());
    }

    /**
     * Sets the svUnnamedObj to the specified value.
     * @param value A value compatible with TestBasicObjectFixedREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1416)
    public void setSvUnnamedObj(Object value) throws DmcValueException {
        ((UnnamedObjSVDMO) core).setSvUnnamedObj(value);
    }

    /**
     * Removes the svUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remSvUnnamedObj(){
        ((UnnamedObjSVDMO) core).remSvUnnamedObj();
    }


}
