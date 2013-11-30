//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2606)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:664)
 */
@SuppressWarnings("serial")
public class DmcTypeTimeDoubleDataPointSET extends DmcTypeTimeDoubleDataPoint implements Serializable {
    
     private final static Iterator<TimeDoubleDataPoint> emptyList =  (new HashSet<TimeDoubleDataPoint>()).iterator();
    
    
    protected Set<TimeDoubleDataPoint> value;
    
    public DmcTypeTimeDoubleDataPointSET(){
        value = null;
    }
    
    public DmcTypeTimeDoubleDataPointSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TimeDoubleDataPoint>();
        else
            value = new TreeSet<TimeDoubleDataPoint>();
    }
    
    @Override
    public DmcTypeTimeDoubleDataPointSET getNew(){
        return(new DmcTypeTimeDoubleDataPointSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2647)
    public DmcAttribute<TimeDoubleDataPoint> cloneIt(){
        synchronized(this){
            DmcTypeTimeDoubleDataPointSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(TimeDoubleDataPoint val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2670)
    public TimeDoubleDataPoint add(Object v) throws DmcValueException {
        synchronized(this){
            TimeDoubleDataPoint rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2687)
    public TimeDoubleDataPoint del(Object v){
        synchronized(this){
            TimeDoubleDataPoint rc = null;
            if (value == null)
                return(rc);
            
            try {
                rc = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc)){
                value.remove(rc);
                if (value.size() == 0)
                    value = null;
            }
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2712)
    public Iterator<TimeDoubleDataPoint> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<TimeDoubleDataPoint>(value)).iterator() );
            else
                return( (new TreeSet<TimeDoubleDataPoint>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2726)
    public Set<TimeDoubleDataPoint> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<TimeDoubleDataPoint>());
                else
                    return(new HashSet<TimeDoubleDataPoint>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<TimeDoubleDataPoint>(value));
                else
                    return(new TreeSet<TimeDoubleDataPoint>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2746)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2757)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                TimeDoubleDataPoint val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

