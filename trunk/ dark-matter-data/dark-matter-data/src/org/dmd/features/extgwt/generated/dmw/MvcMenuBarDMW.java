package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.features.extgwt.extended.MvcMenu;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcMenuBarDMO;

abstract public class MvcMenuBarDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcMenuBarDMO mycore;

    public MvcMenuBarDMW() {
        super(new MvcMenuBarDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuBar);
        mycore = (MvcMenuBarDMO) core;
        mycore.setContainer(this);
    }

    public MvcMenuBarDMW(MvcMenuBarDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuBar);
        mycore = (MvcMenuBarDMO) core;
        mycore.setContainer(this);
    }

    protected MvcMenuBarDMW(MvcMenuBarDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMenuBarDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcMenuBar>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuBarDMW){
            return( getObjectName().equals( ((MvcMenuBarDMW) obj).getObjectName()) );
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
