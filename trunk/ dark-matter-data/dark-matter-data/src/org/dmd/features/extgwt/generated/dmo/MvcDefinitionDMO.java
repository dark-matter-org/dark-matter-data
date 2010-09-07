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
// import 3 Integer
import org.dmd.dmc.types.DmcTypeInteger;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 5
import org.dmd.dmc.DmcObject;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The MvcDefinition class provide a common base for all MVC definition
 * classes.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:380)
 */
abstract public class MvcDefinitionDMO  extends DmcObject  implements DmcNamedObjectIF  {

    public final static String _file = "file";
    public final static String _lineNumber = "lineNumber";
    public final static String _name = "name";

    public MvcDefinitionDMO() {
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcDefinitionDMO){
            return( getObjectName().equals( ((MvcDefinitionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public String getFile(){
        DmcTypeString attr = (DmcTypeString) get(_file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute attr = get(_file);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_file,attr);
    }

    public Integer getLineNumber(){
        DmcTypeInteger attr = (DmcTypeInteger) get(_lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    @SuppressWarnings("unchecked")
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute attr = get(_lineNumber);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(_lineNumber,attr);
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




}
