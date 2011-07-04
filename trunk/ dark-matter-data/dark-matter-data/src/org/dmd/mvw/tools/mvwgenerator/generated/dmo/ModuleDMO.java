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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:320)
import java.io.Serializable;                                                  // Always required
import java.util.*;                                                           // Always required
import org.dmd.dmc.DmcAttribute;                                              // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                                         // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type
import org.dmd.dmg.generated.dmo.DmgDMSAG;                                    // Attribute from dmg schema
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                          // Required type
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;                           // Required type
import org.dmd.dms.generated.types.DmcTypeStringSET;                          // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Module is used to define a reusable set of MVW functionality which can
 * be referred to in Application definitions or other Module definitions.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ModuleDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Module";

    public final static DmcClassInfo classInfo = MvwDMSAG.__Module;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

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

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:735)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__moduleName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__moduleName);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:865)
    public Iterator<String> getDependsOnModule(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:877)
    public String getNthDependsOnModule(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another dependsOnModule to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:890)
    public DmcAttribute<?> addDependsOnModule(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__dependsOnModule);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__dependsOnModule,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:932)
    public boolean dependsOnModuleContains(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another dependsOnModule value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:964)
    public DmcAttribute<?> addDependsOnModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__dependsOnModule);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__dependsOnModule,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:981)
    public int getDependsOnModuleSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnModule value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1023)
    public DmcAttribute<?> delDependsOnModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__dependsOnModule), value);
        else
            attr = del(MvwDMSAG.__dependsOnModule, value);
        
        return(attr);
    }

    /**
     * Deletes a dependsOnModule from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1039)
    public DmcAttribute<?> delDependsOnModule(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__dependsOnModule), value);
        else
            attr = del(MvwDMSAG.__dependsOnModule, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnModule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1058)
    public void remDependsOnModule(){
         rem(MvwDMSAG.__dependsOnModule);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:865)
    public Iterator<String> getDependsOnSchema(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:877)
    public String getNthDependsOnSchema(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another dependsOnSchema to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:890)
    public DmcAttribute<?> addDependsOnSchema(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__dependsOnSchema);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__dependsOnSchema,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:932)
    public boolean dependsOnSchemaContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another dependsOnSchema value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:964)
    public DmcAttribute<?> addDependsOnSchema(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__dependsOnSchema);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__dependsOnSchema,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnSchema
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:981)
    public int getDependsOnSchemaSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnSchema value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1023)
    public DmcAttribute<?> delDependsOnSchema(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__dependsOnSchema), value);
        else
            attr = del(MetaDMSAG.__dependsOnSchema, value);
        
        return(attr);
    }

    /**
     * Deletes a dependsOnSchema from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1039)
    public DmcAttribute<?> delDependsOnSchema(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__dependsOnSchema), value);
        else
            attr = del(MetaDMSAG.__dependsOnSchema, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnSchema attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1058)
    public void remDependsOnSchema(){
         rem(MetaDMSAG.__dependsOnSchema);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
    public Boolean isUsingStandardSubpackages(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__usingStandardSubpackages);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets usingStandardSubpackages to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void setUsingStandardSubpackages(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__usingStandardSubpackages);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__usingStandardSubpackages);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__usingStandardSubpackages,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets usingStandardSubpackages to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:731)
    public void setUsingStandardSubpackages(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__usingStandardSubpackages);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__usingStandardSubpackages);
        
        attr.set(value);
        set(MvwDMSAG.__usingStandardSubpackages,attr);
    }

    /**
     * Removes the usingStandardSubpackages attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:746)
    public void remUsingStandardSubpackages(){
         rem(MvwDMSAG.__usingStandardSubpackages);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
    public CamelCaseName getModuleName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__moduleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets moduleName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void setModuleName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__moduleName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__moduleName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__moduleName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets moduleName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:731)
    public void setModuleName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__moduleName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__moduleName);
        
        attr.set(value);
        set(MvwDMSAG.__moduleName,attr);
    }

    /**
     * Removes the moduleName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:746)
    public void remModuleName(){
         rem(MvwDMSAG.__moduleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
    public String getGenPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmgDMSAG.__genPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void setGenPackage(String value) {
        DmcAttribute<?> attr = get(DmgDMSAG.__genPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(DmgDMSAG.__genPackage);
        
        try{
            attr.set(value);
            set(DmgDMSAG.__genPackage,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:731)
    public void setGenPackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmgDMSAG.__genPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(DmgDMSAG.__genPackage);
        
        attr.set(value);
        set(DmgDMSAG.__genPackage,attr);
    }

    /**
     * Removes the genPackage attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:746)
    public void remGenPackage(){
         rem(DmgDMSAG.__genPackage);
    }




}
