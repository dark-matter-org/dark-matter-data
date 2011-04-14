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
package org.dmd.dmp.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV;

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type LogoutRequest
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:350)
 */
@SuppressWarnings("serial")
public class LogoutRequestREF extends DmcNamedObjectNontransportableREF<LogoutRequestDMO> {

    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeIntegerNameSV myName;    
    
    public LogoutRequestREF(){
    }

    public LogoutRequestREF(LogoutRequestDMO o){
         object = o;
         myName = (DmcTypeIntegerNameSV)o.getObjectNameAttribute();
    }

    public LogoutRequestREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeIntegerNameSV();
         myName.set(n);
    }

    public LogoutRequestREF(LogoutRequestREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(LogoutRequestDMO o){
         object = o;
         myName = (DmcTypeIntegerNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public LogoutRequestREF cloneMe(){
        LogoutRequestREF rc = new LogoutRequestREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectNameIF n) throws DmcValueException {
        if (myName == null);
            myName = new DmcTypeIntegerNameSV(__requestID);
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
        myName = (DmcTypeIntegerNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
