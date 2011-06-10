//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.types.IntegerToUUIDLite;    // base type import

/**
 * The DmcTypeIntegerToUUIDLiteSTATIC provides static access to functions used to manage values of type IntegerToUUIDLite
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1698)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1624)
 */
public class DmcTypeIntegerToUUIDLiteSTATIC {
    
    public static DmcTypeIntegerToUUIDLiteSTATIC instance;
    static DmcTypeIntegerToUUIDLiteSV typeHelper;
    
    static {
        instance = new DmcTypeIntegerToUUIDLiteSTATIC();
    }
    
    protected DmcTypeIntegerToUUIDLiteSTATIC() {
        typeHelper = new DmcTypeIntegerToUUIDLiteSV();
    }
    
    public IntegerToUUIDLite typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public IntegerToUUIDLite cloneValue(IntegerToUUIDLite value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, IntegerToUUIDLite value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public IntegerToUUIDLite deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

