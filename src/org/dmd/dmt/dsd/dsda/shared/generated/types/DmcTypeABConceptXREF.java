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

import org.dmd.dmt.dsd.dsda.shared.generated.types.ABConceptXREF;

import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ABConceptXDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ABConceptX
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeABConceptXREF extends DmcTypeNamedObjectREF<ABConceptXREF, DefinitionName> {

    public DmcTypeABConceptXREF(){
    
    }

    public DmcTypeABConceptXREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ABConceptXREF getNewHelper(){
        return(new ABConceptXREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( ABConceptXDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ABConceptXDMO)
            return(true);
        return(false);
    }

    @Override
    protected ABConceptXREF typeCheck(Object value) throws DmcValueException {
        ABConceptXREF rc = null;

        if (value instanceof ABConceptXREF)
            rc = (ABConceptXREF)value;
        else if (value instanceof ABConceptXDMO)
            rc = new ABConceptXREF((ABConceptXDMO)value);
        else if (value instanceof DefinitionName)
            rc = new ABConceptXREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new ABConceptXREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ABConceptXREF, ABConceptXDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ABConceptXREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ABConceptXREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ABConceptXREF rc = new ABConceptXREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ABConceptXREF cloneValue(ABConceptXREF value){
        return(new ABConceptXREF(value));
    }



}
