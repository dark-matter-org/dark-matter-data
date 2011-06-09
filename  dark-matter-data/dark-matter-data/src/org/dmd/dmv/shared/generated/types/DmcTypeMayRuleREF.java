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
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREF;
import org.dmd.dmv.shared.generated.dmo.MayRuleDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MayRule
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:165)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMayRuleREF extends DmcAttribute<MayRuleDMO> implements Serializable {

    public DmcTypeMayRuleREF(){
    }

    public DmcTypeMayRuleREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected MayRuleDMO typeCheck(Object value) throws DmcValueException {
        MayRuleDMO rc = null;

        if (value instanceof MayRuleDMO){
            rc = (MayRuleDMO)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MayRuleDMO expected."));
        }
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MayRuleDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MayRuleDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        DmcTypeClassDefinitionREF	oc   = (DmcTypeClassDefinitionREF) dis.getAttributeInstance();
        oc.deserializeIt(dis);
        MayRuleDMO rc = (MayRuleDMO)dis.getDMOInstance(oc.getMVnth(0).getObjectName().getNameString());
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MayRuleDMO cloneValue(MayRuleDMO value){
        return((MayRuleDMO)value.cloneIt());
    }

}
