package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import java.util.ArrayList;                                                        // To support getMVCopy()
import java.util.Iterator;                                                         // To support getMVCopy()
import org.dmd.dmc.*;                                                              // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                            // Primitive type
import org.dmd.dms.*;                                                              // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                              // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;                         // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                      // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.Place;                              // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.extended.WebApplication;                     // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO;                 // For multi-valued containsController
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                      // Attribute from mvw schema
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.WebApplicationDMO;             // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ControllerIterableDMW;         // For multi-valued Controller
import org.dmd.mvw.tools.mvwgenerator.generated.types.ControllerREF;               // To support getMVCopy() for REFs
import org.dmd.mvw.tools.mvwgenerator.generated.types.PlaceREF;                    // To support getMVCopy() for REFs

/**
 * The WebApplication definition allows for the definition of the
 * superstructure for an application, basically it's the definition of the
 * overall application controller.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class WebApplicationDMW extends MvwDefinition implements DmcNamedObjectIF {

    public WebApplicationDMW() {
        super(new WebApplicationDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._WebApplication);
    }

    public WebApplicationDMW(DmcTypeModifierMV mods) {
        super(new WebApplicationDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._WebApplication);
    }

    public WebApplication getModificationRecorder(){
        WebApplication rc = new WebApplication();
        rc.setAppName(getAppName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public WebApplicationDMW(WebApplicationDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._WebApplication);
    }

    public WebApplicationDMO getDMO() {
        return((WebApplicationDMO) core);
    }

    protected WebApplicationDMW(WebApplicationDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:961)
    public CamelCaseName getObjectName(){
        return(((WebApplicationDMO) core).getAppName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((WebApplicationDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof WebApplicationDMW){
            return( getObjectName().equals( ((WebApplicationDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of Controller items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1235)
    public int getUsesControllerSize(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__usesController);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ControllerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getUsesControllerIsEmpty(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__usesController);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ControllerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1260)
    public boolean getUsesControllerHasValue(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__usesController);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of ControllerDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1281)
    public ControllerIterableDMW getUsesControllerIterable(){
        DmcAttribute attr = ((WebApplicationDMO) core).get(MvwDMSAG.__usesController);
        if (attr == null)
            return(ControllerIterableDMW.emptyList);
        
        return(new ControllerIterableDMW(attr.getMV()));
    }

    /**
     * Adds another usesController value.
     * @param value A value compatible with Controller
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1297)
    public DmcAttribute<?> addUsesController(Controller value){
        DmcAttribute<?> attr = ((WebApplicationDMO) core).addUsesController(((ControllerDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a usesController value.
     * @param value The Controller to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1310)
    public void delUsesController(Controller value){
        ((WebApplicationDMO) core).delUsesController(value.getDMO());
    }

    /**
     * @return A COPY of the collection of Controller objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1345)
    public ArrayList<Controller> getUsesControllerCopy(){
        DmcAttribute<?> attr = ((WebApplicationDMO) core).get(MvwDMSAG.__usesController);
        if (attr == null)
            return(new ArrayList<Controller>());
        
        ArrayList<Controller> rc = new ArrayList<Controller>(attr.getMVSize());
        
        ControllerIterableDMW it = getUsesControllerIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the usesController attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1630)
    public void remUsesController(){
        ((WebApplicationDMO) core).remUsesController();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public CamelCaseName getAppName(){
        return(((WebApplicationDMO) core).getAppName());
    }

    /**
     * Sets appName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setAppName(Object value) throws DmcValueException {
        ((WebApplicationDMO) core).setAppName(value);
    }

    /**
     * Sets appName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setAppName(CamelCaseName value){
        ((WebApplicationDMO) core).setAppName(value);
    }

    /**
     * Removes the appName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remAppName(){
        ((WebApplicationDMO) core).remAppName();
    }

    /**
     * @return A Place object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1077)
    public Place getDefaultPlace(){
        PlaceREF ref = ((WebApplicationDMO) core).getDefaultPlace();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Place)ref.getObject().getContainer());
    }

    /**
     * Sets the defaultPlace to the specified value.
     * @param value A value compatible with PlaceREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1125)
    public void setDefaultPlace(Place value) {
        ((WebApplicationDMO) core).setDefaultPlace(value.getDMO());
    }

    /**
     * Removes the defaultPlace attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remDefaultPlace(){
        ((WebApplicationDMO) core).remDefaultPlace();
    }


}
