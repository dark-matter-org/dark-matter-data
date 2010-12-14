package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.features.extgwt.extended.MvcView;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcMultiViewDMO;

abstract public class MvcMultiViewDMW extends MvcView implements DmcNamedObjectIF {

    private MvcMultiViewDMO mycore;

    public MvcMultiViewDMW() {
        super(new MvcMultiViewDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMultiView);
        mycore = (MvcMultiViewDMO) core;
        mycore.setContainer(this);
    }

    public MvcMultiViewDMW(MvcMultiViewDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMultiView);
        mycore = (MvcMultiViewDMO) core;
        mycore.setContainer(this);
    }

    protected MvcMultiViewDMW(MvcMultiViewDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMultiViewDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcMultiView>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMultiViewDMW){
            return( getObjectName().equals( ((MvcMultiViewDMW) obj).getObjectName()) );
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
