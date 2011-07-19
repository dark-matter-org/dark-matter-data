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
 * The DmcTypeSubMenuREFMAP provides storage for a map of SubMenuREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2483)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:503)
 */
@SuppressWarnings("serial")
// public class DmcTypeSubMenuREFMAP extends DmcTypeSubMenuREF<SubMenuREF,CamelCaseName> {
public class DmcTypeSubMenuREFMAP extends DmcTypeSubMenuREF implements Serializable {
    
    Map<CamelCaseName,SubMenuREF> value;
    
    public DmcTypeSubMenuREFMAP(){
        value = null;
    }
    
    public DmcTypeSubMenuREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<CamelCaseName,SubMenuREF>();
        else
            value = new TreeMap<CamelCaseName,SubMenuREF>();
    }
    
    @Override
    public DmcTypeSubMenuREFMAP getNew(){
        return(new DmcTypeSubMenuREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2526)
    public DmcAttribute<SubMenuREF> cloneIt(){
        synchronized(this){
            DmcTypeSubMenuREFMAP rc = getNew();
            for(SubMenuREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2542)
    public SubMenuREF add(Object v) throws DmcValueException {
        synchronized(this){
            SubMenuREF newval = typeCheck(v);
            if (value == null)
                initValue();
            CamelCaseName key = (CamelCaseName)((DmcMappedAttributeIF)newval).getKey();
            SubMenuREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2563)
    public SubMenuREF del(Object key){
        synchronized(this){
           if (key instanceof CamelCaseName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2575)
    public Iterator<SubMenuREF> getMV(){
        synchronized(this){
            Map<CamelCaseName,SubMenuREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<CamelCaseName,SubMenuREF>(value);
            else
                clone = new TreeMap<CamelCaseName,SubMenuREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2588)
    public Map<CamelCaseName,SubMenuREF> getMVCopy(){
        synchronized(this){
            Map<CamelCaseName,SubMenuREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<CamelCaseName,SubMenuREF>(value);
            else
                clone = new TreeMap<CamelCaseName,SubMenuREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2601)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2613)
    public SubMenuREF getByKey(Object key){
        synchronized(this){
            if (key instanceof CamelCaseName)
                return(value.get(key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2625)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                SubMenuREF val = typeCheck(v);
                rc = value.containsValue(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2640)
    public boolean containsKey(Object key){
        synchronized(this){
            boolean rc = false;
           if (key instanceof CamelCaseName)
                rc = value.containsKey(key);
            return(rc);
        }
    }
    
}

