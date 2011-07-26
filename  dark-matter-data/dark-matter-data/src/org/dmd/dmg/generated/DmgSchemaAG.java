package org.dmd.dmg.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmg.generated.dmo.DmgDMSAG;


/**
 * The dmg schema defines classes used by the Dark Matter Generator
 * framework. The concept of the framework is to allow users to extend the
 * overall code generation mechanism by providing their own generators that
 * conform to the DarkMatterGeneratorIF interface. Generally speaking, the
 * generators feed off a set of schemas associated with the DmgConfig object.
 * Exactly how each generator works, what files it generates and where it
 * generates them is specific to each generator.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:160)
 */
public class DmgSchemaAG extends SchemaDefinition {

    public static ClassDefinition _DmgConfig;

    public static AttributeDefinition _generator;
    public static AttributeDefinition _schemaToLoad;
    public static AttributeDefinition _configSuffix;
    public static AttributeDefinition _genPackage;
    public static AttributeDefinition _upperConstantName;
    public static AttributeDefinition _alias;

    public static TypeDefinition _Generator;



    static DmgSchemaAG instance;

    public DmgSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmg.generated.DmgSchemaAG";

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmg");
            me.setSchemaPackage("org.dmd.dmg");
            me.setDmwPackage("org.dmd.dmg");
            me.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmg/schema/v0dot1/dmg.dms");

            initClasses();
            initAttributes();
            initTypes();
            initActions();
            initEnums();
            DmcOmni.instance().addCompactSchema(DmgDMSAG.instance());
        }
    }

    private void initClasses() throws DmcValueException {
            ClassDefinitionDMO _DmgConfigOBJ = new ClassDefinitionDMO();
            _DmgConfig = new ClassDefinition(_DmgConfigOBJ);
            _DmgConfigOBJ.setName("DmgConfig");
            _DmgConfigOBJ.setDmdID("201");
            _DmgConfigOBJ.setClassType("STRUCTURAL");
            _DmgConfigOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmg/schema/v0dot1/classes.dmd");
            _DmgConfigOBJ.setLineNumber("13");
            _DmgConfigOBJ.setDescription("The DmgConfig class is used to specify a set of schemas and a set of  code generators to be run when you want to generate various types of code.");
            _DmgConfigOBJ.setDmtREFImport("org.dmd.dmg.generated.types.DmgConfigREF");
            _DmgConfigOBJ.setDmwIteratorClass("DmgConfigIterableDMW");
            _DmgConfigOBJ.addMay("schemaToLoad");
            _DmgConfigOBJ.addMay("configSuffix");
            _DmgConfigOBJ.addMay("description");
            _DmgConfigOBJ.addMay("generatedFileHeader");
            _DmgConfigOBJ.addMust("generator");
            _DmgConfigOBJ.addMust("genPackage");
            _DmgConfigOBJ.setDmwIteratorImport("org.dmd.dmg.generated.dmw.DmgConfigIterableDMW");
            _DmgConfig.setDefinedIn(this);
            addClassDefList(_DmgConfig);

    }

    private void initAttributes() throws DmcValueException {
            AttributeDefinitionDMO _generatorOBJ = new AttributeDefinitionDMO();
            _generator = new AttributeDefinition(_generatorOBJ);
            _generatorOBJ.setType("Generator");
            _generatorOBJ.setName("generator");
            _generatorOBJ.setDmdID("200");
            _generatorOBJ.setDescription("The fully qualified name of a class that that implements the DarkMatterGeneratorIF interface. The DMG Generator utility will call on this object to generate code.");
            _generatorOBJ.setValueType("MULTI");
            _generator.setDefinedIn(this);
            _generatorOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _generatorOBJ.setLineNumber("9");
            addAttributeDefList(_generator);

            AttributeDefinitionDMO _schemaToLoadOBJ = new AttributeDefinitionDMO();
            _schemaToLoad = new AttributeDefinition(_schemaToLoadOBJ);
            _schemaToLoadOBJ.setType("String");
            _schemaToLoadOBJ.setName("schemaToLoad");
            _schemaToLoadOBJ.setDmdID("201");
            _schemaToLoadOBJ.setDescription("The name of schema for which code will be generated.");
            _schemaToLoad.setDefinedIn(this);
            _schemaToLoadOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _schemaToLoadOBJ.setLineNumber("15");
            addAttributeDefList(_schemaToLoad);

            AttributeDefinitionDMO _configSuffixOBJ = new AttributeDefinitionDMO();
            _configSuffix = new AttributeDefinition(_configSuffixOBJ);
            _configSuffixOBJ.setType("String");
            _configSuffixOBJ.setName("configSuffix");
            _configSuffixOBJ.setDmdID("202");
            _configSuffixOBJ.setDescription("The suffix of an additional configuration files that are required by any of the specified generators. For example .mvc");
            _configSuffixOBJ.setValueType("MULTI");
            _configSuffix.setDefinedIn(this);
            _configSuffixOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _configSuffixOBJ.setLineNumber("23");
            addAttributeDefList(_configSuffix);

            AttributeDefinitionDMO _genPackageOBJ = new AttributeDefinitionDMO();
            _genPackage = new AttributeDefinition(_genPackageOBJ);
            _genPackageOBJ.setType("String");
            _genPackageOBJ.setName("genPackage");
            _genPackageOBJ.setDmdID("203");
            _genPackageOBJ.setDescription("The package name to be prepended to any generated code.");
            _genPackage.setDefinedIn(this);
            _genPackageOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _genPackageOBJ.setLineNumber("29");
            addAttributeDefList(_genPackage);

            AttributeDefinitionDMO _upperConstantNameOBJ = new AttributeDefinitionDMO();
            _upperConstantName = new AttributeDefinition(_upperConstantNameOBJ);
            _upperConstantNameOBJ.setType("String");
            _upperConstantNameOBJ.setName("upperConstantName");
            _upperConstantNameOBJ.setDmdID("205");
            _upperConstantNameOBJ.setDescription("The name of something in upper case with underscores e.g. THIS_IS_UPPER_CONSTANT.");
            _upperConstantName.setDefinedIn(this);
            _upperConstantNameOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _upperConstantNameOBJ.setLineNumber("41");
            addAttributeDefList(_upperConstantName);

            AttributeDefinitionDMO _aliasOBJ = new AttributeDefinitionDMO();
            _alias = new AttributeDefinition(_aliasOBJ);
            _aliasOBJ.setType("String");
            _aliasOBJ.setName("alias");
            _aliasOBJ.setDmdID("206");
            _aliasOBJ.setDescription("An alternative name for something.");
            _alias.setDefinedIn(this);
            _aliasOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmg/schema/v0dot1/attributes.dmd");
            _aliasOBJ.setLineNumber("47");
            addAttributeDefList(_alias);

    }

    private void initTypes() throws DmcValueException {
            TypeDefinitionDMO _GeneratorOBJ = new TypeDefinitionDMO();
            _Generator = new TypeDefinition(_GeneratorOBJ);
            _GeneratorOBJ.setName("Generator");
            _GeneratorOBJ.setDescription("The Generator type stores the fully qualified name of a class that implements the DarkMatterGeneratorIF. It also proviv=des the mechanism to instantiate the generator.");
            _GeneratorOBJ.setTypeClassName("org.dmd.dmg.types.DmcTypeGenerator");
            _GeneratorOBJ.setPrimitiveType("org.dmd.dmg.types.Generator");
            _GeneratorOBJ.setDmwIteratorClass("GeneratorIterableDMW");
            _GeneratorOBJ.setDmwIteratorImport("org.dmd.dmg.generated.dmw.GeneratorIterableDMW");
            _Generator.setDefinedIn(this);
            _GeneratorOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmg/schema/v0dot1/types.dmd");
            _GeneratorOBJ.setLineNumber("7");
            addTypeDefList(_Generator);

    }

    private void initActions() throws DmcValueException {
    }

    private void initEnums() throws DmcValueException {
    }


    @Override
    public synchronized DmgSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

