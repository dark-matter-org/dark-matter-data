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
 * The DmcTypeSchemaDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:1799)
 */
@SuppressWarnings("serial")
public class DmcTypeSchemaDefinitionREF extends DmcTypeNamedObjectREF<SchemaDefinitionREF, StringName> {

    /**
     * Default constructor.
     */
    public DmcTypeSchemaDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeSchemaDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected SchemaDefinitionREF getNewHelper(){
        return( new SchemaDefinitionREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( SchemaDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof SchemaDefinitionDMO)
            return(true);
        return(false);
    }

    public DmcTypeSchemaDefinitionREF cloneMe(){
        DmcTypeSchemaDefinitionREF rc = new DmcTypeSchemaDefinitionREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<SchemaDefinitionREF>();
            for(SchemaDefinitionREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeSchemaDefinitionREF getOneOfMe(){
        DmcTypeSchemaDefinitionREF rc = new DmcTypeSchemaDefinitionREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public SchemaDefinitionREF cloneValue(SchemaDefinitionREF val){
        SchemaDefinitionREF rc = new SchemaDefinitionREF(val);
        return(rc);
    }

}
