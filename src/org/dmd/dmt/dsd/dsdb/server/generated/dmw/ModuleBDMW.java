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
package org.dmd.dmt.dsd.dsdb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                                      // To support getMVCopy() - (BaseDMWGenerator.java:1100)
import java.util.Iterator;                                                       // Support copy of MV objects - (BaseDMWGenerator.java:2159)
import org.dmd.dmc.*;                                                            // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.definitions.DmcDefinitionIF;                                  // The object is a domain specific definition - (BaseDMWGenerator.java:335)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                 // Our base to provide definition set storage - (DMWGenerator.java:162)
import org.dmd.dmc.types.DefinitionName;                                         // Is named by - (BaseDMWGenerator.java:985)
import org.dmd.dms.ClassDefinition;                                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Attribute defFiles from the meta schema - (BaseDMWGenerator.java:821)
import org.dmd.dms.generated.dmw.StringIterableDMW;                              // For multi-valued String - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;                   // Is reference type REF - (BaseDMWGenerator.java:1034)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;                        // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptX;                           // A definition from the ModuleB Module - (DSDefinitionModule.java:122)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                             // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBScopedInterface;         // Required to manage module definition - (DMWGenerator.java:161)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.ModuleBDMO;                     // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dmt.dsd.dsdb.shared.generated.types.ModuleBREF;                   // Is reference type REF - (BaseDMWGenerator.java:1034)



/**
 * null
 * <P>
 * Generated from the dsdB schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class ModuleBDMW extends BConceptBase implements DmcDefinitionIF, DmcNamedObjectIF, ModuleBScopedInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperDefinitions(DMWGenerator.java:187)
    DmcDefinitionSet<BConceptBase>     BConceptBaseDefs    = new DmcDefinitionSet<BConceptBase>();   // All definitions associated with this module
    DmcDefinitionSet<BConceptX>        BConceptXDefs       = new DmcDefinitionSet<BConceptX>();      // All BConceptX definitions
    DmcDefinitionSet<ModuleB>          ModuleBDefs         = new DmcDefinitionSet<ModuleB>();        // All ModuleB definitions

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public ModuleBDMW() {
        super(new ModuleBDMO(), org.dmd.dmt.dsd.dsdb.server.generated.DsdBSchemaAG._ModuleB);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public ModuleBDMW(DmcTypeModifierMV mods) {
        super(new ModuleBDMO(mods), org.dmd.dmt.dsd.dsdb.server.generated.DsdBSchemaAG._ModuleB);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:530)
    public ModuleB getModificationRecorder(){
        ModuleB rc = new ModuleB();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public ModuleBDMW(ModuleBDMO obj) {
        super(obj, org.dmd.dmt.dsd.dsdb.server.generated.DsdBSchemaAG._ModuleB);
    }

    public ModuleB cloneIt() {
        ModuleB rc = new ModuleB();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ModuleBDMO getDMO() {
        return((ModuleBDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected ModuleBDMW(ModuleBDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1216)
    public DefinitionName getObjectName(){
        return(((ModuleBDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ModuleBDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ModuleBDMW){
            return( getObjectName().equals( ((ModuleBDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getDefFilesSize(){
        return(((ModuleBDMO) core).getDefFilesSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getDefFilesIsEmpty(){
        if (((ModuleBDMO) core).getDefFilesSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getDefFilesHasValue(){
        if (((ModuleBDMO) core).getDefFilesSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public StringIterableDMW getDefFilesIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ModuleBDMO) core).getDefFiles()));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addDefFiles(Object value) throws DmcValueException {
        ((ModuleBDMO) core).addDefFiles(value);
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addDefFiles(String value){
        ((ModuleBDMO) core).addDefFiles(value);
    }

    /**
     * Returns true if the collection contains the defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean defFilesContains(String value){
        return(((ModuleBDMO) core).defFilesContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDefFilesCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delDefFiles(Object value) throws DmcValueException {
        ((ModuleBDMO) core).delDefFiles(value);
    }

    /**
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delDefFiles(String value){
        ((ModuleBDMO) core).delDefFiles(value);
    }

    /**
     * Removes the defFiles attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remDefFiles(){
        ((ModuleBDMO) core).remDefFiles();
    }

    /**
     * @return A ModuleA object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
    public ModuleA getDependsOnModuleA(){
        ModuleAREF ref = ((ModuleBDMO) core).getDependsOnModuleA();
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1438)
    public void setDependsOnModuleA(ModuleA value) {
        ((ModuleBDMO) core).setDependsOnModuleA(value.getDMO());
    }

    /**
     * Sets the dependsOnModuleA to the specified value.
     * @param value A value compatible with ModuleAREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1447)
    public void setDependsOnModuleA(Object value) throws DmcValueException {
        ((ModuleBDMO) core).setDependsOnModuleA(value);
    }

    /**
     * Removes the dependsOnModuleA attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remDependsOnModuleA(){
        ((ModuleBDMO) core).remDependsOnModuleA();
    }

    /**
     * @return A ModuleB object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
    public ModuleB getDependsOnModuleB(){
        ModuleBREF ref = ((ModuleBDMO) core).getDependsOnModuleB();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ModuleB)ref.getObject().getContainer());
    }

    /**
     * Sets the dependsOnModuleB to the specified value.
     * @param value A value compatible with ModuleBREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1438)
    public void setDependsOnModuleB(ModuleB value) {
        ((ModuleBDMO) core).setDependsOnModuleB(value.getDMO());
    }

    /**
     * Sets the dependsOnModuleB to the specified value.
     * @param value A value compatible with ModuleBREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1447)
    public void setDependsOnModuleB(Object value) throws DmcValueException {
        ((ModuleBDMO) core).setDependsOnModuleB(value);
    }

    /**
     * Removes the dependsOnModuleB attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remDependsOnModuleB(){
        ((ModuleBDMO) core).remDependsOnModuleB();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getDescription(){
        return(((ModuleBDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setDescription(Object value) throws DmcValueException {
        ((ModuleBDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setDescription(String value){
        ((ModuleBDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remDescription(){
        ((ModuleBDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public DefinitionName getName(){
        return(((ModuleBDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setName(Object value) throws DmcValueException {
        ((ModuleBDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setName(DefinitionName value){
        ((ModuleBDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remName(){
        ((ModuleBDMO) core).remName();
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:164)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:195)
    /**
     * All definitions are added to the base definition collection.
     */
    void addBConceptBase(BConceptBase def){
        BConceptBaseDefs.add(def);
    }

    public int getBConceptBaseCount(){
        return(BConceptBaseDefs.size());
    }

    public Iterator<BConceptBase> getAllBConceptBase(){
        return(BConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:189)
    public void addBConceptX(BConceptX def){
        BConceptXDefs.add(def);
        addBConceptBase(def);
    }

    public int getBConceptXCount(){
        return(BConceptXDefs.size());
    }

    public Iterator<BConceptX> getAllBConceptX(){
        return(BConceptXDefs.values().iterator());
    }


}
