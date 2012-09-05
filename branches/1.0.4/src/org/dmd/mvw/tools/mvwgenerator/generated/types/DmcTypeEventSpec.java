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
import org.dmd.dmc.DmcAttribute;
@SuppressWarnings("serial")
/**
 * The DmcTypeEventSpec class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3050)
 *    Called from: Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:295)
 */
abstract public class DmcTypeEventSpec extends DmcAttribute<EventSpec> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeEventSpec(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeEventSpec(DmcAttributeInfo ai){
        super(ai);
    }

    protected EventSpec typeCheck(Object value) throws DmcValueException {
        EventSpec rc = null;

        if (value instanceof EventSpec){
            rc = (EventSpec)value;
        }
        else if (value instanceof String){
            rc = new EventSpec((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with EventSpec expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public EventSpec cloneValue(EventSpec val){
        return(new EventSpec(val));
    }

    /**
     * Writes a EventSpec.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, EventSpec value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a EventSpec.
     */
    @Override
    public EventSpec deserializeValue(DmcInputStreamIF dis) throws Exception {
        EventSpec rc = new EventSpec();
        rc.deserializeIt(dis);
        return(rc);
    }



}
