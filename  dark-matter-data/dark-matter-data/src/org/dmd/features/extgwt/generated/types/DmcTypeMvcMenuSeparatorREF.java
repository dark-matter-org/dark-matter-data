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
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.features.extgwt.generated.types.MvcMenuSeparatorREF;

import org.dmd.features.extgwt.generated.dmo.MvcMenuSeparatorDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcMenuSeparator
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:422)
 */
@SuppressWarnings("serial")
public class DmcTypeMvcMenuSeparatorREF extends DmcTypeNamedObjectREF<MvcMenuSeparatorREF> {

    public DmcTypeMvcMenuSeparatorREF(){
    }

    @Override
    protected MvcMenuSeparatorREF getNewHelper(){
        return( new MvcMenuSeparatorREF());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcMenuSeparatorDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcMenuSeparatorDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeMvcMenuSeparatorREF cloneMe(){
        DmcTypeMvcMenuSeparatorREF rc = new DmcTypeMvcMenuSeparatorREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<MvcMenuSeparatorREF>();
            for(MvcMenuSeparatorREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeMvcMenuSeparatorREF getOneOfMe(){
        DmcTypeMvcMenuSeparatorREF rc = new DmcTypeMvcMenuSeparatorREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public MvcMenuSeparatorREF cloneValue(MvcMenuSeparatorREF val){
        MvcMenuSeparatorREF rc = new MvcMenuSeparatorREF(val);
        return(rc);
    }



}
