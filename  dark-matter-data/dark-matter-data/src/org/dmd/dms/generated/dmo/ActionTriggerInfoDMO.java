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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1023)
 */
@SuppressWarnings({"unused", "serial"})
public class ActionTriggerInfoDMO extends org.dmd.dms.generated.dmo.DmwWrapperDMO {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
    }


    public ActionTriggerInfoDMO(){
        super("ActionTriggerInfo",_ImAp,_SmAp);
    }

    public ActionTriggerInfoDMO(String oc){
        super(oc);
    }

    public ActionTriggerInfoDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    @Override
    public ActionTriggerInfoDMO getOneOfMe(){
        ActionTriggerInfoDMO rc = new ActionTriggerInfoDMO();
        return(rc);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(__name);
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
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__name,attr);
    }


}
