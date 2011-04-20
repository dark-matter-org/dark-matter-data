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
package org.dmd.features.extgwt.examples.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.features.extgwt.examples.generated.types.FolderREF;

import org.dmd.features.extgwt.examples.generated.dmo.FolderDMO;

/**
 * This is the generated DmcAttribute derivative for values of type Folder
 * <P>
 * Generated from the mail schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:509)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeFolderREF extends DmcTypeNamedObjectREF<FolderREF, StringName> {

    public DmcTypeFolderREF(){
    
    }

    public DmcTypeFolderREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected FolderREF getNewHelper(){
        return(new FolderREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( FolderDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof FolderDMO)
            return(true);
        return(false);
    }

    @Override
    protected FolderREF typeCheck(Object value) throws DmcValueException {
        FolderREF rc = null;

        if (value instanceof FolderREF)
            rc = (FolderREF)value;
        else if (value instanceof FolderDMO)
            rc = new FolderREF((FolderDMO)value);
        else if (value instanceof String)
            rc = new FolderREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with FolderREF, FolderDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, FolderREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public FolderREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        FolderREF rc = new FolderREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public FolderREF cloneValue(FolderREF value){
        return(new FolderREF(value));
    }



}
