package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.features.extgwt.extended.MvcMenu;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcPopupMenuDMO;

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

    protected MvcPopupMenuDMW(MvcPopupMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcPopupMenuDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcPopupMenu>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcPopupMenuDMW){
            return( getObjectName().equals( ((MvcPopupMenuDMW) obj).getObjectName()) );
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
