package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.Iterator;                                                     // Support copy of MV objects - (BaseDMWGeneratorNewest.java:1862)
import java.util.TreeSet;                                                      // To support getMVCopy() - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.*;                                                          // If any attributes - (BaseDMWGeneratorNewest.java:808)
import org.dmd.dmc.types.CamelCaseName;                                        // Is named by - (BaseDMWGeneratorNewest.java:789)
import org.dmd.dms.*;                                                          // Always 2 - (BaseDMWGeneratorNewest.java:793)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:797)
import org.dmd.dms.generated.dmw.StringIterableDMW;                            // For multi-valued String - (BaseDMWGeneratorNewest.java:1727)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                          // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:796)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                  // Derived class - (BaseDMWGeneratorNewest.java:943)
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:801)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                  // Attribute from mvw schema - (BaseDMWGeneratorNewest.java:717)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:947)


/**
 * The RunContextItem allows for the generation of an overall RunContext for
 * a WebApplication or WebSite.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class RunContextItemDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public RunContextItemDMW() {
        super(new RunContextItemDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._RunContextItem);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public RunContextItemDMW(DmcTypeModifierMV mods) {
        super(new RunContextItemDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._RunContextItem);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public RunContextItem getModificationRecorder(){
        RunContextItem rc = new RunContextItem();
        rc.setItemName(getItemName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public RunContextItemDMW(RunContextItemDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._RunContextItem);
    }

    public RunContextItem cloneIt() {
        RunContextItem rc = new RunContextItem();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public RunContextItemDMO getDMO() {
        return((RunContextItemDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected RunContextItemDMW(RunContextItemDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:992)
    public CamelCaseName getObjectName(){
        return(((RunContextItemDMO) core).getItemName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((RunContextItemDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof RunContextItemDMW){
            return( getObjectName().equals( ((RunContextItemDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public Integer getItemOrder(){
        return(((RunContextItemDMO) core).getItemOrder());
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setItemOrder(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setItemOrder(value);
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setItemOrder(Integer value){
        ((RunContextItemDMO) core).setItemOrder(value);
    }

    /**
     * Removes the itemOrder attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remItemOrder(){
        ((RunContextItemDMO) core).remItemOrder();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public String getContextImpl(){
        return(((RunContextItemDMO) core).getContextImpl());
    }

    /**
     * Sets contextImpl to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setContextImpl(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setContextImpl(value);
    }

    /**
     * Sets contextImpl to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setContextImpl(String value){
        ((RunContextItemDMO) core).setContextImpl(value);
    }

    /**
     * Removes the contextImpl attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remContextImpl(){
        ((RunContextItemDMO) core).remContextImpl();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1344)
    public int getImportThisSize(){
        return(((RunContextItemDMO) core).getImportThisSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1352)
    public boolean getImportThisIsEmpty(){
        if (((RunContextItemDMO) core).getImportThisSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1362)
    public boolean getImportThisHasValue(){
        if (((RunContextItemDMO) core).getImportThisSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1731)
    public StringIterableDMW getImportThisIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__importThis);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((RunContextItemDMO) core).getImportThis()));
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1757)
    public void addImportThis(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).addImportThis(value);
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1767)
    public void addImportThis(String value){
        ((RunContextItemDMO) core).addImportThis(value);
    }

    /**
     * Returns true if the collection contains the importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1824)
    public boolean importThisContains(String value){
        return(((RunContextItemDMO) core).importThisContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1866)
    @SuppressWarnings("unchecked")
    public TreeSet<String> getImportThisCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__importThis);
        if (attr == null)
            return(new TreeSet<String>());
        
        TreeSet<String> rc = new TreeSet<String>();
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1893)
    public void delImportThis(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).delImportThis(value);
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1902)
    public void delImportThis(String value){
        ((RunContextItemDMO) core).delImportThis(value);
    }

    /**
     * Removes the importThis attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1914)
    public void remImportThis(){
        ((RunContextItemDMO) core).remImportThis();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public Boolean isCreateOnDemand(){
        return(((RunContextItemDMO) core).isCreateOnDemand());
    }

    /**
     * Sets createOnDemand to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setCreateOnDemand(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setCreateOnDemand(value);
    }

    /**
     * Sets createOnDemand to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setCreateOnDemand(Boolean value){
        ((RunContextItemDMO) core).setCreateOnDemand(value);
    }

    /**
     * Removes the createOnDemand attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remCreateOnDemand(){
        ((RunContextItemDMO) core).remCreateOnDemand();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public Boolean isSingleton(){
        return(((RunContextItemDMO) core).isSingleton());
    }

    /**
     * Sets singleton to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setSingleton(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setSingleton(value);
    }

    /**
     * Sets singleton to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setSingleton(Boolean value){
        ((RunContextItemDMO) core).setSingleton(value);
    }

    /**
     * Removes the singleton attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remSingleton(){
        ((RunContextItemDMO) core).remSingleton();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public Boolean isAutoCreated(){
        return(((RunContextItemDMO) core).isAutoCreated());
    }

    /**
     * Sets autoCreated to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setAutoCreated(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setAutoCreated(value);
    }

    /**
     * Sets autoCreated to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setAutoCreated(Boolean value){
        ((RunContextItemDMO) core).setAutoCreated(value);
    }

    /**
     * Removes the autoCreated attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remAutoCreated(){
        ((RunContextItemDMO) core).remAutoCreated();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public CamelCaseName getItemName(){
        return(((RunContextItemDMO) core).getItemName());
    }

    /**
     * Sets itemName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setItemName(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setItemName(value);
    }

    /**
     * Sets itemName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setItemName(CamelCaseName value){
        ((RunContextItemDMO) core).setItemName(value);
    }

    /**
     * Removes the itemName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remItemName(){
        ((RunContextItemDMO) core).remItemName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public String getUseClass(){
        return(((RunContextItemDMO) core).getUseClass());
    }

    /**
     * Sets useClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setUseClass(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setUseClass(value);
    }

    /**
     * Sets useClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setUseClass(String value){
        ((RunContextItemDMO) core).setUseClass(value);
    }

    /**
     * Removes the useClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remUseClass(){
        ((RunContextItemDMO) core).remUseClass();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public String getConstruction(){
        return(((RunContextItemDMO) core).getConstruction());
    }

    /**
     * Sets construction to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setConstruction(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setConstruction(value);
    }

    /**
     * Sets construction to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setConstruction(String value){
        ((RunContextItemDMO) core).setConstruction(value);
    }

    /**
     * Removes the construction attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remConstruction(){
        ((RunContextItemDMO) core).remConstruction();
    }


}
