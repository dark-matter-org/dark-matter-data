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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:882)
import org.dmd.dmc.*;                                             // If any attributes
import org.dmd.dmc.DmcObjectName;                                 // Alternative type for NameContainer values
import org.dmd.dmc.types.NameContainer;                           // Primitive type
import org.dmd.dmp.server.extended.DeleteRequest;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ScopeEnum;              // Primitive type
import org.dmd.dms.*;                                             // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor

/**
 * The DeleteRequest allows you to delete one or more objects. If no scope is
 * specified, the scope is assumed to be BASE i.e. just the specific object
 * indicated by the FQN(s). The behaviour of this request is implementation
 * specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class DeleteRequestDMW extends Request {

    public DeleteRequestDMW() {
        super(new DeleteRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
    }

    public DeleteRequestDMW(DmcTypeModifierMV mods) {
        super(new DeleteRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
    }

    public DeleteRequest getModificationRecorder(){
        DeleteRequest rc = new DeleteRequest();
        rc.setDmcObject(new DeleteRequestDMO(new DmcTypeModifierMV()));
        return(rc);
    }

    public DeleteRequestDMW(DeleteRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
    }

    public DeleteRequestDMO getDMO() {
        return((DeleteRequestDMO) core);
    }

    protected DeleteRequestDMW(DeleteRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1047)
    public NameContainer getTarget(){
        return(((DeleteRequestDMO) core).getTarget());
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void setTarget(Object value) throws DmcValueException {
        ((DeleteRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1103)
    public void setTarget(NameContainer value){
        ((DeleteRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1117)
    public void setTarget(DmcObjectName value){
        ((DeleteRequestDMO) core).setTarget(value);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1129)
    public void remTarget(){
        ((DeleteRequestDMO) core).remTarget();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1047)
    public ScopeEnum getScope(){
        return(((DeleteRequestDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void setScope(Object value) throws DmcValueException {
        ((DeleteRequestDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1103)
    public void setScope(ScopeEnum value){
        ((DeleteRequestDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1129)
    public void remScope(){
        ((DeleteRequestDMO) core).remScope();
    }


}
