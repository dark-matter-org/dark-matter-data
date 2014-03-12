//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1935)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1884)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1886)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1908)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1898)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1924)



/**
 * The DSDefinitionModule is a definition that defines a collection of
 * definitions\n and provides a basis for the generation of various artifacts
 * that allow for parsing and\n management of that set of definitions.\n
 * <p/>\n The specific of a definition module will result in the generation
 * of a ClassDefinition for\n the specified module type and thus, the dmdID
 * associated with it must be unique across the\n set of classes that
 * comprise the definitions encompassed by the module.\n <p/>\n The
 * ClassDefinition will be named by name and will have the may and must
 * attributes specified\n as part of the DSDefinitionModule. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1945)
 */
@SuppressWarnings("serial")
public class DSDefinitionModuleDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__baseDefinition.id,MetaDMSAG.__baseDefinition);
        _ImAp.put(MetaDMSAG.__dmdID.id,MetaDMSAG.__dmdID);
        _ImAp.put(MetaDMSAG.__fileExtension.id,MetaDMSAG.__fileExtension);
        _ImAp.put(MetaDMSAG.__moduleClassName.id,MetaDMSAG.__moduleClassName);
        _ImAp.put(MetaDMSAG.__moduleDependenceAttribute.id,MetaDMSAG.__moduleDependenceAttribute);
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__definedInModuleAttribute.id,MetaDMSAG.__definedInModuleAttribute);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__example.id,MetaDMSAG.__example);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__may.id,MetaDMSAG.__may);
        _ImAp.put(MetaDMSAG.__must.id,MetaDMSAG.__must);
        _ImAp.put(MetaDMSAG.__nvp.id,MetaDMSAG.__nvp);
        _ImAp.put(MetaDMSAG.__refersToDefsFromDSD.id,MetaDMSAG.__refersToDefsFromDSD);
        _ImAp.put(MetaDMSAG.__relatedToConcept.id,MetaDMSAG.__relatedToConcept);
        _ImAp.put(MetaDMSAG.__requiredBaseModule.id,MetaDMSAG.__requiredBaseModule);
        _ImAp.put(MetaDMSAG.__sortName.id,MetaDMSAG.__sortName);
        _ImAp.put(MetaDMSAG.__supportDynamicSchemaLoading.id,MetaDMSAG.__supportDynamicSchemaLoading);
        _ImAp.put(MetaDMSAG.__tags.id,MetaDMSAG.__tags);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__baseDefinition.name,MetaDMSAG.__baseDefinition);
        _SmAp.put(MetaDMSAG.__dmdID.name,MetaDMSAG.__dmdID);
        _SmAp.put(MetaDMSAG.__fileExtension.name,MetaDMSAG.__fileExtension);
        _SmAp.put(MetaDMSAG.__moduleClassName.name,MetaDMSAG.__moduleClassName);
        _SmAp.put(MetaDMSAG.__moduleDependenceAttribute.name,MetaDMSAG.__moduleDependenceAttribute);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__definedInModuleAttribute.name,MetaDMSAG.__definedInModuleAttribute);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__example.name,MetaDMSAG.__example);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__may.name,MetaDMSAG.__may);
        _SmAp.put(MetaDMSAG.__must.name,MetaDMSAG.__must);
        _SmAp.put(MetaDMSAG.__nvp.name,MetaDMSAG.__nvp);
        _SmAp.put(MetaDMSAG.__refersToDefsFromDSD.name,MetaDMSAG.__refersToDefsFromDSD);
        _SmAp.put(MetaDMSAG.__relatedToConcept.name,MetaDMSAG.__relatedToConcept);
        _SmAp.put(MetaDMSAG.__requiredBaseModule.name,MetaDMSAG.__requiredBaseModule);
        _SmAp.put(MetaDMSAG.__sortName.name,MetaDMSAG.__sortName);
        _SmAp.put(MetaDMSAG.__supportDynamicSchemaLoading.name,MetaDMSAG.__supportDynamicSchemaLoading);
        _SmAp.put(MetaDMSAG.__tags.name,MetaDMSAG.__tags);
    }


    public DSDefinitionModuleDMO(){
        super("DSDefinitionModule");
    }

    public DSDefinitionModuleDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public DSDefinitionModuleDMO getNew(){
        DSDefinitionModuleDMO rc = new DSDefinitionModuleDMO();
        return(rc);
    }

    @Override
    public DSDefinitionModuleDMO getSlice(DmcSliceInfo info){
        DSDefinitionModuleDMO rc = new DSDefinitionModuleDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * A reference to the DSDefinition derived class that is the base class for a
     * \n set of definition classes. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public DSDefinitionREF getBaseDefinition(){
        DmcTypeDSDefinitionREFSV attr = (DmcTypeDSDefinitionREFSV) get(MetaDMSAG.__baseDefinition);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets baseDefinition to the specified value.
     * @param value A value compatible with DmcTypeDSDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setBaseDefinition(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__baseDefinition);
        if (attr == null)
            attr = new DmcTypeDSDefinitionREFSV(MetaDMSAG.__baseDefinition);
        
        attr.set(value);
        set(MetaDMSAG.__baseDefinition,attr);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes.\n This is used as part of the serialization mechanisms
     * built into Dark Matter Objects. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public Integer getDmdID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__dmdID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setDmdID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmdID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__dmdID);
        
        attr.set(value);
        set(MetaDMSAG.__dmdID,attr);
    }

    /**
     * Indicates the extension of files of a particular type. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public String getFileExtension(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__fileExtension);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets fileExtension to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setFileExtension(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__fileExtension);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__fileExtension);
        
        attr.set(value);
        set(MetaDMSAG.__fileExtension,attr);
    }

    /**
     * The name of the class that will be generated as a result of a
     * DSDefinitionModule definition. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public String getModuleClassName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__moduleClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets moduleClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setModuleClassName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__moduleClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__moduleClassName);
        
        attr.set(value);
        set(MetaDMSAG.__moduleClassName,attr);
    }

    /**
     * The name of the attribute in a DSDefinitionModule that\n indicates a
     * dependence on another module of the same type. For example, in\n
     * dark-matter schemas, the SchemaDefinition uses the dependsOn attribute
     * to\n refer to oher schemas. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public AttributeDefinitionREF getModuleDependenceAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__moduleDependenceAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets moduleDependenceAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setModuleDependenceAttribute(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__moduleDependenceAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__moduleDependenceAttribute);
        
        attr.set(value);
        set(MetaDMSAG.__moduleDependenceAttribute,attr);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * The name of the attribute that will be set on all definitions associated
     * with a DSD\n to indicate the module from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public AttributeDefinitionREF getDefinedInModuleAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__definedInModuleAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInModuleAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setDefinedInModuleAttribute(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedInModuleAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__definedInModuleAttribute);
        
        attr.set(value);
        set(MetaDMSAG.__definedInModuleAttribute,attr);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2539)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2554)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DmcValueException e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        attr.add(value);
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setDotName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * The example attribute is used to provide additional\n examples of how some
     * defined thing is to be used. 
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2539)
    public Iterator<Example> getExample(){
        DmcTypeExampleMV attr = (DmcTypeExampleMV) get(MetaDMSAG.__example);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another example value.
     * @param value A value compatible with DmcTypeExampleMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addExample(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__example);
        if (attr == null)
            attr = new DmcTypeExampleMV(MetaDMSAG.__example);
        
        attr.add(value);
        add(MetaDMSAG.__example,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY\n have.
     * When accessed in Java, this is a set of references to
     * AttributeDefinition\n objects. 
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2532)
    public Iterator<AttributeDefinitionREF> getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__may);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another may value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addMay(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__may);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__may);
        
        attr.add(value);
        add(MetaDMSAG.__may,attr);
        return(attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have. 
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2532)
    public Iterator<AttributeDefinitionREF> getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__must);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another must value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addMust(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__must);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__must);
        
        attr.add(value);
        add(MetaDMSAG.__must,attr);
        return(attr);
    }

    /**
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2539)
    public Iterator<NameValuePair> getNvp(){
        DmcTypeNameValuePairMV attr = (DmcTypeNameValuePairMV) get(MetaDMSAG.__nvp);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with DmcTypeNameValuePairMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addNvp(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nvp);
        if (attr == null)
            attr = new DmcTypeNameValuePairMV(MetaDMSAG.__nvp);
        
        attr.add(value);
        add(MetaDMSAG.__nvp,attr);
        return(attr);
    }

    /**
     * A reference to another DSDefinitionModule from which the current\n module
     * makes use of definitions. For instance, the Model View Whatever DSD
     * includes references\n to schema related definitions. As a result of
     * specifying this, the module\n class that's generated for the
     * DSDefinitionModule will include the moduleDependenceAttribute\n of the
     * module from which definitions are used. Likewise, the generated parser\n
     * will be primed with the schema of the required definition module. 
     * @return An Iterator of DSDefinitionModuleDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2532)
    public Iterator<DSDefinitionModuleREF> getRefersToDefsFromDSD(){
        DmcTypeDSDefinitionModuleREFMV attr = (DmcTypeDSDefinitionModuleREFMV) get(MetaDMSAG.__refersToDefsFromDSD);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another refersToDefsFromDSD value.
     * @param value A value compatible with DmcTypeDSDefinitionModuleREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addRefersToDefsFromDSD(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__refersToDefsFromDSD);
        if (attr == null)
            attr = new DmcTypeDSDefinitionModuleREFMV(MetaDMSAG.__refersToDefsFromDSD);
        
        attr.add(value);
        add(MetaDMSAG.__refersToDefsFromDSD,attr);
        return(attr);
    }

    /**
     * Allows for references to base concepts that relate this\n definition to
     * another definition in the Concinnity domain. This mechanism is only used\n
     * in the domain of dark-matter schema definitions; other DSLs will allow for
     * direct\n reference to Concinnity concepts. 
     * @return An Iterator of ConcinnityDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2532)
    public Iterator<ConcinnityREF> getRelatedToConcept(){
        DmcTypeConcinnityREFMV attr = (DmcTypeConcinnityREFMV) get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another relatedToConcept value.
     * @param value A value compatible with DmcTypeConcinnityREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addRelatedToConcept(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            attr = new DmcTypeConcinnityREFMV(MetaDMSAG.__relatedToConcept);
        
        attr.add(value);
        add(MetaDMSAG.__relatedToConcept,attr);
        return(attr);
    }

    /**
     * A set of base module files that should be loaded before\n parsing of any
     * other modules associated with the DSD being defined. For example,\n the
     * dmdgpb (augmented Googoe Protocol Buffer specifications) DSD always
     * requires\n that the gpbbase.gpb file is loaded because it defines the base
     * types of the fields\n that comprise messages. By specifying gpbbase.gpb as
     * a requiredBaseModule, the\n generated parsing coordinator will ensure that
     * this module is loaded on start-up.\n <p/>\n You should specify just the
     * name of the module file to be loaded, not the file extension.\n The file
     * extension is assumed to be fileExtension associated with the DSD. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2539)
    public Iterator<String> getRequiredBaseModule(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__requiredBaseModule);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another requiredBaseModule value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addRequiredBaseModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__requiredBaseModule);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__requiredBaseModule);
        
        attr.add(value);
        add(MetaDMSAG.__requiredBaseModule,attr);
        return(attr);
    }

    /**
     * The sortName is used in siutations where we need a name\n for storage of a
     * definition that is globally unique but can be sorted on the basis\n of the
     * definition name, not the module name. The dotName for a definition is\n
     * module.definition...type, whereas the sortName would be
     * definition...module.type.\n So, for things like documentation generation,
     * the sortName provides a more \n natural ordering. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public DotName getSortName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__sortName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sortName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setSortName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__sortName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__sortName);
        
        attr.set(value);
        set(MetaDMSAG.__sortName,attr);
    }

    /**
     * If this flag is set to true, the loadSchemaClass attribute\n will be added
     * to the generated domain specific module definition class so that
     * additional schemas\n (usually containg auxiliary classes) can be loaded
     * dynamically. This allows the generated\n module parser to handle auxiliary
     * information on the domain specific definitions. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2337)
    public Boolean getSupportDynamicSchemaLoading(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__supportDynamicSchemaLoading);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets supportDynamicSchemaLoading to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2429)
    public void setSupportDynamicSchemaLoading(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__supportDynamicSchemaLoading);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__supportDynamicSchemaLoading);
        
        attr.set(value);
        set(MetaDMSAG.__supportDynamicSchemaLoading,attr);
    }

    /**
     * A collection of tags that can facilitate searching for\n definitions. The
     * values are limited to a-zA-Z0-9 and the space character. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2539)
    public Iterator<String> getTags(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__tags);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another tags value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addTags(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__tags);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__tags);
        
        attr.add(value);
        add(MetaDMSAG.__tags,attr);
        return(attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2128)

    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public DefinitionName getObjectName(){
        DmcTypeDefinitionName attr = (DmcTypeDefinitionName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeDefinitionName) get(MetaDMSAG.__name);
        return(attr);
    }

}
