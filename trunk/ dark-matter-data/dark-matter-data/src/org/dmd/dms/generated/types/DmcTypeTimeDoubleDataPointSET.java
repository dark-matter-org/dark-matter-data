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
import org.dmd.dmc.types.TimeDoubleDataPoint;    // base type import
import org.dmd.dmc.types.DmcTypeTimeDoubleDataPoint;    // DmcType import
/**
 * The DmcTypeTimeDoubleDataPointSET provides storage for a set of TimeDoubleDataPoint
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2034)
 *    Called from:  org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeTimeDoubleDataPointSET extends DmcTypeTimeDoubleDataPoint implements Serializable {
    
    Set<TimeDoubleDataPoint> value;
    
    public DmcTypeTimeDoubleDataPointSET(){
        value = null;
    }
    
    public DmcTypeTimeDoubleDataPointSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TimeDoubleDataPoint>();
        else
            value = new TreeSet<TimeDoubleDataPoint>();
    }
    
    @Override
    public DmcTypeTimeDoubleDataPointSET getNew(){
        return(new DmcTypeTimeDoubleDataPointSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<TimeDoubleDataPoint> cloneIt(){
        DmcTypeTimeDoubleDataPointSET rc = getNew();
        for(TimeDoubleDataPoint val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TimeDoubleDataPoint add(Object v) throws DmcValueException {
        TimeDoubleDataPoint rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public TimeDoubleDataPoint del(Object v){
        TimeDoubleDataPoint rc = null;
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
    public Iterator<TimeDoubleDataPoint> getMV(){
        Set<TimeDoubleDataPoint> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TimeDoubleDataPoint>(value);
        else
            clone = new TreeSet<TimeDoubleDataPoint>(value);
        return(clone.iterator());
    }
    
    public Set<TimeDoubleDataPoint> getMVCopy(){
        Set<TimeDoubleDataPoint> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TimeDoubleDataPoint>(value);
        else
            clone = new TreeSet<TimeDoubleDataPoint>(value);
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
            TimeDoubleDataPoint val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}
