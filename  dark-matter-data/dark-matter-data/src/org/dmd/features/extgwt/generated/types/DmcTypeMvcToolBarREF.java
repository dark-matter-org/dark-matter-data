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

import org.dmd.features.extgwt.generated.types.MvcToolBarREF;

import org.dmd.features.extgwt.generated.dmo.MvcToolBarDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcToolBar
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:518)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMvcToolBarREF extends DmcTypeNamedObjectREF<MvcToolBarREF, StringName> {

    public DmcTypeMvcToolBarREF(){
    
    }

    public DmcTypeMvcToolBarREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvcToolBarREF getNewHelper(){
        return(new MvcToolBarREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcToolBarDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcToolBarDMO)
            return(true);
        return(false);
    }

    @Override
    protected MvcToolBarREF typeCheck(Object value) throws DmcValueException {
        MvcToolBarREF rc = null;

        if (value instanceof MvcToolBarREF)
            rc = (MvcToolBarREF)value;
        else if (value instanceof MvcToolBarDMO)
            rc = new MvcToolBarREF((MvcToolBarDMO)value);
        else if (value instanceof String)
            rc = new MvcToolBarREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MvcToolBarREF, MvcToolBarDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MvcToolBarREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MvcToolBarREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MvcToolBarREF rc = new MvcToolBarREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MvcToolBarREF cloneValue(MvcToolBarREF value){
        return(new MvcToolBarREF(value));
    }



}
