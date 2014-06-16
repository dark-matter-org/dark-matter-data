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
package org.dmd.dms.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1837)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1790)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1792)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1814)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1804)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1826)


/**
 * The ActionTriggerInfo class simply provides a common base for the bundle\n
 * of information required to remotely trigger an action on an object. \n
 * Derivatives of this class are generated as part of the DMO generation\n
 * process and have action specific interfaces to handle the parameters \n
 * required by an action.\n <p/>\n This mechanism is a replacement for the
 * concept that ActionRequests were\n EXTENSIBLE objects. This way, the user
 * can ask an object for the \n ActionTriggerInfo (ATI) for a particular
 * action and have a well defined\n interface to specify the parameters for
 * the action.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1847)
 */
@SuppressWarnings("serial")
public class ActionTriggerInfoDMO extends DmcObject implements Serializable {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
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
     * a unique name\n for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace\n characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }


}
