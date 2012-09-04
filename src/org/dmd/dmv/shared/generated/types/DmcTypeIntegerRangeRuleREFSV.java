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
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmv.shared.generated.dmo.IntegerRangeRuleDMO;    // DmcType import
/**
 * The DmcTypeIntegerRangeRuleREFSV provides storage for a single-valued IntegerRangeRule
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1926)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerRangeRuleREFSV extends DmcTypeIntegerRangeRuleREF implements Serializable {
    
    protected IntegerRangeRuleDMO value;
    
    public DmcTypeIntegerRangeRuleREFSV(){
    
    }
    
    public DmcTypeIntegerRangeRuleREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeIntegerRangeRuleREFSV getNew(){
        return(new DmcTypeIntegerRangeRuleREFSV(attrInfo));
    }
    
    public DmcTypeIntegerRangeRuleREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeIntegerRangeRuleREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1958)
    public DmcAttribute<IntegerRangeRuleDMO> cloneIt(){
        DmcTypeIntegerRangeRuleREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1969)
    public IntegerRangeRuleDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1981)
    public IntegerRangeRuleDMO set(Object v) throws DmcValueException {
        IntegerRangeRuleDMO rc = typeCheck(v);
        // We only return a value if the value actually changed. This supports
        // the applyModifier() mechanism on DmcObject where we only return true
        // if something changed as a result of the modifier
        if (value == null)
            value = rc;
        else{
            if (value.equals(rc))
                rc = null;
            else
                value = rc;
        }
        return(rc);
    }
    
    @Override
    public IntegerRangeRuleDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

