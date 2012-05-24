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
 * The DmcTypeMenuElementTypeAndComment class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:2924)
 *    Called from: Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:295)
 */
abstract public class DmcTypeMenuElementTypeAndComment extends DmcAttribute<MenuElementTypeAndComment> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeMenuElementTypeAndComment(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeMenuElementTypeAndComment(DmcAttributeInfo ai){
        super(ai);
    }

    protected MenuElementTypeAndComment typeCheck(Object value) throws DmcValueException {
        MenuElementTypeAndComment rc = null;

        if (value instanceof MenuElementTypeAndComment){
            rc = (MenuElementTypeAndComment)value;
        }
        else if (value instanceof String){
            rc = new MenuElementTypeAndComment((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MenuElementTypeAndComment expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public MenuElementTypeAndComment cloneValue(MenuElementTypeAndComment val){
        return(new MenuElementTypeAndComment(val));
    }

    /**
     * Writes a MenuElementTypeAndComment.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, MenuElementTypeAndComment value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a MenuElementTypeAndComment.
     */
    @Override
    public MenuElementTypeAndComment deserializeValue(DmcInputStreamIF dis) throws Exception {
        MenuElementTypeAndComment rc = new MenuElementTypeAndComment();
        rc.deserializeIt(dis);
        return(rc);
    }



}
