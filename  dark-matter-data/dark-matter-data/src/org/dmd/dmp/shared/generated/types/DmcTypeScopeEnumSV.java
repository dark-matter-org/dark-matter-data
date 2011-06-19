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
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.shared.generated.enums.ScopeEnum;    // DmcType import
/**
 * The DmcTypeScopeEnumSV provides storage for a single-valued ScopeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1552)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:321)
 */
@SuppressWarnings("serial")
public class DmcTypeScopeEnumSV extends DmcTypeScopeEnum implements Serializable {
    
    ScopeEnum value;
    
    public DmcTypeScopeEnumSV(){
    
    }
    
    public DmcTypeScopeEnumSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeScopeEnumSV getNew(){
        return(new DmcTypeScopeEnumSV(attrInfo));
    }
    
    public DmcTypeScopeEnumSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeScopeEnumSV(ai));
    }
    
    @Override
    public DmcAttribute<ScopeEnum> cloneIt(){
        DmcTypeScopeEnumSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public ScopeEnum set(Object v) throws DmcValueException {
        ScopeEnum rc = typeCheck(v);
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
    public ScopeEnum getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

