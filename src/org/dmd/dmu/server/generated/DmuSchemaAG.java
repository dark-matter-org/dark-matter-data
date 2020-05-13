//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmu.server.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmu.shared.generated.dmo.DmuDMSAG;


/**
 * This is the schema definition for the dmu domain-specific language.
 * <P>
 * Generated from the dmu schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:182)
 */
public class DmuSchemaAG extends SchemaDefinition {

    public static ClassDefinition _DmuDefinition;
    public static ClassDefinition _PayloadSortInfo;
    public static ClassDefinition _PayloadExample;
    public static ClassDefinition _DmuModule;

    public static AttributeDefinition _definedInDmuModule;
    public static AttributeDefinition _dependsOnDmuModule;
    public static AttributeDefinition _pathAndKeys;
    public static AttributeDefinition _jsonPayload;
    public static AttributeDefinition _useSortInfo;

    public static TypeDefinition _PathAndKey;





    public static DSDefinitionModule _DmuModuleDSD;

    static DmuSchemaAG instance;

    public DmuSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmu.server.generated.DmuSchemaAG";

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:208)
    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmu");
            me.setDotName("dmu");
            me.setSchemaPackage("org.dmd.dmu.shared");
            me.setDmwPackage("org.dmd.dmu.server");
            me.setFile("/src/org/dmd/dmu/shared/dmconfig/dmu.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            initDSDModules();
            DmcOmni.instance().addCompactSchema(DmuDMSAG.instance());
        }
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _DmuDefinitionOBJ = new ClassDefinitionDMO();
            _DmuDefinition = new ClassDefinition(_DmuDefinitionOBJ,DmuDMSAG.__DmuDefinition);
            _DmuDefinitionOBJ.setName("DmuDefinition");
            _DmuDefinitionOBJ.setDmdID("-859998");
            _DmuDefinitionOBJ.setClassType("ABSTRACT");
            _DmuDefinitionOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/classes.dmd");
            _DmuDefinitionOBJ.setLineNumber("13");
            _DmuDefinitionOBJ.setIsNamedBy("meta.name");
            _DmuDefinitionOBJ.addDescription("This is the module definition for the dmu domain-specific language.");
            _DmuDefinitionOBJ.setUseWrapperType("EXTENDED");
            _DmuDefinitionOBJ.setDerivedFrom("meta.DSDefinition");
            _DmuDefinitionOBJ.addMust("meta.name");
            _DmuDefinitionOBJ.addMust("dmu.definedInDmuModule");
            _DmuDefinitionOBJ.setDmwIteratorImport("org.dmd.dmu.server.generated.dmw.DmuDefinitionIterableDMW");
            _DmuDefinitionOBJ.setDmwIteratorClass("DmuDefinitionIterableDMW");
            _DmuDefinitionOBJ.setDmtREFImport("org.dmd.dmu.shared.generated.types.DmuDefinitionREF");
            _DmuDefinitionOBJ.setDotName("dmu.DmuDefinition.ClassDefinition");
            _DmuDefinitionOBJ.setPartOfDefinitionModule("dmu.DmuModule");
            _DmuDefinition.setDefinedIn(this);
            addClassDefList(_DmuDefinition);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _PayloadSortInfoOBJ = new ClassDefinitionDMO();
            _PayloadSortInfo = new ClassDefinition(_PayloadSortInfoOBJ,DmuDMSAG.__PayloadSortInfo);
            _PayloadSortInfoOBJ.setName("PayloadSortInfo");
            _PayloadSortInfoOBJ.setDmdID("-859990");
            _PayloadSortInfoOBJ.setClassType("STRUCTURAL");
            _PayloadSortInfoOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/classes.dmd");
            _PayloadSortInfoOBJ.setLineNumber("28");
            _PayloadSortInfoOBJ.setIsNamedBy("meta.name");
            _PayloadSortInfoOBJ.addDescription("<font color=\"red\">json:</font> In order to perform the diff between an existing configuration on\n the device and an incoming payload, the JSON objects must have arrays of objects\n sorted based on specified key values. Otherwise, the com.github.fge.jsonpatch.diff.JsonDiff\n diff mechanisms can't provide a decent comparison.");
            _PayloadSortInfoOBJ.setUseWrapperType("EXTENDED");
            _PayloadSortInfoOBJ.setDerivedFrom("dmu.DmuDefinition");
            _PayloadSortInfoOBJ.setSubpackage("json");
            _PayloadSortInfoOBJ.addMust("meta.name");
            _PayloadSortInfoOBJ.addMay("dmu.pathAndKeys");
            _PayloadSortInfoOBJ.setDmwIteratorImport("org.dmd.dmu.server.generated.dmw.PayloadSortInfoIterableDMW");
            _PayloadSortInfoOBJ.setDmwIteratorClass("PayloadSortInfoIterableDMW");
            _PayloadSortInfoOBJ.setDmtREFImport("org.dmd.dmu.shared.generated.types.PayloadSortInfoREF");
            _PayloadSortInfoOBJ.setDotName("dmu.PayloadSortInfo.ClassDefinition");
            _PayloadSortInfoOBJ.setPartOfDefinitionModule("dmu.DmuModule");
            _PayloadSortInfo.setDefinedIn(this);
            addClassDefList(_PayloadSortInfo);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _PayloadExampleOBJ = new ClassDefinitionDMO();
            _PayloadExample = new ClassDefinition(_PayloadExampleOBJ,DmuDMSAG.__PayloadExample);
            _PayloadExampleOBJ.setName("PayloadExample");
            _PayloadExampleOBJ.setDmdID("-859988");
            _PayloadExampleOBJ.setClassType("STRUCTURAL");
            _PayloadExampleOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/classes.dmd");
            _PayloadExampleOBJ.setLineNumber("41");
            _PayloadExampleOBJ.setIsNamedBy("meta.name");
            _PayloadExampleOBJ.addDescription("<font color=\"red\">json:</font> The PayloadExample allows you to specify\n examples of JSON payloads to be used to test various functionality.");
            _PayloadExampleOBJ.setUseWrapperType("EXTENDED");
            _PayloadExampleOBJ.setDerivedFrom("dmu.DmuDefinition");
            _PayloadExampleOBJ.setSubpackage("json");
            _PayloadExampleOBJ.addMust("meta.name");
            _PayloadExampleOBJ.addMust("dmu.jsonPayload");
            _PayloadExampleOBJ.addMay("dmu.useSortInfo");
            _PayloadExampleOBJ.setDmwIteratorImport("org.dmd.dmu.server.generated.dmw.PayloadExampleIterableDMW");
            _PayloadExampleOBJ.setDmwIteratorClass("PayloadExampleIterableDMW");
            _PayloadExampleOBJ.setDmtREFImport("org.dmd.dmu.shared.generated.types.PayloadExampleREF");
            _PayloadExampleOBJ.setDotName("dmu.PayloadExample.ClassDefinition");
            _PayloadExampleOBJ.setPartOfDefinitionModule("dmu.DmuModule");
            _PayloadExample.setDefinedIn(this);
            addClassDefList(_PayloadExample);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _DmuModuleOBJ = new ClassDefinitionDMO();
            _DmuModule = new ClassDefinition(_DmuModuleOBJ,DmuDMSAG.__DmuModule);
            _DmuModuleOBJ.setName("DmuModule");
            _DmuModuleOBJ.setDmdID("-859999");
            _DmuModuleOBJ.setClassType("STRUCTURAL");
            _DmuModuleOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/module.dmd");
            _DmuModuleOBJ.setLineNumber("13");
            _DmuModuleOBJ.setInternallyGenerated("true");
            _DmuModuleOBJ.setIsNamedBy("meta.name");
            _DmuModuleOBJ.setUseWrapperType("EXTENDED");
            _DmuModuleOBJ.addDescription("This is the module definition for the dmu domain-specific language.");
            _DmuModuleOBJ.setDerivedFrom("dmu.DmuDefinition");
            _DmuModuleOBJ.addMust("meta.name");
            _DmuModuleOBJ.addMay("meta.loadSchemaClass");
            _DmuModuleOBJ.addMay("meta.description");
            _DmuModuleOBJ.addMay("meta.defFiles");
            _DmuModuleOBJ.addMay("dmu.dependsOnDmuModule");
            _DmuModuleOBJ.setDmwIteratorImport("org.dmd.dmu.server.generated.dmw.DmuModuleIterableDMW");
            _DmuModuleOBJ.setDmwIteratorClass("DmuModuleIterableDMW");
            _DmuModuleOBJ.setDmtREFImport("org.dmd.dmu.shared.generated.types.DmuModuleREF");
            _DmuModuleOBJ.setDsdModuleDefinition("dmu.DmuModule");
            _DmuModuleOBJ.setDotName("dmu.DmuModule.ClassDefinition");
            _DmuModuleOBJ.setPartOfDefinitionModule("dmu.DmuModule");
            _DmuModule.setDefinedIn(this);
            addClassDefList(_DmuModule);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _definedInDmuModuleOBJ = new AttributeDefinitionDMO();
            _definedInDmuModule = new AttributeDefinition(_definedInDmuModuleOBJ);
            _definedInDmuModuleOBJ.addDescription("Indicates that a definition came from this module.");
            _definedInDmuModuleOBJ.setName("definedInDmuModule");
            _definedInDmuModuleOBJ.setDmdID("-429999");
            _definedInDmuModuleOBJ.setType("dmu.DmuModule");
            _definedInDmuModuleOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/attributes.dmd");
            _definedInDmuModuleOBJ.setDotName("dmu.definedInDmuModule.AttributeDefinition");
            _definedInDmuModuleOBJ.setLineNumber("8");
            _definedInDmuModule.setDefinedIn(this);
            addAttributeDefList(_definedInDmuModule);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _dependsOnDmuModuleOBJ = new AttributeDefinitionDMO();
            _dependsOnDmuModule = new AttributeDefinition(_dependsOnDmuModuleOBJ);
            _dependsOnDmuModuleOBJ.addDescription("Allows us to use definitions from another DmuModule");
            _dependsOnDmuModuleOBJ.setName("dependsOnDmuModule");
            _dependsOnDmuModuleOBJ.setDmdID("-429998");
            _dependsOnDmuModuleOBJ.setType("dmu.DmuModule");
            _dependsOnDmuModuleOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/attributes.dmd");
            _dependsOnDmuModuleOBJ.setDotName("dmu.dependsOnDmuModule.AttributeDefinition");
            _dependsOnDmuModuleOBJ.setLineNumber("15");
            _dependsOnDmuModuleOBJ.setValueType("MULTI");
            _dependsOnDmuModule.setDefinedIn(this);
            addAttributeDefList(_dependsOnDmuModule);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _pathAndKeysOBJ = new AttributeDefinitionDMO();
            _pathAndKeys = new AttributeDefinition(_pathAndKeysOBJ);
            _pathAndKeysOBJ.addDescription("<font color=\"red\">json:</font> A collection of path and key values\n that indicate how various arrays of objects with a JSON payload are to be sorted.");
            _pathAndKeysOBJ.setName("pathAndKeys");
            _pathAndKeysOBJ.setDmdID("-429990");
            _pathAndKeysOBJ.setType("dmu.PathAndKey");
            _pathAndKeysOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/attributes.dmd");
            _pathAndKeysOBJ.setDotName("dmu.pathAndKeys.AttributeDefinition");
            _pathAndKeysOBJ.setLineNumber("23");
            _pathAndKeysOBJ.setValueType("MULTI");
            _pathAndKeys.setDefinedIn(this);
            addAttributeDefList(_pathAndKeys);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _jsonPayloadOBJ = new AttributeDefinitionDMO();
            _jsonPayload = new AttributeDefinition(_jsonPayloadOBJ);
            _jsonPayloadOBJ.addDescription("<font color=\"red\">test:</font> Indicates the JSON object that's our payload.");
            _jsonPayloadOBJ.setName("jsonPayload");
            _jsonPayloadOBJ.setDmdID("-429989");
            _jsonPayloadOBJ.setPreserveNewlines("true");
            _jsonPayloadOBJ.setType("meta.String");
            _jsonPayloadOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/attributes.dmd");
            _jsonPayloadOBJ.setDotName("dmu.jsonPayload.AttributeDefinition");
            _jsonPayloadOBJ.setLineNumber("30");
            _jsonPayload.setDefinedIn(this);
            addAttributeDefList(_jsonPayload);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _useSortInfoOBJ = new AttributeDefinitionDMO();
            _useSortInfo = new AttributeDefinition(_useSortInfoOBJ);
            _useSortInfoOBJ.addDescription("Reference to the PayloadSortInfo to be used for a payload.");
            _useSortInfoOBJ.setName("useSortInfo");
            _useSortInfoOBJ.setDmdID("-429988");
            _useSortInfoOBJ.setType("dmu.PayloadSortInfo");
            _useSortInfoOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/attributes.dmd");
            _useSortInfoOBJ.setDotName("dmu.useSortInfo.AttributeDefinition");
            _useSortInfoOBJ.setLineNumber("35");
            _useSortInfo.setDefinedIn(this);
            addAttributeDefList(_useSortInfo);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initTypes() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            TypeDefinitionDMO _PathAndKeyOBJ = new TypeDefinitionDMO();
            _PathAndKey = new TypeDefinition(_PathAndKeyOBJ);
            _PathAndKeyOBJ.addDescription("The PathAndKey provides support for indicating a path through\n a JSON object to an array of objects and the key value to be used to sort those objects.");
            _PathAndKeyOBJ.setName("PathAndKey");
            _PathAndKeyOBJ.setTypeClassName("org.dmd.dmu.shared.types.DmcTypePathAndKey");
            _PathAndKeyOBJ.setPrimitiveType("org.dmd.dmu.shared.types.PathAndKey");
            _PathAndKeyOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/types.dmd");
            _PathAndKeyOBJ.setDotName("dmu.PathAndKey.TypeDefinition");
            _PathAndKeyOBJ.setLineNumber("10");
            _PathAndKeyOBJ.setDmwIteratorImport("org.dmd.dmu.server.generated.dmw.PathAndKeyIterableDMW");
            _PathAndKeyOBJ.setDmwIteratorClass("PathAndKeyIterableDMW");
            _PathAndKey.setDefinedIn(this);
            addTypeDefList(_PathAndKey);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initComplexTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initActions() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initEnums() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initRules() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initDSDModules() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            DSDefinitionModuleDMO _DmuModuleDSDOBJ = new DSDefinitionModuleDMO();
            _DmuModuleDSD = new DSDefinitionModule(_DmuModuleDSDOBJ);
            _DmuModuleDSDOBJ.setFileExtension("dmu");
            _DmuModuleDSDOBJ.setName("DmuModule");
            _DmuModuleDSDOBJ.setDmdID("1");
            _DmuModuleDSDOBJ.setModuleClassName("DmuModule");
            _DmuModuleDSDOBJ.setBaseDefinition("dmu.DmuDefinition");
            _DmuModuleDSDOBJ.setModuleDependenceAttribute("dmu.dependsOnDmuModule");
            _DmuModuleDSDOBJ.setDefinedInModuleAttribute("dmu.definedInDmuModule");
            _DmuModuleDSDOBJ.setFile("/src/org/dmd/dmu/shared/dmconfig/module.dmd");
            _DmuModuleDSDOBJ.setDotName("dmu.DmuModule.DSDefinitionModule");
            _DmuModuleDSDOBJ.setLineNumber("13");
            _DmuModuleDSDOBJ.setSupportDynamicSchemaLoading("true");
            _DmuModuleDSDOBJ.addDescription("This is the module definition for the dmu domain-specific language.");
            _DmuModuleDSD.setDefinedIn(this);
            addDsdModuleList(_DmuModuleDSD);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:272)

    @Override
    public synchronized DmuSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

