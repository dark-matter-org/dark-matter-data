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
// Called from: org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:67)
import java.io.Serializable;                                  // Serialization marker interface - (SVTypeFormatter.java:56)
import org.dmd.core.DmcAttribute;                             // To support cloning - (SVTypeFormatter.java:57)
import org.dmd.core.feedback.DMFeedbackSet;                   // Error support - (SVTypeFormatter.java:59)
import org.dmd.core.schema.DmcAttributeInfo;                  // To support new instances - (SVTypeFormatter.java:58)
import org.dmd.dms.shared.types.CamelCaseName;                // Base type import - (SVTypeFormatter.java:62)
import org.dmd.dms.shared.types.DmcTypeCamelCaseName;         // DmcType import - (SVTypeFormatter.java:65)


/**
 * The DmcTypeCamelCaseNameSV provides storage for a single-valued CamelCaseName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:73)
 *    Called from: org.dmd.dms.tools.generation.meta.DerivedTypeFormatter.dumpDerivedTypes(DerivedTypeFormatter.java:92)
 */
@SuppressWarnings("serial")
public class DmcTypeCamelCaseNameSV extends DmcTypeCamelCaseName implements Serializable {
    
    protected CamelCaseName value;
    
    public DmcTypeCamelCaseNameSV(){
    
    }
    
    public DmcTypeCamelCaseNameSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeCamelCaseNameSV getNew(){
        return(new DmcTypeCamelCaseNameSV(getAttributeInfo()));
    }
    
    public DmcTypeCamelCaseNameSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeCamelCaseNameSV(ai));
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:105)
    public DmcAttribute<CamelCaseName> cloneIt(){
        DmcTypeCamelCaseNameSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:116)
    public CamelCaseName getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SVTypeFormatter.dumpSVType(SVTypeFormatter.java:128)
    public CamelCaseName set(Object v) throws DMFeedbackSet {
        CamelCaseName rc = typeCheck(v);
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
    public CamelCaseName getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

