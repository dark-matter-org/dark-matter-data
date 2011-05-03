package org.dmd.mvw.generated;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;


/**
 * The MVW (Model-View-Whatever) schema defines classes that can be used to
 * model aspects of both Model-View-Controller or Model-View-Presenter style
 * applications.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:159)
 */
public class MvwSchemaAG extends SchemaDefinition {

    public static ClassDefinition _MvwDefinition;
    public static ClassDefinition _MvwConfig;
    public static ClassDefinition _MvwEvent;

    public static AttributeDefinition _definedInMvwConfig;
    public static AttributeDefinition _firesEvent;
    public static AttributeDefinition _handlesEvent;
    public static AttributeDefinition _userDataType;
    public static AttributeDefinition _userDataImport;
    public static AttributeDefinition _dependsOnMvw;




    static MvwSchemaAG instance;

    public MvwSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.mvw.generated.MvwSchemaAG";

        dependsOnSchemaClasses.put("dmg","null.generated.DmgSchemaAG");

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("mvw");
            me.setSchemaPackage("org.dmd.mvw");
            me.setDmwPackage("org.dmd.mvw");
            me.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/mvw.dms");


            me.addDependsOn("dmg");
            dependsOnSchemaClasses.put("dmg","null.generated.DmgSchemaAG");


            initClasses();
            initAttributes();
            initTypes();
            initActions();
            initEnums();
        }
    }

    private void initClasses() throws DmcValueException {
            ClassDefinitionDMO _MvwDefinitionOBJ = new ClassDefinitionDMO();
            _MvwDefinition = new ClassDefinition(_MvwDefinitionOBJ);
            _MvwDefinitionOBJ.setName("MvwDefinition");
            _MvwDefinitionOBJ.setClassType("ABSTRACT");
            _MvwDefinitionOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/classes.dmd");
            _MvwDefinitionOBJ.setLineNumber("13");
            _MvwDefinitionOBJ.setDescription("The MvwDefinition class provide a common base for all MVW definition classes.");
            _MvwDefinitionOBJ.setIsNamedBy("camelCaseName");
            _MvwDefinitionOBJ.setUseWrapperType("EXTENDED");
            _MvwDefinitionOBJ.setDmtREFImport("org.dmd.mvw.generated.types.MvwDefinitionREF");
            _MvwDefinitionOBJ.setDmwIteratorClass("MvwDefinitionIterableDMW");
            _MvwDefinitionOBJ.addMay("file");
            _MvwDefinitionOBJ.addMay("lineNumber");
            _MvwDefinitionOBJ.addMay("description");
            _MvwDefinitionOBJ.addMust("camelCaseName");
            _MvwDefinitionOBJ.addMust("definedInMvwConfig");
            _MvwDefinitionOBJ.setDmwIteratorImport("org.dmd.mvw.generated.dmw.MvwDefinitionIterableDMW");
            _MvwDefinition.setDefinedIn(this);
            addClassDefList(_MvwDefinition);

            ClassDefinitionDMO _MvwConfigOBJ = new ClassDefinitionDMO();
            _MvwConfig = new ClassDefinition(_MvwConfigOBJ);
            _MvwConfigOBJ.setName("MvwConfig");
            _MvwConfigOBJ.setClassType("STRUCTURAL");
            _MvwConfigOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/classes.dmd");
            _MvwConfigOBJ.setLineNumber("27");
            _MvwConfigOBJ.setDescription("The MvwConfig class is stored in a file with a .mvw suffix and contains various Model View Whatever (MVW) definitions. The name of the MvwConfig can be referred to via the dependsOnMvw attribute so that MVW definitions defined elsewhere can be used.");
            _MvwConfigOBJ.setDerivedFrom("MvwDefinition");
            _MvwConfigOBJ.setIsNamedBy("camelCaseName");
            _MvwConfigOBJ.setUseWrapperType("EXTENDED");
            _MvwConfigOBJ.setDmtREFImport("org.dmd.mvw.generated.types.MvwConfigREF");
            _MvwConfigOBJ.setDmwIteratorClass("MvwConfigIterableDMW");
            _MvwConfigOBJ.addMay("dependsOnMvw");
            _MvwConfigOBJ.addMust("camelCaseName");
            _MvwConfigOBJ.addMust("genPackage");
            _MvwConfigOBJ.setDmwIteratorImport("org.dmd.mvw.generated.dmw.MvwConfigIterableDMW");
            _MvwConfig.setDefinedIn(this);
            addClassDefList(_MvwConfig);

            ClassDefinitionDMO _MvwEventOBJ = new ClassDefinitionDMO();
            _MvwEvent = new ClassDefinition(_MvwEventOBJ);
            _MvwEventOBJ.setName("MvwEvent");
            _MvwEventOBJ.setClassType("STRUCTURAL");
            _MvwEventOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/classes.dmd");
            _MvwEventOBJ.setLineNumber("40");
            _MvwEventOBJ.setDescription("The MvwEvent is an autonomous definition of some kind of event that is fired and handled by components ina Model-View-Whatever application. Specification of an MvwEvent will result the creation of a GwtEvent.Type<H> class and its associated EventHandler class.");
            _MvwEventOBJ.setDerivedFrom("MvwDefinition");
            _MvwEventOBJ.setIsNamedBy("camelCaseName");
            _MvwEventOBJ.setUseWrapperType("EXTENDED");
            _MvwEventOBJ.setDmtREFImport("org.dmd.mvw.generated.types.MvwEventREF");
            _MvwEventOBJ.setDmwIteratorClass("MvwEventIterableDMW");
            _MvwEventOBJ.addMay("description");
            _MvwEventOBJ.addMay("userDataType");
            _MvwEventOBJ.addMay("userDataImport");
            _MvwEventOBJ.addMust("camelCaseName");
            _MvwEventOBJ.setDmwIteratorImport("org.dmd.mvw.generated.dmw.MvwEventIterableDMW");
            _MvwEvent.setDefinedIn(this);
            addClassDefList(_MvwEvent);

    }

    private void initAttributes() throws DmcValueException {
            AttributeDefinitionDMO _definedInMvwConfigOBJ = new AttributeDefinitionDMO();
            _definedInMvwConfig = new AttributeDefinition(_definedInMvwConfigOBJ);
            _definedInMvwConfigOBJ.setType("MvwConfig");
            _definedInMvwConfigOBJ.setName("definedInMvwConfig");
            _definedInMvwConfigOBJ.setDmdID("800");
            _definedInMvwConfigOBJ.setDescription("All MvwDefinitions are defined in an MVW config file that ends with a");
            _definedInMvwConfig.setDefinedIn(this);
            _definedInMvwConfigOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/attributes.dmd");
            _definedInMvwConfigOBJ.setLineNumber("7");
            addAttributeDefList(_definedInMvwConfig);

            AttributeDefinitionDMO _firesEventOBJ = new AttributeDefinitionDMO();
            _firesEvent = new AttributeDefinition(_firesEventOBJ);
            _firesEventOBJ.setType("MvwEvent");
            _firesEventOBJ.setName("firesEvent");
            _firesEventOBJ.setDmdID("801");
            _firesEventOBJ.setDescription("Indicates the MvwEvents that are fired by various MVW components.");
            _firesEventOBJ.setValueType("TREEMAPPED");
            _firesEvent.setDefinedIn(this);
            _firesEventOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/attributes.dmd");
            _firesEventOBJ.setLineNumber("14");
            addAttributeDefList(_firesEvent);

            AttributeDefinitionDMO _handlesEventOBJ = new AttributeDefinitionDMO();
            _handlesEvent = new AttributeDefinition(_handlesEventOBJ);
            _handlesEventOBJ.setType("MvwEvent");
            _handlesEventOBJ.setName("handlesEvent");
            _handlesEventOBJ.setDmdID("802");
            _handlesEventOBJ.setDescription("This attributes holds a list of MvwEvents that are handled by various MVW components.");
            _handlesEventOBJ.setValueType("TREEMAPPED");
            _handlesEvent.setDefinedIn(this);
            _handlesEventOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/attributes.dmd");
            _handlesEventOBJ.setLineNumber("22");
            addAttributeDefList(_handlesEvent);

            AttributeDefinitionDMO _userDataTypeOBJ = new AttributeDefinitionDMO();
            _userDataType = new AttributeDefinition(_userDataTypeOBJ);
            _userDataTypeOBJ.setType("String");
            _userDataTypeOBJ.setName("userDataType");
            _userDataTypeOBJ.setDmdID("803");
            _userDataTypeOBJ.setDescription("Various interfaces allow for the specification of user data that gets passed through them. For instance, an MvwEvent might carry a data payload of an ArrayList<String> or, TreeMap<Integer,MyDataDMO> or whatever. This attribute lets you specify that data type information. You will use this in conjunction with the userDataImport attribute that lets you tell the MVW Generator what import statements it needs.");
            _userDataType.setDefinedIn(this);
            _userDataTypeOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/attributes.dmd");
            _userDataTypeOBJ.setLineNumber("33");
            addAttributeDefList(_userDataType);

            AttributeDefinitionDMO _userDataImportOBJ = new AttributeDefinitionDMO();
            _userDataImport = new AttributeDefinition(_userDataImportOBJ);
            _userDataImportOBJ.setType("String");
            _userDataImportOBJ.setName("userDataImport");
            _userDataImportOBJ.setDmdID("804");
            _userDataImportOBJ.setDescription("The additionalImport attribute indicates the fully qualified class names of types taht are required to support your userDataType indications. You need not explicitly indicate Java native types such as String, Integer etc. but you will have to specify things like java.util.TreeMap.");
            _userDataImportOBJ.setValueType("TREESET");
            _userDataImport.setDefinedIn(this);
            _userDataImportOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/attributes.dmd");
            _userDataImportOBJ.setLineNumber("43");
            addAttributeDefList(_userDataImport);

            AttributeDefinitionDMO _dependsOnMvwOBJ = new AttributeDefinitionDMO();
            _dependsOnMvw = new AttributeDefinition(_dependsOnMvwOBJ);
            _dependsOnMvwOBJ.setType("MvwConfig");
            _dependsOnMvwOBJ.setName("dependsOnMvw");
            _dependsOnMvwOBJ.setDmdID("805");
            _dependsOnMvwOBJ.setDescription("This attribute allows an MvwConfig to refer to other configurations on which it depends.");
            _dependsOnMvwOBJ.setValueType("MULTI");
            _dependsOnMvw.setDefinedIn(this);
            _dependsOnMvwOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/mvw/dmdconfig/v0dot1/attributes.dmd");
            _dependsOnMvwOBJ.setLineNumber("51");
            addAttributeDefList(_dependsOnMvw);

    }

    private void initTypes() throws DmcValueException {
    }

    private void initActions() throws DmcValueException {
    }

    private void initEnums() throws DmcValueException {
    }


    @Override
    public MvwSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

