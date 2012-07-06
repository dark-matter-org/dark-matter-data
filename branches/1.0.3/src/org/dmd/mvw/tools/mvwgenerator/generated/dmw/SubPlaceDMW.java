package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.CamelCaseName;                                  // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.*;                                                    // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.mvw.tools.mvwgenerator.extended.Place;                    // Is reference type - (BaseDMWGeneratorNewest.java:923)
import org.dmd.mvw.tools.mvwgenerator.extended.SubPlace;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:896)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.SubPlaceDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.mvw.tools.mvwgenerator.generated.types.PlaceREF;          // Is reference type REF - (BaseDMWGeneratorNewest.java:931)


/**
 * null
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class SubPlaceDMW extends Place implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public SubPlaceDMW() {
        super(new SubPlaceDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubPlace);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public SubPlaceDMW(DmcTypeModifierMV mods) {
        super(new SubPlaceDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubPlace);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public SubPlace getModificationRecorder(){
        SubPlace rc = new SubPlace();
        rc.setPlaceName(getPlaceName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public SubPlaceDMW(SubPlaceDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubPlace);
    }

    public SubPlace cloneIt() {
        SubPlace rc = new SubPlace();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public SubPlaceDMO getDMO() {
        return((SubPlaceDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected SubPlaceDMW(SubPlaceDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1113)
    public CamelCaseName getObjectName(){
        return(((SubPlaceDMO) core).getPlaceName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((SubPlaceDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof SubPlaceDMW){
            return( getObjectName().equals( ((SubPlaceDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A Place object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1246)
    public Place getParentPlace(){
        PlaceREF ref = ((SubPlaceDMO) core).getParentPlace();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Place)ref.getObject().getContainer());
    }

    /**
     * Sets the parentPlace to the specified value.
     * @param value A value compatible with PlaceREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1331)
    public void setParentPlace(Place value) {
        ((SubPlaceDMO) core).setParentPlace(value.getDMO());
    }

    /**
     * Sets the parentPlace to the specified value.
     * @param value A value compatible with PlaceREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1340)
    public void setParentPlace(Object value) throws DmcValueException {
        ((SubPlaceDMO) core).setParentPlace(value);
    }

    /**
     * Removes the parentPlace attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remParentPlace(){
        ((SubPlaceDMO) core).remParentPlace();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public CamelCaseName getPlaceName(){
        return(((SubPlaceDMO) core).getPlaceName());
    }

    /**
     * Sets placeName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setPlaceName(Object value) throws DmcValueException {
        ((SubPlaceDMO) core).setPlaceName(value);
    }

    /**
     * Sets placeName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setPlaceName(CamelCaseName value){
        ((SubPlaceDMO) core).setPlaceName(value);
    }

    /**
     * Removes the placeName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remPlaceName(){
        ((SubPlaceDMO) core).remPlaceName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getPlacePrefix(){
        return(((SubPlaceDMO) core).getPlacePrefix());
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setPlacePrefix(Object value) throws DmcValueException {
        ((SubPlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setPlacePrefix(String value){
        ((SubPlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Removes the placePrefix attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remPlacePrefix(){
        ((SubPlaceDMO) core).remPlacePrefix();
    }


}