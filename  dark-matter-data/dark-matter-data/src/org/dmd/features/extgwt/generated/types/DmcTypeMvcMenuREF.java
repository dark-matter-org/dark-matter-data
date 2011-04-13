//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.features.extgwt.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.features.extgwt.generated.types.MvcMenuREF;

import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcMenu
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:496)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMvcMenuREF extends DmcTypeNamedObjectREF<MvcMenuREF, StringName> {

    public DmcTypeMvcMenuREF(){
    
    }

    public DmcTypeMvcMenuREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvcMenuREF getNewHelper(){
        return(new MvcMenuREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcMenuDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcMenuDMO)
            return(true);
        return(false);
    }

    @Override
    protected MvcMenuREF typeCheck(Object value) throws DmcValueException {
        MvcMenuREF rc = null;

        if (value instanceof MvcMenuREF)
            rc = (MvcMenuREF)value;
        else if (value instanceof MvcMenuDMO)
            rc = new MvcMenuREF((MvcMenuDMO)value);
        else if (value instanceof String)
            rc = new MvcMenuREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MvcMenuREF, MvcMenuDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MvcMenuREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MvcMenuREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MvcMenuREF rc = new MvcMenuREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MvcMenuREF cloneValue(MvcMenuREF value){
        return(new MvcMenuREF(value));
    }



}
