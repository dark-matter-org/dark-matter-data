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
package org.dmd.dmt.dsd.dsda.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                                      // To support getMVCopy() - (BaseDMWGenerator.java:1105)
import java.util.Iterator;                                                       // Support copy of MV objects - (BaseDMWGenerator.java:2164)
import org.dmd.dmc.*;                                                            // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dmc.definitions.DmcDefinitionIF;                                  // The object is a domain specific definition - (BaseDMWGenerator.java:335)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                 // Our base to provide definition set storage - (DMWGenerator.java:164)
import org.dmd.dmc.types.DefinitionName;                                         // Is named by - (BaseDMWGenerator.java:986)
import org.dmd.dms.ClassDefinition;                                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Attribute defFiles from the meta schema - (BaseDMWGenerator.java:821)
import org.dmd.dms.generated.dmw.StringIterableDMW;                              // For multi-valued String - (BaseDMWGenerator.java:2027)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;                        // Derived class - (BaseDMWGenerator.java:1172)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                           // A definition from the ModuleA Module - (DSDefinitionModule.java:171)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // Required for getModificationRecorder() - (BaseDMWGenerator.java:1000)
import org.dmd.dmt.dsd.dsda.server.generated.dmw.ModuleAIterableDMW;             // For multi-valued ModuleA - (BaseDMWGenerator.java:1633)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAScopedInterface;         // Required to manage module definition - (DMWGenerator.java:163)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                      // Attribute dependsOnModuleA from the dsdA schema - (BaseDMWGenerator.java:821)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO;                     // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)



/**
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class ModuleADMW extends AConceptBase implements DmcDefinitionIF, DmcNamedObjectIF, ModuleAScopedInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperDefinitions(DMWGenerator.java:189)
    DmcDefinitionSet<AConceptBase>     AConceptBaseDefs    = new DmcDefinitionSet<AConceptBase>();   // All definitions associated with this module
    DmcDefinitionSet<AConceptX>        AConceptXDefs       = new DmcDefinitionSet<AConceptX>();      // All AConceptX definitions
    DmcDefinitionSet<ModuleA>          ModuleADefs         = new DmcDefinitionSet<ModuleA>();        // All ModuleA definitions

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public ModuleADMW() {
        super(new ModuleADMO(), org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG._ModuleA);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public ModuleADMW(DmcTypeModifierMV mods) {
        super(new ModuleADMO(mods), org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG._ModuleA);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:530)
    public ModuleA getModificationRecorder(){
        ModuleA rc = new ModuleA();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public ModuleADMW(ModuleADMO obj) {
        super(obj, org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG._ModuleA);
    }

    public ModuleA cloneIt() {
        ModuleA rc = new ModuleA();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ModuleADMO getDMO() {
        return((ModuleADMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected ModuleADMW(ModuleADMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1221)
    public DefinitionName getObjectName(){
        return(((ModuleADMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ModuleADMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ModuleADMW){
            return( getObjectName().equals( ((ModuleADMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getDefFilesSize(){
        return(((ModuleADMO) core).getDefFilesSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getDefFilesIsEmpty(){
        if (((ModuleADMO) core).getDefFilesSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getDefFilesHasValue(){
        if (((ModuleADMO) core).getDefFilesSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public StringIterableDMW getDefFilesIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ModuleADMO) core).getDefFiles()));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2057)
    public void addDefFiles(Object value) throws DmcValueException {
        ((ModuleADMO) core).addDefFiles(value);
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2067)
    public void addDefFiles(String value){
        ((ModuleADMO) core).addDefFiles(value);
    }

    /**
     * Returns true if the collection contains the defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2124)
    public boolean defFilesContains(String value){
        return(((ModuleADMO) core).defFilesContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2195)
    public void delDefFiles(Object value) throws DmcValueException {
        ((ModuleADMO) core).delDefFiles(value);
    }

    /**
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2204)
    public void delDefFiles(String value){
        ((ModuleADMO) core).delDefFiles(value);
    }

    /**
     * Removes the defFiles attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remDefFiles(){
        ((ModuleADMO) core).remDefFiles();
    }

    /**
     * @return The number of ModuleA items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getDependsOnModuleASize(){
        return(((ModuleADMO) core).getDependsOnModuleASize());
    }

    /**
     * @return true if there are no ModuleADMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getDependsOnModuleAIsEmpty(){
        if (((ModuleADMO) core).getDependsOnModuleASize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ModuleADMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getDependsOnModuleAHasValue(){
        if (((ModuleADMO) core).getDependsOnModuleASize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ModuleADMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1640)
    public ModuleAIterableDMW getDependsOnModuleAIterable(){
        DmcAttribute<?> attr = core.get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            return(ModuleAIterableDMW.emptyList);
        
        return(new ModuleAIterableDMW(((ModuleADMO) core).getDependsOnModuleA()));
    }

    /**
     * Adds another dependsOnModuleA value.
     * @param value A value compatible with ModuleA
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1697)
    public DmcAttribute<?> addDependsOnModuleA(ModuleA value){
        DmcAttribute<?> attr = ((ModuleADMO) core).addDependsOnModuleA(((ModuleADMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dependsOnModuleA value.
     * @param value The ModuleA to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1747)
    public void delDependsOnModuleA(ModuleA value){
        ((ModuleADMO) core).delDependsOnModuleA(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ModuleA objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1811)
    public ArrayList<ModuleA> getDependsOnModuleACopy(){
        DmcAttribute<?> attr = ((ModuleADMO) core).get(DsdADMSAG.__dependsOnModuleA);
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remDependsOnModuleA(){
        ((ModuleADMO) core).remDependsOnModuleA();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getDescriptionSize(){
        return(((ModuleADMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getDescriptionIsEmpty(){
        if (((ModuleADMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getDescriptionHasValue(){
        if (((ModuleADMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ModuleADMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2057)
    public void addDescription(Object value) throws DmcValueException {
        ((ModuleADMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2067)
    public void addDescription(String value){
        ((ModuleADMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2124)
    public boolean descriptionContains(String value){
        return(((ModuleADMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2195)
    public void delDescription(Object value) throws DmcValueException {
        ((ModuleADMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2204)
    public void delDescription(String value){
        ((ModuleADMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remDescription(){
        ((ModuleADMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public DefinitionName getName(){
        return(((ModuleADMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setName(Object value) throws DmcValueException {
        ((ModuleADMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setName(DefinitionName value){
        ((ModuleADMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remName(){
        ((ModuleADMO) core).remName();
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:213)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:197)
    /**
     * All definitions are added to the base definition collection.
     */
    void addAConceptBase(AConceptBase def){
        AConceptBaseDefs.add(def);
    }

    public int getAConceptBaseCount(){
        return(AConceptBaseDefs.size());
    }

    public Iterator<AConceptBase> getAllAConceptBase(){
        return(AConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:243)
    public void addAConceptX(AConceptX def){
        AConceptXDefs.add(def);
        addAConceptBase(def);
    }

    public int getAConceptXCount(){
        return(AConceptXDefs.size());
    }

    public Iterator<AConceptX> getAllAConceptX(){
        return(AConceptXDefs.values().iterator());
    }


}
