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

import java.util.*;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.DmcTypeDmcObject;

import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

@SuppressWarnings("serial")
/**
 * The GetResponse returns a set of objects. The form of this response will
 * depend on the readableResponse and responseFormat values that may have
 * been sent with the original Get request. GetResponses
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:359)
 */
public class GetResponseDMO  extends ResponseDMO  {

    public final static String _objectList = "objectList";

    public GetResponseDMO() {
    }

    /**
     * @returns An Iterator of DmcObject objects.
     */
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObject attr = (DmcTypeDmcObject) get(_objectList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    @SuppressWarnings("unchecked")
    public void addObjectList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_objectList);
        if (attr == null)
            attr = new DmcTypeDmcObject();
        
        attr.add(value);
        add(_objectList,attr);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    public void delObjectList(Object value){
        try{
            del(_objectList, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }




}
