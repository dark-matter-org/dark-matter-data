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
import org.dmd.dmc.*;                                             // If any attributes
import org.dmd.dmp.server.extended.LogoutRequest;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                             // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor

/**
 * The LogoutRequest allows you to disconnect from your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class LogoutRequestDMW extends Request {

    public LogoutRequestDMW() {
        super(new LogoutRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
    }

    public LogoutRequestDMW(DmcTypeModifierMV mods) {
        super(new LogoutRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
    }

    public LogoutRequest getModificationRecorder(){
        LogoutRequest rc = new LogoutRequest();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public LogoutRequestDMW(LogoutRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
    }

    public LogoutRequestDMO getDMO() {
        return((LogoutRequestDMO) core);
    }

    protected LogoutRequestDMW(LogoutRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getUserName(){
        return(((LogoutRequestDMO) core).getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setUserName(Object value) throws DmcValueException {
        ((LogoutRequestDMO) core).setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setUserName(String value){
        ((LogoutRequestDMO) core).setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remUserName(){
        ((LogoutRequestDMO) core).remUserName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getSessionID(){
        return(((LogoutRequestDMO) core).getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setSessionID(Object value) throws DmcValueException {
        ((LogoutRequestDMO) core).setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setSessionID(String value){
        ((LogoutRequestDMO) core).setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remSessionID(){
        ((LogoutRequestDMO) core).remSessionID();
    }


}
