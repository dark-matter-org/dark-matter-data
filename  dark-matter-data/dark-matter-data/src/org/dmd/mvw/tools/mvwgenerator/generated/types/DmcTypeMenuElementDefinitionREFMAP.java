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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

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
import org.dmd.dmc.types.CamelCaseName;    // key type import
/**
 * The DmcTypeMenuElementDefinitionREFMAP provides storage for a map of MenuElementDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2627)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
// public class DmcTypeMenuElementDefinitionREFMAP extends DmcTypeMenuElementDefinitionREF<MenuElementDefinitionREF,CamelCaseName> {
public class DmcTypeMenuElementDefinitionREFMAP extends DmcTypeMenuElementDefinitionREF implements Serializable {
    
    protected Map<CamelCaseName,MenuElementDefinitionREF> value;
    
    public DmcTypeMenuElementDefinitionREFMAP(){
        value = null;
    }
    
    public DmcTypeMenuElementDefinitionREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<CamelCaseName,MenuElementDefinitionREF>();
        else
            value = new TreeMap<CamelCaseName,MenuElementDefinitionREF>();
    }
    
    @Override
    public DmcTypeMenuElementDefinitionREFMAP getNew(){
        return(new DmcTypeMenuElementDefinitionREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2670)
    public DmcAttribute<MenuElementDefinitionREF> cloneIt(){
        synchronized(this){
            DmcTypeMenuElementDefinitionREFMAP rc = getNew();
            for(MenuElementDefinitionREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2686)
    public MenuElementDefinitionREF add(Object v) throws DmcValueException {
        synchronized(this){
            MenuElementDefinitionREF newval = typeCheck(v);
            if (value == null)
                initValue();
            CamelCaseName key = (CamelCaseName)((DmcMappedAttributeIF)newval).getKey();
            MenuElementDefinitionREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2707)
    public MenuElementDefinitionREF del(Object key){
        synchronized(this){
           if (key instanceof CamelCaseName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2719)
    public Iterator<MenuElementDefinitionREF> getMV(){
        synchronized(this){
            Map<CamelCaseName,MenuElementDefinitionREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<CamelCaseName,MenuElementDefinitionREF>(value);
            else
                clone = new TreeMap<CamelCaseName,MenuElementDefinitionREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2732)
    public Map<CamelCaseName,MenuElementDefinitionREF> getMVCopy(){
        synchronized(this){
            Map<CamelCaseName,MenuElementDefinitionREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<CamelCaseName,MenuElementDefinitionREF>(value);
            else
                clone = new TreeMap<CamelCaseName,MenuElementDefinitionREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2745)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2757)
    public MenuElementDefinitionREF getByKey(Object key){
        synchronized(this){
            if (key instanceof CamelCaseName)
                return(value.get(key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2769)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                MenuElementDefinitionREF val = typeCheck(v);
                rc = value.containsValue(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2784)
    public boolean containsKey(Object key){
        synchronized(this){
            boolean rc = false;
           if (key instanceof CamelCaseName)
                rc = value.containsKey(key);
            return(rc);
        }
    }
    
}

