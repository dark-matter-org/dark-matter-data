package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:715)
import java.util.*;                                                        // If not auxiliary
import org.dmd.dmc.*;                                                      // If any attributes
import org.dmd.dmc.types.StringName;                                       // Primitive type
import org.dmd.dms.*;                                                      // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                        // For multi-valued String
import org.dmd.features.extgwt.extended.MvcConfig;                         // Is reference type
import org.dmd.features.extgwt.extended.MvcDefinition;                     // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;                 // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.dmw.MvcConfigIterableDMW;         // For multi-valued MvcConfig
import org.dmd.features.extgwt.generated.types.MvcConfigREF;               // Is reference type

/**
 * The MvcConfig class is stored in a file with a .mvc suffix and used to
 * define the set of files that hold the definitions of MvcEvents,
 * MvcControllers and MvcViews. Based on the definition of these objects, we
 * can generate base classes for the com.extjs.gxt.ui.client.mvc.Controller
 * and com.extjs.gxt.ui.client.mvc.View that provide some common code
 * required by these classes.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:339)
 */
abstract public class MvcConfigDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcConfigDMO mycore;

    public MvcConfigDMW() {
        super(new MvcConfigDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcConfig);
        mycore = (MvcConfigDMO) core;
        mycore.setContainer(this);
    }

    public MvcConfigDMW(MvcConfigDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcConfig);
        mycore = (MvcConfigDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcConfigDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcConfigDMW(MvcConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcConfigDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcConfig>());
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:741)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcConfigDMW){
            return( getObjectName().equals( ((MvcConfigDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of MvcConfigDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:947)
    public int getDependsOnMVCSize(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcConfigDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:959)
    public boolean getDependsOnMVCIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcConfigDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:971)
    public boolean getDependsOnMVCHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcConfigDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:990)
    public MvcConfigIterableDMW getDependsOnMVCIterable(){
        DmcAttribute attr = mycore.get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(MvcConfigIterableDMW.emptyList);
        
        return(new MvcConfigIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dependsOnMVC value.
     * @param value A value compatible with MvcConfig
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1006)
    public DmcAttribute<?> addDependsOnMVC(MvcConfig value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDependsOnMVC(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a dependsOnMVC value.
     * @param value The MvcConfig to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1020)
    public void delDependsOnMVC(MvcConfig value) throws DmcValueException {
        mycore.delDependsOnMVC(value);
    }

    /**
     * Removes the dependsOnMVC attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1083)
    public void remDependsOnMVC(){
        mycore.remDependsOnMVC();
    }

    /**
     * @return The number of StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:947)
    public int getDependsOnSize(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:959)
    public boolean getDependsOnIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:971)
    public boolean getDependsOnHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1043)
    public StringIterableDMW getDependsOnIterable(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(mycore.getDependsOn()));
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1059)
    public void addDependsOn(Object value) throws DmcValueException {
        mycore.addDependsOn(value);
    }

    /**
     * Deletes a dependsOn value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1071)
    public void delDependsOn(Object value) throws DmcValueException {
        mycore.delDependsOn(value);
    }

    /**
     * Removes the dependsOn attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1083)
    public void remDependsOn(){
        mycore.remDependsOn();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:844)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:873)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:882)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:897)
    public void remName(){
        mycore.remName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:844)
    public String getGenPackage(){
        return(mycore.getGenPackage());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:873)
    public void setGenPackage(Object value) throws DmcValueException {
        mycore.setGenPackage(value);
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:882)
    public void setGenPackage(String value){
        mycore.setGenPackage(value);
    }

    /**
     * Removes the genPackage attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:897)
    public void remGenPackage(){
        mycore.remGenPackage();
    }


}
