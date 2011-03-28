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
package org.dmd.dmg.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmg.types.Generator;    // base type import
import org.dmd.dmg.types.DmcTypeGenerator;    // primitive import
/**
 * The DmcTypeGeneratorSV provides storage for a single-valued Generator
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1079)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:90)
 */
@SuppressWarnings("serial")
public class DmcTypeGeneratorSV extends DmcTypeGenerator {
    
    Generator value;
    
    public DmcTypeGeneratorSV(){
    
    }
    
    public DmcTypeGeneratorSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeGeneratorSV getNew(){
        return(new DmcTypeGeneratorSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<Generator> cloneIt(){
        DmcTypeGeneratorSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public Generator set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public Generator getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

