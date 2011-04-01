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
package org.dmd.features.extgwt.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeMvcRegistryItemREFSV provides storage for a single-valued MvcRegistryItemREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1328)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:553)
 */
@SuppressWarnings("serial")
public class DmcTypeMvcRegistryItemREFSV extends DmcTypeMvcRegistryItemREF {
    
    MvcRegistryItemREF value;
    
    public DmcTypeMvcRegistryItemREFSV(){
    
    }
    
    public DmcTypeMvcRegistryItemREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeMvcRegistryItemREFSV getNew(){
        return(new DmcTypeMvcRegistryItemREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<MvcRegistryItemREF> cloneIt(){
        DmcTypeMvcRegistryItemREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public MvcRegistryItemREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public MvcRegistryItemREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

