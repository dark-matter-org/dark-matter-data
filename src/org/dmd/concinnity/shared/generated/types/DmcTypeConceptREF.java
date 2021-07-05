//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014-2021 dark-matter-data committers
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

import org.dmd.concinnity.shared.generated.types.ConceptREF;

import org.dmd.concinnity.shared.generated.dmo.ConceptDMO;

/**
 * This is the generated DmcAttribute derivative for values of type Concept
 * <P>
 * Generated from the dmconcinnity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeConceptREF extends DmcTypeNamedObjectREF<ConceptREF, DefinitionName> {

    public DmcTypeConceptREF(){
    
    }

    public DmcTypeConceptREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ConceptREF getNewHelper(){
        return(new ConceptREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( ConceptDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ConceptDMO)
            return(true);
        return(false);
    }

    @Override
    protected ConceptREF typeCheck(Object value) throws DmcValueException {
        ConceptREF rc = null;

        if (value instanceof ConceptREF)
            rc = (ConceptREF)value;
        else if (value instanceof ConceptDMO)
            rc = new ConceptREF((ConceptDMO)value);
        else if (value instanceof DefinitionName)
            rc = new ConceptREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new ConceptREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ConceptREF, ConceptDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ConceptREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ConceptREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ConceptREF rc = new ConceptREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ConceptREF cloneValue(ConceptREF value){
        return(new ConceptREF(value));
    }



}
