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
package org.dmd.dmt.dsd.dsdc.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import org.dmd.dmc.*;                                                  // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dmc.types.DefinitionName;                               // Is named by - (BaseDMWGeneratorNewest.java:958)
import org.dmd.dms.ClassDefinition;                                    // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                   // Is reference type - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;         // Is reference type REF - (BaseDMWGeneratorNewest.java:1007)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                   // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:972)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.ModuleCDMO;           // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmt.dsd.dsdc.shared.generated.types.ModuleCREF;         // Is reference type REF - (BaseDMWGeneratorNewest.java:1007)
import org.dmd.dmw.DmwNamedObjectWrapper;                              // Named object wrapper - (BaseDMWGeneratorNewest.java:1134)


/**
 * null
 * <P>
 * Generated from the dsdC schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class ModuleCDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public ModuleCDMW() {
        super(new ModuleCDMO(), org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG._ModuleC);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public ModuleCDMW(DmcTypeModifierMV mods) {
        super(new ModuleCDMO(mods), org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG._ModuleC);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:518)
    public ModuleC getModificationRecorder(){
        ModuleC rc = new ModuleC();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public ModuleCDMW(ModuleCDMO obj) {
        super(obj, org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG._ModuleC);
    }

    public ModuleC cloneIt() {
        ModuleC rc = new ModuleC();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ModuleCDMO getDMO() {
        return((ModuleCDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected ModuleCDMW(ModuleCDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1189)
    public DefinitionName getObjectName(){
        return(((ModuleCDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ModuleCDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ModuleCDMW){
            return( getObjectName().equals( ((ModuleCDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A ModuleA object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1326)
    public ModuleA getDependsOnModuleA(){
        ModuleAREF ref = ((ModuleCDMO) core).getDependsOnModuleA();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ModuleA)ref.getObject().getContainer());
    }

    /**
     * Sets the dependsOnModuleA to the specified value.
     * @param value A value compatible with ModuleAREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setDependsOnModuleA(ModuleA value) {
        ((ModuleCDMO) core).setDependsOnModuleA(value.getDMO());
    }

    /**
     * Sets the dependsOnModuleA to the specified value.
     * @param value A value compatible with ModuleAREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1420)
    public void setDependsOnModuleA(Object value) throws DmcValueException {
        ((ModuleCDMO) core).setDependsOnModuleA(value);
    }

    /**
     * Removes the dependsOnModuleA attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remDependsOnModuleA(){
        ((ModuleCDMO) core).remDependsOnModuleA();
    }

    /**
     * @return A ModuleC object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1326)
    public ModuleC getDependsOnModuleC(){
        ModuleCREF ref = ((ModuleCDMO) core).getDependsOnModuleC();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ModuleC)ref.getObject().getContainer());
    }

    /**
     * Sets the dependsOnModuleC to the specified value.
     * @param value A value compatible with ModuleCREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setDependsOnModuleC(ModuleC value) {
        ((ModuleCDMO) core).setDependsOnModuleC(value.getDMO());
    }

    /**
     * Sets the dependsOnModuleC to the specified value.
     * @param value A value compatible with ModuleCREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1420)
    public void setDependsOnModuleC(Object value) throws DmcValueException {
        ((ModuleCDMO) core).setDependsOnModuleC(value);
    }

    /**
     * Removes the dependsOnModuleC attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remDependsOnModuleC(){
        ((ModuleCDMO) core).remDependsOnModuleC();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public String getDescription(){
        return(((ModuleCDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setDescription(Object value) throws DmcValueException {
        ((ModuleCDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setDescription(String value){
        ((ModuleCDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remDescription(){
        ((ModuleCDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public DefinitionName getName(){
        return(((ModuleCDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setName(Object value) throws DmcValueException {
        ((ModuleCDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setName(DefinitionName value){
        ((ModuleCDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remName(){
        ((ModuleCDMO) core).remName();
    }


}
