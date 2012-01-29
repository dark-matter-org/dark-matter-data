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

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:950)
import org.dmd.dmc.*;                                               // If any attributes
import org.dmd.dmp.server.extended.PreAuthResponse;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Response;                        // Derived class
import org.dmd.dmp.shared.generated.dmo.PreAuthResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                               // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor

/**
 * The PreAuthResponse is sent as a result of a PreAuthRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:364)
 */
abstract public class PreAuthResponseDMW extends Response {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:441)
    public PreAuthResponseDMW() {
        super(new PreAuthResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:447)
    public PreAuthResponseDMW(DmcTypeModifierMV mods) {
        super(new PreAuthResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:468)
    public PreAuthResponse getModificationRecorder(){
        PreAuthResponse rc = new PreAuthResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:510)
    public PreAuthResponseDMW(PreAuthResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthResponse);
    }

    public PreAuthResponseDMO getDMO() {
        return((PreAuthResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:527)
    protected PreAuthResponseDMW(PreAuthResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1133)
    public String getApplicationName(){
        return(((PreAuthResponseDMO) core).getApplicationName());
    }

    /**
     * Sets applicationName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1204)
    public void setApplicationName(Object value) throws DmcValueException {
        ((PreAuthResponseDMO) core).setApplicationName(value);
    }

    /**
     * Sets applicationName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1213)
    public void setApplicationName(String value){
        ((PreAuthResponseDMO) core).setApplicationName(value);
    }

    /**
     * Removes the applicationName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void remApplicationName(){
        ((PreAuthResponseDMO) core).remApplicationName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1133)
    public String getApplicationVersion(){
        return(((PreAuthResponseDMO) core).getApplicationVersion());
    }

    /**
     * Sets applicationVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1204)
    public void setApplicationVersion(Object value) throws DmcValueException {
        ((PreAuthResponseDMO) core).setApplicationVersion(value);
    }

    /**
     * Sets applicationVersion to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1213)
    public void setApplicationVersion(String value){
        ((PreAuthResponseDMO) core).setApplicationVersion(value);
    }

    /**
     * Removes the applicationVersion attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void remApplicationVersion(){
        ((PreAuthResponseDMO) core).remApplicationVersion();
    }


}