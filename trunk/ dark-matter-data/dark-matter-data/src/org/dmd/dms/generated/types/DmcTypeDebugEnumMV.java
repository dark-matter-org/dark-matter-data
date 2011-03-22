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
import org.dmd.dms.generated.enums.DebugEnum;    // primitive import
/**
 * The DmcTypeDebugEnumMV provides storage for a multi-valued DebugEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1185)
 */
@SuppressWarnings("serial")
// public class DmcTypeDebugEnumMV extends DmcTypeDebugEnum<DebugEnum> {
public class DmcTypeDebugEnumMV extends DmcTypeDebugEnum {
    
    ArrayList<DebugEnum> value;
    
    public DmcTypeDebugEnumMV(){
    
    }
    
    public DmcTypeDebugEnumMV(DmcAttributeInfo ai){
        super(ai);
        value = new ArrayList<DebugEnum>();
    }
    
    public DmcTypeDebugEnumMV getNew(){
        return(new DmcTypeDebugEnumMV(attrInfo));
    }
    
    public DebugEnum set(Object v) throws DmcValueException {
        throw(new IllegalStateException("The set() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public DebugEnum getSV(){
        throw(new IllegalStateException("The getSV() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public DebugEnum add(Object v) throws DmcValueException {
        DebugEnum rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public DebugEnum del(Object v){
        DebugEnum rc = null;
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
    
    public Iterator<DebugEnum> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public DebugEnum getMVnth(int i){
        return(value.get(i));
    }
    
    public DebugEnum getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            DebugEnum val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

