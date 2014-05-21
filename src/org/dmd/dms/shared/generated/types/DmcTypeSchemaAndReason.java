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
// Called from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexTypeDmcType(ComplexTypeFormatter.java:503)
import java.io.Serializable;                              // Marker interface for serialization - (ComplexTypeFormatter.java:485)
import org.dmd.core.DmcAttribute;                         // Derivation base - (ComplexTypeFormatter.java:501)
import org.dmd.core.feedback.DMFeedbackSet;               // Type checking - (ComplexTypeFormatter.java:490)
import org.dmd.core.interfaces.DmcInputStreamIF;          // To support serialization - (ComplexTypeFormatter.java:486)
import org.dmd.core.interfaces.DmcOutputStreamIF;         // To support serialization - (ComplexTypeFormatter.java:487)
import org.dmd.core.schema.DmcAttributeInfo;              // Constructor support - (ComplexTypeFormatter.java:489)



@SuppressWarnings("serial")
/**
 * The DmcTypeSchemaAndReason class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexTypeDmcType(ComplexTypeFormatter.java:510)
 *    Called from: Called from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:368)
 */
abstract public class DmcTypeSchemaAndReason extends DmcAttribute<SchemaAndReason> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeSchemaAndReason(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeSchemaAndReason(DmcAttributeInfo ai){
        super(ai);
    }

    protected SchemaAndReason typeCheck(Object value) throws DMFeedbackSet {
        SchemaAndReason rc = null;

        if (value instanceof SchemaAndReason){
            rc = (SchemaAndReason)value;
        }
        else if (value instanceof String){
            rc = new SchemaAndReason((String)value);
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with SchemaAndReason expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public SchemaAndReason cloneValue(SchemaAndReason val){
        return(new SchemaAndReason(val));
    }

    /**
     * Writes a SchemaAndReason.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, SchemaAndReason value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a SchemaAndReason.
     */
    @Override
    public SchemaAndReason deserializeValue(DmcInputStreamIF dis) throws Exception {
        SchemaAndReason rc = new SchemaAndReason();
        rc.deserializeIt(dis);
        return(rc);
    }



}
