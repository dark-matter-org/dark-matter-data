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
// Called from: org.dmd.dms.tools.util.STATICTypeFormatter.dumpSTATICType(STATICTypeFormatter.java:73)
import org.dmd.core.DmcObjectName;                            //  - (STATICTypeFormatter.java:50)
import org.dmd.core.feedback.DMFeedbackSet;                   //  - (STATICTypeFormatter.java:44)
import org.dmd.core.interfaces.DmcInputStreamIF;              //  - (STATICTypeFormatter.java:45)
import org.dmd.core.interfaces.DmcNameBuilderIF;              //  - (STATICTypeFormatter.java:51)
import org.dmd.core.interfaces.DmcOutputStreamIF;             //  - (STATICTypeFormatter.java:46)
import org.dmd.core.schema.DmcAttributeInfo;                  //  - (STATICTypeFormatter.java:49)
import org.dmd.dms.shared.types.DmcTypeDmcObjectName;         //  - (STATICTypeFormatter.java:52)
import org.dmd.dms.shared.types.UUIDName;                     // Base type import - (STATICTypeFormatter.java:65)



/**
 * The DmcTypeUUIDNameSTATIC provides static access to functions used to manage values of type UUIDName
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.util.STATICTypeFormatter.dumpSTATICType(STATICTypeFormatter.java:81)
 *    Called from: org.dmd.dms.tools.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:162)
 */
public class DmcTypeUUIDNameSTATIC implements DmcNameBuilderIF {
    
    public static DmcTypeUUIDNameSTATIC instance;
    static DmcTypeUUIDNameSV typeHelper;
    static String    nameClass = "UUIDName";
    static final int attrID    = 101;
    
    static {
        instance = new DmcTypeUUIDNameSTATIC();
    }
    
    protected DmcTypeUUIDNameSTATIC() {
        typeHelper = new DmcTypeUUIDNameSV();
    }
    
    public UUIDName typeCheck(Object value) throws DMFeedbackSet {
    	   return(typeHelper.typeCheck(value));
    }
    
    public UUIDName cloneValue(UUIDName value) throws DMFeedbackSet {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, UUIDName value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public UUIDName deserializeValue(DmcInputStreamIF dis) throws Exception {
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

