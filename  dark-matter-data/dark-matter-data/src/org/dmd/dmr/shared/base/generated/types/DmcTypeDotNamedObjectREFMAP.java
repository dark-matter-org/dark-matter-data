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
 * The DmcTypeDotNamedObjectREFMAP provides storage for a map of DotNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2057)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:450)
 */
@SuppressWarnings("serial")
// public class DmcTypeDotNamedObjectREFMAP extends DmcTypeDotNamedObjectREF<DotNamedObjectREF,FullyQualifiedName> {
public class DmcTypeDotNamedObjectREFMAP extends DmcTypeDotNamedObjectREF implements Serializable {
    
    Map<FullyQualifiedName,DotNamedObjectREF> value;
    
    public DmcTypeDotNamedObjectREFMAP(){
        value = null;
    }
    
    public DmcTypeDotNamedObjectREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<FullyQualifiedName,DotNamedObjectREF>();
        else
            value = new TreeMap<FullyQualifiedName,DotNamedObjectREF>();
    }
    
    @Override
    public DmcTypeDotNamedObjectREFMAP getNew(){
        return(new DmcTypeDotNamedObjectREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<DotNamedObjectREF> cloneIt(){
        DmcTypeDotNamedObjectREFMAP rc = getNew();
        for(DotNamedObjectREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public DotNamedObjectREF add(Object v) throws DmcValueException {
        DotNamedObjectREF newval = typeCheck(v);
        if (value == null)
            initValue();
        FullyQualifiedName key = (FullyQualifiedName)((DmcMappedAttributeIF)newval).getKey();
        DotNamedObjectREF oldval = value.put(key,newval);
        
        if (oldval != null){
            // We had a value with this key, ensure that the value actually changed
            if (oldval.valuesAreEqual(newval))
                newval = null;
        }
        
        return(newval);
    }
    
    @Override
    public DotNamedObjectREF del(Object key){
        if (key instanceof FullyQualifiedName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<DotNamedObjectREF> getMV(){
        Map<FullyQualifiedName,DotNamedObjectREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<FullyQualifiedName,DotNamedObjectREF>(value);
        else
            clone = new TreeMap<FullyQualifiedName,DotNamedObjectREF>(value);
        return(clone.values().iterator());
    }
    
    public Map<FullyQualifiedName,DotNamedObjectREF> getMVCopy(){
        Map<FullyQualifiedName,DotNamedObjectREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<FullyQualifiedName,DotNamedObjectREF>(value);
        else
            clone = new TreeMap<FullyQualifiedName,DotNamedObjectREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public DotNamedObjectREF getByKey(Object key){
        if (key instanceof FullyQualifiedName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            DotNamedObjectREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof FullyQualifiedName)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

