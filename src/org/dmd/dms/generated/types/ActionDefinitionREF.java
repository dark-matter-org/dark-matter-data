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
import org.dmd.dmc.types.DmcTypeDefinitionName;
import org.dmd.dms.generated.dmo.*;
/**
 * The ActionDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2902)
 */
@SuppressWarnings("serial")
public class ActionDefinitionREF extends DmcNamedObjectNontransportableREF<ActionDefinitionDMO> implements Serializable {

    DmcTypeDefinitionName myName;

    /**
     * Default constructor.
     */
    public ActionDefinitionREF(){
        myName = null;
    }

    /**
     * Copy constructor.
     */
    public ActionDefinitionREF(ActionDefinitionREF original){
        myName = original.myName;
        object = original.object;
    }

    /**
     * Wrapper constructor.
     */
    public ActionDefinitionREF(ActionDefinitionDMO dmo){
        myName = (DmcTypeDefinitionName) dmo.getObjectNameAttribute();
        object = dmo;
    }

    /**
     * Sets our object.
     */
    @Override
    public void setObject(ActionDefinitionDMO o){
        object = o;
    }

    /**
     * Clones this reference.
     */
    public ActionDefinitionREF cloneMe(){
        ActionDefinitionREF rc = new ActionDefinitionREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null);
            myName = new  DmcTypeDefinitionNameSV(MetaDMSAG.__name);
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
        myName = (DmcTypeDefinitionName) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
