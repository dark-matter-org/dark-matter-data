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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.GetFunctionOptionEnum;    // DmcType import
/**
 * The DmcTypeGetFunctionOptionEnumSET provides storage for a set of GetFunctionOptionEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2298)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:326)
 */
@SuppressWarnings("serial")
public class DmcTypeGetFunctionOptionEnumSET extends DmcTypeGetFunctionOptionEnum implements Serializable {
    
    Set<GetFunctionOptionEnum> value;
    
    public DmcTypeGetFunctionOptionEnumSET(){
        value = null;
    }
    
    public DmcTypeGetFunctionOptionEnumSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<GetFunctionOptionEnum>();
        else
            value = new TreeSet<GetFunctionOptionEnum>();
    }
    
    @Override
    public DmcTypeGetFunctionOptionEnumSET getNew(){
        return(new DmcTypeGetFunctionOptionEnumSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2335)
    public DmcAttribute<GetFunctionOptionEnum> cloneIt(){
        synchronized(this){
            DmcTypeGetFunctionOptionEnumSET rc = getNew();
            for(GetFunctionOptionEnum val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2354)
    public GetFunctionOptionEnum add(Object v) throws DmcValueException {
        synchronized(this){
            GetFunctionOptionEnum rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2371)
    public GetFunctionOptionEnum del(Object v){
        synchronized(this){
            GetFunctionOptionEnum rc = null;
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2390)
    public Iterator<GetFunctionOptionEnum> getMV(){
        synchronized(this){
            Set<GetFunctionOptionEnum> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<GetFunctionOptionEnum>(value);
            else
                clone = new TreeSet<GetFunctionOptionEnum>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2403)
    public Set<GetFunctionOptionEnum> getMVCopy(){
        synchronized(this){
            Set<GetFunctionOptionEnum> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<GetFunctionOptionEnum>(value);
            else
                clone = new TreeSet<GetFunctionOptionEnum>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2417)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2428)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                GetFunctionOptionEnum val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

