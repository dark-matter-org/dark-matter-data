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
package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                    // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                     // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                          // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmp.server.extended.DMPMessage;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;         // Abstract class - (BaseDMWGenerator.java:1230)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;              // Attribute requestID from the dmp schema - (BaseDMWGenerator.java:897)
import org.dmd.dms.ClassDefinition;                            // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmw.IntegerIterableDMW;           // For multi-valued Integer - (BaseDMWGenerator.java:2103)
import org.dmd.dmw.DmwWrapper;                                 // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * The DMPMessage class provides a common base for all messages that\n
 * comprise the Dark Matter Protocol (DMP).
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class DMPMessageDMW extends DmwWrapper {

    protected DMPMessageDMW() {
        super();
    }

    abstract public DMPMessage getModificationRecorder();

    public DMPMessageDMO getDMO() {
        return((DMPMessageDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected DMPMessageDMW(DMPMessageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getRequestIDSize(){
        return(((DMPMessageDMO) core).getRequestIDSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getRequestIDIsEmpty(){
        if (((DMPMessageDMO) core).getRequestIDSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getRequestIDHasValue(){
        if (((DMPMessageDMO) core).getRequestIDSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public IntegerIterableDMW getRequestIDIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__requestID);
        if (attr == null)
            return(IntegerIterableDMW.emptyList);
        
        return(new IntegerIterableDMW(((DMPMessageDMO) core).getRequestID()));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addRequestID(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).addRequestID(value);
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addRequestID(Integer value){
        ((DMPMessageDMO) core).addRequestID(value);
    }

    /**
     * Returns true if the collection contains the requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean requestIDContains(Integer value){
        return(((DMPMessageDMO) core).requestIDContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<Integer> getRequestIDCopy(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__requestID);
        if (attr == null)
            return(new ArrayList<Integer>());
        
        ArrayList<Integer> rc = new ArrayList<Integer>(attr.getMVSize());
        
        Iterator<Integer> it = (Iterator<Integer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delRequestID(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).delRequestID(value);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delRequestID(Integer value){
        ((DMPMessageDMO) core).delRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remRequestID(){
        ((DMPMessageDMO) core).remRequestID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public Long getTimeMS(){
        return(((DMPMessageDMO) core).getTimeMS());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setTimeMS(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).setTimeMS(value);
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setTimeMS(Long value){
        ((DMPMessageDMO) core).setTimeMS(value);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remTimeMS(){
        ((DMPMessageDMO) core).remTimeMS();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public Boolean isTrackingEnabled(){
        return(((DMPMessageDMO) core).isTrackingEnabled());
    }

    /**
     * Sets trackingEnabled to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setTrackingEnabled(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).setTrackingEnabled(value);
    }

    /**
     * Sets trackingEnabled to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setTrackingEnabled(Boolean value){
        ((DMPMessageDMO) core).setTrackingEnabled(value);
    }

    /**
     * Removes the trackingEnabled attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remTrackingEnabled(){
        ((DMPMessageDMO) core).remTrackingEnabled();
    }


}
