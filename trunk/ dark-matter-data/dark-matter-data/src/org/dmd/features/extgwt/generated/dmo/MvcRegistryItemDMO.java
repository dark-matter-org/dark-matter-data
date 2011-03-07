//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.features.extgwt.generated.dmo;

import java.util.*;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3.2 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The MvcRegistryItem defines something that's stored in the Registry.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:653)
 */
public class MvcRegistryItemDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userDataCollection = new DmcAttributeInfo("userDataCollection",620,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userDataGenericSpec = new DmcAttributeInfo("userDataGenericSpec",621,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userDataType = new DmcAttributeInfo("userDataType",608,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__userDataCollection.id,__userDataCollection);
        _ImAp.put(__userDataGenericSpec.id,__userDataGenericSpec);
        _ImAp.put(__userDataType.id,__userDataType);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__userDataCollection.name,__userDataCollection);
        _SmAp.put(__userDataGenericSpec.name,__userDataGenericSpec);
        _SmAp.put(__userDataType.name,__userDataType);
    }

    public MvcRegistryItemDMO() {
        super("MvcRegistryItem",_ImAp,_SmAp);
    }

    protected MvcRegistryItemDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public MvcRegistryItemDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public MvcRegistryItemDMO(MvcRegistryItemDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcRegistryItemDMO getOneOfMe() {
        MvcRegistryItemDMO rc = new MvcRegistryItemDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(__name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcRegistryItemDMO){
            return( getObjectName().equals( ((MvcRegistryItemDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public String getUserDataCollection(){
        DmcTypeString attr = (DmcTypeString) get(__userDataCollection);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUserDataCollection(Object value) throws DmcValueException {
        DmcAttribute attr = get(__userDataCollection);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__userDataCollection,attr);
    }

    /**
     * Removes the userDataCollection attribute value.
     */
    public void remUserDataCollection(){
         rem(__userDataCollection);
    }

    public String getUserDataGenericSpec(){
        DmcTypeString attr = (DmcTypeString) get(__userDataGenericSpec);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        DmcAttribute attr = get(__userDataGenericSpec);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__userDataGenericSpec,attr);
    }

    /**
     * Removes the userDataGenericSpec attribute value.
     */
    public void remUserDataGenericSpec(){
         rem(__userDataGenericSpec);
    }

    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    public void remDescription(){
         rem(__description);
    }

    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
         rem(__name);
    }

    public String getUserDataType(){
        DmcTypeString attr = (DmcTypeString) get(__userDataType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUserDataType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__userDataType);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__userDataType,attr);
    }

    /**
     * Removes the userDataType attribute value.
     */
    public void remUserDataType(){
         rem(__userDataType);
    }




}
