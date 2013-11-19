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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import org.dmd.dmc.*;                                               // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dmp.server.extended.PreAuthResponse;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:972)
import org.dmd.dmp.server.extended.Response;                        // Derived class - (BaseDMWGenerator.java:1140)
import org.dmd.dmp.shared.generated.dmo.PreAuthResponseDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)
import org.dmd.dms.ClassDefinition;                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (BaseDMWGenerator.java:967)



/**
 * The PreAuthResponse is sent as a result of a PreAuthRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
abstract public class PreAuthResponseDMW extends Response  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public PreAuthResponseDMW() {
        super(new PreAuthResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public PreAuthResponseDMW(DmcTypeModifierMV mods) {
        super(new PreAuthResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:497)
    public PreAuthResponse getModificationRecorder(){
        PreAuthResponse rc = new PreAuthResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public PreAuthResponseDMW(PreAuthResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthResponse);
    }

    public PreAuthResponse cloneIt() {
        PreAuthResponse rc = new PreAuthResponse();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PreAuthResponseDMO getDMO() {
        return((PreAuthResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected PreAuthResponseDMW(PreAuthResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public String getApplicationName(){
        return(((PreAuthResponseDMO) core).getApplicationName());
    }

    /**
     * Sets applicationName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setApplicationName(Object value) throws DmcValueException {
        ((PreAuthResponseDMO) core).setApplicationName(value);
    }

    /**
     * Sets applicationName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setApplicationName(String value){
        ((PreAuthResponseDMO) core).setApplicationName(value);
    }

    /**
     * Removes the applicationName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remApplicationName(){
        ((PreAuthResponseDMO) core).remApplicationName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public String getApplicationVersion(){
        return(((PreAuthResponseDMO) core).getApplicationVersion());
    }

    /**
     * Sets applicationVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setApplicationVersion(Object value) throws DmcValueException {
        ((PreAuthResponseDMO) core).setApplicationVersion(value);
    }

    /**
     * Sets applicationVersion to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setApplicationVersion(String value){
        ((PreAuthResponseDMO) core).setApplicationVersion(value);
    }

    /**
     * Removes the applicationVersion attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remApplicationVersion(){
        ((PreAuthResponseDMO) core).remApplicationVersion();
    }


}
