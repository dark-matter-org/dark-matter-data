//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012-2021 dark-matter-data committers
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
 * The DmcTypeActionDefinitionREFSET provides storage for a set of ActionDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2811)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:620)
 */
@SuppressWarnings("serial")
public class DmcTypeActionDefinitionREFSET extends DmcTypeActionDefinitionREF implements Serializable {
    
     private final static Iterator<ActionDefinitionREF> emptyList =  (new HashSet<ActionDefinitionREF>()).iterator();
    
    
    protected Set<ActionDefinitionREF> value;
    
    public DmcTypeActionDefinitionREFSET(){
        value = null;
    }
    
    public DmcTypeActionDefinitionREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ActionDefinitionREF>();
        else
            value = new TreeSet<ActionDefinitionREF>();
    }
    
    @Override
    public DmcTypeActionDefinitionREFSET getNew(){
        return(new DmcTypeActionDefinitionREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2852)
    public DmcAttribute<ActionDefinitionREF> cloneIt(){
        synchronized(this){
            DmcTypeActionDefinitionREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ActionDefinitionREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2875)
    public ActionDefinitionREF add(Object v) throws DmcValueException {
        synchronized(this){
            ActionDefinitionREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2892)
    public ActionDefinitionREF del(Object v){
        synchronized(this){
            ActionDefinitionREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2917)
    public Iterator<ActionDefinitionREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<ActionDefinitionREF>(value)).iterator() );
            else
                return( (new TreeSet<ActionDefinitionREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2931)
    public Set<ActionDefinitionREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<ActionDefinitionREF>());
                else
                    return(new HashSet<ActionDefinitionREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<ActionDefinitionREF>(value));
                else
                    return(new TreeSet<ActionDefinitionREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2951)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2962)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                ActionDefinitionREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

