//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmc.types.StringName;
/**
 * The DmcTypeRuleDataREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2546)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeRuleDataREF extends DmcTypeNamedObjectREF<RuleDataREF, StringName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeRuleDataREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeRuleDataREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a RuleDataREF or RuleDataDMO.
     */
    public RuleDataREF typeCheck(Object value) throws DmcValueException {
        RuleDataREF rc = null;
        if (value instanceof RuleDataREF)
            rc = (RuleDataREF)value;
        else if (value instanceof RuleDataDMO)
            rc = new RuleDataREF((RuleDataDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new RuleDataREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new RuleDataREF();
            rc.setName(new StringName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a RuleDataREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected RuleDataREF getNewHelper(){
        return( new RuleDataREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( RuleDataDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof RuleDataDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public RuleDataREF cloneValue(RuleDataREF val){
        RuleDataREF rc = new RuleDataREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, RuleDataREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public RuleDataREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        RuleDataREF rc = new RuleDataREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
