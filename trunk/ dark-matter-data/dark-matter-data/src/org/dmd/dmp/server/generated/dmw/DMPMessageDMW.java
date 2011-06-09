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
package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:922)
import java.util.ArrayList;                                    // To support getMVCopy()
import java.util.Iterator;                                     // To support getMVCopy()
import org.dmd.dmc.*;                                          // If any attributes
import org.dmd.dmp.server.extended.DMPMessage;                 // Required for getModificationRecorder()
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;         // Abstract class
import org.dmd.dms.*;                                          // Always 2
import org.dmd.dms.generated.dmw.IntegerIterableDMW;           // For multi-valued Integer
import org.dmd.dmw.DmwWrapper;                                 // Unnamed object wrapper

/**
 * The DMPMessage class provides a common base for all messages that comprise
 * the Dark Matter Protocol (DMP).
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class DMPMessageDMW extends DmwWrapper {

    protected DMPMessageDMW() {
        super();
    }

    abstract public DMPMessage getModificationRecorder();

    public DMPMessageDMO getDMO() {
        return((DMPMessageDMO) core);
    }

    protected DMPMessageDMW(DMPMessageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public Long getTimeMS(){
        return(((DMPMessageDMO) core).getTimeMS());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setTimeMS(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).setTimeMS(value);
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setTimeMS(Long value){
        ((DMPMessageDMO) core).setTimeMS(value);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remTimeMS(){
        ((DMPMessageDMO) core).remTimeMS();
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1221)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = core.get(DMPMessageDMO.__requestID);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1233)
    public boolean getRequestIDIsEmpty(){
        DmcAttribute<?> attr = core.get(DMPMessageDMO.__requestID);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public boolean getRequestIDHasValue(){
        DmcAttribute<?> attr = core.get(DMPMessageDMO.__requestID);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1357)
    public IntegerIterableDMW getRequestIDIterable(){
        DmcAttribute<?> attr = core.get(DMPMessageDMO.__requestID);
        if (attr == null)
            return(IntegerIterableDMW.emptyList);
        
        return(new IntegerIterableDMW(((DMPMessageDMO) core).getRequestID()));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1373)
    public void addRequestID(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).addRequestID(value);
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1382)
    public void addRequestID(Integer value){
        ((DMPMessageDMO) core).addRequestID(value);
    }

    /**
     * Returns true if the collection contains the requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1406)
    public boolean requestIDContains(Integer value){
        return(((DMPMessageDMO) core).requestIDContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public ArrayList<Integer> getRequestIDCopy(){
        DmcAttribute<?> attr = core.get(DMPMessageDMO.__requestID);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1473)
    public void delRequestID(Object value) throws DmcValueException {
        ((DMPMessageDMO) core).delRequestID(value);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1482)
    public void delRequestID(Integer value){
        ((DMPMessageDMO) core).delRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1494)
    public void remRequestID(){
        ((DMPMessageDMO) core).remRequestID();
    }


}
