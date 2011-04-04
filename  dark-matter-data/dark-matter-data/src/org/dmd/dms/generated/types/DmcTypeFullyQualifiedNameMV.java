//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeFullyQualifiedName;    // base type import
import org.dmd.dmc.types.FullyQualifiedName;    // primitive import
/**
 * The DmcTypeFullyQualifiedNameMV provides storage for a multi-valued FullyQualifiedName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1465)
 *    Called from:  org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:189)
 */
@SuppressWarnings("serial")
public class DmcTypeFullyQualifiedNameMV extends DmcTypeFullyQualifiedName implements Serializable {
    
    ArrayList<FullyQualifiedName> value;
    
    public DmcTypeFullyQualifiedNameMV(){
    
    }
    
    public DmcTypeFullyQualifiedNameMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeFullyQualifiedNameMV getNew(){
        return(new DmcTypeFullyQualifiedNameMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<FullyQualifiedName> cloneIt(){
        DmcTypeFullyQualifiedNameMV rc = getNew();
        for(FullyQualifiedName val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public FullyQualifiedName add(Object v) throws DmcValueException {
        FullyQualifiedName rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<FullyQualifiedName>();
        value.add(rc);
        return(rc);
    }
    
    public FullyQualifiedName del(Object v){
        FullyQualifiedName rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else
            rc = null;
        return(rc);
    }
    
    public Iterator<FullyQualifiedName> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public FullyQualifiedName getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            FullyQualifiedName val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

