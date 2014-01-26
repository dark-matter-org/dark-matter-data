//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpAUX(BaseDMWGenerator.java:782)
import org.dmd.dmc.*;                                       // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.ClassDefinition;                         // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.enums.DataTypeEnum;            // For AUX base functionality - (BaseDMWGenerator.java:780)
import org.dmd.dms.generated.enums.ValueTypeEnum;           // For AUX base functionality - (BaseDMWGenerator.java:779)
import org.dmd.dms.generated.types.DmcTypeStringSV;         // Type in an auxiliary class - (BaseDMWGenerator.java:1153)
import org.dmd.dmw.DmwWrapper;                              // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * The LDAPSchemaExtension class is used to extend the basic
 * SchemaDefinition\n class with information required to map objects onto an
 * LDAP repository.
 * <P>
 * Generated from the dmrldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpAUX(BaseDMWGenerator.java:784)
 */
public class LDAPSchemaAUX {

    public final static ClassDefinition _auxClass = org.dmd.dmr.server.ldap.generated.DmrldapSchemaAG._LDAPSchemaAUX;
    public final static DmcAttributeInfo __ldapIdPrefix = new DmcAttributeInfo("ldapIdPrefix",450,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2713)
    static private void removeAuxIfRequired(DmwWrapper corew){
        boolean anyLeft = false;

        if (corew.getDmcObject().get(__ldapIdPrefix) != null)
            anyLeft = true;

        if (!anyLeft)
            corew.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2731)
    static private void addAuxIfRequired(DmwWrapper corew) throws DmcValueException {
        if (!corew.hasAux(_auxClass))
            corew.addAux(_auxClass);
    }

    /**
     * This method checks if the object has this auxiliary class.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2741)
    static public boolean hasAux(DmwWrapper corew){
        if (corew == null)
            return(false);
        return(corew.hasAux(_auxClass));
    }

    /**
     * Removes the ldapIdPrefix attribute from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2836)
    static public DmcAttribute<?> remLdapIdPrefix(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__ldapIdPrefix);
        removeAuxIfRequired(corew);
        return(rc);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2867)
    static public String getLdapIdPrefix(DmwWrapper corew){
        DmcTypeStringSV attr = (DmcTypeStringSV) corew.getDmcObject().get(__ldapIdPrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ldapIdPrefix to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2907)
    static public void setLdapIdPrefix(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute<?> attr = corew.getDmcObject().get(__ldapIdPrefix);
        if (attr == null){
            attr = new DmcTypeStringSV();
            addAuxIfRequired(corew);
        }
        
        attr.set(value);
        corew.getDmcObject().set(__ldapIdPrefix,attr);
    }




}
