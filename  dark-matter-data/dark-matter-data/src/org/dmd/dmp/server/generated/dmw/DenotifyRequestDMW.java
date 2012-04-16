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

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:952)
import org.dmd.dmc.*;                                               // If any attributes
import org.dmd.dmc.DmcObjectName;                                   // Alternative type for NameContainer values
import org.dmd.dmc.types.NameContainer;                             // Primitive type
import org.dmd.dmp.server.extended.DenotifyRequest;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                         // Derived class
import org.dmd.dmp.shared.generated.dmo.DenotifyRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                // Primitive type
import org.dmd.dms.*;                                               // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor

/**
 * The DenotifyRequest allows you to deregister for event notification on one
 * or more objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:365)
 */
abstract public class DenotifyRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:442)
    public DenotifyRequestDMW() {
        super(new DenotifyRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:448)
    public DenotifyRequestDMW(DmcTypeModifierMV mods) {
        super(new DenotifyRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:469)
    public DenotifyRequest getModificationRecorder(){
        DenotifyRequest rc = new DenotifyRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:511)
    public DenotifyRequestDMW(DenotifyRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyRequest);
    }

    public DenotifyRequestDMO getDMO() {
        return((DenotifyRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:528)
    protected DenotifyRequestDMW(DenotifyRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1147)
    public Long getListenerID(){
        return(((DenotifyRequestDMO) core).getListenerID());
    }

    /**
     * Sets listenerID to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1230)
    public void setListenerID(Object value) throws DmcValueException {
        ((DenotifyRequestDMO) core).setListenerID(value);
    }

    /**
     * Sets listenerID to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void setListenerID(Long value){
        ((DenotifyRequestDMO) core).setListenerID(value);
    }

    /**
     * Removes the listenerID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1265)
    public void remListenerID(){
        ((DenotifyRequestDMO) core).remListenerID();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1147)
    public ScopeEnum getScope(){
        return(((DenotifyRequestDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1230)
    public void setScope(Object value) throws DmcValueException {
        ((DenotifyRequestDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void setScope(ScopeEnum value){
        ((DenotifyRequestDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1265)
    public void remScope(){
        ((DenotifyRequestDMO) core).remScope();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1147)
    public String getFilter(){
        return(((DenotifyRequestDMO) core).getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1230)
    public void setFilter(Object value) throws DmcValueException {
        ((DenotifyRequestDMO) core).setFilter(value);
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void setFilter(String value){
        ((DenotifyRequestDMO) core).setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1265)
    public void remFilter(){
        ((DenotifyRequestDMO) core).remFilter();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1147)
    public NameContainer getTarget(){
        return(((DenotifyRequestDMO) core).getTarget());
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1230)
    public void setTarget(Object value) throws DmcValueException {
        ((DenotifyRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void setTarget(NameContainer value){
        ((DenotifyRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1253)
    public void setTarget(DmcObjectName value){
        ((DenotifyRequestDMO) core).setTarget(value);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1265)
    public void remTarget(){
        ((DenotifyRequestDMO) core).remTarget();
    }


}
