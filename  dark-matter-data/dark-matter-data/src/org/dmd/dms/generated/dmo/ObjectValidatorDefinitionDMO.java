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
import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * The ObjectValidatorDefinition allows for the the definition of object
 * level validation logic.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1143)
 */
@SuppressWarnings("serial")
public class ObjectValidatorDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;

    public final static DmcAttributeInfo __validatorClass = new DmcAttributeInfo("validatorClass",112,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __opContext = new DmcAttributeInfo("opContext",115,"OperationalContextEnum",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__validatorClass.id,__validatorClass);
        _ImAp.put(__opContext.id,__opContext);
        _ImAp.put(__description.id,__description);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__validatorClass.name,__validatorClass);
        _SmAp.put(__opContext.name,__opContext);
        _SmAp.put(__description.name,__description);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String ,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }


    public ObjectValidatorDefinitionDMO(){
        super("ObjectValidatorDefinition");
    }

    public ObjectValidatorDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public ObjectValidatorDefinitionDMO getNew(){
        ObjectValidatorDefinitionDMO rc = new ObjectValidatorDefinitionDMO();
        return(rc);
    }

    @Override
    public ObjectValidatorDefinitionDMO getSlice(DmcSliceInfo info){
        ObjectValidatorDefinitionDMO rc = new ObjectValidatorDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

     public String getConstructionClassName(){
         return("ObjectValidatorDefinition");
     }

    /**
     * The fully qualified name of an object or attribute validator class.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1452)
    public String getValidatorClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__validatorClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets validatorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1498)
    @SuppressWarnings("unchecked")
    public void setValidatorClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__validatorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__validatorClass);
        
        attr.set(value);
        set(__validatorClass,attr);
    }

    /**
     * Indicates the operational context for some component e.g. object or
     * attribute validators.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1452)
    public OperationalContextEnum getOpContext(){
        DmcTypeOperationalContextEnumSV attr = (DmcTypeOperationalContextEnumSV) get(__opContext);
        if (attr == null)
            return(OperationalContextEnum.DMO);

        return(attr.getSV());
    }

    /**
     * Sets opContext to the specified value.
     * @param value A value compatible with DmcTypeOperationalContextEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1498)
    @SuppressWarnings("unchecked")
    public void setOpContext(Object value) throws DmcValueException {
        DmcAttribute attr = get(__opContext);
        if (attr == null)
            attr = new DmcTypeOperationalContextEnumSV(__opContext);
        
        attr.set(value);
        set(__opContext,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1452)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1498)
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
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
