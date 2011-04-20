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
package org.dmd.features.extgwt.generated.types;

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
import org.dmd.dmc.types.StringName;    // key type import
/**
 * The DmcTypeMvcRegistryItemREFMAP provides storage for a map of MvcRegistryItemREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2171)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:464)
 */
@SuppressWarnings("serial")
// public class DmcTypeMvcRegistryItemREFMAP extends DmcTypeMvcRegistryItemREF<MvcRegistryItemREF,StringName> {
public class DmcTypeMvcRegistryItemREFMAP extends DmcTypeMvcRegistryItemREF implements Serializable {
    
    Map<StringName,MvcRegistryItemREF> value;
    
    public DmcTypeMvcRegistryItemREFMAP(){
        value = null;
    }
    
    public DmcTypeMvcRegistryItemREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,MvcRegistryItemREF>();
        else
            value = new TreeMap<StringName,MvcRegistryItemREF>();
    }
    
    @Override
    public DmcTypeMvcRegistryItemREFMAP getNew(){
        return(new DmcTypeMvcRegistryItemREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<MvcRegistryItemREF> cloneIt(){
        DmcTypeMvcRegistryItemREFMAP rc = getNew();
        for(MvcRegistryItemREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public MvcRegistryItemREF add(Object v) throws DmcValueException {
        MvcRegistryItemREF newval = typeCheck(v);
        if (value == null)
            initValue();
        StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
        MvcRegistryItemREF oldval = value.put(key,newval);
        
        if (oldval != null){
            // We had a value with this key, ensure that the value actually changed
            if (oldval.valuesAreEqual(newval))
                newval = null;
        }
        
        return(newval);
    }
    
    @Override
    public MvcRegistryItemREF del(Object key){
        if (key instanceof StringName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<MvcRegistryItemREF> getMV(){
        Map<StringName,MvcRegistryItemREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<StringName,MvcRegistryItemREF>(value);
        else
            clone = new TreeMap<StringName,MvcRegistryItemREF>(value);
        return(clone.values().iterator());
    }
    
    public Map<StringName,MvcRegistryItemREF> getMVCopy(){
        Map<StringName,MvcRegistryItemREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<StringName,MvcRegistryItemREF>(value);
        else
            clone = new TreeMap<StringName,MvcRegistryItemREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public MvcRegistryItemREF getByKey(Object key){
        if (key instanceof StringName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            MvcRegistryItemREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof StringName)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

