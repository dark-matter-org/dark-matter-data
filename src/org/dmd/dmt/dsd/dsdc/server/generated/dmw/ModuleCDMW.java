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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                      // To support getMVCopy() - (BaseDMWGenerator.java:1069)
import java.util.Iterator;                                                       // Support copy of MV objects - (BaseDMWGenerator.java:2128)
import org.dmd.dmc.*;                                                            // If any attributes - (BaseDMWGenerator.java:975)
import org.dmd.dmc.definitions.DmcDefinitionIF;                                  // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                 // Our base to provide definition set storage - (DMWGenerator.java:171)
import org.dmd.dmc.types.DefinitionName;                                         // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dmc.types.DotName;                                                // To support the find method for definitions - (DSDefinitionModule.java:180)
import org.dmd.dms.ClassDefinition;                                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Attribute defFiles from the meta schema - (BaseDMWGenerator.java:910)
import org.dmd.dms.generated.dmw.StringIterableDMW;                              // For multi-valued String - (BaseDMWGenerator.java:1991)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // Is reference type - (BaseDMWGenerator.java:995)
import org.dmd.dmt.dsd.dsda.server.generated.dmw.ModuleAIterableDMW;             // For multi-valued ModuleA - (BaseDMWGenerator.java:1597)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                      // Attribute dependsOnModuleA from the dsdA schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO;                     // For multi-valued adds of ModuleA - (BaseDMWGenerator.java:1655)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                             // Is reference type - (BaseDMWGenerator.java:995)
import org.dmd.dmt.dsd.dsdb.server.generated.dmw.ModuleBIterableDMW;             // For multi-valued ModuleB - (BaseDMWGenerator.java:1597)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.DsdBDMSAG;                      // Attribute dependsOnModuleB from the dsdB schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.ModuleBDMO;                     // For multi-valued adds of ModuleB - (BaseDMWGenerator.java:1655)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptBase;                        // Derived class - (BaseDMWGenerator.java:1136)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptX;                           // A definition from the ModuleC Module - (DSDefinitionModule.java:191)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                             // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmt.dsd.dsdc.server.generated.dmw.ModuleCIterableDMW;             // For multi-valued ModuleC - (BaseDMWGenerator.java:1597)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCScopedInterface;         // Required to manage module definition - (DMWGenerator.java:170)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.DsdCDMSAG;                      // Attribute dependsOnModuleC from the dsdC schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.ModuleCDMO;                     // Class not auxiliary or abstract - (BaseDMWGenerator.java:1140)
import org.dmd.dmt.dsd.dsdc.shared.generated.types.ModuleCREF;                   // Required to access defined in module name - (DMWGenerator.java:181)



/**
 * <P>
 * Generated from the dsdC schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class ModuleCDMW extends CConceptBase implements DmcDefinitionIF, DmcNamedObjectIF, ModuleCScopedInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperDefinitions(DMWGenerator.java:204)
    DmcDefinitionSet<CConceptBase>     CConceptBaseDefs    = new DmcDefinitionSet<CConceptBase>("ModuleC-allDefinitions");   // All definitions associated with this module
    DmcDefinitionSet<CConceptX>        CConceptXDefs       = new DmcDefinitionSet<CConceptX>("ModuleC-CConceptXDefs");       // All CConceptX definitions
    DmcDefinitionSet<ModuleC>          ModuleCDefs         = new DmcDefinitionSet<ModuleC>("ModuleC-ModuleCDefs");           // All ModuleC definitions

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public ModuleCDMW() {
        super(new ModuleCDMO(), org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG._ModuleC);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public ModuleCDMW(DmcTypeModifierMV mods) {
        super(new ModuleCDMO(mods), org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG._ModuleC);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public ModuleC getModificationRecorder(){
        ModuleC rc = new ModuleC();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected ModuleCDMW(ModuleCDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1185)
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
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1559)
    public int getDefFilesSize(){
        return(((ModuleCDMO) core).getDefFilesSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1567)
    public boolean getDefFilesIsEmpty(){
        if (((ModuleCDMO) core).getDefFilesSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1577)
    public boolean getDefFilesHasValue(){
        if (((ModuleCDMO) core).getDefFilesSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1995)
    public StringIterableDMW getDefFilesIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ModuleCDMO) core).getDefFiles()));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2021)
    public void addDefFiles(Object value) throws DmcValueException {
        ((ModuleCDMO) core).addDefFiles(value);
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public void addDefFiles(String value){
        ((ModuleCDMO) core).addDefFiles(value);
    }

    /**
     * Returns true if the collection contains the defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2088)
    public boolean defFilesContains(String value){
        return(((ModuleCDMO) core).defFilesContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2132)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2159)
    public void delDefFiles(Object value) throws DmcValueException {
        ((ModuleCDMO) core).delDefFiles(value);
    }

    /**
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
    public void delDefFiles(String value){
        ((ModuleCDMO) core).delDefFiles(value);
    }

    /**
     * Removes the defFiles attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2180)
    public void remDefFiles(){
        ((ModuleCDMO) core).remDefFiles();
    }

    /**
     * @return The number of ModuleA items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1559)
    public int getDependsOnModuleASize(){
        return(((ModuleCDMO) core).getDependsOnModuleASize());
    }

    /**
     * @return true if there are no ModuleADMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1567)
    public boolean getDependsOnModuleAIsEmpty(){
        if (((ModuleCDMO) core).getDependsOnModuleASize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ModuleADMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1577)
    public boolean getDependsOnModuleAHasValue(){
        if (((ModuleCDMO) core).getDependsOnModuleASize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ModuleADMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1604)
    public ModuleAIterableDMW getDependsOnModuleAIterable(){
        DmcAttribute<?> attr = core.get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            return(ModuleAIterableDMW.emptyList);
        
        return(new ModuleAIterableDMW(((ModuleCDMO) core).getDependsOnModuleA()));
    }

    /**
     * Adds another dependsOnModuleA value.
     * @param value A value compatible with ModuleA
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1661)
    public DmcAttribute<?> addDependsOnModuleA(ModuleA value){
        DmcAttribute<?> attr = ((ModuleCDMO) core).addDependsOnModuleA(((ModuleADMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dependsOnModuleA value.
     * @param value The ModuleA to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1711)
    public void delDependsOnModuleA(ModuleA value){
        ((ModuleCDMO) core).delDependsOnModuleA(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ModuleA objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1775)
    public ArrayList<ModuleA> getDependsOnModuleACopy(){
        DmcAttribute<?> attr = ((ModuleCDMO) core).get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            return(new ArrayList<ModuleA>());
        
        ArrayList<ModuleA> rc = new ArrayList<ModuleA>(attr.getMVSize());
        
        ModuleAIterableDMW it = getDependsOnModuleAIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the dependsOnModuleA attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2180)
    public void remDependsOnModuleA(){
        ((ModuleCDMO) core).remDependsOnModuleA();
    }

    /**
     * @return The number of ModuleB items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1559)
    public int getDependsOnModuleBSize(){
        return(((ModuleCDMO) core).getDependsOnModuleBSize());
    }

    /**
     * @return true if there are no ModuleBDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1567)
    public boolean getDependsOnModuleBIsEmpty(){
        if (((ModuleCDMO) core).getDependsOnModuleBSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ModuleBDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1577)
    public boolean getDependsOnModuleBHasValue(){
        if (((ModuleCDMO) core).getDependsOnModuleBSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ModuleBDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1604)
    public ModuleBIterableDMW getDependsOnModuleBIterable(){
        DmcAttribute<?> attr = core.get(DsdBDMSAG.__dependsOnModuleB);
        if (attr == null)
            return(ModuleBIterableDMW.emptyList);
        
        return(new ModuleBIterableDMW(((ModuleCDMO) core).getDependsOnModuleB()));
    }

    /**
     * Adds another dependsOnModuleB value.
     * @param value A value compatible with ModuleB
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1661)
    public DmcAttribute<?> addDependsOnModuleB(ModuleB value){
        DmcAttribute<?> attr = ((ModuleCDMO) core).addDependsOnModuleB(((ModuleBDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dependsOnModuleB value.
     * @param value The ModuleB to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1711)
    public void delDependsOnModuleB(ModuleB value){
        ((ModuleCDMO) core).delDependsOnModuleB(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ModuleB objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1775)
    public ArrayList<ModuleB> getDependsOnModuleBCopy(){
        DmcAttribute<?> attr = ((ModuleCDMO) core).get(DsdBDMSAG.__dependsOnModuleB);
        if (attr == null)
            return(new ArrayList<ModuleB>());
        
        ArrayList<ModuleB> rc = new ArrayList<ModuleB>(attr.getMVSize());
        
        ModuleBIterableDMW it = getDependsOnModuleBIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the dependsOnModuleB attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2180)
    public void remDependsOnModuleB(){
        ((ModuleCDMO) core).remDependsOnModuleB();
    }

    /**
     * @return The number of ModuleC items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1559)
    public int getDependsOnModuleCSize(){
        return(((ModuleCDMO) core).getDependsOnModuleCSize());
    }

    /**
     * @return true if there are no ModuleCDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1567)
    public boolean getDependsOnModuleCIsEmpty(){
        if (((ModuleCDMO) core).getDependsOnModuleCSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ModuleCDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1577)
    public boolean getDependsOnModuleCHasValue(){
        if (((ModuleCDMO) core).getDependsOnModuleCSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ModuleCDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1604)
    public ModuleCIterableDMW getDependsOnModuleCIterable(){
        DmcAttribute<?> attr = core.get(DsdCDMSAG.__dependsOnModuleC);
        if (attr == null)
            return(ModuleCIterableDMW.emptyList);
        
        return(new ModuleCIterableDMW(((ModuleCDMO) core).getDependsOnModuleC()));
    }

    /**
     * Adds another dependsOnModuleC value.
     * @param value A value compatible with ModuleC
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1661)
    public DmcAttribute<?> addDependsOnModuleC(ModuleC value){
        DmcAttribute<?> attr = ((ModuleCDMO) core).addDependsOnModuleC(((ModuleCDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dependsOnModuleC value.
     * @param value The ModuleC to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1711)
    public void delDependsOnModuleC(ModuleC value){
        ((ModuleCDMO) core).delDependsOnModuleC(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ModuleC objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1775)
    public ArrayList<ModuleC> getDependsOnModuleCCopy(){
        DmcAttribute<?> attr = ((ModuleCDMO) core).get(DsdCDMSAG.__dependsOnModuleC);
        if (attr == null)
            return(new ArrayList<ModuleC>());
        
        ArrayList<ModuleC> rc = new ArrayList<ModuleC>(attr.getMVSize());
        
        ModuleCIterableDMW it = getDependsOnModuleCIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the dependsOnModuleC attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2180)
    public void remDependsOnModuleC(){
        ((ModuleCDMO) core).remDependsOnModuleC();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1559)
    public int getDescriptionSize(){
        return(((ModuleCDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1567)
    public boolean getDescriptionIsEmpty(){
        if (((ModuleCDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1577)
    public boolean getDescriptionHasValue(){
        if (((ModuleCDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1995)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ModuleCDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2021)
    public void addDescription(Object value) throws DmcValueException {
        ((ModuleCDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public void addDescription(String value){
        ((ModuleCDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2088)
    public boolean descriptionContains(String value){
        return(((ModuleCDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2132)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDescriptionCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
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
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2159)
    public void delDescription(Object value) throws DmcValueException {
        ((ModuleCDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
    public void delDescription(String value){
        ((ModuleCDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2180)
    public void remDescription(){
        ((ModuleCDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public DefinitionName getName(){
        return(((ModuleCDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setName(Object value) throws DmcValueException {
        ((ModuleCDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setName(DefinitionName value){
        ((ModuleCDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remName(){
        ((ModuleCDMO) core).remName();
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:302)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:212)
    /**
     * All definitions are added to the base definition collection.
     */
    void addCConceptBase(CConceptBase def){
        CConceptBaseDefs.add(def);
    }

    public int getCConceptBaseCount(){
        return(CConceptBaseDefs.size());
    }

    public CConceptBase getCConceptBase(DotName name){
        return(CConceptBaseDefs.getDefinition(name));
    }

    public Iterator<CConceptBase> getAllCConceptBase(){
        return(CConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:337)
    public void addCConceptX(CConceptX def){
        CConceptXDefs.add(def);
        addCConceptBase(def);
    }

    public int getCConceptXCount(){
        return(CConceptXDefs.size());
    }

    public CConceptX getCConceptX(DotName name){
        return(CConceptXDefs.getDefinition(name));
    }

    public Iterator<CConceptX> getAllCConceptX(){
        return(CConceptXDefs.values().iterator());
    }

    public CConceptX getCConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(CConceptXDefs.getDefinition(name));
    }

    public Iterator<CConceptX> getCConceptXDefinitionsByName(String name) throws DmcValueException{
        return(CConceptXDefs.getDefinitionsByName(name));
    }

    public int getCConceptXDefinitionCountByName(String name) throws DmcValueException{
        return(CConceptXDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:221)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     * And, since this is a module, it's just the name of the module.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        return(getName().getNameString());
    }


}
