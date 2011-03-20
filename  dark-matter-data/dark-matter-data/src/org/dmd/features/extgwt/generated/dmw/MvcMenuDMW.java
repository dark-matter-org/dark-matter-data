package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:613)
import java.util.*;                                              // If not auxiliary
import org.dmd.dmc.*;                                            // Always 2
import org.dmd.dmc.types.StringName;                             // Primitive type
import org.dmd.dms.*;                                            // Always 3
import org.dmd.features.extgwt.extended.MvcController;           // Is reference type
import org.dmd.features.extgwt.extended.MvcDefinition;           // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;         // Abstract class

/**
 * The MvcMenu
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:291)
 */
abstract public class MvcMenuDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcMenuDMO mycore;

    protected MvcMenuDMW(MvcMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMenuDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcMenu>());
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:639)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuDMW){
            return( getObjectName().equals( ((MvcMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public Boolean getCustomRender(){
        return(mycore.getCustomRender());
    }

    /**
     * Sets customRender to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setCustomRender(Object value) throws DmcValueException {
        mycore.setCustomRender(value);
    }

    /**
     * Removes the customRender attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remCustomRender(){
        mycore.remCustomRender();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remName(){
        mycore.remName();
    }

    /**
     * @return A MvcController object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:714)
    public MvcController getAssociatedController(){
        DmcAttribute<?> attr = mycore.get(MvcMenuDMO.__associatedController);
        if (attr == null)
            return(null);
        
        MvcController ref = (MvcController) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:743)
    public void setAssociatedController(MvcController value) throws DmcValueException {
        mycore.setAssociatedController(value.getDmcObject());
        DmcAttribute<?> attr = mycore.get(MvcMenuDMO.__associatedController);
        attr.setAuxData(value);
    }

    /**
     * Removes the associatedController attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }


}