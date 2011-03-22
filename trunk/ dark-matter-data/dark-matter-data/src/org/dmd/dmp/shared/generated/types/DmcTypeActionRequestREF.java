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
package org.dmd.dmp.shared.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.IntegerName;

import org.dmd.dmp.shared.generated.types.ActionRequestREF;

import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ActionRequest
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:468)
 */
@SuppressWarnings("serial")
public class DmcTypeActionRequestREF extends DmcTypeNamedObjectREF<ActionRequestREF, IntegerName> {

    public DmcTypeActionRequestREF(){
    
    }

    public DmcTypeActionRequestREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ActionRequestREF getNewHelper(){
        return(new ActionRequestREF());
    }

    @Override
    protected IntegerName getNewName(){
        return(new IntegerName());
    }

    @Override
    protected String getDMOClassName(){
        return( ActionRequestDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ActionRequestDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeActionRequestREF cloneMe(){
        DmcTypeActionRequestREF rc = new DmcTypeActionRequestREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<ActionRequestREF>();
            for(ActionRequestREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeActionRequestREF getOneOfMe(){
        DmcTypeActionRequestREF rc = new DmcTypeActionRequestREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public ActionRequestREF cloneValue(ActionRequestREF val){
        ActionRequestREF rc = new ActionRequestREF(val);
        return(rc);
    }

    /**
     * Returns the object associated with the name.
     */
    public ActionRequestREF getByKey(Object key){
        
        return(null);
    }



}
