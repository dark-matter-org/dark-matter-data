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

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeLong;    // base type import
/**
 * The DmcTypeLongMV provides storage for a multi-valued Long
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1185)
 */
@SuppressWarnings("serial")
// public class DmcTypeLongMV extends DmcTypeLong<Long> {
public class DmcTypeLongMV extends DmcTypeLong {
    
    ArrayList<Long> value;
    
    public DmcTypeLongMV(){
    
    }
    
    public DmcTypeLongMV(DmcAttributeInfo ai){
        super(ai);
        value = new ArrayList<Long>();
    }
    
    public DmcTypeLongMV getNew(){
        return(new DmcTypeLongMV(attrInfo));
    }
    
    public Long set(Object v) throws DmcValueException {
        throw(new IllegalStateException("The set() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public Long getSV(){
        throw(new IllegalStateException("The getSV() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public Long add(Object v) throws DmcValueException {
        Long rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public Long del(Object v){
        Long rc = null;
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
    
    public Iterator<Long> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public Long getMVnth(int i){
        return(value.get(i));
    }
    
    public Long getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            Long val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

