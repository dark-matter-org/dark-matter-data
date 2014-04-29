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
package org.dmd.dms.shared.generated.types;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.util.STATICTypeFormatter.dumpSTATICType(STATICTypeFormatter.java:74)
import org.dmd.core.feedback.DMFeedbackSet;                     //  - (STATICTypeFormatter.java:45)
import org.dmd.core.interfaces.DmcInputStreamIF;                //  - (STATICTypeFormatter.java:46)
import org.dmd.core.interfaces.DmcOutputStreamIF;               //  - (STATICTypeFormatter.java:47)
import org.dmd.dms.shared.generated.enums.DataTypeEnum;         // DmcType import - (STATICTypeFormatter.java:71)



/**
 * The DmcTypeDataTypeEnumSTATIC provides static access to functions used to manage values of type DataTypeEnum
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.util.STATICTypeFormatter.dumpSTATICType(STATICTypeFormatter.java:82)
 *    Called from: org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:163)
 */
public class DmcTypeDataTypeEnumSTATIC {
    
    public static DmcTypeDataTypeEnumSTATIC instance;
    static DmcTypeDataTypeEnumSV typeHelper;
    
    static {
        instance = new DmcTypeDataTypeEnumSTATIC();
    }
    
    protected DmcTypeDataTypeEnumSTATIC() {
        typeHelper = new DmcTypeDataTypeEnumSV();
    }
    
    public DataTypeEnum typeCheck(Object value) throws DMFeedbackSet {
    	   return(typeHelper.typeCheck(value));
    }
    
    public DataTypeEnum cloneValue(DataTypeEnum value) throws DMFeedbackSet {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, DataTypeEnum value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public DataTypeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

