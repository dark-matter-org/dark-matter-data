package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 3
import org.dmd.dmc.types.StringName;

// import 8
import org.dmd.features.extgwt.extended.MvcMenu;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcPopupMenuDMO;

/**
 * The MvcPopupMenu class is meant to allow for the definition of menus that
 * can be popped up on a variety components, for instance tree nodes and
 * table rows. Although implemented as standard
 * com.extjs.gxt.ui.client.widget.menu.Menu instances, the display of popup
 * menus is controlled by the MenuController infrastructure.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:220)
 */
abstract public class MvcPopupMenuDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcPopupMenuDMO mycore;

    public MvcPopupMenuDMW() {
        super(new MvcPopupMenuDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcPopupMenu);
        mycore = (MvcPopupMenuDMO) core;
        mycore.setContainer(this);
    }

    public MvcPopupMenuDMW(MvcPopupMenuDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcPopupMenu);
        mycore = (MvcPopupMenuDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcPopupMenuDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcPopupMenuDMW(MvcPopupMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcPopupMenuDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcPopupMenu>());
    }

    public StringName getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcPopupMenuDMW){
            return( getObjectName().equals( ((MvcPopupMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
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

    public String getUseForModelClass(){
        return(mycore.getUseForModelClass());
    }

    /**
     * Sets useForModelClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setUseForModelClass(Object value) throws DmcValueException {
        mycore.setUseForModelClass(value);
    }

    /**
     * Removes the useForModelClass attribute value.
     */
    public void remUseForModelClass(){
        mycore.remUseForModelClass();
    }


}
