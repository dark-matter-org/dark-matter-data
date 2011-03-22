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
import org.dmd.dmc.types.DmcTypeDotName;    // base type import
import org.dmd.dmc.types.DotName;    // primitive import
/**
 * The DmcTypeDotNameSV provides storage for a single-valued DotName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1075)
 */
@SuppressWarnings("serial")
// public class DmcTypeDotNameSV extends DmcTypeDotName<DotName> {
public class DmcTypeDotNameSV extends DmcTypeDotName {
    
    DotName value;
    
    public DmcTypeDotNameSV(){
    
    }
    
    public DmcTypeDotNameSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDotNameSV getNew(){
        return(new DmcTypeDotNameSV(attrInfo));
    }
    
    public DotName set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    public DotName getSV(){
        return(value);
    }
    
    public DotName add(Object v){
        throw(new IllegalStateException("The add() method is not valid for single-valued attribute:" + getName()));
    }
    
    public DotName del(Object v){
        throw(new IllegalStateException("The del() method is not valid for single-valued attribute:" + getName()));
    }
    
    public Iterator<DotName> getMV(){
        throw(new IllegalStateException("The getMV() method is not valid for single-valued attribute:" + getName()));
    }
    
    public int getMVSize(){
        throw(new IllegalStateException("The getMVSize() method is not valid for single-valued attribute:" + getName()));
    }
    
    public DotName getMVnth(){
        throw(new IllegalStateException("The getMVnth() method is not valid for single-valued attribute:" + getName()));
    }
    
    public DotName getByKey(Object key){
        throw(new IllegalStateException("The getByKey() method is not valid for single-valued attribute:" + getName()));
    }
    
    public boolean contains(Object v){
        throw(new IllegalStateException("The contains() method is not valid for single-valued attribute:" + getName()));
    }
    
}

