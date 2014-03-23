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
package org.dmd.dmv.shared.generated.types;

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
import org.dmd.dmc.types.RuleName;    // key type import
/**
 * The DmcTypeValueLengthRuleDataREFMAP provides storage for a map of ValueLengthRuleDataREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2858)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeValueLengthRuleDataREFMAP extends DmcTypeValueLengthRuleDataREF<ValueLengthRuleDataREF,RuleName> {
public class DmcTypeValueLengthRuleDataREFMAP extends DmcTypeValueLengthRuleDataREF implements Serializable {
    
    private final static Iterator<ValueLengthRuleDataREF> emptyList = (new HashMap<RuleName,ValueLengthRuleDataREF>()).values().iterator();
    
    protected Map<RuleName,ValueLengthRuleDataREF> value;
    
    public DmcTypeValueLengthRuleDataREFMAP(){
        value = null;
    }
    
    public DmcTypeValueLengthRuleDataREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<RuleName,ValueLengthRuleDataREF>();
        else
            value = new TreeMap<RuleName,ValueLengthRuleDataREF>();
    }
    
    public RuleName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<RuleName,ValueLengthRuleDataREF> map = (TreeMap<RuleName,ValueLengthRuleDataREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeValueLengthRuleDataREFMAP getNew(){
        return(new DmcTypeValueLengthRuleDataREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2915)
    public DmcAttribute<ValueLengthRuleDataREF> cloneIt(){
        synchronized(this){
            DmcTypeValueLengthRuleDataREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ValueLengthRuleDataREF val: value.values())
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
    public ValueLengthRuleDataREF add(Object v) throws DmcValueException {
        synchronized(this){
            ValueLengthRuleDataREF newval = typeCheck(v);
            if (value == null)
                initValue();
            RuleName key = (RuleName)((DmcMappedAttributeIF)newval).getKey();
            ValueLengthRuleDataREF oldval = value.put(key,newval);
            
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
    public ValueLengthRuleDataREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof RuleName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2972)
    public Iterator<ValueLengthRuleDataREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<RuleName,ValueLengthRuleDataREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<RuleName,ValueLengthRuleDataREF>(value);
            else
                clone = new TreeMap<RuleName,ValueLengthRuleDataREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2989)
    public Map<RuleName,ValueLengthRuleDataREF> getMVCopy(){
        synchronized(this){
            Map<RuleName,ValueLengthRuleDataREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<RuleName,ValueLengthRuleDataREF>();
                else
                    clone = new HashMap<RuleName,ValueLengthRuleDataREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<RuleName,ValueLengthRuleDataREF>();
                else
                    clone = new TreeMap<RuleName,ValueLengthRuleDataREF>(value);
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
    public ValueLengthRuleDataREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof RuleName)
                return(value.get((RuleName) key));
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
                ValueLengthRuleDataREF val = typeCheck(v);
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
    
           if (key instanceof RuleName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

