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
package org.dmd.dmg.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:272)
import java.io.Serializable;                                   // Always required
import java.util.*;                                            // Always required
import org.dmd.dmc.DmcAttribute;                               // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                           // Always required
import org.dmd.dmc.DmcValueException;                          // Any attributes
import org.dmd.dmg.generated.types.DmcTypeGeneratorMV;         // Required type
import org.dmd.dmg.types.Generator;                            // Primitive type and !auxiliary class
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;              // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;            // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;            // Required type

/**
 * The DmgConfig class is used to specify a set of schemas and a set of  code
 * generators to be run when you want to generate various types of code.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class DmgConfigDMO  extends DmwWrapperDMO  implements Serializable  {

    public final static String constructionClassName = "DmgConfig";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __configSuffix = new DmcAttributeInfo("configSuffix",202,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __genPackage = new DmcAttributeInfo("genPackage",203,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __generatedFileHeader = new DmcAttributeInfo("generatedFileHeader",81,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __generator = new DmcAttributeInfo("generator",200,"Generator",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __schemaToLoad = new DmcAttributeInfo("schemaToLoad",201,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__configSuffix.id,__configSuffix);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__genPackage.id,__genPackage);
        _ImAp.put(__generatedFileHeader.id,__generatedFileHeader);
        _ImAp.put(__generator.id,__generator);
        _ImAp.put(__schemaToLoad.id,__schemaToLoad);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__configSuffix.name,__configSuffix);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__genPackage.name,__genPackage);
        _SmAp.put(__generatedFileHeader.name,__generatedFileHeader);
        _SmAp.put(__generator.name,__generator);
        _SmAp.put(__schemaToLoad.name,__schemaToLoad);
    }

    public DmgConfigDMO() {
        super("DmgConfig");
    }

    protected DmgConfigDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public DmgConfigDMO getNew(){
        DmgConfigDMO rc = new DmgConfigDMO();
        return(rc);
    }

    public DmgConfigDMO(DmcTypeModifierMV mods) {
        super("DmgConfig");
        modrec(true);
        setModifier(mods);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:560)
    public String getSchemaToLoad(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__schemaToLoad);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaToLoad to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:597)
    public void setSchemaToLoad(String value) {
        DmcAttribute<?> attr = get(__schemaToLoad);
        if (attr == null)
            attr = new DmcTypeStringSV(__schemaToLoad);
        
        try{
            attr.set(value);
            set(__schemaToLoad,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets schemaToLoad to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:624)
    public void setSchemaToLoad(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__schemaToLoad);
        if (attr == null)
            attr = new DmcTypeStringSV(__schemaToLoad);
        
        attr.set(value);
        set(__schemaToLoad,attr);
    }

    /**
     * Removes the schemaToLoad attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:639)
    public void remSchemaToLoad(){
         rem(__schemaToLoad);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:744)
    public Iterator<String> getConfigSuffix(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__configSuffix);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another configSuffix to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:757)
    public DmcAttribute<?> addConfigSuffix(String value) {
        DmcAttribute<?> attr = get(__configSuffix);
        if (attr == null)
            attr = new DmcTypeStringMV(__configSuffix);
        
        try{
            setLastValue(attr.add(value));
            add(__configSuffix,attr);
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:777)
    public boolean configSuffixContains(String value) {
        DmcAttribute<?> attr = get(__configSuffix);
        return(attr.contains(value));
    }

    /**
     * Adds another configSuffix value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:792)
    public DmcAttribute<?> addConfigSuffix(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__configSuffix);
        if (attr == null)
            attr = new DmcTypeStringMV(__configSuffix);
        
        setLastValue(attr.add(value));
        add(__configSuffix,attr);
        return(attr);
    }

    /**
     * Returns the number of values in configSuffix
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:809)
    public int getConfigSuffixSize(){
        DmcAttribute<?> attr = get(__configSuffix);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a configSuffix value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:851)
    public DmcAttribute<?> delConfigSuffix(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__configSuffix);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__configSuffix), value);
        else
            attr = del(__configSuffix, value);
        
        return(attr);
    }

    /**
     * Removes the configSuffix attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public void remConfigSuffix(){
         rem(__configSuffix);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:560)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:597)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        try{
            attr.set(value);
            set(__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:624)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:639)
    public void remDescription(){
         rem(__description);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:560)
    public String getGeneratedFileHeader(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__generatedFileHeader);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:597)
    public void setGeneratedFileHeader(String value) {
        DmcAttribute<?> attr = get(__generatedFileHeader);
        if (attr == null)
            attr = new DmcTypeStringSV(__generatedFileHeader);
        
        try{
            attr.set(value);
            set(__generatedFileHeader,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:624)
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__generatedFileHeader);
        if (attr == null)
            attr = new DmcTypeStringSV(__generatedFileHeader);
        
        attr.set(value);
        set(__generatedFileHeader,attr);
    }

    /**
     * Removes the generatedFileHeader attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:639)
    public void remGeneratedFileHeader(){
         rem(__generatedFileHeader);
    }

    /**
     * @return An Iterator of Generator objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:744)
    public Iterator<Generator> getGenerator(){
        DmcTypeGeneratorMV attr = (DmcTypeGeneratorMV) get(__generator);
        if (attr == null)
            return( ((List<Generator>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another generator to the specified value.
     * @param value Generator
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:757)
    public DmcAttribute<?> addGenerator(Generator value) {
        DmcAttribute<?> attr = get(__generator);
        if (attr == null)
            attr = new DmcTypeGeneratorMV(__generator);
        
        try{
            setLastValue(attr.add(value));
            add(__generator,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Generator.
     * @param value Generator
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:777)
    public boolean generatorContains(Generator value) {
        DmcAttribute<?> attr = get(__generator);
        return(attr.contains(value));
    }

    /**
     * Adds another generator value.
     * @param value A value compatible with Generator
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:792)
    public DmcAttribute<?> addGenerator(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__generator);
        if (attr == null)
            attr = new DmcTypeGeneratorMV(__generator);
        
        setLastValue(attr.add(value));
        add(__generator,attr);
        return(attr);
    }

    /**
     * Returns the number of values in generator
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:809)
    public int getGeneratorSize(){
        DmcAttribute<?> attr = get(__generator);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a generator value.
     * @param value The Generator to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:851)
    public DmcAttribute<?> delGenerator(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__generator);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeGeneratorMV(__generator), value);
        else
            attr = del(__generator, value);
        
        return(attr);
    }

    /**
     * Removes the generator attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public void remGenerator(){
         rem(__generator);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:560)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:597)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:624)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:639)
    public void remGenPackage(){
         rem(__genPackage);
    }




}
