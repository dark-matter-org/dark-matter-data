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
package org.dmd.dmg.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.dmg.generated.types.ActifactGeneratorREF;

import org.dmd.dmg.generated.dmo.ActifactGeneratorDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ActifactGenerator
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeActifactGeneratorREF extends DmcTypeNamedObjectREF<ActifactGeneratorREF, DefinitionName> {

    public DmcTypeActifactGeneratorREF(){
    
    }

    public DmcTypeActifactGeneratorREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ActifactGeneratorREF getNewHelper(){
        return(new ActifactGeneratorREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( ActifactGeneratorDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ActifactGeneratorDMO)
            return(true);
        return(false);
    }

    @Override
    protected ActifactGeneratorREF typeCheck(Object value) throws DmcValueException {
        ActifactGeneratorREF rc = null;

        if (value instanceof ActifactGeneratorREF)
            rc = (ActifactGeneratorREF)value;
        else if (value instanceof ActifactGeneratorDMO)
            rc = new ActifactGeneratorREF((ActifactGeneratorDMO)value);
        else if (value instanceof DefinitionName)
            rc = new ActifactGeneratorREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new ActifactGeneratorREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ActifactGeneratorREF, ActifactGeneratorDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ActifactGeneratorREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ActifactGeneratorREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ActifactGeneratorREF rc = new ActifactGeneratorREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ActifactGeneratorREF cloneValue(ActifactGeneratorREF value){
        return(new ActifactGeneratorREF(value));
    }



}
