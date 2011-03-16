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
package org.dmd.features.extgwt.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.features.extgwt.generated.types.MvcEventREF;

import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcEvent
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:439)
 */
@SuppressWarnings("serial")
public class DmcTypeMvcEventREF extends DmcTypeNamedObjectREF<MvcEventREF, StringName> {

    public DmcTypeMvcEventREF(){
    
    }

    public DmcTypeMvcEventREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvcEventREF getNewHelper(){
        return(new MvcEventREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcEventDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcEventDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeMvcEventREF cloneMe(){
        DmcTypeMvcEventREF rc = new DmcTypeMvcEventREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<MvcEventREF>();
            for(MvcEventREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeMvcEventREF getOneOfMe(){
        DmcTypeMvcEventREF rc = new DmcTypeMvcEventREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public MvcEventREF cloneValue(MvcEventREF val){
        MvcEventREF rc = new MvcEventREF(val);
        return(rc);
    }



}
