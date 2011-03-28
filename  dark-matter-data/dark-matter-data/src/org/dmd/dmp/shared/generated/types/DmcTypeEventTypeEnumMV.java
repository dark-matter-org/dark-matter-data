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
package org.dmd.dmp.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;    // primitive import
/**
 * The DmcTypeEventTypeEnumMV provides storage for a multi-valued EventTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1226)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:408)
 */
@SuppressWarnings("serial")
public class DmcTypeEventTypeEnumMV extends DmcTypeEventTypeEnum {
    
    ArrayList<DMPEventTypeEnum> value;
    
    public DmcTypeEventTypeEnumMV(){
    
    }
    
    public DmcTypeEventTypeEnumMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeEventTypeEnumMV getNew(){
        return(new DmcTypeEventTypeEnumMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<DMPEventTypeEnum> cloneIt(){
        DmcTypeEventTypeEnumMV rc = getNew();
        for(DMPEventTypeEnum val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public DMPEventTypeEnum add(Object v) throws DmcValueException {
        DMPEventTypeEnum rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<DMPEventTypeEnum>();
        value.add(rc);
        return(rc);
    }
    
    public DMPEventTypeEnum del(Object v){
        DMPEventTypeEnum rc = null;
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
    
    public Iterator<DMPEventTypeEnum> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public DMPEventTypeEnum getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            DMPEventTypeEnum val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}
