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
import org.dmd.dms.generated.enums.GPBScalarTypeEnum;    // DmcType import
/**
 * The DmcTypeGPBScalarTypeEnumSET provides storage for a set of GPBScalarTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2606)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:589)
 */
@SuppressWarnings("serial")
public class DmcTypeGPBScalarTypeEnumSET extends DmcTypeGPBScalarTypeEnum implements Serializable {
    
     private final static Iterator<GPBScalarTypeEnum> emptyList =  (new HashSet<GPBScalarTypeEnum>()).iterator();
    
    
    protected Set<GPBScalarTypeEnum> value;
    
    public DmcTypeGPBScalarTypeEnumSET(){
        value = null;
    }
    
    public DmcTypeGPBScalarTypeEnumSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<GPBScalarTypeEnum>();
        else
            value = new TreeSet<GPBScalarTypeEnum>();
    }
    
    @Override
    public DmcTypeGPBScalarTypeEnumSET getNew(){
        return(new DmcTypeGPBScalarTypeEnumSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2647)
    public DmcAttribute<GPBScalarTypeEnum> cloneIt(){
        synchronized(this){
            DmcTypeGPBScalarTypeEnumSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(GPBScalarTypeEnum val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2670)
    public GPBScalarTypeEnum add(Object v) throws DmcValueException {
        synchronized(this){
            GPBScalarTypeEnum rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2687)
    public GPBScalarTypeEnum del(Object v){
        synchronized(this){
            GPBScalarTypeEnum rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2712)
    public Iterator<GPBScalarTypeEnum> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<GPBScalarTypeEnum>(value)).iterator() );
            else
                return( (new TreeSet<GPBScalarTypeEnum>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2726)
    public Set<GPBScalarTypeEnum> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<GPBScalarTypeEnum>());
                else
                    return(new HashSet<GPBScalarTypeEnum>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<GPBScalarTypeEnum>(value));
                else
                    return(new TreeSet<GPBScalarTypeEnum>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2746)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2757)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                GPBScalarTypeEnum val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

