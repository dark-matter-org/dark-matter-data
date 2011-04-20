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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:279)
import java.io.Serializable;                                          // Always required
import java.util.*;                                                   // Always required
import org.dmd.dmc.DmcAttribute;                                      // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                  // Always required
import org.dmd.dmc.DmcObjectName;                                     // Alternative type for NameContainer values
import org.dmd.dmc.DmcSliceInfo;                                      // Required for object slicing
import org.dmd.dmc.DmcValueException;                                 // Any attributes
import org.dmd.dmc.types.NameContainer;                               // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                  // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                  // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnumSV;         // Required type
import org.dmd.dms.generated.enums.ValueTypeEnum;                     // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;            // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                   // Required type

/**
 * The DenotifyResponse is sent as a result of a DenotifyRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class DenotifyResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "DenotifyResponse";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("filter",520,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("lastResponse",510,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("responseCategory",505,"ResponseCategoryEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("responseText",506,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("responseType",504,"ResponseTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope",511,"ScopeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __target = new DmcAttributeInfo("target",508,"NameContainer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__filter.id,__filter);
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__lastResponse.id,__lastResponse);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseCategory.id,__responseCategory);
        _ImAp.put(__responseText.id,__responseText);
        _ImAp.put(__responseType.id,__responseType);
        _ImAp.put(__scope.id,__scope);
        _ImAp.put(__target.id,__target);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__filter.name,__filter);
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__lastResponse.name,__lastResponse);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseCategory.name,__responseCategory);
        _SmAp.put(__responseText.name,__responseText);
        _SmAp.put(__responseType.name,__responseType);
        _SmAp.put(__scope.name,__scope);
        _SmAp.put(__target.name,__target);
        _SmAp.put(__timeMS.name,__timeMS);
    }

    public DenotifyResponseDMO() {
        super("DenotifyResponse");
    }

    protected DenotifyResponseDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public DenotifyResponseDMO getNew(){
        DenotifyResponseDMO rc = new DenotifyResponseDMO();
        return(rc);
    }

    @Override
    public DenotifyResponseDMO getSlice(DmcSliceInfo info){
        DenotifyResponseDMO rc = new DenotifyResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public DenotifyResponseDMO(DmcTypeModifierMV mods) {
        super("DenotifyResponse");
        modrec(true);
        setModifier(mods);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remTarget(){
         rem(__target);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remScope(){
         rem(__scope);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remFilter(){
         rem(__filter);
    }




}
