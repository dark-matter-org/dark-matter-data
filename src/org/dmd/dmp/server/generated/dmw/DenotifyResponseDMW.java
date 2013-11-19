//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import org.dmd.dmc.*;                                                // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.DmcObjectName;                                    // Alternative type for NameContainer values - (BaseDMWGenerator.java:1077)
import org.dmd.dmc.types.NameContainer;                              // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmp.server.extended.DenotifyResponse;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.dmp.server.extended.Response;                         // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.dmp.shared.generated.dmo.DenotifyResponseDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                 // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dms.ClassDefinition;                                  // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                          // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                // Required for MODREC constructor - (BaseDMWGenerator.java:994)



/**
 * The DenotifyResponse is sent as a result of a DenotifyRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class DenotifyResponseDMW extends Response {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public DenotifyResponseDMW() {
        super(new DenotifyResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public DenotifyResponseDMW(DmcTypeModifierMV mods) {
        super(new DenotifyResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:509)
    public DenotifyResponse getModificationRecorder(){
        DenotifyResponse rc = new DenotifyResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public DenotifyResponseDMW(DenotifyResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyResponse);
    }

    public DenotifyResponse cloneIt() {
        DenotifyResponse rc = new DenotifyResponse();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public DenotifyResponseDMO getDMO() {
        return((DenotifyResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected DenotifyResponseDMW(DenotifyResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getFilter(){
        return(((DenotifyResponseDMO) core).getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setFilter(Object value) throws DmcValueException {
        ((DenotifyResponseDMO) core).setFilter(value);
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setFilter(String value){
        ((DenotifyResponseDMO) core).setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remFilter(){
        ((DenotifyResponseDMO) core).remFilter();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public ScopeEnum getScope(){
        return(((DenotifyResponseDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setScope(Object value) throws DmcValueException {
        ((DenotifyResponseDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setScope(ScopeEnum value){
        ((DenotifyResponseDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remScope(){
        ((DenotifyResponseDMO) core).remScope();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public NameContainer getTarget(){
        return(((DenotifyResponseDMO) core).getTarget());
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setTarget(Object value) throws DmcValueException {
        ((DenotifyResponseDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setTarget(NameContainer value){
        ((DenotifyResponseDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1526)
    public void setTarget(DmcObjectName value){
        ((DenotifyResponseDMO) core).setTarget(value);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remTarget(){
        ((DenotifyResponseDMO) core).remTarget();
    }


}
