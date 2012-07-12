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
package org.dmd.dmv.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;

/**
 * This is the generated DmcAttribute derivative for values of type AllowedAttributesRuleData
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:197)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeAllowedAttributesRuleDataREF extends DmcAttribute<AllowedAttributesRuleDataDMO> implements Serializable {

    public DmcTypeAllowedAttributesRuleDataREF(){
    }

    public DmcTypeAllowedAttributesRuleDataREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected AllowedAttributesRuleDataDMO typeCheck(Object value) throws DmcValueException {
        if (value instanceof AllowedAttributesRuleDataDMO)
            return((AllowedAttributesRuleDataDMO)value);
        
        throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with AllowedAttributesRuleDataDMO expected."));
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, AllowedAttributesRuleDataDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public AllowedAttributesRuleDataDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        AllowedAttributesRuleDataDMO rc = (AllowedAttributesRuleDataDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public AllowedAttributesRuleDataDMO cloneValue(AllowedAttributesRuleDataDMO value){
        return((AllowedAttributesRuleDataDMO)value.cloneIt());
    }

}
