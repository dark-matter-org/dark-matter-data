package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcValueException;

import org.dmd.dmc.DmcNamedObjectIF;
// import 4
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;

import org.dmd.dmc.DmcObject;

public class MvcConfigDMW extends org.dmd.features.extgwt.extended.MvcDefinition implements DmcNamedObjectIF {

    private MvcConfigDMO mycore;

    public MvcConfigDMW() {
        super(new MvcConfigDMO());
        mycore = (MvcConfigDMO) core;
        mycore.setContainer(this);
    }

    protected MvcConfigDMW(DmcObject obj) {
        super(obj);
        mycore = (MvcConfigDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcConfig>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcConfigDMW){
            return( getObjectName().equals( ((MvcConfigDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getDependsOn(){
        return(mycore.getDependsOn());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with String
     */
    public void addDependsOn(Object value) throws DmcValueException {
        mycore.addDependsOn(value);
    }

    /**
     * Deletes a dependsOn value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delDependsOn(Object value){
        mycore.delDependsOn(value);
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
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getDefFiles(){
        return(mycore.getDefFiles());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    public void addDefFiles(Object value) throws DmcValueException {
        mycore.addDefFiles(value);
    }

    /**
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delDefFiles(Object value){
        mycore.delDefFiles(value);
    }

    public String getGenPackage(){
        return(mycore.getGenPackage());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setGenPackage(Object value) throws DmcValueException {
        mycore.setGenPackage(value);
    }


}
