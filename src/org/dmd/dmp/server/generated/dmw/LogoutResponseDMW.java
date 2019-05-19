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
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmp.server.extended.LogoutResponse;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmp.server.extended.Response;                       // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGenerator.java:948)



/**
 * The LogoutResponse will indicate that you have successfully terminated\n
 * your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class LogoutResponseDMW extends Response {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public LogoutResponseDMW() {
        super(new LogoutResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public LogoutResponseDMW(DmcTypeModifierMV mods) {
        super(new LogoutResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:604)
    public LogoutResponse getModificationRecorder(){
        LogoutResponse rc = new LogoutResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public LogoutResponseDMW(LogoutResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LogoutResponse);
    }

    public LogoutResponse cloneIt() {
        LogoutResponse rc = new LogoutResponse();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public LogoutResponseDMO getDMO() {
        return((LogoutResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected LogoutResponseDMW(LogoutResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getSessionID(){
        return(((LogoutResponseDMO) core).getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSessionID(Object value) throws DmcValueException {
        ((LogoutResponseDMO) core).setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSessionID(String value){
        ((LogoutResponseDMO) core).setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSessionID(){
        ((LogoutResponseDMO) core).remSessionID();
    }


}
