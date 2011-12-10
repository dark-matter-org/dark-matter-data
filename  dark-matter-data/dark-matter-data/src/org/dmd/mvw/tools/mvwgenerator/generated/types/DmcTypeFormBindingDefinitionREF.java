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

import org.dmd.mvw.tools.mvwgenerator.generated.types.FormBindingDefinitionREF;

import org.dmd.mvw.tools.mvwgenerator.generated.dmo.FormBindingDefinitionDMO;

/**
 * This is the generated DmcAttribute derivative for values of type FormBindingDefinition
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:577)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeFormBindingDefinitionREF extends DmcTypeNamedObjectREF<FormBindingDefinitionREF, CamelCaseName> {

    public DmcTypeFormBindingDefinitionREF(){
    
    }

    public DmcTypeFormBindingDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected FormBindingDefinitionREF getNewHelper(){
        return(new FormBindingDefinitionREF());
    }

    @Override
    protected CamelCaseName getNewName(){
        return(new CamelCaseName());
    }

    @Override
    protected String getDMOClassName(){
        return( FormBindingDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof FormBindingDefinitionDMO)
            return(true);
        return(false);
    }

    @Override
    protected FormBindingDefinitionREF typeCheck(Object value) throws DmcValueException {
        FormBindingDefinitionREF rc = null;

        if (value instanceof FormBindingDefinitionREF)
            rc = (FormBindingDefinitionREF)value;
        else if (value instanceof FormBindingDefinitionDMO)
            rc = new FormBindingDefinitionREF((FormBindingDefinitionDMO)value);
        else if (value instanceof CamelCaseName)
            rc = new FormBindingDefinitionREF((CamelCaseName)value);
        else if (value instanceof String)
            rc = new FormBindingDefinitionREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with FormBindingDefinitionREF, FormBindingDefinitionDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, FormBindingDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public FormBindingDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        FormBindingDefinitionREF rc = new FormBindingDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public FormBindingDefinitionREF cloneValue(FormBindingDefinitionREF value){
        return(new FormBindingDefinitionREF(value));
    }



}
