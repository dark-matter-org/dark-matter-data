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
package org.dmd.dmr.shared.base.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
import org.dmd.dms.generated.types.DmcTypeStringNameSV;

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type HierarchicObject
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:454)
 */
@SuppressWarnings("serial")
public class HierarchicObjectREF extends DmcNamedObjectNontransportableREF<HierarchicObjectDMO> {

    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"StringName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeStringNameSV myName;    
    
    public HierarchicObjectREF(){
    }

    public HierarchicObjectREF(HierarchicObjectDMO o){
         object = o;
         myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    public HierarchicObjectREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeStringNameSV();
         myName.set(n);
    }

    public HierarchicObjectREF(HierarchicObjectREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(HierarchicObjectDMO o){
         object = o;
         myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public HierarchicObjectREF cloneMe(){
        HierarchicObjectREF rc = new HierarchicObjectREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectNameIF n) throws DmcValueException {
        if (myName == null);
            myName = new DmcTypeStringNameSV(__FQN);
        myName.set(n);
    }

    @Override
    public DmcObjectNameIF getObjectName(){
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
        myName = (DmcTypeStringNameSV) dis.getAttributeInstance(__FQN.id);
        myName.deserializeIt(dis);
    }

}
