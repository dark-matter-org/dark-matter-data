package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:936)
import org.dmd.dmc.*;                                                    // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                  // Primitive type
import org.dmd.dms.*;                                                    // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.Place;                    // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.SubPlace;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;            // Attribute from mvw schema
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.SubPlaceDMO;         // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.types.PlaceREF;          // To support getMVCopy() for REFs

/**
 * null
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:349)
 */
abstract public class SubPlaceDMW extends Place implements DmcNamedObjectIF {

    public SubPlaceDMW() {
        super(new SubPlaceDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubPlace);
    }

    public SubPlaceDMW(DmcTypeModifierMV mods) {
        super(new SubPlaceDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubPlace);
    }

    public SubPlace getModificationRecorder(){
        SubPlace rc = new SubPlace();
        rc.setPlaceName(getPlaceName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public SubPlaceDMW(SubPlaceDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubPlace);
    }

    public SubPlaceDMO getDMO() {
        return((SubPlaceDMO) core);
    }

    protected SubPlaceDMW(SubPlaceDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:964)
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

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public CamelCaseName getPlaceName(){
        return(((SubPlaceDMO) core).getPlaceName());
    }

    /**
     * Sets placeName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setPlaceName(Object value) throws DmcValueException {
        ((SubPlaceDMO) core).setPlaceName(value);
    }

    /**
     * Sets placeName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setPlaceName(CamelCaseName value){
        ((SubPlaceDMO) core).setPlaceName(value);
    }

    /**
     * Removes the placeName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remPlaceName(){
        ((SubPlaceDMO) core).remPlaceName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public String getPlacePrefix(){
        return(((SubPlaceDMO) core).getPlacePrefix());
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setPlacePrefix(Object value) throws DmcValueException {
        ((SubPlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setPlacePrefix(String value){
        ((SubPlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Removes the placePrefix attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remPlacePrefix(){
        ((SubPlaceDMO) core).remPlacePrefix();
    }

    /**
     * @return A Place object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1080)
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
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1128)
    public void setParentPlace(Place value) {
        ((SubPlaceDMO) core).setParentPlace(value.getDMO());
    }

    /**
     * Removes the parentPlace attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remParentPlace(){
        ((SubPlaceDMO) core).remParentPlace();
    }


}
