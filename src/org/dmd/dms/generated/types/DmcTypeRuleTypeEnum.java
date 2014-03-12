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
package org.dmd.dms.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.*;

@SuppressWarnings("serial")
/**
 * The DmcTypeRuleTypeEnum class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcType(MetaGenerator.java:3047)
 */
abstract public class DmcTypeRuleTypeEnum extends DmcAttribute<RuleTypeEnum> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeRuleTypeEnum(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeRuleTypeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected RuleTypeEnum typeCheck(Object value) throws DmcValueException {
        RuleTypeEnum rc = null;

        if (value instanceof RuleTypeEnum){
            rc = (RuleTypeEnum)value;
        }
        else if (value instanceof String){
            rc = RuleTypeEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid RuleTypeEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = RuleTypeEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid RuleTypeEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with RuleTypeEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public RuleTypeEnum cloneValue(RuleTypeEnum val){
        RuleTypeEnum rc = val;
        return(rc);
    }

    /**
     * Writes a RuleTypeEnum.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, RuleTypeEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a RuleTypeEnum.
     */
    @Override
    public RuleTypeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(RuleTypeEnum.get(dis.readShort()));
    }



}
