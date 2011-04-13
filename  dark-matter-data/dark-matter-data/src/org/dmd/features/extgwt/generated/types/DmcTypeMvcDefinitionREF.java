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

import org.dmd.features.extgwt.generated.types.MvcDefinitionREF;

import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcDefinition
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:496)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMvcDefinitionREF extends DmcTypeNamedObjectREF<MvcDefinitionREF, StringName> {

    public DmcTypeMvcDefinitionREF(){
    
    }

    public DmcTypeMvcDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvcDefinitionREF getNewHelper(){
        return(new MvcDefinitionREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcDefinitionDMO)
            return(true);
        return(false);
    }

    @Override
    protected MvcDefinitionREF typeCheck(Object value) throws DmcValueException {
        MvcDefinitionREF rc = null;

        if (value instanceof MvcDefinitionREF)
            rc = (MvcDefinitionREF)value;
        else if (value instanceof MvcDefinitionDMO)
            rc = new MvcDefinitionREF((MvcDefinitionDMO)value);
        else if (value instanceof String)
            rc = new MvcDefinitionREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MvcDefinitionREF, MvcDefinitionDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MvcDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MvcDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MvcDefinitionREF rc = new MvcDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MvcDefinitionREF cloneValue(MvcDefinitionREF value){
        return(new MvcDefinitionREF(value));
    }



}
