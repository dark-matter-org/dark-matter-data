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

import org.dmd.features.extgwt.generated.types.MvcServerEventREF;

import org.dmd.features.extgwt.generated.dmo.MvcServerEventDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcServerEvent
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:547)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMvcServerEventREF extends DmcTypeNamedObjectREF<MvcServerEventREF, StringName> {

    public DmcTypeMvcServerEventREF(){
    
    }

    public DmcTypeMvcServerEventREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvcServerEventREF getNewHelper(){
        return(new MvcServerEventREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcServerEventDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcServerEventDMO)
            return(true);
        return(false);
    }

    @Override
    protected MvcServerEventREF typeCheck(Object value) throws DmcValueException {
        MvcServerEventREF rc = null;

        if (value instanceof MvcServerEventREF)
            rc = (MvcServerEventREF)value;
        else if (value instanceof MvcServerEventDMO)
            rc = new MvcServerEventREF((MvcServerEventDMO)value);
        else if (value instanceof StringName)
            rc = new MvcServerEventREF((StringName)value);
        else if (value instanceof String)
            rc = new MvcServerEventREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MvcServerEventREF, MvcServerEventDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MvcServerEventREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MvcServerEventREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MvcServerEventREF rc = new MvcServerEventREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MvcServerEventREF cloneValue(MvcServerEventREF value){
        return(new MvcServerEventREF(value));
    }



}
