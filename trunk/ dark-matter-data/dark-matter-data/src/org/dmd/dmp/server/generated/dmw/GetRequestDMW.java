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

import org.dmd.dmc.DmcValueException;
// import 2
import org.dmd.dmc.DmcObject;
// import 2
import org.dmd.dmp.shared.generated.enums.ScopeEnum;

// import 4
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;

public class GetRequestDMW extends org.dmd.dmp.server.extended.Request {

    private GetRequestDMO mycore;

    public GetRequestDMW() {
        super(new GetRequestDMO());
        mycore = (GetRequestDMO) core;
        mycore.setContainer(this);
    }

    protected GetRequestDMW(DmcObject obj) {
        super(obj);
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

    public String getFqn(){
        return(mycore.getFqn());
    }

    /**
     * Sets fqn to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFqn(Object value) throws DmcValueException {
        mycore.setFqn(value);
    }


}
