//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmg.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmg.generated.dmo.DmgDMSAG;


/**
 * The dmg schema defines classes used by the Dark Matter Generator
 * framework.\n The concept of the framework is to allow users to extend the
 * overall code generation\n mechanism by providing their own generators that
 * conform to the DarkMatterGeneratorIF\n interface. Generally speaking, the
 * generators feed off a set of schemas associated\n with the DmgConfig
 * object. Exactly how each generator works, what files it generates\n and
 * where it generates them is specific to each generator.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:182)
 */
public class DmgSchemaAG extends SchemaDefinition {

    public static ClassDefinition _DmgConfig;
    public static ClassDefinition _GenerationContext;
    public static ClassDefinition _WrapperGenerator;
    public static ClassDefinition _MethodGenerator;
    public static ClassDefinition _ActifactGenerator;

    public static AttributeDefinition _generator;
    public static AttributeDefinition _schemaToLoad;
    public static AttributeDefinition _configSuffix;
    public static AttributeDefinition _genPackage;
    public static AttributeDefinition _upperConstantName;
    public static AttributeDefinition _alias;
    public static AttributeDefinition _genContextName;
    public static AttributeDefinition _genContext;
    public static AttributeDefinition _genClass;

    public static TypeDefinition _Generator;






    static DmgSchemaAG instance;

    public DmgSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmg.generated.DmgSchemaAG";

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:208)
    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmg");
            me.setDotName("dmg");
            me.setSchemaPackage("org.dmd.dmg");
            me.setDmwPackage("org.dmd.dmg");
            me.setFile("/src/org/dmd/dmg/schema/v0dot1/dmg.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            initDSDModules();
            DmcOmni.instance().addCompactSchema(DmgDMSAG.instance());
        }
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _DmgConfigOBJ = new ClassDefinitionDMO();
            _DmgConfig = new ClassDefinition(_DmgConfigOBJ,DmgDMSAG.__DmgConfig);
            _DmgConfigOBJ.setName("DmgConfig");
            _DmgConfigOBJ.setDmdID("201");
            _DmgConfigOBJ.setClassType("STRUCTURAL");
            _DmgConfigOBJ.setDotName("dmg.DmgConfig.ClassDefinition");
            _DmgConfigOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/classes.dmd");
            _DmgConfigOBJ.setLineNumber("14");
            _DmgConfigOBJ.addDescription("The DmgConfig class is used to specify a set of schemas and a set of \n code generators to be run when you want to generate various types of code.");
            _DmgConfigOBJ.setDmtREFImport("org.dmd.dmg.generated.types.DmgConfigREF");
            _DmgConfigOBJ.setDmwIteratorClass("DmgConfigIterableDMW");
            _DmgConfigOBJ.addMay("dmg.schemaToLoad");
            _DmgConfigOBJ.addMay("dmg.configSuffix");
            _DmgConfigOBJ.addMay("meta.description");
            _DmgConfigOBJ.addMay("meta.generatedFileHeader");
            _DmgConfigOBJ.addMust("dmg.generator");
            _DmgConfigOBJ.addMust("dmg.genPackage");
            _DmgConfigOBJ.setDmwIteratorImport("org.dmd.dmg.generated.dmw.DmgConfigIterableDMW");
            _DmgConfig.setDefinedIn(this);
            addClassDefList(_DmgConfig);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _GenerationContextOBJ = new ClassDefinitionDMO();
            _GenerationContext = new ClassDefinition(_GenerationContextOBJ,DmgDMSAG.__GenerationContext);
            _GenerationContextOBJ.setName("GenerationContext");
            _GenerationContextOBJ.setDmdID("202");
            _GenerationContextOBJ.setClassType("STRUCTURAL");
            _GenerationContextOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/classes.dmd");
            _GenerationContextOBJ.setLineNumber("24");
            _GenerationContextOBJ.addDescription("The GenerationContext acts as a gathering point for a set of\n code generation components.");
            _GenerationContextOBJ.setIsNamedBy("dmg.genContextName");
            _GenerationContextOBJ.setUseWrapperType("EXTENDED");
            _GenerationContextOBJ.setDmtREFImport("org.dmd.dmg.generated.types.GenerationContextREF");
            _GenerationContextOBJ.setDmwIteratorClass("GenerationContextIterableDMW");
            _GenerationContextOBJ.addMust("dmg.genContextName");
            _GenerationContextOBJ.setDmwIteratorImport("org.dmd.dmg.generated.dmw.GenerationContextIterableDMW");
            _GenerationContextOBJ.setDotName("dmg.GenerationContext.ClassDefinition");
            _GenerationContext.setDefinedIn(this);
            addClassDefList(_GenerationContext);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _WrapperGeneratorOBJ = new ClassDefinitionDMO();
            _WrapperGenerator = new ClassDefinition(_WrapperGeneratorOBJ,DmgDMSAG.__WrapperGenerator);
            _WrapperGeneratorOBJ.setName("WrapperGenerator");
            _WrapperGeneratorOBJ.setDmdID("203");
            _WrapperGeneratorOBJ.setClassType("STRUCTURAL");
            _WrapperGeneratorOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/classes.dmd");
            _WrapperGeneratorOBJ.setLineNumber("37");
            _WrapperGeneratorOBJ.addDescription("The WrapperGenerator allows for the definition of a code generation\n component that creates DMO wrappers for use in particular usage environments.");
            _WrapperGeneratorOBJ.setIsNamedBy("meta.name");
            _WrapperGeneratorOBJ.setUseWrapperType("EXTENDED");
            _WrapperGeneratorOBJ.setDmtREFImport("org.dmd.dmg.generated.types.WrapperGeneratorREF");
            _WrapperGeneratorOBJ.setDmwIteratorClass("WrapperGeneratorIterableDMW");
            _WrapperGeneratorOBJ.addMust("meta.name");
            _WrapperGeneratorOBJ.addMust("dmg.genContext");
            _WrapperGeneratorOBJ.addMust("meta.classType");
            _WrapperGeneratorOBJ.addMust("dmg.genClass");
            _WrapperGeneratorOBJ.setDmwIteratorImport("org.dmd.dmg.generated.dmw.WrapperGeneratorIterableDMW");
            _WrapperGeneratorOBJ.setDotName("dmg.WrapperGenerator.ClassDefinition");
            _WrapperGenerator.setDefinedIn(this);
            addClassDefList(_WrapperGenerator);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _MethodGeneratorOBJ = new ClassDefinitionDMO();
            _MethodGenerator = new ClassDefinition(_MethodGeneratorOBJ,DmgDMSAG.__MethodGenerator);
            _MethodGeneratorOBJ.setName("MethodGenerator");
            _MethodGeneratorOBJ.setDmdID("204");
            _MethodGeneratorOBJ.setClassType("STRUCTURAL");
            _MethodGeneratorOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/classes.dmd");
            _MethodGeneratorOBJ.setLineNumber("52");
            _MethodGeneratorOBJ.addDescription("The MethodGenerator allows for the definition of a code generation\n component that creates access methods for wrapper classes in different usage\n environments.");
            _MethodGeneratorOBJ.setIsNamedBy("meta.name");
            _MethodGeneratorOBJ.setUseWrapperType("EXTENDED");
            _MethodGeneratorOBJ.setDmtREFImport("org.dmd.dmg.generated.types.MethodGeneratorREF");
            _MethodGeneratorOBJ.setDmwIteratorClass("MethodGeneratorIterableDMW");
            _MethodGeneratorOBJ.addMust("meta.name");
            _MethodGeneratorOBJ.addMust("dmg.genContext");
            _MethodGeneratorOBJ.addMust("meta.valueType");
            _MethodGeneratorOBJ.addMust("meta.baseType");
            _MethodGeneratorOBJ.addMust("dmg.genClass");
            _MethodGeneratorOBJ.setDmwIteratorImport("org.dmd.dmg.generated.dmw.MethodGeneratorIterableDMW");
            _MethodGeneratorOBJ.setDotName("dmg.MethodGenerator.ClassDefinition");
            _MethodGenerator.setDefinedIn(this);
            addClassDefList(_MethodGenerator);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ActifactGeneratorOBJ = new ClassDefinitionDMO();
            _ActifactGenerator = new ClassDefinition(_ActifactGeneratorOBJ,DmgDMSAG.__ActifactGenerator);
            _ActifactGeneratorOBJ.setName("ActifactGenerator");
            _ActifactGeneratorOBJ.setDmdID("205");
            _ActifactGeneratorOBJ.setClassType("STRUCTURAL");
            _ActifactGeneratorOBJ.setDotName("dmg.ActifactGenerator.ClassDefinition");
            _ActifactGeneratorOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/classes.dmd");
            _ActifactGeneratorOBJ.setLineNumber("60");
            _ActifactGeneratorOBJ.setIsNamedBy("meta.name");
            _ActifactGeneratorOBJ.setUseWrapperType("EXTENDED");
            _ActifactGeneratorOBJ.setDmtREFImport("org.dmd.dmg.generated.types.ActifactGeneratorREF");
            _ActifactGeneratorOBJ.setDmwIteratorClass("ActifactGeneratorIterableDMW");
            _ActifactGeneratorOBJ.addMust("meta.name");
            _ActifactGeneratorOBJ.addMust("dmg.genClass");
            _ActifactGeneratorOBJ.setDmwIteratorImport("org.dmd.dmg.generated.dmw.ActifactGeneratorIterableDMW");
            _ActifactGenerator.setDefinedIn(this);
            addClassDefList(_ActifactGenerator);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _generatorOBJ = new AttributeDefinitionDMO();
            _generator = new AttributeDefinition(_generatorOBJ);
            _generatorOBJ.setType("dmg.Generator");
            _generatorOBJ.setName("generator");
            _generatorOBJ.setDmdID("200");
            _generatorOBJ.addDescription("The fully qualified name of a class that that implements the\n DarkMatterGeneratorIF interface. The DMG Generator utility will call\n on this object to generate code.");
            _generatorOBJ.setValueType("MULTI");
            _generatorOBJ.setDotName("dmg.generator.AttributeDefinition");
            _generator.setDefinedIn(this);
            _generatorOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _generatorOBJ.setLineNumber("9");
            addAttributeDefList(_generator);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _schemaToLoadOBJ = new AttributeDefinitionDMO();
            _schemaToLoad = new AttributeDefinition(_schemaToLoadOBJ);
            _schemaToLoadOBJ.setType("meta.String");
            _schemaToLoadOBJ.setName("schemaToLoad");
            _schemaToLoadOBJ.setDmdID("201");
            _schemaToLoadOBJ.addDescription("The name of schema for which code will be generated.");
            _schemaToLoadOBJ.setDotName("dmg.schemaToLoad.AttributeDefinition");
            _schemaToLoad.setDefinedIn(this);
            _schemaToLoadOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _schemaToLoadOBJ.setLineNumber("15");
            addAttributeDefList(_schemaToLoad);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _configSuffixOBJ = new AttributeDefinitionDMO();
            _configSuffix = new AttributeDefinition(_configSuffixOBJ);
            _configSuffixOBJ.setType("meta.String");
            _configSuffixOBJ.setName("configSuffix");
            _configSuffixOBJ.setDmdID("202");
            _configSuffixOBJ.addDescription("The suffix of an additional configuration files that are\n required by any of the specified generators. For example .mvc");
            _configSuffixOBJ.setValueType("MULTI");
            _configSuffixOBJ.setDotName("dmg.configSuffix.AttributeDefinition");
            _configSuffix.setDefinedIn(this);
            _configSuffixOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _configSuffixOBJ.setLineNumber("23");
            addAttributeDefList(_configSuffix);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _genPackageOBJ = new AttributeDefinitionDMO();
            _genPackage = new AttributeDefinition(_genPackageOBJ);
            _genPackageOBJ.setType("meta.String");
            _genPackageOBJ.setName("genPackage");
            _genPackageOBJ.setDmdID("203");
            _genPackageOBJ.addDescription("The package name to be prepended to any generated code.");
            _genPackageOBJ.setDotName("dmg.genPackage.AttributeDefinition");
            _genPackage.setDefinedIn(this);
            _genPackageOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _genPackageOBJ.setLineNumber("29");
            addAttributeDefList(_genPackage);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _upperConstantNameOBJ = new AttributeDefinitionDMO();
            _upperConstantName = new AttributeDefinition(_upperConstantNameOBJ);
            _upperConstantNameOBJ.setType("meta.String");
            _upperConstantNameOBJ.setName("upperConstantName");
            _upperConstantNameOBJ.setDmdID("205");
            _upperConstantNameOBJ.addDescription("The name of something in upper case with underscores e.g. THIS_IS_UPPER_CONSTANT.");
            _upperConstantNameOBJ.setDotName("dmg.upperConstantName.AttributeDefinition");
            _upperConstantName.setDefinedIn(this);
            _upperConstantNameOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _upperConstantNameOBJ.setLineNumber("41");
            addAttributeDefList(_upperConstantName);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _aliasOBJ = new AttributeDefinitionDMO();
            _alias = new AttributeDefinition(_aliasOBJ);
            _aliasOBJ.setType("meta.String");
            _aliasOBJ.setName("alias");
            _aliasOBJ.setDmdID("206");
            _aliasOBJ.addDescription("An alternative name for something.");
            _aliasOBJ.setDotName("dmg.alias.AttributeDefinition");
            _alias.setDefinedIn(this);
            _aliasOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _aliasOBJ.setLineNumber("47");
            addAttributeDefList(_alias);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _genContextNameOBJ = new AttributeDefinitionDMO();
            _genContextName = new AttributeDefinition(_genContextNameOBJ);
            _genContextNameOBJ.setType("meta.CamelCaseName");
            _genContextNameOBJ.setName("genContextName");
            _genContextNameOBJ.setDmdID("207");
            _genContextNameOBJ.addDescription("The name of a code generation context.");
            _genContextNameOBJ.setDotName("dmg.genContextName.AttributeDefinition");
            _genContextName.setDefinedIn(this);
            _genContextNameOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _genContextNameOBJ.setLineNumber("53");
            addAttributeDefList(_genContextName);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _genContextOBJ = new AttributeDefinitionDMO();
            _genContext = new AttributeDefinition(_genContextOBJ);
            _genContextOBJ.setType("dmg.GenerationContext");
            _genContextOBJ.setName("genContext");
            _genContextOBJ.setDmdID("208");
            _genContextOBJ.addDescription("The generation context to which a code generation object belongs.");
            _genContextOBJ.setDotName("dmg.genContext.AttributeDefinition");
            _genContext.setDefinedIn(this);
            _genContextOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _genContextOBJ.setLineNumber("59");
            addAttributeDefList(_genContext);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _genClassOBJ = new AttributeDefinitionDMO();
            _genClass = new AttributeDefinition(_genClassOBJ);
            _genClassOBJ.setType("meta.String");
            _genClassOBJ.setName("genClass");
            _genClassOBJ.setDmdID("209");
            _genClassOBJ.addDescription("The fully qualified Java class name of a code generation component.");
            _genClassOBJ.setDotName("dmg.genClass.AttributeDefinition");
            _genClass.setDefinedIn(this);
            _genClassOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _genClassOBJ.setLineNumber("65");
            addAttributeDefList(_genClass);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initTypes() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            TypeDefinitionDMO _GeneratorOBJ = new TypeDefinitionDMO();
            _Generator = new TypeDefinition(_GeneratorOBJ);
            _GeneratorOBJ.setName("Generator");
            _GeneratorOBJ.addDescription("The Generator type stores the fully qualified name of a class that\n implements the DarkMatterGeneratorIF. It also proviv=des the mechanism to instantiate\n the generator.");
            _GeneratorOBJ.setTypeClassName("org.dmd.dmg.types.DmcTypeGenerator");
            _GeneratorOBJ.setPrimitiveType("org.dmd.dmg.types.Generator");
            _GeneratorOBJ.setDmwIteratorClass("GeneratorIterableDMW");
            _GeneratorOBJ.setDotName("dmg.Generator.TypeDefinition");
            _GeneratorOBJ.setDmwIteratorImport("org.dmd.dmg.generated.dmw.GeneratorIterableDMW");
            _Generator.setDefinedIn(this);
            _GeneratorOBJ.setFile("/src/org/dmd/dmg/schema/v0dot1/types.dmd");
            _GeneratorOBJ.setLineNumber("7");
            addTypeDefList(_Generator);

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
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:272)

    @Override
    public synchronized DmgSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

