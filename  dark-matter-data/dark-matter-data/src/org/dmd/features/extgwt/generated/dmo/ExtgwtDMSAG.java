package org.dmd.features.extgwt.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dmg.generated.dmo.DmgDMSAG;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:92)
public class ExtgwtDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "extgwt";

    public final static DmcClassInfo __MvcDefinition = new DmcClassInfo("MvcDefinition", 601, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null);
    public final static DmcClassInfo __MvcAction = new DmcClassInfo("MvcAction", 610, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcApplication = new DmcClassInfo("MvcApplication", 605, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcConfig = new DmcClassInfo("MvcConfig", 602, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcController = new DmcClassInfo("MvcController", 606, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcEvent = new DmcClassInfo("MvcEvent", 603, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcMenu = new DmcClassInfo("MvcMenu", 611, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcBackgroundMenu = new DmcClassInfo("MvcBackgroundMenu", 616, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu);
    public final static DmcClassInfo __MvcMenuBar = new DmcClassInfo("MvcMenuBar", 612, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu);
    public final static DmcClassInfo __MvcPopupMenu = new DmcClassInfo("MvcPopupMenu", 615, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu);
    public final static DmcClassInfo __MvcSubMenu = new DmcClassInfo("MvcSubMenu", 614, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu);
    public final static DmcClassInfo __MvcToolBar = new DmcClassInfo("MvcToolBar", 613, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcMenu);
    public final static DmcClassInfo __MvcMenuItem = new DmcClassInfo("MvcMenuItem", 617, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcMenuSeparator = new DmcClassInfo("MvcMenuSeparator", 618, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcRegistryItem = new DmcClassInfo("MvcRegistryItem", 609, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcServerEvent = new DmcClassInfo("MvcServerEvent", 604, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcView = new DmcClassInfo("MvcView", 607, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcDefinition);
    public final static DmcClassInfo __MvcMultiView = new DmcClassInfo("MvcMultiView", 608, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvcView);
    public final static DmcAttributeInfo __addToMenu = new DmcAttributeInfo("addToMenu", 623, "MvcMenu", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __alwaysEnabled = new DmcAttributeInfo("alwaysEnabled", 624, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __associatedController = new DmcAttributeInfo("associatedController", 631, "MvcController", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __controllers = new DmcAttributeInfo("controllers", 607, "MvcController", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __controlsMultiView = new DmcAttributeInfo("controlsMultiView", 615, "MvcMultiView", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __controlsView = new DmcAttributeInfo("controlsView", 614, "MvcView", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __createsRegistryItem = new DmcAttributeInfo("createsRegistryItem", 611, "MvcRegistryItem", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __customRender = new DmcAttributeInfo("customRender", 634, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __definedBy = new DmcAttributeInfo("definedBy", 604, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig", 616, "MvcConfig", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __definesAction = new DmcAttributeInfo("definesAction", 627, "MvcAction", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __definesEvent = new DmcAttributeInfo("definesEvent", 601, "MvcEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __definesMenu = new DmcAttributeInfo("definesMenu", 628, "MvcMenu", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __definesMenuItem = new DmcAttributeInfo("definesMenuItem", 629, "MvcMenuItem", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __definesMenuSeparator = new DmcAttributeInfo("definesMenuSeparator", 630, "MvcMenuSeparator", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __dependsOnMVC = new DmcAttributeInfo("dependsOnMVC", 600, "MvcConfig", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __dispatchesEvent = new DmcAttributeInfo("dispatchesEvent", 603, "MvcEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __displayLabel = new DmcAttributeInfo("displayLabel", 633, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __emittedBy = new DmcAttributeInfo("emittedBy", 605, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __eventDataType = new DmcAttributeInfo("eventDataType", 609, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent", 619, "MvcEvent", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __handledBy = new DmcAttributeInfo("handledBy", 606, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent", 602, "MvcEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __handlesServerEvent = new DmcAttributeInfo("handlesServerEvent", 610, "MvcServerEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __isHistoryEvent = new DmcAttributeInfo("isHistoryEvent", 617, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __menuOrder = new DmcAttributeInfo("menuOrder", 625, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __parentController = new DmcAttributeInfo("parentController", 618, "MvcController", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __prefix = new DmcAttributeInfo("prefix", 613, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __startEvents = new DmcAttributeInfo("startEvents", 622, "MvcEvent", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __triggersAction = new DmcAttributeInfo("triggersAction", 626, "MvcAction", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __useForModelClass = new DmcAttributeInfo("useForModelClass", 632, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userDataCollection = new DmcAttributeInfo("userDataCollection", 620, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userDataGenericSpec = new DmcAttributeInfo("userDataGenericSpec", 621, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userDataType = new DmcAttributeInfo("userDataType", 608, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __usesRegistryItem = new DmcAttributeInfo("usesRegistryItem", 612, "MvcRegistryItem", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);


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

    }

    static  ExtgwtDMSAG instance;

    protected ExtgwtDMSAG (){
    }

    public static ExtgwtDMSAG instance(){
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

