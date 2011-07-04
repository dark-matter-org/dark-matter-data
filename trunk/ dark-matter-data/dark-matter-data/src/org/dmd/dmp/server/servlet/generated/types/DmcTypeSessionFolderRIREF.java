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
package org.dmd.dmp.server.servlet.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DotName;

import org.dmd.dmp.server.servlet.generated.types.SessionFolderRIREF;

import org.dmd.dmp.server.servlet.generated.dmo.SessionFolderRIDMO;

/**
 * This is the generated DmcAttribute derivative for values of type SessionFolderRI
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:548)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeSessionFolderRIREF extends DmcTypeNamedObjectREF<SessionFolderRIREF, DotName> {

    public DmcTypeSessionFolderRIREF(){
    
    }

    public DmcTypeSessionFolderRIREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected SessionFolderRIREF getNewHelper(){
        return(new SessionFolderRIREF());
    }

    @Override
    protected DotName getNewName(){
        return(new DotName());
    }

    @Override
    protected String getDMOClassName(){
        return( SessionFolderRIDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof SessionFolderRIDMO)
            return(true);
        return(false);
    }

    @Override
    protected SessionFolderRIREF typeCheck(Object value) throws DmcValueException {
        SessionFolderRIREF rc = null;

        if (value instanceof SessionFolderRIREF)
            rc = (SessionFolderRIREF)value;
        else if (value instanceof SessionFolderRIDMO)
            rc = new SessionFolderRIREF((SessionFolderRIDMO)value);
        else if (value instanceof DotName)
            rc = new SessionFolderRIREF((DotName)value);
        else if (value instanceof String)
            rc = new SessionFolderRIREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with SessionFolderRIREF, SessionFolderRIDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, SessionFolderRIREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public SessionFolderRIREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        SessionFolderRIREF rc = new SessionFolderRIREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public SessionFolderRIREF cloneValue(SessionFolderRIREF value){
        return(new SessionFolderRIREF(value));
    }



}
