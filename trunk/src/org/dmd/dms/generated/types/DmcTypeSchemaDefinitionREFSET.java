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
 * The DmcTypeSchemaDefinitionREFSET provides storage for a set of SchemaDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2553)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:270)
 */
@SuppressWarnings("serial")
public class DmcTypeSchemaDefinitionREFSET extends DmcTypeSchemaDefinitionREF implements Serializable {
    
    protected Set<SchemaDefinitionREF> value;
    
    public DmcTypeSchemaDefinitionREFSET(){
        value = null;
    }
    
    public DmcTypeSchemaDefinitionREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<SchemaDefinitionREF>();
        else
            value = new TreeSet<SchemaDefinitionREF>();
    }
    
    @Override
    public DmcTypeSchemaDefinitionREFSET getNew(){
        return(new DmcTypeSchemaDefinitionREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2590)
    public DmcAttribute<SchemaDefinitionREF> cloneIt(){
        synchronized(this){
            DmcTypeSchemaDefinitionREFSET rc = getNew();
            for(SchemaDefinitionREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2609)
    public SchemaDefinitionREF add(Object v) throws DmcValueException {
        synchronized(this){
            SchemaDefinitionREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2626)
    public SchemaDefinitionREF del(Object v){
        synchronized(this){
            SchemaDefinitionREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2651)
    public Iterator<SchemaDefinitionREF> getMV(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<SchemaDefinitionREF>(value)).iterator() );
            else
                return( (new TreeSet<SchemaDefinitionREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2668)
    public Set<SchemaDefinitionREF> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return(new HashSet<SchemaDefinitionREF>(value));
            else
                return(new TreeSet<SchemaDefinitionREF>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2686)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2697)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                SchemaDefinitionREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

