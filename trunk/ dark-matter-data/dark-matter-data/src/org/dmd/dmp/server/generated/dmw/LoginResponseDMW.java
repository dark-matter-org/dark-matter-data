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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:842)
import org.dmd.dmc.*;                                             // If any attributes
import org.dmd.dmc.types.IntegerName;                             // Primitive type
import org.dmd.dmp.server.extended.LoginResponse;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Response;                      // Derived class
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                             // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor

/**
 * The LoginResponse is returned after a Login request is received. If the
 * login is successful, a session ID will be assigned and a request root will
 * be given. All subsequent requests must contain the session ID and all
 * requests will be checked to ensure that they pertain to objects at or
 * below the request root.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class LoginResponseDMW extends Response implements DmcNamedObjectIF {

    private LoginResponseDMO mycore;

    public LoginResponseDMW() {
        super(new LoginResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LoginResponse);
        mycore = (LoginResponseDMO) core;
        mycore.setContainer(this);
    }

    public LoginResponseDMW(DmcTypeModifierMV mods) {
        super(new LoginResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LoginResponse);
        mycore = (LoginResponseDMO) core;
        mycore.setContainer(this);
    }

    public LoginResponse getModificationRecorder(){
        LoginResponse rc = new LoginResponse();
        rc.setDmcObject(new LoginResponseDMO(new DmcTypeModifierMV()));
        rc.setRequestID(getRequestID());
        return(rc);
    }

    public LoginResponseDMW(LoginResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LoginResponse);
        mycore = (LoginResponseDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (LoginResponseDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public LoginResponseDMO getDMO() {
        return(mycore);
    }

    protected LoginResponseDMW(LoginResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (LoginResponseDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:868)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof LoginResponseDMW){
            return( getObjectName().equals( ((LoginResponseDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public String getSessionID(){
        return(mycore.getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setSessionID(Object value) throws DmcValueException {
        mycore.setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setSessionID(String value){
        mycore.setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remSessionID(){
        mycore.remSessionID();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public String getRequestRoot(){
        return(mycore.getRequestRoot());
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setRequestRoot(Object value) throws DmcValueException {
        mycore.setRequestRoot(value);
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setRequestRoot(String value){
        mycore.setRequestRoot(value);
    }

    /**
     * Removes the requestRoot attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remRequestRoot(){
        mycore.remRequestRoot();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public String getUserFQN(){
        return(mycore.getUserFQN());
    }

    /**
     * Sets userFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setUserFQN(Object value) throws DmcValueException {
        mycore.setUserFQN(value);
    }

    /**
     * Sets userFQN to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setUserFQN(String value){
        mycore.setUserFQN(value);
    }

    /**
     * Removes the userFQN attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remUserFQN(){
        mycore.remUserFQN();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remRequestID(){
        mycore.remRequestID();
    }


}