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
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.DmcTypeIntegerToUUIDLite;    // base type import
import org.dmd.dmc.types.IntegerToUUIDLite;    // primitive import
/**
 * The DmcTypeIntegerToUUIDLiteMAP provides storage for a map of IntegerToUUIDLite
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2858)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:679)
 */
@SuppressWarnings("serial")
// public class DmcTypeIntegerToUUIDLiteMAP extends DmcTypeIntegerToUUIDLite<IntegerToUUIDLite> {
public class DmcTypeIntegerToUUIDLiteMAP extends DmcTypeIntegerToUUIDLite implements Serializable {
    
    private final static Iterator<IntegerToUUIDLite> emptyList = (new HashMap<Integer,IntegerToUUIDLite>()).values().iterator();
    
    protected Map<Integer,IntegerToUUIDLite> value;
    
    public DmcTypeIntegerToUUIDLiteMAP(){
        value = null;
    }
    
    public DmcTypeIntegerToUUIDLiteMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<Integer,IntegerToUUIDLite>();
        else
            value = new TreeMap<Integer,IntegerToUUIDLite>();
    }
    
    public Integer firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<Integer,IntegerToUUIDLite> map = (TreeMap<Integer,IntegerToUUIDLite>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeIntegerToUUIDLiteMAP getNew(){
        return(new DmcTypeIntegerToUUIDLiteMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2915)
    public DmcAttribute<IntegerToUUIDLite> cloneIt(){
        synchronized(this){
            DmcTypeIntegerToUUIDLiteMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(IntegerToUUIDLite val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2935)
    public IntegerToUUIDLite add(Object v) throws DmcValueException {
        synchronized(this){
            IntegerToUUIDLite newval = typeCheck(v);
            if (value == null)
                initValue();
            Integer key = (Integer)((DmcMappedAttributeIF)newval).getKey();
            IntegerToUUIDLite oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2956)
    public IntegerToUUIDLite del(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2972)
    public Iterator<IntegerToUUIDLite> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<Integer,IntegerToUUIDLite> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<Integer,IntegerToUUIDLite>(value);
            else
                clone = new TreeMap<Integer,IntegerToUUIDLite>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2989)
    public Map<Integer,IntegerToUUIDLite> getMVCopy(){
        synchronized(this){
            Map<Integer,IntegerToUUIDLite> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<Integer,IntegerToUUIDLite>();
                else
                    clone = new HashMap<Integer,IntegerToUUIDLite>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<Integer,IntegerToUUIDLite>();
                else
                    clone = new TreeMap<Integer,IntegerToUUIDLite>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3010)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3022)
    public IntegerToUUIDLite getByKey(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3037)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                IntegerToUUIDLite val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3054)
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

