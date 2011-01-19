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
import org.dmd.dmp.shared.generated.enums.ScopeEnum;
// import 3 ScopeEnum
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnum;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.dmp.shared.generated.dmo.RequestDMO;

@SuppressWarnings("serial")
/**
 * The DeleteRequest allows you to delete one or more objects. If no scope is
 * specified, the scope is assumed to be BASE i.e. just the specific object
 * indicated by the FQN(s). The behaviour of this request is implementation
 * specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:499)
 */
public class DeleteRequestDMO  extends RequestDMO  {

    public final static String _scope = "scope";
    public final static String _FQNList = "FQNList";

    public DeleteRequestDMO() {
        super("DeleteRequest");
    }

    protected DeleteRequestDMO(String oc) {
        super(oc);
    }

    public DeleteRequestDMO(DeleteRequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public DeleteRequestDMO getOneOfMe() {
        DeleteRequestDMO rc = new DeleteRequestDMO(this.getConstructionClassName());
        return(rc);
    }

    public ScopeEnum getScope(){
        DmcTypeScopeEnum attr = (DmcTypeScopeEnum) get(_scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    @SuppressWarnings("unchecked")
    public void setScope(Object value) throws DmcValueException {
        DmcAttribute attr = get(_scope);
        if (attr == null)
            attr = new DmcTypeScopeEnum();
        
        attr.set(value);
        set(_scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    public void remScope(){
         rem(_scope);
    }

    /**
     * @return An Iterator of String objects.
     */
    public Iterator<String> getFQNList(){
        DmcTypeString attr = (DmcTypeString) get(_FQNList);
        if (attr == null)
            return(Collections.<String> emptyList().iterator());

        return(attr.getMV());
    }

    /**
     * Adds another FQNList value.
     * @param value A value compatible with String
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addFQNList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_FQNList);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.add(value);
        add(_FQNList,attr);
        return(attr);
    }

    /**
     * Deletes a FQNList value.
     * @param value The String to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delFQNList(Object value){
        return(del(_FQNList, value));
    }

    /**
     * Removes the FQNList attribute value.
     */
    public void remFQNList(){
         rem(_FQNList);
    }




}
