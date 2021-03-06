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

import org.dmd.dmv.shared.generated.types.UCOAllowedAttributesRuleDataREF;

import org.dmd.dmv.shared.generated.dmo.UCOAllowedAttributesRuleDataDMO;

/**
 * This is the generated DmcAttribute derivative for values of type UCOAllowedAttributesRuleData
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeUCOAllowedAttributesRuleDataREF extends DmcTypeNamedObjectREF<UCOAllowedAttributesRuleDataREF, RuleName> {

    public DmcTypeUCOAllowedAttributesRuleDataREF(){
    
    }

    public DmcTypeUCOAllowedAttributesRuleDataREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected UCOAllowedAttributesRuleDataREF getNewHelper(){
        return(new UCOAllowedAttributesRuleDataREF());
    }

    @Override
    protected RuleName getNewName(){
        return(new RuleName());
    }

    @Override
    protected String getDMOClassName(){
        return( UCOAllowedAttributesRuleDataDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof UCOAllowedAttributesRuleDataDMO)
            return(true);
        return(false);
    }

    @Override
    protected UCOAllowedAttributesRuleDataREF typeCheck(Object value) throws DmcValueException {
        UCOAllowedAttributesRuleDataREF rc = null;

        if (value instanceof UCOAllowedAttributesRuleDataREF)
            rc = (UCOAllowedAttributesRuleDataREF)value;
        else if (value instanceof UCOAllowedAttributesRuleDataDMO)
            rc = new UCOAllowedAttributesRuleDataREF((UCOAllowedAttributesRuleDataDMO)value);
        else if (value instanceof RuleName)
            rc = new UCOAllowedAttributesRuleDataREF((RuleName)value);
        else if (value instanceof String)
            rc = new UCOAllowedAttributesRuleDataREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with UCOAllowedAttributesRuleDataREF, UCOAllowedAttributesRuleDataDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, UCOAllowedAttributesRuleDataREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public UCOAllowedAttributesRuleDataREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        UCOAllowedAttributesRuleDataREF rc = new UCOAllowedAttributesRuleDataREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public UCOAllowedAttributesRuleDataREF cloneValue(UCOAllowedAttributesRuleDataREF value){
        return(new UCOAllowedAttributesRuleDataREF(value));
    }



}
