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
package org.dmd.dms.generated.types;

import java.util.ArrayList;

import java.util.Iterator;

import org.dmd.dmc.DmcAttributeInfo;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;    // name attribute import
/**
 * The DmcTypeActionDefinitionREFMV provides storage for a multi-valued ActionDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1137)
 */
@SuppressWarnings("serial")
// public class DmcTypeActionDefinitionREFMV extends DmcTypeActionDefinitionREF<ActionDefinitionREF,StringName> {
public class DmcTypeActionDefinitionREFMV extends DmcTypeActionDefinitionREF {
    
    ArrayList<ActionDefinitionREF> value;
    
    public DmcTypeActionDefinitionREFMV(){
    
    }
    
    public DmcTypeActionDefinitionREFMV(DmcAttributeInfo ai){
        super(ai);
        value = new ArrayList<ActionDefinitionREF>();
    }
    
    public DmcTypeActionDefinitionREFMV getNew(){
        return(new DmcTypeActionDefinitionREFMV(attrInfo));
    }
    
    public ActionDefinitionREF set(Object v) throws DmcValueException {
        throw(new IllegalStateException("The set() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public ActionDefinitionREF getSV(){
        throw(new IllegalStateException("The getSV() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public ActionDefinitionREF add(Object v) throws DmcValueException {
        ActionDefinitionREF rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public ActionDefinitionREF del(Object v){
        ActionDefinitionREF rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else;
            rc = null;
        return(rc);
    }
    
    public Iterator<ActionDefinitionREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public ActionDefinitionREF getMVnth(int i){
        return(value.get(i));
    }
    
    public ActionDefinitionREF getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            ActionDefinitionREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

