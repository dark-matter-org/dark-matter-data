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
package org.dmd.dmr.server.base.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.dmr.server.base.extended.HierarchicObject;
// import 9
import org.dmd.dmr.shared.base.generated.dmo.DotNamedObjectDMO;

abstract public class DotNamedObjectDMW extends HierarchicObject implements DmcNamedObjectIF {

    private DotNamedObjectDMO mycore;

    public DotNamedObjectDMW() {
        super(new DotNamedObjectDMO(), org.dmd.dmr.server.base.generated.DmrBaseSchemaAG._DotNamedObject);
        mycore = (DotNamedObjectDMO) core;
        mycore.setContainer(this);
    }

    public DotNamedObjectDMW(DotNamedObjectDMO obj) {
        super(obj, org.dmd.dmr.server.base.generated.DmrBaseSchemaAG._DotNamedObject);
        mycore = (DotNamedObjectDMO) core;
        mycore.setContainer(this);
    }

    protected DotNamedObjectDMW(DotNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DotNamedObjectDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmr.server.base.extended.DotNamedObject>());
    }

    public String getObjectName(){
        return(mycore.getFQN());
    }

    public boolean equals(Object obj){
        if (obj instanceof DotNamedObjectDMW){
            return( getObjectName().equals( ((DotNamedObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public String getFQN(){
        return(mycore.getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFQN(Object value) throws DmcValueException {
        mycore.setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    public void remFQN(){
        mycore.remFQN();
    }

    public String getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
        mycore.remName();
    }


}
