package org.dmd.features.extgwt.generated;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;


public class ExtgwtSchemaAG extends SchemaDefinition {

    public static ClassDefinition _MvcDefinition;
    public static ClassDefinition _MvcConfig;
    public static ClassDefinition _MvcEvent;
    public static ClassDefinition _MvcServerEvent;
    public static ClassDefinition _MvcApplication;
    public static ClassDefinition _MvcController;
    public static ClassDefinition _MvcView;
    public static ClassDefinition _MvcRegistryItem;
    public static ClassDefinition _MvcAction;
    public static ClassDefinition _MvcMenu;
    public static ClassDefinition _MvcMenuBar;
    public static ClassDefinition _MvcToolBar;
    public static ClassDefinition _MvcSubMenu;
    public static ClassDefinition _MvcPopupMenu;
    public static ClassDefinition _MvcMenuItem;

    public static AttributeDefinition _dependsOnMVC;
    public static AttributeDefinition _definesEvent;
    public static AttributeDefinition _handlesEvent;
    public static AttributeDefinition _dispatchesEvent;
    public static AttributeDefinition _definedBy;
    public static AttributeDefinition _emittedBy;
    public static AttributeDefinition _handledBy;
    public static AttributeDefinition _controllers;
    public static AttributeDefinition _userDataType;
    public static AttributeDefinition _eventDataType;
    public static AttributeDefinition _handlesServerEvent;
    public static AttributeDefinition _createsRegistryItem;
    public static AttributeDefinition _usesRegistryItem;
    public static AttributeDefinition _prefix;
    public static AttributeDefinition _controlsView;
    public static AttributeDefinition _definedInMVCConfig;
    public static AttributeDefinition _isHistoryEvent;
    public static AttributeDefinition _parentController;
    public static AttributeDefinition _firesEvent;
    public static AttributeDefinition _userDataCollection;
    public static AttributeDefinition _userDataGenericSpec;
    public static AttributeDefinition _startEvents;
    public static AttributeDefinition _addToMenu;
    public static AttributeDefinition _separatorBefore;
    public static AttributeDefinition _alwaysEnabled;
    public static AttributeDefinition _menuOrder;
    public static AttributeDefinition _triggersAction;
    public static AttributeDefinition _definesAction;
    public static AttributeDefinition _definesMenu;
    public static AttributeDefinition _definesMenuItem;
    public static AttributeDefinition _associatedController;
    public static AttributeDefinition _useForModelClass;
    public static AttributeDefinition _displayLabel;
    public static AttributeDefinition _customRender;

    static ExtgwtSchemaAG instance;

    public ExtgwtSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.features.extgwt.generated.ExtgwtSchemaAG";

        dependsOnSchemaClasses.put("dmg","null.generated.DmgSchemaAG");

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("extgwt");
            me.setSchemaPackage("org.dmd.features.extgwt");
            me.setDmwPackage("org.dmd.features.extgwt");
            me.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/extgwt.dms");


            me.addDependsOn("dmg");
            dependsOnSchemaClasses.put("dmg","null.generated.DmgSchemaAG");


            ClassDefinitionDMO _MvcDefinitionOBJ = new ClassDefinitionDMO();
            _MvcDefinition = new ClassDefinition(_MvcDefinitionOBJ);
            _MvcDefinitionOBJ.setClassType("ABSTRACT");
            _MvcDefinition.setDefinedIn(this);
            _MvcDefinitionOBJ.setDescription("The MvcDefinition class provide a common base for all MVC definition classes.");
            _MvcDefinitionOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcDefinitionOBJ.setIsNamedBy("name");
            _MvcDefinitionOBJ.setLineNumber("15");
            _MvcDefinitionOBJ.addMay("file");
            _MvcDefinitionOBJ.addMay("lineNumber");
            _MvcDefinitionOBJ.addMay("description");
            _MvcDefinitionOBJ.addMust("name");
            _MvcDefinitionOBJ.addMust("definedInMVCConfig");
            _MvcDefinitionOBJ.setName("MvcDefinition");
            _MvcDefinitionOBJ.addObjectClass("ClassDefinition");
            _MvcDefinitionOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcDefinition);

            ClassDefinitionDMO _MvcConfigOBJ = new ClassDefinitionDMO();
            _MvcConfig = new ClassDefinition(_MvcConfigOBJ);
            _MvcConfigOBJ.setClassType("STRUCTURAL");
            _MvcConfig.setDefinedIn(this);
            _MvcConfigOBJ.setDerivedFrom("MvcDefinition");
            _MvcConfigOBJ.setDescription("The MvcConfig class is stored in a file with a .mvc suffix and used to define the set of files that hold the definitions of MvcEvents, MvcControllers and MvcViews. Based on the definition of these objects, we can generate base classes for the com.extjs.gxt.ui.client.mvc.Controller and com.extjs.gxt.ui.client.mvc.View that provide some common code required by these classes.");
            _MvcConfigOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcConfigOBJ.setIsNamedBy("name");
            _MvcConfigOBJ.setLineNumber("30");
            _MvcConfigOBJ.addMay("dependsOnMVC");
            _MvcConfigOBJ.addMust("name");
            _MvcConfigOBJ.addMust("genPackage");
            _MvcConfigOBJ.setName("MvcConfig");
            _MvcConfigOBJ.addObjectClass("ClassDefinition");
            _MvcConfigOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcConfig);

            ClassDefinitionDMO _MvcEventOBJ = new ClassDefinitionDMO();
            _MvcEvent = new ClassDefinition(_MvcEventOBJ);
            _MvcEventOBJ.setClassType("STRUCTURAL");
            _MvcEvent.setDefinedIn(this);
            _MvcEventOBJ.setDerivedFrom("MvcDefinition");
            _MvcEventOBJ.setDescription("The MvcEvent class allows for the definition of events that are  handled or emitted by Views and Controllers. By providing a description, you help to document your application.");
            _MvcEventOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcEventOBJ.setIsNamedBy("name");
            _MvcEventOBJ.setLineNumber("51");
            _MvcEventOBJ.addMay("description");
            _MvcEventOBJ.addMay("userDataType");
            _MvcEventOBJ.addMay("isHistoryEvent");
            _MvcEventOBJ.addMay("userDataCollection");
            _MvcEventOBJ.addMay("userDataGenericSpec");
            _MvcEventOBJ.addMay("emittedBy");
            _MvcEventOBJ.addMay("upperConstantName");
            _MvcEventOBJ.addMust("name");
            _MvcEventOBJ.addMust("definedBy");
            _MvcEventOBJ.setName("MvcEvent");
            _MvcEventOBJ.addObjectClass("ClassDefinition");
            _MvcEventOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcEvent);

            ClassDefinitionDMO _MvcServerEventOBJ = new ClassDefinitionDMO();
            _MvcServerEvent = new ClassDefinition(_MvcServerEventOBJ);
            _MvcServerEventOBJ.setClassType("STRUCTURAL");
            _MvcServerEvent.setDefinedIn(this);
            _MvcServerEventOBJ.setDerivedFrom("MvcDefinition");
            _MvcServerEventOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcServerEventOBJ.setIsNamedBy("name");
            _MvcServerEventOBJ.setLineNumber("63");
            _MvcServerEventOBJ.addMay("description");
            _MvcServerEventOBJ.addMust("name");
            _MvcServerEventOBJ.addMust("eventDataType");
            _MvcServerEventOBJ.setName("MvcServerEvent");
            _MvcServerEventOBJ.addObjectClass("ClassDefinition");
            _MvcServerEventOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcServerEvent);

            ClassDefinitionDMO _MvcApplicationOBJ = new ClassDefinitionDMO();
            _MvcApplication = new ClassDefinition(_MvcApplicationOBJ);
            _MvcApplicationOBJ.setClassType("STRUCTURAL");
            _MvcApplication.setDefinedIn(this);
            _MvcApplicationOBJ.setDerivedFrom("MvcDefinition");
            _MvcApplicationOBJ.setDescription("The MvcApplication class allows for the definition of an application that makes uses of the ExtGWT MVC framework.");
            _MvcApplicationOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcApplicationOBJ.setIsNamedBy("name");
            _MvcApplicationOBJ.setLineNumber("77");
            _MvcApplicationOBJ.addMay("definesEvent");
            _MvcApplicationOBJ.addMust("name");
            _MvcApplicationOBJ.addMust("controllers");
            _MvcApplicationOBJ.addMust("prefix");
            _MvcApplicationOBJ.addMust("startEvents");
            _MvcApplicationOBJ.setName("MvcApplication");
            _MvcApplicationOBJ.addObjectClass("ClassDefinition");
            _MvcApplicationOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcApplication);

            ClassDefinitionDMO _MvcControllerOBJ = new ClassDefinitionDMO();
            _MvcController = new ClassDefinition(_MvcControllerOBJ);
            _MvcControllerOBJ.setClassType("STRUCTURAL");
            _MvcController.setDefinedIn(this);
            _MvcControllerOBJ.setDerivedFrom("MvcDefinition");
            _MvcControllerOBJ.setDescription("The MvcController class allows for the definition of controllers. The abstract controller generated by this definition will automatically register for the events you specify via the handlesEvent attribute. Likewise, it will have a standard handleEvent() method that forwards typed events to abstract handler functions that you'll have to write. <P> The definesEvent is populated automatically by the MVC generator based on what event names start with the controllers prefix i.e. app.init is assumed to be defined by the controller whose prefix is app.");
            _MvcControllerOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcControllerOBJ.setIsNamedBy("name");
            _MvcControllerOBJ.setLineNumber("107");
            _MvcControllerOBJ.addMay("controlsView");
            _MvcControllerOBJ.addMay("handlesEvent");
            _MvcControllerOBJ.addMay("handlesServerEvent");
            _MvcControllerOBJ.addMay("dispatchesEvent");
            _MvcControllerOBJ.addMay("usesRegistryItem");
            _MvcControllerOBJ.addMay("createsRegistryItem");
            _MvcControllerOBJ.addMay("parentController");
            _MvcControllerOBJ.addMay("definesEvent");
            _MvcControllerOBJ.addMay("definesAction");
            _MvcControllerOBJ.addMay("definesMenu");
            _MvcControllerOBJ.addMay("definesMenuItem");
            _MvcControllerOBJ.addMust("name");
            _MvcControllerOBJ.addMust("prefix");
            _MvcControllerOBJ.setName("MvcController");
            _MvcControllerOBJ.addObjectClass("ClassDefinition");
            _MvcControllerOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcController);

            ClassDefinitionDMO _MvcViewOBJ = new ClassDefinitionDMO();
            _MvcView = new ClassDefinition(_MvcViewOBJ);
            _MvcViewOBJ.setClassType("STRUCTURAL");
            _MvcView.setDefinedIn(this);
            _MvcViewOBJ.setDerivedFrom("MvcDefinition");
            _MvcViewOBJ.setDescription("The MvcView class allows for the definition of views.");
            _MvcViewOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcViewOBJ.setIsNamedBy("name");
            _MvcViewOBJ.setLineNumber("123");
            _MvcViewOBJ.addMay("handlesEvent");
            _MvcViewOBJ.addMay("handlesServerEvent");
            _MvcViewOBJ.addMay("firesEvent");
            _MvcViewOBJ.addMay("dispatchesEvent");
            _MvcViewOBJ.addMay("usesRegistryItem");
            _MvcViewOBJ.addMay("createsRegistryItem");
            _MvcViewOBJ.addMay("description");
            _MvcViewOBJ.addMust("name");
            _MvcViewOBJ.setName("MvcView");
            _MvcViewOBJ.addObjectClass("ClassDefinition");
            _MvcViewOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcView);

            ClassDefinitionDMO _MvcRegistryItemOBJ = new ClassDefinitionDMO();
            _MvcRegistryItem = new ClassDefinition(_MvcRegistryItemOBJ);
            _MvcRegistryItemOBJ.setClassType("STRUCTURAL");
            _MvcRegistryItem.setDefinedIn(this);
            _MvcRegistryItemOBJ.setDerivedFrom("MvcDefinition");
            _MvcRegistryItemOBJ.setDescription("The MvcRegistryItem defines something that's stored in the Registry.");
            _MvcRegistryItemOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcRegistryItemOBJ.setIsNamedBy("name");
            _MvcRegistryItemOBJ.setLineNumber("137");
            _MvcRegistryItemOBJ.addMay("userDataCollection");
            _MvcRegistryItemOBJ.addMay("userDataGenericSpec");
            _MvcRegistryItemOBJ.addMay("description");
            _MvcRegistryItemOBJ.addMust("name");
            _MvcRegistryItemOBJ.addMust("userDataType");
            _MvcRegistryItemOBJ.setName("MvcRegistryItem");
            _MvcRegistryItemOBJ.addObjectClass("ClassDefinition");
            _MvcRegistryItemOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcRegistryItem);

            ClassDefinitionDMO _MvcActionOBJ = new ClassDefinitionDMO();
            _MvcAction = new ClassDefinition(_MvcActionOBJ);
            _MvcActionOBJ.setClassType("STRUCTURAL");
            _MvcAction.setDefinedIn(this);
            _MvcActionOBJ.setDerivedFrom("MvcDefinition");
            _MvcActionOBJ.setDescription("The MvcAction class allows for the definition of behaviour that can be associated with menus, buttons and other UI components. Actions are associated with controllers so that they can be informed of events in which they're interested, since only controllers can register for events. Actions may be defined and used by  menu items defined in other Controllers.");
            _MvcActionOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcActionOBJ.setIsNamedBy("name");
            _MvcActionOBJ.setLineNumber("154");
            _MvcActionOBJ.addMay("handlesEvent");
            _MvcActionOBJ.addMust("name");
            _MvcActionOBJ.addMust("associatedController");
            _MvcActionOBJ.setName("MvcAction");
            _MvcActionOBJ.addObjectClass("ClassDefinition");
            _MvcActionOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcAction);

            ClassDefinitionDMO _MvcMenuOBJ = new ClassDefinitionDMO();
            _MvcMenu = new ClassDefinition(_MvcMenuOBJ);
            _MvcMenuOBJ.setClassType("ABSTRACT");
            _MvcMenu.setDefinedIn(this);
            _MvcMenuOBJ.setDerivedFrom("MvcDefinition");
            _MvcMenuOBJ.setDescription("The MvcMenu");
            _MvcMenuOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcMenuOBJ.setIsNamedBy("name");
            _MvcMenuOBJ.setLineNumber("165");
            _MvcMenuOBJ.addMay("customRender");
            _MvcMenuOBJ.addMust("name");
            _MvcMenuOBJ.addMust("associatedController");
            _MvcMenuOBJ.setName("MvcMenu");
            _MvcMenuOBJ.addObjectClass("ClassDefinition");
            _MvcMenuOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcMenu);

            ClassDefinitionDMO _MvcMenuBarOBJ = new ClassDefinitionDMO();
            _MvcMenuBar = new ClassDefinition(_MvcMenuBarOBJ);
            _MvcMenuBarOBJ.setClassType("STRUCTURAL");
            _MvcMenuBar.setDefinedIn(this);
            _MvcMenuBarOBJ.setDerivedFrom("MvcMenu");
            _MvcMenuBarOBJ.setDescription("The MvcMenuBar class represents a toplevel menubar and aligns to the  com.extjs.gxt.ui.client.widget.menu.MenuBar class.");
            _MvcMenuBarOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcMenuBarOBJ.setIsNamedBy("name");
            _MvcMenuBarOBJ.setLineNumber("175");
            _MvcMenuBarOBJ.addMust("name");
            _MvcMenuBarOBJ.setName("MvcMenuBar");
            _MvcMenuBarOBJ.addObjectClass("ClassDefinition");
            _MvcMenuBarOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcMenuBar);

            ClassDefinitionDMO _MvcToolBarOBJ = new ClassDefinitionDMO();
            _MvcToolBar = new ClassDefinition(_MvcToolBarOBJ);
            _MvcToolBarOBJ.setClassType("STRUCTURAL");
            _MvcToolBar.setDefinedIn(this);
            _MvcToolBarOBJ.setDerivedFrom("MvcMenu");
            _MvcToolBarOBJ.setDescription("The MvcToolBar class represents a top level toolbar and aligns to the com.extjs.gxt.ui.client.widget.toolbar.ToolBar class.");
            _MvcToolBarOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcToolBarOBJ.setIsNamedBy("name");
            _MvcToolBarOBJ.setLineNumber("185");
            _MvcToolBarOBJ.addMust("name");
            _MvcToolBarOBJ.setName("MvcToolBar");
            _MvcToolBarOBJ.addObjectClass("ClassDefinition");
            _MvcToolBarOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcToolBar);

            ClassDefinitionDMO _MvcSubMenuOBJ = new ClassDefinitionDMO();
            _MvcSubMenu = new ClassDefinition(_MvcSubMenuOBJ);
            _MvcSubMenuOBJ.setClassType("STRUCTURAL");
            _MvcSubMenu.setDefinedIn(this);
            _MvcSubMenuOBJ.setDerivedFrom("MvcMenu");
            _MvcSubMenuOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcSubMenuOBJ.setIsNamedBy("name");
            _MvcSubMenuOBJ.setLineNumber("196");
            _MvcSubMenuOBJ.addMay("displayLabel");
            _MvcSubMenuOBJ.addMust("name");
            _MvcSubMenuOBJ.addMust("addToMenu");
            _MvcSubMenuOBJ.addMust("menuOrder");
            _MvcSubMenuOBJ.setName("MvcSubMenu");
            _MvcSubMenuOBJ.addObjectClass("ClassDefinition");
            _MvcSubMenuOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcSubMenu);

            ClassDefinitionDMO _MvcPopupMenuOBJ = new ClassDefinitionDMO();
            _MvcPopupMenu = new ClassDefinition(_MvcPopupMenuOBJ);
            _MvcPopupMenuOBJ.setClassType("STRUCTURAL");
            _MvcPopupMenu.setDefinedIn(this);
            _MvcPopupMenuOBJ.setDerivedFrom("MvcMenu");
            _MvcPopupMenuOBJ.setDescription("The MvcPopupMenu class is meant to allow for the definition of menus that can be popped up on a variety components, for instance tree nodes and table rows. Although implemented as standard com.extjs.gxt.ui.client.widget.menu.Menu instances, the display of popup menus is controlled by the MenuController infrastructure.");
            _MvcPopupMenuOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcPopupMenuOBJ.setIsNamedBy("name");
            _MvcPopupMenuOBJ.setLineNumber("209");
            _MvcPopupMenuOBJ.addMust("name");
            _MvcPopupMenuOBJ.addMust("useForModelClass");
            _MvcPopupMenuOBJ.setName("MvcPopupMenu");
            _MvcPopupMenuOBJ.addObjectClass("ClassDefinition");
            _MvcPopupMenuOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcPopupMenu);

            ClassDefinitionDMO _MvcMenuItemOBJ = new ClassDefinitionDMO();
            _MvcMenuItem = new ClassDefinition(_MvcMenuItemOBJ);
            _MvcMenuItemOBJ.setClassType("STRUCTURAL");
            _MvcMenuItem.setDefinedIn(this);
            _MvcMenuItemOBJ.setDerivedFrom("MvcDefinition");
            _MvcMenuItemOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/classes.dmd");
            _MvcMenuItemOBJ.setIsNamedBy("name");
            _MvcMenuItemOBJ.setLineNumber("223");
            _MvcMenuItemOBJ.addMay("displayLabel");
            _MvcMenuItemOBJ.addMay("customRender");
            _MvcMenuItemOBJ.addMust("name");
            _MvcMenuItemOBJ.addMust("triggersAction");
            _MvcMenuItemOBJ.addMust("addToMenu");
            _MvcMenuItemOBJ.addMust("associatedController");
            _MvcMenuItemOBJ.addMust("menuOrder");
            _MvcMenuItemOBJ.setName("MvcMenuItem");
            _MvcMenuItemOBJ.addObjectClass("ClassDefinition");
            _MvcMenuItemOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MvcMenuItem);


            AttributeDefinitionDMO _dependsOnMVCOBJ = new AttributeDefinitionDMO();
            _dependsOnMVC = new AttributeDefinition(_dependsOnMVCOBJ);
            _dependsOnMVC.setDefinedIn(this);
            _dependsOnMVCOBJ.setDescription("This attribute allows and MvcConfig to refer to other configurations on which it depends.");
            _dependsOnMVCOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _dependsOnMVCOBJ.setIsMultiValued("true");
            _dependsOnMVCOBJ.setLineNumber("7");
            _dependsOnMVCOBJ.setName("dependsOnMVC");
            _dependsOnMVCOBJ.addObjectClass("AttributeDefinition");
            _dependsOnMVCOBJ.setType("MvcConfig");
            addAttributeDefList(_dependsOnMVC);

            AttributeDefinitionDMO _definesEventOBJ = new AttributeDefinitionDMO();
            _definesEvent = new AttributeDefinition(_definesEventOBJ);
            _definesEvent.setDefinedIn(this);
            _definesEventOBJ.setDescription("This attributes holds a list of MvcEvent names that are defined by MvcControllers. A particular event must be defined only once; but it can be emitted and handled by many different components.");
            _definesEventOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _definesEventOBJ.setIsMultiValued("true");
            _definesEventOBJ.setLineNumber("15");
            _definesEventOBJ.setName("definesEvent");
            _definesEventOBJ.addObjectClass("AttributeDefinition");
            _definesEventOBJ.setType("MvcEvent");
            addAttributeDefList(_definesEvent);

            AttributeDefinitionDMO _handlesEventOBJ = new AttributeDefinitionDMO();
            _handlesEvent = new AttributeDefinition(_handlesEventOBJ);
            _handlesEvent.setDefinedIn(this);
            _handlesEventOBJ.setDescription("This attributes holds a list of MvcEvent names that are handled by MvcControllers or MvcViews. A global list of these names is created and used to generate the AppEvents class.");
            _handlesEventOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _handlesEventOBJ.setIsMultiValued("true");
            _handlesEventOBJ.setLineNumber("23");
            _handlesEventOBJ.setName("handlesEvent");
            _handlesEventOBJ.addObjectClass("AttributeDefinition");
            _handlesEventOBJ.setType("MvcEvent");
            addAttributeDefList(_handlesEvent);

            AttributeDefinitionDMO _dispatchesEventOBJ = new AttributeDefinitionDMO();
            _dispatchesEvent = new AttributeDefinition(_dispatchesEventOBJ);
            _dispatchesEvent.setDefinedIn(this);
            _dispatchesEventOBJ.setDescription("Indicates that the controller or view sends the event to the Dispatcher.");
            _dispatchesEventOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _dispatchesEventOBJ.setIsMultiValued("true");
            _dispatchesEventOBJ.setLineNumber("29");
            _dispatchesEventOBJ.setName("dispatchesEvent");
            _dispatchesEventOBJ.addObjectClass("AttributeDefinition");
            _dispatchesEventOBJ.setType("MvcEvent");
            addAttributeDefList(_dispatchesEvent);

            AttributeDefinitionDMO _definedByOBJ = new AttributeDefinitionDMO();
            _definedBy = new AttributeDefinition(_definedByOBJ);
            _definedBy.setDefinedIn(this);
            _definedByOBJ.setDescription("This attribute indicates which controller defines an event.");
            _definedByOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _definedByOBJ.setIsMultiValued("true");
            _definedByOBJ.setLineNumber("35");
            _definedByOBJ.setName("definedBy");
            _definedByOBJ.addObjectClass("AttributeDefinition");
            _definedByOBJ.setType("String");
            addAttributeDefList(_definedBy);

            AttributeDefinitionDMO _emittedByOBJ = new AttributeDefinitionDMO();
            _emittedBy = new AttributeDefinition(_emittedByOBJ);
            _emittedBy.setDefinedIn(this);
            _emittedByOBJ.setDescription("This attribute is populated automatically on MvcEvent objects as the MVC definitions are read. Any MvcController or MvcView that emits an event will be added to this attribute. This helps with documentation.");
            _emittedByOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _emittedByOBJ.setIsMultiValued("true");
            _emittedByOBJ.setLineNumber("43");
            _emittedByOBJ.setName("emittedBy");
            _emittedByOBJ.addObjectClass("AttributeDefinition");
            _emittedByOBJ.setType("String");
            addAttributeDefList(_emittedBy);

            AttributeDefinitionDMO _handledByOBJ = new AttributeDefinitionDMO();
            _handledBy = new AttributeDefinition(_handledByOBJ);
            _handledBy.setDefinedIn(this);
            _handledByOBJ.setDescription("This attribute is populated automatically on MvcEvent objects as the MVC definitions are read. Any MvcController or MvcView that handles an event will be added to this attribute. This helps with documentation.");
            _handledByOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _handledByOBJ.setIsMultiValued("true");
            _handledByOBJ.setLineNumber("51");
            _handledByOBJ.setName("handledBy");
            _handledByOBJ.addObjectClass("AttributeDefinition");
            _handledByOBJ.setType("String");
            addAttributeDefList(_handledBy);

            AttributeDefinitionDMO _controllersOBJ = new AttributeDefinitionDMO();
            _controllers = new AttributeDefinition(_controllersOBJ);
            _controllers.setDefinedIn(this);
            _controllersOBJ.setDescription("The controllers attribute refers to MvcControllers that comprise an  MvcApplication.");
            _controllersOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _controllersOBJ.setIsMultiValued("true");
            _controllersOBJ.setLineNumber("58");
            _controllersOBJ.setName("controllers");
            _controllersOBJ.addObjectClass("AttributeDefinition");
            _controllersOBJ.setType("MvcController");
            addAttributeDefList(_controllers);

            AttributeDefinitionDMO _userDataTypeOBJ = new AttributeDefinitionDMO();
            _userDataType = new AttributeDefinition(_userDataTypeOBJ);
            _userDataType.setDefinedIn(this);
            _userDataTypeOBJ.setDescription("In ExtGWT, Events can also have user data associated with them. That is, you would call Dispatcher.forwardEvent(AppEvents.Init,someuserData). By specifying  eventDataType, the Dark Matter Generator will create appropriately typed convenience functions to forward and receive the event and its user data. The value for this  attribute should be the fully qualified name of the class you're passing with the event. <P> This attribute is also used when specified the data type of an MvcRegistryItem");
            _userDataTypeOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _userDataTypeOBJ.setLineNumber("79");
            _userDataTypeOBJ.setName("userDataType");
            _userDataTypeOBJ.addObjectClass("AttributeDefinition");
            _userDataTypeOBJ.setType("String");
            addAttributeDefList(_userDataType);

            AttributeDefinitionDMO _eventDataTypeOBJ = new AttributeDefinitionDMO();
            _eventDataType = new AttributeDefinition(_eventDataTypeOBJ);
            _eventDataType.setDefinedIn(this);
            _eventDataTypeOBJ.setDescription("The fully qualified name of the class that a particular server event contains. The class must be an auto generated DMO.");
            _eventDataTypeOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _eventDataTypeOBJ.setLineNumber("85");
            _eventDataTypeOBJ.setName("eventDataType");
            _eventDataTypeOBJ.addObjectClass("AttributeDefinition");
            _eventDataTypeOBJ.setType("String");
            addAttributeDefList(_eventDataType);

            AttributeDefinitionDMO _handlesServerEventOBJ = new AttributeDefinitionDMO();
            _handlesServerEvent = new AttributeDefinition(_handlesServerEventOBJ);
            _handlesServerEvent.setDefinedIn(this);
            _handlesServerEventOBJ.setDescription("This attributes holds a list of MvcServerEvent names that are handled by MvcControllers or MvcViews. Controllers and Views that handle server events are automatically registered with the DMMVCEventController and are called when they're interested in are received.");
            _handlesServerEventOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _handlesServerEventOBJ.setIsMultiValued("true");
            _handlesServerEventOBJ.setLineNumber("94");
            _handlesServerEventOBJ.setName("handlesServerEvent");
            _handlesServerEventOBJ.addObjectClass("AttributeDefinition");
            _handlesServerEventOBJ.setType("MvcServerEvent");
            addAttributeDefList(_handlesServerEvent);

            AttributeDefinitionDMO _createsRegistryItemOBJ = new AttributeDefinitionDMO();
            _createsRegistryItem = new AttributeDefinition(_createsRegistryItemOBJ);
            _createsRegistryItem.setDefinedIn(this);
            _createsRegistryItemOBJ.setDescription("A reference to a registry item that is created by a controller or view.");
            _createsRegistryItemOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _createsRegistryItemOBJ.setIsMultiValued("true");
            _createsRegistryItemOBJ.setLineNumber("100");
            _createsRegistryItemOBJ.setName("createsRegistryItem");
            _createsRegistryItemOBJ.addObjectClass("AttributeDefinition");
            _createsRegistryItemOBJ.setType("MvcRegistryItem");
            addAttributeDefList(_createsRegistryItem);

            AttributeDefinitionDMO _usesRegistryItemOBJ = new AttributeDefinitionDMO();
            _usesRegistryItem = new AttributeDefinition(_usesRegistryItemOBJ);
            _usesRegistryItem.setDefinedIn(this);
            _usesRegistryItemOBJ.setDescription("A reference to a registry item used by a controller or view.");
            _usesRegistryItemOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _usesRegistryItemOBJ.setIsMultiValued("true");
            _usesRegistryItemOBJ.setLineNumber("106");
            _usesRegistryItemOBJ.setName("usesRegistryItem");
            _usesRegistryItemOBJ.addObjectClass("AttributeDefinition");
            _usesRegistryItemOBJ.setType("MvcRegistryItem");
            addAttributeDefList(_usesRegistryItem);

            AttributeDefinitionDMO _prefixOBJ = new AttributeDefinitionDMO();
            _prefix = new AttributeDefinition(_prefixOBJ);
            _prefix.setDefinedIn(this);
            _prefixOBJ.setDescription("This attribute defines a prefix used by the overall application or a controller to indicate the events or registry items that belong to it.");
            _prefixOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _prefixOBJ.setLineNumber("112");
            _prefixOBJ.setName("prefix");
            _prefixOBJ.addObjectClass("AttributeDefinition");
            _prefixOBJ.setType("String");
            addAttributeDefList(_prefix);

            AttributeDefinitionDMO _controlsViewOBJ = new AttributeDefinitionDMO();
            _controlsView = new AttributeDefinition(_controlsViewOBJ);
            _controlsView.setDefinedIn(this);
            _controlsViewOBJ.setDescription("Indicates a MvcView that is controlled by an MvcController");
            _controlsViewOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _controlsViewOBJ.setIsMultiValued("true");
            _controlsViewOBJ.setLineNumber("118");
            _controlsViewOBJ.setName("controlsView");
            _controlsViewOBJ.addObjectClass("AttributeDefinition");
            _controlsViewOBJ.setType("MvcView");
            addAttributeDefList(_controlsView);

            AttributeDefinitionDMO _definedInMVCConfigOBJ = new AttributeDefinitionDMO();
            _definedInMVCConfig = new AttributeDefinition(_definedInMVCConfigOBJ);
            _definedInMVCConfig.setDefinedIn(this);
            _definedInMVCConfigOBJ.setDescription("All MvcControllers have to know what config they were defined in so that when the overall application is built, the MvcApplication knows how to instantiate the controllers that make up the application.");
            _definedInMVCConfigOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _definedInMVCConfigOBJ.setLineNumber("125");
            _definedInMVCConfigOBJ.setName("definedInMVCConfig");
            _definedInMVCConfigOBJ.addObjectClass("AttributeDefinition");
            _definedInMVCConfigOBJ.setType("MvcConfig");
            addAttributeDefList(_definedInMVCConfig);

            AttributeDefinitionDMO _isHistoryEventOBJ = new AttributeDefinitionDMO();
            _isHistoryEvent = new AttributeDefinition(_isHistoryEventOBJ);
            _isHistoryEvent.setDefinedIn(this);
            _isHistoryEventOBJ.setDescription("When set to true for an MvcEvent, the event is flagged as a history event within the Dispatcher.");
            _isHistoryEventOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _isHistoryEventOBJ.setLineNumber("131");
            _isHistoryEventOBJ.setName("isHistoryEvent");
            _isHistoryEventOBJ.addObjectClass("AttributeDefinition");
            _isHistoryEventOBJ.setType("Boolean");
            addAttributeDefList(_isHistoryEvent);

            AttributeDefinitionDMO _parentControllerOBJ = new AttributeDefinitionDMO();
            _parentController = new AttributeDefinition(_parentControllerOBJ);
            _parentController.setDefinedIn(this);
            _parentControllerOBJ.setDescription("Controllers can be arranged in a hierarchy. If you want to create that  hierarchy, simply indicate which MvcController is to be your parent. The MVC generation framework will take care of instantiating the controllers in the appropriate order.");
            _parentControllerOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _parentControllerOBJ.setLineNumber("138");
            _parentControllerOBJ.setName("parentController");
            _parentControllerOBJ.addObjectClass("AttributeDefinition");
            _parentControllerOBJ.setType("MvcController");
            addAttributeDefList(_parentController);

            AttributeDefinitionDMO _firesEventOBJ = new AttributeDefinitionDMO();
            _firesEvent = new AttributeDefinition(_firesEventOBJ);
            _firesEvent.setDefinedIn(this);
            _firesEventOBJ.setDescription("Indicates that an MvcView fires the specified event. When a View fires an event, it is NOT sent via the Dispatcher. Rather, it is propagated up the hierarchy of controllers by which the View is controlled.");
            _firesEventOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _firesEventOBJ.setLineNumber("145");
            _firesEventOBJ.setName("firesEvent");
            _firesEventOBJ.addObjectClass("AttributeDefinition");
            _firesEventOBJ.setType("MvcEvent");
            addAttributeDefList(_firesEvent);

            AttributeDefinitionDMO _userDataCollectionOBJ = new AttributeDefinitionDMO();
            _userDataCollection = new AttributeDefinition(_userDataCollectionOBJ);
            _userDataCollection.setDefinedIn(this);
            _userDataCollectionOBJ.setDescription("The fully qualified name of the collection type to be used when passing the user data e.g. java.util.List.");
            _userDataCollectionOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _userDataCollectionOBJ.setLineNumber("151");
            _userDataCollectionOBJ.setName("userDataCollection");
            _userDataCollectionOBJ.addObjectClass("AttributeDefinition");
            _userDataCollectionOBJ.setType("String");
            addAttributeDefList(_userDataCollection);

            AttributeDefinitionDMO _userDataGenericSpecOBJ = new AttributeDefinitionDMO();
            _userDataGenericSpec = new AttributeDefinition(_userDataGenericSpecOBJ);
            _userDataGenericSpec.setDefinedIn(this);
            _userDataGenericSpecOBJ.setDescription("If the userDataCollection is a Map of some type, this attribute would indicate the generic arguments to be provided for the Map instance e.g. <String,MyData> In the case where the collection is just a list, the generation code knows to just use the userDataType as the generic argument.");
            _userDataGenericSpecOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _userDataGenericSpecOBJ.setLineNumber("159");
            _userDataGenericSpecOBJ.setName("userDataGenericSpec");
            _userDataGenericSpecOBJ.addObjectClass("AttributeDefinition");
            _userDataGenericSpecOBJ.setType("String");
            addAttributeDefList(_userDataGenericSpec);

            AttributeDefinitionDMO _startEventsOBJ = new AttributeDefinitionDMO();
            _startEvents = new AttributeDefinition(_startEventsOBJ);
            _startEvents.setDefinedIn(this);
            _startEventsOBJ.setDescription("Indicates the events that should be dispatched when the application is told to start.");
            _startEventsOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _startEventsOBJ.setIsMultiValued("true");
            _startEventsOBJ.setLineNumber("166");
            _startEventsOBJ.setName("startEvents");
            _startEventsOBJ.addObjectClass("AttributeDefinition");
            _startEventsOBJ.setType("MvcEvent");
            addAttributeDefList(_startEvents);

            AttributeDefinitionDMO _addToMenuOBJ = new AttributeDefinitionDMO();
            _addToMenu = new AttributeDefinition(_addToMenuOBJ);
            _addToMenu.setDefinedIn(this);
            _addToMenuOBJ.setDescription("Indicates the menu to which an MvcMenuItem should be added.");
            _addToMenuOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _addToMenuOBJ.setLineNumber("171");
            _addToMenuOBJ.setName("addToMenu");
            _addToMenuOBJ.addObjectClass("AttributeDefinition");
            _addToMenuOBJ.setType("MvcMenu");
            addAttributeDefList(_addToMenu);

            AttributeDefinitionDMO _separatorBeforeOBJ = new AttributeDefinitionDMO();
            _separatorBefore = new AttributeDefinition(_separatorBeforeOBJ);
            _separatorBefore.setDefinedIn(this);
            _separatorBeforeOBJ.setDescription("Indicates that the item should have a separator placed before it.");
            _separatorBeforeOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _separatorBeforeOBJ.setLineNumber("176");
            _separatorBeforeOBJ.setName("separatorBefore");
            _separatorBeforeOBJ.addObjectClass("AttributeDefinition");
            _separatorBeforeOBJ.setType("Boolean");
            addAttributeDefList(_separatorBefore);

            AttributeDefinitionDMO _alwaysEnabledOBJ = new AttributeDefinitionDMO();
            _alwaysEnabled = new AttributeDefinition(_alwaysEnabledOBJ);
            _alwaysEnabled.setDefinedIn(this);
            _alwaysEnabledOBJ.setDescription("Indicates if the item is always enabled. If not, there will be a method generated that is called before the menu is shown to determine if the item is enabled/disabled.");
            _alwaysEnabledOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _alwaysEnabledOBJ.setLineNumber("183");
            _alwaysEnabledOBJ.setName("alwaysEnabled");
            _alwaysEnabledOBJ.addObjectClass("AttributeDefinition");
            _alwaysEnabledOBJ.setType("Boolean");
            addAttributeDefList(_alwaysEnabled);

            AttributeDefinitionDMO _menuOrderOBJ = new AttributeDefinitionDMO();
            _menuOrder = new AttributeDefinition(_menuOrderOBJ);
            _menuOrder.setDefinedIn(this);
            _menuOrderOBJ.setDescription("Indicates the lexicographic order in which a sub menu or menu item should be displayed in the menu. How you decide to specify this order is up to you. For instance, you might specify the orders as integer based strings e.g. 001, 100, 150, 151.");
            _menuOrderOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _menuOrderOBJ.setLineNumber("191");
            _menuOrderOBJ.setName("menuOrder");
            _menuOrderOBJ.addObjectClass("AttributeDefinition");
            _menuOrderOBJ.setType("String");
            addAttributeDefList(_menuOrder);

            AttributeDefinitionDMO _triggersActionOBJ = new AttributeDefinitionDMO();
            _triggersAction = new AttributeDefinition(_triggersActionOBJ);
            _triggersAction.setDefinedIn(this);
            _triggersActionOBJ.setDescription("Indicates the MvcAction to be associated with a menu entry, button or other UI component.");
            _triggersActionOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _triggersActionOBJ.setLineNumber("197");
            _triggersActionOBJ.setName("triggersAction");
            _triggersActionOBJ.addObjectClass("AttributeDefinition");
            _triggersActionOBJ.setType("MvcAction");
            addAttributeDefList(_triggersAction);

            AttributeDefinitionDMO _definesActionOBJ = new AttributeDefinitionDMO();
            _definesAction = new AttributeDefinition(_definesActionOBJ);
            _definesAction.setDefinedIn(this);
            _definesActionOBJ.setDescription("Indicates that the controller defines the specified action. This attribute is auto populated by the MvcDefinitionManager based on the associatedController of an action.");
            _definesActionOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _definesActionOBJ.setIsMultiValued("true");
            _definesActionOBJ.setLineNumber("204");
            _definesActionOBJ.setName("definesAction");
            _definesActionOBJ.addObjectClass("AttributeDefinition");
            _definesActionOBJ.setType("MvcAction");
            addAttributeDefList(_definesAction);

            AttributeDefinitionDMO _definesMenuOBJ = new AttributeDefinitionDMO();
            _definesMenu = new AttributeDefinition(_definesMenuOBJ);
            _definesMenu.setDefinedIn(this);
            _definesMenuOBJ.setDescription("Indicates that the controller defines the specified menu. This attribute is auto populated by the MvcDefinitionManager based on the associatedController of a menu.");
            _definesMenuOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _definesMenuOBJ.setIsMultiValued("true");
            _definesMenuOBJ.setLineNumber("211");
            _definesMenuOBJ.setName("definesMenu");
            _definesMenuOBJ.addObjectClass("AttributeDefinition");
            _definesMenuOBJ.setType("MvcMenu");
            addAttributeDefList(_definesMenu);

            AttributeDefinitionDMO _definesMenuItemOBJ = new AttributeDefinitionDMO();
            _definesMenuItem = new AttributeDefinition(_definesMenuItemOBJ);
            _definesMenuItem.setDefinedIn(this);
            _definesMenuItemOBJ.setDescription("Indicates that the controller defines the specified menu item. This attribute is auto populated by the MvcDefinitionManager based on the associatedController of a menu item.");
            _definesMenuItemOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _definesMenuItemOBJ.setIsMultiValued("true");
            _definesMenuItemOBJ.setLineNumber("218");
            _definesMenuItemOBJ.setName("definesMenuItem");
            _definesMenuItemOBJ.addObjectClass("AttributeDefinition");
            _definesMenuItemOBJ.setType("MvcMenuItem");
            addAttributeDefList(_definesMenuItem);

            AttributeDefinitionDMO _associatedControllerOBJ = new AttributeDefinitionDMO();
            _associatedController = new AttributeDefinition(_associatedControllerOBJ);
            _associatedController.setDefinedIn(this);
            _associatedControllerOBJ.setDescription("Indicates that something is associated with the specified controller.");
            _associatedControllerOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _associatedControllerOBJ.setLineNumber("223");
            _associatedControllerOBJ.setName("associatedController");
            _associatedControllerOBJ.addObjectClass("AttributeDefinition");
            _associatedControllerOBJ.setType("MvcController");
            addAttributeDefList(_associatedController);

            AttributeDefinitionDMO _useForModelClassOBJ = new AttributeDefinitionDMO();
            _useForModelClass = new AttributeDefinition(_useForModelClassOBJ);
            _useForModelClass.setDefinedIn(this);
            _useForModelClassOBJ.setDescription("Indicates the fully qualified name of the model class on which a popup menu should defined.");
            _useForModelClassOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _useForModelClassOBJ.setLineNumber("229");
            _useForModelClassOBJ.setName("useForModelClass");
            _useForModelClassOBJ.addObjectClass("AttributeDefinition");
            _useForModelClassOBJ.setType("String");
            addAttributeDefList(_useForModelClass);

            AttributeDefinitionDMO _displayLabelOBJ = new AttributeDefinitionDMO();
            _displayLabel = new AttributeDefinition(_displayLabelOBJ);
            _displayLabel.setDefinedIn(this);
            _displayLabelOBJ.setDescription("The label to be displayed on something.");
            _displayLabelOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _displayLabelOBJ.setLineNumber("234");
            _displayLabelOBJ.setName("displayLabel");
            _displayLabelOBJ.addObjectClass("AttributeDefinition");
            _displayLabelOBJ.setType("String");
            addAttributeDefList(_displayLabel);

            AttributeDefinitionDMO _customRenderOBJ = new AttributeDefinitionDMO();
            _customRender = new AttributeDefinition(_customRenderOBJ);
            _customRender.setDefinedIn(this);
            _customRenderOBJ.setDescription("Indicates if you want to be able to custom render your menu or menu item. If so, an abstract class will be generated to represent the component and you will have create a derivative in your extended folder to provide the required behaviour.");
            _customRenderOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/features/extgwt/schema/v0dot1/attributes.dmd");
            _customRenderOBJ.setLineNumber("241");
            _customRenderOBJ.setName("customRender");
            _customRenderOBJ.addObjectClass("AttributeDefinition");
            _customRenderOBJ.setType("Boolean");
            addAttributeDefList(_customRender);


        }
    }


    @Override
    public ExtgwtSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

