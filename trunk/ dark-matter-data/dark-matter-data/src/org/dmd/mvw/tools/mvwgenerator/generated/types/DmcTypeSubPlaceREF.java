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

import org.dmd.mvw.tools.mvwgenerator.generated.types.SubPlaceREF;

import org.dmd.mvw.tools.mvwgenerator.generated.dmo.SubPlaceDMO;

/**
 * This is the generated DmcAttribute derivative for values of type SubPlace
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:544)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeSubPlaceREF extends DmcTypeNamedObjectREF<SubPlaceREF, CamelCaseName> {

    public DmcTypeSubPlaceREF(){
    
    }

    public DmcTypeSubPlaceREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected SubPlaceREF getNewHelper(){
        return(new SubPlaceREF());
    }

    @Override
    protected CamelCaseName getNewName(){
        return(new CamelCaseName());
    }

    @Override
    protected String getDMOClassName(){
        return( SubPlaceDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof SubPlaceDMO)
            return(true);
        return(false);
    }

    @Override
    protected SubPlaceREF typeCheck(Object value) throws DmcValueException {
        SubPlaceREF rc = null;

        if (value instanceof SubPlaceREF)
            rc = (SubPlaceREF)value;
        else if (value instanceof SubPlaceDMO)
            rc = new SubPlaceREF((SubPlaceDMO)value);
        else if (value instanceof CamelCaseName)
            rc = new SubPlaceREF((CamelCaseName)value);
        else if (value instanceof String)
            rc = new SubPlaceREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with SubPlaceREF, SubPlaceDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, SubPlaceREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public SubPlaceREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        SubPlaceREF rc = new SubPlaceREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public SubPlaceREF cloneValue(SubPlaceREF value){
        return(new SubPlaceREF(value));
    }



}