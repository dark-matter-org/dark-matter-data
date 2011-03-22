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
import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;
import org.dmd.dmc.types.DmcTypeIntegerName;

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type LogoutResponse
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:375)
 */
@SuppressWarnings("serial")
public class LogoutResponseREF extends DmcNamedObjectNontransportableREF<LogoutResponseDMO> {

    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeIntegerName myName;    

    public LogoutResponseREF(){
    }

    public LogoutResponseREF(LogoutResponseREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(LogoutResponseDMO o){
         object = o;
    }

    /**
     * Clones this reference.
     */
    public LogoutResponseREF cloneMe(){
        LogoutResponseREF rc = new LogoutResponseREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectNameIF n) throws DmcValueException {
        if (myName == null);
            myName = new  DmcTypeIntegerName(__requestID);
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



}
