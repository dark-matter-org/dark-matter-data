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
import org.dmd.dmc.types.DmcTypeString;    // base type import
/**
 * The DmcTypeStringSV provides storage for a single-valued String
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1340)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:189)
 */
@SuppressWarnings("serial")
public class DmcTypeStringSV extends DmcTypeString implements Serializable {
    
    String value;
    
    public DmcTypeStringSV(){
    
    }
    
    public DmcTypeStringSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeStringSV getNew(){
        return(new DmcTypeStringSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<String> cloneIt(){
        DmcTypeStringSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public String set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public String getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

