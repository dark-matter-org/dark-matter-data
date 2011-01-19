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
// import 2
import org.dmd.dmc.DmcObject;
// import 3 DmcObject
import org.dmd.dmc.types.DmcTypeDmcObject;
// import 3 Long
import org.dmd.dmc.types.DmcTypeLong;

// import 6
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

@SuppressWarnings("serial")
/**
 * The SetResponse returns the results of a particular SetRequest. The
 * objectList will contain the objects with the previously specified edits.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:499)
 */
public class SetResponseDMO  extends ResponseDMO  {

    public final static String _objectList = "objectList";
    public final static String _timeMS = "timeMS";

    public SetResponseDMO() {
        super("SetResponse");
    }

    protected SetResponseDMO(String oc) {
        super(oc);
    }

    public SetResponseDMO(SetResponseDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public SetResponseDMO getOneOfMe() {
        SetResponseDMO rc = new SetResponseDMO(this.getConstructionClassName());
        return(rc);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObject attr = (DmcTypeDmcObject) get(_objectList);
        if (attr == null)
            return(Collections.<DmcObject> emptyList().iterator());

        return(attr.getMV());
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addObjectList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_objectList);
        if (attr == null)
            attr = new DmcTypeDmcObject();
        
        attr.add(value);
        add(_objectList,attr);
        return(attr);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delObjectList(Object value){
        return(del(_objectList, value));
    }

    /**
     * Removes the objectList attribute value.
     */
    public void remObjectList(){
         rem(_objectList);
    }

    public Long getTimeMS(){
        DmcTypeLong attr = (DmcTypeLong) get(_timeMS);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    @SuppressWarnings("unchecked")
    public void setTimeMS(Object value) throws DmcValueException {
        DmcAttribute attr = get(_timeMS);
        if (attr == null)
            attr = new DmcTypeLong();
        
        attr.set(value);
        set(_timeMS,attr);
    }

    /**
     * Removes the timeMS attribute value.
     */
    public void remTimeMS(){
         rem(_timeMS);
    }




}
