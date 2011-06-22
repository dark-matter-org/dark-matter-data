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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dmw.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * This class is used to define the actions that may be triggered on an
 * object.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:982)
 */
@SuppressWarnings("unused")
public class ActionDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private ActionDefinitionDMO mycore;

    protected ActionDefinitionDMW() {
        super(new ActionDefinitionDMO());
        mycore = (ActionDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ActionDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (ActionDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ActionDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ActionDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  ActionDefinitionDMO getDMO() {
        return(mycore);
    }

    protected ActionDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected ActionDefinitionDMW(String mn) throws DmcValueException {
        super(new ActionDefinitionDMO());
        mycore = (ActionDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1624)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1624)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Indicates the set of parameters that an action MUST have. When accessed in
     * Java, this is a set of references to AttributeDefinition objects.
     * @return An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1704)
    public AttributeDefinitionIterableDMW getMustParm(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__mustParm);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mustParm value.
     * @param value A value compatible with AttributeDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1751)
    public DmcAttribute addMustParm(AttributeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addMustParm(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of mustParm values.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1774)
    public int getMustParmSize(){
        DmcAttribute attr = mycore.get(MetaDMSAG.__mustParm);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of parameters that an action MAY have. When accessed in
     * Java, this is a set of references to AttributeDefinition objects.
     * @return An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1704)
    public AttributeDefinitionIterableDMW getMayParm(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__mayParm);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mayParm value.
     * @param value A value compatible with AttributeDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1751)
    public DmcAttribute addMayParm(AttributeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addMayParm(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of mayParm values.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1774)
    public int getMayParmSize(){
        DmcAttribute attr = mycore.get(MetaDMSAG.__mayParm);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of return vals that must be returned as part of a
     * particular action response message.
     * @return An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1704)
    public AttributeDefinitionIterableDMW getMustReturn(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__mustReturn);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mustReturn value.
     * @param value A value compatible with AttributeDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1751)
    public DmcAttribute addMustReturn(AttributeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addMustReturn(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of mustReturn values.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1774)
    public int getMustReturnSize(){
        DmcAttribute attr = mycore.get(MetaDMSAG.__mustReturn);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of return vals that may be returned as part of a
     * particular action response message.
     * @return An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1704)
    public AttributeDefinitionIterableDMW getMayReturn(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__mayReturn);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mayReturn value.
     * @param value A value compatible with AttributeDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1751)
    public DmcAttribute addMayReturn(AttributeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addMayReturn(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of mayReturn values.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1774)
    public int getMayReturnSize(){
        DmcAttribute attr = mycore.get(MetaDMSAG.__mayReturn);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the classes of object to which an action is to be attached. This
     * mechanism allows for the extension of a class's behaviour without having
     * to alter the schema of the class involved. This can be viewed as the
     * auxiliary class equivalent for behaviour.
     * @return An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1704)
    public ClassDefinitionIterableDMW getAttachToClass(){
        DmcAttribute attr = (DmcTypeClassDefinitionREFMV) mycore.get(MetaDMSAG.__attachToClass);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another attachToClass value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1751)
    public DmcAttribute addAttachToClass(ClassDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addAttachToClass(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of attachToClass values.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1774)
    public int getAttachToClassSize(){
        DmcAttribute attr = mycore.get(MetaDMSAG.__attachToClass);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
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
        return(mycore.getBlockWhenLocked());
    }

    /**
     * Sets blockWhenLocked to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1624)
    public void setBlockWhenLocked(Object value) throws DmcValueException {
        mycore.setBlockWhenLocked(value);
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
        return(mycore.getIsGetAction());
    }

    /**
     * Sets isGetAction to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1624)
    public void setIsGetAction(Object value) throws DmcValueException {
        mycore.setIsGetAction(value);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1572)
    public String getObsoleteVersion(){
        return(mycore.getObsoleteVersion());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1624)
    public void setObsoleteVersion(Object value) throws DmcValueException {
        mycore.setObsoleteVersion(value);
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
        return(mycore.getMaySendProgress());
    }

    /**
     * Sets maySendProgress to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1624)
    public void setMaySendProgress(Object value) throws DmcValueException {
        mycore.setMaySendProgress(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    public StringName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
