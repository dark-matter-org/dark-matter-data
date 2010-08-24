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
package org.dmd.dmp.generated.shared.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeInteger;
import org.dmd.dmp.generated.shared.enums.ScopeEnum;
import org.dmd.dmp.generated.shared.types.DmcTypeScopeEnum;
import org.dmd.dmc.types.DmcTypeString;

import org.dmd.dmp.generated.shared.dmo.RequestDMO;

@SuppressWarnings("serial")
/**
 * The GetRequest is used to retrieve objects.
 * 
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:193)
 */
public class GetRequestDMO  extends RequestDMO  {

    public final static String _filter = "filter";
    public final static String _blockingFactor = "blockingFactor";
    public final static String _scope = "scope";
    public final static String _fqn = "fqn";

    public GetRequestDMO() {
    }

    public String getFilter(){
        DmcTypeString attr = (DmcTypeString) get(_filter);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setFilter(Object value) throws DmcValueException {
        DmcAttribute attr = get(_filter);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_filter,attr);
    }

    public Integer getBlockingFactor(){
        DmcTypeInteger attr = (DmcTypeInteger) get(_blockingFactor);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    @SuppressWarnings("unchecked")
    public void setBlockingFactor(Object value) throws DmcValueException {
        DmcAttribute attr = get(_blockingFactor);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(_blockingFactor,attr);
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

    public String getFqn(){
        DmcTypeString attr = (DmcTypeString) get(_fqn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets fqn to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setFqn(Object value) throws DmcValueException {
        DmcAttribute attr = get(_fqn);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_fqn,attr);
    }




}
