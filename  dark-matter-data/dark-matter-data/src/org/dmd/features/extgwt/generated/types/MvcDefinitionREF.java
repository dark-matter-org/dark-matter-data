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
package org.dmd.features.extgwt.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO; // primitive type
import org.dmd.dmc.types.StringName;
import org.dmd.dms.generated.types.DmcTypeStringNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type MvcDefinition
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:356)
 */
@SuppressWarnings("serial")
public class MvcDefinitionREF extends DmcNamedObjectNontransportableREF<MvcDefinitionDMO> {

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeStringNameSV myName;    
    
    public MvcDefinitionREF(){
    }

    public MvcDefinitionREF(MvcDefinitionDMO o){
         object = o;
         myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    public MvcDefinitionREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeStringNameSV();
         myName.set(n);
    }

    public MvcDefinitionREF(MvcDefinitionREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(MvcDefinitionDMO o){
         object = o;
         myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public MvcDefinitionREF cloneMe(){
        MvcDefinitionREF rc = new MvcDefinitionREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null);
            myName = new DmcTypeStringNameSV(__name);
        myName.set(n);
    }

    @Override
    public DmcObjectName getObjectName(){
        return(myName.getSV());
    }

    public StringName getName(){
        return(myName.getSV());
    }

    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        return(myName);
    }

    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        myName.serializeIt(dos);
    }

    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        myName = (DmcTypeStringNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
