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
package org.dmd.dmv.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmv.shared.generated.types.RuleREF;

import org.dmd.dmv.shared.generated.dmo.RuleDMO;

/**
 * This is the generated DmcAttribute derivative for values of type Rule
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:584)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeRuleREF extends DmcTypeNamedObjectREF<RuleREF, StringName> {

    public DmcTypeRuleREF(){
    
    }

    public DmcTypeRuleREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected RuleREF getNewHelper(){
        return(new RuleREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( RuleDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof RuleDMO)
            return(true);
        return(false);
    }

    @Override
    protected RuleREF typeCheck(Object value) throws DmcValueException {
        RuleREF rc = null;

        if (value instanceof RuleREF)
            rc = (RuleREF)value;
        else if (value instanceof RuleDMO)
            rc = new RuleREF((RuleDMO)value);
        else if (value instanceof StringName)
            rc = new RuleREF((StringName)value);
        else if (value instanceof String)
            rc = new RuleREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with RuleREF, RuleDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, RuleREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public RuleREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        RuleREF rc = new RuleREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public RuleREF cloneValue(RuleREF value){
        return(new RuleREF(value));
    }



}
