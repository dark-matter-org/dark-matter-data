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
import java.util.HashSet;                                                // To support getMVCopy() - (BaseDMWGenerator.java:1115)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.dmt.server.extended.ObjWithRefs;                          // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.dmt.server.generated.dmw.SomeRelationIterableDMW;         // For multi-valued SomeRelation - (BaseDMWGenerator.java:1628)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                        // Attribute from the dmt schema - (BaseDMWGenerator.java:1629)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefHSDMO;                // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // For addition of MV SomeRelation - (BaseDMWGenerator.java:1672)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGenerator.java:1154)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class ExtendedRefHSDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public ExtendedRefHSDMW() {
        super(new ExtendedRefHSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public ExtendedRefHSDMW(DmcTypeModifierMV mods) {
        super(new ExtendedRefHSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:517)
    public ExtendedRefHSDMW getModificationRecorder(){
        ExtendedRefHSDMW rc = new ExtendedRefHSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public ExtendedRefHSDMW(ExtendedRefHSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefHS);
    }

    public ExtendedRefHSDMW cloneIt() {
        ExtendedRefHSDMW rc = new ExtendedRefHSDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ExtendedRefHSDMO getDMO() {
        return((ExtendedRefHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected ExtendedRefHSDMW(ExtendedRefHSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getHsExtendedRefSize(){
        return(((ExtendedRefHSDMO) core).getHsExtendedRefSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getHsExtendedRefIsEmpty(){
        if (((ExtendedRefHSDMO) core).getHsExtendedRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getHsExtendedRefHasValue(){
        if (((ExtendedRefHSDMO) core).getHsExtendedRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1635)
    public SomeRelationIterableDMW getHsExtendedRefIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsExtendedRef);
        if (attr == null)
            return(SomeRelationIterableDMW.emptyList);
        
        return(new SomeRelationIterableDMW(((ExtendedRefHSDMO) core).getHsExtendedRef()));
    }

    /**
     * Adds another hsExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1678)
    public DmcAttribute<?> addHsExtendedRef(SomeRelation value){
        DmcAttribute<?> attr = ((ExtendedRefHSDMO) core).addHsExtendedRef(value);
        return(attr);
    }

    /**
     * Deletes a hsExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1732)
    public void delHsExtendedRef(SomeRelation value){
        ((ExtendedRefHSDMO) core).delHsExtendedRef(value);
    }

    /**
     * @return A COPY of the collection of SomeRelation objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1806)
    public HashSet<ObjWithRefs> getHsExtendedRefCopy(){
        DmcAttribute<?> attr = ((ExtendedRefHSDMO) core).get(DmtDMSAG.__hsExtendedRef);
        if (attr == null)
            return(new HashSet<ObjWithRefs>());
        
        HashSet<ObjWithRefs> rc = new HashSet<ObjWithRefs>();
        
        SomeRelationIterableDMW it = getHsExtendedRefIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the hsExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remHsExtendedRef(){
        ((ExtendedRefHSDMO) core).remHsExtendedRef();
    }


}
