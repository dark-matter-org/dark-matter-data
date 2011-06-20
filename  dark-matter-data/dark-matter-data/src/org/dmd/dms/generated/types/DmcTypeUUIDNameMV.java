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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.UUIDName;    // base type import
import org.dmd.dmc.types.DmcTypeUUIDName;    // DmcType import
/**
 * The DmcTypeUUIDNameMV provides storage for a multi-valued UUIDName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1907)
 *    Called from:  org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:270)
 */
@SuppressWarnings("serial")
public class DmcTypeUUIDNameMV extends DmcTypeUUIDName implements Serializable {
    
    ArrayList<UUIDName> value;
    
    public DmcTypeUUIDNameMV(){
    
    }
    
    public DmcTypeUUIDNameMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeUUIDNameMV getNew(){
        return(new DmcTypeUUIDNameMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<UUIDName> cloneIt(){
        DmcTypeUUIDNameMV rc = getNew();
        for(UUIDName val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public UUIDName add(Object v) throws DmcValueException {
        UUIDName rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<UUIDName>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public UUIDName del(Object v){
        UUIDName rc = null;
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
    public Iterator<UUIDName> getMV(){
        ArrayList<UUIDName> clone = new ArrayList<UUIDName>(value);
        return(clone.iterator());
    }
    
    public ArrayList<UUIDName> getMVCopy(){
        ArrayList<UUIDName> clone = new ArrayList<UUIDName>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public UUIDName getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            UUIDName val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

