package org.dmd.mvw.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import java.util.ArrayList;                                    // To support getMVCopy()
import java.util.Iterator;                                     // To support getMVCopy()
import org.dmd.dmc.*;                                          // If any attributes
import org.dmd.dmc.types.CamelCaseName;                        // Primitive type
import org.dmd.dms.*;                                          // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor
import org.dmd.mvw.extended.MvwConfig;                         // Is reference type aux
import org.dmd.mvw.extended.MvwDefinition;                     // Derived class
import org.dmd.mvw.generated.dmo.MvwConfigDMO;                 // Class not auxiliary or abstract
import org.dmd.mvw.generated.dmw.MvwConfigIterableDMW;         // For multi-valued MvwConfig
import org.dmd.mvw.generated.types.MvwConfigREF;               // To support getMVCopy() for REFs

/**
 * The MvwConfig class is stored in a file with a .mvw suffix and contains
 * various Model View Whatever (MVW) definitions. The name of the MvwConfig
 * can be referred to via the dependsOnMvw attribute so that MVW definitions
 * defined elsewhere can be used.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvwConfigDMW extends MvwDefinition implements DmcNamedObjectIF {

    public MvwConfigDMW() {
        super(new MvwConfigDMO(), org.dmd.mvw.generated.MvwSchemaAG._MvwConfig);
    }

    public MvwConfigDMW(DmcTypeModifierMV mods) {
        super(new MvwConfigDMO(mods), org.dmd.mvw.generated.MvwSchemaAG._MvwConfig);
    }

    public MvwConfig getModificationRecorder(){
        MvwConfig rc = new MvwConfig();
        rc.setCamelCaseName(getCamelCaseName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MvwConfigDMW(MvwConfigDMO obj) {
        super(obj, org.dmd.mvw.generated.MvwSchemaAG._MvwConfig);
    }

    public MvwConfigDMO getDMO() {
        return((MvwConfigDMO) core);
    }

    protected MvwConfigDMW(MvwConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public CamelCaseName getObjectName(){
        return(((MvwConfigDMO) core).getCamelCaseName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvwConfigDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvwConfigDMW){
            return( getObjectName().equals( ((MvwConfigDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of MvwConfig items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getDependsOnMvwSize(){
        DmcAttribute<?> attr = core.get(MvwConfigDMO.__dependsOnMvw);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvwConfigDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getDependsOnMvwIsEmpty(){
        DmcAttribute<?> attr = core.get(MvwConfigDMO.__dependsOnMvw);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvwConfigDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getDependsOnMvwHasValue(){
        DmcAttribute<?> attr = core.get(MvwConfigDMO.__dependsOnMvw);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvwConfigDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvwConfigIterableDMW getDependsOnMvwIterable(){
        DmcAttribute attr = ((MvwConfigDMO) core).get(MvwConfigDMO.__dependsOnMvw);
        if (attr == null)
            return(MvwConfigIterableDMW.emptyList);
        
        return(new MvwConfigIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dependsOnMvw value.
     * @param value A value compatible with MvwConfig
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addDependsOnMvw(MvwConfig value){
        DmcAttribute<?> attr = ((MvwConfigDMO) core).addDependsOnMvw(((MvwConfigDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dependsOnMvw value.
     * @param value The MvwConfig to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delDependsOnMvw(MvwConfig value){
        ((MvwConfigDMO) core).delDependsOnMvw(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvwConfig objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvwConfig> getDependsOnMvwCopy(){
        DmcAttribute<?> attr = ((MvwConfigDMO) core).get(MvwConfigDMO.__dependsOnMvw);
        if (attr == null)
            return(new ArrayList<MvwConfig>());
        
        ArrayList<MvwConfig> rc = new ArrayList<MvwConfig>(attr.getMVSize());
        
        MvwConfigIterableDMW it = getDependsOnMvwIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the dependsOnMvw attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remDependsOnMvw(){
        ((MvwConfigDMO) core).remDependsOnMvw();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public CamelCaseName getCamelCaseName(){
        return(((MvwConfigDMO) core).getCamelCaseName());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setCamelCaseName(Object value) throws DmcValueException {
        ((MvwConfigDMO) core).setCamelCaseName(value);
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setCamelCaseName(CamelCaseName value){
        ((MvwConfigDMO) core).setCamelCaseName(value);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remCamelCaseName(){
        ((MvwConfigDMO) core).remCamelCaseName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getGenPackage(){
        return(((MvwConfigDMO) core).getGenPackage());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setGenPackage(Object value) throws DmcValueException {
        ((MvwConfigDMO) core).setGenPackage(value);
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setGenPackage(String value){
        ((MvwConfigDMO) core).setGenPackage(value);
    }

    /**
     * Removes the genPackage attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remGenPackage(){
        ((MvwConfigDMO) core).remGenPackage();
    }


}
