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

import org.dmd.dmp.shared.generated.types.NotifyRequestREF;

import org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO;

/**
 * This is the generated DmcAttribute derivative for values of type NotifyRequest
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:606)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeNotifyRequestREF extends DmcTypeNamedObjectREF<NotifyRequestREF, IntegerName> {

    public DmcTypeNotifyRequestREF(){
    
    }

    public DmcTypeNotifyRequestREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected NotifyRequestREF getNewHelper(){
        return(new NotifyRequestREF());
    }

    @Override
    protected IntegerName getNewName(){
        return(new IntegerName());
    }

    @Override
    protected String getDMOClassName(){
        return( NotifyRequestDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof NotifyRequestDMO)
            return(true);
        return(false);
    }

    @Override
    protected NotifyRequestREF typeCheck(Object value) throws DmcValueException {
        NotifyRequestREF rc = null;

        if (value instanceof NotifyRequestREF)
            rc = (NotifyRequestREF)value;
        else if (value instanceof NotifyRequestDMO)
            rc = new NotifyRequestREF((NotifyRequestDMO)value);
        else if (value instanceof String)
            rc = new NotifyRequestREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with NotifyRequestREF, NotifyRequestDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, NotifyRequestREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public NotifyRequestREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        NotifyRequestREF rc = new NotifyRequestREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public NotifyRequestREF cloneValue(NotifyRequestREF value){
        return(new NotifyRequestREF(value));
    }



}
