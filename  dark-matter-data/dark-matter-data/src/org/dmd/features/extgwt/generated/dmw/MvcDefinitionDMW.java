package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcValueException;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmw.DmwWrapperBase;
// import 4
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;

import org.dmd.dmc.DmcObject;

public class MvcDefinitionDMW extends DmwWrapperBase implements DmcNamedObjectIF {

    private MvcDefinitionDMO mycore;

    protected MvcDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (MvcDefinitionDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcDefinition>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcDefinitionDMW){
            return( getObjectName().equals( ((MvcDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public String getFile(){
        return(mycore.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFile(Object value) throws DmcValueException {
        mycore.setFile(value);
    }

    public Integer getLineNumber(){
        return(mycore.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    public void setLineNumber(Object value) throws DmcValueException {
        mycore.setLineNumber(value);
    }

    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
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


}
