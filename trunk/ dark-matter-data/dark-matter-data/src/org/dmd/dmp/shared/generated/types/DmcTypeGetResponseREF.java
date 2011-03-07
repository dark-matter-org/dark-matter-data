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

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;

/**
 * This is the generated DmcAttribute derivative for values of type GetResponse
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:104)
 */
@SuppressWarnings("serial")
public class DmcTypeGetResponseREF extends DmcAttribute<GetResponseDMO> {

    public DmcTypeGetResponseREF(){
    }

    protected GetResponseDMO typeCheck(Object value) throws DmcValueException {
        GetResponseDMO rc = null;

        if (value instanceof GetResponseDMO){
            rc = (GetResponseDMO)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GetResponseDMO expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
            StringBuffer sb = new StringBuffer();
            for (GetResponseDMO t : mv){
                sb.append(t + ", ");
            }
            return(sb.toString());
        }
        else
            return(sv.toString());

    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeGetResponseREF getOneOfMe(){
        DmcTypeGetResponseREF rc = new DmcTypeGetResponseREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public GetResponseDMO cloneValue(GetResponseDMO val){
        return(null);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    @Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
    }
    
    @Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
    }
    
    @Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
    }
}
