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
package org.dmd.features.extgwt.examples.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.IntegerName;

import org.dmd.features.extgwt.examples.generated.types.MailItemREF;

import org.dmd.features.extgwt.examples.generated.dmo.MailItemDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MailItem
 * <P>
 * Generated from the mail schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:428)
 */
@SuppressWarnings("serial")
public class DmcTypeMailItemREF extends DmcTypeNamedObjectREF<MailItemREF, IntegerName> {

    public DmcTypeMailItemREF(){
    }

    @Override
    protected MailItemREF getNewHelper(){
        return(new MailItemREF());
    }

    @Override
    protected IntegerName getNewName(){
        return(new IntegerName());
    }

    @Override
    protected String getDMOClassName(){
        return( MailItemDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MailItemDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeMailItemREF cloneMe(){
        DmcTypeMailItemREF rc = new DmcTypeMailItemREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<MailItemREF>();
            for(MailItemREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeMailItemREF getOneOfMe(){
        DmcTypeMailItemREF rc = new DmcTypeMailItemREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public MailItemREF cloneValue(MailItemREF val){
        MailItemREF rc = new MailItemREF(val);
        return(rc);
    }



}
