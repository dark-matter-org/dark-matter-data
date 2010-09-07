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
 * indicated by the fqn(s). The behaviour of this request is implementation
 * specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:380)
 */
public class DeleteRequestDMO  extends RequestDMO  {

    public final static String _scope = "scope";
    public final static String _fqnList = "fqnList";

    public DeleteRequestDMO() {
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
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getFqnList(){
        DmcTypeString attr = (DmcTypeString) get(_fqnList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another fqnList value.
     * @param value A value compatible with String
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addFqnList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_fqnList);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.add(value);
        add(_fqnList,attr);
        return(attr);
    }

    /**
     * Deletes a fqnList value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delFqnList(Object value){
        try{
            del(_fqnList, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }




}
