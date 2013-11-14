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
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import org.dmd.dmp.server.extended.NotifyResponse;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:972)
import org.dmd.dmp.server.extended.Response;                       // Derived class - (BaseDMWGeneratorNewest.java:1140)
import org.dmd.dmp.shared.generated.dmo.NotifyResponseDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)


/**
 * The NotifyResponse is sent as the result of a NotifyRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
abstract public class NotifyResponseDMW extends Response  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public NotifyResponseDMW() {
        super(new NotifyResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public NotifyResponseDMW(DmcTypeModifierMV mods) {
        super(new NotifyResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:497)
    public NotifyResponse getModificationRecorder(){
        NotifyResponse rc = new NotifyResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public NotifyResponseDMW(NotifyResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._NotifyResponse);
    }

    public NotifyResponse cloneIt() {
        NotifyResponse rc = new NotifyResponse();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NotifyResponseDMO getDMO() {
        return((NotifyResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected NotifyResponseDMW(NotifyResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }


}
