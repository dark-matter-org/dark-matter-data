//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012-2021 dark-matter-data committers
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
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.DmcTypeIntegerToBoolean;    // base type import
import org.dmd.dmc.types.IntegerToBoolean;    // primitive import
/**
 * The DmcTypeIntegerToBooleanMAP provides storage for a map of IntegerToBoolean
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3044)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:679)
 */
@SuppressWarnings("serial")
// public class DmcTypeIntegerToBooleanMAP extends DmcTypeIntegerToBoolean<IntegerToBoolean> {
public class DmcTypeIntegerToBooleanMAP extends DmcTypeIntegerToBoolean implements Serializable {
    
    private final static Iterator<IntegerToBoolean> emptyList = (new HashMap<Integer,IntegerToBoolean>()).values().iterator();
    
    protected Map<Integer,IntegerToBoolean> value;
    
    public DmcTypeIntegerToBooleanMAP(){
        value = null;
    }
    
    public DmcTypeIntegerToBooleanMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<Integer,IntegerToBoolean>();
        else
            value = new TreeMap<Integer,IntegerToBoolean>();
    }
    
    public Integer firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<Integer,IntegerToBoolean> map = (TreeMap<Integer,IntegerToBoolean>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeIntegerToBooleanMAP getNew(){
        return(new DmcTypeIntegerToBooleanMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3101)
    public DmcAttribute<IntegerToBoolean> cloneIt(){
        synchronized(this){
            DmcTypeIntegerToBooleanMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(IntegerToBoolean val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3121)
    public IntegerToBoolean add(Object v) throws DmcValueException {
        synchronized(this){
            IntegerToBoolean newval = typeCheck(v);
            if (value == null)
                initValue();
            Integer key = (Integer)((DmcMappedAttributeIF)newval).getKey();
            IntegerToBoolean oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3142)
    public IntegerToBoolean del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof Integer)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3158)
    public Iterator<IntegerToBoolean> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<Integer,IntegerToBoolean> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<Integer,IntegerToBoolean>(value);
            else
                clone = new TreeMap<Integer,IntegerToBoolean>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3175)
    public Map<Integer,IntegerToBoolean> getMVCopy(){
        synchronized(this){
            Map<Integer,IntegerToBoolean> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<Integer,IntegerToBoolean>();
                else
                    clone = new HashMap<Integer,IntegerToBoolean>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<Integer,IntegerToBoolean>();
                else
                    clone = new TreeMap<Integer,IntegerToBoolean>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3196)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3208)
    public IntegerToBoolean getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof Integer)
                return(value.get((Integer) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3223)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                IntegerToBoolean val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3240)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof Integer)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

