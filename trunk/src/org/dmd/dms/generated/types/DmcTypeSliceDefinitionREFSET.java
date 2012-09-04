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
/**
 * The DmcTypeSliceDefinitionREFSET provides storage for a set of SliceDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2571)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:579)
 */
@SuppressWarnings("serial")
public class DmcTypeSliceDefinitionREFSET extends DmcTypeSliceDefinitionREF implements Serializable {
    
    protected Set<SliceDefinitionREF> value;
    
    public DmcTypeSliceDefinitionREFSET(){
        value = null;
    }
    
    public DmcTypeSliceDefinitionREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<SliceDefinitionREF>();
        else
            value = new TreeSet<SliceDefinitionREF>();
    }
    
    @Override
    public DmcTypeSliceDefinitionREFSET getNew(){
        return(new DmcTypeSliceDefinitionREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2608)
    public DmcAttribute<SliceDefinitionREF> cloneIt(){
        synchronized(this){
            DmcTypeSliceDefinitionREFSET rc = getNew();
            for(SliceDefinitionREF val: value)
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
    public SliceDefinitionREF add(Object v) throws DmcValueException {
        synchronized(this){
            SliceDefinitionREF rc = typeCheck(v);
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
    public SliceDefinitionREF del(Object v){
        synchronized(this){
            SliceDefinitionREF rc = null;
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
    public Iterator<SliceDefinitionREF> getMV(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<SliceDefinitionREF>(value)).iterator() );
            else
                return( (new TreeSet<SliceDefinitionREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2686)
    public Set<SliceDefinitionREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return(new HashSet<SliceDefinitionREF>(value));
            else
                return(new TreeSet<SliceDefinitionREF>(value));
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
                SliceDefinitionREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

