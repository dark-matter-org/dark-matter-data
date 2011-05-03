package org.dmd.mvw.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import org.dmd.dmc.*;                                      // If any attributes
import org.dmd.dmc.types.CamelCaseName;                    // Primitive type
import org.dmd.dms.*;                                      // Always 2
import org.dmd.mvw.extended.MvwConfig;                     // Is reference type aux
import org.dmd.mvw.extended.MvwDefinition;                 // Required for getModificationRecorder()
import org.dmd.mvw.generated.dmo.MvwDefinitionDMO;         // Abstract class
import org.dmd.mvw.generated.types.MvwConfigREF;           // To support getMVCopy() for REFs

/**
 * The MvwDefinition class provide a common base for all MVW definition
 * classes.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvwDefinitionDMW extends DmwWrapper implements DmcNamedObjectIF {

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

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
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

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getFile(){
        return(((MvwDefinitionDMO) core).getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setFile(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setFile(value);
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setFile(String value){
        ((MvwDefinitionDMO) core).setFile(value);
    }

    /**
     * Removes the file attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remFile(){
        ((MvwDefinitionDMO) core).remFile();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public Integer getLineNumber(){
        return(((MvwDefinitionDMO) core).getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setLineNumber(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setLineNumber(Integer value){
        ((MvwDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remLineNumber(){
        ((MvwDefinitionDMO) core).remLineNumber();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getDescription(){
        return(((MvwDefinitionDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setDescription(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setDescription(String value){
        ((MvwDefinitionDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remDescription(){
        ((MvwDefinitionDMO) core).remDescription();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public CamelCaseName getCamelCaseName(){
        return(((MvwDefinitionDMO) core).getCamelCaseName());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setCamelCaseName(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setCamelCaseName(value);
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setCamelCaseName(CamelCaseName value){
        ((MvwDefinitionDMO) core).setCamelCaseName(value);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remCamelCaseName(){
        ((MvwDefinitionDMO) core).remCamelCaseName();
    }

    /**
     * @return A MvwConfig object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1030)
    public MvwConfig getDefinedInMvwConfig(){
        MvwConfigREF ref = ((MvwDefinitionDMO) core).getDefinedInMvwConfig();
        if (ref == null)
            return(null);
        
        return((MvwConfig)ref.getObject().getContainer());
    }

    /**
     * Sets the definedInMvwConfig to the specified value.
     * @param value A value compatible with MvwConfigREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1075)
    public void setDefinedInMvwConfig(MvwConfig value) {
        ((MvwDefinitionDMO) core).setDefinedInMvwConfig(value.getDMO());
    }

    /**
     * Removes the definedInMvwConfig attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remDefinedInMvwConfig(){
        ((MvwDefinitionDMO) core).remDefinedInMvwConfig();
    }


}
