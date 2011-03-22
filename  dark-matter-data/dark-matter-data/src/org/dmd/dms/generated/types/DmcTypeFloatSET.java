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
package org.dmd.dms.generated.types;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.DmcTypeFloat;    // base type import
/**
 * The DmcTypeFloatSET provides storage for a set of Float
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1363)
 */
@SuppressWarnings("serial")
// public class DmcTypeFloatSET extends DmcTypeFloat<Float> {
public class DmcTypeFloatSET extends DmcTypeFloat {
    
    Set<Float> value;
    
    public DmcTypeFloatSET(){
        value = null;
    }
    
    public DmcTypeFloatSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<Float>();
        else
            value = new TreeSet<Float>();
    }
    
    public DmcTypeFloatSET getNew(){
        return(new DmcTypeFloatSET(attrInfo));
    }
    
    public Float set(Object v) throws DmcValueException {
        throw(new IllegalStateException("The set() method is not valid for a SET attribute:" + getName()));
    }
    
    public Float getSV(){
        throw(new IllegalStateException("The getSV() method is not valid for a SET attribute:" + getName()));
    }
    
    public Float add(Object v) throws DmcValueException {
        Float rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public Float del(Object v){
        Float rc = null;
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
    
    public Iterator<Float> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public Float getMVnth(int i){
        throw(new IllegalStateException("The getMVnth() method is not valid for SET attribute:" + getName()));
    }
    
    public Float getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for a SET attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            Float val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

