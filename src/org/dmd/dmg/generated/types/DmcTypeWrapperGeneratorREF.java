//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010-2021 dark-matter-data committers
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
package org.dmd.dmg.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.dmg.generated.types.WrapperGeneratorREF;

import org.dmd.dmg.generated.dmo.WrapperGeneratorDMO;

/**
 * This is the generated DmcAttribute derivative for values of type WrapperGenerator
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeWrapperGeneratorREF extends DmcTypeNamedObjectREF<WrapperGeneratorREF, DefinitionName> {

    public DmcTypeWrapperGeneratorREF(){
    
    }

    public DmcTypeWrapperGeneratorREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected WrapperGeneratorREF getNewHelper(){
        return(new WrapperGeneratorREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( WrapperGeneratorDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof WrapperGeneratorDMO)
            return(true);
        return(false);
    }

    @Override
    protected WrapperGeneratorREF typeCheck(Object value) throws DmcValueException {
        WrapperGeneratorREF rc = null;

        if (value instanceof WrapperGeneratorREF)
            rc = (WrapperGeneratorREF)value;
        else if (value instanceof WrapperGeneratorDMO)
            rc = new WrapperGeneratorREF((WrapperGeneratorDMO)value);
        else if (value instanceof DefinitionName)
            rc = new WrapperGeneratorREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new WrapperGeneratorREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with WrapperGeneratorREF, WrapperGeneratorDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, WrapperGeneratorREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public WrapperGeneratorREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        WrapperGeneratorREF rc = new WrapperGeneratorREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public WrapperGeneratorREF cloneValue(WrapperGeneratorREF value){
        return(new WrapperGeneratorREF(value));
    }



}
