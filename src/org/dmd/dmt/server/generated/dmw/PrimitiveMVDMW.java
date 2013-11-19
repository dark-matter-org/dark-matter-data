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
import java.util.ArrayList;                                     // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1073)
import java.util.Iterator;                                      // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2132)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dms.ClassDefinition;                             // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.dmw.StringIterableDMW;             // For multi-valued String - (BaseDMWGeneratorNewest.java:1995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;               // Attribute mvString from the dmt schema - (BaseDMWGeneratorNewest.java:794)
import org.dmd.dmt.shared.generated.dmo.PrimitiveMVDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmw.DmwWrapper;                                  // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1127)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class PrimitiveMVDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public PrimitiveMVDMW() {
        super(new PrimitiveMVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public PrimitiveMVDMW(DmcTypeModifierMV mods) {
        super(new PrimitiveMVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:505)
    public PrimitiveMVDMW getModificationRecorder(){
        PrimitiveMVDMW rc = new PrimitiveMVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public PrimitiveMVDMW(PrimitiveMVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveMV);
    }

    public PrimitiveMVDMW cloneIt() {
        PrimitiveMVDMW rc = new PrimitiveMVDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PrimitiveMVDMO getDMO() {
        return((PrimitiveMVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected PrimitiveMVDMW(PrimitiveMVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1563)
    public int getMvStringSize(){
        return(((PrimitiveMVDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public boolean getMvStringIsEmpty(){
        if (((PrimitiveMVDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1581)
    public boolean getMvStringHasValue(){
        if (((PrimitiveMVDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1999)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((PrimitiveMVDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2025)
    public void addMvString(Object value) throws DmcValueException {
        ((PrimitiveMVDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2035)
    public void addMvString(String value){
        ((PrimitiveMVDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2092)
    public boolean mvStringContains(String value){
        return(((PrimitiveMVDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2136)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2163)
    public void delMvString(Object value) throws DmcValueException {
        ((PrimitiveMVDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2172)
    public void delMvString(String value){
        ((PrimitiveMVDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2184)
    public void remMvString(){
        ((PrimitiveMVDMO) core).remMvString();
    }


}
