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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1147)
 */
@SuppressWarnings("serial")
public class ObjectValidatorDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __objectClass = new DmcAttributeInfo("objectClass",1,"ClassDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __validatorClass = new DmcAttributeInfo("validatorClass",112,"String",ValueTypeEnum.SINGLE,true);

    public final static DmcAttributeInfo __definedIn = new DmcAttributeInfo("definedIn",61,"SchemaDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __opContext = new DmcAttributeInfo("opContext",115,"OperationalContextEnum",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__objectClass.id,__objectClass);
        _ImAp.put(__validatorClass.id,__validatorClass);
        _ImAp.put(__definedIn.id,__definedIn);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__opContext.id,__opContext);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__objectClass.name,__objectClass);
        _SmAp.put(__validatorClass.name,__validatorClass);
        _SmAp.put(__definedIn.name,__definedIn);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__opContext.name,__opContext);

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

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
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
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1492)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1538)
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Used to indicate the classes that an object instance supports.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1624)
    public Iterator<ClassDefinitionREF> getObjectClass(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(__objectClass);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another objectClass value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1674)
    public DmcAttribute addObjectClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__objectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__objectClass);
        
        attr.add(value);
        add(__objectClass,attr);
        return(attr);
    }

    /**
     * The fully qualified name of an object or attribute validator class.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1492)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1538)
    @SuppressWarnings("unchecked")
    public void setValidatorClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__validatorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__validatorClass);
        
        attr.set(value);
        set(__validatorClass,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1492)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1538)
    @SuppressWarnings("unchecked")
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute attr = get(__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(__definedIn);
        
        attr.set(value);
        set(__definedIn,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1492)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1538)
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1492)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1538)
    @SuppressWarnings("unchecked")
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute attr = get(__file);
        if (attr == null)
            attr = new DmcTypeStringSV(__file);
        
        attr.set(value);
        set(__file,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1492)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1538)
    @SuppressWarnings("unchecked")
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute attr = get(__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__lineNumber);
        
        attr.set(value);
        set(__lineNumber,attr);
    }

    /**
     * Indicates the operational context for some component e.g. object or
     * attribute validators.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1492)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1538)
    @SuppressWarnings("unchecked")
    public void setOpContext(Object value) throws DmcValueException {
        DmcAttribute attr = get(__opContext);
        if (attr == null)
            attr = new DmcTypeOperationalContextEnumSV(__opContext);
        
        attr.set(value);
        set(__opContext,attr);
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
