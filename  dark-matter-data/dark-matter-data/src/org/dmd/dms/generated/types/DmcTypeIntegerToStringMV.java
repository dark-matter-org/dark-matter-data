//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeIntegerToString;    // base type import
import org.dmd.dmc.types.IntegerToString;    // primitive import
/**
 * The DmcTypeIntegerToStringMV provides storage for a multi-valued IntegerToString
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1206)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:189)
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerToStringMV extends DmcTypeIntegerToString {
    
    ArrayList<IntegerToString> value;
    
    public DmcTypeIntegerToStringMV(){
    
    }
    
    public DmcTypeIntegerToStringMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeIntegerToStringMV getNew(){
        return(new DmcTypeIntegerToStringMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<IntegerToString> cloneIt(){
        DmcTypeIntegerToStringMV rc = getNew();
        for(IntegerToString val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public IntegerToString add(Object v) throws DmcValueException {
        IntegerToString rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<IntegerToString>();
        value.add(rc);
        return(rc);
    }
    
    public IntegerToString del(Object v){
        IntegerToString rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else;
            rc = null;
        return(rc);
    }
    
    public Iterator<IntegerToString> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public IntegerToString getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            IntegerToString val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

