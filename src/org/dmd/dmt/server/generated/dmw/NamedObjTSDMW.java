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
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import java.util.TreeSet;                                               // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1098)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.server.extended.ObjWithRefs;                         // Is reference type - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmt.server.generated.dmw.ObjWithRefsIterableDMW;         // For multi-valued ObjWithRefs - (BaseDMWGeneratorNewest.java:1601)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                       // Attribute tsNamedObj from the dmt schema - (BaseDMWGeneratorNewest.java:794)
import org.dmd.dmt.shared.generated.dmo.NamedObjTSDMO;                  // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                 // For multi-valued adds of ObjWithRefs - (BaseDMWGeneratorNewest.java:1659)
import org.dmd.dmw.DmwWrapper;                                          // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1127)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class NamedObjTSDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public NamedObjTSDMW() {
        super(new NamedObjTSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public NamedObjTSDMW(DmcTypeModifierMV mods) {
        super(new NamedObjTSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:505)
    public NamedObjTSDMW getModificationRecorder(){
        NamedObjTSDMW rc = new NamedObjTSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public NamedObjTSDMW(NamedObjTSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTS);
    }

    public NamedObjTSDMW cloneIt() {
        NamedObjTSDMW rc = new NamedObjTSDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NamedObjTSDMO getDMO() {
        return((NamedObjTSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected NamedObjTSDMW(NamedObjTSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1563)
    public int getTsNamedObjSize(){
        return(((NamedObjTSDMO) core).getTsNamedObjSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public boolean getTsNamedObjIsEmpty(){
        if (((NamedObjTSDMO) core).getTsNamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1581)
    public boolean getTsNamedObjHasValue(){
        if (((NamedObjTSDMO) core).getTsNamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1608)
    public ObjWithRefsIterableDMW getTsNamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(((NamedObjTSDMO) core).getTsNamedObj()));
    }

    /**
     * Adds another tsNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1665)
    public DmcAttribute<?> addTsNamedObj(ObjWithRefs value){
        DmcAttribute<?> attr = ((NamedObjTSDMO) core).addTsNamedObj(((ObjWithRefsDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a tsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1715)
    public void delTsNamedObj(ObjWithRefs value){
        ((NamedObjTSDMO) core).delTsNamedObj(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1779)
    public TreeSet<ObjWithRefs> getTsNamedObjCopy(){
        DmcAttribute<?> attr = ((NamedObjTSDMO) core).get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            return(new TreeSet<ObjWithRefs>());
        
        TreeSet<ObjWithRefs> rc = new TreeSet<ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getTsNamedObjIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the tsNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2184)
    public void remTsNamedObj(){
        ((NamedObjTSDMO) core).remTsNamedObj();
    }


}
