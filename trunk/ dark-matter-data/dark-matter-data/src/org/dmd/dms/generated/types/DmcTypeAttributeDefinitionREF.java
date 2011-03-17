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
 * The DmcTypeAttributeDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:1799)
 */
@SuppressWarnings("serial")
public class DmcTypeAttributeDefinitionREF extends DmcTypeNamedObjectREF<AttributeDefinitionREF, StringName> {

    /**
     * Default constructor.
     */
    public DmcTypeAttributeDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeAttributeDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected AttributeDefinitionREF getNewHelper(){
        return( new AttributeDefinitionREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( AttributeDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof AttributeDefinitionDMO)
            return(true);
        return(false);
    }

    public DmcTypeAttributeDefinitionREF cloneMe(){
        DmcTypeAttributeDefinitionREF rc = new DmcTypeAttributeDefinitionREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<AttributeDefinitionREF>();
            for(AttributeDefinitionREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeAttributeDefinitionREF getOneOfMe(){
        DmcTypeAttributeDefinitionREF rc = new DmcTypeAttributeDefinitionREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public AttributeDefinitionREF cloneValue(AttributeDefinitionREF val){
        AttributeDefinitionREF rc = new AttributeDefinitionREF(val);
        return(rc);
    }

}