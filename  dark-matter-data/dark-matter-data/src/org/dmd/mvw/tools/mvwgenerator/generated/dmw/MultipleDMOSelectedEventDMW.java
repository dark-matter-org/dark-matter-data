package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import org.dmd.dmc.*;                                                                    // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                                  // Primitive type
import org.dmd.dms.*;                                                                    // Always 2
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;                                     // Is reference type aux
import org.dmd.dms.generated.types.ClassDefinitionREF;                                   // To support getMVCopy() for REFs
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                    // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.BroadcastEvent;                           // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.MultipleDMOSelectedEvent;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MultipleDMOSelectedEventDMO;         // Class not auxiliary or abstract

/**
 * The MultipleDMOSelectedEvent is a BroadcastEvent that indicates that
 * multiple DMOs have been selected. As with the single select event, a
 * generic DMO event that is handled by the MvwSelectionManager is fired as
 * well.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MultipleDMOSelectedEventDMW extends BroadcastEvent implements DmcNamedObjectIF {

    public MultipleDMOSelectedEventDMW() {
        super(new MultipleDMOSelectedEventDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MultipleDMOSelectedEvent);
    }

    public MultipleDMOSelectedEventDMW(DmcTypeModifierMV mods) {
        super(new MultipleDMOSelectedEventDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MultipleDMOSelectedEvent);
    }

    public MultipleDMOSelectedEvent getModificationRecorder(){
        MultipleDMOSelectedEvent rc = new MultipleDMOSelectedEvent();
        rc.setEventName(getEventName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MultipleDMOSelectedEventDMW(MultipleDMOSelectedEventDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MultipleDMOSelectedEvent);
    }

    public MultipleDMOSelectedEventDMO getDMO() {
        return((MultipleDMOSelectedEventDMO) core);
    }

    protected MultipleDMOSelectedEventDMW(MultipleDMOSelectedEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public CamelCaseName getObjectName(){
        return(((MultipleDMOSelectedEventDMO) core).getEventName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MultipleDMOSelectedEventDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MultipleDMOSelectedEventDMW){
            return( getObjectName().equals( ((MultipleDMOSelectedEventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public CamelCaseName getEventName(){
        return(((MultipleDMOSelectedEventDMO) core).getEventName());
    }

    /**
     * Sets eventName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setEventName(Object value) throws DmcValueException {
        ((MultipleDMOSelectedEventDMO) core).setEventName(value);
    }

    /**
     * Sets eventName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setEventName(CamelCaseName value){
        ((MultipleDMOSelectedEventDMO) core).setEventName(value);
    }

    /**
     * Removes the eventName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remEventName(){
        ((MultipleDMOSelectedEventDMO) core).remEventName();
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1030)
    public ClassDefinitionDMW getSelectedDMO(){
        ClassDefinitionREF ref = ((MultipleDMOSelectedEventDMO) core).getSelectedDMO();
        if (ref == null)
            return(null);
        
        return((ClassDefinitionDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the selectedDMO to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1075)
    public void setSelectedDMO(ClassDefinitionDMW value) {
        ((MultipleDMOSelectedEventDMO) core).setSelectedDMO(value.getDMO());
    }

    /**
     * Removes the selectedDMO attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSelectedDMO(){
        ((MultipleDMOSelectedEventDMO) core).remSelectedDMO();
    }


}
