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

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 1
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;
// import 3.1 ClassDefinition
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREF;
import org.dmd.dms.generated.types.ClassDefinitionREF;
// import 4
import org.dmd.dms.generated.types.ClassDefinitionREF;
// import 3.2 Integer
import org.dmd.dmc.types.DmcTypeInteger;
// import 2
import org.dmd.dmp.shared.generated.enums.ScopeEnum;
// import 3.2 ScopeEnum
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnum;
// import 3.2 String
import org.dmd.dmc.types.DmcTypeString;
// import 2
import org.dmd.dmc.types.StringName;
// import 3.2 StringName
import org.dmd.dmc.types.DmcTypeStringName;

// import 6
import org.dmd.dmp.shared.generated.dmo.RequestDMO;

@SuppressWarnings("serial")
/**
 * The GetRequest is used to retrieve objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:135)
 */
public class GetRequestDMO  extends RequestDMO  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __blockingFactor = new DmcAttributeInfo("blockingFactor",519,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("filter",520,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __filterByClass = new DmcAttributeInfo("filterByClass",521,"ClassDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope",511,"ScopeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__FQN.id,__FQN);
        _ImAp.put(__blockingFactor.id,__blockingFactor);
        _ImAp.put(__filter.id,__filter);
        _ImAp.put(__filterByClass.id,__filterByClass);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__scope.id,__scope);
        _ImAp.put(__sessionID.id,__sessionID);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__FQN.name,__FQN);
        _SmAp.put(__blockingFactor.name,__blockingFactor);
        _SmAp.put(__filter.name,__filter);
        _SmAp.put(__filterByClass.name,__filterByClass);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__scope.name,__scope);
        _SmAp.put(__sessionID.name,__sessionID);
    }

    public GetRequestDMO() {
        super("GetRequest",_ImAp,_SmAp);
    }

    protected GetRequestDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public GetRequestDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
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

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public String getFilter(){
        DmcTypeString attr = (DmcTypeString) get(__filter);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setFilter(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__filter);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__filter,attr);
    }

    /**
     * Removes the filter attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remFilter(){
         rem(__filter);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:301)
    public ClassDefinitionREF getFilterByClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__filterByClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filterByClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setFilterByClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__filterByClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.set(value);
        set(__filterByClass,attr);
    }

    /**
     * Removes the filterByClass attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remFilterByClass(){
         rem(__filterByClass);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public Integer getBlockingFactor(){
        DmcTypeInteger attr = (DmcTypeInteger) get(__blockingFactor);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setBlockingFactor(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__blockingFactor);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(__blockingFactor,attr);
    }

    /**
     * Removes the blockingFactor attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remBlockingFactor(){
         rem(__blockingFactor);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public ScopeEnum getScope(){
        DmcTypeScopeEnum attr = (DmcTypeScopeEnum) get(__scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setScope(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnum();
        
        attr.set(value);
        set(__scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remScope(){
         rem(__scope);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public StringName getFQN(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeStringName();
        
        attr.set(value);
        set(__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remFQN(){
         rem(__FQN);
    }




}
