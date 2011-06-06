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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                            // Always required
import java.util.*;                                                     // Always required
import org.dmd.dmc.DmcAttribute;                                        // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                    // Alternative type for AttributeID values
import org.dmd.dmc.DmcObjectName;                                       // Alternative type for NameContainer values
import org.dmd.dmc.DmcOmni;                                             // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                        // Required for object slicing
import org.dmd.dmc.DmcValueException;                                   // Any attributes
import org.dmd.dmc.types.AttributeID;                                   // Primitive type and !auxiliary class
import org.dmd.dmc.types.NameContainer;                                 // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                     // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                    // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnumSV;           // Required type
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;                    // Type specific set/add
import org.dmd.dms.generated.enums.DataTypeEnum;                        // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                       // Required if we have any attributes
import org.dmd.dms.generated.types.ClassDefinitionREF;                  // Helper class
import org.dmd.dms.generated.types.DmcTypeAttributeIDSET;               // Required type
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;         // Reference type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeNameContainerMV;              // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                     // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The GetRequest is used to retrieve objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class GetRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "GetRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __attributeSelector = new DmcAttributeInfo("attributeSelector",533,"AttributeID",ValueTypeEnum.HASHSET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __blockingFactor = new DmcAttributeInfo("blockingFactor",519,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __cacheResponse = new DmcAttributeInfo("cacheResponse",534,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("filter",520,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __filterByClass = new DmcAttributeInfo("filterByClass",521,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("originatorID",526,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __registerForEvents = new DmcAttributeInfo("registerForEvents",530,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope",511,"ScopeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __slice = new DmcAttributeInfo("slice",535,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __targets = new DmcAttributeInfo("targets",537,"NameContainer",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__attributeSelector.id,__attributeSelector);
        _ImAp.put(__blockingFactor.id,__blockingFactor);
        _ImAp.put(__cacheResponse.id,__cacheResponse);
        _ImAp.put(__filter.id,__filter);
        _ImAp.put(__filterByClass.id,__filterByClass);
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__originatorID.id,__originatorID);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__registerForEvents.id,__registerForEvents);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__scope.id,__scope);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__slice.id,__slice);
        _ImAp.put(__targets.id,__targets);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__attributeSelector.name,__attributeSelector);
        _SmAp.put(__blockingFactor.name,__blockingFactor);
        _SmAp.put(__cacheResponse.name,__cacheResponse);
        _SmAp.put(__filter.name,__filter);
        _SmAp.put(__filterByClass.name,__filterByClass);
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__originatorID.name,__originatorID);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__registerForEvents.name,__registerForEvents);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__scope.name,__scope);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__slice.name,__slice);
        _SmAp.put(__targets.name,__targets);
        _SmAp.put(__timeMS.name,__timeMS);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public GetRequestDMO() {
        super("GetRequest");
    }

    protected GetRequestDMO(String oc) {
        super(oc);
    }

    @Override
    public boolean supportsBackrefTracking(){
        return(false);
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
    public GetRequestDMO getNew(){
        GetRequestDMO rc = new GetRequestDMO();
        return(rc);
    }

    @Override
    public GetRequestDMO getSlice(DmcSliceInfo info){
        GetRequestDMO rc = new GetRequestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GetRequestDMO(DmcTypeModifierMV mods) {
        super("GetRequest");
        modrec(true);
        setModifier(mods);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<NameContainer> getTargets(){
        DmcTypeNameContainerMV attr = (DmcTypeNameContainerMV) get(__targets);
        if (attr == null)
            return( ((List<NameContainer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth NameContainer value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public NameContainer getNthTargets(int i){
        DmcTypeNameContainerMV attr = (DmcTypeNameContainerMV) get(__targets);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another targets to the specified value.
     * @param value NameContainer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addTargets(NameContainer value) {
        DmcAttribute<?> attr = get(__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(__targets);
        
        try{
            setLastValue(attr.add(value));
            add(__targets,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another targets to the specified value.
     * @param value NameContainer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:848)
    public DmcAttribute<?> addTargets(DmcObjectName value) {
        DmcAttribute<?> attr = get(__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(__targets);
        
        try{
            setLastValue(attr.add(value));
            add(__targets,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified NameContainer.
     * @param value NameContainer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean targetsContains(NameContainer value) {
        DmcAttribute<?> attr = get(__targets);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcObjectName.
     * @param value DmcObjectName
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:883)
    public boolean targetsContains(DmcObjectName value) {
        DmcAttribute<?> attr = get(__targets);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addTargets(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(__targets);
        
        setLastValue(attr.add(value));
        add(__targets,attr);
        return(attr);
    }

    /**
     * Returns the number of values in targets
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getTargetsSize(){
        DmcAttribute<?> attr = get(__targets);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delTargets(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__targets);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerMV(__targets), value);
        else
            attr = del(__targets, value);
        
        return(attr);
    }

    /**
     * Deletes a targets from the specified value.
     * @param value NameContainer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delTargets(NameContainer value) {
        DmcAttribute<?> attr = get(__targets);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerMV(__targets), value);
        else
            attr = del(__targets, value);
        
        return(attr);
    }

    /**
     * Removes the targets attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remTargets(){
         rem(__targets);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remFilter(){
         rem(__filter);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:513)
    public ClassDefinitionREF getFilterByClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(__filterByClass);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to ClassDefinition without attempting lazy resolution (if turned on).
     */
    public ClassDefinitionREF getFilterByClassREF(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(__filterByClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filterByClass to the specified value.
     * @param value ClassDefinitionDMO
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:566)
    public void setFilterByClass(ClassDefinitionDMO value) {
        DmcAttribute<?> attr = get(__filterByClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(__filterByClass);
        
        try{
            attr.set(value);
            set(__filterByClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets filterByClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setFilterByClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__filterByClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(__filterByClass);
        
        attr.set(value);
        set(__filterByClass,attr);
    }

    /**
     * Removes the filterByClass attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remFilterByClass(){
         rem(__filterByClass);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public Integer getBlockingFactor(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__blockingFactor);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value Integer
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setBlockingFactor(Integer value) {
        DmcAttribute<?> attr = get(__blockingFactor);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__blockingFactor);
        
        try{
            attr.set(value);
            set(__blockingFactor,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setBlockingFactor(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__blockingFactor);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__blockingFactor);
        
        attr.set(value);
        set(__blockingFactor,attr);
    }

    /**
     * Removes the blockingFactor attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remBlockingFactor(){
         rem(__blockingFactor);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public Boolean isRegisterForEvents(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__registerForEvents);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setRegisterForEvents(Boolean value) {
        DmcAttribute<?> attr = get(__registerForEvents);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__registerForEvents);
        
        try{
            attr.set(value);
            set(__registerForEvents,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setRegisterForEvents(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__registerForEvents);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__registerForEvents);
        
        attr.set(value);
        set(__registerForEvents,attr);
    }

    /**
     * Removes the registerForEvents attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remRegisterForEvents(){
         rem(__registerForEvents);
    }

    /**
     * @return An Iterator of AttributeID objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<AttributeID> getAttributeSelector(){
        DmcTypeAttributeIDSET attr = (DmcTypeAttributeIDSET) get(__attributeSelector);
        if (attr == null)
            return( ((List<AttributeID>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth AttributeID value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public AttributeID getNthAttributeSelector(int i){
        DmcTypeAttributeIDSET attr = (DmcTypeAttributeIDSET) get(__attributeSelector);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another attributeSelector to the specified value.
     * @param value AttributeID
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addAttributeSelector(AttributeID value) {
        DmcAttribute<?> attr = get(__attributeSelector);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(__attributeSelector);
        
        try{
            setLastValue(attr.add(value));
            add(__attributeSelector,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another attributeSelector to the specified value.
     * @param value AttributeID
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:848)
    public DmcAttribute<?> addAttributeSelector(DmcAttributeInfo value) {
        DmcAttribute<?> attr = get(__attributeSelector);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(__attributeSelector);
        
        try{
            setLastValue(attr.add(value));
            add(__attributeSelector,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified AttributeID.
     * @param value AttributeID
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean attributeSelectorContains(AttributeID value) {
        DmcAttribute<?> attr = get(__attributeSelector);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcAttributeInfo.
     * @param value DmcAttributeInfo
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:883)
    public boolean attributeSelectorContains(DmcAttributeInfo value) {
        DmcAttribute<?> attr = get(__attributeSelector);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another attributeSelector value.
     * @param value A value compatible with AttributeID
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addAttributeSelector(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__attributeSelector);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(__attributeSelector);
        
        setLastValue(attr.add(value));
        add(__attributeSelector,attr);
        return(attr);
    }

    /**
     * Returns the number of values in attributeSelector
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getAttributeSelectorSize(){
        DmcAttribute<?> attr = get(__attributeSelector);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a attributeSelector value.
     * @param value The AttributeID to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delAttributeSelector(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__attributeSelector);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeIDSET(__attributeSelector), value);
        else
            attr = del(__attributeSelector, value);
        
        return(attr);
    }

    /**
     * Deletes a attributeSelector from the specified value.
     * @param value AttributeID
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delAttributeSelector(AttributeID value) {
        DmcAttribute<?> attr = get(__attributeSelector);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeIDSET(__attributeSelector), value);
        else
            attr = del(__attributeSelector, value);
        
        return(attr);
    }

    /**
     * Removes the attributeSelector attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remAttributeSelector(){
         rem(__attributeSelector);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public Boolean isCacheResponse(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__cacheResponse);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setCacheResponse(Boolean value) {
        DmcAttribute<?> attr = get(__cacheResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__cacheResponse);
        
        try{
            attr.set(value);
            set(__cacheResponse,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setCacheResponse(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__cacheResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__cacheResponse);
        
        attr.set(value);
        set(__cacheResponse,attr);
    }

    /**
     * Removes the cacheResponse attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remCacheResponse(){
         rem(__cacheResponse);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getSlice(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__slice);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setSlice(String value) {
        DmcAttribute<?> attr = get(__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(__slice);
        
        try{
            attr.set(value);
            set(__slice,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setSlice(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(__slice);
        
        attr.set(value);
        set(__slice,attr);
    }

    /**
     * Removes the slice attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remSlice(){
         rem(__slice);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remScope(){
         rem(__scope);
    }




}
