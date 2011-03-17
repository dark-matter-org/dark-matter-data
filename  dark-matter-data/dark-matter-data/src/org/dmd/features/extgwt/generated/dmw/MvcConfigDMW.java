package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:613)
import java.util.*;                                                // If not auxiliary
import org.dmd.dmc.*;                                              // Always 2
import org.dmd.dmc.types.StringName;                               // Primitive type
import org.dmd.dms.*;                                              // Always 3
import org.dmd.features.extgwt.extended.MvcConfig;                 // Is reference type
import org.dmd.features.extgwt.extended.MvcDefinition;             // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;         // Class not auxiliary or abstract

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
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:291)
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

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcConfig>());
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:639)
    public StringName getObjectName(){
        return(mycore.getName());
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:817)
    public int getDependsOnMVCSize(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcConfigDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:829)
    public boolean getDependsOnMVCIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcConfigDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:841)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:879)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:897)
    public DmcAttribute<?> addDependsOnMVC(MvcConfig value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDependsOnMVC(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a dependsOnMVC value.
     * @param value The MvcConfig to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:918)
    public void delDependsOnMVC(MvcConfig value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.delDependsOnMVC(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcConfig> refs = (ArrayList<MvcConfig>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the dependsOnMVC attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:974)
    public void remDependsOnMVC(){
        mycore.remDependsOnMVC();
    }

    /**
     * @return The number of StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:817)
    public int getDependsOnSize(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:829)
    public boolean getDependsOnIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:841)
    public boolean getDependsOnHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:938)
    public Iterator<String> getDependsOn(){
        return(mycore.getDependsOn());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:950)
    public void addDependsOn(Object value) throws DmcValueException {
        mycore.addDependsOn(value);
    }

    /**
     * Deletes a dependsOn value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:962)
    public void delDependsOn(Object value) throws DmcValueException {
        mycore.delDependsOn(value);
    }

    /**
     * Removes the dependsOn attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:974)
    public void remDependsOn(){
        mycore.remDependsOn();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remName(){
        mycore.remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public String getGenPackage(){
        return(mycore.getGenPackage());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setGenPackage(Object value) throws DmcValueException {
        mycore.setGenPackage(value);
    }

    /**
     * Removes the genPackage attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remGenPackage(){
        mycore.remGenPackage();
    }


}
