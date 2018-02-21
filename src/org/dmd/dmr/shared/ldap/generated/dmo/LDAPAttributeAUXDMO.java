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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:405)
import org.dmd.dmc.DmcAttribute;                                   // Any attributes - (GenUtility.java:245)
import org.dmd.dmc.DmcAttributeInfo;                               // Auxiliary class - (GenUtility.java:355)
import org.dmd.dmc.DmcObject;                                      // Auxiliary class - (GenUtility.java:354)
import org.dmd.dmc.DmcValueException;                              // Any attributes - (GenUtility.java:246)
import org.dmd.dmr.shared.ldap.generated.dmo.DmrldapDMSAG;         // Attribute from dmrldap schema - (GenUtility.java:132)
import org.dmd.dms.generated.types.DmcTypeStringSV;                // Required type - (GenUtility.java:336)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The LDAPSchemaExtension class is used to extend the basic
 * SchemaDefinition\n class with information required to map objects onto an
 * LDAP repository.
 * <P>
 * Generated from the dmrldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpAUX(DmoFormatter.java:347)
 */
public class LDAPAttributeAUXDMO  {

    public final static String _auxClass = "LDAPAttributeAUX";

    static {
    }
    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:380)
    static private void removeAuxIfRequired(DmcObject core){
        boolean anyLeft = false;

        if (core.get(DmrldapDMSAG.__reposName) != null)
            anyLeft = true;

        if (!anyLeft)
            core.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:398)
    static private void addAuxIfRequired(DmcObject core) throws DmcValueException {
        if (!core.hasAux(_auxClass))
            core.addAux(_auxClass);
    }

    /**
     * Determines if the specified class is in our ocl.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:408)
    static public boolean hasAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return(false);
        return(core.hasAux(_auxClass));
    }

    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:416)
    static private DmcAttribute<?> get(DmcObject core, DmcAttributeInfo ai){
        if (core == null)
            return(null);
        return(core.get(ai));
    }

    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:425)
    static private DmcAttribute<?> set(DmcObject core, DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {
        if (core == null)
            return(null);
        addAuxIfRequired(core);
        return(core.set(ai,attr));
    }

    /**
     * Removes the reposName attribute from the object.
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:872)
    static public DmcAttribute<?> remReposName(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute<?> rc = core.rem(DmrldapDMSAG.__reposName);
        removeAuxIfRequired(core);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:905)
    static public String getReposName(DmcObject core){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(core, DmrldapDMSAG.__reposName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:927)
    static public void setReposName(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(core, DmrldapDMSAG.__reposName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmrldapDMSAG.__reposName);
        
        attr.set(value);
        set(core, DmrldapDMSAG.__reposName,attr);
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:962)
    static public void setReposName(DmcObject core, String value){
        DmcAttribute<?> attr = get(core, DmrldapDMSAG.__reposName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmrldapDMSAG.__reposName);
        
        try {
            attr.set(value);
            set(core, DmrldapDMSAG.__reposName,attr);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Type specific modification shouldn't cause an error.", e));
        }
    }




}
