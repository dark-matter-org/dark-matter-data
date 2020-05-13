//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.templates.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.templates.shared.generated.types.TdlDefinitionREF;

import org.dmd.templates.shared.generated.dmo.TdlDefinitionDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TdlDefinition
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTdlDefinitionREF extends DmcTypeNamedObjectREF<TdlDefinitionREF, DefinitionName> {

    public DmcTypeTdlDefinitionREF(){
    
    }

    public DmcTypeTdlDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TdlDefinitionREF getNewHelper(){
        return(new TdlDefinitionREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( TdlDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TdlDefinitionDMO)
            return(true);
        return(false);
    }

    @Override
    protected TdlDefinitionREF typeCheck(Object value) throws DmcValueException {
        TdlDefinitionREF rc = null;

        if (value instanceof TdlDefinitionREF)
            rc = (TdlDefinitionREF)value;
        else if (value instanceof TdlDefinitionDMO)
            rc = new TdlDefinitionREF((TdlDefinitionDMO)value);
        else if (value instanceof DefinitionName)
            rc = new TdlDefinitionREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new TdlDefinitionREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TdlDefinitionREF, TdlDefinitionDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TdlDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TdlDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TdlDefinitionREF rc = new TdlDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TdlDefinitionREF cloneValue(TdlDefinitionREF value){
        return(new TdlDefinitionREF(value));
    }



}
