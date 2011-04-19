//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dms.generated.dmo;

import java.io.Serializable;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * The SliceDefinition class is used to define a named set of attributes that
 * are used to retrieve a slice of an object i.e. an abbreviated set of
 * values. These are used in the generation of static, named DmcSliceInfo
 * instances.
 * @author Auto Generated
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1118)
 */
@SuppressWarnings("serial")
public class SliceDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __selectAttribute = new DmcAttributeInfo("selectAttribute",110,"AttributeDefinition",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__selectAttribute.id,__selectAttribute);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__selectAttribute.name,__selectAttribute);
    }


    public SliceDefinitionDMO(){
        super("SliceDefinition");
    }

    public SliceDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public SliceDefinitionDMO getNew(){
        SliceDefinitionDMO rc = new SliceDefinitionDMO();
        return(rc);
    }

    @Override
    public SliceDefinitionDMO getSlice(DmcSliceInfo info){
        SliceDefinitionDMO rc = new SliceDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

     public String getConstructionClassName(){
         return("SliceDefinition");
     }

    /**
     * The selectAttribute indicates an attribute to be used in the definition of
     * a Slice.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1414)
    public AttributeDefinitionREF getSelectAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(__selectAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets selectAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1460)
    @SuppressWarnings("unchecked")
    public void setSelectAttribute(Object value) throws DmcValueException {
        DmcAttribute attr = get(__selectAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(__selectAttribute);
        
        attr.set(value);
        set(__selectAttribute,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public StringName getObjectName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcTypeStringName getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
