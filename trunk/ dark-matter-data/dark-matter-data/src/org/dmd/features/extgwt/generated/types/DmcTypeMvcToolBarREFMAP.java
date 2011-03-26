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
package org.dmd.features.extgwt.generated.types;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.StringName;    // key type import
/**
 * The DmcTypeMvcToolBarREFMAP provides storage for a map of MvcToolBarREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1559)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:563)
 */
@SuppressWarnings("serial")
// public class DmcTypeMvcToolBarREFMAP extends DmcTypeMvcToolBarREF<MvcToolBarREF,StringName> {
public class DmcTypeMvcToolBarREFMAP extends DmcTypeMvcToolBarREF {
    
    Map<StringName,MvcToolBarREF> value;
    
    public DmcTypeMvcToolBarREFMAP(){
        value = null;
    }
    
    public DmcTypeMvcToolBarREFMAP(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,MvcToolBarREF>();
        else
            value = new TreeMap<StringName,MvcToolBarREF>();
    }
    
    public DmcTypeMvcToolBarREFMAP getNew(){
        return(new DmcTypeMvcToolBarREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<MvcToolBarREF> cloneIt(){
        DmcTypeMvcToolBarREFMAP rc = getNew();
        for(MvcToolBarREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public MvcToolBarREF add(Object v) throws DmcValueException {
        MvcToolBarREF rc = typeCheck(v);
        StringName key = (StringName)((DmcMappedAttributeIF)rc).getKey();
        value.put(key,rc);
        return(rc);
    }
    
    public MvcToolBarREF del(Object key){
        if (key instanceof StringName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public Iterator<MvcToolBarREF> getMV(){
        return(value.values().iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public MvcToolBarREF getByKey(Object key){
        if (key instanceof StringName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            MvcToolBarREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

