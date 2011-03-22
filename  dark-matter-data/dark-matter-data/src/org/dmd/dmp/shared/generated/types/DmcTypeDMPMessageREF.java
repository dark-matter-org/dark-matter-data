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

import org.dmd.dmp.shared.generated.types.DMPMessageREF;

import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;

/**
 * This is the generated DmcAttribute derivative for values of type DMPMessage
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:472)
 */
@SuppressWarnings("serial")
public class DmcTypeDMPMessageREF extends DmcTypeNamedObjectREF<DMPMessageREF, IntegerName> {

    public DmcTypeDMPMessageREF(){
    
    }

    public DmcTypeDMPMessageREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected DMPMessageREF getNewHelper(){
        return(new DMPMessageREF());
    }

    @Override
    protected IntegerName getNewName(){
        return(new IntegerName());
    }

    @Override
    protected String getDMOClassName(){
        return( DMPMessageDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof DMPMessageDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeDMPMessageREF cloneMe(){
        DmcTypeDMPMessageREF rc = new DmcTypeDMPMessageREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<DMPMessageREF>();
            for(DMPMessageREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeDMPMessageREF getOneOfMe(){
        DmcTypeDMPMessageREF rc = new DmcTypeDMPMessageREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public DMPMessageREF cloneValue(DMPMessageREF val){
        DMPMessageREF rc = new DMPMessageREF(val);
        return(rc);
    }

    /**
     * Returns the object associated with the name.
     */
    public DMPMessageREF getByKey(Object key){
        
        return(null);
    }



}
