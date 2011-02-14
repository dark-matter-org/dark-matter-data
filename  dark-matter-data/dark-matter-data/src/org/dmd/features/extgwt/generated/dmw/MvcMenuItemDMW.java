package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcAction;
// import 1
import org.dmd.features.extgwt.extended.MvcController;
// import 1
import org.dmd.features.extgwt.extended.MvcMenu;

// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcMenuItemDMO;

abstract public class MvcMenuItemDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcMenuItemDMO mycore;

    public MvcMenuItemDMW() {
        super(new MvcMenuItemDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuItem);
        mycore = (MvcMenuItemDMO) core;
        mycore.setContainer(this);
    }

    public MvcMenuItemDMW(MvcMenuItemDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuItem);
        mycore = (MvcMenuItemDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcMenuItemDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcMenuItemDMW(MvcMenuItemDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMenuItemDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcMenuItem>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuItemDMW){
            return( getObjectName().equals( ((MvcMenuItemDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public String getDisplayLabel(){
        return(mycore.getDisplayLabel());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDisplayLabel(Object value) throws DmcValueException {
        mycore.setDisplayLabel(value);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    public void remDisplayLabel(){
        mycore.remDisplayLabel();
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
     * @return A MvcAction object.
     */
    @SuppressWarnings("unchecked")
    public MvcAction getTriggersAction(){
        DmcAttribute attr = mycore.get(MvcMenuItemDMO._triggersAction);
        if (attr == null)
            return(null);
        
        MvcAction ref = (MvcAction) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the triggersAction to the specified value.
     * @param value A value compatible with MvcActionREF
     */
    @SuppressWarnings("unchecked")
    public void setTriggersAction(MvcAction value) throws DmcValueException {
        mycore.setTriggersAction(value.getDmcObject());
        DmcAttribute attr = mycore.get(MvcMenuItemDMO._triggersAction);
        attr.setAuxData(value);
    }

    /**
     * Removes the triggersAction attribute value.
     */
    public void remTriggersAction(){
        mycore.remTriggersAction();
    }

    /**
     * @return A MvcMenu object.
     */
    @SuppressWarnings("unchecked")
    public MvcMenu getAddToMenu(){
        DmcAttribute attr = mycore.get(MvcMenuItemDMO._addToMenu);
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
        DmcAttribute attr = mycore.get(MvcMenuItemDMO._addToMenu);
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
        DmcAttribute attr = mycore.get(MvcMenuItemDMO._associatedController);
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
        DmcAttribute attr = mycore.get(MvcMenuItemDMO._associatedController);
        attr.setAuxData(value);
    }

    /**
     * Removes the associatedController attribute value.
     */
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }

    public String getMenuOrder(){
        return(mycore.getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeString
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
