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
package org.dmd.dmp.shared.generated.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 Integer
import org.dmd.dmc.types.DmcTypeInteger;

// import 5
import org.dmd.dmc.DmcObject;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The DMPMessage class provides a common base for all messages that comprise
 * the Dark Matter Protocol (DMP).
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:401)
 */
abstract public class DMPMessageDMO  extends DmcObject  implements DmcNamedObjectIF  {

    public final static String _requestID = "requestID";

    public DMPMessageDMO() {
        super("DMPMessage");
    }

    protected DMPMessageDMO(String oc) {
        super(oc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_requestID);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof DMPMessageDMO){
            return( getObjectName().equals( ((DMPMessageDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public Integer getRequestID(){
        DmcTypeInteger attr = (DmcTypeInteger) get(_requestID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    @SuppressWarnings("unchecked")
    public void setRequestID(Object value) throws DmcValueException {
        DmcAttribute attr = get(_requestID);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(_requestID,attr);
    }




}
