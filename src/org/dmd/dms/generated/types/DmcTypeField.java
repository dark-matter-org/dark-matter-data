//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012-2021 dark-matter-data committers
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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3297)
import java.io.Serializable;                                  // Marker interface for serialization - (GenUtility.java:3278)
import java.util.Iterator;                                    // For JSON formatting - (GenUtility.java:3279)
import org.dmd.dmc.DmcAttributeInfo;                          // Constructor support - (GenUtility.java:3283)
import org.dmd.dmc.DmcInputStreamIF;                          // To support serialization - (GenUtility.java:3280)
import org.dmd.dmc.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (GenUtility.java:3289)
import org.dmd.dmc.DmcNameResolverIF;                         // Reference resolution - (GenUtility.java:3290)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (GenUtility.java:3288)
import org.dmd.dmc.DmcObject;                                 // Ambiguous reference resolution - (GenUtility.java:3291)
import org.dmd.dmc.DmcOutputStreamIF;                         // To support serialization - (GenUtility.java:3281)
import org.dmd.dmc.DmcValueException;                         // Type checking - (GenUtility.java:3284)
import org.dmd.dmc.DmcValueExceptionSet;                      // Ambiguous reference resolution - (GenUtility.java:3292)
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;          // Derivation base - (GenUtility.java:3287)



@SuppressWarnings("serial")
/**
 * The DmcTypeField class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3304)
 *    Called from: Called from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3485)
 */
abstract public class DmcTypeField extends DmcTypeComplexTypeWithRefs<Field> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeField(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeField(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    // Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3327)
    public void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
        if (getMVSize() == 0){
            getSV().toJSON(sb,padding,indent);
        }
        else {
            Iterator<Field> it = getMV();
            while(it.hasNext()){
                Field value = it.next();
                value.toJSON(sb,padding,indent);
                if (it.hasNext())
                    sb.append(", \n");                    
            }
        }
    }

    // Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3343)
    public Field typeCheck(Object value) throws DmcValueException {
        Field rc = null;

        if (value instanceof Field){
            rc = (Field)value;
        }
        else if (value instanceof String){
            rc = new Field((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Field expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3366)
     */
    public Field cloneValue(Field val){
        return(new Field(val));
    }

    /**
     * Writes a Field.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3374)
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, Field value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a Field.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3383)
     */
    @Override
    public Field deserializeValue(DmcInputStreamIF dis) throws Exception {
        Field rc = new Field();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a Field.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3395)
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, Field value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }

    /**
     * Resolves a Field.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3404)
     */
    @Override
    public void resolveValue(DmcNameResolverWithClashSupportIF resolver, Field value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        value.resolve(resolver,object,ncr,ai);
    }

    /**
     * Removes references to other objects from a Field.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3413)
     */
    public void removeBackRefsFromValue(Field value){
        value.removeBackRefsFromValue();
    }



}
