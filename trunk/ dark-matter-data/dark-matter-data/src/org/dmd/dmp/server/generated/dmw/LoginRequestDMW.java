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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import org.dmd.dmc.*;                                              // If any attributes
import org.dmd.dmp.server.extended.LoginRequest;                   // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                        // Derived class
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;           // Class not auxiliary or abstract
import org.dmd.dmr.shared.base.generated.dmo.DmrBaseDMSAG;         // Attribute from dmr.base schema
import org.dmd.dms.*;                                              // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor

/**
 * The LoginRequest allows you to connect to connect to something and pass
 * along credentials.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class LoginRequestDMW extends Request {

    public LoginRequestDMW() {
        super(new LoginRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LoginRequest);
    }

    public LoginRequestDMW(DmcTypeModifierMV mods) {
        super(new LoginRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LoginRequest);
    }

    public LoginRequest getModificationRecorder(){
        LoginRequest rc = new LoginRequest();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public LoginRequestDMW(LoginRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LoginRequest);
    }

    public LoginRequestDMO getDMO() {
        return((LoginRequestDMO) core);
    }

    protected LoginRequestDMW(LoginRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public String getUserName(){
        return(((LoginRequestDMO) core).getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setUserName(Object value) throws DmcValueException {
        ((LoginRequestDMO) core).setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setUserName(String value){
        ((LoginRequestDMO) core).setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remUserName(){
        ((LoginRequestDMO) core).remUserName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public String getPassword(){
        return(((LoginRequestDMO) core).getPassword());
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setPassword(Object value) throws DmcValueException {
        ((LoginRequestDMO) core).setPassword(value);
    }

    /**
     * Sets password to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setPassword(String value){
        ((LoginRequestDMO) core).setPassword(value);
    }

    /**
     * Removes the password attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remPassword(){
        ((LoginRequestDMO) core).remPassword();
    }


}
