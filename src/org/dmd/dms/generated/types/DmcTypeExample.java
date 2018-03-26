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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3123)
import java.io.Serializable;                  // Marker interface for serialization - (GenUtility.java:3104)
import java.util.Iterator;                    // For JSON formatting - (GenUtility.java:3105)
import org.dmd.dmc.DmcAttribute;              // Derivation base - (GenUtility.java:3121)
import org.dmd.dmc.DmcAttributeInfo;          // Constructor support - (GenUtility.java:3109)
import org.dmd.dmc.DmcInputStreamIF;          // To support serialization - (GenUtility.java:3106)
import org.dmd.dmc.DmcOutputStreamIF;         // To support serialization - (GenUtility.java:3107)
import org.dmd.dmc.DmcValueException;         // Type checking - (GenUtility.java:3110)



@SuppressWarnings("serial")
/**
 * The DmcTypeExample class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3130)
 *    Called from: Called from: org.dmd.dms.meta.MetaComplexTypeFormatter.dumpComplexType(MetaComplexTypeFormatter.java:375)
 */
abstract public class DmcTypeExample extends DmcAttribute<Example> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeExample(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeExample(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
        if (getMVSize() == 0){
            getSV().toJSON(sb,padding,indent);
        }
        else {
            Iterator<Example> it = getMV();
            while(it.hasNext()){
                Example value = it.next();
                value.toJSON(sb,padding,indent);
                if (it.hasNext())
                    sb.append(", \n");                    
            }
        }
    }

    protected Example typeCheck(Object value) throws DmcValueException {
        Example rc = null;

        if (value instanceof Example){
            rc = (Example)value;
        }
        else if (value instanceof String){
            rc = new Example((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Example expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public Example cloneValue(Example val){
        return(new Example(val));
    }

    /**
     * Writes a Example.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, Example value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a Example.
     */
    @Override
    public Example deserializeValue(DmcInputStreamIF dis) throws Exception {
        Example rc = new Example();
        rc.deserializeIt(dis);
        return(rc);
    }



}
