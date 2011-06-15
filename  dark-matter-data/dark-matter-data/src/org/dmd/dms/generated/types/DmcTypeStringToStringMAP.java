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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2245)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:259)
 */
@SuppressWarnings("serial")
// public class DmcTypeStringToStringMAP extends DmcTypeStringToString<StringToString> {
public class DmcTypeStringToStringMAP extends DmcTypeStringToString implements Serializable {
    
    Map<String,StringToString> value;
    
    public DmcTypeStringToStringMAP(){
        value = null;
    }
    
    public DmcTypeStringToStringMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<String,StringToString>();
        else
            value = new TreeMap<String,StringToString>();
    }
    
    @Override
    public DmcTypeStringToStringMAP getNew(){
        return(new DmcTypeStringToStringMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<StringToString> cloneIt(){
        DmcTypeStringToStringMAP rc = getNew();
        for(StringToString val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public StringToString add(Object v) throws DmcValueException {
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
    
    @Override
    public StringToString del(Object key){
        if (key instanceof String)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<StringToString> getMV(){
        Map<String,StringToString> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<String,StringToString>(value);
        else
            clone = new TreeMap<String,StringToString>(value);
        return(clone.values().iterator());
    }
    
    public Map<String,StringToString> getMVCopy(){
        Map<String,StringToString> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<String,StringToString>(value);
        else
            clone = new TreeMap<String,StringToString>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public StringToString getByKey(Object key){
        if (key instanceof String)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            StringToString val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof String)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

