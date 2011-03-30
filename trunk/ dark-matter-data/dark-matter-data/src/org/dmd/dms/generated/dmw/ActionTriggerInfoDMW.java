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
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;
import org.dmd.dms.extended.ActionTriggerInfo;

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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:830)
 */
@SuppressWarnings("unused")
public abstract class ActionTriggerInfoDMW extends org.dmd.dms.DmwWrapper {

    private ActionTriggerInfoDMO mycore;

    protected ActionTriggerInfoDMW() {
        super(new ActionTriggerInfoDMO());
        mycore = (ActionTriggerInfoDMO) core;
        mycore.setContainer(this);
    }

    protected ActionTriggerInfoDMW(DmcObject obj) {
        super(obj);
        mycore = (ActionTriggerInfoDMO) core;
        mycore.setContainer(this);
    }

    protected ActionTriggerInfoDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ActionTriggerInfoDMO) core;
        mycore.setContainer(this);
    }

    public  ActionTriggerInfoDMO getDMO() {
        return(mycore);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1354)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1406)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }


}
