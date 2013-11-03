package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.ArrayList;                                                                // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1048)
import org.dmd.dmc.*;                                                                      // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dmc.types.CamelCaseName;                                                    // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.*;                                                                      // Always 2 - (BaseDMWGeneratorNewest.java:939)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                      // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;                                 // Is reference type - (BaseDMWGeneratorNewest.java:974)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                              // Derived class - (BaseDMWGeneratorNewest.java:1115)
import org.dmd.mvw.tools.mvwgenerator.extended.Place;                                      // Is reference type - (BaseDMWGeneratorNewest.java:974)
import org.dmd.mvw.tools.mvwgenerator.extended.WebApplication;                             // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:947)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuImplementationConfig;             // Is reference type - (BaseDMWGeneratorNewest.java:974)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO;                         // For multi-valued adds of Controller - (BaseDMWGeneratorNewest.java:1630)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                              // Attribute usesController from the mvw schema - (BaseDMWGeneratorNewest.java:771)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.WebApplicationDMO;                     // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ControllerIterableDMW;                 // For multi-valued Controller - (BaseDMWGeneratorNewest.java:1572)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuImplementationConfigREF;         // Is reference type REF - (BaseDMWGeneratorNewest.java:982)
import org.dmd.mvw.tools.mvwgenerator.generated.types.PlaceREF;                            // Is reference type REF - (BaseDMWGeneratorNewest.java:982)


/**
 * The WebApplication definition allows for the definition of the
 * superstructure for an application, basically it's the definition of the
 * overall application controller.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class WebApplicationDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public WebApplicationDMW() {
        super(new WebApplicationDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._WebApplication);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public WebApplicationDMW(DmcTypeModifierMV mods) {
        super(new WebApplicationDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._WebApplication);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:495)
    public WebApplication getModificationRecorder(){
        WebApplication rc = new WebApplication();
        rc.setAppName(getAppName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public WebApplicationDMW(WebApplicationDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._WebApplication);
    }

    public WebApplication cloneIt() {
        WebApplication rc = new WebApplication();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public WebApplicationDMO getDMO() {
        return((WebApplicationDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected WebApplicationDMW(WebApplicationDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1164)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public CamelCaseName getAppName(){
        return(((WebApplicationDMO) core).getAppName());
    }

    /**
     * Sets appName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setAppName(Object value) throws DmcValueException {
        ((WebApplicationDMO) core).setAppName(value);
    }

    /**
     * Sets appName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setAppName(CamelCaseName value){
        ((WebApplicationDMO) core).setAppName(value);
    }

    /**
     * Removes the appName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remAppName(){
        ((WebApplicationDMO) core).remAppName();
    }

    /**
     * @return A Place object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1297)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1382)
    public void setDefaultPlace(Place value) {
        ((WebApplicationDMO) core).setDefaultPlace(value.getDMO());
    }

    /**
     * Sets the defaultPlace to the specified value.
     * @param value A value compatible with PlaceREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1391)
    public void setDefaultPlace(Object value) throws DmcValueException {
        ((WebApplicationDMO) core).setDefaultPlace(value);
    }

    /**
     * Removes the defaultPlace attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remDefaultPlace(){
        ((WebApplicationDMO) core).remDefaultPlace();
    }

    /**
     * @return A MenuImplementationConfig object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1297)
    public MenuImplementationConfig getMenuImplementation(){
        MenuImplementationConfigREF ref = ((WebApplicationDMO) core).getMenuImplementation();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((MenuImplementationConfig)ref.getObject().getContainer());
    }

    /**
     * Sets the menuImplementation to the specified value.
     * @param value A value compatible with MenuImplementationConfigREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1382)
    public void setMenuImplementation(MenuImplementationConfig value) {
        ((WebApplicationDMO) core).setMenuImplementation(value.getDMO());
    }

    /**
     * Sets the menuImplementation to the specified value.
     * @param value A value compatible with MenuImplementationConfigREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1391)
    public void setMenuImplementation(Object value) throws DmcValueException {
        ((WebApplicationDMO) core).setMenuImplementation(value);
    }

    /**
     * Removes the menuImplementation attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remMenuImplementation(){
        ((WebApplicationDMO) core).remMenuImplementation();
    }

    /**
     * @return The number of Controller items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getUsesControllerSize(){
        return(((WebApplicationDMO) core).getUsesControllerSize());
    }

    /**
     * @return true if there are no ControllerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getUsesControllerIsEmpty(){
        if (((WebApplicationDMO) core).getUsesControllerSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ControllerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getUsesControllerHasValue(){
        if (((WebApplicationDMO) core).getUsesControllerSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ControllerDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1579)
    public ControllerIterableDMW getUsesControllerIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__usesController);
        if (attr == null)
            return(ControllerIterableDMW.emptyList);
        
        return(new ControllerIterableDMW(((WebApplicationDMO) core).getUsesController()));
    }

    /**
     * Adds another usesController value.
     * @param value A value compatible with Controller
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1636)
    public DmcAttribute<?> addUsesController(Controller value){
        DmcAttribute<?> attr = ((WebApplicationDMO) core).addUsesController(((ControllerDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a usesController value.
     * @param value The Controller to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1686)
    public void delUsesController(Controller value){
        ((WebApplicationDMO) core).delUsesController(value.getDMO());
    }

    /**
     * @return A COPY of the collection of Controller objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1748)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remUsesController(){
        ((WebApplicationDMO) core).remUsesController();
    }


}