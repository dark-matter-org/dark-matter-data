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
package org.dmd.dms.generated.dmo;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * This class is used to define the actions that may be triggered on an
 * object.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1028)
 */
@SuppressWarnings({"unused", "serial"})
public class ActionDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {

     public final static String _name = "name";
     public final static String _description = "description";
     public final static String _mustParm = "mustParm";
     public final static String _mayParm = "mayParm";
     public final static String _mustReturn = "mustReturn";
     public final static String _mayReturn = "mayReturn";
     public final static String _attachToClass = "attachToClass";
     public final static String _blockWhenLocked = "blockWhenLocked";
     public final static String _isGetAction = "isGetAction";
     public final static String _obsoleteVersion = "obsoleteVersion";
     public final static String _maySendProgress = "maySendProgress";


     public String getConstructionClassName(){
         return("ActionDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
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
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(_description);
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
        DmcAttribute attr = get(_description);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_description,attr);
    }

    /**
     * Indicates the set of parameters that an action MUST have. When accessed in
     * Java, this is a set of references to AttributeDefinition objects.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMustParm(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_mustParm);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mustParm value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addMustParm(Object value) throws DmcValueException {
        DmcAttribute attr = get(_mustParm);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.add(value);
        add(_mustParm,attr);
        return(attr);
    }

    /**
     * Indicates the set of parameters that an action MAY have. When accessed in
     * Java, this is a set of references to AttributeDefinition objects.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMayParm(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_mayParm);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mayParm value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addMayParm(Object value) throws DmcValueException {
        DmcAttribute attr = get(_mayParm);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.add(value);
        add(_mayParm,attr);
        return(attr);
    }

    /**
     * Indicates the set of return vals that must be returned as part of a
     * particular action response message.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMustReturn(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_mustReturn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mustReturn value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addMustReturn(Object value) throws DmcValueException {
        DmcAttribute attr = get(_mustReturn);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.add(value);
        add(_mustReturn,attr);
        return(attr);
    }

    /**
     * Indicates the set of return vals that may be returned as part of a
     * particular action response message.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMayReturn(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_mayReturn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another mayReturn value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addMayReturn(Object value) throws DmcValueException {
        DmcAttribute attr = get(_mayReturn);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.add(value);
        add(_mayReturn,attr);
        return(attr);
    }

    /**
     * Indicates the classes of object to which an action is to be attached. This
     * mechanism allows for the extension of a class's behaviour without having
     * to alter the schema of the class involved. This can be viewed as the
     * auxiliary class equivalent for behaviour.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getAttachToClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_attachToClass);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attachToClass value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addAttachToClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_attachToClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(_attachToClass,attr);
        return(attr);
    }

    /**
     * This flag indicates whether or not an Action will be blocked from
     * proceeding if there is a DAF lock on the object against which the action
     * is performed. The default is to block all incoming actions against a
     * locked object. By setting this flag to false, you can allow an action to
     * proceed.
     */
    public Boolean getBlockWhenLocked(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_blockWhenLocked);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets blockWhenLocked to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setBlockWhenLocked(Object value) throws DmcValueException {
        DmcAttribute attr = get(_blockWhenLocked);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_blockWhenLocked,attr);
    }

    /**
     * This flag indicates if an Action is merely a data retrieval (get) Action.
     * Actions that are flagged with this attribute set to true will be
     * executable even when the server is in a read-only mode because they don't
     * actually alter data. One example of this is the getAllowedOperations()
     * action on the SecurityBranch.
     */
    public Boolean getIsGetAction(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_isGetAction);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isGetAction to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setIsGetAction(Object value) throws DmcValueException {
        DmcAttribute attr = get(_isGetAction);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_isGetAction,attr);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
     */
    public String getObsoleteVersion(){
        DmcTypeString attr = (DmcTypeString) get(_obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute attr = get(_obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_obsoleteVersion,attr);
    }

    /**
     * This flag is used to indicate if a particular request might result in
     * progress indications being sent. Although primarily intended as a
     * documentation aspect, this flag is used within the TL1 subsystem to allow
     * for the creation of a response handler for node requests that send
     * progress text.
     */
    public Boolean getMaySendProgress(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_maySendProgress);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets maySendProgress to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setMaySendProgress(Object value) throws DmcValueException {
        DmcAttribute attr = get(_maySendProgress);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_maySendProgress,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public String getObjectName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }

}
