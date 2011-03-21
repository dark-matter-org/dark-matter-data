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
import org.dmd.dmc.types.DmcTypeUUIDName;    // base type import
import org.dmd.dmc.types.UUIDName;    // primitive import
/**
 * The DmcTypeUUIDNameSV provides storage for a single-valued UUIDName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1052)
 */
@SuppressWarnings("serial")
// public class DmcTypeUUIDNameSV extends DmcTypeUUIDName<UUIDName> {
public class DmcTypeUUIDNameSV extends DmcTypeUUIDName {
    
    UUIDName value;
    
    public DmcTypeUUIDNameSV(){
    
    }
    
    public DmcTypeUUIDNameSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUUIDNameSV getNew(){
        return(new DmcTypeUUIDNameSV(attrInfo));
    }
    
    public UUIDName set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    public UUIDName getSV(){
        return(value);
    }
    
    public UUIDName add(Object v){
        throw(new IllegalStateException("The add() method is not valid for single-valued attribute:" + getName()));
    }
    
    public UUIDName del(Object v){
        throw(new IllegalStateException("The del() method is not valid for single-valued attribute:" + getName()));
    }
    
    public Iterator<UUIDName> getMV(){
        throw(new IllegalStateException("The getMV() method is not valid for single-valued attribute:" + getName()));
    }
    
    public int getMVSize(){
        throw(new IllegalStateException("The getMVSize() method is not valid for single-valued attribute:" + getName()));
    }
    
    public UUIDName getMVnth(){
        throw(new IllegalStateException("The getMVnth() method is not valid for single-valued attribute:" + getName()));
    }
    
    public UUIDName getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for single-valued attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        throw(new IllegalStateException("The contains() method is not valid for single-valued attribute:" + getName()));
    }
    
}

