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
package org.dmd.dmr.ldap.generated.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREF;
import org.dmd.dms.generated.types.AttributeDefinitionREF;
import org.dmd.dmc.types.DmcTypeString;

import org.dmd.dmc.DmcObject;

/**
 * The LDAPSchemaExtension class is used to extend the basic SchemaDefinition
 * class with information required to map objects onto an LDAP repository.
 * <P>
 * Generated from the dmrldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:346)
 */
public class LDAPClassExtensionAUX  {

    DmcObject core;

    public final static String _reposName = "reposName";
    public final static String _namingAttribute = "namingAttribute";

    public LDAPClassExtensionAUX() {
        core = null;
    }

    public LDAPClassExtensionAUX(DmcObject obj) {
        core = obj;
    }

    public void wrap(DmcObject obj) {
        core = obj;
    }

    @SuppressWarnings("unchecked")
    private DmcAttribute get(String name){
        if (core == null)
            return(null);
        return(core.get(name));
    }

    @SuppressWarnings("unchecked")
    private DmcAttribute set(String attrName, DmcAttribute attr) throws DmcValueException {
        if (core == null)
            return(null);
        return(core.set(attrName,attr));
    }

    public String getReposName(){
        DmcTypeString attr = (DmcTypeString) get(_reposName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setReposName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_reposName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_reposName,attr);
    }

    public AttributeDefinitionREF getNamingAttribute(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_namingAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets namingAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setNamingAttribute(Object value) throws DmcValueException {
        DmcAttribute attr = get(_namingAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.set(value);
        set(_namingAttribute,attr);
    }




}
