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
 * The DmcTypeHierarchicObjectREFMAP provides storage for a map of HierarchicObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1852)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:444)
 */
@SuppressWarnings("serial")
// public class DmcTypeHierarchicObjectREFMAP extends DmcTypeHierarchicObjectREF<HierarchicObjectREF,FullyQualifiedName> {
public class DmcTypeHierarchicObjectREFMAP extends DmcTypeHierarchicObjectREF implements Serializable {
    
    Map<FullyQualifiedName,HierarchicObjectREF> value;
    
    public DmcTypeHierarchicObjectREFMAP(){
        value = null;
    }
    
    public DmcTypeHierarchicObjectREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<FullyQualifiedName,HierarchicObjectREF>();
        else
            value = new TreeMap<FullyQualifiedName,HierarchicObjectREF>();
    }
    
    public DmcTypeHierarchicObjectREFMAP getNew(){
        return(new DmcTypeHierarchicObjectREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<HierarchicObjectREF> cloneIt(){
        DmcTypeHierarchicObjectREFMAP rc = getNew();
        for(HierarchicObjectREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public HierarchicObjectREF add(Object v) throws DmcValueException {
        HierarchicObjectREF rc = typeCheck(v);
        if (value == null)
            initValue();
        FullyQualifiedName key = (FullyQualifiedName)((DmcMappedAttributeIF)rc).getKey();
        value.put(key,rc);
        return(rc);
    }
    
    public HierarchicObjectREF del(Object key){
        if (key instanceof FullyQualifiedName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public Iterator<HierarchicObjectREF> getMV(){
        return(value.values().iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public HierarchicObjectREF getByKey(Object key){
        if (key instanceof FullyQualifiedName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            HierarchicObjectREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

