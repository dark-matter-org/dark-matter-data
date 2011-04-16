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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import java.util.ArrayList;                                        // To support getMVCopy()
import java.util.Iterator;                                         // To support getMVCopy()
import org.dmd.dmc.*;                                              // If any attributes
import org.dmd.dmp.server.extended.Response;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                              // Always 2
import org.dmd.dms.generated.dmw.IntegerIterableDMW;               // For multi-valued Integer
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor

/**
 * The LogoutResponse will indicate that you have successfully terminated
 * your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class LogoutResponseDMW extends Response {

    private LogoutResponseDMO mycore;

    public LogoutResponseDMW() {
        super(new LogoutResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutResponse);
        mycore = (LogoutResponseDMO) core;
        mycore.setContainer(this);
    }

    public LogoutResponseDMW(DmcTypeModifierMV mods) {
        super(new LogoutResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutResponse);
        mycore = (LogoutResponseDMO) core;
        mycore.setContainer(this);
    }

    public LogoutResponseDMW(LogoutResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LogoutResponse);
        mycore = (LogoutResponseDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (LogoutResponseDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public LogoutResponseDMO getDMO() {
        return(mycore);
    }

    protected LogoutResponseDMW(LogoutResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (LogoutResponseDMO) core;
    }

    /**
     * @return The number of IntegerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1136)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = mycore.get(LogoutResponseDMO.__requestID);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1148)
    public boolean getRequestIDIsEmpty(){
        DmcAttribute<?> attr = mycore.get(LogoutResponseDMO.__requestID);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1160)
    public boolean getRequestIDHasValue(){
        DmcAttribute<?> attr = mycore.get(LogoutResponseDMO.__requestID);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1271)
    public IntegerIterableDMW getRequestIDIterable(){
        DmcAttribute<?> attr = mycore.get(LogoutResponseDMO.__requestID);
        if (attr == null)
            return(IntegerIterableDMW.emptyList);
        
        return(new IntegerIterableDMW(mycore.getRequestID()));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1287)
    public void addRequestID(Object value) throws DmcValueException {
        mycore.addRequestID(value);
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1296)
    public void addRequestID(Integer value){
        mycore.addRequestID(value);
    }

    /**
     * Returns true if the collection contains the requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1308)
    public boolean requestIDContains(Integer value){
        return(mycore.requestIDContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1336)
    @SuppressWarnings("unchecked")
    public ArrayList<Integer> getRequestIDCopy(){
        DmcAttribute<?> attr = mycore.get(LogoutResponseDMO.__requestID);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1363)
    public void delRequestID(Object value) throws DmcValueException {
        mycore.delRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1375)
    public void remRequestID(){
        mycore.remRequestID();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1004)
    public String getSessionID(){
        return(mycore.getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public void setSessionID(Object value) throws DmcValueException {
        mycore.setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void setSessionID(String value){
        mycore.setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1086)
    public void remSessionID(){
        mycore.remSessionID();
    }


}
