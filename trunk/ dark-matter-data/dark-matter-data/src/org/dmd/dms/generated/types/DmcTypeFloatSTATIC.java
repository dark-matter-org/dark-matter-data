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

/**
 * The DmcTypeFloatSTATIC provides static access to functions used to manage values of type Float
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1450)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1389)
 */
public class DmcTypeFloatSTATIC {
    
    static DmcTypeFloatSV instance;
    
    static public Float typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeFloatSV();
    	   return(instance.typeCheck(value));
    }
    
    static public Float cloneValueSTATIC(Float value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeFloatSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, Float value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeFloatSV();
    	instance.serializeValue(dos, value);
    }
    
    static public Float deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeFloatSV();
    	return(instance.deserializeValue(dis));
    }
    
}

