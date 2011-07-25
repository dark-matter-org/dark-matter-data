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
 * The DmcTypeMvcToolBarREFMAP provides storage for a map of MvcToolBarREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2500)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:503)
 */
@SuppressWarnings("serial")
// public class DmcTypeMvcToolBarREFMAP extends DmcTypeMvcToolBarREF<MvcToolBarREF,StringName> {
public class DmcTypeMvcToolBarREFMAP extends DmcTypeMvcToolBarREF implements Serializable {
    
    Map<StringName,MvcToolBarREF> value;
    
    public DmcTypeMvcToolBarREFMAP(){
        value = null;
    }
    
    public DmcTypeMvcToolBarREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,MvcToolBarREF>();
        else
            value = new TreeMap<StringName,MvcToolBarREF>();
    }
    
    @Override
    public DmcTypeMvcToolBarREFMAP getNew(){
        return(new DmcTypeMvcToolBarREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2543)
    public DmcAttribute<MvcToolBarREF> cloneIt(){
        synchronized(this){
            DmcTypeMvcToolBarREFMAP rc = getNew();
            for(MvcToolBarREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2559)
    public MvcToolBarREF add(Object v) throws DmcValueException {
        synchronized(this){
            MvcToolBarREF newval = typeCheck(v);
            if (value == null)
                initValue();
            StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
            MvcToolBarREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2580)
    public MvcToolBarREF del(Object key){
        synchronized(this){
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2592)
    public Iterator<MvcToolBarREF> getMV(){
        synchronized(this){
            Map<StringName,MvcToolBarREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,MvcToolBarREF>(value);
            else
                clone = new TreeMap<StringName,MvcToolBarREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2605)
    public Map<StringName,MvcToolBarREF> getMVCopy(){
        synchronized(this){
            Map<StringName,MvcToolBarREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,MvcToolBarREF>(value);
            else
                clone = new TreeMap<StringName,MvcToolBarREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2618)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2630)
    public MvcToolBarREF getByKey(Object key){
        synchronized(this){
            if (key instanceof StringName)
                return(value.get(key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2642)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                MvcToolBarREF val = typeCheck(v);
                rc = value.containsValue(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2657)
    public boolean containsKey(Object key){
        synchronized(this){
            boolean rc = false;
           if (key instanceof StringName)
                rc = value.containsKey(key);
            return(rc);
        }
    }
    
}

