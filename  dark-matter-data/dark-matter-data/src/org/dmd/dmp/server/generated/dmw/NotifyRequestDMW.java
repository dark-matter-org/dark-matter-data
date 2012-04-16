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
import org.dmd.dmc.*;                                             // If any attributes
import org.dmd.dmc.DmcObjectName;                                 // Alternative type for NameContainer values
import org.dmd.dmc.types.NameContainer;                           // Primitive type
import org.dmd.dmp.server.extended.NotifyRequest;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ScopeEnum;              // Primitive type
import org.dmd.dms.*;                                             // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor

/**
 * The NotifyRequest allows you to register for events on an arbitrary object
 * or set of objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:365)
 */
abstract public class NotifyRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:442)
    public NotifyRequestDMW() {
        super(new NotifyRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:448)
    public NotifyRequestDMW(DmcTypeModifierMV mods) {
        super(new NotifyRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:469)
    public NotifyRequest getModificationRecorder(){
        NotifyRequest rc = new NotifyRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:511)
    public NotifyRequestDMW(NotifyRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._NotifyRequest);
    }

    public NotifyRequestDMO getDMO() {
        return((NotifyRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:528)
    protected NotifyRequestDMW(NotifyRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1147)
    public ScopeEnum getScope(){
        return(((NotifyRequestDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1230)
    public void setScope(Object value) throws DmcValueException {
        ((NotifyRequestDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void setScope(ScopeEnum value){
        ((NotifyRequestDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1265)
    public void remScope(){
        ((NotifyRequestDMO) core).remScope();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1147)
    public String getFilter(){
        return(((NotifyRequestDMO) core).getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1230)
    public void setFilter(Object value) throws DmcValueException {
        ((NotifyRequestDMO) core).setFilter(value);
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void setFilter(String value){
        ((NotifyRequestDMO) core).setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1265)
    public void remFilter(){
        ((NotifyRequestDMO) core).remFilter();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1147)
    public NameContainer getTarget(){
        return(((NotifyRequestDMO) core).getTarget());
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1230)
    public void setTarget(Object value) throws DmcValueException {
        ((NotifyRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void setTarget(NameContainer value){
        ((NotifyRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1253)
    public void setTarget(DmcObjectName value){
        ((NotifyRequestDMO) core).setTarget(value);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1265)
    public void remTarget(){
        ((NotifyRequestDMO) core).remTarget();
    }


}
