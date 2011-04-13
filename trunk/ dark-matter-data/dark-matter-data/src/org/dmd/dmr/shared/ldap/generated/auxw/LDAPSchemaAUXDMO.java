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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:270)
import java.util.*;                                           // Always required
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                          // Always required
import org.dmd.dmc.DmcObject;                                 // Auxiliary class
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type

/**
 * The LDAPSchemaExtension class is used to extend the basic SchemaDefinition
 * class with information required to map objects onto an LDAP repository.
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpAUX(DmoFormatter.java:285)
 */
public class LDAPSchemaAUXDMO  {

    public final static String _auxClass = "LDAPSchemaAUX";
    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __ldapIdPrefix = new DmcAttributeInfo("ldapIdPrefix",450,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__ldapIdPrefix.id,__ldapIdPrefix);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__ldapIdPrefix.name,__ldapIdPrefix);
    }

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:310)
    static private void removeAuxIfRequired(DmcObject core){
        boolean anyLeft = false;

        if (core.get(__ldapIdPrefix) != null)
            anyLeft = true;

        if (!anyLeft)
            core.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:328)
    static private void addAuxIfRequired(DmcObject core) throws DmcValueException {
        if (!core.hasAux(_auxClass))
            core.addAux(_auxClass);
    }

    /**
     * Determines if the specified class is in our ocl.
     */
    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:338)
    static public boolean hasAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return(false);
        return(core.hasAux(_auxClass));
    }

    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:346)
    static private DmcAttribute<?> get(DmcObject core, DmcAttributeInfo ai){
        if (core == null)
            return(null);
        return(core.get(ai));
    }

    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:355)
    static private DmcAttribute<?> set(DmcObject core, DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {
        if (core == null)
            return(null);
        addAuxIfRequired(core);
        return(core.set(ai,attr));
    }

    /**
     * Removes the ldapIdPrefix attribute from the object.
     */
    //  org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:764)
    static public DmcAttribute<?> remLdapIdPrefix(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute<?> rc = core.rem(__ldapIdPrefix);
        removeAuxIfRequired(core);
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:797)
    static public String getLdapIdPrefix(DmcObject core){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(core, __ldapIdPrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ldapIdPrefix to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:819)
    static public void setLdapIdPrefix(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(core, __ldapIdPrefix);
        if (attr == null)
            attr = new DmcTypeStringSV(__ldapIdPrefix);
        
        attr.set(value);
        set(core, __ldapIdPrefix,attr);
    }

    /**
     * Sets ldapIdPrefix to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:854)
    static public void setLdapIdPrefix(DmcObject core, String value){
        DmcAttribute<?> attr = get(core, __ldapIdPrefix);
        if (attr == null)
            attr = new DmcTypeStringSV(__ldapIdPrefix);
        
        try {
            attr.set(value);
            set(core, __ldapIdPrefix,attr);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Type specific modification shouldn't cause an error.", e));
        }
    }




}
