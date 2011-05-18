package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import java.util.ArrayList;                                            // To support getMVCopy()
import java.util.Iterator;                                             // To support getMVCopy()
import org.dmd.dmc.*;                                                  // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                // Primitive type
import org.dmd.dms.*;                                                  // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                    // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.Module;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;          // Derived class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ModuleDMO;         // Class not auxiliary or abstract

/**
 * The Module is used to define a reusable set of MVW functionality which can
 * be referred to in Application definitions or other Module definitions.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class ModuleDMW extends MvwDefinition implements DmcNamedObjectIF {

    public ModuleDMW() {
        super(new ModuleDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Module);
    }

    public ModuleDMW(DmcTypeModifierMV mods) {
        super(new ModuleDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Module);
    }

    public Module getModificationRecorder(){
        Module rc = new Module();
        rc.setModuleName(getModuleName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public ModuleDMW(ModuleDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Module);
    }

    public ModuleDMO getDMO() {
        return((ModuleDMO) core);
    }

    protected ModuleDMW(ModuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public CamelCaseName getObjectName(){
        return(((ModuleDMO) core).getModuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ModuleDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ModuleDMW){
            return( getObjectName().equals( ((ModuleDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getDependsOnModuleSize(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnModule);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getDependsOnModuleIsEmpty(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnModule);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getDependsOnModuleHasValue(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnModule);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public StringIterableDMW getDependsOnModuleIterable(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnModule);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ModuleDMO) core).getDependsOnModule()));
    }

    /**
     * Adds another dependsOnModule value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addDependsOnModule(Object value) throws DmcValueException {
        ((ModuleDMO) core).addDependsOnModule(value);
    }

    /**
     * Adds another dependsOnModule value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addDependsOnModule(String value){
        ((ModuleDMO) core).addDependsOnModule(value);
    }

    /**
     * Returns true if the collection contains the dependsOnModule value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1370)
    public boolean dependsOnModuleContains(String value){
        return(((ModuleDMO) core).dependsOnModuleContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1410)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDependsOnModuleCopy(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnModule);
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
     * Deletes a dependsOnModule value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1437)
    public void delDependsOnModule(Object value) throws DmcValueException {
        ((ModuleDMO) core).delDependsOnModule(value);
    }

    /**
     * Deletes a dependsOnModule value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void delDependsOnModule(String value){
        ((ModuleDMO) core).delDependsOnModule(value);
    }

    /**
     * Removes the dependsOnModule attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remDependsOnModule(){
        ((ModuleDMO) core).remDependsOnModule();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getDependsOnSchemaSize(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnSchema);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getDependsOnSchemaIsEmpty(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnSchema);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getDependsOnSchemaHasValue(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnSchema);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public StringIterableDMW getDependsOnSchemaIterable(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnSchema);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ModuleDMO) core).getDependsOnSchema()));
    }

    /**
     * Adds another dependsOnSchema value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addDependsOnSchema(Object value) throws DmcValueException {
        ((ModuleDMO) core).addDependsOnSchema(value);
    }

    /**
     * Adds another dependsOnSchema value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addDependsOnSchema(String value){
        ((ModuleDMO) core).addDependsOnSchema(value);
    }

    /**
     * Returns true if the collection contains the dependsOnSchema value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1370)
    public boolean dependsOnSchemaContains(String value){
        return(((ModuleDMO) core).dependsOnSchemaContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1410)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDependsOnSchemaCopy(){
        DmcAttribute<?> attr = core.get(ModuleDMO.__dependsOnSchema);
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
     * Deletes a dependsOnSchema value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1437)
    public void delDependsOnSchema(Object value) throws DmcValueException {
        ((ModuleDMO) core).delDependsOnSchema(value);
    }

    /**
     * Deletes a dependsOnSchema value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void delDependsOnSchema(String value){
        ((ModuleDMO) core).delDependsOnSchema(value);
    }

    /**
     * Removes the dependsOnSchema attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remDependsOnSchema(){
        ((ModuleDMO) core).remDependsOnSchema();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public CamelCaseName getModuleName(){
        return(((ModuleDMO) core).getModuleName());
    }

    /**
     * Sets moduleName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setModuleName(Object value) throws DmcValueException {
        ((ModuleDMO) core).setModuleName(value);
    }

    /**
     * Sets moduleName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setModuleName(CamelCaseName value){
        ((ModuleDMO) core).setModuleName(value);
    }

    /**
     * Removes the moduleName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remModuleName(){
        ((ModuleDMO) core).remModuleName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getGenPackage(){
        return(((ModuleDMO) core).getGenPackage());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setGenPackage(Object value) throws DmcValueException {
        ((ModuleDMO) core).setGenPackage(value);
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setGenPackage(String value){
        ((ModuleDMO) core).setGenPackage(value);
    }

    /**
     * Removes the genPackage attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remGenPackage(){
        ((ModuleDMO) core).remGenPackage();
    }


}
