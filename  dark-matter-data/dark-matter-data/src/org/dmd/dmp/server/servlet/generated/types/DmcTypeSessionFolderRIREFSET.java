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
package org.dmd.dmp.server.servlet.generated.types;

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
 * The DmcTypeSessionFolderRIREFSET provides storage for a set of SessionFolderRIREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2040)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:491)
 */
@SuppressWarnings("serial")
public class DmcTypeSessionFolderRIREFSET extends DmcTypeSessionFolderRIREF implements Serializable {
    
    Set<SessionFolderRIREF> value;
    
    public DmcTypeSessionFolderRIREFSET(){
        value = null;
    }
    
    public DmcTypeSessionFolderRIREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<SessionFolderRIREF>();
        else
            value = new TreeSet<SessionFolderRIREF>();
    }
    
    @Override
    public DmcTypeSessionFolderRIREFSET getNew(){
        return(new DmcTypeSessionFolderRIREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<SessionFolderRIREF> cloneIt(){
        DmcTypeSessionFolderRIREFSET rc = getNew();
        for(SessionFolderRIREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public SessionFolderRIREF add(Object v) throws DmcValueException {
        SessionFolderRIREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public SessionFolderRIREF del(Object v){
        SessionFolderRIREF rc = null;
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
    public Iterator<SessionFolderRIREF> getMV(){
        Set<SessionFolderRIREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<SessionFolderRIREF>(value);
        else
            clone = new TreeSet<SessionFolderRIREF>(value);
        return(clone.iterator());
    }
    
    public Set<SessionFolderRIREF> getMVCopy(){
        Set<SessionFolderRIREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<SessionFolderRIREF>(value);
        else
            clone = new TreeSet<SessionFolderRIREF>(value);
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
            SessionFolderRIREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

