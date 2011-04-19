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
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;    // DmcType import
/**
 * The DmcTypeLogoutRequestREFSET provides storage for a set of LogoutRequestDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1964)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:200)
 */
@SuppressWarnings("serial")
public class DmcTypeLogoutRequestREFSET extends DmcTypeLogoutRequestREF implements Serializable {
    
    Set<LogoutRequestDMO> value;
    
    public DmcTypeLogoutRequestREFSET(){
        value = null;
    }
    
    public DmcTypeLogoutRequestREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<LogoutRequestDMO>();
        else
            value = new TreeSet<LogoutRequestDMO>();
    }
    
    @Override
    public DmcTypeLogoutRequestREFSET getNew(){
        return(new DmcTypeLogoutRequestREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<LogoutRequestDMO> cloneIt(){
        DmcTypeLogoutRequestREFSET rc = getNew();
        for(LogoutRequestDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public LogoutRequestDMO add(Object v) throws DmcValueException {
        LogoutRequestDMO rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public LogoutRequestDMO del(Object v){
        LogoutRequestDMO rc = null;
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
    public Iterator<LogoutRequestDMO> getMV(){
        Set<LogoutRequestDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<LogoutRequestDMO>(value);
        else
            clone = new TreeSet<LogoutRequestDMO>(value);
        return(clone.iterator());
    }
    
    public Set<LogoutRequestDMO> getMVCopy(){
        Set<LogoutRequestDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<LogoutRequestDMO>(value);
        else
            clone = new TreeSet<LogoutRequestDMO>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            LogoutRequestDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

