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
package org.dmd.dmp.server.servlet.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.dmp.server.servlet.generated.dmo.UserFolderRIDMO; // primitive type
import org.dmd.dmc.types.DotName;
import org.dmd.dms.generated.types.DmcTypeDotNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type UserFolderRI
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:420)
 */
@SuppressWarnings("serial")
public class UserFolderRIREF extends DmcNamedObjectNontransportableREF<UserFolderRIDMO> {

    public final static DmcAttributeInfo __dotName = new DmcAttributeInfo("dotName",107,"DotName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    
    DmcTypeDotNameSV myName;    
    
    public UserFolderRIREF(){
    }

    public UserFolderRIREF(UserFolderRIDMO o){
         object = o;
         myName = (DmcTypeDotNameSV)o.getObjectNameAttribute();
    }

    public UserFolderRIREF(DotName n) throws DmcValueException {
         object = null;
         myName = new DmcTypeDotNameSV(__dotName);
         myName.set(n);
    }

    public UserFolderRIREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeDotNameSV(__dotName);
         myName.set(n);
    }

    public UserFolderRIREF(UserFolderRIREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(UserFolderRIDMO o){
         object = o;
         if (object != null)
             myName = (DmcTypeDotNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public UserFolderRIREF cloneMe(){
        UserFolderRIREF rc = new UserFolderRIREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null)
            myName = new DmcTypeDotNameSV(__dotName);
        myName.set(n);
    }

    @Override
    public DmcObjectName getObjectName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public DotName getName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName);
    }

    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        myName.serializeIt(dos);
    }

    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        myName = (DmcTypeDotNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
