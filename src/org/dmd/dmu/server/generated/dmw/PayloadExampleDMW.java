//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmu.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.definitions.DmcDefinitionIF;                       // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                              // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                   // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmu.server.extended.DmuDefinition;                     // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dmu.server.extended.json.PayloadExample;               // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmu.server.extended.json.PayloadSortInfo;              // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dmu.shared.generated.dmo.PayloadExampleDMO;            // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmu.shared.generated.types.DmuModuleREF;               // Required to access defined in module name - (DMWGenerator.java:181)
import org.dmd.dmu.shared.generated.types.PayloadSortInfoREF;         // Is reference type REF - (BaseDMWGenerator.java:1005)



/**
 * <font color="red">json:</font> The PayloadExample allows you to specify\n
 * examples of JSON payloads to be used to test various functionality.
 * <P>
 * Generated from the dmu schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class PayloadExampleDMW extends DmuDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public PayloadExampleDMW() {
        super(new PayloadExampleDMO(), org.dmd.dmu.server.generated.DmuSchemaAG._PayloadExample);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public PayloadExampleDMW(DmcTypeModifierMV mods) {
        super(new PayloadExampleDMO(mods), org.dmd.dmu.server.generated.DmuSchemaAG._PayloadExample);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public PayloadExample getModificationRecorder(){
        PayloadExample rc = new PayloadExample();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public PayloadExampleDMW(PayloadExampleDMO obj) {
        super(obj, org.dmd.dmu.server.generated.DmuSchemaAG._PayloadExample);
    }

    public PayloadExample cloneIt() {
        PayloadExample rc = new PayloadExample();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PayloadExampleDMO getDMO() {
        return((PayloadExampleDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected PayloadExampleDMW(PayloadExampleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public DefinitionName getObjectName(){
        return(((PayloadExampleDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((PayloadExampleDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof PayloadExampleDMW){
            return( getObjectName().equals( ((PayloadExampleDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getJsonPayload(){
        return(((PayloadExampleDMO) core).getJsonPayload());
    }

    /**
     * Sets jsonPayload to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setJsonPayload(Object value) throws DmcValueException {
        ((PayloadExampleDMO) core).setJsonPayload(value);
    }

    /**
     * Sets jsonPayload to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setJsonPayload(String value){
        ((PayloadExampleDMO) core).setJsonPayload(value);
    }

    /**
     * Removes the jsonPayload attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remJsonPayload(){
        ((PayloadExampleDMO) core).remJsonPayload();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DefinitionName getName(){
        return(((PayloadExampleDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setName(Object value) throws DmcValueException {
        ((PayloadExampleDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setName(DefinitionName value){
        ((PayloadExampleDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remName(){
        ((PayloadExampleDMO) core).remName();
    }

    /**
     * @return A PayloadSortInfo object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public PayloadSortInfo getUseSortInfo(){
        PayloadSortInfoREF ref = ((PayloadExampleDMO) core).getUseSortInfo();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((PayloadSortInfo)ref.getObject().getContainer());
    }

    /**
     * Sets the useSortInfo to the specified value.
     * @param value A value compatible with PayloadSortInfoREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setUseSortInfo(PayloadSortInfo value) {
        ((PayloadExampleDMO) core).setUseSortInfo(value.getDMO());
    }

    /**
     * Sets the useSortInfo to the specified value.
     * @param value A value compatible with PayloadSortInfoREF
     * @throws DmcValueException is the value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1419)
    public void setUseSortInfo(Object value) throws DmcValueException {
        ((PayloadExampleDMO) core).setUseSortInfo(value);
    }

    /**
     * Removes the useSortInfo attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remUseSortInfo(){
        ((PayloadExampleDMO) core).remUseSortInfo();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:234)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        DmuModuleREF ref = ((PayloadExampleDMO) core).getDefinedInDmuModule();
        return(ref.getName().getNameString());
    }


}
