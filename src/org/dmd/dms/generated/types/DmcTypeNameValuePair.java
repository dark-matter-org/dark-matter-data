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
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3110)
import java.io.Serializable;                  // Marker interface for serialization - (GenUtility.java:3092)
import org.dmd.dmc.DmcAttribute;              // Derivation base - (GenUtility.java:3108)
import org.dmd.dmc.DmcAttributeInfo;          // Constructor support - (GenUtility.java:3096)
import org.dmd.dmc.DmcInputStreamIF;          // To support serialization - (GenUtility.java:3093)
import org.dmd.dmc.DmcOutputStreamIF;         // To support serialization - (GenUtility.java:3094)
import org.dmd.dmc.DmcValueException;         // Type checking - (GenUtility.java:3097)



@SuppressWarnings("serial")
/**
 * The DmcTypeNameValuePair class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3117)
 *    Called from: Called from: org.dmd.dms.meta.MetaComplexTypeFormatter.dumpComplexType(MetaComplexTypeFormatter.java:371)
 */
abstract public class DmcTypeNameValuePair extends DmcAttribute<NameValuePair> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeNameValuePair(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeNameValuePair(DmcAttributeInfo ai){
        super(ai);
    }

    protected NameValuePair typeCheck(Object value) throws DmcValueException {
        NameValuePair rc = null;

        if (value instanceof NameValuePair){
            rc = (NameValuePair)value;
        }
        else if (value instanceof String){
            rc = new NameValuePair((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with NameValuePair expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public NameValuePair cloneValue(NameValuePair val){
        return(new NameValuePair(val));
    }

    /**
     * Writes a NameValuePair.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, NameValuePair value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a NameValuePair.
     */
    @Override
    public NameValuePair deserializeValue(DmcInputStreamIF dis) throws Exception {
        NameValuePair rc = new NameValuePair();
        rc.deserializeIt(dis);
        return(rc);
    }



}
