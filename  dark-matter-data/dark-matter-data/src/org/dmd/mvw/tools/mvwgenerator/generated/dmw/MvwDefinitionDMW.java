package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import org.dmd.dmc.*;                                                         // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                       // Primitive type
import org.dmd.dms.*;                                                         // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Attribute from meta schema
import org.dmd.dmw.DmwNamedObjectWrapper;                                     // Named object wrapper
import org.dmd.mvw.tools.mvwgenerator.extended.Module;                        // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                 // Attribute from mvw schema
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Abstract class
import org.dmd.mvw.tools.mvwgenerator.generated.types.ModuleREF;              // To support getMVCopy() for REFs

/**
 * The MvwDefinition class provide a common base for all MVW definition
 * classes.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class MvwDefinitionDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    protected MvwDefinitionDMW() {
        super();
    }

    abstract public MvwDefinition getModificationRecorder();

    public MvwDefinitionDMO getDMO() {
        return((MvwDefinitionDMO) core);
    }

    protected MvwDefinitionDMW(MvwDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:961)
    public CamelCaseName getObjectName(){
        return(((MvwDefinitionDMO) core).getCamelCaseName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvwDefinitionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvwDefinitionDMW){
            return( getObjectName().equals( ((MvwDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public String getFile(){
        return(((MvwDefinitionDMO) core).getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setFile(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setFile(value);
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setFile(String value){
        ((MvwDefinitionDMO) core).setFile(value);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remFile(){
        ((MvwDefinitionDMO) core).remFile();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public Integer getLineNumber(){
        return(((MvwDefinitionDMO) core).getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setLineNumber(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setLineNumber(Integer value){
        ((MvwDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remLineNumber(){
        ((MvwDefinitionDMO) core).remLineNumber();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public String getDescription(){
        return(((MvwDefinitionDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setDescription(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setDescription(String value){
        ((MvwDefinitionDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remDescription(){
        ((MvwDefinitionDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public CamelCaseName getCamelCaseName(){
        return(((MvwDefinitionDMO) core).getCamelCaseName());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setCamelCaseName(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setCamelCaseName(value);
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setCamelCaseName(CamelCaseName value){
        ((MvwDefinitionDMO) core).setCamelCaseName(value);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remCamelCaseName(){
        ((MvwDefinitionDMO) core).remCamelCaseName();
    }

    /**
     * @return A Module object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1077)
    public Module getDefinedInModule(){
        ModuleREF ref = ((MvwDefinitionDMO) core).getDefinedInModule();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Module)ref.getObject().getContainer());
    }

    /**
     * Sets the definedInModule to the specified value.
     * @param value A value compatible with ModuleREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1125)
    public void setDefinedInModule(Module value) {
        ((MvwDefinitionDMO) core).setDefinedInModule(value.getDMO());
    }

    /**
     * Removes the definedInModule attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remDefinedInModule(){
        ((MvwDefinitionDMO) core).remDefinedInModule();
    }


}