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
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:975)
import org.dmd.dmp.server.extended.LogoutRequest;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmp.server.extended.Request;                       // Derived class - (BaseDMWGenerator.java:1136)
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1140)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:948)



/**
 * The LogoutRequest allows you to disconnect from your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class LogoutRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public LogoutRequestDMW() {
        super(new LogoutRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public LogoutRequestDMW(DmcTypeModifierMV mods) {
        super(new LogoutRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:604)
    public LogoutRequest getModificationRecorder(){
        LogoutRequest rc = new LogoutRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public LogoutRequestDMW(LogoutRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
    }

    public LogoutRequest cloneIt() {
        LogoutRequest rc = new LogoutRequest();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public LogoutRequestDMO getDMO() {
        return((LogoutRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected LogoutRequestDMW(LogoutRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public String getSessionID(){
        return(((LogoutRequestDMO) core).getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setSessionID(Object value) throws DmcValueException {
        ((LogoutRequestDMO) core).setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setSessionID(String value){
        ((LogoutRequestDMO) core).setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remSessionID(){
        ((LogoutRequestDMO) core).remSessionID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public String getUserName(){
        return(((LogoutRequestDMO) core).getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setUserName(Object value) throws DmcValueException {
        ((LogoutRequestDMO) core).setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setUserName(String value){
        ((LogoutRequestDMO) core).setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remUserName(){
        ((LogoutRequestDMO) core).remUserName();
    }


}
