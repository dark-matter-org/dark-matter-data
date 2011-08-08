package org.dmd.dmp.server.servlet.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmp.server.servlet.generated.dmo.DmpServerDMSAG;


/**
 * The DMP Server schema defines classes used to define plugins for the
 * reference implementation of the DMP based servlet.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:160)
 */
public class DmpServerSchemaAG extends SchemaDefinition {

    public static ClassDefinition _PluginConfig;
    public static ClassDefinition _UserFolderRI;
    public static ClassDefinition _UserRI;
    public static ClassDefinition _SessionFolderRI;
    public static ClassDefinition _SessionRI;

    public static AttributeDefinition _pluginName;
    public static AttributeDefinition _startOrder;
    public static AttributeDefinition _pluginClass;
    public static AttributeDefinition _useSchemaClass;
    public static AttributeDefinition _idRI;
    public static AttributeDefinition _sessionIDRI;
    public static AttributeDefinition _sessionHostRI;
    public static AttributeDefinition _userRefRI;
    public static AttributeDefinition _runnable;




    static DmpServerSchemaAG instance;

    public DmpServerSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG";

        dependsOnSchemaClasses.put("dmr.base","org.dmd.dmr.server.base.generated.DmrBaseSchemaAG");

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmp.server");
            me.setSchemaPackage("org.dmd.dmp.server.servlet");
            me.setDmwPackage("org.dmd.dmp.server.servlet");
            me.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/dmp.server.dms");


            me.addDependsOn("dmr.base");
            dependsOnSchemaClasses.put("dmr.base","org.dmd.dmr.server.base.generated.DmrBaseSchemaAG");


            initClasses();
            initAttributes();
            initTypes();
            initActions();
            initEnums();
            DmcOmni.instance().addCompactSchema(DmpServerDMSAG.instance());
        }
    }

    private void initClasses() throws DmcValueException {
            ClassDefinitionDMO _PluginConfigOBJ = new ClassDefinitionDMO();
            _PluginConfig = new ClassDefinition(_PluginConfigOBJ);
            _PluginConfigOBJ.setName("PluginConfig");
            _PluginConfigOBJ.setDmdID("701");
            _PluginConfigOBJ.setClassType("STRUCTURAL");
            _PluginConfigOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/classes.dmd");
            _PluginConfigOBJ.setLineNumber("17");
            _PluginConfigOBJ.setDescription("The PluginConfig is used to specify a plugin to be loaded into the DMP Servlet Reference Implementation servlet.");
            _PluginConfigOBJ.setIsNamedBy("camelCaseName");
            _PluginConfigOBJ.setUseWrapperType("EXTENDED");
            _PluginConfigOBJ.setDmtREFImport("org.dmd.dmp.server.servlet.generated.types.PluginConfigREF");
            _PluginConfigOBJ.setDmwIteratorClass("PluginConfigIterableDMW");
            _PluginConfigOBJ.addMay("startOrder");
            _PluginConfigOBJ.addMay("runnable");
            _PluginConfigOBJ.addMay("description");
            _PluginConfigOBJ.addMay("lineNumber");
            _PluginConfigOBJ.addMay("file");
            _PluginConfigOBJ.addMust("camelCaseName");
            _PluginConfigOBJ.addMust("pluginName");
            _PluginConfigOBJ.addMust("pluginClass");
            _PluginConfigOBJ.setDmwIteratorImport("org.dmd.dmp.server.servlet.generated.dmw.PluginConfigIterableDMW");
            _PluginConfig.setDefinedIn(this);
            addClassDefList(_PluginConfig);

            ClassDefinitionDMO _UserFolderRIOBJ = new ClassDefinitionDMO();
            _UserFolderRI = new ClassDefinition(_UserFolderRIOBJ);
            _UserFolderRIOBJ.setName("UserFolderRI");
            _UserFolderRIOBJ.setDmdID("702");
            _UserFolderRIOBJ.setClassType("STRUCTURAL");
            _UserFolderRIOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/classes.dmd");
            _UserFolderRIOBJ.setLineNumber("25");
            _UserFolderRIOBJ.setDescription("The UserFolderRI provides for a grouping of UserRI objects.");
            _UserFolderRIOBJ.setIsNamedBy("dotName");
            _UserFolderRIOBJ.setDmtREFImport("org.dmd.dmp.server.servlet.generated.types.UserFolderRIREF");
            _UserFolderRIOBJ.setDmwIteratorClass("UserFolderRIIterableDMW");
            _UserFolderRIOBJ.addMust("dotName");
            _UserFolderRIOBJ.setDmwIteratorImport("org.dmd.dmp.server.servlet.generated.dmw.UserFolderRIIterableDMW");
            _UserFolderRI.setDefinedIn(this);
            addClassDefList(_UserFolderRI);

            ClassDefinitionDMO _UserRIOBJ = new ClassDefinitionDMO();
            _UserRI = new ClassDefinition(_UserRIOBJ);
            _UserRIOBJ.setName("UserRI");
            _UserRIOBJ.setDmdID("703");
            _UserRIOBJ.setClassType("STRUCTURAL");
            _UserRIOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/classes.dmd");
            _UserRIOBJ.setLineNumber("38");
            _UserRIOBJ.setDescription("The UserRI class provides a user representation for use with the  Reference Implementation (RI).");
            _UserRIOBJ.setIsNamedBy("dotName");
            _UserRIOBJ.setDmtREFImport("org.dmd.dmp.server.servlet.generated.types.UserRIREF");
            _UserRIOBJ.setDmwIteratorClass("UserRIIterableDMW");
            _UserRIOBJ.addMust("dotName");
            _UserRIOBJ.addMust("idRI");
            _UserRIOBJ.addMust("userName");
            _UserRIOBJ.addMust("password");
            _UserRIOBJ.addAllowedParents("UserFolderRI");
            _UserRIOBJ.setDmwIteratorImport("org.dmd.dmp.server.servlet.generated.dmw.UserRIIterableDMW");
            _UserRI.setDefinedIn(this);
            addClassDefList(_UserRI);

            ClassDefinitionDMO _SessionFolderRIOBJ = new ClassDefinitionDMO();
            _SessionFolderRI = new ClassDefinition(_SessionFolderRIOBJ);
            _SessionFolderRIOBJ.setName("SessionFolderRI");
            _SessionFolderRIOBJ.setDmdID("704");
            _SessionFolderRIOBJ.setClassType("STRUCTURAL");
            _SessionFolderRIOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/classes.dmd");
            _SessionFolderRIOBJ.setLineNumber("46");
            _SessionFolderRIOBJ.setDescription("The SessionFolderRI provides for a grouping of SessionRI objects.");
            _SessionFolderRIOBJ.setIsNamedBy("dotName");
            _SessionFolderRIOBJ.setDmtREFImport("org.dmd.dmp.server.servlet.generated.types.SessionFolderRIREF");
            _SessionFolderRIOBJ.setDmwIteratorClass("SessionFolderRIIterableDMW");
            _SessionFolderRIOBJ.addMust("dotName");
            _SessionFolderRIOBJ.setDmwIteratorImport("org.dmd.dmp.server.servlet.generated.dmw.SessionFolderRIIterableDMW");
            _SessionFolderRI.setDefinedIn(this);
            addClassDefList(_SessionFolderRI);

            ClassDefinitionDMO _SessionRIOBJ = new ClassDefinitionDMO();
            _SessionRI = new ClassDefinition(_SessionRIOBJ);
            _SessionRIOBJ.setName("SessionRI");
            _SessionRIOBJ.setDmdID("705");
            _SessionRIOBJ.setClassType("STRUCTURAL");
            _SessionRIOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/classes.dmd");
            _SessionRIOBJ.setLineNumber("59");
            _SessionRIOBJ.setDescription("The SessionRI represents an authenticated user session.");
            _SessionRIOBJ.setIsNamedBy("dotName");
            _SessionRIOBJ.setUseWrapperType("EXTENDED");
            _SessionRIOBJ.setDmtREFImport("org.dmd.dmp.server.servlet.generated.types.SessionRIREF");
            _SessionRIOBJ.setDmwIteratorClass("SessionRIIterableDMW");
            _SessionRIOBJ.addMust("dotName");
            _SessionRIOBJ.addMust("sessionIDRI");
            _SessionRIOBJ.addMust("sessionHostRI");
            _SessionRIOBJ.addMust("userRefRI");
            _SessionRIOBJ.setDmwIteratorImport("org.dmd.dmp.server.servlet.generated.dmw.SessionRIIterableDMW");
            _SessionRIOBJ.addAllowedParents("SessionFolderRI");
            _SessionRI.setDefinedIn(this);
            addClassDefList(_SessionRI);

    }

    private void initAttributes() throws DmcValueException {
            AttributeDefinitionDMO _pluginNameOBJ = new AttributeDefinitionDMO();
            _pluginName = new AttributeDefinition(_pluginNameOBJ);
            _pluginNameOBJ.setType("CamelCaseName");
            _pluginNameOBJ.setName("pluginName");
            _pluginNameOBJ.setDmdID("701");
            _pluginNameOBJ.setDescription("The globally unique name of a Dark Matter ServletPlugin.");
            _pluginName.setDefinedIn(this);
            _pluginNameOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/attributes.dmd");
            _pluginNameOBJ.setLineNumber("6");
            addAttributeDefList(_pluginName);

            AttributeDefinitionDMO _startOrderOBJ = new AttributeDefinitionDMO();
            _startOrder = new AttributeDefinition(_startOrderOBJ);
            _startOrderOBJ.setType("Integer");
            _startOrderOBJ.setName("startOrder");
            _startOrderOBJ.setDmdID("702");
            _startOrderOBJ.setDescription("The order in which the plugins should be initialized and started. If no order is specified, we default to 5. If a plugin depends on data provided by another  plugin, it should have a later startOrder than the plugin it depends on.");
            _startOrderOBJ.setNullReturnValue("5");
            _startOrder.setDefinedIn(this);
            _startOrderOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/attributes.dmd");
            _startOrderOBJ.setLineNumber("15");
            addAttributeDefList(_startOrder);

            AttributeDefinitionDMO _pluginClassOBJ = new AttributeDefinitionDMO();
            _pluginClass = new AttributeDefinition(_pluginClassOBJ);
            _pluginClassOBJ.setType("String");
            _pluginClassOBJ.setName("pluginClass");
            _pluginClassOBJ.setDmdID("703");
            _pluginClassOBJ.setDescription("The fully qualified name of the class derived from DmpServletPlugin that implements a plugin's behaviour.");
            _pluginClass.setDefinedIn(this);
            _pluginClassOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/attributes.dmd");
            _pluginClassOBJ.setLineNumber("22");
            addAttributeDefList(_pluginClass);

            AttributeDefinitionDMO _useSchemaClassOBJ = new AttributeDefinitionDMO();
            _useSchemaClass = new AttributeDefinition(_useSchemaClassOBJ);
            _useSchemaClassOBJ.setType("String");
            _useSchemaClassOBJ.setName("useSchemaClass");
            _useSchemaClassOBJ.setDmdID("704");
            _useSchemaClassOBJ.setDescription("The fully qualified name of a schema class to be loaded on behalf of a plugin.");
            _useSchemaClassOBJ.setValueType("MULTI");
            _useSchemaClass.setDefinedIn(this);
            _useSchemaClassOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/attributes.dmd");
            _useSchemaClassOBJ.setLineNumber("30");
            addAttributeDefList(_useSchemaClass);

            AttributeDefinitionDMO _idRIOBJ = new AttributeDefinitionDMO();
            _idRI = new AttributeDefinition(_idRIOBJ);
            _idRIOBJ.setType("Integer");
            _idRIOBJ.setName("idRI");
            _idRIOBJ.setDmdID("705");
            _idRIOBJ.setDescription("The unique id for the instance of something associated with the Reference Implementation (RI).");
            _idRI.setDefinedIn(this);
            _idRIOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/attributes.dmd");
            _idRIOBJ.setLineNumber("36");
            addAttributeDefList(_idRI);

            AttributeDefinitionDMO _sessionIDRIOBJ = new AttributeDefinitionDMO();
            _sessionIDRI = new AttributeDefinition(_sessionIDRIOBJ);
            _sessionIDRIOBJ.setType("String");
            _sessionIDRIOBJ.setName("sessionIDRI");
            _sessionIDRIOBJ.setDmdID("706");
            _sessionIDRIOBJ.setDescription("The Tomcat unique session identifer.");
            _sessionIDRI.setDefinedIn(this);
            _sessionIDRIOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/attributes.dmd");
            _sessionIDRIOBJ.setLineNumber("42");
            addAttributeDefList(_sessionIDRI);

            AttributeDefinitionDMO _sessionHostRIOBJ = new AttributeDefinitionDMO();
            _sessionHostRI = new AttributeDefinition(_sessionHostRIOBJ);
            _sessionHostRIOBJ.setType("String");
            _sessionHostRIOBJ.setName("sessionHostRI");
            _sessionHostRIOBJ.setDmdID("707");
            _sessionHostRIOBJ.setDescription("The name of the host associated with a session.");
            _sessionHostRI.setDefinedIn(this);
            _sessionHostRIOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/attributes.dmd");
            _sessionHostRIOBJ.setLineNumber("48");
            addAttributeDefList(_sessionHostRI);

            AttributeDefinitionDMO _userRefRIOBJ = new AttributeDefinitionDMO();
            _userRefRI = new AttributeDefinition(_userRefRIOBJ);
            _userRefRIOBJ.setType("UserRI");
            _userRefRIOBJ.setName("userRefRI");
            _userRefRIOBJ.setDmdID("708");
            _userRefRIOBJ.setDescription("The user associated with a session.");
            _userRefRI.setDefinedIn(this);
            _userRefRIOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/attributes.dmd");
            _userRefRIOBJ.setLineNumber("54");
            addAttributeDefList(_userRefRI);

            AttributeDefinitionDMO _runnableOBJ = new AttributeDefinitionDMO();
            _runnable = new AttributeDefinition(_runnableOBJ);
            _runnableOBJ.setType("Boolean");
            _runnableOBJ.setName("runnable");
            _runnableOBJ.setDmdID("709");
            _runnableOBJ.setDescription("A flag to indicate if a plugin implements Runnable. If so, once all plugins have been initialized, the runnable plugins will be started.");
            _runnable.setDefinedIn(this);
            _runnableOBJ.setFile("C:/Dev/controller/dark-matter-data/src/org/dmd/dmp/server/servlet/dmdconfig/attributes.dmd");
            _runnableOBJ.setLineNumber("61");
            addAttributeDefList(_runnable);

    }

    private void initTypes() throws DmcValueException {
    }

    private void initActions() throws DmcValueException {
    }

    private void initEnums() throws DmcValueException {
    }


    @Override
    public synchronized DmpServerSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

