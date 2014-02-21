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
import org.dmd.dmc.types.RuleName;

import org.dmd.dmv.shared.generated.types.OnlyOneOfTheseAttributesAllowedRuleDataREF;

import org.dmd.dmv.shared.generated.dmo.OnlyOneOfTheseAttributesAllowedRuleDataDMO;

/**
 * This is the generated DmcAttribute derivative for values of type OnlyOneOfTheseAttributesAllowedRuleData
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREF extends DmcTypeNamedObjectREF<OnlyOneOfTheseAttributesAllowedRuleDataREF, RuleName> {

    public DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREF(){
    
    }

    public DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected OnlyOneOfTheseAttributesAllowedRuleDataREF getNewHelper(){
        return(new OnlyOneOfTheseAttributesAllowedRuleDataREF());
    }

    @Override
    protected RuleName getNewName(){
        return(new RuleName());
    }

    @Override
    protected String getDMOClassName(){
        return( OnlyOneOfTheseAttributesAllowedRuleDataDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof OnlyOneOfTheseAttributesAllowedRuleDataDMO)
            return(true);
        return(false);
    }

    @Override
    protected OnlyOneOfTheseAttributesAllowedRuleDataREF typeCheck(Object value) throws DmcValueException {
        OnlyOneOfTheseAttributesAllowedRuleDataREF rc = null;

        if (value instanceof OnlyOneOfTheseAttributesAllowedRuleDataREF)
            rc = (OnlyOneOfTheseAttributesAllowedRuleDataREF)value;
        else if (value instanceof OnlyOneOfTheseAttributesAllowedRuleDataDMO)
            rc = new OnlyOneOfTheseAttributesAllowedRuleDataREF((OnlyOneOfTheseAttributesAllowedRuleDataDMO)value);
        else if (value instanceof RuleName)
            rc = new OnlyOneOfTheseAttributesAllowedRuleDataREF((RuleName)value);
        else if (value instanceof String)
            rc = new OnlyOneOfTheseAttributesAllowedRuleDataREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with OnlyOneOfTheseAttributesAllowedRuleDataREF, OnlyOneOfTheseAttributesAllowedRuleDataDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, OnlyOneOfTheseAttributesAllowedRuleDataREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public OnlyOneOfTheseAttributesAllowedRuleDataREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        OnlyOneOfTheseAttributesAllowedRuleDataREF rc = new OnlyOneOfTheseAttributesAllowedRuleDataREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public OnlyOneOfTheseAttributesAllowedRuleDataREF cloneValue(OnlyOneOfTheseAttributesAllowedRuleDataREF value){
        return(new OnlyOneOfTheseAttributesAllowedRuleDataREF(value));
    }



}