package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.features.extgwt.extended.MvcMenu;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcToolBarDMO;

abstract public class MvcToolBarDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcToolBarDMO mycore;

    public MvcToolBarDMW() {
        super(new MvcToolBarDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcToolBar);
        mycore = (MvcToolBarDMO) core;
        mycore.setContainer(this);
    }

    public MvcToolBarDMW(MvcToolBarDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcToolBar);
        mycore = (MvcToolBarDMO) core;
        mycore.setContainer(this);
    }

    protected MvcToolBarDMW(MvcToolBarDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcToolBarDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcToolBar>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcToolBarDMW){
            return( getObjectName().equals( ((MvcToolBarDMW) obj).getObjectName()) );
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


}
