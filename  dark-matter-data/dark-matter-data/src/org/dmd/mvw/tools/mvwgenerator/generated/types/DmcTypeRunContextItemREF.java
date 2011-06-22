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

import org.dmd.mvw.tools.mvwgenerator.generated.types.RunContextItemREF;

import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;

/**
 * This is the generated DmcAttribute derivative for values of type RunContextItem
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:547)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeRunContextItemREF extends DmcTypeNamedObjectREF<RunContextItemREF, CamelCaseName> {

    public DmcTypeRunContextItemREF(){
    
    }

    public DmcTypeRunContextItemREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected RunContextItemREF getNewHelper(){
        return(new RunContextItemREF());
    }

    @Override
    protected CamelCaseName getNewName(){
        return(new CamelCaseName());
    }

    @Override
    protected String getDMOClassName(){
        return( RunContextItemDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof RunContextItemDMO)
            return(true);
        return(false);
    }

    @Override
    protected RunContextItemREF typeCheck(Object value) throws DmcValueException {
        RunContextItemREF rc = null;

        if (value instanceof RunContextItemREF)
            rc = (RunContextItemREF)value;
        else if (value instanceof RunContextItemDMO)
            rc = new RunContextItemREF((RunContextItemDMO)value);
        else if (value instanceof CamelCaseName)
            rc = new RunContextItemREF((CamelCaseName)value);
        else if (value instanceof String)
            rc = new RunContextItemREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with RunContextItemREF, RunContextItemDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, RunContextItemREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public RunContextItemREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        RunContextItemREF rc = new RunContextItemREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public RunContextItemREF cloneValue(RunContextItemREF value){
        return(new RunContextItemREF(value));
    }



}
