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
import org.dmd.dmp.server.extended.PreAuthRequest;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:947)
import org.dmd.dmp.server.extended.Request;                        // Derived class - (BaseDMWGeneratorNewest.java:1115)
import org.dmd.dmp.shared.generated.dmo.PreAuthRequestDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.dms.*;                                              // Always 2 - (BaseDMWGeneratorNewest.java:939)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)


/**
 * The PreAuthRequest allows for the retrieval of information from the
 * servlet before a user has authenticated. Exactly what type of information
 * can be  retrieved is application specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class PreAuthRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public PreAuthRequestDMW() {
        super(new PreAuthRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public PreAuthRequestDMW(DmcTypeModifierMV mods) {
        super(new PreAuthRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:474)
    public PreAuthRequest getModificationRecorder(){
        PreAuthRequest rc = new PreAuthRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public PreAuthRequestDMW(PreAuthRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthRequest);
    }

    public PreAuthRequestDMO getDMO() {
        return((PreAuthRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected PreAuthRequestDMW(PreAuthRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }


}
