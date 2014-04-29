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
import org.dmd.core.DmcObjectName;                            //  - (STATICTypeFormatter.java:51)
import org.dmd.core.feedback.DMFeedbackSet;                   //  - (STATICTypeFormatter.java:45)
import org.dmd.core.interfaces.DmcInputStreamIF;              //  - (STATICTypeFormatter.java:46)
import org.dmd.core.interfaces.DmcNameBuilderIF;              //  - (STATICTypeFormatter.java:52)
import org.dmd.core.interfaces.DmcOutputStreamIF;             //  - (STATICTypeFormatter.java:47)
import org.dmd.core.schema.DmcAttributeInfo;                  //  - (STATICTypeFormatter.java:50)
import org.dmd.dms.shared.types.DmcTypeDmcObjectName;         //  - (STATICTypeFormatter.java:53)
import org.dmd.dms.shared.types.IntegerName;                  // Base type import - (STATICTypeFormatter.java:66)



/**
 * The DmcTypeIntegerNameSTATIC provides static access to functions used to manage values of type IntegerName
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.util.STATICTypeFormatter.dumpSTATICType(STATICTypeFormatter.java:82)
 *    Called from: org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:163)
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
    
    public IntegerName typeCheck(Object value) throws DMFeedbackSet {
    	   return(typeHelper.typeCheck(value));
    }
    
    public IntegerName cloneValue(IntegerName value) throws DMFeedbackSet {
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
        } catch (DMFeedbackSet e) {
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

