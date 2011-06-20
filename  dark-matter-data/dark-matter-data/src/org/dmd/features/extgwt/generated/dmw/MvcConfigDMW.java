package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:925)
import java.util.ArrayList;                                                // To support getMVCopy()
import java.util.Iterator;                                                 // To support getMVCopy()
import org.dmd.dmc.*;                                                      // If any attributes
import org.dmd.dmc.types.StringName;                                       // Primitive type
import org.dmd.dms.*;                                                      // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                        // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcConfig;                         // Is reference type aux
import org.dmd.features.extgwt.extended.MvcDefinition;                     // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;                 // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.dmw.MvcConfigIterableDMW;         // For multi-valued MvcConfig
import org.dmd.features.extgwt.generated.types.MvcConfigREF;               // To support getMVCopy() for REFs

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
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class MvcConfigDMW extends MvcDefinition implements DmcNamedObjectIF {

    public MvcConfigDMW() {
        super(new MvcConfigDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcConfig);
    }

    public MvcConfigDMW(DmcTypeModifierMV mods) {
        super(new MvcConfigDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcConfig);
    }

    public MvcConfig getModificationRecorder(){
        MvcConfig rc = new MvcConfig();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MvcConfigDMW(MvcConfigDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcConfig);
    }

    public MvcConfigDMO getDMO() {
        return((MvcConfigDMO) core);
    }

    protected MvcConfigDMW(MvcConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:953)
    public StringName getObjectName(){
        return(((MvcConfigDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcConfigDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcConfigDMW){
            return( getObjectName().equals( ((MvcConfigDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of MvcConfig items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1224)
    public int getDependsOnMVCSize(){
        DmcAttribute<?> attr = core.get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcConfigDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1236)
    public boolean getDependsOnMVCIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcConfigDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getDependsOnMVCHasValue(){
        DmcAttribute<?> attr = core.get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcConfigDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1268)
    public MvcConfigIterableDMW getDependsOnMVCIterable(){
        DmcAttribute attr = ((MvcConfigDMO) core).get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(MvcConfigIterableDMW.emptyList);
        
        return(new MvcConfigIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dependsOnMVC value.
     * @param value A value compatible with MvcConfig
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1284)
    public DmcAttribute<?> addDependsOnMVC(MvcConfig value){
        DmcAttribute<?> attr = ((MvcConfigDMO) core).addDependsOnMVC(((MvcConfigDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dependsOnMVC value.
     * @param value The MvcConfig to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1297)
    public void delDependsOnMVC(MvcConfig value){
        ((MvcConfigDMO) core).delDependsOnMVC(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcConfig objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1332)
    public ArrayList<MvcConfig> getDependsOnMVCCopy(){
        DmcAttribute<?> attr = ((MvcConfigDMO) core).get(MvcConfigDMO.__dependsOnMVC);
        if (attr == null)
            return(new ArrayList<MvcConfig>());
        
        ArrayList<MvcConfig> rc = new ArrayList<MvcConfig>(attr.getMVSize());
        
        MvcConfigIterableDMW it = getDependsOnMVCIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the dependsOnMVC attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1497)
    public void remDependsOnMVC(){
        ((MvcConfigDMO) core).remDependsOnMVC();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1224)
    public int getDependsOnSize(){
        DmcAttribute<?> attr = core.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1236)
    public boolean getDependsOnIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getDependsOnHasValue(){
        DmcAttribute<?> attr = core.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1360)
    public StringIterableDMW getDependsOnIterable(){
        DmcAttribute<?> attr = core.get(MvcConfigDMO.__dependsOn);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((MvcConfigDMO) core).getDependsOn()));
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1376)
    public void addDependsOn(Object value) throws DmcValueException {
        ((MvcConfigDMO) core).addDependsOn(value);
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1385)
    public void addDependsOn(String value){
        ((MvcConfigDMO) core).addDependsOn(value);
    }

    /**
     * Returns true if the collection contains the dependsOn value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1409)
    public boolean dependsOnContains(String value){
        return(((MvcConfigDMO) core).dependsOnContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1449)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDependsOnCopy(){
        DmcAttribute<?> attr = core.get(MvcConfigDMO.__dependsOn);
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
     * Deletes a dependsOn value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1476)
    public void delDependsOn(Object value) throws DmcValueException {
        ((MvcConfigDMO) core).delDependsOn(value);
    }

    /**
     * Deletes a dependsOn value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1485)
    public void delDependsOn(String value){
        ((MvcConfigDMO) core).delDependsOn(value);
    }

    /**
     * Removes the dependsOn attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1497)
    public void remDependsOn(){
        ((MvcConfigDMO) core).remDependsOn();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public StringName getName(){
        return(((MvcConfigDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setName(Object value) throws DmcValueException {
        ((MvcConfigDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setName(StringName value){
        ((MvcConfigDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remName(){
        ((MvcConfigDMO) core).remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public String getGenPackage(){
        return(((MvcConfigDMO) core).getGenPackage());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setGenPackage(Object value) throws DmcValueException {
        ((MvcConfigDMO) core).setGenPackage(value);
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setGenPackage(String value){
        ((MvcConfigDMO) core).setGenPackage(value);
    }

    /**
     * Removes the genPackage attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remGenPackage(){
        ((MvcConfigDMO) core).remGenPackage();
    }


}
