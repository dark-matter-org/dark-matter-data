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
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.TimeDoubleDataPoint;    // base type import
import org.dmd.dmc.types.DmcTypeTimeDoubleDataPoint;    // DmcType import
/**
 * The DmcTypeTimeDoubleDataPointMV provides storage for a multi-valued TimeDoubleDataPoint
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2341)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:669)
 */
@SuppressWarnings("serial")
public class DmcTypeTimeDoubleDataPointMV extends DmcTypeTimeDoubleDataPoint implements Serializable {
    
    private final static Iterator<TimeDoubleDataPoint> emptyList = (new ArrayList<TimeDoubleDataPoint>()).iterator();
    
    protected ArrayList<TimeDoubleDataPoint> value;
    
    public DmcTypeTimeDoubleDataPointMV(){
    
    }
    
    public DmcTypeTimeDoubleDataPointMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeTimeDoubleDataPointMV getNew(){
        return(new DmcTypeTimeDoubleDataPointMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2372)
    public DmcAttribute<TimeDoubleDataPoint> cloneIt(){
        synchronized(this){
            DmcTypeTimeDoubleDataPointMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(TimeDoubleDataPoint val: value)
                try {
                    rc.add(val);
                } catch (DmcValueException e) {
                    throw(new IllegalStateException("typeCheck() should never fail here!",e));
                }
            }
            else{
                for(int index=0; index<value.size(); index++)
                    try {
                        rc.setMVnth(index, value.get(index));
                    } catch (DmcValueException e) {
                        throw(new IllegalStateException("typeCheck() should never fail here!",e));
                    }
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2405)
    public TimeDoubleDataPoint add(Object v) throws DmcValueException {
        synchronized(this){
            TimeDoubleDataPoint rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<TimeDoubleDataPoint>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2418)
    public TimeDoubleDataPoint del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            TimeDoubleDataPoint key = null;
            TimeDoubleDataPoint rc = null;
            try {
                key = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            int indexof = value.indexOf(key);
            if (indexof != -1){
                rc = value.get(indexof);
                value.remove(rc);
            }

            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2452)
    public Iterator<TimeDoubleDataPoint> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<TimeDoubleDataPoint> clone = new ArrayList<TimeDoubleDataPoint>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2464)
    public ArrayList<TimeDoubleDataPoint> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<TimeDoubleDataPoint>());
            else 
                return(new ArrayList<TimeDoubleDataPoint>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2476)
    public int getMVSize(){
        synchronized(this){
            if (getAttributeInfo().indexSize == 0){
                if (value == null)
                    return(0);
                return(value.size());
            }
            else
                return(getAttributeInfo().indexSize);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2491)
    public TimeDoubleDataPoint getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2502)
    public TimeDoubleDataPoint setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            TimeDoubleDataPoint rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<TimeDoubleDataPoint>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2530)
    public boolean hasValue(){
        synchronized(this){
            boolean rc = false;
            
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use hasValue()."));
            
            if (value == null)
                return(rc);
            
            for(int i=0; i<value.size(); i++){
                if (value.get(i) != null){
                    rc = true;
                    break;
                }
            }
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2554)
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

