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

import java.util.*;

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
 * The MvcEvent class allows for the definition of events that are  handled
 * or emitted by Views and Controllers. By providing a description, you help
 * to document your application.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:380)
 */
public class MvcEventDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    public final static String _description = "description";
    public final static String _emittedBy = "emittedBy";
    public final static String _userDataType = "userDataType";
    public final static String _camelCaseName = "camelCaseName";
    public final static String _upperConstantName = "upperConstantName";
    public final static String _name = "name";
    public final static String _definedBy = "definedBy";

    public MvcEventDMO() {
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcEventDMO){
            return( getObjectName().equals( ((MvcEventDMO) obj).getObjectName()) );
        }
        return(false);
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

    /**
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getEmittedBy(){
        DmcTypeString attr = (DmcTypeString) get(_emittedBy);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another emittedBy value.
     * @param value A value compatible with String
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addEmittedBy(Object value) throws DmcValueException {
        DmcAttribute attr = get(_emittedBy);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.add(value);
        add(_emittedBy,attr);
        return(attr);
    }

    /**
     * Deletes a emittedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delEmittedBy(Object value){
        try{
            del(_emittedBy, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getUserDataType(){
        DmcTypeString attr = (DmcTypeString) get(_userDataType);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another userDataType value.
     * @param value A value compatible with String
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addUserDataType(Object value) throws DmcValueException {
        DmcAttribute attr = get(_userDataType);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.add(value);
        add(_userDataType,attr);
        return(attr);
    }

    /**
     * Deletes a userDataType value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delUserDataType(Object value){
        try{
            del(_userDataType, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
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

    public String getUpperConstantName(){
        DmcTypeString attr = (DmcTypeString) get(_upperConstantName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets upperConstantName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUpperConstantName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_upperConstantName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_upperConstantName,attr);
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

    /**
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getDefinedBy(){
        DmcTypeString attr = (DmcTypeString) get(_definedBy);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another definedBy value.
     * @param value A value compatible with String
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinedBy(Object value) throws DmcValueException {
        DmcAttribute attr = get(_definedBy);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.add(value);
        add(_definedBy,attr);
        return(attr);
    }

    /**
     * Deletes a definedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delDefinedBy(Object value){
        try{
            del(_definedBy, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }




}
