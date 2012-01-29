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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeFormBindingDefinitionREFSV provides storage for a single-valued FormBindingDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1833)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:529)
 */
@SuppressWarnings("serial")
public class DmcTypeFormBindingDefinitionREFSV extends DmcTypeFormBindingDefinitionREF implements Serializable {
    
    protected FormBindingDefinitionREF value;
    
    public DmcTypeFormBindingDefinitionREFSV(){
    
    }
    
    public DmcTypeFormBindingDefinitionREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeFormBindingDefinitionREFSV getNew(){
        return(new DmcTypeFormBindingDefinitionREFSV(attrInfo));
    }
    
    public DmcTypeFormBindingDefinitionREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeFormBindingDefinitionREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1865)
    public DmcAttribute<FormBindingDefinitionREF> cloneIt(){
        DmcTypeFormBindingDefinitionREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1876)
    public FormBindingDefinitionREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1888)
    public FormBindingDefinitionREF set(Object v) throws DmcValueException {
        FormBindingDefinitionREF rc = typeCheck(v);
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
    public FormBindingDefinitionREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

