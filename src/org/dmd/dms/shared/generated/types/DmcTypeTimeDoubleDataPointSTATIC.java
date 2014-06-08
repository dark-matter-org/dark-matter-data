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
import org.dmd.core.feedback.DMFeedbackSet;                  //  - (STATICTypeFormatter.java:44)
import org.dmd.core.interfaces.DmcInputStreamIF;             //  - (STATICTypeFormatter.java:45)
import org.dmd.core.interfaces.DmcOutputStreamIF;            //  - (STATICTypeFormatter.java:46)
import org.dmd.dms.shared.types.TimeDoubleDataPoint;         // Base type import - (STATICTypeFormatter.java:65)



/**
 * The DmcTypeTimeDoubleDataPointSTATIC provides static access to functions used to manage values of type TimeDoubleDataPoint
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.util.STATICTypeFormatter.dumpSTATICType(STATICTypeFormatter.java:81)
 *    Called from: org.dmd.dms.tools.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:162)
 */
public class DmcTypeTimeDoubleDataPointSTATIC {
    
    public static DmcTypeTimeDoubleDataPointSTATIC instance;
    static DmcTypeTimeDoubleDataPointSV typeHelper;
    
    static {
        instance = new DmcTypeTimeDoubleDataPointSTATIC();
    }
    
    protected DmcTypeTimeDoubleDataPointSTATIC() {
        typeHelper = new DmcTypeTimeDoubleDataPointSV();
    }
    
    public TimeDoubleDataPoint typeCheck(Object value) throws DMFeedbackSet {
    	   return(typeHelper.typeCheck(value));
    }
    
    public TimeDoubleDataPoint cloneValue(TimeDoubleDataPoint value) throws DMFeedbackSet {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, TimeDoubleDataPoint value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public TimeDoubleDataPoint deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

