package org.dmd.dmg.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                    // To support getMVCopy() - (BaseDMWGeneratorNewest.java:997)
import java.util.Iterator;                                     // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2048)
import org.dmd.dmc.*;                                          // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmg.generated.dmo.DmgConfigDMO;                 // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmg.generated.dmo.DmgDMSAG;                     // Attribute configSuffix from the dmg schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.dmg.generated.dmw.GeneratorIterableDMW;         // For multi-valued Generator - (BaseDMWGeneratorNewest.java:1913)
import org.dmd.dmg.types.Generator;                            // Primitive type - (BaseDMWGeneratorNewest.java:966)
import org.dmd.dms.*;                                          // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.dmw.StringIterableDMW;            // For multi-valued String - (BaseDMWGeneratorNewest.java:1913)
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmw.DmwWrapper;                                 // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * The DmgConfig class is used to specify a set of schemas and a set of  code
 * generators to be run when you want to generate various types of code.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class DmgConfigDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public DmgConfigDMW() {
        super(new DmgConfigDMO(), org.dmd.dmg.generated.DmgSchemaAG._DmgConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public DmgConfigDMW(DmcTypeModifierMV mods) {
        super(new DmgConfigDMO(mods), org.dmd.dmg.generated.DmgSchemaAG._DmgConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public DmgConfigDMW getModificationRecorder(){
        DmgConfigDMW rc = new DmgConfigDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public DmgConfigDMW(DmgConfigDMO obj) {
        super(obj, org.dmd.dmg.generated.DmgSchemaAG._DmgConfig);
    }

    public DmgConfigDMW cloneIt() {
        DmgConfigDMW rc = new DmgConfigDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public DmgConfigDMO getDMO() {
        return((DmgConfigDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected DmgConfigDMW(DmgConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getConfigSuffixSize(){
        return(((DmgConfigDMO) core).getConfigSuffixSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getConfigSuffixIsEmpty(){
        if (((DmgConfigDMO) core).getConfigSuffixSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getConfigSuffixHasValue(){
        if (((DmgConfigDMO) core).getConfigSuffixSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1917)
    public StringIterableDMW getConfigSuffixIterable(){
        DmcAttribute<?> attr = core.get(DmgDMSAG.__configSuffix);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((DmgConfigDMO) core).getConfigSuffix()));
    }

    /**
     * Adds another configSuffix value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1943)
    public void addConfigSuffix(Object value) throws DmcValueException {
        ((DmgConfigDMO) core).addConfigSuffix(value);
    }

    /**
     * Adds another configSuffix value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1953)
    public void addConfigSuffix(String value){
        ((DmgConfigDMO) core).addConfigSuffix(value);
    }

    /**
     * Returns true if the collection contains the configSuffix value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2010)
    public boolean configSuffixContains(String value){
        return(((DmgConfigDMO) core).configSuffixContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2052)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getConfigSuffixCopy(){
        DmcAttribute<?> attr = core.get(DmgDMSAG.__configSuffix);
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
     * Deletes a configSuffix value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2079)
    public void delConfigSuffix(Object value) throws DmcValueException {
        ((DmgConfigDMO) core).delConfigSuffix(value);
    }

    /**
     * Deletes a configSuffix value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2088)
    public void delConfigSuffix(String value){
        ((DmgConfigDMO) core).delConfigSuffix(value);
    }

    /**
     * Removes the configSuffix attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remConfigSuffix(){
        ((DmgConfigDMO) core).remConfigSuffix();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getDescription(){
        return(((DmgConfigDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setDescription(Object value) throws DmcValueException {
        ((DmgConfigDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setDescription(String value){
        ((DmgConfigDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remDescription(){
        ((DmgConfigDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getGenPackage(){
        return(((DmgConfigDMO) core).getGenPackage());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setGenPackage(Object value) throws DmcValueException {
        ((DmgConfigDMO) core).setGenPackage(value);
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setGenPackage(String value){
        ((DmgConfigDMO) core).setGenPackage(value);
    }

    /**
     * Removes the genPackage attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remGenPackage(){
        ((DmgConfigDMO) core).remGenPackage();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getGeneratedFileHeader(){
        return(((DmgConfigDMO) core).getGeneratedFileHeader());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        ((DmgConfigDMO) core).setGeneratedFileHeader(value);
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setGeneratedFileHeader(String value){
        ((DmgConfigDMO) core).setGeneratedFileHeader(value);
    }

    /**
     * Removes the generatedFileHeader attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remGeneratedFileHeader(){
        ((DmgConfigDMO) core).remGeneratedFileHeader();
    }

    /**
     * @return The number of Generator items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getGeneratorSize(){
        return(((DmgConfigDMO) core).getGeneratorSize());
    }

    /**
     * @return true if there are no GeneratorDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getGeneratorIsEmpty(){
        if (((DmgConfigDMO) core).getGeneratorSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any GeneratorDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getGeneratorHasValue(){
        if (((DmgConfigDMO) core).getGeneratorSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Generator objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1917)
    public GeneratorIterableDMW getGeneratorIterable(){
        DmcAttribute<?> attr = core.get(DmgDMSAG.__generator);
        if (attr == null)
            return(GeneratorIterableDMW.emptyList);
        
        return(new GeneratorIterableDMW(((DmgConfigDMO) core).getGenerator()));
    }

    /**
     * Adds another generator value.
     * @param value A value compatible with Generator
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1943)
    public void addGenerator(Object value) throws DmcValueException {
        ((DmgConfigDMO) core).addGenerator(value);
    }

    /**
     * Adds another generator value.
     * @param value A value compatible with Generator
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1953)
    public void addGenerator(Generator value){
        ((DmgConfigDMO) core).addGenerator(value);
    }

    /**
     * Returns true if the collection contains the generator value.
     * @param value A value compatible with Generator
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2010)
    public boolean generatorContains(Generator value){
        return(((DmgConfigDMO) core).generatorContains(value));
    }

    /**
     * @return A COPY of the collection of Generator objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2052)
    @SuppressWarnings("unchecked")
    public ArrayList<Generator> getGeneratorCopy(){
        DmcAttribute<?> attr = core.get(DmgDMSAG.__generator);
        if (attr == null)
            return(new ArrayList<Generator>());
        
        ArrayList<Generator> rc = new ArrayList<Generator>(attr.getMVSize());
        
        Iterator<Generator> it = (Iterator<Generator>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a generator value.
     * @param value The Generator to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2079)
    public void delGenerator(Object value) throws DmcValueException {
        ((DmgConfigDMO) core).delGenerator(value);
    }

    /**
     * Deletes a generator value.
     * @param value The Generator to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2088)
    public void delGenerator(Generator value){
        ((DmgConfigDMO) core).delGenerator(value);
    }

    /**
     * Removes the generator attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remGenerator(){
        ((DmgConfigDMO) core).remGenerator();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getSchemaToLoad(){
        return(((DmgConfigDMO) core).getSchemaToLoad());
    }

    /**
     * Sets schemaToLoad to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setSchemaToLoad(Object value) throws DmcValueException {
        ((DmgConfigDMO) core).setSchemaToLoad(value);
    }

    /**
     * Sets schemaToLoad to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setSchemaToLoad(String value){
        ((DmgConfigDMO) core).setSchemaToLoad(value);
    }

    /**
     * Removes the schemaToLoad attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remSchemaToLoad(){
        ((DmgConfigDMO) core).remSchemaToLoad();
    }


}
