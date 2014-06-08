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

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:101)
import java.io.Serializable;                                        // Always required - (ImportUtil.java:300)
import java.util.*;                                                 // Always required if we have any MV attributes - (ImportUtil.java:297)
import org.dmd.core.DmcAttribute;                                   // Any attributes - (ImportUtil.java:309)
import org.dmd.core.DmcObject;                                      // Structural class - (ImportUtil.java:408)
import org.dmd.core.feedback.DMFeedbackSet;                         // Any attributes - (ImportUtil.java:310)
import org.dmd.dms.shared.generated.types.DmcTypeBooleanSV;         // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.generated.types.DmcTypeIntegerMV;         // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.generated.types.DmcTypeLongSV;            // Required type - (ImportUtil.java:386)

// Generated from: org.dmd.dms.tools.dmogen.DmoFormatter.getClassHeader(DmoFormatter.java:360)
/**
 * The DMPMessage class provides a common base for all messages that

 * comprise the Dark Matter Protocol (DMP).
 * <P>
 * Generated from the dmp schema
 * <P>
 * This code was auto-generated by the dmogen utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.tools.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:103)
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

    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public Long getTimeMS(){
        DmcTypeLongSV attr = (DmcTypeLongSV) get(DmpCompactSchema.__timeMS);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setTimeMS(Long value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__timeMS);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpCompactSchema.__timeMS);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__timeMS,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLongSV
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setTimeMS(Object value) throws DMFeedbackSet {
        DmcTypeLongSV attr  = (DmcTypeLongSV) get(DmpCompactSchema.__timeMS);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpCompactSchema.__timeMS);
        
        attr.set(value);
        set(DmpCompactSchema.__timeMS,attr);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remTimeMS(){
         rem(DmpCompactSchema.__timeMS);
    }

    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public Boolean isTrackingEnabled(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpCompactSchema.__trackingEnabled);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets trackingEnabled to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setTrackingEnabled(Boolean value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__trackingEnabled);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpCompactSchema.__trackingEnabled);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__trackingEnabled,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets trackingEnabled to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setTrackingEnabled(Object value) throws DMFeedbackSet {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpCompactSchema.__trackingEnabled);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpCompactSchema.__trackingEnabled);
        
        attr.set(value);
        set(DmpCompactSchema.__trackingEnabled,attr);
    }

    /**
     * Removes the trackingEnabled attribute value.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remTrackingEnabled(){
         rem(DmpCompactSchema.__trackingEnabled);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:493)
    public Iterator<Integer> getRequestID(){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmpCompactSchema.__requestID);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Integer value.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:505)
    public Integer getNthRequestID(int i){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmpCompactSchema.__requestID);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another requestID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:519)
    public DmcAttribute<?> addRequestID(Integer value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmpCompactSchema.__requestID);
        
        try{
            setLastValue(attr.add(value));
            add(DmpCompactSchema.__requestID,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Integer.
     * @param value Integer
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:594)
    public boolean requestIDContains(Integer value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__requestID);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:626)
    public DmcAttribute<?> addRequestID(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(DmpCompactSchema.__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmpCompactSchema.__requestID);
        
        setLastValue(attr.add(value));
        add(DmpCompactSchema.__requestID,attr);
        return(attr);
    }

    /**
     * Returns the number of values in requestID
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:643)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = get(DmpCompactSchema.__requestID);
        if (attr == null){
            if (DmpCompactSchema.__requestID.indexSize == 0)
                return(0);
            else
                return(DmpCompactSchema.__requestID.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:700)
    public DmcAttribute<?> delRequestID(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(DmpCompactSchema.__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmpCompactSchema.__requestID), value);
        else
            attr = del(DmpCompactSchema.__requestID, value);
        
        return(attr);
    }

    /**
     * Deletes a requestID from the specified value.
     * @param value Integer
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:716)
    public DmcAttribute<?> delRequestID(Integer value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmpCompactSchema.__requestID), value);
        else
            attr = del(DmpCompactSchema.__requestID, value);
        
        return(attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:735)
    public void remRequestID(){
         rem(DmpCompactSchema.__requestID);
    }




}
