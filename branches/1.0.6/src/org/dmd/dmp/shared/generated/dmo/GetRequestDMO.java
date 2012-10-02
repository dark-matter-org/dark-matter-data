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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:372)
import java.io.Serializable;                                            // Always required - (GenUtility.java:201)
import java.util.*;                                                     // Always required if we have any MV attributes - (GenUtility.java:197)
import org.dmd.dmc.DmcAttribute;                                        // Any attributes - (GenUtility.java:217)
import org.dmd.dmc.DmcAttributeInfo;                                    // Alternative type for AttributeID values - (GenUtility.java:272)
import org.dmd.dmc.DmcObjectName;                                       // Alternative type for NameContainer values - (GenUtility.java:272)
import org.dmd.dmc.DmcOmni;                                             // Lazy resolution - (GenUtility.java:297)
import org.dmd.dmc.DmcSliceInfo;                                        // Required for object slicing - (GenUtility.java:206)
import org.dmd.dmc.DmcValueException;                                   // Any attributes - (GenUtility.java:218)
import org.dmd.dmc.types.AttributeID;                                   // Primitive type and !auxiliary class - (GenUtility.java:248)
import org.dmd.dmc.types.ClassFilter;                                   // Primitive type and !auxiliary class - (GenUtility.java:248)
import org.dmd.dmc.types.NameContainer;                                 // Primitive type and !auxiliary class - (GenUtility.java:248)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                     // Base class - (GenUtility.java:332)
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                    // Primitive type and !auxiliary class - (GenUtility.java:248)
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnumSV;           // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;                    // Type specific set/add - (GenUtility.java:284)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (GenUtility.java:205)
import org.dmd.dms.generated.types.ClassDefinitionREF;                  // Helper class - (GenUtility.java:312)
import org.dmd.dms.generated.types.DmcTypeAttributeIDSET;               // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                    // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;         // Reference type - (GenUtility.java:277)
import org.dmd.dms.generated.types.DmcTypeClassFilterSV;                // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                    // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (GenUtility.java:204)
import org.dmd.dms.generated.types.DmcTypeNameContainerMV;              // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeStringSV;                     // Required type - (GenUtility.java:305)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The GetRequest is used to retrieve objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GetRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "GetRequest";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

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

    public GetRequestDMO getModificationRecorder(){
        GetRequestDMO rc = new GetRequestDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1083)
    public Iterator<NameContainer> getTargets(){
        DmcTypeNameContainerMV attr = (DmcTypeNameContainerMV) get(DmpDMSAG.__targets);
        if (attr == null)
            return( ((List<NameContainer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth NameContainer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1095)
    public NameContainer getNthTargets(int i){
        DmcTypeNameContainerMV attr = (DmcTypeNameContainerMV) get(DmpDMSAG.__targets);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another targets to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public DmcAttribute<?> addTargets(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(DmpDMSAG.__targets);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__targets,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1163)
    public DmcAttribute<?> addTargets(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(DmpDMSAG.__targets);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__targets,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1184)
    public boolean targetsContains(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcObjectName.
     * @param value DmcObjectName
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1198)
    public boolean targetsContains(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
    public DmcAttribute<?> addTargets(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(DmpDMSAG.__targets);
        
        setLastValue(attr.add(value));
        add(DmpDMSAG.__targets,attr);
        return(attr);
    }

    /**
     * Returns the number of values in targets
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1233)
    public int getTargetsSize(){
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null){
            if (DmpDMSAG.__targets.indexSize == 0)
                return(0);
            else
                return(DmpDMSAG.__targets.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
    public DmcAttribute<?> delTargets(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerMV(DmpDMSAG.__targets), value);
        else
            attr = del(DmpDMSAG.__targets, value);
        
        return(attr);
    }

    /**
     * Deletes a targets from the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1307)
    public DmcAttribute<?> delTargets(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerMV(DmpDMSAG.__targets), value);
        else
            attr = del(DmpDMSAG.__targets, value);
        
        return(attr);
    }

    /**
     * Removes the targets attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public void remTargets(){
         rem(DmpDMSAG.__targets);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public String getFilter(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__filter);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setFilter(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__filter);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__filter);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__filter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setFilter(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__filter);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__filter);
        
        attr.set(value);
        set(DmpDMSAG.__filter,attr);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remFilter(){
         rem(DmpDMSAG.__filter);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:626)
    public ClassDefinitionREF getFilterByClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__filterByClass);
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
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__filterByClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filterByClass to the specified value.
     * @param value ClassDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setFilterByClass(ClassDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__filterByClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(DmpDMSAG.__filterByClass);
        else
            ((DmcTypeClassDefinitionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmpDMSAG.__filterByClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets filterByClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setFilterByClass(Object value) throws DmcValueException {
        DmcTypeClassDefinitionREFSV attr  = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__filterByClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(DmpDMSAG.__filterByClass);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmpDMSAG.__filterByClass,attr);
    }

    /**
     * Removes the filterByClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remFilterByClass(){
         rem(DmpDMSAG.__filterByClass);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public Integer getBlockingFactor(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpDMSAG.__blockingFactor);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setBlockingFactor(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__blockingFactor);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__blockingFactor);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__blockingFactor,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setBlockingFactor(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpDMSAG.__blockingFactor);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__blockingFactor);
        
        attr.set(value);
        set(DmpDMSAG.__blockingFactor,attr);
    }

    /**
     * Removes the blockingFactor attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remBlockingFactor(){
         rem(DmpDMSAG.__blockingFactor);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public Boolean isRegisterForEvents(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpDMSAG.__registerForEvents);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setRegisterForEvents(Boolean value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__registerForEvents);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__registerForEvents);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__registerForEvents,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setRegisterForEvents(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpDMSAG.__registerForEvents);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__registerForEvents);
        
        attr.set(value);
        set(DmpDMSAG.__registerForEvents,attr);
    }

    /**
     * Removes the registerForEvents attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remRegisterForEvents(){
         rem(DmpDMSAG.__registerForEvents);
    }

    /**
     * @return An Iterator of AttributeID objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1083)
    public Iterator<AttributeID> getAttributeSelector(){
        DmcTypeAttributeIDSET attr = (DmcTypeAttributeIDSET) get(DmpDMSAG.__attributeSelector);
        if (attr == null)
            return( ((List<AttributeID>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth AttributeID value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1095)
    public AttributeID getNthAttributeSelector(int i){
        DmcTypeAttributeIDSET attr = (DmcTypeAttributeIDSET) get(DmpDMSAG.__attributeSelector);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another attributeSelector to the specified value.
     * @param value AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public DmcAttribute<?> addAttributeSelector(AttributeID value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__attributeSelector);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(DmpDMSAG.__attributeSelector);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__attributeSelector,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1163)
    public DmcAttribute<?> addAttributeSelector(DmcAttributeInfo value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__attributeSelector);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(DmpDMSAG.__attributeSelector);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__attributeSelector,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1184)
    public boolean attributeSelectorContains(AttributeID value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__attributeSelector);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcAttributeInfo.
     * @param value DmcAttributeInfo
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1198)
    public boolean attributeSelectorContains(DmcAttributeInfo value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__attributeSelector);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another attributeSelector value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
    public DmcAttribute<?> addAttributeSelector(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__attributeSelector);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(DmpDMSAG.__attributeSelector);
        
        setLastValue(attr.add(value));
        add(DmpDMSAG.__attributeSelector,attr);
        return(attr);
    }

    /**
     * Returns the number of values in attributeSelector
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1233)
    public int getAttributeSelectorSize(){
        DmcAttribute<?> attr = get(DmpDMSAG.__attributeSelector);
        if (attr == null){
            if (DmpDMSAG.__attributeSelector.indexSize == 0)
                return(0);
            else
                return(DmpDMSAG.__attributeSelector.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a attributeSelector value.
     * @param value The AttributeID to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
    public DmcAttribute<?> delAttributeSelector(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__attributeSelector);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeIDSET(DmpDMSAG.__attributeSelector), value);
        else
            attr = del(DmpDMSAG.__attributeSelector, value);
        
        return(attr);
    }

    /**
     * Deletes a attributeSelector from the specified value.
     * @param value AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1307)
    public DmcAttribute<?> delAttributeSelector(AttributeID value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__attributeSelector);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeIDSET(DmpDMSAG.__attributeSelector), value);
        else
            attr = del(DmpDMSAG.__attributeSelector, value);
        
        return(attr);
    }

    /**
     * Removes the attributeSelector attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public void remAttributeSelector(){
         rem(DmpDMSAG.__attributeSelector);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public Boolean isCacheResponse(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpDMSAG.__cacheResponse);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setCacheResponse(Boolean value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__cacheResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__cacheResponse);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__cacheResponse,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setCacheResponse(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpDMSAG.__cacheResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__cacheResponse);
        
        attr.set(value);
        set(DmpDMSAG.__cacheResponse,attr);
    }

    /**
     * Removes the cacheResponse attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remCacheResponse(){
         rem(DmpDMSAG.__cacheResponse);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public String getSlice(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__slice);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setSlice(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__slice);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__slice,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setSlice(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__slice);
        
        attr.set(value);
        set(DmpDMSAG.__slice,attr);
    }

    /**
     * Removes the slice attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remSlice(){
         rem(DmpDMSAG.__slice);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public ClassFilter getClassFilter(){
        DmcTypeClassFilterSV attr = (DmcTypeClassFilterSV) get(MetaDMSAG.__classFilter);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets classFilter to the specified value.
     * @param value ClassFilter
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setClassFilter(ClassFilter value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__classFilter);
        if (attr == null)
            attr = new DmcTypeClassFilterSV(MetaDMSAG.__classFilter);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__classFilter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets classFilter to the specified value.
     * @param value A value compatible with DmcTypeClassFilterSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setClassFilter(Object value) throws DmcValueException {
        DmcTypeClassFilterSV attr  = (DmcTypeClassFilterSV) get(MetaDMSAG.__classFilter);
        if (attr == null)
            attr = new DmcTypeClassFilterSV(MetaDMSAG.__classFilter);
        
        attr.set(value);
        set(MetaDMSAG.__classFilter,attr);
    }

    /**
     * Removes the classFilter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remClassFilter(){
         rem(MetaDMSAG.__classFilter);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public ScopeEnum getScope(){
        DmcTypeScopeEnumSV attr = (DmcTypeScopeEnumSV) get(DmpDMSAG.__scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setScope(ScopeEnum value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(DmpDMSAG.__scope);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__scope,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setScope(Object value) throws DmcValueException {
        DmcTypeScopeEnumSV attr  = (DmcTypeScopeEnumSV) get(DmpDMSAG.__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(DmpDMSAG.__scope);
        
        attr.set(value);
        set(DmpDMSAG.__scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remScope(){
         rem(DmpDMSAG.__scope);
    }




}
