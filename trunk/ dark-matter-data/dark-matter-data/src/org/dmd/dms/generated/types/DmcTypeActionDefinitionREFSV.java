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
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeActionDefinitionREFSV provides storage for a single-valued ActionDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1340)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:182)
 */
@SuppressWarnings("serial")
public class DmcTypeActionDefinitionREFSV extends DmcTypeActionDefinitionREF implements Serializable {
    
    ActionDefinitionREF value;
    
    public DmcTypeActionDefinitionREFSV(){
    
    }
    
    public DmcTypeActionDefinitionREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeActionDefinitionREFSV getNew(){
        return(new DmcTypeActionDefinitionREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<ActionDefinitionREF> cloneIt(){
        DmcTypeActionDefinitionREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public ActionDefinitionREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public ActionDefinitionREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

