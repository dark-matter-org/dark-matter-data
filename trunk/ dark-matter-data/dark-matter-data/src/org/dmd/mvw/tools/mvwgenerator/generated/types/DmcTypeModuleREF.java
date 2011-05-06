//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.CamelCaseName;

import org.dmd.mvw.tools.mvwgenerator.generated.types.ModuleREF;

import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ModuleDMO;

/**
 * This is the generated DmcAttribute derivative for values of type Module
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:538)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeModuleREF extends DmcTypeNamedObjectREF<ModuleREF, CamelCaseName> {

    public DmcTypeModuleREF(){
    
    }

    public DmcTypeModuleREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ModuleREF getNewHelper(){
        return(new ModuleREF());
    }

    @Override
    protected CamelCaseName getNewName(){
        return(new CamelCaseName());
    }

    @Override
    protected String getDMOClassName(){
        return( ModuleDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ModuleDMO)
            return(true);
        return(false);
    }

    @Override
    protected ModuleREF typeCheck(Object value) throws DmcValueException {
        ModuleREF rc = null;

        if (value instanceof ModuleREF)
            rc = (ModuleREF)value;
        else if (value instanceof ModuleDMO)
            rc = new ModuleREF((ModuleDMO)value);
        else if (value instanceof String)
            rc = new ModuleREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ModuleREF, ModuleDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ModuleREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ModuleREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ModuleREF rc = new ModuleREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ModuleREF cloneValue(ModuleREF value){
        return(new ModuleREF(value));
    }



}
