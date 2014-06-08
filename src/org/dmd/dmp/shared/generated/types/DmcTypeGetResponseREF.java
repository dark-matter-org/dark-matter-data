//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmp.shared.generated.types;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.dmogen.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:196)
import java.io.Serializable;                                    // Standard marker interface - (DmoTypeFormatter.java:188)
import org.dmd.core.DmcAttribute;                               // What we're derived from - (DmoTypeFormatter.java:191)
import org.dmd.core.feedback.DMFeedbackSet;                     // To handle errors - (DmoTypeFormatter.java:193)
import org.dmd.core.interfaces.DmcInputStreamIF;                // To allow deserialization - (DmoTypeFormatter.java:189)
import org.dmd.core.interfaces.DmcOutputStreamIF;               // To allow serialization - (DmoTypeFormatter.java:190)
import org.dmd.core.schema.DmcAttributeInfo;                    // To allow construction - (DmoTypeFormatter.java:192)
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;         //  - (DmoTypeFormatter.java:194)



/**
 * This is the generated DmcAttribute derivative for values of type GetResponse
 * <P>
 * Generated from the dmp schema at version null
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.tools.generation.dmogen.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:204)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeGetResponseREF extends DmcAttribute<GetResponseDMO> implements Serializable {

    public DmcTypeGetResponseREF(){
    }

    public DmcTypeGetResponseREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected GetResponseDMO typeCheck(Object value) throws DMFeedbackSet {
        if (value instanceof GetResponseDMO)
            return((GetResponseDMO)value);
        
        throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with GetResponseDMO expected."));
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, GetResponseDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public GetResponseDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        GetResponseDMO rc = (GetResponseDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public GetResponseDMO cloneValue(GetResponseDMO value){
        return((GetResponseDMO)value.cloneIt());
    }

}
