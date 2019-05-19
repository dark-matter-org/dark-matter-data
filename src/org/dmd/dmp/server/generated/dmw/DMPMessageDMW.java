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
import java.util.ArrayList;                                        // Support for MULTI attribute - (BaseDMWGenerator.java:2116)
import java.util.Iterator;                                         // Support copy of MV objects - (BaseDMWGenerator.java:2130)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmp.server.extended.DMPMessage;                     // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;             // Abstract class - (BaseDMWGenerator.java:1120)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Attribute requestID from the dmp schema - (BaseDMWGenerator.java:910)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Attribute nvp from the meta schema - (BaseDMWGenerator.java:910)
import org.dmd.dms.generated.dmw.IntegerIterableDMW;               // For multi-valued Integer - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.dmw.NameValuePairIterableDMW;         // For multi-valued NameValuePair - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.types.NameValuePair;                  // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dmw.DmwWrapper;                                     // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * The DMPMessage class provides a common base for all messages that\n
 * comprise the Dark Matter Protocol (DMP).
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class DMPMessageDMW extends DmwWrapper {

    protected DMPMessageDMW() {
        super();
    }

    abstract public DMPMessage getModificationRecorder();

    public DMPMessageDMO getDMO() {
        return((DMPMessageDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected DMPMessageDMW(DMPMessageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of NameValuePair items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getNvpSize(){
        return(((DMPMessageDMO) core).getNvpSize());
    }

    /**
     * @return true if there are no NameValuePairDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getNvpIsEmpty(){
        if (((DMPMessageDMO) core).getNvpSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any NameValuePairDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getNvpHasValue(){
        if (((DMPMessageDMO) core).getNvpSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public NameValuePairIterableDMW getNvpIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__nvp);
        if (attr == null)
            return(NameValuePairIterableDMW.emptyList);
        
        return(new NameValuePairIterableDMW(((DMPMessageDMO) core).getNvp()));
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with NameValuePair
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addNvp(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).addNvp(value);
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with NameValuePair
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addNvp(NameValuePair value){
        ((DMPMessageDMO) core).addNvp(value);
    }

    /**
     * Returns true if the collection contains the nvp value.
     * @param value A value compatible with NameValuePair
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean nvpContains(NameValuePair value){
        return(((DMPMessageDMO) core).nvpContains(value));
    }

    /**
     * @return A COPY of the collection of NameValuePair objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public ArrayList<NameValuePair> getNvpCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__nvp);
        if (attr == null)
            return(new ArrayList<NameValuePair>());
        
        ArrayList<NameValuePair> rc = new ArrayList<NameValuePair>(attr.getMVSize());
        
        Iterator<NameValuePair> it = (Iterator<NameValuePair>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a nvp value.
     * @param value The NameValuePair to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delNvp(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).delNvp(value);
    }

    /**
     * Deletes a nvp value.
     * @param value The NameValuePair to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delNvp(NameValuePair value){
        ((DMPMessageDMO) core).delNvp(value);
    }

    /**
     * Removes the nvp attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remNvp(){
        ((DMPMessageDMO) core).remNvp();
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getRequestIDSize(){
        return(((DMPMessageDMO) core).getRequestIDSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getRequestIDIsEmpty(){
        if (((DMPMessageDMO) core).getRequestIDSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getRequestIDHasValue(){
        if (((DMPMessageDMO) core).getRequestIDSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addRequestID(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).addRequestID(value);
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addRequestID(Integer value){
        ((DMPMessageDMO) core).addRequestID(value);
    }

    /**
     * Returns true if the collection contains the requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean requestIDContains(Integer value){
        return(((DMPMessageDMO) core).requestIDContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delRequestID(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).delRequestID(value);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delRequestID(Integer value){
        ((DMPMessageDMO) core).delRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remRequestID(){
        ((DMPMessageDMO) core).remRequestID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Long getTimeMS(){
        return(((DMPMessageDMO) core).getTimeMS());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setTimeMS(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).setTimeMS(value);
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setTimeMS(Long value){
        ((DMPMessageDMO) core).setTimeMS(value);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remTimeMS(){
        ((DMPMessageDMO) core).remTimeMS();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isTrackingEnabled(){
        return(((DMPMessageDMO) core).isTrackingEnabled());
    }

    /**
     * Sets trackingEnabled to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setTrackingEnabled(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).setTrackingEnabled(value);
    }

    /**
     * Sets trackingEnabled to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setTrackingEnabled(Boolean value){
        ((DMPMessageDMO) core).setTrackingEnabled(value);
    }

    /**
     * Removes the trackingEnabled attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remTrackingEnabled(){
        ((DMPMessageDMO) core).remTrackingEnabled();
    }


}
