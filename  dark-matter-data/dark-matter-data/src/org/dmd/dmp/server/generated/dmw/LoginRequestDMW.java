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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:842)
import java.util.ArrayList;                                      // To support getMVCopy()
import java.util.Iterator;                                       // To support getMVCopy()
import org.dmd.dmc.*;                                            // If any attributes
import org.dmd.dmp.server.extended.Request;                      // Derived class
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                            // Always 2
import org.dmd.dms.generated.dmw.IntegerIterableDMW;             // For multi-valued Integer
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor

/**
 * The LoginRequest allows you to connect to connect to something and pass
 * along credentials.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class LoginRequestDMW extends Request {

    private LoginRequestDMO mycore;

    public LoginRequestDMW() {
        super(new LoginRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LoginRequest);
        mycore = (LoginRequestDMO) core;
        mycore.setContainer(this);
    }

    public LoginRequestDMW(DmcTypeModifierMV mods) {
        super(new LoginRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LoginRequest);
        mycore = (LoginRequestDMO) core;
        mycore.setContainer(this);
    }

    public LoginRequestDMW(LoginRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LoginRequest);
        mycore = (LoginRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (LoginRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public LoginRequestDMO getDMO() {
        return(mycore);
    }

    protected LoginRequestDMW(LoginRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (LoginRequestDMO) core;
    }

    /**
     * @return The number of IntegerDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1114)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = mycore.get(LoginRequestDMO.__requestID);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1126)
    public boolean getRequestIDIsEmpty(){
        DmcAttribute<?> attr = mycore.get(LoginRequestDMO.__requestID);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1138)
    public boolean getRequestIDHasValue(){
        DmcAttribute<?> attr = mycore.get(LoginRequestDMO.__requestID);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1249)
    public IntegerIterableDMW getRequestIDIterable(){
        DmcAttribute<?> attr = mycore.get(LoginRequestDMO.__requestID);
        if (attr == null)
            return(IntegerIterableDMW.emptyList);
        
        return(new IntegerIterableDMW(mycore.getRequestID()));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1265)
    public void addRequestID(Object value) throws DmcValueException {
        mycore.addRequestID(value);
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1274)
    public void addRequestID(Integer value){
        mycore.addRequestID(value);
    }

    /**
     * Returns true if the collection contains the requestID value.
     * @param value A value compatible with Integer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1286)
    public boolean requestIDContains(Integer value){
        return(mycore.requestIDContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1314)
    @SuppressWarnings("unchecked")
    public ArrayList<Integer> getRequestIDCopy(){
        DmcAttribute<?> attr = mycore.get(LoginRequestDMO.__requestID);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1341)
    public void delRequestID(Object value) throws DmcValueException {
        mycore.delRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1353)
    public void remRequestID(){
        mycore.remRequestID();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public String getUserName(){
        return(mycore.getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setUserName(Object value) throws DmcValueException {
        mycore.setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setUserName(String value){
        mycore.setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remUserName(){
        mycore.remUserName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public String getPassword(){
        return(mycore.getPassword());
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setPassword(Object value) throws DmcValueException {
        mycore.setPassword(value);
    }

    /**
     * Sets password to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setPassword(String value){
        mycore.setPassword(value);
    }

    /**
     * Removes the password attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remPassword(){
        mycore.remPassword();
    }


}
