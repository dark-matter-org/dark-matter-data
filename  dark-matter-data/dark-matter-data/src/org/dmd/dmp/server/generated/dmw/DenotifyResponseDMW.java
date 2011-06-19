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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:925)
import org.dmd.dmc.*;                                                // If any attributes
import org.dmd.dmc.DmcObjectName;                                    // Alternative type for NameContainer values
import org.dmd.dmc.types.NameContainer;                              // Primitive type
import org.dmd.dmp.server.extended.DenotifyResponse;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Response;                         // Derived class
import org.dmd.dmp.shared.generated.dmo.DenotifyResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                 // Primitive type
import org.dmd.dms.*;                                                // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                // Required for MODREC constructor

/**
 * The DenotifyResponse is sent as a result of a DenotifyRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class DenotifyResponseDMW extends Response {

    public DenotifyResponseDMW() {
        super(new DenotifyResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyResponse);
    }

    public DenotifyResponseDMW(DmcTypeModifierMV mods) {
        super(new DenotifyResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyResponse);
    }

    public DenotifyResponse getModificationRecorder(){
        DenotifyResponse rc = new DenotifyResponse();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public DenotifyResponseDMW(DenotifyResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyResponse);
    }

    public DenotifyResponseDMO getDMO() {
        return((DenotifyResponseDMO) core);
    }

    protected DenotifyResponseDMW(DenotifyResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public NameContainer getTarget(){
        return(((DenotifyResponseDMO) core).getTarget());
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setTarget(Object value) throws DmcValueException {
        ((DenotifyResponseDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setTarget(NameContainer value){
        ((DenotifyResponseDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setTarget(DmcObjectName value){
        ((DenotifyResponseDMO) core).setTarget(value);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remTarget(){
        ((DenotifyResponseDMO) core).remTarget();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public ScopeEnum getScope(){
        return(((DenotifyResponseDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setScope(Object value) throws DmcValueException {
        ((DenotifyResponseDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setScope(ScopeEnum value){
        ((DenotifyResponseDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remScope(){
        ((DenotifyResponseDMO) core).remScope();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public String getFilter(){
        return(((DenotifyResponseDMO) core).getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setFilter(Object value) throws DmcValueException {
        ((DenotifyResponseDMO) core).setFilter(value);
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setFilter(String value){
        ((DenotifyResponseDMO) core).setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remFilter(){
        ((DenotifyResponseDMO) core).remFilter();
    }


}
