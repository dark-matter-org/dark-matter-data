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


// import 9
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;

public class HierarchicObjectDMW extends DmwWrapper implements DmcNamedObjectIF {

    private HierarchicObjectDMO mycore;

    public HierarchicObjectDMW() {
        super(new HierarchicObjectDMO(), org.dmd.dmr.server.base.generated.DmrBaseSchemaAG._HierarchicObject);
        mycore = (HierarchicObjectDMO) core;
        mycore.setContainer(this);
    }

    public HierarchicObjectDMW(HierarchicObjectDMO obj) {
        super(obj, org.dmd.dmr.server.base.generated.DmrBaseSchemaAG._HierarchicObject);
        mycore = (HierarchicObjectDMO) core;
        mycore.setContainer(this);
    }

    protected HierarchicObjectDMW(HierarchicObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (HierarchicObjectDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmr.server.base.extended.HierarchicObject>());
    }

    public String getObjectName(){
        return(mycore.getFQN());
    }

    public boolean equals(Object obj){
        if (obj instanceof HierarchicObjectDMW){
            return( getObjectName().equals( ((HierarchicObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public String getParentFQN(){
        return(mycore.getParentFQN());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setParentFQN(Object value) throws DmcValueException {
        mycore.setParentFQN(value);
    }

    /**
     * Removes the parentFQN attribute value.
     */
    public void remParentFQN(){
        mycore.remParentFQN();
    }

    public Integer getLineNumber(){
        return(mycore.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    public void setLineNumber(Object value) throws DmcValueException {
        mycore.setLineNumber(value);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    public void remLineNumber(){
        mycore.remLineNumber();
    }

    public String getFile(){
        return(mycore.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFile(Object value) throws DmcValueException {
        mycore.setFile(value);
    }

    /**
     * Removes the file attribute value.
     */
    public void remFile(){
        mycore.remFile();
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


}
