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
import org.dmd.dmc.*;                                                            // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dms.ClassDefinition;                                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;                 // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedIterableDMW;         // For multi-valued TestBasicObjectFixed - (BaseDMWGenerator.java:1599)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                // Attribute tsUnnamedObj from the dmt schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                 // For multi-valued adds of TestBasicObjectFixed - (BaseDMWGenerator.java:1657)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjTSDMO;                         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmw.DmwWrapper;                                                   // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class UnnamedObjTSDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public UnnamedObjTSDMW() {
        super(new UnnamedObjTSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public UnnamedObjTSDMW(DmcTypeModifierMV mods) {
        super(new UnnamedObjTSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public UnnamedObjTSDMW getModificationRecorder(){
        UnnamedObjTSDMW rc = new UnnamedObjTSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public UnnamedObjTSDMW(UnnamedObjTSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjTS);
    }

    public UnnamedObjTSDMW cloneIt() {
        UnnamedObjTSDMW rc = new UnnamedObjTSDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UnnamedObjTSDMO getDMO() {
        return((UnnamedObjTSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected UnnamedObjTSDMW(UnnamedObjTSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getTsUnnamedObjSize(){
        return(((UnnamedObjTSDMO) core).getTsUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getTsUnnamedObjIsEmpty(){
        if (((UnnamedObjTSDMO) core).getTsUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getTsUnnamedObjHasValue(){
        if (((UnnamedObjTSDMO) core).getTsUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1606)
    public TestBasicObjectFixedIterableDMW getTsUnnamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsUnnamedObj);
        if (attr == null)
            return(TestBasicObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicObjectFixedIterableDMW(((UnnamedObjTSDMO) core).getTsUnnamedObj()));
    }

    /**
     * Adds another tsUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1663)
    public DmcAttribute<?> addTsUnnamedObj(TestBasicObjectFixedDMW value){
        DmcAttribute<?> attr = ((UnnamedObjTSDMO) core).addTsUnnamedObj(((TestBasicObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a tsUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1713)
    public void delTsUnnamedObj(TestBasicObjectFixedDMW value){
        ((UnnamedObjTSDMO) core).delTsUnnamedObj(value.getDMO());
    }

    /**
     * Removes the tsUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remTsUnnamedObj(){
        ((UnnamedObjTSDMO) core).remTsUnnamedObj();
    }


}
