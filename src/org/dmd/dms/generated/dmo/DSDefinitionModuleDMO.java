//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012-2021 dark-matter-data committers
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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1947)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1896)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1898)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1920)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1910)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1936)



/**
 * The DSDefinitionModule is a definition that defines a collection of
 * definitions\n and provides a basis for the generation of various artifacts
 * that allow for parsing and\n management of that set of definitions.\n
 * <p>\n The specific of a definition module will result in the generation of
 * a ClassDefinition for\n the specified module type and thus, the dmdID
 * associated with it must be unique across the\n set of classes that
 * comprise the definitions encompassed by the module.\n <p>\n The
 * ClassDefinition will be named by name and will have the may and must
 * attributes specified\n as part of the DSDefinitionModule. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1957)
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
        _ImAp.put(MetaDMSAG.__comment.id,MetaDMSAG.__comment);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__definedInModuleAttribute.id,MetaDMSAG.__definedInModuleAttribute);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dmoFromModule.id,MetaDMSAG.__dmoFromModule);
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__example.id,MetaDMSAG.__example);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__hint.id,MetaDMSAG.__hint);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__may.id,MetaDMSAG.__may);
        _ImAp.put(MetaDMSAG.__must.id,MetaDMSAG.__must);
        _ImAp.put(MetaDMSAG.__nvp.id,MetaDMSAG.__nvp);
        _ImAp.put(MetaDMSAG.__obsolete.id,MetaDMSAG.__obsolete);
        _ImAp.put(MetaDMSAG.__optimize.id,MetaDMSAG.__optimize);
        _ImAp.put(MetaDMSAG.__question.id,MetaDMSAG.__question);
        _ImAp.put(MetaDMSAG.__refersToDefsFromDSD.id,MetaDMSAG.__refersToDefsFromDSD);
        _ImAp.put(MetaDMSAG.__relatedToConcept.id,MetaDMSAG.__relatedToConcept);
        _ImAp.put(MetaDMSAG.__relationship.id,MetaDMSAG.__relationship);
        _ImAp.put(MetaDMSAG.__requiredBaseModule.id,MetaDMSAG.__requiredBaseModule);
        _ImAp.put(MetaDMSAG.__searchable.id,MetaDMSAG.__searchable);
        _ImAp.put(MetaDMSAG.__skip.id,MetaDMSAG.__skip);
        _ImAp.put(MetaDMSAG.__sortName.id,MetaDMSAG.__sortName);
        _ImAp.put(MetaDMSAG.__supportDynamicSchemaLoading.id,MetaDMSAG.__supportDynamicSchemaLoading);
        _ImAp.put(MetaDMSAG.__tags.id,MetaDMSAG.__tags);
        _ImAp.put(MetaDMSAG.__version.id,MetaDMSAG.__version);
        _ImAp.put(MetaDMSAG.__why.id,MetaDMSAG.__why);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__baseDefinition.name,MetaDMSAG.__baseDefinition);
        _SmAp.put(MetaDMSAG.__dmdID.name,MetaDMSAG.__dmdID);
        _SmAp.put(MetaDMSAG.__fileExtension.name,MetaDMSAG.__fileExtension);
        _SmAp.put(MetaDMSAG.__moduleClassName.name,MetaDMSAG.__moduleClassName);
        _SmAp.put(MetaDMSAG.__moduleDependenceAttribute.name,MetaDMSAG.__moduleDependenceAttribute);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__comment.name,MetaDMSAG.__comment);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__definedInModuleAttribute.name,MetaDMSAG.__definedInModuleAttribute);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dmoFromModule.name,MetaDMSAG.__dmoFromModule);
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__example.name,MetaDMSAG.__example);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__hint.name,MetaDMSAG.__hint);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__may.name,MetaDMSAG.__may);
        _SmAp.put(MetaDMSAG.__must.name,MetaDMSAG.__must);
        _SmAp.put(MetaDMSAG.__nvp.name,MetaDMSAG.__nvp);
        _SmAp.put(MetaDMSAG.__obsolete.name,MetaDMSAG.__obsolete);
        _SmAp.put(MetaDMSAG.__optimize.name,MetaDMSAG.__optimize);
        _SmAp.put(MetaDMSAG.__question.name,MetaDMSAG.__question);
        _SmAp.put(MetaDMSAG.__refersToDefsFromDSD.name,MetaDMSAG.__refersToDefsFromDSD);
        _SmAp.put(MetaDMSAG.__relatedToConcept.name,MetaDMSAG.__relatedToConcept);
        _SmAp.put(MetaDMSAG.__relationship.name,MetaDMSAG.__relationship);
        _SmAp.put(MetaDMSAG.__requiredBaseModule.name,MetaDMSAG.__requiredBaseModule);
        _SmAp.put(MetaDMSAG.__searchable.name,MetaDMSAG.__searchable);
        _SmAp.put(MetaDMSAG.__skip.name,MetaDMSAG.__skip);
        _SmAp.put(MetaDMSAG.__sortName.name,MetaDMSAG.__sortName);
        _SmAp.put(MetaDMSAG.__supportDynamicSchemaLoading.name,MetaDMSAG.__supportDynamicSchemaLoading);
        _SmAp.put(MetaDMSAG.__tags.name,MetaDMSAG.__tags);
        _SmAp.put(MetaDMSAG.__version.name,MetaDMSAG.__version);
        _SmAp.put(MetaDMSAG.__why.name,MetaDMSAG.__why);
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
     * @return the DSDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DSDefinitionREF getBaseDefinition(){
        DmcTypeDSDefinitionREFSV attr = (DmcTypeDSDefinitionREFSV) get(MetaDMSAG.__baseDefinition);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets baseDefinition to the specified value.
     * @param value A value compatible with DmcTypeDSDefinitionREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the Integer
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Integer getDmdID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__dmdID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmdID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmdID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__dmdID);
        
        attr.set(value);
        set(MetaDMSAG.__dmdID,attr);
    }

    /**
     * Indicates the extension of files of a particular type. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getFileExtension(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__fileExtension);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets fileExtension to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getModuleClassName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__moduleClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets moduleClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public AttributeDefinitionREF getModuleDependenceAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__moduleDependenceAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets moduleDependenceAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the DefinitionName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * A comment or note associated with the definition of something. For\n code
     * that's generated from a definition, comments may be added to the code, as
     * opposed to \n descriptions which are meant to assist in generating
     * documentation. In the end, it's up to\n the designer of a DSL to determine
     * how comments are used. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getComment(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__comment);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another comment value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addComment(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__comment);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__comment);
        
        attr.add(value);
        add(MetaDMSAG.__comment,attr);
        return(attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     * @return the SchemaDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public AttributeDefinitionREF getDefinedInModuleAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__definedInModuleAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInModuleAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2556)
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
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        attr.add(value);
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * A bit of a hack to allow for creation of fully qualified dot names\n in
     * the DMODefinitionSet that's used for caching definitions in GWT. On the
     * DMW side, this\n is taken care of by overloading the
     * getNameOfModuleWhereThisCameFrom() to access the \n getDefinedInModule
     * attribute and getting the name of the module. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmoFromModule(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoFromModule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoFromModule to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmoFromModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmoFromModule);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoFromModule);
        
        attr.set(value);
        set(MetaDMSAG.__dmoFromModule,attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     * @return the DotName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the Example
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<Example> getExample(){
        DmcTypeExampleMV attr = (DmcTypeExampleMV) get(MetaDMSAG.__example);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another example value.
     * @param value A value compatible with DmcTypeExampleMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * A short description of something that can be dumped as one line summary of
     * something.\n For longer explanations, use the description attribute. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getHint(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__hint);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets hint to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setHint(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__hint);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__hint);
        
        attr.set(value);
        set(MetaDMSAG.__hint,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     * @return the Integer
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the AttributeDefinition
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<AttributeDefinitionREF> getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__may);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another may value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
     * @return the AttributeDefinition
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<AttributeDefinitionREF> getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__must);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another must value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
     * @return the NameValuePair
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<NameValuePair> getNvp(){
        DmcTypeNameValuePairMV attr = (DmcTypeNameValuePairMV) get(MetaDMSAG.__nvp);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with DmcTypeNameValuePairMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addNvp(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nvp);
        if (attr == null)
            attr = new DmcTypeNameValuePairMV(MetaDMSAG.__nvp);
        
        attr.add(value);
        add(MetaDMSAG.__nvp,attr);
        return(attr);
    }

    /**
     * The version at which something became obsolete. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getObsolete(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__obsolete);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsolete to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setObsolete(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__obsolete);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__obsolete);
        
        attr.set(value);
        set(MetaDMSAG.__obsolete,attr);
    }

    /**
     * Depending on what you're modelling, you often come across\n places where
     * you can see an opportunity to optimize, streamline or improve something
     * e.g. merging\n concepts together, representing something differently,
     * adding a relationship - whatever.\n However, these ideas often get lost in
     * the shuffle or, if you add them into an overall\n description of
     * something, they don't stand out.\n <p>\n Any dark-matter definition can be
     * decorated with optimize notes. These notes provide 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getOptimize(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__optimize);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another optimize value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addOptimize(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__optimize);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__optimize);
        
        attr.add(value);
        add(MetaDMSAG.__optimize,attr);
        return(attr);
    }

    /**
     * A question associated with the definition of something. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getQuestion(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__question);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another question value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addQuestion(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__question);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__question);
        
        attr.add(value);
        add(MetaDMSAG.__question,attr);
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
     * @return the DSDefinitionModule
     * @return An Iterator of DSDefinitionModuleDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<DSDefinitionModuleREF> getRefersToDefsFromDSD(){
        DmcTypeDSDefinitionModuleREFMV attr = (DmcTypeDSDefinitionModuleREFMV) get(MetaDMSAG.__refersToDefsFromDSD);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another refersToDefsFromDSD value.
     * @param value A value compatible with DmcTypeDSDefinitionModuleREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
     * @return the Concinnity
     * @return An Iterator of ConcinnityDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<ConcinnityREF> getRelatedToConcept(){
        DmcTypeConcinnityREFMV attr = (DmcTypeConcinnityREFMV) get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another relatedToConcept value.
     * @param value A value compatible with DmcTypeConcinnityREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addRelatedToConcept(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            attr = new DmcTypeConcinnityREFMV(MetaDMSAG.__relatedToConcept);
        
        attr.add(value);
        add(MetaDMSAG.__relatedToConcept,attr);
        return(attr);
    }

    /**
     * The name of the relationship established via a reference to some other
     * named object.\n <p>\n This is a minor hack to allow creation of named
     * relationships in graph databases. Eventually, relationships\n will become
     * first class objects to which you can refer. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getRelationship(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__relationship);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets relationship to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setRelationship(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__relationship);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__relationship);
        
        attr.set(value);
        set(MetaDMSAG.__relationship,attr);
    }

    /**
     * A set of base module files that should be loaded before\n parsing of any
     * other modules associated with the DSD being defined. For example,\n the
     * dmdgpb (augmented Googoe Protocol Buffer specifications) DSD always
     * requires\n that the gpbbase.gpb file is loaded because it defines the base
     * types of the fields\n that comprise messages. By specifying gpbbase.gpb as
     * a requiredBaseModule, the\n generated parsing coordinator will ensure that
     * this module is loaded on start-up.\n <p>\n You should specify just the
     * name of the module file to be loaded, not the file extension.\n The file
     * extension is assumed to be fileExtension associated with the DSD. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getRequiredBaseModule(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__requiredBaseModule);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another requiredBaseModule value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addRequiredBaseModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__requiredBaseModule);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__requiredBaseModule);
        
        attr.add(value);
        add(MetaDMSAG.__requiredBaseModule,attr);
        return(attr);
    }

    /**
     * Indicates if something is searchable. 
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Boolean getSearchable(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__searchable);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets searchable to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setSearchable(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__searchable);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__searchable);
        
        attr.set(value);
        set(MetaDMSAG.__searchable,attr);
    }

    /**
     * A version from which something should be excluded (even though it is
     * included\n in later versions). This is an unusual situation, and should be
     * approached with extreme caution! 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getSkip(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__skip);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another skip value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addSkip(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__skip);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__skip);
        
        attr.add(value);
        add(MetaDMSAG.__skip,attr);
        return(attr);
    }

    /**
     * The sortName is used in siutations where we need a name\n for storage of a
     * definition that is globally unique but can be sorted on the basis\n of the
     * definition name, not the module name. The dotName for a definition is\n
     * module.definition...type, whereas the sortName would be
     * definition...module.type.\n So, for things like documentation generation,
     * the sortName provides a more \n natural ordering. 
     * @return the DotName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DotName getSortName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__sortName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sortName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Boolean getSupportDynamicSchemaLoading(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__supportDynamicSchemaLoading);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets supportDynamicSchemaLoading to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
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
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getTags(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__tags);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another tags value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addTags(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__tags);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__tags);
        
        attr.add(value);
        add(MetaDMSAG.__tags,attr);
        return(attr);
    }

    /**
     * The version at which something was introduced. Version names\n are assumed
     * to be lexicographically sortable i.e. the name of a version must have a
     * nautral\n sort order that increases. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__version);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets version to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setVersion(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__version);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__version);
        
        attr.set(value);
        set(MetaDMSAG.__version,attr);
    }

    /**
     * An indication of why something was added to a specification or a system.\n
     * This might be a reference to a requirement or feature concept. How this is
     * used will depend on context.\n Due to the fact that it is a weak
     * reference, you may also just put in free form text, since it\n will simply
     * be treated as an unresolved reference. 
     * @return the Concinnity
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public ConcinnityREF getWhy(){
        DmcTypeConcinnityREFSV attr = (DmcTypeConcinnityREFSV) get(MetaDMSAG.__why);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets why to the specified value.
     * @param value A value compatible with DmcTypeConcinnityREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setWhy(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__why);
        if (attr == null)
            attr = new DmcTypeConcinnityREFSV(MetaDMSAG.__why);
        
        attr.set(value);
        set(MetaDMSAG.__why,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2142)

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
