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

import java.util.Iterator;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;    // primitive import
/**
 * The DmcTypeValueTypeEnumSV provides storage for a single-valued ValueTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1052)
 */
@SuppressWarnings("serial")
// public class DmcTypeValueTypeEnumSV extends DmcTypeValueTypeEnum<ValueTypeEnum> {
public class DmcTypeValueTypeEnumSV extends DmcTypeValueTypeEnum {
    
    ValueTypeEnum value;
    
    public DmcTypeValueTypeEnumSV(){
    
    }
    
    public DmcTypeValueTypeEnumSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeValueTypeEnumSV getNew(){
        return(new DmcTypeValueTypeEnumSV(attrInfo));
    }
    
    public ValueTypeEnum set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    public ValueTypeEnum getSV(){
        return(value);
    }
    
    public ValueTypeEnum add(Object v){
        throw(new IllegalStateException("The add() method is not valid for single-valued attribute:" + getName()));
    }
    
    public ValueTypeEnum del(Object v){
        throw(new IllegalStateException("The del() method is not valid for single-valued attribute:" + getName()));
    }
    
    public Iterator<ValueTypeEnum> getMV(){
        throw(new IllegalStateException("The getMV() method is not valid for single-valued attribute:" + getName()));
    }
    
    public int getMVSize(){
        throw(new IllegalStateException("The getMVSize() method is not valid for single-valued attribute:" + getName()));
    }
    
    public ValueTypeEnum getMVnth(){
        throw(new IllegalStateException("The getMVnth() method is not valid for single-valued attribute:" + getName()));
    }
    
    public ValueTypeEnum getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for single-valued attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        throw(new IllegalStateException("The contains() method is not valid for single-valued attribute:" + getName()));
    }
    
}

