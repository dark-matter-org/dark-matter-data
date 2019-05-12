//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefTSDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ExtendedRefTS
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:197)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeExtendedRefTSREF extends DmcAttribute<ExtendedRefTSDMO> implements Serializable {

    public DmcTypeExtendedRefTSREF(){
    }

    public DmcTypeExtendedRefTSREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected ExtendedRefTSDMO typeCheck(Object value) throws DmcValueException {
        if (value instanceof ExtendedRefTSDMO)
            return((ExtendedRefTSDMO)value);
        
        throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ExtendedRefTSDMO expected."));
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ExtendedRefTSDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ExtendedRefTSDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        ExtendedRefTSDMO rc = (ExtendedRefTSDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ExtendedRefTSDMO cloneValue(ExtendedRefTSDMO value){
        return((ExtendedRefTSDMO)value.cloneIt());
    }

}
