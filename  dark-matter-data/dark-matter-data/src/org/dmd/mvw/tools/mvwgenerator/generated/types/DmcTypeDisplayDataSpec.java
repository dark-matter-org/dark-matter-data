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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;
import org.dmd.dmc.DmcNameResolverIF;
@SuppressWarnings("serial")
/**
 * The DmcTypeDisplayDataSpec class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:2743)
 *    Called from: Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:291)
 */
abstract public class DmcTypeDisplayDataSpec extends DmcTypeComplexTypeWithRefs<DisplayDataSpec> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDisplayDataSpec(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDisplayDataSpec(DmcAttributeInfo ai){
        super(ai);
    }

    protected DisplayDataSpec typeCheck(Object value) throws DmcValueException {
        DisplayDataSpec rc = null;

        if (value instanceof DisplayDataSpec){
            rc = (DisplayDataSpec)value;
        }
        else if (value instanceof String){
            rc = new DisplayDataSpec((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DisplayDataSpec expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public DisplayDataSpec cloneValue(DisplayDataSpec val){
        return(new DisplayDataSpec(val));
    }

    /**
     * Writes a DisplayDataSpec.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, DisplayDataSpec value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a DisplayDataSpec.
     */
    @Override
    public DisplayDataSpec deserializeValue(DmcInputStreamIF dis) throws Exception {
        DisplayDataSpec rc = new DisplayDataSpec();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a DisplayDataSpec.
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, DisplayDataSpec value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }



}
