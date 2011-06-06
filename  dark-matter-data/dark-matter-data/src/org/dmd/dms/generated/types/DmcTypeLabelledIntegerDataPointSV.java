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
import org.dmd.dmc.types.LabelledIntegerDataPoint;    // base type import
import org.dmd.dmc.types.DmcTypeLabelledIntegerDataPoint;    // DmcType import
/**
 * The DmcTypeLabelledIntegerDataPointSV provides storage for a single-valued LabelledIntegerDataPoint
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1546)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeLabelledIntegerDataPointSV extends DmcTypeLabelledIntegerDataPoint implements Serializable {
    
    LabelledIntegerDataPoint value;
    
    public DmcTypeLabelledIntegerDataPointSV(){
    
    }
    
    public DmcTypeLabelledIntegerDataPointSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeLabelledIntegerDataPointSV getNew(){
        return(new DmcTypeLabelledIntegerDataPointSV(attrInfo));
    }
    
    public DmcTypeLabelledIntegerDataPointSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeLabelledIntegerDataPointSV(ai));
    }
    
    @Override
    public DmcAttribute<LabelledIntegerDataPoint> cloneIt(){
        DmcTypeLabelledIntegerDataPointSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public LabelledIntegerDataPoint set(Object v) throws DmcValueException {
        LabelledIntegerDataPoint rc = typeCheck(v);
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
    public LabelledIntegerDataPoint getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}
