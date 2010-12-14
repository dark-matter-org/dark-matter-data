package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcConfig;

// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;

abstract public class MvcConfigDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcConfigDMO mycore;

    public MvcConfigDMW() {
        super(new MvcConfigDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcConfig);
        mycore = (MvcConfigDMO) core;
        mycore.setContainer(this);
    }

    public MvcConfigDMW(MvcConfigDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcConfig);
        mycore = (MvcConfigDMO) core;
        mycore.setContainer(this);
    }

    protected MvcConfigDMW(MvcConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
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
     * @return An Iterator of MvcConfigDMO objects.
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
    @SuppressWarnings("unchecked")
    public void delDependsOnMVC(MvcConfig value){
        DmcAttribute attr = mycore.delDependsOnMVC(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcConfig> refs = (ArrayList<MvcConfig>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the dependsOnMVC attribute value.
     */
    public void remDependsOnMVC(){
        mycore.remDependsOnMVC();
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

    /**
     * Removes the genPackage attribute value.
     */
    public void remGenPackage(){
        mycore.remGenPackage();
    }


}
