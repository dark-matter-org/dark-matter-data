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
package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                         // Always required - (GenUtility.java:227)
import java.util.*;                                                  // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                     // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                        // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcSliceInfo;                                     // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.StringToString;                             // Primitive type - (GenUtility.java:282)
import org.dmd.dms.generated.dmo.MetaDMSAG;                          // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringToStringMAP;         // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class PrimitiveHMDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "PrimitiveHM";


    static {
    }

    public PrimitiveHMDMO() {
        super("PrimitiveHM");
    }

    protected PrimitiveHMDMO(String oc) {
        super(oc);
    }

    @Override
    public PrimitiveHMDMO getNew(){
        PrimitiveHMDMO rc = new PrimitiveHMDMO();
        return(rc);
    }

    @Override
    public PrimitiveHMDMO getSlice(DmcSliceInfo info){
        PrimitiveHMDMO rc = new PrimitiveHMDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PrimitiveHMDMO(DmcTypeModifierMV mods) {
        super("PrimitiveHM");
        modrec(true);
        setModifier(mods);
    }

    public PrimitiveHMDMO getModificationRecorder(){
        PrimitiveHMDMO rc = new PrimitiveHMDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of StringToString objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1606)
    public Iterator<StringToString> getHmString(){
        DmcTypeStringToStringMAP attr = (DmcTypeStringToStringMAP) get(DmtDMSAG.__hmString);
        if (attr == null)
            return( ((List<StringToString>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The StringToString associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1638)
    public StringToString getHmString(Object key){
        DmcTypeStringToStringMAP attr = (DmcTypeStringToStringMAP) get(DmtDMSAG.__hmString);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another hmString value.
     * @param value A value compatible with StringToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1676)
    public DmcAttribute<?> addHmString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hmString);
        if (attr == null)
            attr = new DmcTypeStringToStringMAP(DmtDMSAG.__hmString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hmString,attr);
        return(attr);
    }

    /**
     * Adds another hmString value.
     * @param value StringToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1713)
    public DmcAttribute<?> addHmString(StringToString value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hmString);
        if (attr == null)
            attr = new DmcTypeStringToStringMAP(DmtDMSAG.__hmString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hmString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a hmString value.
     * @param key The key of the StringToString to be deleted from the map of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1793)
    public DmcAttribute<?> delHmString(Object key){
        DmcAttribute<?> attr = get(DmtDMSAG.__hmString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringToStringMAP(DmtDMSAG.__hmString), key);
        if (attr == null)
            return(null);
        
        attr = del(DmtDMSAG.__hmString, key);
        
        return(attr);
    }

    /**
     * Deletes a hmString value.
     * @param key the String key value
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1811)
    public DmcAttribute<?> delHmString(String key) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hmString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringToStringMAP(DmtDMSAG.__hmString), key);
        if (attr == null)
            return(null);
        
        attr = del(DmtDMSAG.__hmString, key);
        
        return(attr);
    }

    /**
     * Removes the hmString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1865)
    public void remHmString(){
         rem(DmtDMSAG.__hmString);
    }




}
