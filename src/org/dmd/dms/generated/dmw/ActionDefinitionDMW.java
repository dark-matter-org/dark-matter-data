//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
import org.dmd.dmc.definitions.DmcDefinitionIF;

/**
 * This class is used to define the actions that may be triggered on\n an
 * object. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1643)
 */
@SuppressWarnings("unused")
public class ActionDefinitionDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

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
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2390)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2463)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2599)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2613)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DmcValueException e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2679)
    public void addDescription(Object value) throws DmcValueException {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2692)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of parameters that an action MUST have. When\n accessed
     * in Java, this is a set of references to AttributeDefinition objects. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public AttributeDefinitionIterableDMW getMustParm(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__mustParm);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mustParm value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public DmcAttribute<?> addMustParm(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMustParm(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of mustParm values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2692)
    public int getMustParmSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__mustParm);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of parameters that an action MAY have. When accessed\n
     * in Java, this is a set of references to AttributeDefinition objects. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public AttributeDefinitionIterableDMW getMayParm(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__mayParm);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mayParm value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public DmcAttribute<?> addMayParm(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMayParm(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of mayParm values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2692)
    public int getMayParmSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__mayParm);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of return vals that must be returned as part of a\n
     * particular action response message. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public AttributeDefinitionIterableDMW getMustReturn(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__mustReturn);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mustReturn value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public DmcAttribute<?> addMustReturn(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMustReturn(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of mustReturn values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2692)
    public int getMustReturnSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__mustReturn);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of return vals that may be returned as part of a\n
     * particular action response message. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public AttributeDefinitionIterableDMW getMayReturn(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__mayReturn);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mayReturn value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public DmcAttribute<?> addMayReturn(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMayReturn(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of mayReturn values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2692)
    public int getMayReturnSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__mayReturn);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the classes of object to which an action is to be attached.\n
     * This mechanism allows for the extension of a class's behaviour without
     * having\n to alter the schema of the class involved. This can be viewed as
     * the auxiliary\n class equivalent for behaviour. 
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public ClassDefinitionIterableDMW getAttachToClass(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) mycore.get(MetaDMSAG.__attachToClass);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another attachToClass value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public DmcAttribute<?> addAttachToClass(ClassDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addAttachToClass(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of attachToClass values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2692)
    public int getAttachToClassSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__attachToClass);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * This flag indicates if an Action is merely a data retrieval (get)
     * Action.\n Actions that are flagged with this attribute set to true will be
     * executable\n even when the server is in a read-only mode because they
     * don't actually\n alter data. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2390)
    public Boolean getIsGetAction(){
        return(mycore.getIsGetAction());
    }

    /**
     * Sets isGetAction to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2463)
    public void setIsGetAction(Object value) throws DmcValueException {
        mycore.setIsGetAction(value);
    }

    /**
     * This indicates the version at which something became obsolete.\n Generally
     * speaking you shouldn't ever delete definitions for products that have\n
     * been released to the field, this may break backwards compatibility.
     * Instead, you\n should mark them as obsolete. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2390)
    public String getObsoleteVersion(){
        return(mycore.getObsoleteVersion());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2463)
    public void setObsoleteVersion(Object value) throws DmcValueException {
        mycore.setObsoleteVersion(value);
    }

    /**
     * This flag is used to indicate if a particular request might\n result in
     * progress indications being sent. Although primarily intended as a\n
     * documentation aspect, this flag is used within the TL1 subsystem to allow
     * for\n the creation of a response handler for node requests that send
     * progress text. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2390)
    public Boolean getMaySendProgress(){
        return(mycore.getMaySendProgress());
    }

    /**
     * Sets maySendProgress to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2463)
    public void setMaySendProgress(Object value) throws DmcValueException {
        mycore.setMaySendProgress(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1804)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
