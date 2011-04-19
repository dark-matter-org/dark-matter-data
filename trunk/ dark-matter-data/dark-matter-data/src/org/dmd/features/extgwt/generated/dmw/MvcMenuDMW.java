package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmc.*;                                                    // If any attributes
import org.dmd.dmc.types.StringName;                                     // Primitive type
import org.dmd.dms.*;                                                    // Always 2
import org.dmd.features.extgwt.extended.MvcController;                   // Is reference type aux
import org.dmd.features.extgwt.extended.MvcDefinition;                   // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;                 // Abstract class
import org.dmd.features.extgwt.generated.types.MvcControllerREF;         // To support getMVCopy() for REFs

/**
 * The MvcMenu
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcMenuDMW extends MvcDefinition implements DmcNamedObjectIF {

    protected MvcMenuDMW() {
        super();
    }

    public MvcMenuDMO getDMO() {
        return((MvcMenuDMO) core);
    }

    protected MvcMenuDMW(MvcMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:875)
    public StringName getObjectName(){
        return(((MvcMenuDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcMenuDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuDMW){
            return( getObjectName().equals( ((MvcMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public Boolean isCustomRender(){
        return(((MvcMenuDMO) core).isCustomRender());
    }

    /**
     * Sets customRender to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setCustomRender(Object value) throws DmcValueException {
        ((MvcMenuDMO) core).setCustomRender(value);
    }

    /**
     * Sets customRender to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setCustomRender(Boolean value){
        ((MvcMenuDMO) core).setCustomRender(value);
    }

    /**
     * Removes the customRender attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remCustomRender(){
        ((MvcMenuDMO) core).remCustomRender();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public StringName getName(){
        return(((MvcMenuDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setName(Object value) throws DmcValueException {
        ((MvcMenuDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setName(StringName value){
        ((MvcMenuDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remName(){
        ((MvcMenuDMO) core).remName();
    }

    /**
     * @return A MvcController object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:991)
    public MvcController getAssociatedController(){
        MvcControllerREF ref = ((MvcMenuDMO) core).getAssociatedController();
        if (ref == null)
            return(null);
        
        return((MvcController)ref.getObject().getContainer());
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setAssociatedController(MvcController value) {
        ((MvcMenuDMO) core).setAssociatedController(value.getDMO());
    }

    /**
     * Removes the associatedController attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remAssociatedController(){
        ((MvcMenuDMO) core).remAssociatedController();
    }


}
