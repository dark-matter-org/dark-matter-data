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
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcNameBuilderIF;
import org.dmd.dmc.types.DmcTypeDmcObjectName;
import org.dmd.dmc.types.IntegerName;    // base type import

/**
 * The DmcTypeIntegerNameSTATIC provides static access to functions used to manage values of type IntegerName
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1764)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1683)
 */
public class DmcTypeIntegerNameSTATIC implements DmcNameBuilderIF {
    
    public static DmcTypeIntegerNameSTATIC instance;
    static DmcTypeIntegerNameSV typeHelper;
    static String    nameClass = "IntegerName";
    static final int attrID    = 100;
    
    static {
        instance = new DmcTypeIntegerNameSTATIC();
    }
    
    protected DmcTypeIntegerNameSTATIC() {
        typeHelper = new DmcTypeIntegerNameSV();
    }
    
    public IntegerName typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public IntegerName cloneValue(IntegerName value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, IntegerName value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public IntegerName deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
    @Override
    public DmcTypeDmcObjectName<?> getNewNameHolder(DmcObjectName name, DmcAttributeInfo ai){
        DmcTypeDmcObjectName<?> rc = typeHelper.getNew(ai);
        try {
            rc.set(name);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Shouldn't throw exception when setting a name attribute value in a DmcNameBuilderIF - occurred for type: " + name.getNameClass(), e));
        }
        return(rc);
    }
    
    @Override
    public String getNameClass(){
    	   return(nameClass);
    }
    
    @Override
    public int getNameAttributeID(){
    	   return(attrID);
    }
    
}

