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

// import 4
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;

public class SetRequestDMW extends org.dmd.dmp.server.extended.Request {

    private SetRequestDMO mycore;

    public SetRequestDMW() {
        super(new SetRequestDMO());
        mycore = (SetRequestDMO) core;
        mycore.setContainer(this);
    }

    protected SetRequestDMW(DmcObject obj) {
        super(obj);
        mycore = (SetRequestDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.SetRequest>());
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

    public String getModify(){
        return(mycore.getModify());
    }

    /**
     * Sets modify to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setModify(Object value) throws DmcValueException {
        mycore.setModify(value);
    }


}
