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
import java.util.Iterator;                                          // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2545)
import java.util.TreeMap;                                           // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1082)
import org.dmd.dmc.*;                                               // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dmc.types.StringToString;                            // Primitive type - (BaseDMWGeneratorNewest.java:1042)
import org.dmd.dms.ClassDefinition;                                 // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.dmw.StringToStringIterableDMW;         // For multi-valued StringToString - (BaseDMWGeneratorNewest.java:2458)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                   // Attribute tmString from the dmt schema - (BaseDMWGeneratorNewest.java:794)
import org.dmd.dmt.shared.generated.dmo.PrimitiveTMDMO;             // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmw.DmwWrapper;                                      // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1127)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class PrimitiveTMDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public PrimitiveTMDMW() {
        super(new PrimitiveTMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public PrimitiveTMDMW(DmcTypeModifierMV mods) {
        super(new PrimitiveTMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:505)
    public PrimitiveTMDMW getModificationRecorder(){
        PrimitiveTMDMW rc = new PrimitiveTMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public PrimitiveTMDMW(PrimitiveTMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveTM);
    }

    public PrimitiveTMDMW cloneIt() {
        PrimitiveTMDMW rc = new PrimitiveTMDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PrimitiveTMDMO getDMO() {
        return((PrimitiveTMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected PrimitiveTMDMW(PrimitiveTMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2236)
    public int getTmStringSize(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2248)
    public boolean getTmStringIsEmpty(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2260)
    public boolean getTmStringHasValue(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed StringToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2276)
    public StringToString getTmString(Object key){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(null);
        
        return((StringToString)attr.getByKey(key));
    }

    /**
     * @return the first key of the map.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2307)
    public String getTmStringFirstKey(){
        return(((PrimitiveTMDMO) core).getTmStringFirstKey());
    }

    /**
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2463)
    public StringToStringIterableDMW getTmStringIterable(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(StringToStringIterableDMW.emptyList);
        
        return(new StringToStringIterableDMW(((PrimitiveTMDMO) core).getTmString()));
    }

    /**
     * Adds another tmString value.
     * @param value A value compatible with StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2490)
    public void addTmString(Object value) throws DmcValueException {
        ((PrimitiveTMDMO) core).addTmString(value);
    }

    /**
     * Adds another tmString value.
     * @param value StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2499)
    public void addTmString(StringToString value) {
        ((PrimitiveTMDMO) core).addTmString(value);
    }

    /**
     * Deletes a tmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2511)
    public void delTmString(Object value){
        ((PrimitiveTMDMO) core).delTmString(value);
    }

    /**
     * Deletes a tmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2520)
    public void delTmString(String value){
        ((PrimitiveTMDMO) core).delTmString(value);
    }

    /**
     * @return A COPY of the collection of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2550)
    @SuppressWarnings("unchecked")
    public TreeMap<String,StringToString> getTmStringCopy(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(new TreeMap<String,StringToString>());
        
        TreeMap<String,StringToString> rc = new TreeMap<String,StringToString>();
        
        Iterator<StringToString> it = (Iterator<StringToString>) attr.getMV();
        while(it.hasNext()){
            StringToString obj = it.next();
            rc.put((String)obj.getKey(),obj);
        }
        
        return(rc);
    }

    /**
     * Removes the tmString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2591)
    public void remTmString(){
        ((PrimitiveTMDMO) core).remTmString();
    }


}
