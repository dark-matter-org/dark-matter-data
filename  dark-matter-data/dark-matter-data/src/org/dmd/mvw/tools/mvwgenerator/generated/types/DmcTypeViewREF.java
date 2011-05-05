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

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.CamelCaseName;

import org.dmd.mvw.tools.mvwgenerator.generated.types.ViewREF;

import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;

/**
 * This is the generated DmcAttribute derivative for values of type View
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:518)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeViewREF extends DmcTypeNamedObjectREF<ViewREF, CamelCaseName> {

    public DmcTypeViewREF(){
    
    }

    public DmcTypeViewREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ViewREF getNewHelper(){
        return(new ViewREF());
    }

    @Override
    protected CamelCaseName getNewName(){
        return(new CamelCaseName());
    }

    @Override
    protected String getDMOClassName(){
        return( ViewDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ViewDMO)
            return(true);
        return(false);
    }

    @Override
    protected ViewREF typeCheck(Object value) throws DmcValueException {
        ViewREF rc = null;

        if (value instanceof ViewREF)
            rc = (ViewREF)value;
        else if (value instanceof ViewDMO)
            rc = new ViewREF((ViewDMO)value);
        else if (value instanceof String)
            rc = new ViewREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ViewREF, ViewDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ViewREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ViewREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ViewREF rc = new ViewREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ViewREF cloneValue(ViewREF value){
        return(new ViewREF(value));
    }



}
