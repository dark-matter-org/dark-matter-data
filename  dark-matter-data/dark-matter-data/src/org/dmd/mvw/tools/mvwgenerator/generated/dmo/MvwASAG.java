package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from: org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:73)
public class MvwASAG implements DmcAttributeSchemaIF {


    static String schemaName = "mvw";

    public final static DmcAttributeInfo __abstractActivity = new DmcAttributeInfo("abstractActivity", 858, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __activityName = new DmcAttributeInfo("activityName", 840, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __addedToRunContext = new DmcAttributeInfo("addedToRunContext", 859, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __appName = new DmcAttributeInfo("appName", 833, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __argVector = new DmcAttributeInfo("argVector", 803, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __broadcast = new DmcAttributeInfo("broadcast", 822, "Event", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __broadcastOnly = new DmcAttributeInfo("broadcastOnly", 823, "Event", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __centralDMPErrorHandler = new DmcAttributeInfo("centralDMPErrorHandler", 851, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __centralRPCErrorHandler = new DmcAttributeInfo("centralRPCErrorHandler", 852, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __clickEvent = new DmcAttributeInfo("clickEvent", 819, "OperationSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __componentName = new DmcAttributeInfo("componentName", 811, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __construction = new DmcAttributeInfo("construction", 828, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __contextImpl = new DmcAttributeInfo("contextImpl", 830, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __controllerName = new DmcAttributeInfo("controllerName", 834, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __createEvent = new DmcAttributeInfo("createEvent", 821, "OperationSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __createOnDemand = new DmcAttributeInfo("createOnDemand", 861, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __defaultPlace = new DmcAttributeInfo("defaultPlace", 857, "Place", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule", 800, "Module", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __deleteEvent = new DmcAttributeInfo("deleteEvent", 818, "EventSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __dependsOnModule = new DmcAttributeInfo("dependsOnModule", 805, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __displayDMO = new DmcAttributeInfo("displayDMO", 816, "DisplayDataSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __eventName = new DmcAttributeInfo("eventName", 809, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent", 801, "Event", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent", 802, "Event", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __importThis = new DmcAttributeInfo("importThis", 831, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __instantiatesView = new DmcAttributeInfo("instantiatesView", 862, "View", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __itemName = new DmcAttributeInfo("itemName", 827, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __itemOrder = new DmcAttributeInfo("itemOrder", 829, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __local = new DmcAttributeInfo("local", 832, "Event", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __localEvent = new DmcAttributeInfo("localEvent", 814, "EventWithArgs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __managesView = new DmcAttributeInfo("managesView", 841, "View", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __modifyEvent = new DmcAttributeInfo("modifyEvent", 820, "OperationSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __moduleName = new DmcAttributeInfo("moduleName", 810, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __parentPlace = new DmcAttributeInfo("parentPlace", 856, "Place", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __placeName = new DmcAttributeInfo("placeName", 853, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __placePrefix = new DmcAttributeInfo("placePrefix", 854, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __presenterImport = new DmcAttributeInfo("presenterImport", 836, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __presenterMethod = new DmcAttributeInfo("presenterMethod", 824, "MethodWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __presenterName = new DmcAttributeInfo("presenterName", 839, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __runsActivity = new DmcAttributeInfo("runsActivity", 855, "Activity", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __selectEvent = new DmcAttributeInfo("selectEvent", 817, "EventSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __selectedDMO = new DmcAttributeInfo("selectedDMO", 806, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sendsActionRequest = new DmcAttributeInfo("sendsActionRequest", 848, "RequestWithOptions", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sendsCreateRequest = new DmcAttributeInfo("sendsCreateRequest", 847, "RequestWithOptions", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sendsDeleteRequest = new DmcAttributeInfo("sendsDeleteRequest", 845, "RequestWithOptions", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sendsGetRequest = new DmcAttributeInfo("sendsGetRequest", 844, "GetWithOptions", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sendsLoginRequest = new DmcAttributeInfo("sendsLoginRequest", 849, "RequestWithOptions", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sendsLogoutRequest = new DmcAttributeInfo("sendsLogoutRequest", 850, "RequestWithOptions", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sendsSetRequest = new DmcAttributeInfo("sendsSetRequest", 846, "RequestWithOptions", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sharedImport = new DmcAttributeInfo("sharedImport", 838, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __theOne = new DmcAttributeInfo("theOne", 863, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __useBaseClass = new DmcAttributeInfo("useBaseClass", 807, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __useClass = new DmcAttributeInfo("useClass", 826, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __useSchema = new DmcAttributeInfo("useSchema", 843, "SchemaDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userDataImport = new DmcAttributeInfo("userDataImport", 804, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __usesController = new DmcAttributeInfo("usesController", 842, "Controller", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __usesPresenter = new DmcAttributeInfo("usesPresenter", 860, "Presenter", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __usesRunContextItem = new DmcAttributeInfo("usesRunContextItem", 835, "RunContextItem", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __usingStandardSubpackages = new DmcAttributeInfo("usingStandardSubpackages", 864, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __viewImport = new DmcAttributeInfo("viewImport", 837, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __viewMethod = new DmcAttributeInfo("viewMethod", 825, "MethodWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __viewName = new DmcAttributeInfo("viewName", 812, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __widget = new DmcAttributeInfo("widget", 813, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__abstractActivity.id,__abstractActivity);
        _SmAp.put(__activityName.id,__activityName);
        _SmAp.put(__addedToRunContext.id,__addedToRunContext);
        _SmAp.put(__appName.id,__appName);
        _SmAp.put(__argVector.id,__argVector);
        _SmAp.put(__broadcast.id,__broadcast);
        _SmAp.put(__broadcastOnly.id,__broadcastOnly);
        _SmAp.put(__centralDMPErrorHandler.id,__centralDMPErrorHandler);
        _SmAp.put(__centralRPCErrorHandler.id,__centralRPCErrorHandler);
        _SmAp.put(__clickEvent.id,__clickEvent);
        _SmAp.put(__componentName.id,__componentName);
        _SmAp.put(__construction.id,__construction);
        _SmAp.put(__contextImpl.id,__contextImpl);
        _SmAp.put(__controllerName.id,__controllerName);
        _SmAp.put(__createEvent.id,__createEvent);
        _SmAp.put(__createOnDemand.id,__createOnDemand);
        _SmAp.put(__defaultPlace.id,__defaultPlace);
        _SmAp.put(__definedInModule.id,__definedInModule);
        _SmAp.put(__deleteEvent.id,__deleteEvent);
        _SmAp.put(__dependsOnModule.id,__dependsOnModule);
        _SmAp.put(__displayDMO.id,__displayDMO);
        _SmAp.put(__eventName.id,__eventName);
        _SmAp.put(__firesEvent.id,__firesEvent);
        _SmAp.put(__handlesEvent.id,__handlesEvent);
        _SmAp.put(__importThis.id,__importThis);
        _SmAp.put(__instantiatesView.id,__instantiatesView);
        _SmAp.put(__itemName.id,__itemName);
        _SmAp.put(__itemOrder.id,__itemOrder);
        _SmAp.put(__local.id,__local);
        _SmAp.put(__localEvent.id,__localEvent);
        _SmAp.put(__managesView.id,__managesView);
        _SmAp.put(__modifyEvent.id,__modifyEvent);
        _SmAp.put(__moduleName.id,__moduleName);
        _SmAp.put(__parentPlace.id,__parentPlace);
        _SmAp.put(__placeName.id,__placeName);
        _SmAp.put(__placePrefix.id,__placePrefix);
        _SmAp.put(__presenterImport.id,__presenterImport);
        _SmAp.put(__presenterMethod.id,__presenterMethod);
        _SmAp.put(__presenterName.id,__presenterName);
        _SmAp.put(__runsActivity.id,__runsActivity);
        _SmAp.put(__selectEvent.id,__selectEvent);
        _SmAp.put(__selectedDMO.id,__selectedDMO);
        _SmAp.put(__sendsActionRequest.id,__sendsActionRequest);
        _SmAp.put(__sendsCreateRequest.id,__sendsCreateRequest);
        _SmAp.put(__sendsDeleteRequest.id,__sendsDeleteRequest);
        _SmAp.put(__sendsGetRequest.id,__sendsGetRequest);
        _SmAp.put(__sendsLoginRequest.id,__sendsLoginRequest);
        _SmAp.put(__sendsLogoutRequest.id,__sendsLogoutRequest);
        _SmAp.put(__sendsSetRequest.id,__sendsSetRequest);
        _SmAp.put(__sharedImport.id,__sharedImport);
        _SmAp.put(__theOne.id,__theOne);
        _SmAp.put(__useBaseClass.id,__useBaseClass);
        _SmAp.put(__useClass.id,__useClass);
        _SmAp.put(__useSchema.id,__useSchema);
        _SmAp.put(__userDataImport.id,__userDataImport);
        _SmAp.put(__usesController.id,__usesController);
        _SmAp.put(__usesPresenter.id,__usesPresenter);
        _SmAp.put(__usesRunContextItem.id,__usesRunContextItem);
        _SmAp.put(__usingStandardSubpackages.id,__usingStandardSubpackages);
        _SmAp.put(__viewImport.id,__viewImport);
        _SmAp.put(__viewMethod.id,__viewMethod);
        _SmAp.put(__viewName.id,__viewName);
        _SmAp.put(__widget.id,__widget);

    }

    static  MvwASAG instance;

    protected MvwASAG (){
    }

    public static MvwASAG instance(){
        if (instance == null)
            instance = new MvwASAG();
        return(instance);
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


}

