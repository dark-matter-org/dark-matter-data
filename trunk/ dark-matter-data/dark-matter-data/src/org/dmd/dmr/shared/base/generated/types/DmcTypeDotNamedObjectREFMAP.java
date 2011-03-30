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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1571)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:563)
 */
@SuppressWarnings("serial")
// public class DmcTypeDotNamedObjectREFMAP extends DmcTypeDotNamedObjectREF<DotNamedObjectREF,FullyQualifiedName> {
public class DmcTypeDotNamedObjectREFMAP extends DmcTypeDotNamedObjectREF {
    
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
    
    public DotNamedObjectREF add(Object v) throws DmcValueException {
        DotNamedObjectREF rc = typeCheck(v);
        if (value == null)
            initValue();
        FullyQualifiedName key = (FullyQualifiedName)((DmcMappedAttributeIF)rc).getKey();
        value.put(key,rc);
        return(rc);
    }
    
    public DotNamedObjectREF del(Object key){
        if (key instanceof FullyQualifiedName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public Iterator<DotNamedObjectREF> getMV(){
        return(value.values().iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public DotNamedObjectREF getByKey(Object key){
        if (key instanceof FullyQualifiedName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            DotNamedObjectREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

