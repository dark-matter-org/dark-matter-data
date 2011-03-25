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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeDMPMessageREFSV provides storage for a single-valued DMPMessageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1074)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:546)
 */
@SuppressWarnings("serial")
public class DmcTypeDMPMessageREFSV extends DmcTypeDMPMessageREF {
    
    DMPMessageREF value;
    
    public DmcTypeDMPMessageREFSV(){
    
    }
    
    public DmcTypeDMPMessageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDMPMessageREFSV getNew(){
        return(new DmcTypeDMPMessageREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<DMPMessageREF> cloneIt(){
        DmcTypeDMPMessageREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public DMPMessageREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public DMPMessageREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

