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
package org.dmd.dmr.shared.ldap.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmr.shared.ldap.generated.types.LDAPHierarchicObjectREF;

import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type LDAPHierarchicObject
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:428)
 */
@SuppressWarnings("serial")
public class DmcTypeLDAPHierarchicObjectREF extends DmcTypeNamedObjectREF<LDAPHierarchicObjectREF, StringName> {

    public DmcTypeLDAPHierarchicObjectREF(){
    }

    @Override
    protected LDAPHierarchicObjectREF getNewHelper(){
        return(new LDAPHierarchicObjectREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( LDAPHierarchicObjectDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof LDAPHierarchicObjectDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeLDAPHierarchicObjectREF cloneMe(){
        DmcTypeLDAPHierarchicObjectREF rc = new DmcTypeLDAPHierarchicObjectREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<LDAPHierarchicObjectREF>();
            for(LDAPHierarchicObjectREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeLDAPHierarchicObjectREF getOneOfMe(){
        DmcTypeLDAPHierarchicObjectREF rc = new DmcTypeLDAPHierarchicObjectREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public LDAPHierarchicObjectREF cloneValue(LDAPHierarchicObjectREF val){
        LDAPHierarchicObjectREF rc = new LDAPHierarchicObjectREF(val);
        return(rc);
    }



}
