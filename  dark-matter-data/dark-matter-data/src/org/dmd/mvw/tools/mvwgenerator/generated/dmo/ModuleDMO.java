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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
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
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;                           // Required type
import org.dmd.dms.generated.types.DmcTypeStringSET;                          // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Module is used to define a reusable set of MVW functionality which can
 * be referred to in Application definitions or other Module definitions.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class ModuleDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Module";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __dependsOnModule = new DmcAttributeInfo("dependsOnModule",805,"String",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __dependsOnSchema = new DmcAttributeInfo("dependsOnSchema",808,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __genPackage = new DmcAttributeInfo("genPackage",203,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __moduleName = new DmcAttributeInfo("moduleName",810,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__dependsOnModule.id,__dependsOnModule);
        _ImAp.put(__dependsOnSchema.id,__dependsOnSchema);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__genPackage.id,__genPackage);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__moduleName.id,__moduleName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__dependsOnModule.name,__dependsOnModule);
        _SmAp.put(__dependsOnSchema.name,__dependsOnSchema);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__genPackage.name,__genPackage);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__moduleName.name,__moduleName);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ModuleDMO() {
        super("Module");
    }

    protected ModuleDMO(String oc) {
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
    public ModuleDMO getNew(){
        ModuleDMO rc = new ModuleDMO();
        return(rc);
    }

    @Override
    public ModuleDMO getSlice(DmcSliceInfo info){
        ModuleDMO rc = new ModuleDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ModuleDMO(DmcTypeModifierMV mods) {
        super("Module");
        modrec(true);
        setModifier(mods);
    }

    public ModuleDMO getModificationRecorder(){
        ModuleDMO rc = new ModuleDMO();
        rc.setModuleName(getModuleName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__moduleName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__moduleName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ModuleDMO){
            return( getObjectName().equals( ((ModuleDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<String> getDependsOnModule(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__dependsOnModule);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public String getNthDependsOnModule(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__dependsOnModule);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another dependsOnModule to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addDependsOnModule(String value) {
        DmcAttribute<?> attr = get(__dependsOnModule);
        if (attr == null)
            attr = new DmcTypeStringSET(__dependsOnModule);
        
        try{
            setLastValue(attr.add(value));
            add(__dependsOnModule,attr);
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean dependsOnModuleContains(String value) {
        DmcAttribute<?> attr = get(__dependsOnModule);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another dependsOnModule value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDependsOnModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOnModule);
        if (attr == null)
            attr = new DmcTypeStringSET(__dependsOnModule);
        
        setLastValue(attr.add(value));
        add(__dependsOnModule,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnModule
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDependsOnModuleSize(){
        DmcAttribute<?> attr = get(__dependsOnModule);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnModule value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delDependsOnModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOnModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__dependsOnModule), value);
        else
            attr = del(__dependsOnModule, value);
        
        return(attr);
    }

    /**
     * Deletes a dependsOnModule from the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delDependsOnModule(String value) {
        DmcAttribute<?> attr = get(__dependsOnModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__dependsOnModule), value);
        else
            attr = del(__dependsOnModule, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnModule attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDependsOnModule(){
         rem(__dependsOnModule);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<String> getDependsOnSchema(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__dependsOnSchema);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public String getNthDependsOnSchema(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__dependsOnSchema);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another dependsOnSchema to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addDependsOnSchema(String value) {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        if (attr == null)
            attr = new DmcTypeStringMV(__dependsOnSchema);
        
        try{
            setLastValue(attr.add(value));
            add(__dependsOnSchema,attr);
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean dependsOnSchemaContains(String value) {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another dependsOnSchema value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDependsOnSchema(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        if (attr == null)
            attr = new DmcTypeStringMV(__dependsOnSchema);
        
        setLastValue(attr.add(value));
        add(__dependsOnSchema,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnSchema
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDependsOnSchemaSize(){
        DmcAttribute<?> attr = get(__dependsOnSchema);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnSchema value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delDependsOnSchema(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__dependsOnSchema), value);
        else
            attr = del(__dependsOnSchema, value);
        
        return(attr);
    }

    /**
     * Deletes a dependsOnSchema from the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delDependsOnSchema(String value) {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__dependsOnSchema), value);
        else
            attr = del(__dependsOnSchema, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnSchema attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDependsOnSchema(){
         rem(__dependsOnSchema);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public CamelCaseName getModuleName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__moduleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets moduleName to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setModuleName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__moduleName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__moduleName);
        
        try{
            attr.set(value);
            set(__moduleName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets moduleName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setModuleName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__moduleName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__moduleName);
        
        attr.set(value);
        set(__moduleName,attr);
    }

    /**
     * Removes the moduleName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remModuleName(){
         rem(__moduleName);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getGenPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__genPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setGenPackage(String value) {
        DmcAttribute<?> attr = get(__genPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(__genPackage);
        
        try{
            attr.set(value);
            set(__genPackage,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setGenPackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__genPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(__genPackage);
        
        attr.set(value);
        set(__genPackage,attr);
    }

    /**
     * Removes the genPackage attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remGenPackage(){
         rem(__genPackage);
    }




}
