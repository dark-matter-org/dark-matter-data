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
import java.util.HashMap;                                         // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1078)
import java.util.Iterator;                                        // Support MV object get() - (BaseDMWGeneratorNewest.java:2323)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dmc.types.DefinitionName;                          // Name type - (BaseDMWGeneratorNewest.java:2431)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                 // Attribute objRefHM from the dmt schema - (BaseDMWGeneratorNewest.java:794)
import org.dmd.dmt.shared.generated.dmo.UsingObjRefHMDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // To support getMVCopy() for REFs ObjWithRefs-HASHMAPPED - (BaseDMWGeneratorNewest.java:1018)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1127)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class UsingObjRefHMDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public UsingObjRefHMDMW() {
        super(new UsingObjRefHMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UsingObjRefHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public UsingObjRefHMDMW(DmcTypeModifierMV mods) {
        super(new UsingObjRefHMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UsingObjRefHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:505)
    public UsingObjRefHMDMW getModificationRecorder(){
        UsingObjRefHMDMW rc = new UsingObjRefHMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public UsingObjRefHMDMW(UsingObjRefHMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UsingObjRefHM);
    }

    public UsingObjRefHMDMW cloneIt() {
        UsingObjRefHMDMW rc = new UsingObjRefHMDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UsingObjRefHMDMO getDMO() {
        return((UsingObjRefHMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected UsingObjRefHMDMW(UsingObjRefHMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2236)
    public int getObjRefHMSize(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2248)
    public boolean getObjRefHMIsEmpty(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2260)
    public boolean getObjRefHMHasValue(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2276)
    public ObjWithRefs getObjRefHM(Object key){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(null);
        
        return((ObjWithRefs)attr.getByKey(key));
    }

    /**
     * @return An Iterable of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2331)
    public ObjWithRefsIterableDMW getObjRefHMIterable(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        Iterator<ObjWithRefsREF> it = ((UsingObjRefHMDMO) core).getObjRefHM();
        
        if (it == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(it));
    }

    /**
     * Adds another objRefHM value.
     * @param value ObjWithRefsDMW
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2365)
    public DmcAttribute<?> addObjRefHM(ObjWithRefs value) {
        return(((UsingObjRefHMDMO) core).addObjRefHM(value.getDMO()));
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2389)
    public void delObjRefHM(ObjWithRefs value){
        ((UsingObjRefHMDMO) core).delObjRefHM(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2435)
    public HashMap<DefinitionName,ObjWithRefs> getObjRefHMCopy(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(new HashMap<DefinitionName,ObjWithRefs>());
        
        HashMap<DefinitionName,ObjWithRefs> rc = new HashMap<DefinitionName,ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getObjRefHMIterable();
        while(it.hasNext()){
            ObjWithRefs obj = it.next();
            rc.put((DefinitionName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2591)
    public void remObjRefHM(){
        ((UsingObjRefHMDMO) core).remObjRefHM();
    }


}
