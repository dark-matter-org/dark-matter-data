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

import org.dmd.mvw.tools.mvwgenerator.generated.types.DMOViewREF;

import org.dmd.mvw.tools.mvwgenerator.generated.dmo.DMOViewDMO;

/**
 * This is the generated DmcAttribute derivative for values of type DMOView
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:518)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDMOViewREF extends DmcTypeNamedObjectREF<DMOViewREF, CamelCaseName> {

    public DmcTypeDMOViewREF(){
    
    }

    public DmcTypeDMOViewREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected DMOViewREF getNewHelper(){
        return(new DMOViewREF());
    }

    @Override
    protected CamelCaseName getNewName(){
        return(new CamelCaseName());
    }

    @Override
    protected String getDMOClassName(){
        return( DMOViewDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof DMOViewDMO)
            return(true);
        return(false);
    }

    @Override
    protected DMOViewREF typeCheck(Object value) throws DmcValueException {
        DMOViewREF rc = null;

        if (value instanceof DMOViewREF)
            rc = (DMOViewREF)value;
        else if (value instanceof DMOViewDMO)
            rc = new DMOViewREF((DMOViewDMO)value);
        else if (value instanceof String)
            rc = new DMOViewREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DMOViewREF, DMOViewDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, DMOViewREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public DMOViewREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        DMOViewREF rc = new DMOViewREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public DMOViewREF cloneValue(DMOViewREF value){
        return(new DMOViewREF(value));
    }



}
