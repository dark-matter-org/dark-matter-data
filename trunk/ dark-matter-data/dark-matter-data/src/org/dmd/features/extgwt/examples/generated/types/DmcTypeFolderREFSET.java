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
package org.dmd.features.extgwt.examples.generated.types;

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
 * The DmcTypeFolderREFSET provides storage for a set of FolderREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2305)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:495)
 */
@SuppressWarnings("serial")
public class DmcTypeFolderREFSET extends DmcTypeFolderREF implements Serializable {
    
    Set<FolderREF> value;
    
    public DmcTypeFolderREFSET(){
        value = null;
    }
    
    public DmcTypeFolderREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<FolderREF>();
        else
            value = new TreeSet<FolderREF>();
    }
    
    @Override
    public DmcTypeFolderREFSET getNew(){
        return(new DmcTypeFolderREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2342)
    public DmcAttribute<FolderREF> cloneIt(){
        synchronized(this){
            DmcTypeFolderREFSET rc = getNew();
            for(FolderREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2361)
    public FolderREF add(Object v) throws DmcValueException {
        synchronized(this){
            FolderREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2378)
    public FolderREF del(Object v){
        synchronized(this){
            FolderREF rc = null;
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2397)
    public Iterator<FolderREF> getMV(){
        synchronized(this){
            Set<FolderREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<FolderREF>(value);
            else
                clone = new TreeSet<FolderREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2410)
    public Set<FolderREF> getMVCopy(){
        synchronized(this){
            Set<FolderREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<FolderREF>(value);
            else
                clone = new TreeSet<FolderREF>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2424)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2435)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                FolderREF val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

