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
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.dmp.shared.generated.dmo.RequestDMO;

@SuppressWarnings("serial")
/**
 * The CreateRequest allows you to create one or more objects. If an FQN is
 * specified, the objects will be created beneath that parent object.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:457)
 */
public class CreateRequestDMO  extends RequestDMO  {

    public final static String _FQN = "FQN";
    public final static String _objectList = "objectList";

    public CreateRequestDMO() {
        super("CreateRequest");
    }

    protected CreateRequestDMO(String oc) {
        super(oc);
    }

    public CreateRequestDMO(CreateRequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    public String getFQN(){
        DmcTypeString attr = (DmcTypeString) get(_FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute attr = get(_FQN);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    public void remFQN(){
         rem(_FQN);
    }

    /**
     * @return An Iterator of DmcObject objects.
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




}
