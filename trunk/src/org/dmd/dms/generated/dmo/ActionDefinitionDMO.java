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

/**
 * This class is used to define the actions that may be triggered on an
 * object.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1231)
 */
@SuppressWarnings("serial")
public class ActionDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__attachToClass.id,MetaDMSAG.__attachToClass);
        _ImAp.put(MetaDMSAG.__blockWhenLocked.id,MetaDMSAG.__blockWhenLocked);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__isGetAction.id,MetaDMSAG.__isGetAction);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__mayParm.id,MetaDMSAG.__mayParm);
        _ImAp.put(MetaDMSAG.__mayReturn.id,MetaDMSAG.__mayReturn);
        _ImAp.put(MetaDMSAG.__maySendProgress.id,MetaDMSAG.__maySendProgress);
        _ImAp.put(MetaDMSAG.__mustParm.id,MetaDMSAG.__mustParm);
        _ImAp.put(MetaDMSAG.__mustReturn.id,MetaDMSAG.__mustReturn);
        _ImAp.put(MetaDMSAG.__obsoleteVersion.id,MetaDMSAG.__obsoleteVersion);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__attachToClass.name,MetaDMSAG.__attachToClass);
        _SmAp.put(MetaDMSAG.__blockWhenLocked.name,MetaDMSAG.__blockWhenLocked);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__isGetAction.name,MetaDMSAG.__isGetAction);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__mayParm.name,MetaDMSAG.__mayParm);
        _SmAp.put(MetaDMSAG.__mayReturn.name,MetaDMSAG.__mayReturn);
        _SmAp.put(MetaDMSAG.__maySendProgress.name,MetaDMSAG.__maySendProgress);
        _SmAp.put(MetaDMSAG.__mustParm.name,MetaDMSAG.__mustParm);
        _SmAp.put(MetaDMSAG.__mustReturn.name,MetaDMSAG.__mustReturn);
        _SmAp.put(MetaDMSAG.__obsoleteVersion.name,MetaDMSAG.__obsoleteVersion);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String ,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }


    public ActionDefinitionDMO(){
        super("ActionDefinition");
    }

    public ActionDefinitionDMO(String oc){
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
    public ActionDefinitionDMO getNew(){
        ActionDefinitionDMO rc = new ActionDefinitionDMO();
        return(rc);
    }

    @Override
    public ActionDefinitionDMO getSlice(DmcSliceInfo info){
        ActionDefinitionDMO rc = new ActionDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1623)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Indicates the classes of object to which an action is to be attached. This
     * mechanism allows for the extension of a class's behaviour without having
     * to alter the schema of the class involved. This can be viewed as the
     * auxiliary class equivalent for behaviour.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1709)
    public Iterator<ClassDefinitionREF> getAttachToClass(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(MetaDMSAG.__attachToClass);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attachToClass value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1760)
    public DmcAttribute<?> addAttachToClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__attachToClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(MetaDMSAG.__attachToClass);
        
        attr.add(value);
        add(MetaDMSAG.__attachToClass,attr);
        return(attr);
    }

    /**
     * This flag indicates whether or not an Action will be blocked from
     * proceeding if there is a DAF lock on the object against which the action
     * is performed. The default is to block all incoming actions against a
     * locked object. By setting this flag to false, you can allow an action to
     * proceed.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public Boolean getBlockWhenLocked(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__blockWhenLocked);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets blockWhenLocked to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1623)
    public void setBlockWhenLocked(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__blockWhenLocked);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__blockWhenLocked);
        
        attr.set(value);
        set(MetaDMSAG.__blockWhenLocked,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1623)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1623)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1623)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * This flag indicates if an Action is merely a data retrieval (get) Action.
     * Actions that are flagged with this attribute set to true will be
     * executable even when the server is in a read-only mode because they don't
     * actually alter data. One example of this is the getAllowedOperations()
     * action on the SecurityBranch.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public Boolean getIsGetAction(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isGetAction);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isGetAction to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1623)
    public void setIsGetAction(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isGetAction);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isGetAction);
        
        attr.set(value);
        set(MetaDMSAG.__isGetAction,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1623)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * Indicates the set of parameters that an action MAY have. When accessed in
     * Java, this is a set of references to AttributeDefinition objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1709)
    public Iterator<AttributeDefinitionREF> getMayParm(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__mayParm);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mayParm value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1760)
    public DmcAttribute<?> addMayParm(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__mayParm);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__mayParm);
        
        attr.add(value);
        add(MetaDMSAG.__mayParm,attr);
        return(attr);
    }

    /**
     * Indicates the set of return vals that may be returned as part of a
     * particular action response message.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1709)
    public Iterator<AttributeDefinitionREF> getMayReturn(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__mayReturn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mayReturn value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1760)
    public DmcAttribute<?> addMayReturn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__mayReturn);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__mayReturn);
        
        attr.add(value);
        add(MetaDMSAG.__mayReturn,attr);
        return(attr);
    }

    /**
     * This flag is used to indicate if a particular request might result in
     * progress indications being sent. Although primarily intended as a
     * documentation aspect, this flag is used within the TL1 subsystem to allow
     * for the creation of a response handler for node requests that send
     * progress text.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public Boolean getMaySendProgress(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__maySendProgress);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets maySendProgress to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1623)
    public void setMaySendProgress(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__maySendProgress);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__maySendProgress);
        
        attr.set(value);
        set(MetaDMSAG.__maySendProgress,attr);
    }

    /**
     * Indicates the set of parameters that an action MUST have. When accessed in
     * Java, this is a set of references to AttributeDefinition objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1709)
    public Iterator<AttributeDefinitionREF> getMustParm(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__mustParm);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mustParm value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1760)
    public DmcAttribute<?> addMustParm(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__mustParm);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__mustParm);
        
        attr.add(value);
        add(MetaDMSAG.__mustParm,attr);
        return(attr);
    }

    /**
     * Indicates the set of return vals that must be returned as part of a
     * particular action response message.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1709)
    public Iterator<AttributeDefinitionREF> getMustReturn(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__mustReturn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mustReturn value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1760)
    public DmcAttribute<?> addMustReturn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__mustReturn);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__mustReturn);
        
        attr.add(value);
        add(MetaDMSAG.__mustReturn,attr);
        return(attr);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public String getObsoleteVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1623)
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__obsoleteVersion);
        
        attr.set(value);
        set(MetaDMSAG.__obsoleteVersion,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public StringName getObjectName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcTypeStringName getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
