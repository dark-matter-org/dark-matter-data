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
package org.dmd.dmt.shared.generated.types;

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
 * The DmcTypeObjWithRefsDerivedBREFMAP provides storage for a map of ObjWithRefsDerivedBREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3041)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:538)
 */
@SuppressWarnings("serial")
// public class DmcTypeObjWithRefsDerivedBREFMAP extends DmcTypeObjWithRefsDerivedBREF<ObjWithRefsDerivedBREF,DefinitionName> {
public class DmcTypeObjWithRefsDerivedBREFMAP extends DmcTypeObjWithRefsDerivedBREF implements Serializable {
    
    private final static Iterator<ObjWithRefsDerivedBREF> emptyList = (new HashMap<DefinitionName,ObjWithRefsDerivedBREF>()).values().iterator();
    
    protected Map<DefinitionName,ObjWithRefsDerivedBREF> value;
    
    public DmcTypeObjWithRefsDerivedBREFMAP(){
        value = null;
    }
    
    public DmcTypeObjWithRefsDerivedBREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DefinitionName,ObjWithRefsDerivedBREF>();
        else
            value = new TreeMap<DefinitionName,ObjWithRefsDerivedBREF>();
    }
    
    public DefinitionName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DefinitionName,ObjWithRefsDerivedBREF> map = (TreeMap<DefinitionName,ObjWithRefsDerivedBREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeObjWithRefsDerivedBREFMAP getNew(){
        return(new DmcTypeObjWithRefsDerivedBREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3098)
    public DmcAttribute<ObjWithRefsDerivedBREF> cloneIt(){
        synchronized(this){
            DmcTypeObjWithRefsDerivedBREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ObjWithRefsDerivedBREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3118)
    public ObjWithRefsDerivedBREF add(Object v) throws DmcValueException {
        synchronized(this){
            ObjWithRefsDerivedBREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DefinitionName key = (DefinitionName)((DmcMappedAttributeIF)newval).getKey();
            ObjWithRefsDerivedBREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3139)
    public ObjWithRefsDerivedBREF del(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3155)
    public Iterator<ObjWithRefsDerivedBREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DefinitionName,ObjWithRefsDerivedBREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DefinitionName,ObjWithRefsDerivedBREF>(value);
            else
                clone = new TreeMap<DefinitionName,ObjWithRefsDerivedBREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3172)
    public Map<DefinitionName,ObjWithRefsDerivedBREF> getMVCopy(){
        synchronized(this){
            Map<DefinitionName,ObjWithRefsDerivedBREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DefinitionName,ObjWithRefsDerivedBREF>();
                else
                    clone = new HashMap<DefinitionName,ObjWithRefsDerivedBREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DefinitionName,ObjWithRefsDerivedBREF>();
                else
                    clone = new TreeMap<DefinitionName,ObjWithRefsDerivedBREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3193)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3205)
    public ObjWithRefsDerivedBREF getByKey(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3220)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                ObjWithRefsDerivedBREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3237)
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

