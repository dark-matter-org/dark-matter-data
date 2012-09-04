//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.StringToString;    // base type import
import org.dmd.dmc.types.DmcTypeStringToString;    // DmcType import
/**
 * The DmcTypeStringToStringSET provides storage for a set of StringToString
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2571)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:633)
 */
@SuppressWarnings("serial")
public class DmcTypeStringToStringSET extends DmcTypeStringToString implements Serializable {
    
    protected Set<StringToString> value;
    
    public DmcTypeStringToStringSET(){
        value = null;
    }
    
    public DmcTypeStringToStringSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<StringToString>();
        else
            value = new TreeSet<StringToString>();
    }
    
    @Override
    public DmcTypeStringToStringSET getNew(){
        return(new DmcTypeStringToStringSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2608)
    public DmcAttribute<StringToString> cloneIt(){
        synchronized(this){
            DmcTypeStringToStringSET rc = getNew();
            for(StringToString val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2627)
    public StringToString add(Object v) throws DmcValueException {
        synchronized(this){
            StringToString rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2644)
    public StringToString del(Object v){
        synchronized(this){
            StringToString rc = null;
            if (value == null)
                return(rc);
            
            try {
                rc = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc)){
                value.remove(rc);
                if (value.size() == 0)
                    value = null;
            }
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2669)
    public Iterator<StringToString> getMV(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<StringToString>(value)).iterator() );
            else
                return( (new TreeSet<StringToString>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2686)
    public Set<StringToString> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return(new HashSet<StringToString>(value));
            else
                return(new TreeSet<StringToString>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2704)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2715)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                StringToString val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

