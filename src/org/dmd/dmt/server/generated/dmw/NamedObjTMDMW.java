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
import java.util.Iterator;                                        // Support MV object get() - (BaseDMWGenerator.java:2325)
import java.util.TreeMap;                                         // To support getMVCopy() - (BaseDMWGenerator.java:1080)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.DefinitionName;                          // Name type - (BaseDMWGenerator.java:2303)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                 // Attribute tmNamedObj from the dmt schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.shared.generated.dmo.NamedObjTMDMO;            // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // To support getMVCopy() for REFs ObjWithRefs-TREEMAPPED - (BaseDMWGenerator.java:1016)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class NamedObjTMDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public NamedObjTMDMW() {
        super(new NamedObjTMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public NamedObjTMDMW(DmcTypeModifierMV mods) {
        super(new NamedObjTMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public NamedObjTMDMW getModificationRecorder(){
        NamedObjTMDMW rc = new NamedObjTMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public NamedObjTMDMW(NamedObjTMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTM);
    }

    public NamedObjTMDMW cloneIt() {
        NamedObjTMDMW rc = new NamedObjTMDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NamedObjTMDMO getDMO() {
        return((NamedObjTMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected NamedObjTMDMW(NamedObjTMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2238)
    public int getTmNamedObjSize(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2250)
    public boolean getTmNamedObjIsEmpty(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2262)
    public boolean getTmNamedObjHasValue(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2278)
    public ObjWithRefs getTmNamedObj(Object key){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(null);
        
        return((ObjWithRefs)attr.getByKey(key));
    }

    /**
     * @return the first key of the map.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2309)
    public DefinitionName getTmNamedObjFirstKey(){
        return(((NamedObjTMDMO) core).getTmNamedObjFirstKey());
    }

    /**
     * @return An Iterable of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2333)
    public ObjWithRefsIterableDMW getTmNamedObjIterable(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        Iterator<ObjWithRefsREF> it = ((NamedObjTMDMO) core).getTmNamedObj();
        
        if (it == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(it));
    }

    /**
     * Adds another tmNamedObj value.
     * @param value ObjWithRefsDMW
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2367)
    public DmcAttribute<?> addTmNamedObj(ObjWithRefs value) {
        return(((NamedObjTMDMO) core).addTmNamedObj(value.getDMO()));
    }

    /**
     * Deletes a tmNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2391)
    public void delTmNamedObj(ObjWithRefs value){
        ((NamedObjTMDMO) core).delTmNamedObj(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2437)
    public TreeMap<DefinitionName,ObjWithRefs> getTmNamedObjCopy(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(new TreeMap<DefinitionName,ObjWithRefs>());
        
        TreeMap<DefinitionName,ObjWithRefs> rc = new TreeMap<DefinitionName,ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getTmNamedObjIterable();
        while(it.hasNext()){
            ObjWithRefs obj = it.next();
            rc.put((DefinitionName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the tmNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2593)
    public void remTmNamedObj(){
        ((NamedObjTMDMO) core).remTmNamedObj();
    }


}
