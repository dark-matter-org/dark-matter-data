package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:925)
import org.dmd.dmc.*;                                                      // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                    // Primitive type
import org.dmd.dms.*;                                                      // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.Component;                  // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO;         // Class not auxiliary or abstract

/**
 * The Controller represents a behavioural component that lives throughout
 * the entire lifecycle of an WebApplication or WebSite. Generally, it
 * manages the Presenters and Views that are displayed, but may also provide
 * behind the scenes management of things like communications, security, menu
 * structure etc. Controllers do not implement Presenter interfaces i.e. they
 * do not interact directly with Views; that is the role of Presenters.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class ControllerDMW extends Component implements DmcNamedObjectIF {

    public ControllerDMW() {
        super(new ControllerDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Controller);
    }

    public ControllerDMW(DmcTypeModifierMV mods) {
        super(new ControllerDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Controller);
    }

    public Controller getModificationRecorder(){
        Controller rc = new Controller();
        rc.setControllerName(getControllerName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public ControllerDMW(ControllerDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Controller);
    }

    public ControllerDMO getDMO() {
        return((ControllerDMO) core);
    }

    protected ControllerDMW(ControllerDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:953)
    public CamelCaseName getObjectName(){
        return(((ControllerDMO) core).getControllerName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ControllerDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ControllerDMW){
            return( getObjectName().equals( ((ControllerDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public Boolean isCentralDMPErrorHandler(){
        return(((ControllerDMO) core).isCentralDMPErrorHandler());
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setCentralDMPErrorHandler(Object value) throws DmcValueException {
        ((ControllerDMO) core).setCentralDMPErrorHandler(value);
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setCentralDMPErrorHandler(Boolean value){
        ((ControllerDMO) core).setCentralDMPErrorHandler(value);
    }

    /**
     * Removes the centralDMPErrorHandler attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remCentralDMPErrorHandler(){
        ((ControllerDMO) core).remCentralDMPErrorHandler();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public Boolean isCentralRPCErrorHandler(){
        return(((ControllerDMO) core).isCentralRPCErrorHandler());
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setCentralRPCErrorHandler(Object value) throws DmcValueException {
        ((ControllerDMO) core).setCentralRPCErrorHandler(value);
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setCentralRPCErrorHandler(Boolean value){
        ((ControllerDMO) core).setCentralRPCErrorHandler(value);
    }

    /**
     * Removes the centralRPCErrorHandler attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remCentralRPCErrorHandler(){
        ((ControllerDMO) core).remCentralRPCErrorHandler();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public CamelCaseName getControllerName(){
        return(((ControllerDMO) core).getControllerName());
    }

    /**
     * Sets controllerName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setControllerName(Object value) throws DmcValueException {
        ((ControllerDMO) core).setControllerName(value);
    }

    /**
     * Sets controllerName to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setControllerName(CamelCaseName value){
        ((ControllerDMO) core).setControllerName(value);
    }

    /**
     * Removes the controllerName attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remControllerName(){
        ((ControllerDMO) core).remControllerName();
    }


}
