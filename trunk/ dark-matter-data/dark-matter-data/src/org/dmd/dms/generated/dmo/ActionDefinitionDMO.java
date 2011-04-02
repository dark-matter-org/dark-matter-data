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
 * This class is used to define the actions that may be triggered on an
 * object.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1046)
 */
@SuppressWarnings("serial")
public class ActionDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __mustParm = new DmcAttributeInfo("mustParm",28,"AttributeDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __mayParm = new DmcAttributeInfo("mayParm",29,"AttributeDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __mustReturn = new DmcAttributeInfo("mustReturn",30,"AttributeDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __mayReturn = new DmcAttributeInfo("mayReturn",31,"AttributeDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __attachToClass = new DmcAttributeInfo("attachToClass",65,"ClassDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __blockWhenLocked = new DmcAttributeInfo("blockWhenLocked",71,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __isGetAction = new DmcAttributeInfo("isGetAction",72,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __obsoleteVersion = new DmcAttributeInfo("obsoleteVersion",73,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __maySendProgress = new DmcAttributeInfo("maySendProgress",76,"Boolean",ValueTypeEnum.SINGLE,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__mustParm.id,__mustParm);
        _ImAp.put(__mayParm.id,__mayParm);
        _ImAp.put(__mustReturn.id,__mustReturn);
        _ImAp.put(__mayReturn.id,__mayReturn);
        _ImAp.put(__attachToClass.id,__attachToClass);
        _ImAp.put(__blockWhenLocked.id,__blockWhenLocked);
        _ImAp.put(__isGetAction.id,__isGetAction);
        _ImAp.put(__obsoleteVersion.id,__obsoleteVersion);
        _ImAp.put(__maySendProgress.id,__maySendProgress);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__mustParm.name,__mustParm);
        _SmAp.put(__mayParm.name,__mayParm);
        _SmAp.put(__mustReturn.name,__mustReturn);
        _SmAp.put(__mayReturn.name,__mayReturn);
        _SmAp.put(__attachToClass.name,__attachToClass);
        _SmAp.put(__blockWhenLocked.name,__blockWhenLocked);
        _SmAp.put(__isGetAction.name,__isGetAction);
        _SmAp.put(__obsoleteVersion.name,__obsoleteVersion);
        _SmAp.put(__maySendProgress.name,__maySendProgress);
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

    @Override
    public ActionDefinitionDMO getNew(){
        ActionDefinitionDMO rc = new ActionDefinitionDMO();
        return(rc);
    }

     public String getConstructionClassName(){
         return("ActionDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1335)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1381)
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1335)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1381)
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * Indicates the set of parameters that an action MUST have. When accessed in
     * Java, this is a set of references to AttributeDefinition objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1467)
    public Iterator<AttributeDefinitionREF> getMustParm(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(__mustParm);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mustParm value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1517)
    public DmcAttribute addMustParm(Object value) throws DmcValueException {
        DmcAttribute attr = get(__mustParm);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(__mustParm);
        
        attr.add(value);
        add(__mustParm,attr);
        return(attr);
    }

    /**
     * Indicates the set of parameters that an action MAY have. When accessed in
     * Java, this is a set of references to AttributeDefinition objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1467)
    public Iterator<AttributeDefinitionREF> getMayParm(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(__mayParm);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mayParm value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1517)
    public DmcAttribute addMayParm(Object value) throws DmcValueException {
        DmcAttribute attr = get(__mayParm);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(__mayParm);
        
        attr.add(value);
        add(__mayParm,attr);
        return(attr);
    }

    /**
     * Indicates the set of return vals that must be returned as part of a
     * particular action response message.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1467)
    public Iterator<AttributeDefinitionREF> getMustReturn(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(__mustReturn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mustReturn value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1517)
    public DmcAttribute addMustReturn(Object value) throws DmcValueException {
        DmcAttribute attr = get(__mustReturn);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(__mustReturn);
        
        attr.add(value);
        add(__mustReturn,attr);
        return(attr);
    }

    /**
     * Indicates the set of return vals that may be returned as part of a
     * particular action response message.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1467)
    public Iterator<AttributeDefinitionREF> getMayReturn(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(__mayReturn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mayReturn value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1517)
    public DmcAttribute addMayReturn(Object value) throws DmcValueException {
        DmcAttribute attr = get(__mayReturn);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(__mayReturn);
        
        attr.add(value);
        add(__mayReturn,attr);
        return(attr);
    }

    /**
     * Indicates the classes of object to which an action is to be attached. This
     * mechanism allows for the extension of a class's behaviour without having
     * to alter the schema of the class involved. This can be viewed as the
     * auxiliary class equivalent for behaviour.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1467)
    public Iterator<ClassDefinitionREF> getAttachToClass(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(__attachToClass);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attachToClass value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1517)
    public DmcAttribute addAttachToClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__attachToClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__attachToClass);
        
        attr.add(value);
        add(__attachToClass,attr);
        return(attr);
    }

    /**
     * This flag indicates whether or not an Action will be blocked from
     * proceeding if there is a DAF lock on the object against which the action
     * is performed. The default is to block all incoming actions against a
     * locked object. By setting this flag to false, you can allow an action to
     * proceed.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1335)
    public Boolean getBlockWhenLocked(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__blockWhenLocked);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets blockWhenLocked to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1381)
    @SuppressWarnings("unchecked")
    public void setBlockWhenLocked(Object value) throws DmcValueException {
        DmcAttribute attr = get(__blockWhenLocked);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__blockWhenLocked);
        
        attr.set(value);
        set(__blockWhenLocked,attr);
    }

    /**
     * This flag indicates if an Action is merely a data retrieval (get) Action.
     * Actions that are flagged with this attribute set to true will be
     * executable even when the server is in a read-only mode because they don't
     * actually alter data. One example of this is the getAllowedOperations()
     * action on the SecurityBranch.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1335)
    public Boolean getIsGetAction(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__isGetAction);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isGetAction to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1381)
    @SuppressWarnings("unchecked")
    public void setIsGetAction(Object value) throws DmcValueException {
        DmcAttribute attr = get(__isGetAction);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__isGetAction);
        
        attr.set(value);
        set(__isGetAction,attr);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1335)
    public String getObsoleteVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1381)
    @SuppressWarnings("unchecked")
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute attr = get(__obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(__obsoleteVersion);
        
        attr.set(value);
        set(__obsoleteVersion,attr);
    }

    /**
     * This flag is used to indicate if a particular request might result in
     * progress indications being sent. Although primarily intended as a
     * documentation aspect, this flag is used within the TL1 subsystem to allow
     * for the creation of a response handler for node requests that send
     * progress text.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1335)
    public Boolean getMaySendProgress(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__maySendProgress);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets maySendProgress to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1381)
    @SuppressWarnings("unchecked")
    public void setMaySendProgress(Object value) throws DmcValueException {
        DmcAttribute attr = get(__maySendProgress);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__maySendProgress);
        
        attr.set(value);
        set(__maySendProgress,attr);
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
