package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.features.extgwt.extended.MvcMenu;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcBackgroundMenuDMO;

abstract public class MvcBackgroundMenuDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcBackgroundMenuDMO mycore;

    public MvcBackgroundMenuDMW() {
        super(new MvcBackgroundMenuDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcBackgroundMenu);
        mycore = (MvcBackgroundMenuDMO) core;
        mycore.setContainer(this);
    }

    public MvcBackgroundMenuDMW(MvcBackgroundMenuDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcBackgroundMenu);
        mycore = (MvcBackgroundMenuDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcBackgroundMenuDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcBackgroundMenuDMW(MvcBackgroundMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcBackgroundMenuDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcBackgroundMenu>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcBackgroundMenuDMW){
            return( getObjectName().equals( ((MvcBackgroundMenuDMW) obj).getObjectName()) );
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
