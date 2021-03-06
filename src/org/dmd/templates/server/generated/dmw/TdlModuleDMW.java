package org.dmd.templates.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                     // To support getMVCopy() - (BaseDMWGenerator.java:1071)
import java.util.Iterator;                                                      // Support copy of MV objects - (BaseDMWGenerator.java:2133)
import org.dmd.dmc.*;                                                           // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.definitions.DmcDefinitionIF;                                 // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                // Our base to provide definition set storage - (DMWGenerator.java:174)
import org.dmd.dmc.types.DefinitionName;                                        // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dmc.types.DotName;                                               // To support the find method for definitions - (DSDefinitionModule.java:189)
import org.dmd.dms.ClassDefinition;                                             // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Attribute defFiles from the meta schema - (BaseDMWGenerator.java:910)
import org.dmd.dms.generated.dmw.StringIterableDMW;                             // For multi-valued String - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.templates.server.extended.ContainedElement;                      // A definition from the TdlModule Module - (DSDefinitionModule.java:201)
import org.dmd.templates.server.extended.ExtensionHook;                         // A definition from the TdlModule Module - (DSDefinitionModule.java:201)
import org.dmd.templates.server.extended.Section;                               // A definition from the TdlModule Module - (DSDefinitionModule.java:201)
import org.dmd.templates.server.extended.TdlDefinition;                         // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.templates.server.extended.TdlModule;                             // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.templates.server.extended.TextualArtifact;                       // A definition from the TdlModule Module - (DSDefinitionModule.java:201)
import org.dmd.templates.server.generated.dmw.TdlModuleIterableDMW;             // For multi-valued TdlModule - (BaseDMWGenerator.java:1600)
import org.dmd.templates.server.generated.dsd.TdlModuleScopedInterface;         // Required to manage module definition - (DMWGenerator.java:173)
import org.dmd.templates.shared.generated.dmo.DmtdlDMSAG;                       // Attribute dependsOnTdlModule from the dmtdl schema - (BaseDMWGenerator.java:910)
import org.dmd.templates.shared.generated.dmo.TdlModuleDMO;                     // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.templates.shared.generated.types.TdlModuleREF;                   // Required to access defined in module name - (DMWGenerator.java:184)
import org.dmd.util.exceptions.ResultException;                                 // To support definition deletions - (DSDefinitionModule.java:190)



/**
 * A TdlModule is used to define a set of Sections that\n define the overall
 * structure of a textual artifact. When run through the dmtdlgen\n utility,
 * a set of classes are generated to represent these different artifact
 * sections.\n <p>\n By convention, you should place the .dmtdl files along
 * with your other dark-matter \n config files e.g. in the dmconfig folder
 * with your dark-matter schema or with \n your .dmg wrapper generation
 * files. However, there is no restriction on where you\n place your .dmtdl
 * files, but it's recommended that they exist in a separate subfolder.\n
 * <p>\n When the dmtdlgen utility is run, a folder (named generated) will be
 * created at\n the same level as the dmconfig folder (or whatever you called
 * it). This will contain\n a dmtdl subpackage that will contain the
 * generated code that represents the \n various Sections that you've defined.
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class TdlModuleDMW extends TdlDefinition implements DmcDefinitionIF, DmcNamedObjectIF, TdlModuleScopedInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperDefinitions(DMWGenerator.java:207)
    DmcDefinitionSet<TdlDefinition>        TdlDefinitionDefs       = new DmcDefinitionSet<TdlDefinition>("TdlModule-allDefinitions","TdlDefinition");                // All definitions associated with this module
    DmcDefinitionSet<ContainedElement>     ContainedElementDefs    = new DmcDefinitionSet<ContainedElement>("TdlModule-ContainedElementDefs", "ContainedElement");   // All ContainedElement definitions
    DmcDefinitionSet<ExtensionHook>        ExtensionHookDefs       = new DmcDefinitionSet<ExtensionHook>("TdlModule-ExtensionHookDefs", "ExtensionHook");            // All ExtensionHook definitions
    DmcDefinitionSet<Section>              SectionDefs             = new DmcDefinitionSet<Section>("TdlModule-SectionDefs", "Section");                              // All Section definitions
    DmcDefinitionSet<TdlModule>            TdlModuleDefs           = new DmcDefinitionSet<TdlModule>("TdlModule-TdlModuleDefs", "TdlModule");                        // All TdlModule definitions
    DmcDefinitionSet<TextualArtifact>      TextualArtifactDefs     = new DmcDefinitionSet<TextualArtifact>("TdlModule-TextualArtifactDefs", "TextualArtifact");      // All TextualArtifact definitions

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public TdlModuleDMW() {
        super(new TdlModuleDMO(), org.dmd.templates.server.generated.DmtdlSchemaAG._TdlModule);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public TdlModuleDMW(DmcTypeModifierMV mods) {
        super(new TdlModuleDMO(mods), org.dmd.templates.server.generated.DmtdlSchemaAG._TdlModule);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public TdlModule getModificationRecorder(){
        TdlModule rc = new TdlModule();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public TdlModuleDMW(TdlModuleDMO obj) {
        super(obj, org.dmd.templates.server.generated.DmtdlSchemaAG._TdlModule);
    }

    public TdlModule cloneIt() {
        TdlModule rc = new TdlModule();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public TdlModuleDMO getDMO() {
        return((TdlModuleDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected TdlModuleDMW(TdlModuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public DefinitionName getObjectName(){
        return(((TdlModuleDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TdlModuleDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TdlModuleDMW){
            return( getObjectName().equals( ((TdlModuleDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getCommentFormat(){
        return(((TdlModuleDMO) core).getCommentFormat());
    }

    /**
     * Sets commentFormat to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setCommentFormat(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).setCommentFormat(value);
    }

    /**
     * Sets commentFormat to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setCommentFormat(String value){
        ((TdlModuleDMO) core).setCommentFormat(value);
    }

    /**
     * Removes the commentFormat attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remCommentFormat(){
        ((TdlModuleDMO) core).remCommentFormat();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getDefFilesSize(){
        return(((TdlModuleDMO) core).getDefFilesSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getDefFilesIsEmpty(){
        if (((TdlModuleDMO) core).getDefFilesSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getDefFilesHasValue(){
        if (((TdlModuleDMO) core).getDefFilesSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public StringIterableDMW getDefFilesIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TdlModuleDMO) core).getDefFiles()));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addDefFiles(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).addDefFiles(value);
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addDefFiles(String value){
        ((TdlModuleDMO) core).addDefFiles(value);
    }

    /**
     * @param value A value compatible with String
     * @return true if the collection contains the defFiles value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean defFilesContains(String value){
        return(((TdlModuleDMO) core).defFilesContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
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
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delDefFiles(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).delDefFiles(value);
    }

    /**
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delDefFiles(String value){
        ((TdlModuleDMO) core).delDefFiles(value);
    }

    /**
     * Removes the defFiles attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remDefFiles(){
        ((TdlModuleDMO) core).remDefFiles();
    }

    /**
     * @return The number of TdlModule items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getDependsOnTdlModuleSize(){
        return(((TdlModuleDMO) core).getDependsOnTdlModuleSize());
    }

    /**
     * @return true if there are no TdlModuleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getDependsOnTdlModuleIsEmpty(){
        if (((TdlModuleDMO) core).getDependsOnTdlModuleSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TdlModuleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getDependsOnTdlModuleHasValue(){
        if (((TdlModuleDMO) core).getDependsOnTdlModuleSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TdlModuleDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1607)
    public TdlModuleIterableDMW getDependsOnTdlModuleIterable(){
        DmcAttribute<?> attr = core.get(DmtdlDMSAG.__dependsOnTdlModule);
        if (attr == null)
            return(TdlModuleIterableDMW.emptyList);
        
        return(new TdlModuleIterableDMW(((TdlModuleDMO) core).getDependsOnTdlModule()));
    }

    /**
     * Adds another dependsOnTdlModule value.
     * @param value A value compatible with TdlModule
     * @return the attribute instance
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1665)
    public DmcAttribute<?> addDependsOnTdlModule(TdlModule value){
        DmcAttribute<?> attr = ((TdlModuleDMO) core).addDependsOnTdlModule(((TdlModuleDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dependsOnTdlModule value.
     * @param value The TdlModule to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1715)
    public void delDependsOnTdlModule(TdlModule value){
        ((TdlModuleDMO) core).delDependsOnTdlModule(value.getDMO());
    }

    /**
     * @return A COPY of the collection of TdlModule objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1779)
    public ArrayList<TdlModule> getDependsOnTdlModuleCopy(){
        DmcAttribute<?> attr = ((TdlModuleDMO) core).get(DmtdlDMSAG.__dependsOnTdlModule);
        if (attr == null)
            return(new ArrayList<TdlModule>());
        
        ArrayList<TdlModule> rc = new ArrayList<TdlModule>(attr.getMVSize());
        
        TdlModuleIterableDMW it = getDependsOnTdlModuleIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the dependsOnTdlModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remDependsOnTdlModule(){
        ((TdlModuleDMO) core).remDependsOnTdlModule();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getDescriptionSize(){
        return(((TdlModuleDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getDescriptionIsEmpty(){
        if (((TdlModuleDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getDescriptionHasValue(){
        if (((TdlModuleDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TdlModuleDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addDescription(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addDescription(String value){
        ((TdlModuleDMO) core).addDescription(value);
    }

    /**
     * @param value A value compatible with String
     * @return true if the collection contains the description value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean descriptionContains(String value){
        return(((TdlModuleDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
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
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delDescription(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delDescription(String value){
        ((TdlModuleDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remDescription(){
        ((TdlModuleDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getInsertMarker(){
        return(((TdlModuleDMO) core).getInsertMarker());
    }

    /**
     * Sets insertMarker to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setInsertMarker(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).setInsertMarker(value);
    }

    /**
     * Sets insertMarker to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setInsertMarker(String value){
        ((TdlModuleDMO) core).setInsertMarker(value);
    }

    /**
     * Removes the insertMarker attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remInsertMarker(){
        ((TdlModuleDMO) core).remInsertMarker();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Integer getMaxFastAddValues(){
        return(((TdlModuleDMO) core).getMaxFastAddValues());
    }

    /**
     * Sets maxFastAddValues to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setMaxFastAddValues(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).setMaxFastAddValues(value);
    }

    /**
     * Sets maxFastAddValues to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setMaxFastAddValues(Integer value){
        ((TdlModuleDMO) core).setMaxFastAddValues(value);
    }

    /**
     * Removes the maxFastAddValues attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remMaxFastAddValues(){
        ((TdlModuleDMO) core).remMaxFastAddValues();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DefinitionName getName(){
        return(((TdlModuleDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setName(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setName(DefinitionName value){
        ((TdlModuleDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remName(){
        ((TdlModuleDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getPackage(){
        return(((TdlModuleDMO) core).getPackage());
    }

    /**
     * Sets package to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setPackage(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).setPackage(value);
    }

    /**
     * Sets package to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setPackage(String value){
        ((TdlModuleDMO) core).setPackage(value);
    }

    /**
     * Removes the package attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remPackage(){
        ((TdlModuleDMO) core).remPackage();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getTemplateFile(){
        return(((TdlModuleDMO) core).getTemplateFile());
    }

    /**
     * Sets templateFile to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setTemplateFile(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).setTemplateFile(value);
    }

    /**
     * Sets templateFile to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setTemplateFile(String value){
        ((TdlModuleDMO) core).setTemplateFile(value);
    }

    /**
     * Removes the templateFile attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remTemplateFile(){
        ((TdlModuleDMO) core).remTemplateFile();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getTemplateFileSuffix(){
        return(((TdlModuleDMO) core).getTemplateFileSuffix());
    }

    /**
     * Sets templateFileSuffix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setTemplateFileSuffix(Object value) throws DmcValueException {
        ((TdlModuleDMO) core).setTemplateFileSuffix(value);
    }

    /**
     * Sets templateFileSuffix to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setTemplateFileSuffix(String value){
        ((TdlModuleDMO) core).setTemplateFileSuffix(value);
    }

    /**
     * Removes the templateFileSuffix attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remTemplateFileSuffix(){
        ((TdlModuleDMO) core).remTemplateFileSuffix();
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:313)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:215)
    /**
     * All definitions are added to the base definition collection.
     */
    void addTdlDefinition(TdlDefinition def){
        TdlDefinitionDefs.add(def);
    }

    void deleteTdlDefinition(TdlDefinition def){
        try {
            TdlDefinitionDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
    }

    public int getTdlDefinitionCount(){
        return(TdlDefinitionDefs.size());
    }

    public TdlDefinition getTdlDefinition(DotName name){
        return(TdlDefinitionDefs.getDefinition(name));
    }

    public Iterator<TdlDefinition> getAllTdlDefinition(){
        return(TdlDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addContainedElement(ContainedElement def){
        ContainedElementDefs.add(def);
        addTdlDefinition(def);
    }

    public void deleteContainedElement(ContainedElement def){
        try{
            ContainedElementDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteTdlDefinition(def);
    }

    public int getContainedElementCount(){
        return(ContainedElementDefs.size());
    }

    public ContainedElement getContainedElement(DotName name){
        return(ContainedElementDefs.getDefinition(name));
    }

    public Iterator<ContainedElement> getAllContainedElement(){
        return(ContainedElementDefs.values().iterator());
    }

    public ContainedElement getContainedElementDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ContainedElementDefs.getDefinition(name));
    }

    public Iterator<ContainedElement> getContainedElementDefinitionsByName(String name) throws DmcValueException{
        return(ContainedElementDefs.getDefinitionsByName(name));
    }

    public int getContainedElementDefinitionCountByName(String name) throws DmcValueException{
        return(ContainedElementDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addExtensionHook(ExtensionHook def){
        ExtensionHookDefs.add(def);
        addContainedElement(def);
    }

    public void deleteExtensionHook(ExtensionHook def){
        try{
            ExtensionHookDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteContainedElement(def);
    }

    public int getExtensionHookCount(){
        return(ExtensionHookDefs.size());
    }

    public ExtensionHook getExtensionHook(DotName name){
        return(ExtensionHookDefs.getDefinition(name));
    }

    public Iterator<ExtensionHook> getAllExtensionHook(){
        return(ExtensionHookDefs.values().iterator());
    }

    public ExtensionHook getExtensionHookDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ExtensionHookDefs.getDefinition(name));
    }

    public Iterator<ExtensionHook> getExtensionHookDefinitionsByName(String name) throws DmcValueException{
        return(ExtensionHookDefs.getDefinitionsByName(name));
    }

    public int getExtensionHookDefinitionCountByName(String name) throws DmcValueException{
        return(ExtensionHookDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addSection(Section def){
        SectionDefs.add(def);
        addContainedElement(def);
    }

    public void deleteSection(Section def){
        try{
            SectionDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteContainedElement(def);
    }

    public int getSectionCount(){
        return(SectionDefs.size());
    }

    public Section getSection(DotName name){
        return(SectionDefs.getDefinition(name));
    }

    public Iterator<Section> getAllSection(){
        return(SectionDefs.values().iterator());
    }

    public Section getSectionDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(SectionDefs.getDefinition(name));
    }

    public Iterator<Section> getSectionDefinitionsByName(String name) throws DmcValueException{
        return(SectionDefs.getDefinitionsByName(name));
    }

    public int getSectionDefinitionCountByName(String name) throws DmcValueException{
        return(SectionDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addTextualArtifact(TextualArtifact def){
        TextualArtifactDefs.add(def);
        addTdlDefinition(def);
    }

    public void deleteTextualArtifact(TextualArtifact def){
        try{
            TextualArtifactDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteTdlDefinition(def);
    }

    public int getTextualArtifactCount(){
        return(TextualArtifactDefs.size());
    }

    public TextualArtifact getTextualArtifact(DotName name){
        return(TextualArtifactDefs.getDefinition(name));
    }

    public Iterator<TextualArtifact> getAllTextualArtifact(){
        return(TextualArtifactDefs.values().iterator());
    }

    public TextualArtifact getTextualArtifactDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(TextualArtifactDefs.getDefinition(name));
    }

    public Iterator<TextualArtifact> getTextualArtifactDefinitionsByName(String name) throws DmcValueException{
        return(TextualArtifactDefs.getDefinitionsByName(name));
    }

    public int getTextualArtifactDefinitionCountByName(String name) throws DmcValueException{
        return(TextualArtifactDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:224)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     * And, since this is a module, it's just the name of the module.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        return(getName().getNameString());
    }


}
