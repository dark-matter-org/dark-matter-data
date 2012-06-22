//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcAttribute;
@SuppressWarnings("serial")
/**
 * The DmcTypeDmwTypeToWrapperType class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:2989)
 *    Called from: Called from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:2608)
 */
abstract public class DmcTypeDmwTypeToWrapperType extends DmcAttribute<DmwTypeToWrapperType> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDmwTypeToWrapperType(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDmwTypeToWrapperType(DmcAttributeInfo ai){
        super(ai);
    }

    protected DmwTypeToWrapperType typeCheck(Object value) throws DmcValueException {
        DmwTypeToWrapperType rc = null;

        if (value instanceof DmwTypeToWrapperType){
            rc = (DmwTypeToWrapperType)value;
        }
        else if (value instanceof String){
            rc = new DmwTypeToWrapperType((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmwTypeToWrapperType expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public DmwTypeToWrapperType cloneValue(DmwTypeToWrapperType val){
        return(new DmwTypeToWrapperType(val));
    }

    /**
     * Writes a DmwTypeToWrapperType.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, DmwTypeToWrapperType value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a DmwTypeToWrapperType.
     */
    @Override
    public DmwTypeToWrapperType deserializeValue(DmcInputStreamIF dis) throws Exception {
        DmwTypeToWrapperType rc = new DmwTypeToWrapperType();
        rc.deserializeIt(dis);
        return(rc);
    }



}
