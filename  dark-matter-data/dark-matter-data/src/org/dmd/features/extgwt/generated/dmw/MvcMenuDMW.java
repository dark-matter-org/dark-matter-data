package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcController;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;
// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;

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

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuDMW){
            return( getObjectName().equals( ((MvcMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public Boolean getCustomRender(){
        return(mycore.getCustomRender());
    }

    /**
     * Sets customRender to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setCustomRender(Object value) throws DmcValueException {
        mycore.setCustomRender(value);
    }

    /**
     * Removes the customRender attribute value.
     */
    public void remCustomRender(){
        mycore.remCustomRender();
    }

    public String getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
        mycore.remName();
    }

    /**
     * @return A MvcController object.
     */
    @SuppressWarnings("unchecked")
    public MvcController getAssociatedController(){
        DmcAttribute attr = mycore.get(MvcMenuDMO._associatedController);
        if (attr == null)
            return(null);
        
        MvcController ref = (MvcController) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    @SuppressWarnings("unchecked")
    public void setAssociatedController(MvcController value) throws DmcValueException {
        mycore.setAssociatedController(value.getDmcObject());
        DmcAttribute attr = mycore.get(MvcMenuDMO._associatedController);
        attr.setAuxData(value);
    }

    /**
     * Removes the associatedController attribute value.
     */
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }


}
