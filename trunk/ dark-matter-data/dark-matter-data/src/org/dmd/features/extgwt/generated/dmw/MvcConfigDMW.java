package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;

import org.dmd.dmc.DmcValueException;
// import 1
import org.dmd.features.extgwt.extended.MvcConfig;

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
     * @returns An Iterator of MvcConfigDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcConfig> getDependsOnMVC(){
        DmcAttribute attr = mycore.get(MvcConfigDMO._dependsOnMVC);
        if (attr == null)
            return(null);
        
        ArrayList<MvcConfig> refs = (ArrayList<MvcConfig>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another dependsOnMVC value.
     * @param value A value compatible with MvcConfig
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDependsOnMVC(MvcConfig value) throws DmcValueException {
        DmcAttribute attr = mycore.addDependsOnMVC(value.getDmcObject());
        ArrayList<MvcConfig> refs = (ArrayList<MvcConfig>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcConfig>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a dependsOnMVC value.
     * @param value The MvcConfig to be deleted from set of attribute values.
     */
    public void delDependsOnMVC(Object value){
        mycore.delDependsOnMVC(value);
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
