//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010-2021 dark-matter-data committers
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
package org.dmd.dmr.shared.ldap.generated.types;

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
 * The DmcTypeLDAPHierarchicObjectREFMAP provides storage for a map of LDAPHierarchicObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3044)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:544)
 */
@SuppressWarnings("serial")
// public class DmcTypeLDAPHierarchicObjectREFMAP extends DmcTypeLDAPHierarchicObjectREF<LDAPHierarchicObjectREF,FullyQualifiedName> {
public class DmcTypeLDAPHierarchicObjectREFMAP extends DmcTypeLDAPHierarchicObjectREF implements Serializable {
    
    private final static Iterator<LDAPHierarchicObjectREF> emptyList = (new HashMap<FullyQualifiedName,LDAPHierarchicObjectREF>()).values().iterator();
    
    protected Map<FullyQualifiedName,LDAPHierarchicObjectREF> value;
    
    public DmcTypeLDAPHierarchicObjectREFMAP(){
        value = null;
    }
    
    public DmcTypeLDAPHierarchicObjectREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<FullyQualifiedName,LDAPHierarchicObjectREF>();
        else
            value = new TreeMap<FullyQualifiedName,LDAPHierarchicObjectREF>();
    }
    
    public FullyQualifiedName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<FullyQualifiedName,LDAPHierarchicObjectREF> map = (TreeMap<FullyQualifiedName,LDAPHierarchicObjectREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeLDAPHierarchicObjectREFMAP getNew(){
        return(new DmcTypeLDAPHierarchicObjectREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3101)
    public DmcAttribute<LDAPHierarchicObjectREF> cloneIt(){
        synchronized(this){
            DmcTypeLDAPHierarchicObjectREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(LDAPHierarchicObjectREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3121)
    public LDAPHierarchicObjectREF add(Object v) throws DmcValueException {
        synchronized(this){
            LDAPHierarchicObjectREF newval = typeCheck(v);
            if (value == null)
                initValue();
            FullyQualifiedName key = (FullyQualifiedName)((DmcMappedAttributeIF)newval).getKey();
            LDAPHierarchicObjectREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3142)
    public LDAPHierarchicObjectREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof FullyQualifiedName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3158)
    public Iterator<LDAPHierarchicObjectREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<FullyQualifiedName,LDAPHierarchicObjectREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<FullyQualifiedName,LDAPHierarchicObjectREF>(value);
            else
                clone = new TreeMap<FullyQualifiedName,LDAPHierarchicObjectREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3175)
    public Map<FullyQualifiedName,LDAPHierarchicObjectREF> getMVCopy(){
        synchronized(this){
            Map<FullyQualifiedName,LDAPHierarchicObjectREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<FullyQualifiedName,LDAPHierarchicObjectREF>();
                else
                    clone = new HashMap<FullyQualifiedName,LDAPHierarchicObjectREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<FullyQualifiedName,LDAPHierarchicObjectREF>();
                else
                    clone = new TreeMap<FullyQualifiedName,LDAPHierarchicObjectREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3196)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3208)
    public LDAPHierarchicObjectREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof FullyQualifiedName)
                return(value.get((FullyQualifiedName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3223)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                LDAPHierarchicObjectREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3240)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof FullyQualifiedName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

