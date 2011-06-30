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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:307)
import java.io.Serializable;                                          // Always required
import java.util.*;                                                   // Always required
import org.dmd.dmc.DmcAttribute;                                      // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                  // Always required
import org.dmd.dmc.DmcObjectName;                                     // Alternative type for NameContainer values
import org.dmd.dmc.DmcSliceInfo;                                      // Required for object slicing
import org.dmd.dmc.DmcValueException;                                 // Any attributes
import org.dmd.dmc.types.NameContainer;                               // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                   // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                  // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnumSV;         // Required type
import org.dmd.dms.generated.enums.DataTypeEnum;                      // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                     // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;            // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                   // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The NotifyRequest allwos you to register for events on an arbitrary object
 * or set of objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class NotifyRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "NotifyRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("filter",520,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("originatorID",526,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope",511,"ScopeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __target = new DmcAttributeInfo("target",508,"NameContainer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __trackingEnabled = new DmcAttributeInfo("trackingEnabled",539,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__filter.id,__filter);
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__originatorID.id,__originatorID);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__scope.id,__scope);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__target.id,__target);
        _ImAp.put(__timeMS.id,__timeMS);
        _ImAp.put(__trackingEnabled.id,__trackingEnabled);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__filter.name,__filter);
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__originatorID.name,__originatorID);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__scope.name,__scope);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__target.name,__target);
        _SmAp.put(__timeMS.name,__timeMS);
        _SmAp.put(__trackingEnabled.name,__trackingEnabled);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public NotifyRequestDMO() {
        super("NotifyRequest");
    }

    protected NotifyRequestDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public NotifyRequestDMO getNew(){
        NotifyRequestDMO rc = new NotifyRequestDMO();
        return(rc);
    }

    @Override
    public NotifyRequestDMO getSlice(DmcSliceInfo info){
        NotifyRequestDMO rc = new NotifyRequestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NotifyRequestDMO(DmcTypeModifierMV mods) {
        super("NotifyRequest");
        modrec(true);
        setModifier(mods);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public ScopeEnum getScope(){
        DmcTypeScopeEnumSV attr = (DmcTypeScopeEnumSV) get(__scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:662)
    public void setScope(ScopeEnum value) {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(__scope);
        
        try{
            attr.set(value);
            set(__scope,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:710)
    public void setScope(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(__scope);
        
        attr.set(value);
        set(__scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:725)
    public void remScope(){
         rem(__scope);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public String getFilter(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__filter);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:662)
    public void setFilter(String value) {
        DmcAttribute<?> attr = get(__filter);
        if (attr == null)
            attr = new DmcTypeStringSV(__filter);
        
        try{
            attr.set(value);
            set(__filter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:710)
    public void setFilter(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__filter);
        if (attr == null)
            attr = new DmcTypeStringSV(__filter);
        
        attr.set(value);
        set(__filter,attr);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:725)
    public void remFilter(){
         rem(__filter);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public NameContainer getTarget(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(__target);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:662)
    public void setTarget(NameContainer value) {
        DmcAttribute<?> attr = get(__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__target);
        
        try{
            attr.set(value);
            set(__target,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
    public void setTarget(DmcObjectName value) {
        DmcAttribute<?> attr = get(__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__target);
        
        try{
            attr.set(value);
            set(__target,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:710)
    public void setTarget(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__target);
        
        attr.set(value);
        set(__target,attr);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:725)
    public void remTarget(){
         rem(__target);
    }




}
