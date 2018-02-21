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
 * The DmcTypeCheckAttributesBasedOnValueRuleDataREFMAP provides storage for a map of CheckAttributesBasedOnValueRuleDataREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2867)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeCheckAttributesBasedOnValueRuleDataREFMAP extends DmcTypeCheckAttributesBasedOnValueRuleDataREF<CheckAttributesBasedOnValueRuleDataREF,RuleName> {
public class DmcTypeCheckAttributesBasedOnValueRuleDataREFMAP extends DmcTypeCheckAttributesBasedOnValueRuleDataREF implements Serializable {
    
    private final static Iterator<CheckAttributesBasedOnValueRuleDataREF> emptyList = (new HashMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>()).values().iterator();
    
    protected Map<RuleName,CheckAttributesBasedOnValueRuleDataREF> value;
    
    public DmcTypeCheckAttributesBasedOnValueRuleDataREFMAP(){
        value = null;
    }
    
    public DmcTypeCheckAttributesBasedOnValueRuleDataREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>();
        else
            value = new TreeMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>();
    }
    
    public RuleName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<RuleName,CheckAttributesBasedOnValueRuleDataREF> map = (TreeMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeCheckAttributesBasedOnValueRuleDataREFMAP getNew(){
        return(new DmcTypeCheckAttributesBasedOnValueRuleDataREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2924)
    public DmcAttribute<CheckAttributesBasedOnValueRuleDataREF> cloneIt(){
        synchronized(this){
            DmcTypeCheckAttributesBasedOnValueRuleDataREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(CheckAttributesBasedOnValueRuleDataREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2944)
    public CheckAttributesBasedOnValueRuleDataREF add(Object v) throws DmcValueException {
        synchronized(this){
            CheckAttributesBasedOnValueRuleDataREF newval = typeCheck(v);
            if (value == null)
                initValue();
            RuleName key = (RuleName)((DmcMappedAttributeIF)newval).getKey();
            CheckAttributesBasedOnValueRuleDataREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2965)
    public CheckAttributesBasedOnValueRuleDataREF del(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2981)
    public Iterator<CheckAttributesBasedOnValueRuleDataREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<RuleName,CheckAttributesBasedOnValueRuleDataREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>(value);
            else
                clone = new TreeMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2998)
    public Map<RuleName,CheckAttributesBasedOnValueRuleDataREF> getMVCopy(){
        synchronized(this){
            Map<RuleName,CheckAttributesBasedOnValueRuleDataREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>();
                else
                    clone = new HashMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>();
                else
                    clone = new TreeMap<RuleName,CheckAttributesBasedOnValueRuleDataREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3019)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3031)
    public CheckAttributesBasedOnValueRuleDataREF getByKey(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3046)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                CheckAttributesBasedOnValueRuleDataREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3063)
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

