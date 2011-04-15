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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:272)
import java.util.*;                                         // Always required
import org.dmd.dmc.DmcAttribute;                            // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                        // Always required
import org.dmd.dmc.DmcObject;                               // Auxiliary class
import org.dmd.dmc.DmcValueException;                       // Any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;           // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeStringSV;         // Required type

/**
 * The LDAPSchemaExtension class is used to extend the basic SchemaDefinition
 * class with information required to map objects onto an LDAP repository.
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpAUX(DmoFormatter.java:283)
 */
public class LDAPAttributeAUXDMO  {

    public final static String _auxClass = "LDAPAttributeAUX";
    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __reposName = new DmcAttributeInfo("reposName",451,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__reposName.id,__reposName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__reposName.name,__reposName);
    }

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:308)
    static private void removeAuxIfRequired(DmcObject core){
        boolean anyLeft = false;

        if (core.get(__reposName) != null)
            anyLeft = true;

        if (!anyLeft)
            core.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:326)
    static private void addAuxIfRequired(DmcObject core) throws DmcValueException {
        if (!core.hasAux(_auxClass))
            core.addAux(_auxClass);
    }

    /**
     * Determines if the specified class is in our ocl.
     */
    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:336)
    static public boolean hasAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return(false);
        return(core.hasAux(_auxClass));
    }

    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:344)
    static private DmcAttribute<?> get(DmcObject core, DmcAttributeInfo ai){
        if (core == null)
            return(null);
        return(core.get(ai));
    }

    //  org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:353)
    static private DmcAttribute<?> set(DmcObject core, DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {
        if (core == null)
            return(null);
        addAuxIfRequired(core);
        return(core.set(ai,attr));
    }

    /**
     * Removes the reposName attribute from the object.
     */
    //  org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:762)
    static public DmcAttribute<?> remReposName(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute<?> rc = core.rem(__reposName);
        removeAuxIfRequired(core);
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:795)
    static public String getReposName(DmcObject core){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(core, __reposName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:817)
    static public void setReposName(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(core, __reposName);
        if (attr == null)
            attr = new DmcTypeStringSV(__reposName);
        
        attr.set(value);
        set(core, __reposName,attr);
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:852)
    static public void setReposName(DmcObject core, String value){
        DmcAttribute<?> attr = get(core, __reposName);
        if (attr == null)
            attr = new DmcTypeStringSV(__reposName);
        
        try {
            attr.set(value);
            set(core, __reposName,attr);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Type specific modification shouldn't cause an error.", e));
        }
    }




}
