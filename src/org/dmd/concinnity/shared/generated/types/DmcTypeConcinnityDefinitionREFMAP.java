//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.concinnity.shared.generated.types;

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
import org.dmd.dmc.types.DefinitionName;    // key type import
/**
 * The DmcTypeConcinnityDefinitionREFMAP provides storage for a map of ConcinnityDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3024)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:538)
 */
@SuppressWarnings("serial")
// public class DmcTypeConcinnityDefinitionREFMAP extends DmcTypeConcinnityDefinitionREF<ConcinnityDefinitionREF,DefinitionName> {
public class DmcTypeConcinnityDefinitionREFMAP extends DmcTypeConcinnityDefinitionREF implements Serializable {
    
    private final static Iterator<ConcinnityDefinitionREF> emptyList = (new HashMap<DefinitionName,ConcinnityDefinitionREF>()).values().iterator();
    
    protected Map<DefinitionName,ConcinnityDefinitionREF> value;
    
    public DmcTypeConcinnityDefinitionREFMAP(){
        value = null;
    }
    
    public DmcTypeConcinnityDefinitionREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DefinitionName,ConcinnityDefinitionREF>();
        else
            value = new TreeMap<DefinitionName,ConcinnityDefinitionREF>();
    }
    
    public DefinitionName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DefinitionName,ConcinnityDefinitionREF> map = (TreeMap<DefinitionName,ConcinnityDefinitionREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeConcinnityDefinitionREFMAP getNew(){
        return(new DmcTypeConcinnityDefinitionREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3081)
    public DmcAttribute<ConcinnityDefinitionREF> cloneIt(){
        synchronized(this){
            DmcTypeConcinnityDefinitionREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ConcinnityDefinitionREF val: value.values())
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
    public ConcinnityDefinitionREF add(Object v) throws DmcValueException {
        synchronized(this){
            ConcinnityDefinitionREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DefinitionName key = (DefinitionName)((DmcMappedAttributeIF)newval).getKey();
            ConcinnityDefinitionREF oldval = value.put(key,newval);
            
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
    public ConcinnityDefinitionREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof DefinitionName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3138)
    public Iterator<ConcinnityDefinitionREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DefinitionName,ConcinnityDefinitionREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DefinitionName,ConcinnityDefinitionREF>(value);
            else
                clone = new TreeMap<DefinitionName,ConcinnityDefinitionREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3155)
    public Map<DefinitionName,ConcinnityDefinitionREF> getMVCopy(){
        synchronized(this){
            Map<DefinitionName,ConcinnityDefinitionREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DefinitionName,ConcinnityDefinitionREF>();
                else
                    clone = new HashMap<DefinitionName,ConcinnityDefinitionREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DefinitionName,ConcinnityDefinitionREF>();
                else
                    clone = new TreeMap<DefinitionName,ConcinnityDefinitionREF>(value);
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
    public ConcinnityDefinitionREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof DefinitionName)
                return(value.get((DefinitionName) key));
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
                ConcinnityDefinitionREF val = typeCheck(v);
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
    
           if (key instanceof DefinitionName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

