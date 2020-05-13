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

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.FullyQualifiedName;

import org.dmd.dmr.shared.ldap.generated.types.LDAPHierarchicObjectREF;

import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type LDAPHierarchicObject
 * <P>
 * Generated from the dmrldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeLDAPHierarchicObjectREF extends DmcTypeNamedObjectREF<LDAPHierarchicObjectREF, FullyQualifiedName> {

    public DmcTypeLDAPHierarchicObjectREF(){
    
    }

    public DmcTypeLDAPHierarchicObjectREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected LDAPHierarchicObjectREF getNewHelper(){
        return(new LDAPHierarchicObjectREF());
    }

    @Override
    protected FullyQualifiedName getNewName(){
        return(new FullyQualifiedName());
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

    @Override
    protected LDAPHierarchicObjectREF typeCheck(Object value) throws DmcValueException {
        LDAPHierarchicObjectREF rc = null;

        if (value instanceof LDAPHierarchicObjectREF)
            rc = (LDAPHierarchicObjectREF)value;
        else if (value instanceof LDAPHierarchicObjectDMO)
            rc = new LDAPHierarchicObjectREF((LDAPHierarchicObjectDMO)value);
        else if (value instanceof FullyQualifiedName)
            rc = new LDAPHierarchicObjectREF((FullyQualifiedName)value);
        else if (value instanceof String)
            rc = new LDAPHierarchicObjectREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with LDAPHierarchicObjectREF, LDAPHierarchicObjectDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, LDAPHierarchicObjectREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public LDAPHierarchicObjectREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        LDAPHierarchicObjectREF rc = new LDAPHierarchicObjectREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public LDAPHierarchicObjectREF cloneValue(LDAPHierarchicObjectREF value){
        return(new LDAPHierarchicObjectREF(value));
    }



}
