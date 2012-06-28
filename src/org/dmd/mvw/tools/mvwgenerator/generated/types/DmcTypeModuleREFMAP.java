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
 * The DmcTypeModuleREFMAP provides storage for a map of ModuleREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2756)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeModuleREFMAP extends DmcTypeModuleREF<ModuleREF,CamelCaseName> {
public class DmcTypeModuleREFMAP extends DmcTypeModuleREF implements Serializable {
    
    protected Map<CamelCaseName,ModuleREF> value;
    
    public DmcTypeModuleREFMAP(){
        value = null;
    }
    
    public DmcTypeModuleREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<CamelCaseName,ModuleREF>();
        else
            value = new TreeMap<CamelCaseName,ModuleREF>();
    }
    
    public CamelCaseName firstKey(){
        if (attrInfo.valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<CamelCaseName,ModuleREF> map = (TreeMap<CamelCaseName,ModuleREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + attrInfo.name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeModuleREFMAP getNew(){
        return(new DmcTypeModuleREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2810)
    public DmcAttribute<ModuleREF> cloneIt(){
        synchronized(this){
            DmcTypeModuleREFMAP rc = getNew();
            for(ModuleREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2826)
    public ModuleREF add(Object v) throws DmcValueException {
        synchronized(this){
            ModuleREF newval = typeCheck(v);
            if (value == null)
                initValue();
            CamelCaseName key = (CamelCaseName)((DmcMappedAttributeIF)newval).getKey();
            ModuleREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2847)
    public ModuleREF del(Object key){
        synchronized(this){
           if (key instanceof CamelCaseName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2859)
    public Iterator<ModuleREF> getMV(){
        synchronized(this){
            Map<CamelCaseName,ModuleREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<CamelCaseName,ModuleREF>(value);
            else
                clone = new TreeMap<CamelCaseName,ModuleREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2872)
    public Map<CamelCaseName,ModuleREF> getMVCopy(){
        synchronized(this){
            Map<CamelCaseName,ModuleREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<CamelCaseName,ModuleREF>(value);
            else
                clone = new TreeMap<CamelCaseName,ModuleREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2885)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2897)
    public ModuleREF getByKey(Object key){
        synchronized(this){
            if (key instanceof CamelCaseName)
                return(value.get((CamelCaseName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2909)
    public boolean contains(Object v){
        synchronized(this){
            try {
                ModuleREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2930)
    public boolean containsKey(Object key){
        synchronized(this){
           if (key instanceof CamelCaseName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

