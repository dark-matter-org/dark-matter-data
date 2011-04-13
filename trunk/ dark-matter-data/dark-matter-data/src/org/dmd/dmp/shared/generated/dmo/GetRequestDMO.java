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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:270)
import java.io.Serializable;                                            // Always required
import java.util.*;                                                     // Always required
import org.dmd.dmc.DmcAttribute;                                        // Primitive type and !auxiliary class
import org.dmd.dmc.DmcAttributeInfo;                                    // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                    // Named object
import org.dmd.dmc.DmcObjectNameIF;                                     // Generic args import
import org.dmd.dmc.DmcOmni;                                             // Lazy resolution
import org.dmd.dmc.DmcValueException;                                   // Any attributes
import org.dmd.dmc.types.FullyQualifiedName;                            // Primitive type and !auxiliary class
import org.dmd.dmc.types.IntegerName;                                   // Naming attribute type
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                     // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                    // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnumSV;           // Required type
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;                    // Type specific set/add
import org.dmd.dms.generated.enums.ValueTypeEnum;                       // Required if we have any attributes
import org.dmd.dms.generated.types.ClassDefinitionREF;                  // Helper class
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;         // Reference type
import org.dmd.dms.generated.types.DmcTypeDmcAttributeSV;               // Required type
import org.dmd.dms.generated.types.DmcTypeFullyQualifiedNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV;                // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                     // Required type

/**
 * The GetRequest is used to retrieve objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:129)
 */
@SuppressWarnings("serial")
public class GetRequestDMO  extends RequestDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GetRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"FullyQualifiedName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __blockingFactor = new DmcAttributeInfo("blockingFactor",519,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("filter",520,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __filterByClass = new DmcAttributeInfo("filterByClass",521,"ClassDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope",511,"ScopeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __targetObject = new DmcAttributeInfo("targetObject",530,"DmcAttribute",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);

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
        _ImAp.put(__targetObject.id,__targetObject);
        _ImAp.put(__timeMS.id,__timeMS);

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
        _SmAp.put(__targetObject.name,__targetObject);
        _SmAp.put(__timeMS.name,__timeMS);
    }

    public GetRequestDMO() {
        super("GetRequest");
    }

    protected GetRequestDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public GetRequestDMO getNew(){
        GetRequestDMO rc = new GetRequestDMO();
        return(rc);
    }

    public GetRequestDMO(DmcTypeModifierMV mods) {
        super("GetRequest");
        modrec(true);
        setModifier(mods);
    }

    public GetRequestDMO getModificationRecorder(){
        GetRequestDMO rc = new GetRequestDMO(new DmcTypeModifierMV());
        rc.setRequestID(getRequestID());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:669)
    public IntegerName getObjectName(){
        DmcAttribute<?> name = get(__requestID);
        if (name != null)
            return((IntegerName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__requestID);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof GetRequestDMO){
            return( getObjectName().equals( ((GetRequestDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remFilter(){
         rem(__filter);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:502)
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
     * Sets filterByClass to the specified value.
     * @param value ClassDefinitionDMO
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:541)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remFilterByClass(){
         rem(__filterByClass);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remBlockingFactor(){
         rem(__blockingFactor);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public IntegerName getRequestID(){
        DmcTypeIntegerNameSV attr = (DmcTypeIntegerNameSV) get(__requestID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setRequestID(IntegerName value) {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__requestID);
        
        try{
            attr.set(value);
            set(__requestID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__requestID);
        
        attr.set(value);
        set(__requestID,attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remRequestID(){
         rem(__requestID);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remScope(){
         rem(__scope);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public FullyQualifiedName getFQN(){
        DmcTypeFullyQualifiedNameSV attr = (DmcTypeFullyQualifiedNameSV) get(__FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setFQN(FullyQualifiedName value) {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(__FQN);
        
        try{
            attr.set(value);
            set(__FQN,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(__FQN);
        
        attr.set(value);
        set(__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remFQN(){
         rem(__FQN);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    @SuppressWarnings("unchecked")
    public DmcAttribute<DmcObjectNameIF> getTargetObject(){
        DmcTypeDmcAttributeSV attr = (DmcTypeDmcAttributeSV) get(__targetObject);
        if (attr == null)
            return(null);

        return((DmcAttribute<DmcObjectNameIF>)attr.getSV());
    }

    /**
     * Sets targetObject to the specified value.
     * @param value DmcAttribute
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setTargetObject(DmcAttribute<DmcObjectNameIF> value) {
        DmcAttribute<?> attr = get(__targetObject);
        if (attr == null)
            attr = new DmcTypeDmcAttributeSV(__targetObject);
        
        try{
            attr.set(value);
            set(__targetObject,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets targetObject to the specified value.
     * @param value A value compatible with DmcTypeDmcAttributeSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setTargetObject(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__targetObject);
        if (attr == null)
            attr = new DmcTypeDmcAttributeSV(__targetObject);
        
        attr.set(value);
        set(__targetObject,attr);
    }

    /**
     * Removes the targetObject attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remTargetObject(){
         rem(__targetObject);
    }




}
