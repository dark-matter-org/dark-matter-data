//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:282)
import java.io.Serializable;                                                  // Always required
import java.util.*;                                                           // Always required
import org.dmd.dmc.DmcAttribute;                                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                          // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                                         // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                              // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                          // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSET;                          // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The RunContextItem allows for the generation of an overall RunContext for
 * a WebApplication or WebSite.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:132)
 */
@SuppressWarnings("serial")
public class RunContextItemDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "RunContextItem";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __construction = new DmcAttributeInfo("construction",828,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __contextImpl = new DmcAttributeInfo("contextImpl",830,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __importThis = new DmcAttributeInfo("importThis",831,"String",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __itemName = new DmcAttributeInfo("itemName",827,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __itemOrder = new DmcAttributeInfo("itemOrder",829,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __useClass = new DmcAttributeInfo("useClass",826,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__construction.id,__construction);
        _ImAp.put(__contextImpl.id,__contextImpl);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__importThis.id,__importThis);
        _ImAp.put(__itemName.id,__itemName);
        _ImAp.put(__itemOrder.id,__itemOrder);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__useClass.id,__useClass);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__construction.name,__construction);
        _SmAp.put(__contextImpl.name,__contextImpl);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__importThis.name,__importThis);
        _SmAp.put(__itemName.name,__itemName);
        _SmAp.put(__itemOrder.name,__itemOrder);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__useClass.name,__useClass);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public RunContextItemDMO() {
        super("RunContextItem");
    }

    protected RunContextItemDMO(String oc) {
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
    public RunContextItemDMO getNew(){
        RunContextItemDMO rc = new RunContextItemDMO();
        return(rc);
    }

    @Override
    public RunContextItemDMO getSlice(DmcSliceInfo info){
        RunContextItemDMO rc = new RunContextItemDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public RunContextItemDMO(DmcTypeModifierMV mods) {
        super("RunContextItem");
        modrec(true);
        setModifier(mods);
    }

    public RunContextItemDMO getModificationRecorder(){
        RunContextItemDMO rc = new RunContextItemDMO();
        rc.setItemName(getItemName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:733)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__itemName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__itemName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof RunContextItemDMO){
            return( getObjectName().equals( ((RunContextItemDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public Integer getItemOrder(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__itemOrder);
        if (attr == null)
            return(50);

        return(attr.getSV());
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value Integer
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setItemOrder(Integer value) {
        DmcAttribute<?> attr = get(__itemOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__itemOrder);
        
        try{
            attr.set(value);
            set(__itemOrder,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setItemOrder(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__itemOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__itemOrder);
        
        attr.set(value);
        set(__itemOrder,attr);
    }

    /**
     * Removes the itemOrder attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remItemOrder(){
         rem(__itemOrder);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public String getContextImpl(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__contextImpl);
        if (attr == null)
            return("Default");

        return(attr.getSV());
    }

    /**
     * Sets contextImpl to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setContextImpl(String value) {
        DmcAttribute<?> attr = get(__contextImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(__contextImpl);
        
        try{
            attr.set(value);
            set(__contextImpl,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets contextImpl to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setContextImpl(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__contextImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(__contextImpl);
        
        attr.set(value);
        set(__contextImpl,attr);
    }

    /**
     * Removes the contextImpl attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remContextImpl(){
         rem(__contextImpl);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:803)
    public Iterator<String> getImportThis(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__importThis);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:815)
    public String getNthImportThis(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__importThis);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another importThis to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:828)
    public DmcAttribute<?> addImportThis(String value) {
        DmcAttribute<?> attr = get(__importThis);
        if (attr == null)
            attr = new DmcTypeStringSET(__importThis);
        
        try{
            setLastValue(attr.add(value));
            add(__importThis,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:870)
    public boolean importThisContains(String value) {
        DmcAttribute<?> attr = get(__importThis);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:902)
    public DmcAttribute<?> addImportThis(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__importThis);
        if (attr == null)
            attr = new DmcTypeStringSET(__importThis);
        
        setLastValue(attr.add(value));
        add(__importThis,attr);
        return(attr);
    }

    /**
     * Returns the number of values in importThis
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:919)
    public int getImportThisSize(){
        DmcAttribute<?> attr = get(__importThis);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:961)
    public DmcAttribute<?> delImportThis(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__importThis);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__importThis), value);
        else
            attr = del(__importThis, value);
        
        return(attr);
    }

    /**
     * Deletes a importThis from the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:977)
    public DmcAttribute<?> delImportThis(String value) {
        DmcAttribute<?> attr = get(__importThis);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__importThis), value);
        else
            attr = del(__importThis, value);
        
        return(attr);
    }

    /**
     * Removes the importThis attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:996)
    public void remImportThis(){
         rem(__importThis);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public CamelCaseName getItemName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__itemName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets itemName to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setItemName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__itemName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__itemName);
        
        try{
            attr.set(value);
            set(__itemName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets itemName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setItemName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__itemName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__itemName);
        
        attr.set(value);
        set(__itemName,attr);
    }

    /**
     * Removes the itemName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remItemName(){
         rem(__itemName);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public String getUseClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__useClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useClass to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setUseClass(String value) {
        DmcAttribute<?> attr = get(__useClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__useClass);
        
        try{
            attr.set(value);
            set(__useClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setUseClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__useClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__useClass);
        
        attr.set(value);
        set(__useClass,attr);
    }

    /**
     * Removes the useClass attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remUseClass(){
         rem(__useClass);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public String getConstruction(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__construction);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets construction to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setConstruction(String value) {
        DmcAttribute<?> attr = get(__construction);
        if (attr == null)
            attr = new DmcTypeStringSV(__construction);
        
        try{
            attr.set(value);
            set(__construction,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets construction to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setConstruction(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__construction);
        if (attr == null)
            attr = new DmcTypeStringSV(__construction);
        
        attr.set(value);
        set(__construction,attr);
    }

    /**
     * Removes the construction attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remConstruction(){
         rem(__construction);
    }




}
