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
 * The DmcTypeRuleDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2058)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeRuleDefinitionREF extends DmcTypeNamedObjectREF<RuleDefinitionREF, StringName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeRuleDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeRuleDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a RuleDefinitionREF or RuleDefinitionDMO.
     */
    public RuleDefinitionREF typeCheck(Object value) throws DmcValueException {
        RuleDefinitionREF rc = null;
        if (value instanceof RuleDefinitionREF)
            rc = (RuleDefinitionREF)value;
        else if (value instanceof RuleDefinitionDMO)
            rc = new RuleDefinitionREF((RuleDefinitionDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new RuleDefinitionREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new RuleDefinitionREF();
            rc.setName(new StringName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a RuleDefinitionREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected RuleDefinitionREF getNewHelper(){
        return( new RuleDefinitionREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( RuleDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof RuleDefinitionDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public RuleDefinitionREF cloneValue(RuleDefinitionREF val){
        RuleDefinitionREF rc = new RuleDefinitionREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, RuleDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public RuleDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        RuleDefinitionREF rc = new RuleDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
