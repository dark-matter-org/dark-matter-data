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
import org.dmd.dmp.server.extended.LogoutResponse;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Response;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Attribute from dmp schema
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                              // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor

/**
 * The LogoutResponse will indicate that you have successfully terminated
 * your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class LogoutResponseDMW extends Response {

    public LogoutResponseDMW() {
        super(new LogoutResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutResponse);
    }

    public LogoutResponseDMW(DmcTypeModifierMV mods) {
        super(new LogoutResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutResponse);
    }

    public LogoutResponse getModificationRecorder(){
        LogoutResponse rc = new LogoutResponse();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public LogoutResponseDMW(LogoutResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LogoutResponse);
    }

    public LogoutResponseDMO getDMO() {
        return((LogoutResponseDMO) core);
    }

    protected LogoutResponseDMW(LogoutResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public String getSessionID(){
        return(((LogoutResponseDMO) core).getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setSessionID(Object value) throws DmcValueException {
        ((LogoutResponseDMO) core).setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setSessionID(String value){
        ((LogoutResponseDMO) core).setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remSessionID(){
        ((LogoutResponseDMO) core).remSessionID();
    }


}
