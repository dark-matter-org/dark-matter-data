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
// Called from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexTypeDmcType(ComplexTypeFormatter.java:511)
import java.io.Serializable;                                              // Marker interface for serialization - (ComplexTypeFormatter.java:493)
import org.dmd.core.DmcObject;                                            // Ambiguous reference resolution - (ComplexTypeFormatter.java:505)
import org.dmd.core.feedback.DMFeedbackSet;                               // Type checking - (ComplexTypeFormatter.java:498)
import org.dmd.core.interfaces.DmcInputStreamIF;                          // To support serialization - (ComplexTypeFormatter.java:494)
import org.dmd.core.interfaces.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (ComplexTypeFormatter.java:503)
import org.dmd.core.interfaces.DmcNameResolverIF;                         // Reference resolution - (ComplexTypeFormatter.java:504)
import org.dmd.core.interfaces.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (ComplexTypeFormatter.java:502)
import org.dmd.core.interfaces.DmcOutputStreamIF;                         // To support serialization - (ComplexTypeFormatter.java:495)
import org.dmd.core.schema.DmcAttributeInfo;                              // Constructor support - (ComplexTypeFormatter.java:497)
import org.dmd.dms.shared.types.DmcTypeComplexTypeWithRefs;               // Derivation base - (ComplexTypeFormatter.java:501)



@SuppressWarnings("serial")
/**
 * The DmcTypeOptimize class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexTypeDmcType(ComplexTypeFormatter.java:518)
 *    Called from: Called from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:368)
 */
abstract public class DmcTypeOptimize extends DmcTypeComplexTypeWithRefs<Optimize> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeOptimize(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeOptimize(DmcAttributeInfo ai){
        super(ai);
    }

    protected Optimize typeCheck(Object value) throws DMFeedbackSet {
        Optimize rc = null;

        if (value instanceof Optimize){
            rc = (Optimize)value;
        }
        else if (value instanceof String){
            rc = new Optimize((String)value);
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with Optimize expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public Optimize cloneValue(Optimize val){
        return(new Optimize(val));
    }

    /**
     * Writes a Optimize.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, Optimize value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a Optimize.
     */
    @Override
    public Optimize deserializeValue(DmcInputStreamIF dis) throws Exception {
        Optimize rc = new Optimize();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a Optimize.
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, Optimize value, String attrName) throws DMFeedbackSet {
        value.resolve(resolver,attrName);
    }

    /**
     * Resolves a Optimize.
     */
    @Override
    public void resolveValue(DmcNameResolverWithClashSupportIF resolver, Optimize value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DMFeedbackSet {
        value.resolve(resolver,object,ncr,ai);
    }



}
