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
package org.dmd.dmr.server.ldap.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 9
import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;

public class LDAPHierarchicObjectDMW extends DmwWrapper implements DmcNamedObjectIF {

    private LDAPHierarchicObjectDMO mycore;

    public LDAPHierarchicObjectDMW() {
        super(new LDAPHierarchicObjectDMO(), org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG._LDAPHierarchicObject);
        mycore = (LDAPHierarchicObjectDMO) core;
        mycore.setContainer(this);
    }

    public LDAPHierarchicObjectDMW(LDAPHierarchicObjectDMO obj) {
        super(obj, org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG._LDAPHierarchicObject);
        mycore = (LDAPHierarchicObjectDMO) core;
        mycore.setContainer(this);
    }

    protected LDAPHierarchicObjectDMW(LDAPHierarchicObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (LDAPHierarchicObjectDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmr.server.ldap.extended.LDAPHierarchicObject>());
    }

    public String getObjectName(){
        return(mycore.getFQN());
    }

    public boolean equals(Object obj){
        if (obj instanceof LDAPHierarchicObjectDMW){
            return( getObjectName().equals( ((LDAPHierarchicObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public String getParentFQN(){
        return(mycore.getParentFQN());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setParentFQN(Object value) throws DmcValueException {
        mycore.setParentFQN(value);
    }

    public Integer getLineNumber(){
        return(mycore.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    public void setLineNumber(Object value) throws DmcValueException {
        mycore.setLineNumber(value);
    }

    public String getFile(){
        return(mycore.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFile(Object value) throws DmcValueException {
        mycore.setFile(value);
    }

    public String getFQN(){
        return(mycore.getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFQN(Object value) throws DmcValueException {
        mycore.setFQN(value);
    }


}
