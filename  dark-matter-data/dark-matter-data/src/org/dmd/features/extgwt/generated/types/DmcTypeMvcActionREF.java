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

import org.dmd.features.extgwt.generated.types.MvcActionREF;

import org.dmd.features.extgwt.generated.dmo.MvcActionDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcAction
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:500)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMvcActionREF extends DmcTypeNamedObjectREF<MvcActionREF, StringName> {

    public DmcTypeMvcActionREF(){
    
    }

    public DmcTypeMvcActionREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvcActionREF getNewHelper(){
        return(new MvcActionREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcActionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcActionDMO)
            return(true);
        return(false);
    }

    @Override
    protected MvcActionREF typeCheck(Object value) throws DmcValueException {
        MvcActionREF rc = null;

        if (value instanceof MvcActionREF)
            rc = (MvcActionREF)value;
        else if (value instanceof MvcActionDMO)
            rc = new MvcActionREF((MvcActionDMO)value);
        else if (value instanceof String)
            rc = new MvcActionREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MvcActionREF, MvcActionDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MvcActionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MvcActionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MvcActionREF rc = new MvcActionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MvcActionREF cloneValue(MvcActionREF value){
        return(new MvcActionREF(value));
    }



}
