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
import org.dmd.dmc.types.DmcTypeIntegerName;    // base type import
import org.dmd.dmc.types.IntegerName;    // primitive import
/**
 * The DmcTypeIntegerNameSET provides storage for a set of IntegerName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1336)
 */
@SuppressWarnings("serial")
// public class DmcTypeIntegerNameSET extends DmcTypeIntegerName<IntegerName> {
public class DmcTypeIntegerNameSET extends DmcTypeIntegerName {
    
    Set<IntegerName> value;
    
    public DmcTypeIntegerNameSET(){
        value = null;
    }
    
    public DmcTypeIntegerNameSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<IntegerName>();
        else
            value = new TreeSet<IntegerName>();
    }
    
    public DmcTypeIntegerNameSET getNew(){
        return(new DmcTypeIntegerNameSET(attrInfo));
    }
    
    public IntegerName set(Object v) throws DmcValueException {
        throw(new IllegalStateException("The set() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public IntegerName getSV(){
        throw(new IllegalStateException("The getSV() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public IntegerName add(Object v) throws DmcValueException {
        IntegerName rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public IntegerName del(Object v){
        IntegerName rc = null;
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
    
    public Iterator<IntegerName> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public IntegerName getMVnth(int i){
        throw(new IllegalStateException("The getMVnth() method is not valid for SET attribute:" + getName()));
    }
    
    public IntegerName getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for a SET attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            IntegerName val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

