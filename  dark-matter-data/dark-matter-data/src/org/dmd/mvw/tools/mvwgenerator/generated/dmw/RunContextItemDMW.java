package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:922)
import java.util.Iterator;                                                     // To support getMVCopy()
import java.util.TreeSet;                                                      // To support getMVCopy()
import org.dmd.dmc.*;                                                          // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                        // Primitive type
import org.dmd.dms.*;                                                          // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                            // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                          // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                  // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;         // Class not auxiliary or abstract

/**
 * The RunContextItem allows for the generation of an overall RunContext for
 * a WebApplication or WebSite.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class RunContextItemDMW extends MvwDefinition implements DmcNamedObjectIF {

    public RunContextItemDMW() {
        super(new RunContextItemDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._RunContextItem);
    }

    public RunContextItemDMW(DmcTypeModifierMV mods) {
        super(new RunContextItemDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._RunContextItem);
    }

    public RunContextItem getModificationRecorder(){
        RunContextItem rc = new RunContextItem();
        rc.setItemName(getItemName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public RunContextItemDMW(RunContextItemDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._RunContextItem);
    }

    public RunContextItemDMO getDMO() {
        return((RunContextItemDMO) core);
    }

    protected RunContextItemDMW(RunContextItemDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:950)
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

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public Integer getItemOrder(){
        return(((RunContextItemDMO) core).getItemOrder());
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setItemOrder(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setItemOrder(value);
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setItemOrder(Integer value){
        ((RunContextItemDMO) core).setItemOrder(value);
    }

    /**
     * Removes the itemOrder attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remItemOrder(){
        ((RunContextItemDMO) core).remItemOrder();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getContextImpl(){
        return(((RunContextItemDMO) core).getContextImpl());
    }

    /**
     * Sets contextImpl to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setContextImpl(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setContextImpl(value);
    }

    /**
     * Sets contextImpl to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setContextImpl(String value){
        ((RunContextItemDMO) core).setContextImpl(value);
    }

    /**
     * Removes the contextImpl attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remContextImpl(){
        ((RunContextItemDMO) core).remContextImpl();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1221)
    public int getImportThisSize(){
        DmcAttribute<?> attr = core.get(RunContextItemDMO.__importThis);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1233)
    public boolean getImportThisIsEmpty(){
        DmcAttribute<?> attr = core.get(RunContextItemDMO.__importThis);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public boolean getImportThisHasValue(){
        DmcAttribute<?> attr = core.get(RunContextItemDMO.__importThis);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1357)
    public StringIterableDMW getImportThisIterable(){
        DmcAttribute<?> attr = core.get(RunContextItemDMO.__importThis);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((RunContextItemDMO) core).getImportThis()));
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1373)
    public void addImportThis(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).addImportThis(value);
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1382)
    public void addImportThis(String value){
        ((RunContextItemDMO) core).addImportThis(value);
    }

    /**
     * Returns true if the collection contains the importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1406)
    public boolean importThisContains(String value){
        return(((RunContextItemDMO) core).importThisContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public TreeSet<String> getImportThisCopy(){
        DmcAttribute<?> attr = core.get(RunContextItemDMO.__importThis);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1473)
    public void delImportThis(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).delImportThis(value);
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1482)
    public void delImportThis(String value){
        ((RunContextItemDMO) core).delImportThis(value);
    }

    /**
     * Removes the importThis attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1494)
    public void remImportThis(){
        ((RunContextItemDMO) core).remImportThis();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public CamelCaseName getItemName(){
        return(((RunContextItemDMO) core).getItemName());
    }

    /**
     * Sets itemName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setItemName(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setItemName(value);
    }

    /**
     * Sets itemName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setItemName(CamelCaseName value){
        ((RunContextItemDMO) core).setItemName(value);
    }

    /**
     * Removes the itemName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remItemName(){
        ((RunContextItemDMO) core).remItemName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getUseClass(){
        return(((RunContextItemDMO) core).getUseClass());
    }

    /**
     * Sets useClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setUseClass(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setUseClass(value);
    }

    /**
     * Sets useClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setUseClass(String value){
        ((RunContextItemDMO) core).setUseClass(value);
    }

    /**
     * Removes the useClass attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remUseClass(){
        ((RunContextItemDMO) core).remUseClass();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getConstruction(){
        return(((RunContextItemDMO) core).getConstruction());
    }

    /**
     * Sets construction to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setConstruction(Object value) throws DmcValueException {
        ((RunContextItemDMO) core).setConstruction(value);
    }

    /**
     * Sets construction to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setConstruction(String value){
        ((RunContextItemDMO) core).setConstruction(value);
    }

    /**
     * Removes the construction attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remConstruction(){
        ((RunContextItemDMO) core).remConstruction();
    }


}
