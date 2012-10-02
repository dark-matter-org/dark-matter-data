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
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmc.types.DmcTypeStringName;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcClassInfo;
/**
 * The ClassDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2728)
 */
@SuppressWarnings("serial")
public class ClassDefinitionREF extends DmcNamedObjectNontransportableREF<ClassDefinitionDMO> implements Serializable {

    transient DmcClassInfo info;

    DmcTypeStringName myName;

    /**
     * Default constructor.
     */
    public ClassDefinitionREF(){
        myName = null;
    }

    /**
     * Copy constructor.
     */
    public ClassDefinitionREF(ClassDefinitionREF original){
        myName = original.myName;
        object = original.object;
    }

    /**
     * Wrapper constructor.
     */
    public ClassDefinitionREF(ClassDefinitionDMO dmo){
        myName = dmo.getObjectNameAttribute();
        object = dmo;
    }

    /**
     * Sets our object.
     */
    @Override
    public void setObject(ClassDefinitionDMO o){
        object = o;
    }

    /**
     * Clones this reference.
     */
    public ClassDefinitionREF cloneMe(){
        ClassDefinitionREF rc = new ClassDefinitionREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null);
            myName = new  DmcTypeStringNameSV(MetaDMSAG.__name);
        myName.set(n);
    }

    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
         return(myName);
    }

    @Override
    public DmcObjectName getObjectName(){
         return(myName.getSV());
    }

    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
         myName.serializeIt(dos);
         // the object goes nowhere
    }

    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        myName = (DmcTypeStringName) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

    public DmcClassInfo getClassInfo() {
        if (info == null){
            if (myName == null)
                throw(new IllegalStateException("No name set for a ClassDefinitionREF"));
            info = DmcOmni.instance().getClassInfo(myName.getSV().getNameString());
            if (info == null)
                throw(new IllegalStateException("Unable to retrive class info for class: " + myName.getSV().getNameString() + " ensure that you have loaded the DmcOmni with the appropriate schemas."));
        }
        return(info);
    }

}
