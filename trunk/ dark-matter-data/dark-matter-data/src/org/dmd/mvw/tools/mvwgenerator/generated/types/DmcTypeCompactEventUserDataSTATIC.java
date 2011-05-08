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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.mvw.tools.mvwgenerator.generated.types.CompactEventUserData;    // base type import

/**
 * The DmcTypeCompactEventUserDataSTATIC provides static access to functions used to manage values of type CompactEventUserData
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1697)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1623)
 */
public class DmcTypeCompactEventUserDataSTATIC {
    
    public static DmcTypeCompactEventUserDataSTATIC instance;
    static DmcTypeCompactEventUserDataSV typeHelper;
    
    static {
        instance = new DmcTypeCompactEventUserDataSTATIC();
    }
    
    protected DmcTypeCompactEventUserDataSTATIC() {
        typeHelper = new DmcTypeCompactEventUserDataSV();
    }
    
    public CompactEventUserData typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public CompactEventUserData cloneValue(CompactEventUserData value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, CompactEventUserData value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public CompactEventUserData deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}
