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

import org.dmd.dmv.shared.generated.types.RestrictReferencesRuleDataREF;

import org.dmd.dmv.shared.generated.dmo.RestrictReferencesRuleDataDMO;

/**
 * This is the generated DmcAttribute derivative for values of type RestrictReferencesRuleData
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeRestrictReferencesRuleDataREF extends DmcTypeNamedObjectREF<RestrictReferencesRuleDataREF, RuleName> {

    public DmcTypeRestrictReferencesRuleDataREF(){
    
    }

    public DmcTypeRestrictReferencesRuleDataREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected RestrictReferencesRuleDataREF getNewHelper(){
        return(new RestrictReferencesRuleDataREF());
    }

    @Override
    protected RuleName getNewName(){
        return(new RuleName());
    }

    @Override
    protected String getDMOClassName(){
        return( RestrictReferencesRuleDataDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof RestrictReferencesRuleDataDMO)
            return(true);
        return(false);
    }

    @Override
    protected RestrictReferencesRuleDataREF typeCheck(Object value) throws DmcValueException {
        RestrictReferencesRuleDataREF rc = null;

        if (value instanceof RestrictReferencesRuleDataREF)
            rc = (RestrictReferencesRuleDataREF)value;
        else if (value instanceof RestrictReferencesRuleDataDMO)
            rc = new RestrictReferencesRuleDataREF((RestrictReferencesRuleDataDMO)value);
        else if (value instanceof RuleName)
            rc = new RestrictReferencesRuleDataREF((RuleName)value);
        else if (value instanceof String)
            rc = new RestrictReferencesRuleDataREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with RestrictReferencesRuleDataREF, RestrictReferencesRuleDataDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, RestrictReferencesRuleDataREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public RestrictReferencesRuleDataREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        RestrictReferencesRuleDataREF rc = new RestrictReferencesRuleDataREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public RestrictReferencesRuleDataREF cloneValue(RestrictReferencesRuleDataREF value){
        return(new RestrictReferencesRuleDataREF(value));
    }



}
