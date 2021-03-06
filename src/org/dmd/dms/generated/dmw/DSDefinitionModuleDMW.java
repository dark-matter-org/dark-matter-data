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
package org.dmd.dms.generated.dmw;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1641)
import java.util.*;                           // To support access functions - (MetaGenerator.java:1614)
import org.dmd.dmc.*;                         // Basic dark-matter infrastructure - (MetaGenerator.java:1616)
import org.dmd.dmc.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1615)
import org.dmd.dms.*;                         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1622)
import org.dmd.dms.generated.dmo.*;           // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1618)
import org.dmd.dms.generated.enums.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1619)
import org.dmd.dms.generated.types.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1620)
import org.dmd.dmw.*;                         // Base wrapper capabilities - (MetaGenerator.java:1617)
import org.dmd.util.exceptions.*;             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1621)

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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1649)
 */
@SuppressWarnings("unused")
public class DSDefinitionModuleDMW extends org.dmd.dms.DmsDefinition {

    private DSDefinitionModuleDMO mycore;

    protected DSDefinitionModuleDMW() {
        super(new DSDefinitionModuleDMO());
        mycore = (DSDefinitionModuleDMO) core;
        mycore.setContainer(this);
    }

    protected DSDefinitionModuleDMW(DmcObject obj) {
        super(obj);
        mycore = (DSDefinitionModuleDMO) core;
        mycore.setContainer(this);
    }

    protected DSDefinitionModuleDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DSDefinitionModuleDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        core   = obj;
        mycore = (DSDefinitionModuleDMO) obj;
        obj.setContainer(this);
    }

    public  DSDefinitionModuleDMO getDMO() {
        return(mycore);
    }

    protected DSDefinitionModuleDMW(ClassDefinition cd) {
        super(cd);
    }

    protected DSDefinitionModuleDMW(String mn) throws DmcValueException {
        super(new DSDefinitionModuleDMO());
        mycore = (DSDefinitionModuleDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     * @return the DefinitionName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the extension of files of a particular type. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public String getFileExtension(){
        return(mycore.getFileExtension());
    }

    /**
     * Sets fileExtension to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setFileExtension(Object value) throws DmcValueException {
        mycore.setFileExtension(value);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes.\n This is used as part of the serialization mechanisms
     * built into Dark Matter Objects. 
     * @return the Integer
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public Integer getDmdID(){
        return(mycore.getDmdID());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setDmdID(Object value) throws DmcValueException {
        mycore.setDmdID(value);
    }

    /**
     * The name of the class that will be generated as a result of a
     * DSDefinitionModule definition. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public String getModuleClassName(){
        return(mycore.getModuleClassName());
    }

    /**
     * Sets moduleClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setModuleClassName(Object value) throws DmcValueException {
        mycore.setModuleClassName(value);
    }

    /**
     * The name of the attribute in a DSDefinitionModule that\n indicates a
     * dependence on another module of the same type. For example, in\n
     * dark-matter schemas, the SchemaDefinition uses the dependsOn attribute
     * to\n refer to oher schemas. 
     * @return the AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public AttributeDefinition getModuleDependenceAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) mycore.get(MetaDMSAG.__moduleDependenceAttribute);
        if (attr == null)
            return(null);
        AttributeDefinitionDMO obj = attr.getSV().getObject();
        return((AttributeDefinition)obj.getContainer());
    }

    /**
     * Sets moduleDependenceAttribute to the specified value.
     * @param value A value compatible with AttributeDefinition
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setModuleDependenceAttribute(AttributeDefinition value) throws DmcValueException {
        mycore.setModuleDependenceAttribute(value.getDmcObject());
    }

    /**
     * A reference to the DSDefinition derived class that is the base class for a
     * \n set of definition classes. 
     * @return the DSDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public DSDefinition getBaseDefinition(){
        DmcTypeDSDefinitionREFSV attr = (DmcTypeDSDefinitionREFSV) mycore.get(MetaDMSAG.__baseDefinition);
        if (attr == null)
            return(null);
        DSDefinitionDMO obj = attr.getSV().getObject();
        return((DSDefinition)obj.getContainer());
    }

    /**
     * Sets baseDefinition to the specified value.
     * @param value A value compatible with DSDefinition
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setBaseDefinition(DSDefinition value) throws DmcValueException {
        mycore.setBaseDefinition(value.getDmcObject());
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
     * @return An Iterator of DSDefinitionModule objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public DSDefinitionModuleIterableDMW getRefersToDefsFromDSD(){
        DmcTypeDSDefinitionModuleREFMV attr = (DmcTypeDSDefinitionModuleREFMV) mycore.get(MetaDMSAG.__refersToDefsFromDSD);
        if (attr == null)
            return(DSDefinitionModuleIterableDMW.emptyList);

        return(new DSDefinitionModuleIterableDMW(attr.getMV()));
    }

    /**
     * Adds another refersToDefsFromDSD value.
     * @param value A value compatible with DSDefinitionModule
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addRefersToDefsFromDSD(DSDefinitionModule value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addRefersToDefsFromDSD(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of refersToDefsFromDSD values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getRefersToDefsFromDSDSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__refersToDefsFromDSD);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The name of the attribute that will be set on all definitions associated
     * with a DSD\n to indicate the module from which a definition was loaded. 
     * @return the AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public AttributeDefinition getDefinedInModuleAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) mycore.get(MetaDMSAG.__definedInModuleAttribute);
        if (attr == null)
            return(null);
        AttributeDefinitionDMO obj = attr.getSV().getObject();
        return((AttributeDefinition)obj.getContainer());
    }

    /**
     * Sets definedInModuleAttribute to the specified value.
     * @param value A value compatible with AttributeDefinition
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setDefinedInModuleAttribute(AttributeDefinition value) throws DmcValueException {
        mycore.setDefinedInModuleAttribute(value.getDmcObject());
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY\n have.
     * When accessed in Java, this is a set of references to
     * AttributeDefinition\n objects. 
     * @return the AttributeDefinition
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public AttributeDefinitionIterableDMW getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another may value.
     * @param value A value compatible with AttributeDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addMay(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMay(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of may values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getMaySize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have. 
     * @return the AttributeDefinition
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public AttributeDefinitionIterableDMW getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another must value.
     * @param value A value compatible with AttributeDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addMust(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMust(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of must values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getMustSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * If this flag is set to true, the loadSchemaClass attribute\n will be added
     * to the generated domain specific module definition class so that
     * additional schemas\n (usually containg auxiliary classes) can be loaded
     * dynamically. This allows the generated\n module parser to handle auxiliary
     * information on the domain specific definitions. 
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public Boolean getSupportDynamicSchemaLoading(){
        return(mycore.getSupportDynamicSchemaLoading());
    }

    /**
     * Sets supportDynamicSchemaLoading to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setSupportDynamicSchemaLoading(Object value) throws DmcValueException {
        mycore.setSupportDynamicSchemaLoading(value);
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2593)
    public Iterator<String> getRequiredBaseModule(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__requiredBaseModule);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another requiredBaseModule value.
     * @param value A value compatible with DmcTypeStringMV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public void addRequiredBaseModule(Object value) throws DmcValueException {
        mycore.addRequiredBaseModule(value);
    }

    /**
     * @return the number of requiredBaseModule values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getRequiredBaseModuleSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__requiredBaseModule);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     * @return the SchemaDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public SchemaDefinition getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) mycore.get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);
        SchemaDefinitionDMO obj = attr.getSV().getObject();
        return((SchemaDefinition)obj.getContainer());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with SchemaDefinition
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setDefinedIn(SchemaDefinition value) throws DmcValueException {
        mycore.setDefinedIn(value.getDmcObject());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1816)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
