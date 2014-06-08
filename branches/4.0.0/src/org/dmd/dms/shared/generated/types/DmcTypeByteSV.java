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
package org.dmd.dms.shared.generated.types;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:67)
import java.io.Serializable;                         // Serialization marker interface - (SVTypeFormatter.java:56)
import org.dmd.core.DmcAttribute;                    // To support cloning - (SVTypeFormatter.java:57)
import org.dmd.core.feedback.DMFeedbackSet;          // Error support - (SVTypeFormatter.java:59)
import org.dmd.core.schema.DmcAttributeInfo;         // To support new instances - (SVTypeFormatter.java:58)
import org.dmd.dms.shared.types.DmcTypeByte;         // DmcType import - (SVTypeFormatter.java:65)


/**
 * The DmcTypeByteSV provides storage for a single-valued Byte
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:73)
 *    Called from: org.dmd.dms.tools.meta.DerivedTypeFormatter.dumpDerivedTypes(DerivedTypeFormatter.java:92)
 */
@SuppressWarnings("serial")
public class DmcTypeByteSV extends DmcTypeByte implements Serializable {
    
    protected Byte value;
    
    public DmcTypeByteSV(){
    
    }
    
    public DmcTypeByteSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeByteSV getNew(){
        return(new DmcTypeByteSV(getAttributeInfo()));
    }
    
    public DmcTypeByteSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeByteSV(ai));
    }
    
    @Override
    // org.dmd.dms.tools.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:105)
    public DmcAttribute<Byte> cloneIt(){
        DmcTypeByteSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.tools.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:116)
    public Byte getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.tools.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:128)
    public Byte set(Object v) throws DMFeedbackSet {
        Byte rc = typeCheck(v);
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
    public Byte getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

