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
import org.dmd.dms.generated.enums.DataTypeEnum;    // DmcType import
/**
 * The DmcTypeDataTypeEnumMV provides storage for a multi-valued DataTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1614)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:202)
 */
@SuppressWarnings("serial")
public class DmcTypeDataTypeEnumMV extends DmcTypeDataTypeEnum implements Serializable {
    
    ArrayList<DataTypeEnum> value;
    
    public DmcTypeDataTypeEnumMV(){
    
    }
    
    public DmcTypeDataTypeEnumMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDataTypeEnumMV getNew(){
        return(new DmcTypeDataTypeEnumMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<DataTypeEnum> cloneIt(){
        DmcTypeDataTypeEnumMV rc = getNew();
        for(DataTypeEnum val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public DataTypeEnum add(Object v) throws DmcValueException {
        DataTypeEnum rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<DataTypeEnum>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public DataTypeEnum del(Object v){
        DataTypeEnum rc = null;
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
    public Iterator<DataTypeEnum> getMV(){
        ArrayList<DataTypeEnum> clone = new ArrayList<DataTypeEnum>(value);
        return(clone.iterator());
    }
    
    public ArrayList<DataTypeEnum> getMVCopy(){
        ArrayList<DataTypeEnum> clone = new ArrayList<DataTypeEnum>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public DataTypeEnum getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            DataTypeEnum val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

