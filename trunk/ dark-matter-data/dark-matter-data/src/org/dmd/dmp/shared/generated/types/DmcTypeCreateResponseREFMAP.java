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
package org.dmd.dmp.shared.generated.types;

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
import org.dmd.dmc.types.IntegerName;    // key type import
/**
 * The DmcTypeCreateResponseREFMAP provides storage for a map of CreateResponseREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1864)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:444)
 */
@SuppressWarnings("serial")
// public class DmcTypeCreateResponseREFMAP extends DmcTypeCreateResponseREF<CreateResponseREF,IntegerName> {
public class DmcTypeCreateResponseREFMAP extends DmcTypeCreateResponseREF implements Serializable {
    
    Map<IntegerName,CreateResponseREF> value;
    
    public DmcTypeCreateResponseREFMAP(){
        value = null;
    }
    
    public DmcTypeCreateResponseREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<IntegerName,CreateResponseREF>();
        else
            value = new TreeMap<IntegerName,CreateResponseREF>();
    }
    
    @Override
    public DmcTypeCreateResponseREFMAP getNew(){
        return(new DmcTypeCreateResponseREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<CreateResponseREF> cloneIt(){
        DmcTypeCreateResponseREFMAP rc = getNew();
        for(CreateResponseREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public CreateResponseREF add(Object v) throws DmcValueException {
        CreateResponseREF newval = typeCheck(v);
        if (value == null)
            initValue();
        IntegerName key = (IntegerName)((DmcMappedAttributeIF)newval).getKey();
        CreateResponseREF oldval = value.put(key,newval);
        
        if (oldval != null){
            // We had a value with this key, ensure that the value actually changed
            if (oldval.valuesAreEqual(newval))
                newval = null;
        }
        
        return(newval);
    }
    
    @Override
    public CreateResponseREF del(Object key){
        if (key instanceof IntegerName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<CreateResponseREF> getMV(){
        Map<IntegerName,CreateResponseREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<IntegerName,CreateResponseREF>(value);
        else
            clone = new TreeMap<IntegerName,CreateResponseREF>(value);
        return(clone.values().iterator());
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public CreateResponseREF getByKey(Object key){
        if (key instanceof IntegerName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            CreateResponseREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof IntegerName)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

