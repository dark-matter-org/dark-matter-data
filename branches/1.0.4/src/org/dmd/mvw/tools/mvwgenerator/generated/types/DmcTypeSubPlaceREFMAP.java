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
 * The DmcTypeSubPlaceREFMAP provides storage for a map of SubPlaceREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2800)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeSubPlaceREFMAP extends DmcTypeSubPlaceREF<SubPlaceREF,CamelCaseName> {
public class DmcTypeSubPlaceREFMAP extends DmcTypeSubPlaceREF implements Serializable {
    
    private final static Iterator<SubPlaceREF> emptyList = (new HashMap<CamelCaseName,SubPlaceREF>()).values().iterator();
    
    protected Map<CamelCaseName,SubPlaceREF> value;
    
    public DmcTypeSubPlaceREFMAP(){
        value = null;
    }
    
    public DmcTypeSubPlaceREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<CamelCaseName,SubPlaceREF>();
        else
            value = new TreeMap<CamelCaseName,SubPlaceREF>();
    }
    
    public CamelCaseName firstKey(){
        if (attrInfo.valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<CamelCaseName,SubPlaceREF> map = (TreeMap<CamelCaseName,SubPlaceREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + attrInfo.name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeSubPlaceREFMAP getNew(){
        return(new DmcTypeSubPlaceREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2857)
    public DmcAttribute<SubPlaceREF> cloneIt(){
        synchronized(this){
            DmcTypeSubPlaceREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(SubPlaceREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2877)
    public SubPlaceREF add(Object v) throws DmcValueException {
        synchronized(this){
            SubPlaceREF newval = typeCheck(v);
            if (value == null)
                initValue();
            CamelCaseName key = (CamelCaseName)((DmcMappedAttributeIF)newval).getKey();
            SubPlaceREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2898)
    public SubPlaceREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof CamelCaseName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2914)
    public Iterator<SubPlaceREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<CamelCaseName,SubPlaceREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<CamelCaseName,SubPlaceREF>(value);
            else
                clone = new TreeMap<CamelCaseName,SubPlaceREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2931)
    public Map<CamelCaseName,SubPlaceREF> getMVCopy(){
        synchronized(this){
            Map<CamelCaseName,SubPlaceREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<CamelCaseName,SubPlaceREF>();
                else
                    clone = new HashMap<CamelCaseName,SubPlaceREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<CamelCaseName,SubPlaceREF>();
                else
                    clone = new TreeMap<CamelCaseName,SubPlaceREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2952)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2964)
    public SubPlaceREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof CamelCaseName)
                return(value.get((CamelCaseName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2979)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                SubPlaceREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2996)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof CamelCaseName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}
