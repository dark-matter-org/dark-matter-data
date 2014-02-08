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
import org.dmd.dmc.*;                                                // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.ClassDefinition;                                  // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                          // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.server.extended.ObjWithRefs;                      // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVIDXDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmt.shared.generated.types.SomeRelation;              // For setNth of SomeRelation - (BaseDMWGenerator.java:1914)
import org.dmd.dmw.DmwWrapper;                                       // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class ExtendedRefMVIDXDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public ExtendedRefMVIDXDMW() {
        super(new ExtendedRefMVIDXDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefMVIDX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public ExtendedRefMVIDXDMW(DmcTypeModifierMV mods) {
        super(new ExtendedRefMVIDXDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefMVIDX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public ExtendedRefMVIDXDMW getModificationRecorder(){
        ExtendedRefMVIDXDMW rc = new ExtendedRefMVIDXDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public ExtendedRefMVIDXDMW(ExtendedRefMVIDXDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefMVIDX);
    }

    public ExtendedRefMVIDXDMW cloneIt() {
        ExtendedRefMVIDXDMW rc = new ExtendedRefMVIDXDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ExtendedRefMVIDXDMO getDMO() {
        return((ExtendedRefMVIDXDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected ExtendedRefMVIDXDMW(ExtendedRefMVIDXDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getMvIdxExtendedRefSize(){
        return(((ExtendedRefMVIDXDMO) core).getMvIdxExtendedRefSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getMvIdxExtendedRefIsEmpty(){
        if (((ExtendedRefMVIDXDMO) core).getMvIdxExtendedRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getMvIdxExtendedRefHasValue(){
        if (((ExtendedRefMVIDXDMO) core).getMvIdxExtendedRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the mvIdxExtendedRef value at the specified index.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1921)
    public DmcAttribute<?> setNthMvIdxExtendedRef(int index, SomeRelation value){
        return(((ExtendedRefMVIDXDMO) core).setNthMvIdxExtendedRef(index, value));
    }

    /**
     * @return The SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2011)
    public ObjWithRefs getNthMvIdxExtendedRef(int index){
        SomeRelation ref = ((ExtendedRefMVIDXDMO) core).getNthMvIdxExtendedRef(index);
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * @return The reference to the SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2057)
    public SomeRelation getNthMvIdxExtendedRefREF(int index){
        SomeRelation ref = ((ExtendedRefMVIDXDMO) core).getNthMvIdxExtendedRefREF(index);
        return(ref);
    }

    /**
     * Removes the mvIdxExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remMvIdxExtendedRef(){
        ((ExtendedRefMVIDXDMO) core).remMvIdxExtendedRef();
    }


}
