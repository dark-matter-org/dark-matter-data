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
package org.dmd.dmr.server.ldap.generated.auxw;

import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 4
import org.dmd.dmc.types.DmcTypeString;


/**
 * The LDAPSchemaExtension class is used to extend the basic SchemaDefinition
 * class with information required to map objects onto an LDAP repository.
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.getAuxClassHeader(DMWGenerator.java:886)
 */
public class LDAPSchemaAUX {

    public final static ClassDefinition _auxClass = org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG._LDAPSchemaAUX;
    public final static String _ldapIdPrefix = "ldapIdPrefix";

    /**
     * This method adds the auxiliary class to the wrapped object.
     */
    static public void addAux(DmwWrapper corew) throws DmcValueException {
        if (corew == null)
            return;
        corew.addAux(_auxClass);
    }

    /**
     * This method removes the auxiliary class from the wrapped object.
     */
    static public void removeAux(DmwWrapper corew){
        if (corew == null)
            return;
        corew.removeAux(_auxClass);
    }

    /**
     * This method checks if the object has this auxiliary class.
     */
    static public boolean hasAux(DmwWrapper corew){
        if (corew == null)
            return(false);
        return(corew.hasAux(_auxClass));
    }

    static public String getLdapIdPrefix(DmwWrapper corew){
        DmcTypeString attr = (DmcTypeString) corew.getDmcObject().get(_ldapIdPrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ldapIdPrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    static public void setLdapIdPrefix(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute attr = corew.getDmcObject().get(_ldapIdPrefix);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        corew.getDmcObject().set(_ldapIdPrefix,attr);
    }




}
