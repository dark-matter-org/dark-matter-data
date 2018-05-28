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
import org.dmd.dmc.types.DmcTypeStringToString;    // base type import
import org.dmd.dmc.types.StringToString;    // primitive import
/**
 * The DmcTypeStringToStringMAP provides storage for a map of StringToString
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3024)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:679)
 */
@SuppressWarnings("serial")
// public class DmcTypeStringToStringMAP extends DmcTypeStringToString<StringToString> {
public class DmcTypeStringToStringMAP extends DmcTypeStringToString implements Serializable {
    
    private final static Iterator<StringToString> emptyList = (new HashMap<String,StringToString>()).values().iterator();
    
    protected Map<String,StringToString> value;
    
    public DmcTypeStringToStringMAP(){
        value = null;
    }
    
    public DmcTypeStringToStringMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<String,StringToString>();
        else
            value = new TreeMap<String,StringToString>();
    }
    
    public String firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<String,StringToString> map = (TreeMap<String,StringToString>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeStringToStringMAP getNew(){
        return(new DmcTypeStringToStringMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3081)
    public DmcAttribute<StringToString> cloneIt(){
        synchronized(this){
            DmcTypeStringToStringMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(StringToString val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3101)
    public StringToString add(Object v) throws DmcValueException {
        synchronized(this){
            StringToString newval = typeCheck(v);
            if (value == null)
                initValue();
            String key = (String)((DmcMappedAttributeIF)newval).getKey();
            StringToString oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3122)
    public StringToString del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof String)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3138)
    public Iterator<StringToString> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<String,StringToString> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<String,StringToString>(value);
            else
                clone = new TreeMap<String,StringToString>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3155)
    public Map<String,StringToString> getMVCopy(){
        synchronized(this){
            Map<String,StringToString> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<String,StringToString>();
                else
                    clone = new HashMap<String,StringToString>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<String,StringToString>();
                else
                    clone = new TreeMap<String,StringToString>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3176)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3188)
    public StringToString getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof String)
                return(value.get((String) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3203)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                StringToString val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3220)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof String)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

