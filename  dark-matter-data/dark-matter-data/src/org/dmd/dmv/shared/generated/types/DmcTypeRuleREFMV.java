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
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeRuleREFMV provides storage for a multi-valued RuleREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1839)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:455)
 */
@SuppressWarnings("serial")
public class DmcTypeRuleREFMV extends DmcTypeRuleREF implements Serializable {
    
    ArrayList<RuleREF> value;
    
    public DmcTypeRuleREFMV(){
    
    }
    
    public DmcTypeRuleREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeRuleREFMV getNew(){
        return(new DmcTypeRuleREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<RuleREF> cloneIt(){
        DmcTypeRuleREFMV rc = getNew();
        for(RuleREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public RuleREF add(Object v) throws DmcValueException {
        RuleREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<RuleREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public RuleREF del(Object v){
        RuleREF rc = null;
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
    
    @Override
    public Iterator<RuleREF> getMV(){
        ArrayList<RuleREF> clone = new ArrayList<RuleREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<RuleREF> getMVCopy(){
        ArrayList<RuleREF> clone = new ArrayList<RuleREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public RuleREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            RuleREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

