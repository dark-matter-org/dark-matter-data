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

import java.util.Iterator;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;    // name attribute import
/**
 * The DmcTypeSchemaDefinitionREFSV provides storage for a single-valued SchemaDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1075)
 */
@SuppressWarnings("serial")
// public class DmcTypeSchemaDefinitionREFSV extends DmcTypeSchemaDefinitionREF<SchemaDefinitionREF,StringName> {
public class DmcTypeSchemaDefinitionREFSV extends DmcTypeSchemaDefinitionREF {
    
    SchemaDefinitionREF value;
    
    public DmcTypeSchemaDefinitionREFSV(){
    
    }
    
    public DmcTypeSchemaDefinitionREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeSchemaDefinitionREFSV getNew(){
        return(new DmcTypeSchemaDefinitionREFSV(attrInfo));
    }
    
    public SchemaDefinitionREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    public SchemaDefinitionREF getSV(){
        return(value);
    }
    
    public SchemaDefinitionREF add(Object v){
        throw(new IllegalStateException("The add() method is not valid for single-valued attribute:" + getName()));
    }
    
    public SchemaDefinitionREF del(Object v){
        throw(new IllegalStateException("The del() method is not valid for single-valued attribute:" + getName()));
    }
    
    public Iterator<SchemaDefinitionREF> getMV(){
        throw(new IllegalStateException("The getMV() method is not valid for single-valued attribute:" + getName()));
    }
    
    public int getMVSize(){
        throw(new IllegalStateException("The getMVSize() method is not valid for single-valued attribute:" + getName()));
    }
    
    public SchemaDefinitionREF getMVnth(){
        throw(new IllegalStateException("The getMVnth() method is not valid for single-valued attribute:" + getName()));
    }
    
    public SchemaDefinitionREF getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for single-valued attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        throw(new IllegalStateException("The contains() method is not valid for single-valued attribute:" + getName()));
    }
    
}

