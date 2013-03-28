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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmp.server.extended.LoginResponse;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:949)
import org.dmd.dmp.server.extended.Response;                      // Derived class - (BaseDMWGeneratorNewest.java:1117)
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)


/**
 * The LoginResponse is returned after a Login request is received. If the\n
 * login is successful, a session ID will be assigned and a request root will
 * be given. All\n subsequent requests must contain the session ID and all
 * requests will be checked to ensure\n that they pertain to objects at or
 * below the request root.\n <p/>\n The response may also have an
 * originatorID that is a unique identifier assigned by the \n server. In
 * some systems, this identifier will be stamped on all incoming requests
 * and\n passed through to the events that are generated as a result of those
 * requests. In this\n way, a client can tell whether the events it receives
 * came from its own requests or from\n requests made by other clients.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class LoginResponseDMW extends Response {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public LoginResponseDMW() {
        super(new LoginResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LoginResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public LoginResponseDMW(DmcTypeModifierMV mods) {
        super(new LoginResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LoginResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:474)
    public LoginResponse getModificationRecorder(){
        LoginResponse rc = new LoginResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public LoginResponseDMW(LoginResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LoginResponse);
    }

    public LoginResponse cloneIt() {
        LoginResponse rc = new LoginResponse();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public LoginResponseDMO getDMO() {
        return((LoginResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected LoginResponseDMW(LoginResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public Integer getOriginatorID(){
        return(((LoginResponseDMO) core).getOriginatorID());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setOriginatorID(Object value) throws DmcValueException {
        ((LoginResponseDMO) core).setOriginatorID(value);
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setOriginatorID(Integer value){
        ((LoginResponseDMO) core).setOriginatorID(value);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remOriginatorID(){
        ((LoginResponseDMO) core).remOriginatorID();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getRequestRoot(){
        return(((LoginResponseDMO) core).getRequestRoot());
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setRequestRoot(Object value) throws DmcValueException {
        ((LoginResponseDMO) core).setRequestRoot(value);
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setRequestRoot(String value){
        ((LoginResponseDMO) core).setRequestRoot(value);
    }

    /**
     * Removes the requestRoot attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remRequestRoot(){
        ((LoginResponseDMO) core).remRequestRoot();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getSessionID(){
        return(((LoginResponseDMO) core).getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setSessionID(Object value) throws DmcValueException {
        ((LoginResponseDMO) core).setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setSessionID(String value){
        ((LoginResponseDMO) core).setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remSessionID(){
        ((LoginResponseDMO) core).remSessionID();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getUserFQN(){
        return(((LoginResponseDMO) core).getUserFQN());
    }

    /**
     * Sets userFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setUserFQN(Object value) throws DmcValueException {
        ((LoginResponseDMO) core).setUserFQN(value);
    }

    /**
     * Sets userFQN to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setUserFQN(String value){
        ((LoginResponseDMO) core).setUserFQN(value);
    }

    /**
     * Removes the userFQN attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remUserFQN(){
        ((LoginResponseDMO) core).remUserFQN();
    }


}
