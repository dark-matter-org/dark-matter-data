//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmp.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                 // Always required - (GenUtility.java:224)
import java.util.*;                                          // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                             // Any attributes - (GenUtility.java:240)
import org.dmd.dmc.DmcObject;                                // Structural class - (GenUtility.java:351)
import org.dmd.dmc.DmcValueException;                        // Any attributes - (GenUtility.java:241)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;         // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeIntegerMV;         // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeLongSV;            // Required type - (GenUtility.java:328)

/**
 * The DMPMessage class provides a common base for all messages that\n
 * comprise the Dark Matter Protocol (DMP).
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class DMPMessageDMO  extends DmcObject  implements de.novanic.eventservice.client.event.Event, Serializable  {

    public final static String constructionClassName = "DMPMessage";


    static {
    }

    public DMPMessageDMO() {
        super("DMPMessage");
    }

    protected DMPMessageDMO(String oc) {
        super(oc);
    }

    @Override
    public boolean supportsBackrefTracking(){
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public Long getTimeMS(){
        DmcTypeLongSV attr = (DmcTypeLongSV) get(DmpDMSAG.__timeMS);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setTimeMS(Long value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__timeMS);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpDMSAG.__timeMS);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__timeMS,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLongSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setTimeMS(Object value) throws DmcValueException {
        DmcTypeLongSV attr  = (DmcTypeLongSV) get(DmpDMSAG.__timeMS);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpDMSAG.__timeMS);
        
        attr.set(value);
        set(DmpDMSAG.__timeMS,attr);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remTimeMS(){
         rem(DmpDMSAG.__timeMS);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public Boolean isTrackingEnabled(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpDMSAG.__trackingEnabled);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets trackingEnabled to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setTrackingEnabled(Boolean value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__trackingEnabled);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__trackingEnabled);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__trackingEnabled,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets trackingEnabled to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setTrackingEnabled(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpDMSAG.__trackingEnabled);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__trackingEnabled);
        
        attr.set(value);
        set(DmpDMSAG.__trackingEnabled,attr);
    }

    /**
     * Removes the trackingEnabled attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remTrackingEnabled(){
         rem(DmpDMSAG.__trackingEnabled);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<Integer> getRequestID(){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmpDMSAG.__requestID);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Integer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public Integer getNthRequestID(int i){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmpDMSAG.__requestID);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another requestID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
    public DmcAttribute<?> addRequestID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmpDMSAG.__requestID);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__requestID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Integer.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean requestIDContains(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmpDMSAG.__requestID);
        
        setLastValue(attr.add(value));
        add(DmpDMSAG.__requestID,attr);
        return(attr);
    }

    /**
     * Returns the number of values in requestID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null){
            if (DmpDMSAG.__requestID.indexSize == 0)
                return(0);
            else
                return(DmpDMSAG.__requestID.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
    public DmcAttribute<?> delRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmpDMSAG.__requestID), value);
        else
            attr = del(DmpDMSAG.__requestID, value);
        
        return(attr);
    }

    /**
     * Deletes a requestID from the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
    public DmcAttribute<?> delRequestID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmpDMSAG.__requestID), value);
        else
            attr = del(DmpDMSAG.__requestID, value);
        
        return(attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remRequestID(){
         rem(DmpDMSAG.__requestID);
    }




}
