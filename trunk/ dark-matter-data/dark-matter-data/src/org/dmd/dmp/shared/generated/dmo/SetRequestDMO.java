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
import org.dmd.dmc.types.Modifier;
// import 3 Modifier
import org.dmd.dmc.types.DmcTypeModifier;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.dmp.shared.generated.dmo.RequestDMO;

@SuppressWarnings("serial")
/**
 * The SetRequest allows you to alter the attribute values associated with an
 * object. Like the get request, the set of attributes that can be
 * manipulated will depend on the object type that is specified.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:499)
 */
public class SetRequestDMO  extends RequestDMO  {

    public final static String _FQN = "FQN";
    public final static String _modify = "modify";

    public SetRequestDMO() {
        super("SetRequest");
    }

    protected SetRequestDMO(String oc) {
        super(oc);
    }

    public SetRequestDMO(SetRequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public SetRequestDMO getOneOfMe() {
        SetRequestDMO rc = new SetRequestDMO(this.getConstructionClassName());
        return(rc);
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
     * @return An Iterator of Modifier objects.
     */
    public Iterator<Modifier> getModify(){
        DmcTypeModifier attr = (DmcTypeModifier) get(_modify);
        if (attr == null)
            return(Collections.<Modifier> emptyList().iterator());

        return(attr.getMV());
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addModify(Object value) throws DmcValueException {
        DmcAttribute attr = get(_modify);
        if (attr == null)
            attr = new DmcTypeModifier();
        
        attr.add(value);
        add(_modify,attr);
        return(attr);
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delModify(Object value){
        return(del(_modify, value));
    }

    /**
     * Removes the modify attribute value.
     */
    public void remModify(){
         rem(_modify);
    }




}
