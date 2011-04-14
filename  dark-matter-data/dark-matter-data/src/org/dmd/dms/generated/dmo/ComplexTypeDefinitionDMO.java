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
 * The ComplexTypeDefinition provides a mechanism for defining the structure
 * of a complex type composed of other types. From this definition, a new
 * DmcType is generated that has all of the required methods automatically
 * defined.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1089)
 */
@SuppressWarnings("serial")
public class ComplexTypeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __fieldSeparator = new DmcAttributeInfo("fieldSeparator",104,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __field = new DmcAttributeInfo("field",105,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __extendedClass = new DmcAttributeInfo("extendedClass",106,"String",ValueTypeEnum.SINGLE,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__fieldSeparator.id,__fieldSeparator);
        _ImAp.put(__field.id,__field);
        _ImAp.put(__extendedClass.id,__extendedClass);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__fieldSeparator.name,__fieldSeparator);
        _SmAp.put(__field.name,__field);
        _SmAp.put(__extendedClass.name,__extendedClass);
    }


    public ComplexTypeDefinitionDMO(){
        super("ComplexTypeDefinition");
    }

    public ComplexTypeDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public ComplexTypeDefinitionDMO getNew(){
        ComplexTypeDefinitionDMO rc = new ComplexTypeDefinitionDMO();
        return(rc);
    }

     public String getConstructionClassName(){
         return("ComplexTypeDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1378)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1424)
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * The fieldSeparator is used to indicate the separation character used when
     * a ComplexType is represented as a String. If a fieldSeparator isn't
     * specified, it is assumed to be a space.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1378)
    public String getFieldSeparator(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__fieldSeparator);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets fieldSeparator to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1424)
    @SuppressWarnings("unchecked")
    public void setFieldSeparator(Object value) throws DmcValueException {
        DmcAttribute attr = get(__fieldSeparator);
        if (attr == null)
            attr = new DmcTypeStringSV(__fieldSeparator);
        
        attr.set(value);
        set(__fieldSeparator,attr);
    }

    /**
     * The field indicates a type and name for a field in a ComplexType.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1378)
    public String getField(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__field);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets field to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1424)
    @SuppressWarnings("unchecked")
    public void setField(Object value) throws DmcValueException {
        DmcAttribute attr = get(__field);
        if (attr == null)
            attr = new DmcTypeStringSV(__field);
        
        attr.set(value);
        set(__field,attr);
    }

    /**
     * The extendedClass indicates the fully qualified name of the class that is
     * derived from the generated ComplexType to provide additional behaviour.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1378)
    public String getExtendedClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__extendedClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets extendedClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1424)
    @SuppressWarnings("unchecked")
    public void setExtendedClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__extendedClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__extendedClass);
        
        attr.set(value);
        set(__extendedClass,attr);
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
