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
// import 1
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;
// import 3 ClassDefinition
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREF;
// import 4
import org.dmd.dms.generated.types.ClassDefinitionREF;
// import 3 Integer
import org.dmd.dmc.types.DmcTypeInteger;
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
 * The GetRequest is used to retrieve objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:466)
 */
public class GetRequestDMO  extends RequestDMO  {

    public final static String _filter = "filter";
    public final static String _filterByClass = "filterByClass";
    public final static String _blockingFactor = "blockingFactor";
    public final static String _scope = "scope";
    public final static String _FQN = "FQN";

    public GetRequestDMO() {
        super("GetRequest");
    }

    protected GetRequestDMO(String oc) {
        super(oc);
    }

    public GetRequestDMO(GetRequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public GetRequestDMO getOneOfMe() {
        GetRequestDMO rc = new GetRequestDMO(this.getConstructionClassName());
        return(rc);
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

    /**
     * Removes the filter attribute value.
     */
    public void remFilter(){
         rem(_filter);
    }

    public ClassDefinitionREF getFilterByClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_filterByClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filterByClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setFilterByClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_filterByClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.set(value);
        set(_filterByClass,attr);
    }

    /**
     * Removes the filterByClass attribute value.
     */
    public void remFilterByClass(){
         rem(_filterByClass);
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

    /**
     * Removes the blockingFactor attribute value.
     */
    public void remBlockingFactor(){
         rem(_blockingFactor);
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




}
