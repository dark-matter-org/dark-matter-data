package org.dmd.features.extgwt.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:510)
import org.dmd.dmg.generated.dmo.DmgDMSAG;                // DmgDMSAG
import org.dmd.dms.generated.dmo.MetaDMSAG;               // MetaDMSAG
import org.dmd.dms.generated.enums.ClassTypeEnum;         // Have class definitions
import org.dmd.dms.generated.enums.DataTypeEnum;          // Have class/attribute definitions
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Have attribute definitions



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:95)
public class ExtgwtDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "extgwt";

    public final static DmcClassInfo __MvcDefinition = new DmcClassInfo("MvcDefinition", 601, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcAction = new DmcClassInfo("MvcAction", 610, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcApplication = new DmcClassInfo("MvcApplication", 605, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcConfig = new DmcClassInfo("MvcConfig", 602, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcController = new DmcClassInfo("MvcController", 606, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcEvent = new DmcClassInfo("MvcEvent", 603, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcMenu = new DmcClassInfo("MvcMenu", 611, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcBackgroundMenu = new DmcClassInfo("MvcBackgroundMenu", 616, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcMenuBar = new DmcClassInfo("MvcMenuBar", 612, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcPopupMenu = new DmcClassInfo("MvcPopupMenu", 615, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcSubMenu = new DmcClassInfo("MvcSubMenu", 614, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcToolBar = new DmcClassInfo("MvcToolBar", 613, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcMenuItem = new DmcClassInfo("MvcMenuItem", 617, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcMenuSeparator = new DmcClassInfo("MvcMenuSeparator", 618, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcRegistryItem = new DmcClassInfo("MvcRegistryItem", 609, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcServerEvent = new DmcClassInfo("MvcServerEvent", 604, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcView = new DmcClassInfo("MvcView", 607, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __MvcMultiView = new DmcClassInfo("MvcMultiView", 608, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcView,MetaDMSAG.__name);
    public final static DmcAttributeInfo __addToMenu = new DmcAttributeInfo("addToMenu", 623, "MvcMenu", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __alwaysEnabled = new DmcAttributeInfo("alwaysEnabled", 624, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __associatedController = new DmcAttributeInfo("associatedController", 631, "MvcController", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __controllers = new DmcAttributeInfo("controllers", 607, "MvcController", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __controlsMultiView = new DmcAttributeInfo("controlsMultiView", 615, "MvcMultiView", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __controlsView = new DmcAttributeInfo("controlsView", 614, "MvcView", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __createsRegistryItem = new DmcAttributeInfo("createsRegistryItem", 611, "MvcRegistryItem", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __customRender = new DmcAttributeInfo("customRender", 634, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definedBy = new DmcAttributeInfo("definedBy", 604, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig", 616, "MvcConfig", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definesAction = new DmcAttributeInfo("definesAction", 627, "MvcAction", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definesEvent = new DmcAttributeInfo("definesEvent", 601, "MvcEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definesMenu = new DmcAttributeInfo("definesMenu", 628, "MvcMenu", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definesMenuItem = new DmcAttributeInfo("definesMenuItem", 629, "MvcMenuItem", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definesMenuSeparator = new DmcAttributeInfo("definesMenuSeparator", 630, "MvcMenuSeparator", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnMVC = new DmcAttributeInfo("dependsOnMVC", 600, "MvcConfig", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dispatchesEvent = new DmcAttributeInfo("dispatchesEvent", 603, "MvcEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __displayLabel = new DmcAttributeInfo("displayLabel", 633, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __emittedBy = new DmcAttributeInfo("emittedBy", 605, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __eventDataType = new DmcAttributeInfo("eventDataType", 609, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent", 619, "MvcEvent", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __handledBy = new DmcAttributeInfo("handledBy", 606, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent", 602, "MvcEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __handlesServerEvent = new DmcAttributeInfo("handlesServerEvent", 610, "MvcServerEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isHistoryEvent = new DmcAttributeInfo("isHistoryEvent", 617, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __menuOrder = new DmcAttributeInfo("menuOrder", 625, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __parentController = new DmcAttributeInfo("parentController", 618, "MvcController", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __prefix = new DmcAttributeInfo("prefix", 613, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __startEvents = new DmcAttributeInfo("startEvents", 622, "MvcEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __triggersAction = new DmcAttributeInfo("triggersAction", 626, "MvcAction", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useForModelClass = new DmcAttributeInfo("useForModelClass", 632, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __userDataCollection = new DmcAttributeInfo("userDataCollection", 620, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __userDataGenericSpec = new DmcAttributeInfo("userDataGenericSpec", 621, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __userDataType = new DmcAttributeInfo("userDataType", 608, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __usesRegistryItem = new DmcAttributeInfo("usesRegistryItem", 612, "MvcRegistryItem", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);


    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _SmAp.put(__addToMenu.id,__addToMenu);
        _SmAp.put(__alwaysEnabled.id,__alwaysEnabled);
        _SmAp.put(__associatedController.id,__associatedController);
        _SmAp.put(__controllers.id,__controllers);
        _SmAp.put(__controlsMultiView.id,__controlsMultiView);
        _SmAp.put(__controlsView.id,__controlsView);
        _SmAp.put(__createsRegistryItem.id,__createsRegistryItem);
        _SmAp.put(__customRender.id,__customRender);
        _SmAp.put(__definedBy.id,__definedBy);
        _SmAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _SmAp.put(__definesAction.id,__definesAction);
        _SmAp.put(__definesEvent.id,__definesEvent);
        _SmAp.put(__definesMenu.id,__definesMenu);
        _SmAp.put(__definesMenuItem.id,__definesMenuItem);
        _SmAp.put(__definesMenuSeparator.id,__definesMenuSeparator);
        _SmAp.put(__dependsOnMVC.id,__dependsOnMVC);
        _SmAp.put(__dispatchesEvent.id,__dispatchesEvent);
        _SmAp.put(__displayLabel.id,__displayLabel);
        _SmAp.put(__emittedBy.id,__emittedBy);
        _SmAp.put(__eventDataType.id,__eventDataType);
        _SmAp.put(__firesEvent.id,__firesEvent);
        _SmAp.put(__handledBy.id,__handledBy);
        _SmAp.put(__handlesEvent.id,__handlesEvent);
        _SmAp.put(__handlesServerEvent.id,__handlesServerEvent);
        _SmAp.put(__isHistoryEvent.id,__isHistoryEvent);
        _SmAp.put(__menuOrder.id,__menuOrder);
        _SmAp.put(__parentController.id,__parentController);
        _SmAp.put(__prefix.id,__prefix);
        _SmAp.put(__startEvents.id,__startEvents);
        _SmAp.put(__triggersAction.id,__triggersAction);
        _SmAp.put(__useForModelClass.id,__useForModelClass);
        _SmAp.put(__userDataCollection.id,__userDataCollection);
        _SmAp.put(__userDataGenericSpec.id,__userDataGenericSpec);
        _SmAp.put(__userDataType.id,__userDataType);
        _SmAp.put(__usesRegistryItem.id,__usesRegistryItem);
        _CmAp.put(__MvcAction.id,__MvcAction);
        _CmAp.put(__MvcApplication.id,__MvcApplication);
        _CmAp.put(__MvcBackgroundMenu.id,__MvcBackgroundMenu);
        _CmAp.put(__MvcConfig.id,__MvcConfig);
        _CmAp.put(__MvcController.id,__MvcController);
        _CmAp.put(__MvcDefinition.id,__MvcDefinition);
        _CmAp.put(__MvcEvent.id,__MvcEvent);
        _CmAp.put(__MvcMenu.id,__MvcMenu);
        _CmAp.put(__MvcMenuBar.id,__MvcMenuBar);
        _CmAp.put(__MvcMenuItem.id,__MvcMenuItem);
        _CmAp.put(__MvcMenuSeparator.id,__MvcMenuSeparator);
        _CmAp.put(__MvcMultiView.id,__MvcMultiView);
        _CmAp.put(__MvcPopupMenu.id,__MvcPopupMenu);
        _CmAp.put(__MvcRegistryItem.id,__MvcRegistryItem);
        _CmAp.put(__MvcServerEvent.id,__MvcServerEvent);
        _CmAp.put(__MvcSubMenu.id,__MvcSubMenu);
        _CmAp.put(__MvcToolBar.id,__MvcToolBar);
        _CmAp.put(__MvcView.id,__MvcView);

        __MvcDefinition.addMust(MetaDMSAG.__name);
        __MvcDefinition.addMust(__definedInMVCConfig);
        __MvcDefinition.addMay(MetaDMSAG.__file);
        __MvcDefinition.addMay(MetaDMSAG.__lineNumber);
        __MvcDefinition.addMay(MetaDMSAG.__description);

        __MvcConfig.addMust(MetaDMSAG.__name);
        __MvcConfig.addMust(DmgDMSAG.__genPackage);
        __MvcConfig.addMay(__dependsOnMVC);
        __MvcConfig.addMay(MetaDMSAG.__dependsOn);

        __MvcEvent.addMust(MetaDMSAG.__name);
        __MvcEvent.addMay(MetaDMSAG.__description);
        __MvcEvent.addMay(__userDataType);
        __MvcEvent.addMay(__isHistoryEvent);
        __MvcEvent.addMay(__userDataCollection);
        __MvcEvent.addMay(__userDataGenericSpec);
        __MvcEvent.addMay(__definedBy);
        __MvcEvent.addMay(__emittedBy);
        __MvcEvent.addMay(DmgDMSAG.__upperConstantName);

        __MvcServerEvent.addMust(MetaDMSAG.__name);
        __MvcServerEvent.addMust(__eventDataType);
        __MvcServerEvent.addMay(MetaDMSAG.__description);

        __MvcApplication.addMust(MetaDMSAG.__name);
        __MvcApplication.addMust(__controllers);
        __MvcApplication.addMay(__startEvents);
        __MvcApplication.addMay(__definesEvent);

        __MvcController.addMust(MetaDMSAG.__name);
        __MvcController.addMay(DmgDMSAG.__alias);
        __MvcController.addMay(__controlsView);
        __MvcController.addMay(__controlsMultiView);
        __MvcController.addMay(__handlesEvent);
        __MvcController.addMay(__handlesServerEvent);
        __MvcController.addMay(__dispatchesEvent);
        __MvcController.addMay(__usesRegistryItem);
        __MvcController.addMay(__createsRegistryItem);
        __MvcController.addMay(__parentController);
        __MvcController.addMay(MetaDMSAG.__subpackage);
        __MvcController.addMay(__definesAction);
        __MvcController.addMay(__definesMenu);
        __MvcController.addMay(__definesMenuItem);
        __MvcController.addMay(__definesMenuSeparator);

        __MvcView.addMust(MetaDMSAG.__name);
        __MvcView.addMay(__handlesEvent);
        __MvcView.addMay(__handlesServerEvent);
        __MvcView.addMay(__firesEvent);
        __MvcView.addMay(__dispatchesEvent);
        __MvcView.addMay(__usesRegistryItem);
        __MvcView.addMay(__createsRegistryItem);
        __MvcView.addMay(MetaDMSAG.__description);

        __MvcMultiView.addMust(MetaDMSAG.__name);

        __MvcRegistryItem.addMust(MetaDMSAG.__name);
        __MvcRegistryItem.addMust(__userDataType);
        __MvcRegistryItem.addMay(__userDataCollection);
        __MvcRegistryItem.addMay(__userDataGenericSpec);
        __MvcRegistryItem.addMay(MetaDMSAG.__description);

        __MvcAction.addMust(MetaDMSAG.__name);
        __MvcAction.addMust(__associatedController);
        __MvcAction.addMay(__handlesEvent);

        __MvcMenu.addMust(MetaDMSAG.__name);
        __MvcMenu.addMust(__associatedController);
        __MvcMenu.addMay(__customRender);

        __MvcMenuBar.addMust(MetaDMSAG.__name);

        __MvcToolBar.addMust(MetaDMSAG.__name);

        __MvcSubMenu.addMust(MetaDMSAG.__name);
        __MvcSubMenu.addMust(__addToMenu);
        __MvcSubMenu.addMust(__menuOrder);
        __MvcSubMenu.addMay(__displayLabel);

        __MvcPopupMenu.addMust(MetaDMSAG.__name);
        __MvcPopupMenu.addMust(__useForModelClass);

        __MvcBackgroundMenu.addMust(MetaDMSAG.__name);

        __MvcMenuItem.addMust(MetaDMSAG.__name);
        __MvcMenuItem.addMust(__triggersAction);
        __MvcMenuItem.addMust(__addToMenu);
        __MvcMenuItem.addMust(__associatedController);
        __MvcMenuItem.addMust(__menuOrder);
        __MvcMenuItem.addMay(__displayLabel);
        __MvcMenuItem.addMay(__customRender);

        __MvcMenuSeparator.addMust(MetaDMSAG.__name);
        __MvcMenuSeparator.addMust(__addToMenu);
        __MvcMenuSeparator.addMust(__associatedController);
        __MvcMenuSeparator.addMust(__menuOrder);


    }

    static  ExtgwtDMSAG instance;

    protected ExtgwtDMSAG (){
    }

    public synchronized static ExtgwtDMSAG instance(){
        if (instance == null)
            instance = new ExtgwtDMSAG();
        
        return(instance);
    }


    public DmcClassInfo getClassInfo(Integer id){
        return(_CmAp.get(id));
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getAttributeInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcClassInfo> getClassInfo(){
        return(_CmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){
        return(_FmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


}

