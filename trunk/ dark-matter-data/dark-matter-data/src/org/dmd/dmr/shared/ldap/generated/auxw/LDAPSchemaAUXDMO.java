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
package org.dmd.dmr.shared.ldap.generated.auxw;

import java.util.*;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 5
import org.dmd.dmc.DmcObject;

/**
 * The LDAPSchemaExtension class is used to extend the basic SchemaDefinition
 * class with information required to map objects onto an LDAP repository.
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:615)
 */
public class LDAPSchemaAUXDMO  {

    public final static String _auxClass = "LDAPSchemaAUX";
    public final static String _ldapIdPrefix = "ldapIdPrefix";

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    static private void removeAuxIfRequired(DmcObject core){
        boolean anyLeft = false;

        if (core.get(_ldapIdPrefix) != null)
            anyLeft = true;

        if (!anyLeft)
            core.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    static private void addAuxIfRequired(DmcObject core) throws DmcValueException {
        if (!core.hasAux(_auxClass))
            core.addAux(_auxClass);
    }

    /**
     * Determines if the specified class is in our ocl.
     */
    static public boolean hasAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return(false);
        return(core.hasAux(_auxClass));
    }

    @SuppressWarnings("unchecked")
    static private DmcAttribute get(DmcObject core, String name){
        if (core == null)
            return(null);
        return(core.get(name));
    }

    @SuppressWarnings("unchecked")
    static private DmcAttribute set(DmcObject core, String attrName, DmcAttribute attr) throws DmcValueException {
        if (core == null)
            return(null);
        addAuxIfRequired(core);
        return(core.set(attrName,attr));
    }

    /**
     * Removes the ldapIdPrefix attribute from the object.
     */
    @SuppressWarnings("unchecked")
    static public DmcAttribute remLdapIdPrefix(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute rc = core.rem(_ldapIdPrefix);
        removeAuxIfRequired(core);
        return(rc);
    }

    static public String getLdapIdPrefix(DmcObject core){
        DmcTypeString attr = (DmcTypeString) get(core, _ldapIdPrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ldapIdPrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    static public void setLdapIdPrefix(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute attr = get(core, _ldapIdPrefix);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(core, _ldapIdPrefix,attr);
    }




}
