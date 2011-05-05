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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import org.dmd.dmc.*;                                             // If any attributes
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
abstract public class LoginResponseDMW extends Response {

    public LoginResponseDMW() {
        super(new LoginResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LoginResponse);
    }

    public LoginResponseDMW(DmcTypeModifierMV mods) {
        super(new LoginResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LoginResponse);
    }

    public LoginResponse getModificationRecorder(){
        LoginResponse rc = new LoginResponse();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public LoginResponseDMW(LoginResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LoginResponse);
    }

    public LoginResponseDMO getDMO() {
        return((LoginResponseDMO) core);
    }

    protected LoginResponseDMW(LoginResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getSessionID(){
        return(((LoginResponseDMO) core).getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSessionID(Object value) throws DmcValueException {
        ((LoginResponseDMO) core).setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSessionID(String value){
        ((LoginResponseDMO) core).setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSessionID(){
        ((LoginResponseDMO) core).remSessionID();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getRequestRoot(){
        return(((LoginResponseDMO) core).getRequestRoot());
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setRequestRoot(Object value) throws DmcValueException {
        ((LoginResponseDMO) core).setRequestRoot(value);
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setRequestRoot(String value){
        ((LoginResponseDMO) core).setRequestRoot(value);
    }

    /**
     * Removes the requestRoot attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remRequestRoot(){
        ((LoginResponseDMO) core).remRequestRoot();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getUserFQN(){
        return(((LoginResponseDMO) core).getUserFQN());
    }

    /**
     * Sets userFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setUserFQN(Object value) throws DmcValueException {
        ((LoginResponseDMO) core).setUserFQN(value);
    }

    /**
     * Sets userFQN to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setUserFQN(String value){
        ((LoginResponseDMO) core).setUserFQN(value);
    }

    /**
     * Removes the userFQN attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remUserFQN(){
        ((LoginResponseDMO) core).remUserFQN();
    }


}
