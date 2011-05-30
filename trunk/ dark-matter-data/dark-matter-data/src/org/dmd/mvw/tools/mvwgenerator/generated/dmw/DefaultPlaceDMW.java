package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import org.dmd.dmc.*;                                                        // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                      // Primitive type
import org.dmd.dms.*;                                                        // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.Activity;                     // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.extended.DefaultPlace;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                // Derived class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.DefaultPlaceDMO;         // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActivityREF;           // To support getMVCopy() for REFs

/**
 * null
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class DefaultPlaceDMW extends MvwDefinition implements DmcNamedObjectIF {

    public DefaultPlaceDMW() {
        super(new DefaultPlaceDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._DefaultPlace);
    }

    public DefaultPlaceDMW(DmcTypeModifierMV mods) {
        super(new DefaultPlaceDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._DefaultPlace);
    }

    public DefaultPlace getModificationRecorder(){
        DefaultPlace rc = new DefaultPlace();
        rc.setPlaceName(getPlaceName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public DefaultPlaceDMW(DefaultPlaceDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._DefaultPlace);
    }

    public DefaultPlaceDMO getDMO() {
        return((DefaultPlaceDMO) core);
    }

    protected DefaultPlaceDMW(DefaultPlaceDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public CamelCaseName getObjectName(){
        return(((DefaultPlaceDMO) core).getPlaceName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((DefaultPlaceDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof DefaultPlaceDMW){
            return( getObjectName().equals( ((DefaultPlaceDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getPlacePrefix(){
        return(((DefaultPlaceDMO) core).getPlacePrefix());
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setPlacePrefix(Object value) throws DmcValueException {
        ((DefaultPlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setPlacePrefix(String value){
        ((DefaultPlaceDMO) core).setPlacePrefix(value);
    }

    /**
     * Removes the placePrefix attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remPlacePrefix(){
        ((DefaultPlaceDMO) core).remPlacePrefix();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public CamelCaseName getPlaceName(){
        return(((DefaultPlaceDMO) core).getPlaceName());
    }

    /**
     * Sets placeName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setPlaceName(Object value) throws DmcValueException {
        ((DefaultPlaceDMO) core).setPlaceName(value);
    }

    /**
     * Sets placeName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setPlaceName(CamelCaseName value){
        ((DefaultPlaceDMO) core).setPlaceName(value);
    }

    /**
     * Removes the placeName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remPlaceName(){
        ((DefaultPlaceDMO) core).remPlaceName();
    }

    /**
     * @return A Activity object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1030)
    public Activity getRunsActivity(){
        ActivityREF ref = ((DefaultPlaceDMO) core).getRunsActivity();
        if (ref == null)
            return(null);
        
        return((Activity)ref.getObject().getContainer());
    }

    /**
     * Sets the runsActivity to the specified value.
     * @param value A value compatible with ActivityREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1075)
    public void setRunsActivity(Activity value) {
        ((DefaultPlaceDMO) core).setRunsActivity(value.getDMO());
    }

    /**
     * Removes the runsActivity attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remRunsActivity(){
        ((DefaultPlaceDMO) core).remRunsActivity();
    }


}
