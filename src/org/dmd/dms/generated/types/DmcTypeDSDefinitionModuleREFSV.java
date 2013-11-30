//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
 * The DmcTypeDSDefinitionModuleREFSV provides storage for a single-valued DSDefinitionModuleREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1966)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:604)
 */
@SuppressWarnings("serial")
public class DmcTypeDSDefinitionModuleREFSV extends DmcTypeDSDefinitionModuleREF implements Serializable {
    
    protected DSDefinitionModuleREF value;
    
    public DmcTypeDSDefinitionModuleREFSV(){
    
    }
    
    public DmcTypeDSDefinitionModuleREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDSDefinitionModuleREFSV getNew(){
        return(new DmcTypeDSDefinitionModuleREFSV(getAttributeInfo()));
    }
    
    public DmcTypeDSDefinitionModuleREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeDSDefinitionModuleREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public DmcAttribute<DSDefinitionModuleREF> cloneIt(){
        DmcTypeDSDefinitionModuleREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2009)
    public DSDefinitionModuleREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2021)
    public DSDefinitionModuleREF set(Object v) throws DmcValueException {
        DSDefinitionModuleREF rc = typeCheck(v);
        // We only return a value if the value actually changed. This supports
        // the applyModifier() mechanism on DmcObject where we only return true
        // if something changed as a result of the modifier
        if (value == null)
            value = rc;
        else{
            if (value.equals(rc))
                rc = null;
            else
                value = rc;
        }
        return(rc);
    }
    
    @Override
    public DSDefinitionModuleREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

