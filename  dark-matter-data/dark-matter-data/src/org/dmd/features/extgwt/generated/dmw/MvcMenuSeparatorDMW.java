package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcController;
// import 1
import org.dmd.features.extgwt.extended.MvcMenu;

// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcMenuSeparatorDMO;

abstract public class MvcMenuSeparatorDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcMenuSeparatorDMO mycore;

    public MvcMenuSeparatorDMW() {
        super(new MvcMenuSeparatorDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuSeparator);
        mycore = (MvcMenuSeparatorDMO) core;
        mycore.setContainer(this);
    }

    public MvcMenuSeparatorDMW(MvcMenuSeparatorDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuSeparator);
        mycore = (MvcMenuSeparatorDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcMenuSeparatorDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcMenuSeparatorDMW(MvcMenuSeparatorDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMenuSeparatorDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcMenuSeparator>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuSeparatorDMW){
            return( getObjectName().equals( ((MvcMenuSeparatorDMW) obj).getObjectName()) );
        }
        return(false);
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
     * @return A MvcMenu object.
     */
    @SuppressWarnings("unchecked")
    public MvcMenu getAddToMenu(){
        DmcAttribute attr = mycore.get(MvcMenuSeparatorDMO._addToMenu);
        if (attr == null)
            return(null);
        
        MvcMenu ref = (MvcMenu) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MvcMenuREF
     */
    @SuppressWarnings("unchecked")
    public void setAddToMenu(MvcMenu value) throws DmcValueException {
        mycore.setAddToMenu(value.getDmcObject());
        DmcAttribute attr = mycore.get(MvcMenuSeparatorDMO._addToMenu);
        attr.setAuxData(value);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    public void remAddToMenu(){
        mycore.remAddToMenu();
    }

    /**
     * @return A MvcController object.
     */
    @SuppressWarnings("unchecked")
    public MvcController getAssociatedController(){
        DmcAttribute attr = mycore.get(MvcMenuSeparatorDMO._associatedController);
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
        DmcAttribute attr = mycore.get(MvcMenuSeparatorDMO._associatedController);
        attr.setAuxData(value);
    }

    /**
     * Removes the associatedController attribute value.
     */
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }

    public Integer getMenuOrder(){
        return(mycore.getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    public void setMenuOrder(Object value) throws DmcValueException {
        mycore.setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    public void remMenuOrder(){
        mycore.remMenuOrder();
    }


}
