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
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;
// import 3
import org.dmd.dmp.shared.generated.enums.ScopeEnum;

// import 8
import org.dmd.dmp.server.extended.Request;
// import 9
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;

abstract public class GetRequestDMW extends Request {

    private GetRequestDMO mycore;

    public GetRequestDMW() {
        super(new GetRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
        mycore = (GetRequestDMO) core;
        mycore.setContainer(this);
    }

    public GetRequestDMW(GetRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
        mycore = (GetRequestDMO) core;
        mycore.setContainer(this);
    }

    protected GetRequestDMW(GetRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (GetRequestDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.GetRequest>());
    }

    public String getFilter(){
        return(mycore.getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFilter(Object value) throws DmcValueException {
        mycore.setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    public void remFilter(){
        mycore.remFilter();
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    @SuppressWarnings("unchecked")
    public ClassDefinitionDMW getFilterByClass(){
        DmcAttribute attr = mycore.get(GetRequestDMO._filterByClass);
        if (attr == null)
            return(null);
        
        ClassDefinitionDMW ref = (ClassDefinitionDMW) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the filterByClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setFilterByClass(ClassDefinitionDMW value) throws DmcValueException {
        mycore.setFilterByClass(value.getDmcObject());
        DmcAttribute attr = mycore.get(GetRequestDMO._filterByClass);
        attr.setAuxData(value);
    }

    /**
     * Removes the filterByClass attribute value.
     */
    public void remFilterByClass(){
        mycore.remFilterByClass();
    }

    public Integer getBlockingFactor(){
        return(mycore.getBlockingFactor());
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    public void setBlockingFactor(Object value) throws DmcValueException {
        mycore.setBlockingFactor(value);
    }

    /**
     * Removes the blockingFactor attribute value.
     */
    public void remBlockingFactor(){
        mycore.remBlockingFactor();
    }

    public ScopeEnum getScope(){
        return(mycore.getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    public void setScope(Object value) throws DmcValueException {
        mycore.setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    public void remScope(){
        mycore.remScope();
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
