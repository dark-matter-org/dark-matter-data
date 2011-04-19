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
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;    // DmcType import
/**
 * The DmcTypeLoginRequestREFSET provides storage for a set of LoginRequestDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1964)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:200)
 */
@SuppressWarnings("serial")
public class DmcTypeLoginRequestREFSET extends DmcTypeLoginRequestREF implements Serializable {
    
    Set<LoginRequestDMO> value;
    
    public DmcTypeLoginRequestREFSET(){
        value = null;
    }
    
    public DmcTypeLoginRequestREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<LoginRequestDMO>();
        else
            value = new TreeSet<LoginRequestDMO>();
    }
    
    @Override
    public DmcTypeLoginRequestREFSET getNew(){
        return(new DmcTypeLoginRequestREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<LoginRequestDMO> cloneIt(){
        DmcTypeLoginRequestREFSET rc = getNew();
        for(LoginRequestDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public LoginRequestDMO add(Object v) throws DmcValueException {
        LoginRequestDMO rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public LoginRequestDMO del(Object v){
        LoginRequestDMO rc = null;
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
    public Iterator<LoginRequestDMO> getMV(){
        Set<LoginRequestDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<LoginRequestDMO>(value);
        else
            clone = new TreeSet<LoginRequestDMO>(value);
        return(clone.iterator());
    }
    
    public Set<LoginRequestDMO> getMVCopy(){
        Set<LoginRequestDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<LoginRequestDMO>(value);
        else
            clone = new TreeSet<LoginRequestDMO>(value);
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
            LoginRequestDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

