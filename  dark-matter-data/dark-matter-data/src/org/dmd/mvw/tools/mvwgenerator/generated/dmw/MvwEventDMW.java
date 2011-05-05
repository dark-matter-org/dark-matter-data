package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import java.util.Iterator;                                               // To support getMVCopy()
import java.util.TreeSet;                                                // To support getMVCopy()
import org.dmd.dmc.*;                                                    // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                  // Primitive type
import org.dmd.dms.*;                                                    // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                      // For multi-valued String
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;            // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.MvwEvent;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwEventDMO;         // Abstract class

/**
 * The MvwEvent is an autonomous definition of some kind of event that is
 * fired and handled by components in a Model-View-Whatever application.
 * Specification of an MvwEvent will result the creation of a
 * GwtEvent.Type<H> class and its associated EventHandler class.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvwEventDMW extends MvwDefinition implements DmcNamedObjectIF {

    protected MvwEventDMW() {
        super();
    }

    abstract public MvwEvent getModificationRecorder();

    public MvwEventDMO getDMO() {
        return((MvwEventDMO) core);
    }

    protected MvwEventDMW(MvwEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public CamelCaseName getObjectName(){
        return(((MvwEventDMO) core).getCamelCaseName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvwEventDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvwEventDMW){
            return( getObjectName().equals( ((MvwEventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getDescription(){
        return(((MvwEventDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setDescription(Object value) throws DmcValueException {
        ((MvwEventDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setDescription(String value){
        ((MvwEventDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remDescription(){
        ((MvwEventDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getUserDataType(){
        return(((MvwEventDMO) core).getUserDataType());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setUserDataType(Object value) throws DmcValueException {
        ((MvwEventDMO) core).setUserDataType(value);
    }

    /**
     * Sets userDataType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setUserDataType(String value){
        ((MvwEventDMO) core).setUserDataType(value);
    }

    /**
     * Removes the userDataType attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remUserDataType(){
        ((MvwEventDMO) core).remUserDataType();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getUserDataImportSize(){
        DmcAttribute<?> attr = core.get(MvwEventDMO.__userDataImport);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getUserDataImportIsEmpty(){
        DmcAttribute<?> attr = core.get(MvwEventDMO.__userDataImport);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getUserDataImportHasValue(){
        DmcAttribute<?> attr = core.get(MvwEventDMO.__userDataImport);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public StringIterableDMW getUserDataImportIterable(){
        DmcAttribute<?> attr = core.get(MvwEventDMO.__userDataImport);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((MvwEventDMO) core).getUserDataImport()));
    }

    /**
     * Adds another userDataImport value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addUserDataImport(Object value) throws DmcValueException {
        ((MvwEventDMO) core).addUserDataImport(value);
    }

    /**
     * Adds another userDataImport value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addUserDataImport(String value){
        ((MvwEventDMO) core).addUserDataImport(value);
    }

    /**
     * Returns true if the collection contains the userDataImport value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1370)
    public boolean userDataImportContains(String value){
        return(((MvwEventDMO) core).userDataImportContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1410)
    @SuppressWarnings("unchecked")
    public TreeSet<String> getUserDataImportCopy(){
        DmcAttribute<?> attr = core.get(MvwEventDMO.__userDataImport);
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
     * Deletes a userDataImport value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1437)
    public void delUserDataImport(Object value) throws DmcValueException {
        ((MvwEventDMO) core).delUserDataImport(value);
    }

    /**
     * Deletes a userDataImport value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void delUserDataImport(String value){
        ((MvwEventDMO) core).delUserDataImport(value);
    }

    /**
     * Removes the userDataImport attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remUserDataImport(){
        ((MvwEventDMO) core).remUserDataImport();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public CamelCaseName getCamelCaseName(){
        return(((MvwEventDMO) core).getCamelCaseName());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setCamelCaseName(Object value) throws DmcValueException {
        ((MvwEventDMO) core).setCamelCaseName(value);
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setCamelCaseName(CamelCaseName value){
        ((MvwEventDMO) core).setCamelCaseName(value);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remCamelCaseName(){
        ((MvwEventDMO) core).remCamelCaseName();
    }


}
