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
package org.dmd.concinnity.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.concinnity.shared.generated.types.ConcinnityModuleREF;

import org.dmd.concinnity.shared.generated.dmo.ConcinnityModuleDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ConcinnityModule
 * <P>
 * Generated from the dmconcinnity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:583)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeConcinnityModuleREF extends DmcTypeNamedObjectREF<ConcinnityModuleREF, DefinitionName> {

    public DmcTypeConcinnityModuleREF(){
    
    }

    public DmcTypeConcinnityModuleREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ConcinnityModuleREF getNewHelper(){
        return(new ConcinnityModuleREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( ConcinnityModuleDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ConcinnityModuleDMO)
            return(true);
        return(false);
    }

    @Override
    protected ConcinnityModuleREF typeCheck(Object value) throws DmcValueException {
        ConcinnityModuleREF rc = null;

        if (value instanceof ConcinnityModuleREF)
            rc = (ConcinnityModuleREF)value;
        else if (value instanceof ConcinnityModuleDMO)
            rc = new ConcinnityModuleREF((ConcinnityModuleDMO)value);
        else if (value instanceof DefinitionName)
            rc = new ConcinnityModuleREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new ConcinnityModuleREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ConcinnityModuleREF, ConcinnityModuleDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ConcinnityModuleREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ConcinnityModuleREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ConcinnityModuleREF rc = new ConcinnityModuleREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ConcinnityModuleREF cloneValue(ConcinnityModuleREF value){
        return(new ConcinnityModuleREF(value));
    }



}
