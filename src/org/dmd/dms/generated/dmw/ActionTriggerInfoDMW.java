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


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1637)
import java.util.*;                                    // To support access functions - (MetaGenerator.java:1610)
import org.dmd.dmc.*;                                  // Basic dark-matter infrastructure - (MetaGenerator.java:1612)
import org.dmd.dmc.types.*;                            // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1611)
import org.dmd.dms.*;                                  // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1618)
import org.dmd.dms.extended.ActionTriggerInfo;         // A hack that should go away!  - (MetaGenerator.java:1632)
import org.dmd.dms.generated.dmo.*;                    // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1614)
import org.dmd.dms.generated.enums.*;                  // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1615)
import org.dmd.dms.generated.types.*;                  // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1616)
import org.dmd.dmw.*;                                  // Base wrapper capabilities - (MetaGenerator.java:1613)
import org.dmd.util.exceptions.*;                      // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1617)

/**
 * The ActionTriggerInfo class simply provides a common base for the bundle\n
 * of information required to remotely trigger an action on an object. \n
 * Derivatives of this class are generated as part of the DMO generation\n
 * process and have action specific interfaces to handle the parameters \n
 * required by an ActionDefinition.\n <p/>\n This mechanism is a replacement
 * for the concept that ActionRequests were\n EXTENSIBLE objects. This way,
 * the user can ask an object for the \n ActionTriggerInfo (ATI) for a
 * particular action and have a well defined\n interface to specify the
 * parameters for the action. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1646)
 */
@SuppressWarnings("unused")
public abstract class ActionTriggerInfoDMW extends DmwWrapper {

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

    @Override
    public void setDmcObject(DmcObject obj) {
        core   = obj;
        mycore = (ActionTriggerInfoDMO) obj;
        obj.setContainer(this);
    }

    public  ActionTriggerInfoDMO getDMO() {
        return(mycore);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2399)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2472)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }


}
