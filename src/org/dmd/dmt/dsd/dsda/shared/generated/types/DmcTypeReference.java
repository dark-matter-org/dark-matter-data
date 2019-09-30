//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmt.dsd.dsda.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3294)
import java.io.Serializable;                                  // Marker interface for serialization - (GenUtility.java:3275)
import java.util.Iterator;                                    // For JSON formatting - (GenUtility.java:3276)
import org.dmd.dmc.DmcAttributeInfo;                          // Constructor support - (GenUtility.java:3280)
import org.dmd.dmc.DmcInputStreamIF;                          // To support serialization - (GenUtility.java:3277)
import org.dmd.dmc.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (GenUtility.java:3286)
import org.dmd.dmc.DmcNameResolverIF;                         // Reference resolution - (GenUtility.java:3287)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (GenUtility.java:3285)
import org.dmd.dmc.DmcObject;                                 // Ambiguous reference resolution - (GenUtility.java:3288)
import org.dmd.dmc.DmcOutputStreamIF;                         // To support serialization - (GenUtility.java:3278)
import org.dmd.dmc.DmcValueException;                         // Type checking - (GenUtility.java:3281)
import org.dmd.dmc.DmcValueExceptionSet;                      // Ambiguous reference resolution - (GenUtility.java:3289)
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;          // Derivation base - (GenUtility.java:3284)



@SuppressWarnings("serial")
/**
 * The DmcTypeReference class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3301)
 *    Called from: Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:1099)
 */
abstract public class DmcTypeReference extends DmcTypeComplexTypeWithRefs<Reference> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeReference(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeReference(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    // Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3324)
    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
        if (getMVSize() == 0){
            getSV().toJSON(sb,padding,indent);
        }
        else {
            Iterator<Reference> it = getMV();
            while(it.hasNext()){
                Reference value = it.next();
                value.toJSON(sb,padding,indent);
                if (it.hasNext())
                    sb.append(", \n");                    
            }
        }
    }

    // Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3340)
    protected Reference typeCheck(Object value) throws DmcValueException {
        Reference rc = null;

        if (value instanceof Reference){
            rc = (Reference)value;
        }
        else if (value instanceof String){
            rc = new Reference((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Reference expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3363)
     */
    public Reference cloneValue(Reference val){
        return(new Reference(val));
    }

    /**
     * Writes a Reference.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3371)
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, Reference value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a Reference.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3380)
     */
    @Override
    public Reference deserializeValue(DmcInputStreamIF dis) throws Exception {
        Reference rc = new Reference();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a Reference.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3392)
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, Reference value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }

    /**
     * Resolves a Reference.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3401)
     */
    @Override
    public void resolveValue(DmcNameResolverWithClashSupportIF resolver, Reference value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        value.resolve(resolver,object,ncr,ai);
    }

    /**
     * Removes references to other objects from a Reference.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3410)
     */
    public void removeBackRefsFromValue(Reference value){
        value.removeBackRefsFromValue();
    }



}
