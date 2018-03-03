//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmt.dsd.dsda.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.dmt.dsd.dsda.shared.generated.types.AConceptBaseREF;

import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptBaseDMO;

/**
 * This is the generated DmcAttribute derivative for values of type AConceptBase
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:583)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeAConceptBaseREF extends DmcTypeNamedObjectREF<AConceptBaseREF, DefinitionName> {

    public DmcTypeAConceptBaseREF(){
    
    }

    public DmcTypeAConceptBaseREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected AConceptBaseREF getNewHelper(){
        return(new AConceptBaseREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( AConceptBaseDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof AConceptBaseDMO)
            return(true);
        return(false);
    }

    @Override
    protected AConceptBaseREF typeCheck(Object value) throws DmcValueException {
        AConceptBaseREF rc = null;

        if (value instanceof AConceptBaseREF)
            rc = (AConceptBaseREF)value;
        else if (value instanceof AConceptBaseDMO)
            rc = new AConceptBaseREF((AConceptBaseDMO)value);
        else if (value instanceof DefinitionName)
            rc = new AConceptBaseREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new AConceptBaseREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with AConceptBaseREF, AConceptBaseDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, AConceptBaseREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public AConceptBaseREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        AConceptBaseREF rc = new AConceptBaseREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public AConceptBaseREF cloneValue(AConceptBaseREF value){
        return(new AConceptBaseREF(value));
    }



}
