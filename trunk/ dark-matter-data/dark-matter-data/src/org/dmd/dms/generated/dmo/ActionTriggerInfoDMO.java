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
 * The ActionTriggerInfo class simply provides a common base for the bundle
 * of information required to remotely trigger an action on an object. 
 * Derivatives of this class are generated as part of the DMO generation
 * process and have action specific interfaces to handle the parameters 
 * required by an action. <P> This mechanism is a replacement for the concept
 * that ActionRequests were EXTENSIBLE objects. This way, the user can ask an
 * object for the  ActionTriggerInfo (ATI) for a particular action and have a
 * well defined interface to specify the parameters for the action.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1171)
 */
@SuppressWarnings("serial")
public class ActionTriggerInfoDMO extends org.dmd.dms.generated.dmo.DmwWrapperDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __objectClass = new DmcAttributeInfo("objectClass",1,"ClassDefinition",ValueTypeEnum.MULTI,true);


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__objectClass.id,__objectClass);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__objectClass.name,__objectClass);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String ,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }


    public ActionTriggerInfoDMO(){
        super("ActionTriggerInfo");
    }

    public ActionTriggerInfoDMO(String oc){
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
    public ActionTriggerInfoDMO getNew(){
        ActionTriggerInfoDMO rc = new ActionTriggerInfoDMO();
        return(rc);
    }

    @Override
    public ActionTriggerInfoDMO getSlice(DmcSliceInfo info){
        ActionTriggerInfoDMO rc = new ActionTriggerInfoDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1516)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1562)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1648)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1698)
    public DmcAttribute addObjectClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__objectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__objectClass);
        
        attr.add(value);
        add(__objectClass,attr);
        return(attr);
    }


}
