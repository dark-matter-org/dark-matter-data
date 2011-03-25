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

import org.dmd.features.extgwt.generated.types.MvcRegistryItemREF;

import org.dmd.features.extgwt.generated.dmo.MvcRegistryItemDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcRegistryItem
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:591)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMvcRegistryItemREF extends DmcTypeNamedObjectREF<MvcRegistryItemREF, StringName> {

    public DmcTypeMvcRegistryItemREF(){
    
    }

    public DmcTypeMvcRegistryItemREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvcRegistryItemREF getNewHelper(){
        return(new MvcRegistryItemREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcRegistryItemDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcRegistryItemDMO)
            return(true);
        return(false);
    }

    @Override
    protected MvcRegistryItemREF typeCheck(Object value) throws DmcValueException {
        MvcRegistryItemREF rc = null;

        if (value instanceof MvcRegistryItemREF)
            rc = (MvcRegistryItemREF)value;
        else if (value instanceof MvcRegistryItemDMO)
            rc = new MvcRegistryItemREF((MvcRegistryItemDMO)value);
        else if (value instanceof String)
            rc = new MvcRegistryItemREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MvcRegistryItemREF, MvcRegistryItemDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MvcRegistryItemREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MvcRegistryItemREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MvcRegistryItemREF rc = new MvcRegistryItemREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MvcRegistryItemREF cloneValue(MvcRegistryItemREF value){
        return(new MvcRegistryItemREF(value));
    }



}
