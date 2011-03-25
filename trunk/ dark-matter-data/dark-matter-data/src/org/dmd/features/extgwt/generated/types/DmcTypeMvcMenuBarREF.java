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

import org.dmd.features.extgwt.generated.types.MvcMenuBarREF;

import org.dmd.features.extgwt.generated.dmo.MvcMenuBarDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcMenuBar
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMvcMenuBarREF extends DmcTypeNamedObjectREF<MvcMenuBarREF, StringName> {

    public DmcTypeMvcMenuBarREF(){
    
    }

    public DmcTypeMvcMenuBarREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvcMenuBarREF getNewHelper(){
        return(new MvcMenuBarREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcMenuBarDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcMenuBarDMO)
            return(true);
        return(false);
    }

    @Override
    protected MvcMenuBarREF typeCheck(Object value) throws DmcValueException {
        MvcMenuBarREF rc = null;

        if (value instanceof MvcMenuBarREF)
            rc = (MvcMenuBarREF)value;
        else if (value instanceof MvcMenuBarDMO)
            rc = new MvcMenuBarREF((MvcMenuBarDMO)value);
        else if (value instanceof String)
            rc = new MvcMenuBarREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MvcMenuBarREF, MvcMenuBarDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MvcMenuBarREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MvcMenuBarREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MvcMenuBarREF rc = new MvcMenuBarREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MvcMenuBarREF cloneValue(MvcMenuBarREF value){
        return(new MvcMenuBarREF(value));
    }



}
