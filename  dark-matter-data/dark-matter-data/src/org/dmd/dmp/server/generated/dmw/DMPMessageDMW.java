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
package org.dmd.dmp.server.generated.dmw;

import java.util.*;

import org.dmd.dms.ClassDefinition;

import org.dmd.dmc.DmcValueException;
// import 2
import org.dmd.dmc.DmcObject;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmw.DmwWrapperBase;
// import 4
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;

public class DMPMessageDMW extends DmwWrapperBase implements DmcNamedObjectIF {

    private DMPMessageDMO mycore;

    protected DMPMessageDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DMPMessageDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.DMPMessage>());
    }

    public String getObjectName(){
        return(mycore.getRequestID().toString());
    }

    public boolean equals(Object obj){
        if (obj instanceof DMPMessageDMW){
            return( getObjectName().equals( ((DMPMessageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public Integer getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }


}
