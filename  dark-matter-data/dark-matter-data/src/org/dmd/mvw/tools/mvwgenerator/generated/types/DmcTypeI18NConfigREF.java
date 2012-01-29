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

import org.dmd.mvw.tools.mvwgenerator.generated.types.I18NConfigREF;

import org.dmd.mvw.tools.mvwgenerator.generated.dmo.I18NConfigDMO;

/**
 * This is the generated DmcAttribute derivative for values of type I18NConfig
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:577)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeI18NConfigREF extends DmcTypeNamedObjectREF<I18NConfigREF, CamelCaseName> {

    public DmcTypeI18NConfigREF(){
    
    }

    public DmcTypeI18NConfigREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected I18NConfigREF getNewHelper(){
        return(new I18NConfigREF());
    }

    @Override
    protected CamelCaseName getNewName(){
        return(new CamelCaseName());
    }

    @Override
    protected String getDMOClassName(){
        return( I18NConfigDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof I18NConfigDMO)
            return(true);
        return(false);
    }

    @Override
    protected I18NConfigREF typeCheck(Object value) throws DmcValueException {
        I18NConfigREF rc = null;

        if (value instanceof I18NConfigREF)
            rc = (I18NConfigREF)value;
        else if (value instanceof I18NConfigDMO)
            rc = new I18NConfigREF((I18NConfigDMO)value);
        else if (value instanceof CamelCaseName)
            rc = new I18NConfigREF((CamelCaseName)value);
        else if (value instanceof String)
            rc = new I18NConfigREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with I18NConfigREF, I18NConfigDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, I18NConfigREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public I18NConfigREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        I18NConfigREF rc = new I18NConfigREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public I18NConfigREF cloneValue(I18NConfigREF value){
        return(new I18NConfigREF(value));
    }



}