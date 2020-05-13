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

import org.dmd.dmv.shared.generated.types.ReferencedAttributeTypeRuleDataREF;

import org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ReferencedAttributeTypeRuleData
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeReferencedAttributeTypeRuleDataREF extends DmcTypeNamedObjectREF<ReferencedAttributeTypeRuleDataREF, RuleName> {

    public DmcTypeReferencedAttributeTypeRuleDataREF(){
    
    }

    public DmcTypeReferencedAttributeTypeRuleDataREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ReferencedAttributeTypeRuleDataREF getNewHelper(){
        return(new ReferencedAttributeTypeRuleDataREF());
    }

    @Override
    protected RuleName getNewName(){
        return(new RuleName());
    }

    @Override
    protected String getDMOClassName(){
        return( ReferencedAttributeTypeRuleDataDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ReferencedAttributeTypeRuleDataDMO)
            return(true);
        return(false);
    }

    @Override
    protected ReferencedAttributeTypeRuleDataREF typeCheck(Object value) throws DmcValueException {
        ReferencedAttributeTypeRuleDataREF rc = null;

        if (value instanceof ReferencedAttributeTypeRuleDataREF)
            rc = (ReferencedAttributeTypeRuleDataREF)value;
        else if (value instanceof ReferencedAttributeTypeRuleDataDMO)
            rc = new ReferencedAttributeTypeRuleDataREF((ReferencedAttributeTypeRuleDataDMO)value);
        else if (value instanceof RuleName)
            rc = new ReferencedAttributeTypeRuleDataREF((RuleName)value);
        else if (value instanceof String)
            rc = new ReferencedAttributeTypeRuleDataREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ReferencedAttributeTypeRuleDataREF, ReferencedAttributeTypeRuleDataDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ReferencedAttributeTypeRuleDataREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ReferencedAttributeTypeRuleDataREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ReferencedAttributeTypeRuleDataREF rc = new ReferencedAttributeTypeRuleDataREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ReferencedAttributeTypeRuleDataREF cloneValue(ReferencedAttributeTypeRuleDataREF value){
        return(new ReferencedAttributeTypeRuleDataREF(value));
    }



}
