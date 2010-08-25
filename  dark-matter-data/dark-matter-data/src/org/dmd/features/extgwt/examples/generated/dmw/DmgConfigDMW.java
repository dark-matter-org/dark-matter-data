package org.dmd.features.extgwt.examples.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmg.types.Generator;

import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;

class DmgConfigDMW extends DmoExtGWTWrapperBase<DmgConfigDMO> {

    public DmgConfigDMW(){

    }

    public DmgConfigDMW(DmgConfigDMO obj){
        super(obj);
    }

    /**
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getSchemaToLoad(){
        return(core.getSchemaToLoad());
    }

    /**
     * Adds another schemaToLoad value.
     * @param value A value compatible with String
     */
    public void addSchemaToLoad(Object value) throws DmcValueException {
        core.addSchemaToLoad(value);
    }

    /**
     * Deletes a schemaToLoad value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delSchemaToLoad(Object value){
        core.delSchemaToLoad(value);
    }

    /**
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getConfigSuffix(){
        return(core.getConfigSuffix());
    }

    /**
     * Adds another configSuffix value.
     * @param value A value compatible with String
     */
    public void addConfigSuffix(Object value) throws DmcValueException {
        core.addConfigSuffix(value);
    }

    /**
     * Deletes a configSuffix value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delConfigSuffix(Object value){
        core.delConfigSuffix(value);
    }

    public String getDescription(){
        return(core.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDescription(Object value) throws DmcValueException {
        core.setDescription(value);
    }

    /**
     * @returns An Iterator of Generator objects.
     */
    public Iterator<Generator> getGenerator(){
        return(core.getGenerator());
    }

    /**
     * Adds another generator value.
     * @param value A value compatible with Generator
     */
    public void addGenerator(Object value) throws DmcValueException {
        core.addGenerator(value);
    }

    /**
     * Deletes a generator value.
     * @param value The Generator to be deleted from set of attribute values.
     */
    public void delGenerator(Object value){
        core.delGenerator(value);
    }

    public String getGenPackage(){
        return(core.getGenPackage());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setGenPackage(Object value) throws DmcValueException {
        core.setGenPackage(value);
    }





}
