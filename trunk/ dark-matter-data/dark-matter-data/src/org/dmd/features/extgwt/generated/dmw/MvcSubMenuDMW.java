package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcMenu;

// import 8
import org.dmd.features.extgwt.extended.MvcMenu;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcSubMenuDMO;

abstract public class MvcSubMenuDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcSubMenuDMO mycore;

    public MvcSubMenuDMW() {
        super(new MvcSubMenuDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcSubMenu);
        mycore = (MvcSubMenuDMO) core;
        mycore.setContainer(this);
    }

    public MvcSubMenuDMW(MvcSubMenuDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcSubMenu);
        mycore = (MvcSubMenuDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcSubMenuDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcSubMenuDMW(MvcSubMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcSubMenuDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcSubMenu>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcSubMenuDMW){
            return( getObjectName().equals( ((MvcSubMenuDMW) obj).getObjectName()) );
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
        DmcAttribute attr = mycore.get(MvcSubMenuDMO._addToMenu);
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
        DmcAttribute attr = mycore.get(MvcSubMenuDMO._addToMenu);
        attr.setAuxData(value);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    public void remAddToMenu(){
        mycore.remAddToMenu();
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
