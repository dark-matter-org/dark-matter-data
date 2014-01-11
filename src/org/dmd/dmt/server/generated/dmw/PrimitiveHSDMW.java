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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.HashSet;                                       // To support getMVCopy() - (BaseDMWGenerator.java:1200)
import java.util.Iterator;                                      // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.ClassDefinition;                             // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.dmw.StringIterableDMW;             // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;               // Attribute hsString from the dmt schema - (BaseDMWGenerator.java:897)
import org.dmd.dmt.shared.generated.dmo.PrimitiveHSDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmw.DmwWrapper;                                  // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class PrimitiveHSDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public PrimitiveHSDMW() {
        super(new PrimitiveHSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public PrimitiveHSDMW(DmcTypeModifierMV mods) {
        super(new PrimitiveHSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public PrimitiveHSDMW getModificationRecorder(){
        PrimitiveHSDMW rc = new PrimitiveHSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public PrimitiveHSDMW(PrimitiveHSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveHS);
    }

    public PrimitiveHSDMW cloneIt() {
        PrimitiveHSDMW rc = new PrimitiveHSDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PrimitiveHSDMO getDMO() {
        return((PrimitiveHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected PrimitiveHSDMW(PrimitiveHSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getHsStringSize(){
        return(((PrimitiveHSDMO) core).getHsStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getHsStringIsEmpty(){
        if (((PrimitiveHSDMO) core).getHsStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getHsStringHasValue(){
        if (((PrimitiveHSDMO) core).getHsStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public StringIterableDMW getHsStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((PrimitiveHSDMO) core).getHsString()));
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addHsString(Object value) throws DmcValueException {
        ((PrimitiveHSDMO) core).addHsString(value);
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addHsString(String value){
        ((PrimitiveHSDMO) core).addHsString(value);
    }

    /**
     * Returns true if the collection contains the hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean hsStringContains(String value){
        return(((PrimitiveHSDMO) core).hsStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public HashSet<String> getHsStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsString);
        if (attr == null)
            return(new HashSet<String>());
        
        HashSet<String> rc = new HashSet<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delHsString(Object value) throws DmcValueException {
        ((PrimitiveHSDMO) core).delHsString(value);
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delHsString(String value){
        ((PrimitiveHSDMO) core).delHsString(value);
    }

    /**
     * Removes the hsString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remHsString(){
        ((PrimitiveHSDMO) core).remHsString();
    }


}
