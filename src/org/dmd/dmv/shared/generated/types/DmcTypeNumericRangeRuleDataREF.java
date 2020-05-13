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

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.RuleName;

import org.dmd.dmv.shared.generated.types.NumericRangeRuleDataREF;

import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;

/**
 * This is the generated DmcAttribute derivative for values of type NumericRangeRuleData
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeNumericRangeRuleDataREF extends DmcTypeNamedObjectREF<NumericRangeRuleDataREF, RuleName> {

    public DmcTypeNumericRangeRuleDataREF(){
    
    }

    public DmcTypeNumericRangeRuleDataREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected NumericRangeRuleDataREF getNewHelper(){
        return(new NumericRangeRuleDataREF());
    }

    @Override
    protected RuleName getNewName(){
        return(new RuleName());
    }

    @Override
    protected String getDMOClassName(){
        return( NumericRangeRuleDataDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof NumericRangeRuleDataDMO)
            return(true);
        return(false);
    }

    @Override
    protected NumericRangeRuleDataREF typeCheck(Object value) throws DmcValueException {
        NumericRangeRuleDataREF rc = null;

        if (value instanceof NumericRangeRuleDataREF)
            rc = (NumericRangeRuleDataREF)value;
        else if (value instanceof NumericRangeRuleDataDMO)
            rc = new NumericRangeRuleDataREF((NumericRangeRuleDataDMO)value);
        else if (value instanceof RuleName)
            rc = new NumericRangeRuleDataREF((RuleName)value);
        else if (value instanceof String)
            rc = new NumericRangeRuleDataREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with NumericRangeRuleDataREF, NumericRangeRuleDataDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, NumericRangeRuleDataREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public NumericRangeRuleDataREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        NumericRangeRuleDataREF rc = new NumericRangeRuleDataREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public NumericRangeRuleDataREF cloneValue(NumericRangeRuleDataREF value){
        return(new NumericRangeRuleDataREF(value));
    }



}
