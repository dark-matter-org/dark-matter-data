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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmp.server.extended.Response;                         // Derived class
import org.dmd.dmp.shared.generated.dmo.DenotifyResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                                // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                // Required for MODREC constructor

/**
 * The DenotifyResponse is sent as a result of a DenotifyRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class DenotifyResponseDMW extends Response {

    public DenotifyResponseDMW() {
        super(new DenotifyResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyResponse);
    }

    public DenotifyResponseDMW(DmcTypeModifierMV mods) {
        super(new DenotifyResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyResponse);
    }

    public DenotifyResponseDMW(DenotifyResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyResponse);
    }

    protected DenotifyResponseDMW(DenotifyResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }


}
