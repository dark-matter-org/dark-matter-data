package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcConfig;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;

public class MvcDefinitionDMW extends DmwWrapper implements DmcNamedObjectIF {

    private MvcDefinitionDMO mycore;

    protected MvcDefinitionDMW(MvcDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
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

    /**
     * Removes the file attribute value.
     */
    public void remFile(){
        mycore.remFile();
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

    /**
     * Removes the lineNumber attribute value.
     */
    public void remLineNumber(){
        mycore.remLineNumber();
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

    /**
     * Removes the description attribute value.
     */
    public void remDescription(){
        mycore.remDescription();
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
     * @return A MvcConfig object.
     */
    @SuppressWarnings("unchecked")
    public MvcConfig getDefinedInMVCConfig(){
        DmcAttribute attr = mycore.get(MvcDefinitionDMO._definedInMVCConfig);
        if (attr == null)
            return(null);
        
        MvcConfig ref = (MvcConfig) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the definedInMVCConfig to the specified value.
     * @param value A value compatible with MvcConfigREF
     */
    @SuppressWarnings("unchecked")
    public void setDefinedInMVCConfig(MvcConfig value) throws DmcValueException {
        mycore.setDefinedInMVCConfig(value.getDmcObject());
        DmcAttribute attr = mycore.get(MvcDefinitionDMO._definedInMVCConfig);
        attr.setAuxData(value);
    }

    /**
     * Removes the definedInMVCConfig attribute value.
     */
    public void remDefinedInMVCConfig(){
        mycore.remDefinedInMVCConfig();
    }


}
