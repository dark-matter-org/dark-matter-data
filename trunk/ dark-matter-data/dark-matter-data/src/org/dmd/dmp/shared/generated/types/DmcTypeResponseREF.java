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
package org.dmd.dmp.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.IntegerName;

import org.dmd.dmp.shared.generated.types.ResponseREF;

import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

/**
 * This is the generated DmcAttribute derivative for values of type Response
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:495)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeResponseREF extends DmcTypeNamedObjectREF<ResponseREF, IntegerName> {

    public DmcTypeResponseREF(){
    
    }

    public DmcTypeResponseREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ResponseREF getNewHelper(){
        return(new ResponseREF());
    }

    @Override
    protected IntegerName getNewName(){
        return(new IntegerName());
    }

    @Override
    protected String getDMOClassName(){
        return( ResponseDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ResponseDMO)
            return(true);
        return(false);
    }

    @Override
    protected ResponseREF typeCheck(Object value) throws DmcValueException {
        ResponseREF rc = null;

        if (value instanceof ResponseREF)
            rc = (ResponseREF)value;
        else if (value instanceof ResponseDMO)
            rc = new ResponseREF((ResponseDMO)value);
        else if (value instanceof String)
            rc = new ResponseREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ResponseREF, ResponseDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ResponseREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ResponseREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ResponseREF rc = new ResponseREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ResponseREF cloneValue(ResponseREF value){
        return(new ResponseREF(value));
    }



}