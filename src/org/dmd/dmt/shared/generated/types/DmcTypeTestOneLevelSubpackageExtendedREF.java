//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.dmt.shared.generated.types.TestOneLevelSubpackageExtendedREF;

import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageExtendedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestOneLevelSubpackageExtended
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTestOneLevelSubpackageExtendedREF extends DmcTypeNamedObjectREF<TestOneLevelSubpackageExtendedREF, DefinitionName> {

    public DmcTypeTestOneLevelSubpackageExtendedREF(){
    
    }

    public DmcTypeTestOneLevelSubpackageExtendedREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestOneLevelSubpackageExtendedREF getNewHelper(){
        return(new TestOneLevelSubpackageExtendedREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestOneLevelSubpackageExtendedDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestOneLevelSubpackageExtendedDMO)
            return(true);
        return(false);
    }

    @Override
    protected TestOneLevelSubpackageExtendedREF typeCheck(Object value) throws DmcValueException {
        TestOneLevelSubpackageExtendedREF rc = null;

        if (value instanceof TestOneLevelSubpackageExtendedREF)
            rc = (TestOneLevelSubpackageExtendedREF)value;
        else if (value instanceof TestOneLevelSubpackageExtendedDMO)
            rc = new TestOneLevelSubpackageExtendedREF((TestOneLevelSubpackageExtendedDMO)value);
        else if (value instanceof DefinitionName)
            rc = new TestOneLevelSubpackageExtendedREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new TestOneLevelSubpackageExtendedREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestOneLevelSubpackageExtendedREF, TestOneLevelSubpackageExtendedDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TestOneLevelSubpackageExtendedREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TestOneLevelSubpackageExtendedREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TestOneLevelSubpackageExtendedREF rc = new TestOneLevelSubpackageExtendedREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TestOneLevelSubpackageExtendedREF cloneValue(TestOneLevelSubpackageExtendedREF value){
        return(new TestOneLevelSubpackageExtendedREF(value));
    }



}
