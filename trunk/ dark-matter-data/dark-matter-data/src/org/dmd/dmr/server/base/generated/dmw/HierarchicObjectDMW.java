package org.dmd.dmr.server.base.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcValueException;
// import 2
import org.dmd.dmc.DmcObject;

import org.dmd.dmw.DmwWrapperBase;
// import 4
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;

public class HierarchicObjectDMW extends DmwWrapperBase {

    private HierarchicObjectDMO mycore;

    protected HierarchicObjectDMW(DmcObject obj) {
        super(obj);
        mycore = (HierarchicObjectDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmr.server.base.extended.HierarchicObject>());
    }

    public String getParentFQN(){
        return(mycore.getParentFQN());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setParentFQN(Object value) throws DmcValueException {
        mycore.setParentFQN(value);
    }

    public String getFQN(){
        return(mycore.getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFQN(Object value) throws DmcValueException {
        mycore.setFQN(value);
    }


}
