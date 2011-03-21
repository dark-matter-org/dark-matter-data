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
 * The DmcTypeEnumDefinitionREFMV provides storage for a multi-valued EnumDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1181)
 */
@SuppressWarnings("serial")
// public class DmcTypeEnumDefinitionREFMV extends DmcTypeEnumDefinitionREF<EnumDefinitionREF,StringName> {
public class DmcTypeEnumDefinitionREFMV extends DmcTypeEnumDefinitionREF {
    
    ArrayList<EnumDefinitionREF> value;
    
    public DmcTypeEnumDefinitionREFMV(){
    
    }
    
    public DmcTypeEnumDefinitionREFMV(DmcAttributeInfo ai){
        super(ai);
        value = new ArrayList<EnumDefinitionREF>();
    }
    
    public DmcTypeEnumDefinitionREFMV getNew(){
        return(new DmcTypeEnumDefinitionREFMV(attrInfo));
    }
    
    public EnumDefinitionREF set(Object v) throws DmcValueException {
        throw(new IllegalStateException("The set() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public EnumDefinitionREF getSV(){
        throw(new IllegalStateException("The getSV() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public EnumDefinitionREF add(Object v) throws DmcValueException {
        EnumDefinitionREF rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public EnumDefinitionREF del(Object v){
        EnumDefinitionREF rc = null;
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
    
    public Iterator<EnumDefinitionREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public EnumDefinitionREF getMVnth(int i){
        return(value.get(i));
    }
    
    public EnumDefinitionREF getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            EnumDefinitionREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

