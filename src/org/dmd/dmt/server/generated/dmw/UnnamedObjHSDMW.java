//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import org.dmd.dmc.*;                                                            // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dms.ClassDefinition;                                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (BaseDMWGenerator.java:967)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;                 // Is reference type - (BaseDMWGenerator.java:999)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedIterableDMW;         // For multi-valued TestBasicObjectFixed - (BaseDMWGenerator.java:1601)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                // Attribute hsUnnamedObj from the dmt schema - (BaseDMWGenerator.java:794)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                 // For multi-valued adds of TestBasicObjectFixed - (BaseDMWGenerator.java:1659)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjHSDMO;                         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)
import org.dmd.dmw.DmwWrapper;                                                   // Unnamed object wrapper - (BaseDMWGenerator.java:1127)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
public class UnnamedObjHSDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public UnnamedObjHSDMW() {
        super(new UnnamedObjHSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public UnnamedObjHSDMW(DmcTypeModifierMV mods) {
        super(new UnnamedObjHSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:505)
    public UnnamedObjHSDMW getModificationRecorder(){
        UnnamedObjHSDMW rc = new UnnamedObjHSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public UnnamedObjHSDMW(UnnamedObjHSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjHS);
    }

    public UnnamedObjHSDMW cloneIt() {
        UnnamedObjHSDMW rc = new UnnamedObjHSDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UnnamedObjHSDMO getDMO() {
        return((UnnamedObjHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected UnnamedObjHSDMW(UnnamedObjHSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1563)
    public int getHsUnnamedObjSize(){
        return(((UnnamedObjHSDMO) core).getHsUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1571)
    public boolean getHsUnnamedObjIsEmpty(){
        if (((UnnamedObjHSDMO) core).getHsUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1581)
    public boolean getHsUnnamedObjHasValue(){
        if (((UnnamedObjHSDMO) core).getHsUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public TestBasicObjectFixedIterableDMW getHsUnnamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsUnnamedObj);
        if (attr == null)
            return(TestBasicObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicObjectFixedIterableDMW(((UnnamedObjHSDMO) core).getHsUnnamedObj()));
    }

    /**
     * Adds another hsUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1665)
    public DmcAttribute<?> addHsUnnamedObj(TestBasicObjectFixedDMW value){
        DmcAttribute<?> attr = ((UnnamedObjHSDMO) core).addHsUnnamedObj(((TestBasicObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a hsUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1715)
    public void delHsUnnamedObj(TestBasicObjectFixedDMW value){
        ((UnnamedObjHSDMO) core).delHsUnnamedObj(value.getDMO());
    }

    /**
     * Removes the hsUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2184)
    public void remHsUnnamedObj(){
        ((UnnamedObjHSDMO) core).remHsUnnamedObj();
    }


}
