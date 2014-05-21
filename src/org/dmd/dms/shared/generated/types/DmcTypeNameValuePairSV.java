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
// Called from: org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:68)
import java.io.Serializable;                                            // Serialization marker interface - (SVTypeFormatter.java:57)
import org.dmd.core.DmcAttribute;                                       // To support cloning - (SVTypeFormatter.java:58)
import org.dmd.core.feedback.DMFeedbackSet;                             // Error support - (SVTypeFormatter.java:60)
import org.dmd.core.schema.DmcAttributeInfo;                            // To support new instances - (SVTypeFormatter.java:59)
import org.dmd.dms.shared.generated.types.DmcTypeNameValuePair;         // DmcType import - (SVTypeFormatter.java:66)
import org.dmd.dms.shared.generated.types.NameValuePair;                // Base type import - (SVTypeFormatter.java:63)


/**
 * The DmcTypeNameValuePairSV provides storage for a single-valued NameValuePair
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:74)
 *    Called from: org.dmd.dms.tools.generation.meta.DerivedTypeFormatter.dumpDerivedTypes(DerivedTypeFormatter.java:112)
 */
@SuppressWarnings("serial")
public class DmcTypeNameValuePairSV extends DmcTypeNameValuePair implements Serializable {
    
    protected NameValuePair value;
    
    public DmcTypeNameValuePairSV(){
    
    }
    
    public DmcTypeNameValuePairSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeNameValuePairSV getNew(){
        return(new DmcTypeNameValuePairSV(getAttributeInfo()));
    }
    
    public DmcTypeNameValuePairSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeNameValuePairSV(ai));
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:106)
    public DmcAttribute<NameValuePair> cloneIt(){
        DmcTypeNameValuePairSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:117)
    public NameValuePair getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:129)
    public NameValuePair set(Object v) throws DMFeedbackSet {
        NameValuePair rc = typeCheck(v);
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
    public NameValuePair getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

