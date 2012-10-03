package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.CamelCaseName;                                    // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.*;                                                      // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.mvw.tools.mvwgenerator.extended.Activity;                   // Is reference type - (BaseDMWGeneratorNewest.java:923)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;              // Derived class - (BaseDMWGeneratorNewest.java:1064)
import org.dmd.mvw.tools.mvwgenerator.extended.Place;                      // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:896)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PlaceDMO;              // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActivityREF;         // Is reference type REF - (BaseDMWGeneratorNewest.java:931)


/**
 * null
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class PlaceDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public PlaceDMW() {
        super(new PlaceDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Place);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public PlaceDMW(DmcTypeModifierMV mods) {
        super(new PlaceDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Place);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public Place getModificationRecorder(){
        Place rc = new Place();
        rc.setPlaceName(getPlaceName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public PlaceDMW(PlaceDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Place);
    }

    public Place cloneIt() {
        Place rc = new Place();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PlaceDMO getDMO() {
        return((PlaceDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected PlaceDMW(PlaceDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1113)
    public CamelCaseName getObjectName(){
        return(((PlaceDMO) core).getPlaceName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((PlaceDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof PlaceDMW){
            return( getObjectName().equals( ((PlaceDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public CamelCaseName getPlaceName(){
        return(((PlaceDMO) core).getPlaceName());
    }

    /**
     * Sets placeName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setPlaceName(Object value) throws DmcValueException {
        ((PlaceDMO) core).setPlaceName(value);
    }

    /**
     * Sets placeName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setPlaceName(CamelCaseName value){
        ((PlaceDMO) core).setPlaceName(value);
    }

    /**
     * Removes the placeName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remPlaceName(){
        ((PlaceDMO) core).remPlaceName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getPlacePrefix(){
        return(((PlaceDMO) core).getPlacePrefix());
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setPlacePrefix(Object value) throws DmcValueException {
        ((PlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setPlacePrefix(String value){
        ((PlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Removes the placePrefix attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remPlacePrefix(){
        ((PlaceDMO) core).remPlacePrefix();
    }

    /**
     * @return A Activity object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1246)
    public Activity getRunsActivity(){
        ActivityREF ref = ((PlaceDMO) core).getRunsActivity();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Activity)ref.getObject().getContainer());
    }

    /**
     * Sets the runsActivity to the specified value.
     * @param value A value compatible with ActivityREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1331)
    public void setRunsActivity(Activity value) {
        ((PlaceDMO) core).setRunsActivity(value.getDMO());
    }

    /**
     * Sets the runsActivity to the specified value.
     * @param value A value compatible with ActivityREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1340)
    public void setRunsActivity(Object value) throws DmcValueException {
        ((PlaceDMO) core).setRunsActivity(value);
    }

    /**
     * Removes the runsActivity attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remRunsActivity(){
        ((PlaceDMO) core).remRunsActivity();
    }


}