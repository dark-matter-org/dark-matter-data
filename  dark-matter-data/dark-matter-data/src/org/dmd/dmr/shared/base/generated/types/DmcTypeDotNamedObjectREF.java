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
package org.dmd.dmr.shared.base.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.FullyQualifiedName;

import org.dmd.dmr.shared.base.generated.types.DotNamedObjectREF;

import org.dmd.dmr.shared.base.generated.dmo.DotNamedObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type DotNamedObject
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:547)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDotNamedObjectREF extends DmcTypeNamedObjectREF<DotNamedObjectREF, FullyQualifiedName> {

    public DmcTypeDotNamedObjectREF(){
    
    }

    public DmcTypeDotNamedObjectREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected DotNamedObjectREF getNewHelper(){
        return(new DotNamedObjectREF());
    }

    @Override
    protected FullyQualifiedName getNewName(){
        return(new FullyQualifiedName());
    }

    @Override
    protected String getDMOClassName(){
        return( DotNamedObjectDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof DotNamedObjectDMO)
            return(true);
        return(false);
    }

    @Override
    protected DotNamedObjectREF typeCheck(Object value) throws DmcValueException {
        DotNamedObjectREF rc = null;

        if (value instanceof DotNamedObjectREF)
            rc = (DotNamedObjectREF)value;
        else if (value instanceof DotNamedObjectDMO)
            rc = new DotNamedObjectREF((DotNamedObjectDMO)value);
        else if (value instanceof FullyQualifiedName)
            rc = new DotNamedObjectREF((FullyQualifiedName)value);
        else if (value instanceof String)
            rc = new DotNamedObjectREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DotNamedObjectREF, DotNamedObjectDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, DotNamedObjectREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public DotNamedObjectREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        DotNamedObjectREF rc = new DotNamedObjectREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public DotNamedObjectREF cloneValue(DotNamedObjectREF value){
        return(new DotNamedObjectREF(value));
    }



}
