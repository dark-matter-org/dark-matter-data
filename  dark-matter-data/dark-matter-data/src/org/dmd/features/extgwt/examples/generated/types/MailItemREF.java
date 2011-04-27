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
package org.dmd.features.extgwt.examples.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.features.extgwt.examples.generated.dmo.MailItemDMO; // primitive type
import org.dmd.dmc.types.IntegerName;
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type MailItem
 * <P>
 * Generated from the mail schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:360)
 */
@SuppressWarnings("serial")
public class MailItemREF extends DmcNamedObjectNontransportableREF<MailItemDMO> {

    public final static DmcAttributeInfo __mailID = new DmcAttributeInfo("mailID",901,"IntegerName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeIntegerNameSV myName;    
    
    public MailItemREF(){
    }

    public MailItemREF(MailItemDMO o){
         object = o;
         myName = (DmcTypeIntegerNameSV)o.getObjectNameAttribute();
    }

    public MailItemREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeIntegerNameSV();
         myName.set(n);
    }

    public MailItemREF(MailItemREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(MailItemDMO o){
         object = o;
         myName = (DmcTypeIntegerNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public MailItemREF cloneMe(){
        MailItemREF rc = new MailItemREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null);
            myName = new DmcTypeIntegerNameSV(__mailID);
        myName.set(n);
    }

    @Override
    public DmcObjectName getObjectName(){
        return(myName.getSV());
    }

    public IntegerName getName(){
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
        myName = (DmcTypeIntegerNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
