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
package org.dmd.dms.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmc.types.StringName;
/**
 * The DmcTypeActionDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:1790)
 */
@SuppressWarnings("serial")
public class DmcTypeActionDefinitionREF extends DmcTypeNamedObjectREF<ActionDefinitionREF, StringName> {

    /**
     * Default constructor.
     */
    public DmcTypeActionDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeActionDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ActionDefinitionREF getNewHelper(){
        return( new ActionDefinitionREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( ActionDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ActionDefinitionDMO)
            return(true);
        return(false);
    }

    public DmcTypeActionDefinitionREF cloneMe(){
        DmcTypeActionDefinitionREF rc = new DmcTypeActionDefinitionREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<ActionDefinitionREF>();
            for(ActionDefinitionREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeActionDefinitionREF getOneOfMe(){
        DmcTypeActionDefinitionREF rc = new DmcTypeActionDefinitionREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public ActionDefinitionREF cloneValue(ActionDefinitionREF val){
        ActionDefinitionREF rc = new ActionDefinitionREF(val);
        return(rc);
    }

}
