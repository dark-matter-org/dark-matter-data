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
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.LabelledIntegerDataPoint;    // base type import
import org.dmd.dmc.types.DmcTypeLabelledIntegerDataPoint;    // DmcType import
/**
 * The DmcTypeLabelledIntegerDataPointSET provides storage for a set of LabelledIntegerDataPoint
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2035)
 *    Called from:  org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeLabelledIntegerDataPointSET extends DmcTypeLabelledIntegerDataPoint implements Serializable {
    
    Set<LabelledIntegerDataPoint> value;
    
    public DmcTypeLabelledIntegerDataPointSET(){
        value = null;
    }
    
    public DmcTypeLabelledIntegerDataPointSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<LabelledIntegerDataPoint>();
        else
            value = new TreeSet<LabelledIntegerDataPoint>();
    }
    
    @Override
    public DmcTypeLabelledIntegerDataPointSET getNew(){
        return(new DmcTypeLabelledIntegerDataPointSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<LabelledIntegerDataPoint> cloneIt(){
        DmcTypeLabelledIntegerDataPointSET rc = getNew();
        for(LabelledIntegerDataPoint val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public LabelledIntegerDataPoint add(Object v) throws DmcValueException {
        LabelledIntegerDataPoint rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public LabelledIntegerDataPoint del(Object v){
        LabelledIntegerDataPoint rc = null;
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
    public Iterator<LabelledIntegerDataPoint> getMV(){
        Set<LabelledIntegerDataPoint> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<LabelledIntegerDataPoint>(value);
        else
            clone = new TreeSet<LabelledIntegerDataPoint>(value);
        return(clone.iterator());
    }
    
    public Set<LabelledIntegerDataPoint> getMVCopy(){
        Set<LabelledIntegerDataPoint> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<LabelledIntegerDataPoint>(value);
        else
            clone = new TreeSet<LabelledIntegerDataPoint>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            LabelledIntegerDataPoint val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

