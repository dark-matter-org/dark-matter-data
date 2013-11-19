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
import java.util.HashMap;                                           // To support getMVCopy() - (BaseDMWGenerator.java:1105)
import java.util.Iterator;                                          // Support copy of MV objects - (BaseDMWGenerator.java:2572)
import org.dmd.dmc.*;                                               // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.types.StringToString;                            // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dms.ClassDefinition;                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.dmw.StringToStringIterableDMW;         // For multi-valued StringToString - (BaseDMWGenerator.java:2485)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                   // Attribute hmString from the dmt schema - (BaseDMWGenerator.java:821)
import org.dmd.dmt.shared.generated.dmo.PrimitiveHMDMO;             // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dmw.DmwWrapper;                                      // Unnamed object wrapper - (BaseDMWGenerator.java:1154)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class PrimitiveHMDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public PrimitiveHMDMW() {
        super(new PrimitiveHMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public PrimitiveHMDMW(DmcTypeModifierMV mods) {
        super(new PrimitiveHMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:517)
    public PrimitiveHMDMW getModificationRecorder(){
        PrimitiveHMDMW rc = new PrimitiveHMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public PrimitiveHMDMW(PrimitiveHMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveHM);
    }

    public PrimitiveHMDMW cloneIt() {
        PrimitiveHMDMW rc = new PrimitiveHMDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PrimitiveHMDMO getDMO() {
        return((PrimitiveHMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected PrimitiveHMDMW(PrimitiveHMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2263)
    public int getHmStringSize(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2275)
    public boolean getHmStringIsEmpty(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2287)
    public boolean getHmStringHasValue(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed StringToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2303)
    public StringToString getHmString(Object key){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(null);
        
        return((StringToString)attr.getByKey(key));
    }

    /**
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2490)
    public StringToStringIterableDMW getHmStringIterable(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(StringToStringIterableDMW.emptyList);
        
        return(new StringToStringIterableDMW(((PrimitiveHMDMO) core).getHmString()));
    }

    /**
     * Adds another hmString value.
     * @param value A value compatible with StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2517)
    public void addHmString(Object value) throws DmcValueException {
        ((PrimitiveHMDMO) core).addHmString(value);
    }

    /**
     * Adds another hmString value.
     * @param value StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2526)
    public void addHmString(StringToString value) {
        ((PrimitiveHMDMO) core).addHmString(value);
    }

    /**
     * Deletes a hmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2538)
    public void delHmString(Object value){
        ((PrimitiveHMDMO) core).delHmString(value);
    }

    /**
     * Deletes a hmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2547)
    public void delHmString(String value){
        ((PrimitiveHMDMO) core).delHmString(value);
    }

    /**
     * @return A COPY of the collection of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2577)
    @SuppressWarnings("unchecked")
    public HashMap<String,StringToString> getHmStringCopy(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(new HashMap<String,StringToString>());
        
        HashMap<String,StringToString> rc = new HashMap<String,StringToString>(attr.getMVSize());
        
        Iterator<StringToString> it = (Iterator<StringToString>) attr.getMV();
        while(it.hasNext()){
            StringToString obj = it.next();
            rc.put((String)obj.getKey(),obj);
        }
        
        return(rc);
    }

    /**
     * Removes the hmString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2618)
    public void remHmString(){
        ((PrimitiveHMDMO) core).remHmString();
    }


}
