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

import org.dmd.features.extgwt.generated.types.MvcMenuSeparatorREF;

import org.dmd.features.extgwt.generated.dmo.MvcMenuSeparatorDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcMenuSeparator
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:495)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMvcMenuSeparatorREF extends DmcTypeNamedObjectREF<MvcMenuSeparatorREF, StringName> {

    public DmcTypeMvcMenuSeparatorREF(){
    
    }

    public DmcTypeMvcMenuSeparatorREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvcMenuSeparatorREF getNewHelper(){
        return(new MvcMenuSeparatorREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcMenuSeparatorDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcMenuSeparatorDMO)
            return(true);
        return(false);
    }

    @Override
    protected MvcMenuSeparatorREF typeCheck(Object value) throws DmcValueException {
        MvcMenuSeparatorREF rc = null;

        if (value instanceof MvcMenuSeparatorREF)
            rc = (MvcMenuSeparatorREF)value;
        else if (value instanceof MvcMenuSeparatorDMO)
            rc = new MvcMenuSeparatorREF((MvcMenuSeparatorDMO)value);
        else if (value instanceof String)
            rc = new MvcMenuSeparatorREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MvcMenuSeparatorREF, MvcMenuSeparatorDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MvcMenuSeparatorREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MvcMenuSeparatorREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MvcMenuSeparatorREF rc = new MvcMenuSeparatorREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MvcMenuSeparatorREF cloneValue(MvcMenuSeparatorREF value){
        return(new MvcMenuSeparatorREF(value));
    }



}
