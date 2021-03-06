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
package org.dmd.dmv.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.RuleName;

import org.dmd.dmv.shared.generated.types.NamedObjectRuleDataREF;

import org.dmd.dmv.shared.generated.dmo.NamedObjectRuleDataDMO;

/**
 * This is the generated DmcAttribute derivative for values of type NamedObjectRuleData
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeNamedObjectRuleDataREF extends DmcTypeNamedObjectREF<NamedObjectRuleDataREF, RuleName> {

    public DmcTypeNamedObjectRuleDataREF(){
    
    }

    public DmcTypeNamedObjectRuleDataREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected NamedObjectRuleDataREF getNewHelper(){
        return(new NamedObjectRuleDataREF());
    }

    @Override
    protected RuleName getNewName(){
        return(new RuleName());
    }

    @Override
    protected String getDMOClassName(){
        return( NamedObjectRuleDataDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof NamedObjectRuleDataDMO)
            return(true);
        return(false);
    }

    @Override
    protected NamedObjectRuleDataREF typeCheck(Object value) throws DmcValueException {
        NamedObjectRuleDataREF rc = null;

        if (value instanceof NamedObjectRuleDataREF)
            rc = (NamedObjectRuleDataREF)value;
        else if (value instanceof NamedObjectRuleDataDMO)
            rc = new NamedObjectRuleDataREF((NamedObjectRuleDataDMO)value);
        else if (value instanceof RuleName)
            rc = new NamedObjectRuleDataREF((RuleName)value);
        else if (value instanceof String)
            rc = new NamedObjectRuleDataREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with NamedObjectRuleDataREF, NamedObjectRuleDataDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, NamedObjectRuleDataREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public NamedObjectRuleDataREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        NamedObjectRuleDataREF rc = new NamedObjectRuleDataREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public NamedObjectRuleDataREF cloneValue(NamedObjectRuleDataREF value){
        return(new NamedObjectRuleDataREF(value));
    }



}
