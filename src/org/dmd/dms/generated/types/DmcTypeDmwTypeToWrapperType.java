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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3091)
import java.io.Serializable;                  // Marker interface for serialization - (GenUtility.java:3073)
import org.dmd.dmc.DmcAttribute;              // Derivation base - (GenUtility.java:3089)
import org.dmd.dmc.DmcAttributeInfo;          // Constructor support - (GenUtility.java:3077)
import org.dmd.dmc.DmcInputStreamIF;          // To support serialization - (GenUtility.java:3074)
import org.dmd.dmc.DmcOutputStreamIF;         // To support serialization - (GenUtility.java:3075)
import org.dmd.dmc.DmcValueException;         // Type checking - (GenUtility.java:3078)



@SuppressWarnings("serial")
/**
 * The DmcTypeDmwTypeToWrapperType class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3098)
 *    Called from: Called from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3382)
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
