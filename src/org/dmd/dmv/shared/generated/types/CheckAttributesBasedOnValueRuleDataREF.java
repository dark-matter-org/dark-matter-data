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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO; // primitive type
import org.dmd.dmc.types.RuleName;
import org.dmd.dms.generated.types.DmcTypeRuleNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type CheckAttributesBasedOnValueRuleData
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:420)
 */
@SuppressWarnings("serial")
public class CheckAttributesBasedOnValueRuleDataREF extends DmcNamedObjectNontransportableREF<CheckAttributesBasedOnValueRuleDataDMO> {

    public final static DmcAttributeInfo __ruleName = new DmcAttributeInfo("ruleName",153,"RuleName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    
    DmcTypeRuleNameSV myName;    
    
    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:437)
    public CheckAttributesBasedOnValueRuleDataREF(){
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:441)
    public CheckAttributesBasedOnValueRuleDataREF(CheckAttributesBasedOnValueRuleDataDMO o){
         object = o;
         myName = (DmcTypeRuleNameSV)o.getObjectNameAttribute();
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:447)
    public CheckAttributesBasedOnValueRuleDataREF(RuleName n) throws DmcValueException {
         object = null;
         myName = new DmcTypeRuleNameSV(__ruleName);
         myName.set(n);
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:454)
    public CheckAttributesBasedOnValueRuleDataREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeRuleNameSV(__ruleName);
         myName.set(n);
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:461)
    public CheckAttributesBasedOnValueRuleDataREF(CheckAttributesBasedOnValueRuleDataREF original){
        myName = original.myName;
        object = original.object;
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:467)
    public void setObject(CheckAttributesBasedOnValueRuleDataDMO o){
         object = o;
         if (object != null)
             myName = (DmcTypeRuleNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:477)
    public CheckAttributesBasedOnValueRuleDataREF cloneMe(){
        CheckAttributesBasedOnValueRuleDataREF rc = new CheckAttributesBasedOnValueRuleDataREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null)
            myName = new DmcTypeRuleNameSV(__ruleName);
        myName.set(n);
    }

    public DmcObjectName getObjectName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public RuleName getName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName);
    }

    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        myName.serializeIt(dos);
    }

    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        myName = (DmcTypeRuleNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
