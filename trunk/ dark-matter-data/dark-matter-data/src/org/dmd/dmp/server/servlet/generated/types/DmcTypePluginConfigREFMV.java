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
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypePluginConfigREFMV provides storage for a multi-valued PluginConfigREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1927)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:493)
 */
@SuppressWarnings("serial")
public class DmcTypePluginConfigREFMV extends DmcTypePluginConfigREF implements Serializable {
    
    ArrayList<PluginConfigREF> value;
    
    public DmcTypePluginConfigREFMV(){
    
    }
    
    public DmcTypePluginConfigREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypePluginConfigREFMV getNew(){
        return(new DmcTypePluginConfigREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<PluginConfigREF> cloneIt(){
        DmcTypePluginConfigREFMV rc = getNew();
        for(PluginConfigREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public PluginConfigREF add(Object v) throws DmcValueException {
        PluginConfigREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<PluginConfigREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public PluginConfigREF del(Object v){
        PluginConfigREF rc = null;
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
    public Iterator<PluginConfigREF> getMV(){
        ArrayList<PluginConfigREF> clone = new ArrayList<PluginConfigREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<PluginConfigREF> getMVCopy(){
        ArrayList<PluginConfigREF> clone = new ArrayList<PluginConfigREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public PluginConfigREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            PluginConfigREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

