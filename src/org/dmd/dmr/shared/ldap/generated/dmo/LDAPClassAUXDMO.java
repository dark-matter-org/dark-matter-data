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
package org.dmd.dmr.shared.ldap.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:368)
import org.dmd.dmc.DmcAttribute;                                            // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcAttributeInfo;                                        // Auxiliary class - (GenUtility.java:320)
import org.dmd.dmc.DmcObject;                                               // Auxiliary class - (GenUtility.java:319)
import org.dmd.dmc.DmcValueException;                                       // Any attributes - (GenUtility.java:214)
import org.dmd.dmr.shared.ldap.generated.dmo.DmrLdapDMSAG;                  // Attribute from dmr.ldap schema - (GenUtility.java:123)
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                    // Type specific set/add - (GenUtility.java:280)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Attribute from meta schema - (GenUtility.java:126)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                  // Reference type helper class - (GenUtility.java:290)
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;         // Reference type - (GenUtility.java:273)
import org.dmd.dms.generated.types.DmcTypeStringSV;                         // Required type - (GenUtility.java:301)

/**
 * The LDAPSchemaExtension class is used to extend the basic SchemaDefinition
 * class with information required to map objects onto an LDAP repository.
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpAUX(DmoFormatter.java:346)
 */
public class LDAPClassAUXDMO  {

    public final static String _auxClass = "LDAPClassAUX";

    static {
    }
    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:379)
    static private void removeAuxIfRequired(DmcObject core){
        boolean anyLeft = false;

        if (core.get(DmrLdapDMSAG.__reposName) != null)
            anyLeft = true;
        if (core.get(MetaDMSAG.__namingAttribute) != null)
            anyLeft = true;

        if (!anyLeft)
            core.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:397)
    static private void addAuxIfRequired(DmcObject core) throws DmcValueException {
        if (!core.hasAux(_auxClass))
            core.addAux(_auxClass);
    }

    /**
     * Determines if the specified class is in our ocl.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:407)
    static public boolean hasAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return(false);
        return(core.hasAux(_auxClass));
    }

    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:415)
    static private DmcAttribute<?> get(DmcObject core, DmcAttributeInfo ai){
        if (core == null)
            return(null);
        return(core.get(ai));
    }

    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:424)
    static private DmcAttribute<?> set(DmcObject core, DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {
        if (core == null)
            return(null);
        addAuxIfRequired(core);
        return(core.set(ai,attr));
    }

    /**
     * Removes the reposName attribute from the object.
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:856)
    static public DmcAttribute<?> remReposName(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute<?> rc = core.rem(DmrLdapDMSAG.__reposName);
        removeAuxIfRequired(core);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:889)
    static public String getReposName(DmcObject core){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(core, DmrLdapDMSAG.__reposName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:911)
    static public void setReposName(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(core, DmrLdapDMSAG.__reposName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmrLdapDMSAG.__reposName);
        
        attr.set(value);
        set(core, DmrLdapDMSAG.__reposName,attr);
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:946)
    static public void setReposName(DmcObject core, String value){
        DmcAttribute<?> attr = get(core, DmrLdapDMSAG.__reposName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmrLdapDMSAG.__reposName);
        
        try {
            attr.set(value);
            set(core, DmrLdapDMSAG.__reposName,attr);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Type specific modification shouldn't cause an error.", e));
        }
    }

    /**
     * Removes the namingAttribute attribute from the object.
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:856)
    static public DmcAttribute<?> remNamingAttribute(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute<?> rc = core.rem(MetaDMSAG.__namingAttribute);
        removeAuxIfRequired(core);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:874)
    static public AttributeDefinitionREF getNamingAttribute(DmcObject core){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(core, MetaDMSAG.__namingAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets namingAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:911)
    static public void setNamingAttribute(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(core, MetaDMSAG.__namingAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__namingAttribute);
        
        attr.set(value);
        set(core, MetaDMSAG.__namingAttribute,attr);
    }

    /**
     * Sets namingAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:927)
    static public void setNamingAttribute(DmcObject core, AttributeDefinitionDMO value){
        DmcAttribute<?> attr = get(core, MetaDMSAG.__namingAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__namingAttribute);
        
        try {
            attr.set(value);
            set(core, MetaDMSAG.__namingAttribute,attr);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Type specific modification shouldn't cause an error.", e));
        }
    }




}
