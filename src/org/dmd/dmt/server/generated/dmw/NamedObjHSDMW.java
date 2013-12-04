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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.HashSet;                                               // To support getMVCopy() - (BaseDMWGenerator.java:1120)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGenerator.java:996)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dmt.server.extended.ObjWithRefs;                         // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.dmt.server.generated.dmw.ObjWithRefsIterableDMW;         // For multi-valued ObjWithRefs - (BaseDMWGenerator.java:1633)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                       // Attribute hsNamedObj from the dmt schema - (BaseDMWGenerator.java:821)
import org.dmd.dmt.shared.generated.dmo.NamedObjHSDMO;                  // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                 // For multi-valued adds of ObjWithRefs - (BaseDMWGenerator.java:1691)
import org.dmd.dmw.DmwWrapper;                                          // Unnamed object wrapper - (BaseDMWGenerator.java:1159)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class NamedObjHSDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public NamedObjHSDMW() {
        super(new NamedObjHSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public NamedObjHSDMW(DmcTypeModifierMV mods) {
        super(new NamedObjHSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:517)
    public NamedObjHSDMW getModificationRecorder(){
        NamedObjHSDMW rc = new NamedObjHSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public NamedObjHSDMW(NamedObjHSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjHS);
    }

    public NamedObjHSDMW cloneIt() {
        NamedObjHSDMW rc = new NamedObjHSDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NamedObjHSDMO getDMO() {
        return((NamedObjHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected NamedObjHSDMW(NamedObjHSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getHsNamedObjSize(){
        return(((NamedObjHSDMO) core).getHsNamedObjSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getHsNamedObjIsEmpty(){
        if (((NamedObjHSDMO) core).getHsNamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getHsNamedObjHasValue(){
        if (((NamedObjHSDMO) core).getHsNamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1640)
    public ObjWithRefsIterableDMW getHsNamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(((NamedObjHSDMO) core).getHsNamedObj()));
    }

    /**
     * Adds another hsNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1697)
    public DmcAttribute<?> addHsNamedObj(ObjWithRefs value){
        DmcAttribute<?> attr = ((NamedObjHSDMO) core).addHsNamedObj(((ObjWithRefsDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a hsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1747)
    public void delHsNamedObj(ObjWithRefs value){
        ((NamedObjHSDMO) core).delHsNamedObj(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1811)
    public HashSet<ObjWithRefs> getHsNamedObjCopy(){
        DmcAttribute<?> attr = ((NamedObjHSDMO) core).get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            return(new HashSet<ObjWithRefs>());
        
        HashSet<ObjWithRefs> rc = new HashSet<ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getHsNamedObjIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the hsNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remHsNamedObj(){
        ((NamedObjHSDMO) core).remHsNamedObj();
    }


}
