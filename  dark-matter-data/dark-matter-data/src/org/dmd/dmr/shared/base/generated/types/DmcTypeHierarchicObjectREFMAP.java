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
package org.dmd.dmr.shared.base.generated.types;

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
import org.dmd.dmc.types.FullyQualifiedName;    // key type import
/**
 * The DmcTypeHierarchicObjectREFMAP provides storage for a map of HierarchicObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2682)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeHierarchicObjectREFMAP extends DmcTypeHierarchicObjectREF<HierarchicObjectREF,FullyQualifiedName> {
public class DmcTypeHierarchicObjectREFMAP extends DmcTypeHierarchicObjectREF implements Serializable {
    
    protected Map<FullyQualifiedName,HierarchicObjectREF> value;
    
    public DmcTypeHierarchicObjectREFMAP(){
        value = null;
    }
    
    public DmcTypeHierarchicObjectREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<FullyQualifiedName,HierarchicObjectREF>();
        else
            value = new TreeMap<FullyQualifiedName,HierarchicObjectREF>();
    }
    
    public FullyQualifiedName firstKey(){
        if (attrInfo.valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<FullyQualifiedName,HierarchicObjectREF> map = (TreeMap<FullyQualifiedName,HierarchicObjectREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + attrInfo.name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeHierarchicObjectREFMAP getNew(){
        return(new DmcTypeHierarchicObjectREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2736)
    public DmcAttribute<HierarchicObjectREF> cloneIt(){
        synchronized(this){
            DmcTypeHierarchicObjectREFMAP rc = getNew();
            for(HierarchicObjectREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2752)
    public HierarchicObjectREF add(Object v) throws DmcValueException {
        synchronized(this){
            HierarchicObjectREF newval = typeCheck(v);
            if (value == null)
                initValue();
            FullyQualifiedName key = (FullyQualifiedName)((DmcMappedAttributeIF)newval).getKey();
            HierarchicObjectREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2773)
    public HierarchicObjectREF del(Object key){
        synchronized(this){
           if (key instanceof FullyQualifiedName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2785)
    public Iterator<HierarchicObjectREF> getMV(){
        synchronized(this){
            Map<FullyQualifiedName,HierarchicObjectREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<FullyQualifiedName,HierarchicObjectREF>(value);
            else
                clone = new TreeMap<FullyQualifiedName,HierarchicObjectREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2798)
    public Map<FullyQualifiedName,HierarchicObjectREF> getMVCopy(){
        synchronized(this){
            Map<FullyQualifiedName,HierarchicObjectREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<FullyQualifiedName,HierarchicObjectREF>(value);
            else
                clone = new TreeMap<FullyQualifiedName,HierarchicObjectREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2811)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2823)
    public HierarchicObjectREF getByKey(Object key){
        synchronized(this){
            if (key instanceof FullyQualifiedName)
                return(value.get((FullyQualifiedName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2835)
    public boolean contains(Object v){
        synchronized(this){
            try {
                HierarchicObjectREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2856)
    public boolean containsKey(Object key){
        synchronized(this){
           if (key instanceof FullyQualifiedName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

