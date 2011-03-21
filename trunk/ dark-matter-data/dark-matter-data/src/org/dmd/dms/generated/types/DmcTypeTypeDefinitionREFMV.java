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
 * The DmcTypeTypeDefinitionREFMV provides storage for a multi-valued TypeDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1181)
 */
@SuppressWarnings("serial")
// public class DmcTypeTypeDefinitionREFMV extends DmcTypeTypeDefinitionREF<TypeDefinitionREF,StringName> {
public class DmcTypeTypeDefinitionREFMV extends DmcTypeTypeDefinitionREF {
    
    ArrayList<TypeDefinitionREF> value;
    
    public DmcTypeTypeDefinitionREFMV(){
    
    }
    
    public DmcTypeTypeDefinitionREFMV(DmcAttributeInfo ai){
        super(ai);
        value = new ArrayList<TypeDefinitionREF>();
    }
    
    public DmcTypeTypeDefinitionREFMV getNew(){
        return(new DmcTypeTypeDefinitionREFMV(attrInfo));
    }
    
    public TypeDefinitionREF set(Object v) throws DmcValueException {
        throw(new IllegalStateException("The set() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public TypeDefinitionREF getSV(){
        throw(new IllegalStateException("The getSV() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public TypeDefinitionREF add(Object v) throws DmcValueException {
        TypeDefinitionREF rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public TypeDefinitionREF del(Object v){
        TypeDefinitionREF rc = null;
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
    
    public Iterator<TypeDefinitionREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TypeDefinitionREF getMVnth(int i){
        return(value.get(i));
    }
    
    public TypeDefinitionREF getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for a MULTI attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TypeDefinitionREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

