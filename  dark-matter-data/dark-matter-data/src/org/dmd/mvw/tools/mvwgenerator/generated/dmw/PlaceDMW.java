package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:950)
import org.dmd.dmc.*;                                                      // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                    // Primitive type
import org.dmd.dms.*;                                                      // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.Activity;                   // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;              // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.Place;                      // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PlaceDMO;              // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActivityREF;         // To support getMVCopy() for REFs

/**
 * null
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:364)
 */
abstract public class PlaceDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:441)
    public PlaceDMW() {
        super(new PlaceDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Place);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:447)
    public PlaceDMW(DmcTypeModifierMV mods) {
        super(new PlaceDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Place);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:489)
    public Place getModificationRecorder(){
        Place rc = new Place();
        rc.setPlaceName(getPlaceName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:510)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:527)
    protected PlaceDMW(PlaceDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:977)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1133)
    public CamelCaseName getPlaceName(){
        return(((PlaceDMO) core).getPlaceName());
    }

    /**
     * Sets placeName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1204)
    public void setPlaceName(Object value) throws DmcValueException {
        ((PlaceDMO) core).setPlaceName(value);
    }

    /**
     * Sets placeName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1213)
    public void setPlaceName(CamelCaseName value){
        ((PlaceDMO) core).setPlaceName(value);
    }

    /**
     * Removes the placeName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void remPlaceName(){
        ((PlaceDMO) core).remPlaceName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1133)
    public String getPlacePrefix(){
        return(((PlaceDMO) core).getPlacePrefix());
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1204)
    public void setPlacePrefix(Object value) throws DmcValueException {
        ((PlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1213)
    public void setPlacePrefix(String value){
        ((PlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Removes the placePrefix attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void remPlacePrefix(){
        ((PlaceDMO) core).remPlacePrefix();
    }

    /**
     * @return A Activity object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1105)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1169)
    public void setRunsActivity(Activity value) {
        ((PlaceDMO) core).setRunsActivity(value.getDMO());
    }

    /**
     * Removes the runsActivity attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void remRunsActivity(){
        ((PlaceDMO) core).remRunsActivity();
    }


}
