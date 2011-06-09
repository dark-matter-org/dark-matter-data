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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2240)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:498)
 */
@SuppressWarnings("serial")
// public class DmcTypeSubPlaceREFMAP extends DmcTypeSubPlaceREF<SubPlaceREF,CamelCaseName> {
public class DmcTypeSubPlaceREFMAP extends DmcTypeSubPlaceREF implements Serializable {
    
    Map<CamelCaseName,SubPlaceREF> value;
    
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
    
    @Override
    public DmcTypeSubPlaceREFMAP getNew(){
        return(new DmcTypeSubPlaceREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<SubPlaceREF> cloneIt(){
        DmcTypeSubPlaceREFMAP rc = getNew();
        for(SubPlaceREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public SubPlaceREF add(Object v) throws DmcValueException {
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
    
    @Override
    public SubPlaceREF del(Object key){
        if (key instanceof CamelCaseName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<SubPlaceREF> getMV(){
        Map<CamelCaseName,SubPlaceREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<CamelCaseName,SubPlaceREF>(value);
        else
            clone = new TreeMap<CamelCaseName,SubPlaceREF>(value);
        return(clone.values().iterator());
    }
    
    public Map<CamelCaseName,SubPlaceREF> getMVCopy(){
        Map<CamelCaseName,SubPlaceREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<CamelCaseName,SubPlaceREF>(value);
        else
            clone = new TreeMap<CamelCaseName,SubPlaceREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public SubPlaceREF getByKey(Object key){
        if (key instanceof CamelCaseName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            SubPlaceREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof CamelCaseName)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

