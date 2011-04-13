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

import org.dmd.dmr.shared.base.generated.types.HierarchicObjectREF;

import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type HierarchicObject
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:496)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeHierarchicObjectREF extends DmcTypeNamedObjectREF<HierarchicObjectREF, FullyQualifiedName> {

    public DmcTypeHierarchicObjectREF(){
    
    }

    public DmcTypeHierarchicObjectREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected HierarchicObjectREF getNewHelper(){
        return(new HierarchicObjectREF());
    }

    @Override
    protected FullyQualifiedName getNewName(){
        return(new FullyQualifiedName());
    }

    @Override
    protected String getDMOClassName(){
        return( HierarchicObjectDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof HierarchicObjectDMO)
            return(true);
        return(false);
    }

    @Override
    protected HierarchicObjectREF typeCheck(Object value) throws DmcValueException {
        HierarchicObjectREF rc = null;

        if (value instanceof HierarchicObjectREF)
            rc = (HierarchicObjectREF)value;
        else if (value instanceof HierarchicObjectDMO)
            rc = new HierarchicObjectREF((HierarchicObjectDMO)value);
        else if (value instanceof String)
            rc = new HierarchicObjectREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with HierarchicObjectREF, HierarchicObjectDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, HierarchicObjectREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public HierarchicObjectREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        HierarchicObjectREF rc = new HierarchicObjectREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public HierarchicObjectREF cloneValue(HierarchicObjectREF value){
        return(new HierarchicObjectREF(value));
    }



}
