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
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:451)
 */
public class LDAPAttributeAUXDMO  {

    public final static String _auxClass = "LDAPAttributeAUX";
    public final static String _reposName = "reposName";

    /**
     * This method adds the auxiliary class name to the wrapped object if it doesn't already exist.
     */
    static public void addAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return;
        core.addAux(_auxClass);
    }

    /**
     * This method removes the auxiliary class name from the wrapped object.
     */
    static public void removeAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return;
        core.removeAux(_auxClass);
    }

    /**
     * Determines if the specified class is in our ocl.
     */
    static public void hasAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return;
        core.removeAux(_auxClass);
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
        return(core.set(attrName,attr));
    }

    static public String getReposName(DmcObject core){
        DmcTypeString attr = (DmcTypeString) get(core, _reposName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    static public void setReposName(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute attr = get(core, _reposName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(core, _reposName,attr);
    }




}
