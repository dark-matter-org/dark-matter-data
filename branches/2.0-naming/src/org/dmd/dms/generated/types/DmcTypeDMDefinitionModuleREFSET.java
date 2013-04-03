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
 * The DmcTypeDMDefinitionModuleREFSET provides storage for a set of DMDefinitionModuleREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2602)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:596)
 */
@SuppressWarnings("serial")
public class DmcTypeDMDefinitionModuleREFSET extends DmcTypeDMDefinitionModuleREF implements Serializable {
    
     private final static Iterator<DMDefinitionModuleREF> emptyList =  (new HashSet<DMDefinitionModuleREF>()).iterator();
    
    
    protected Set<DMDefinitionModuleREF> value;
    
    public DmcTypeDMDefinitionModuleREFSET(){
        value = null;
    }
    
    public DmcTypeDMDefinitionModuleREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DMDefinitionModuleREF>();
        else
            value = new TreeSet<DMDefinitionModuleREF>();
    }
    
    @Override
    public DmcTypeDMDefinitionModuleREFSET getNew(){
        return(new DmcTypeDMDefinitionModuleREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2643)
    public DmcAttribute<DMDefinitionModuleREF> cloneIt(){
        synchronized(this){
            DmcTypeDMDefinitionModuleREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(DMDefinitionModuleREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2666)
    public DMDefinitionModuleREF add(Object v) throws DmcValueException {
        synchronized(this){
            DMDefinitionModuleREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2683)
    public DMDefinitionModuleREF del(Object v){
        synchronized(this){
            DMDefinitionModuleREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2708)
    public Iterator<DMDefinitionModuleREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<DMDefinitionModuleREF>(value)).iterator() );
            else
                return( (new TreeSet<DMDefinitionModuleREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2722)
    public Set<DMDefinitionModuleREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<DMDefinitionModuleREF>());
                else
                    return(new HashSet<DMDefinitionModuleREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<DMDefinitionModuleREF>(value));
                else
                    return(new TreeSet<DMDefinitionModuleREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2742)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2753)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                DMDefinitionModuleREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

