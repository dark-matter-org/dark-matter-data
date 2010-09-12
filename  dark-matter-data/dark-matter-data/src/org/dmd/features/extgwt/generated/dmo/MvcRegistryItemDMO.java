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
package org.dmd.features.extgwt.generated.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The MvcRegistryItem defines something that's stored in the Registry.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:380)
 */
public class MvcRegistryItemDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    public final static String _userDataCollection = "userDataCollection";
    public final static String _userDataGenericSpec = "userDataGenericSpec";
    public final static String _description = "description";
    public final static String _camelCaseName = "camelCaseName";
    public final static String _name = "name";
    public final static String _userDataType = "userDataType";

    public MvcRegistryItemDMO() {
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcRegistryItemDMO){
            return( getObjectName().equals( ((MvcRegistryItemDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public String getUserDataCollection(){
        DmcTypeString attr = (DmcTypeString) get(_userDataCollection);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUserDataCollection(Object value) throws DmcValueException {
        DmcAttribute attr = get(_userDataCollection);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_userDataCollection,attr);
    }

    public String getUserDataGenericSpec(){
        DmcTypeString attr = (DmcTypeString) get(_userDataGenericSpec);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        DmcAttribute attr = get(_userDataGenericSpec);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_userDataGenericSpec,attr);
    }

    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(_description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(_description);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_description,attr);
    }

    public String getCamelCaseName(){
        DmcTypeString attr = (DmcTypeString) get(_camelCaseName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setCamelCaseName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_camelCaseName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_camelCaseName,attr);
    }

    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    public String getUserDataType(){
        DmcTypeString attr = (DmcTypeString) get(_userDataType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUserDataType(Object value) throws DmcValueException {
        DmcAttribute attr = get(_userDataType);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_userDataType,attr);
    }




}
