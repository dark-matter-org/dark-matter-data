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
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmv.shared.generated.dmo.MayRuleDMO;    // primitive import
/**
 * The DmcTypeMayRuleREFSET provides storage for a set of MayRuleDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1636)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:189)
 */
@SuppressWarnings("serial")
public class DmcTypeMayRuleREFSET extends DmcTypeMayRuleREF implements Serializable {
    
    Set<MayRuleDMO> value;
    
    public DmcTypeMayRuleREFSET(){
        value = null;
    }
    
    public DmcTypeMayRuleREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<MayRuleDMO>();
        else
            value = new TreeSet<MayRuleDMO>();
    }
    
    public DmcTypeMayRuleREFSET getNew(){
        return(new DmcTypeMayRuleREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<MayRuleDMO> cloneIt(){
        DmcTypeMayRuleREFSET rc = getNew();
        for(MayRuleDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public MayRuleDMO add(Object v) throws DmcValueException {
        MayRuleDMO rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    public MayRuleDMO del(Object v){
        MayRuleDMO rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else
            rc = null;
        return(rc);
    }
    
    public Iterator<MayRuleDMO> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            MayRuleDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

