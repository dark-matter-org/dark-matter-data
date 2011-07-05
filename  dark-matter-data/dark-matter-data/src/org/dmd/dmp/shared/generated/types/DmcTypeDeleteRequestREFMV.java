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
package org.dmd.dmp.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;    // DmcType import
/**
 * The DmcTypeDeleteRequestREFMV provides storage for a multi-valued DeleteRequest
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2009)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:222)
 */
@SuppressWarnings("serial")
public class DmcTypeDeleteRequestREFMV extends DmcTypeDeleteRequestREF implements Serializable {
    
    ArrayList<DeleteRequestDMO> value;
    
    public DmcTypeDeleteRequestREFMV(){
    
    }
    
    public DmcTypeDeleteRequestREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDeleteRequestREFMV getNew(){
        return(new DmcTypeDeleteRequestREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<DeleteRequestDMO> cloneIt(){
        DmcTypeDeleteRequestREFMV rc = getNew();
        for(DeleteRequestDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public DeleteRequestDMO add(Object v) throws DmcValueException {
        DeleteRequestDMO rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<DeleteRequestDMO>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public DeleteRequestDMO del(Object v){
        DeleteRequestDMO rc = null;
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
    
    @Override
    public Iterator<DeleteRequestDMO> getMV(){
        ArrayList<DeleteRequestDMO> clone = new ArrayList<DeleteRequestDMO>(value);
        return(clone.iterator());
    }
    
    public ArrayList<DeleteRequestDMO> getMVCopy(){
        ArrayList<DeleteRequestDMO> clone = new ArrayList<DeleteRequestDMO>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public DeleteRequestDMO getMVnth(int index){
        return(value.get(index));
    }
    
    @Override
    public DeleteRequestDMO setMVnth(int index, Object v) throws DmcValueException {
        if (attrInfo.indexSize == 0)
            throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
        
        if ( (index < 0) || (index >= attrInfo.indexSize))
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
        
        DeleteRequestDMO rc = null;
        
        if (v != null)
            rc = typeCheck(v);
        
        if (value == null){
            value = new ArrayList<DeleteRequestDMO>(attrInfo.indexSize);
            for(int i=0;i<attrInfo.indexSize;i++)
                value.add(null);
        }
        
        value.set(index, rc);
        
        return(rc);
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            DeleteRequestDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

