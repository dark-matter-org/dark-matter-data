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
import org.dmd.dmc.types.DmcTypeIntegerName;    // base type import
import org.dmd.dmc.types.IntegerName;    // primitive import
/**
 * The DmcTypeIntegerNameSV provides storage for a single-valued IntegerName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1050)
 */
@SuppressWarnings("serial")
// public class DmcTypeIntegerNameSV extends DmcTypeIntegerName<IntegerName> {
public class DmcTypeIntegerNameSV extends DmcTypeIntegerName {
    
    IntegerName value;
    
    public DmcTypeIntegerNameSV(){
    
    }
    
    public DmcTypeIntegerNameSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeIntegerNameSV getNew(){
        return(new DmcTypeIntegerNameSV(attrInfo));
    }
    
    public IntegerName set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    public IntegerName getSV(){
        return(value);
    }
    
    public IntegerName add(Object v){
        throw(new IllegalStateException("The add() method is not valid for single-valued attribute:" + getName()));
    }
    
    public IntegerName del(Object v){
        throw(new IllegalStateException("The del() method is not valid for single-valued attribute:" + getName()));
    }
    
    public Iterator<IntegerName> getMV(){
        throw(new IllegalStateException("The getMV() method is not valid for single-valued attribute:" + getName()));
    }
    
    public int getMVSize(){
        throw(new IllegalStateException("The getMVSize() method is not valid for single-valued attribute:" + getName()));
    }
    
    public IntegerName getMVnth(){
        throw(new IllegalStateException("The getMVnth() method is not valid for single-valued attribute:" + getName()));
    }
    
    public IntegerName getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for single-valued attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        throw(new IllegalStateException("The contains() method is not valid for single-valued attribute:" + getName()));
    }
    
}

