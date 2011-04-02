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

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmp.shared.generated.enums.ResponseCategoryEnum;    // primitive import
/**
 * The DmcTypeResponseCategoryEnumSET provides storage for a set of ResponseCategoryEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1663)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:288)
 */
@SuppressWarnings("serial")
public class DmcTypeResponseCategoryEnumSET extends DmcTypeResponseCategoryEnum implements Serializable {
    
    Set<ResponseCategoryEnum> value;
    
    public DmcTypeResponseCategoryEnumSET(){
        value = null;
    }
    
    public DmcTypeResponseCategoryEnumSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ResponseCategoryEnum>();
        else
            value = new TreeSet<ResponseCategoryEnum>();
    }
    
    public DmcTypeResponseCategoryEnumSET getNew(){
        return(new DmcTypeResponseCategoryEnumSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<ResponseCategoryEnum> cloneIt(){
        DmcTypeResponseCategoryEnumSET rc = getNew();
        for(ResponseCategoryEnum val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public ResponseCategoryEnum add(Object v) throws DmcValueException {
        ResponseCategoryEnum rc = typeCheck(v);
        if (value == null)
            initValue();
        value.add(rc);
        return(rc);
    }
    
    public ResponseCategoryEnum del(Object v){
        ResponseCategoryEnum rc = null;
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
    
    public Iterator<ResponseCategoryEnum> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            ResponseCategoryEnum val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

