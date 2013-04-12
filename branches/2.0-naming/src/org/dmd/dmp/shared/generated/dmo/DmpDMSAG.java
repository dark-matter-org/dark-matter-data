package org.dmd.dmp.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:862)
import java.util.ArrayList;                                        // For storage of schema info - (DmoCompactSchemaFormatter.java:796)
import java.util.HashMap;                                          // For storage of schema info - (DmoCompactSchemaFormatter.java:795)
import java.util.Iterator;                                         // For access of schema info - (DmoCompactSchemaFormatter.java:797)
import org.dmd.dmc.*;                                              // Basic DMC stuff - (DmoCompactSchemaFormatter.java:798)
import org.dmd.dmc.rules.RuleIF;                                   // For rule info - (DmoCompactSchemaFormatter.java:799)
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;         // Optional attribute from DmrbaseDMSAG - (DmoCompactSchemaFormatter.java:819)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Optional attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:819)
import org.dmd.dms.generated.enums.ClassTypeEnum;                  // Have class definitions - (DmoCompactSchemaFormatter.java:803)
import org.dmd.dms.generated.enums.DataTypeEnum;                   // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:804)
import org.dmd.dms.generated.enums.OriginalTypeEnum;               // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:809)
import org.dmd.dms.generated.enums.ValueTypeEnum;                  // Have attribute definitions - (DmoCompactSchemaFormatter.java:830)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:125)
public class DmpDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmp";


    static int schemaBaseID = 500;


    static int schemaIDRange = 50;


    static int schemaMaxID = 550;

    public final static DmcAttributeInfo __FQNList = new DmcAttributeInfo("dmp", "FQNList", 507, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __actionName = new DmcAttributeInfo("dmp", "actionName", 515, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __actionTrigger = new DmcAttributeInfo("dmp", "actionTrigger", 525, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __applicationName = new DmcAttributeInfo("dmp", "applicationName", 541, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __applicationVersion = new DmcAttributeInfo("dmp", "applicationVersion", 542, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __attributeSelector = new DmcAttributeInfo("dmp", "attributeSelector", 533, "AttributeID", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __blockingFactor = new DmcAttributeInfo("dmp", "blockingFactor", 519, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __cacheResponse = new DmcAttributeInfo("dmp", "cacheResponse", 534, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __eventChannelReady = new DmcAttributeInfo("dmp", "eventChannelReady", 545, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __eventTypeDMP = new DmcAttributeInfo("dmp", "eventTypeDMP", 523, "DMPEventTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("dmp", "filter", 520, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __filterByClass = new DmcAttributeInfo("dmp", "filterByClass", 521, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("dmp", "handlerID", 531, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("dmp", "lastResponse", 510, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __listenerID = new DmcAttributeInfo("dmp", "listenerID", 538, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __myOwnEvent = new DmcAttributeInfo("dmp", "myOwnEvent", 543, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __newObject = new DmcAttributeInfo("dmp", "newObject", 513, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __notifyOriginator = new DmcAttributeInfo("dmp", "notifyOriginator", 527, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __objectList = new DmcAttributeInfo("dmp", "objectList", 512, "DmcObject", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __objectsToCome = new DmcAttributeInfo("dmp", "objectsToCome", 544, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("dmp", "originatorID", 526, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __parentName = new DmcAttributeInfo("dmp", "parentName", 529, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("dmp", "readableFormat", 517, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __registerForEvents = new DmcAttributeInfo("dmp", "registerForEvents", 530, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("dmp", "requestID", 501, "Integer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __requestRoot = new DmcAttributeInfo("dmp", "requestRoot", 503, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("dmp", "responseCategory", 505, "ResponseCategoryEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("dmp", "responseFormat", 516, "ResponseFormatEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("dmp", "responseText", 506, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("dmp", "responseType", 504, "ResponseTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("dmp", "scope", 511, "ScopeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("dmp", "sessionID", 502, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __slice = new DmcAttributeInfo("dmp", "slice", 535, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __source = new DmcAttributeInfo("dmp", "source", 532, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sourceObject = new DmcAttributeInfo("dmp", "sourceObject", 514, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sourceObjectClass = new DmcAttributeInfo("dmp", "sourceObjectClass", 509, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __target = new DmcAttributeInfo("dmp", "target", 508, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __targetObjectClass = new DmcAttributeInfo("dmp", "targetObjectClass", 536, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __targets = new DmcAttributeInfo("dmp", "targets", 537, "NameContainer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("dmp", "timeMS", 518, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __timeoutSeconds = new DmcAttributeInfo("dmp", "timeoutSeconds", 540, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __trackingEnabled = new DmcAttributeInfo("dmp", "trackingEnabled", 539, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __userFQN = new DmcAttributeInfo("dmp", "userFQN", 524, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:164)
    public final static DmcTypeInfo __type_ActionRequest = new DmcTypeInfo("ActionRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ActionResponse = new DmcTypeInfo("ActionResponse", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_CreateRequest = new DmcTypeInfo("CreateRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_CreateResponse = new DmcTypeInfo("CreateResponse", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_DMPEvent = new DmcTypeInfo("DMPEvent", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_DMPEventTypeEnum = new DmcTypeInfo("DMPEventTypeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_DMPMessage = new DmcTypeInfo("DMPMessage", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_DeleteRequest = new DmcTypeInfo("DeleteRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_DeleteResponse = new DmcTypeInfo("DeleteResponse", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_DenotifyRequest = new DmcTypeInfo("DenotifyRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_DenotifyResponse = new DmcTypeInfo("DenotifyResponse", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_FileModeEnum = new DmcTypeInfo("FileModeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_GetRequest = new DmcTypeInfo("GetRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_GetResponse = new DmcTypeInfo("GetResponse", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_LoginRequest = new DmcTypeInfo("LoginRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_LoginResponse = new DmcTypeInfo("LoginResponse", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_LogoutRequest = new DmcTypeInfo("LogoutRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_LogoutResponse = new DmcTypeInfo("LogoutResponse", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_NotifyRequest = new DmcTypeInfo("NotifyRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_NotifyResponse = new DmcTypeInfo("NotifyResponse", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_PreAuthRequest = new DmcTypeInfo("PreAuthRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_PreAuthResponse = new DmcTypeInfo("PreAuthResponse", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_Request = new DmcTypeInfo("Request", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_Response = new DmcTypeInfo("Response", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ResponseCategoryEnum = new DmcTypeInfo("ResponseCategoryEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ResponseFormatEnum = new DmcTypeInfo("ResponseFormatEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ResponseTypeEnum = new DmcTypeInfo("ResponseTypeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ScopeEnum = new DmcTypeInfo("ScopeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_SetRequest = new DmcTypeInfo("SetRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_SetResponse = new DmcTypeInfo("SetResponse", OriginalTypeEnum.OBJECT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:205)
    public final static DmcClassInfo __DMPMessage = new DmcClassInfo("DMPMessage","org.dmd.dmp.shared.generated.dmo.DMPMessageDMO", 501, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __DMPEvent = new DmcClassInfo("DMPEvent","org.dmd.dmp.shared.generated.dmo.DMPEventDMO", 518, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __Request = new DmcClassInfo("Request","org.dmd.dmp.shared.generated.dmo.RequestDMO", 502, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __ActionRequest = new DmcClassInfo("ActionRequest","org.dmd.dmp.shared.generated.dmo.ActionRequestDMO", 510, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __CreateRequest = new DmcClassInfo("CreateRequest","org.dmd.dmp.shared.generated.dmo.CreateRequestDMO", 514, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __DeleteRequest = new DmcClassInfo("DeleteRequest","org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO", 516, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __DenotifyRequest = new DmcClassInfo("DenotifyRequest","org.dmd.dmp.shared.generated.dmo.DenotifyRequestDMO", 521, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __GetRequest = new DmcClassInfo("GetRequest","org.dmd.dmp.shared.generated.dmo.GetRequestDMO", 508, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __LoginRequest = new DmcClassInfo("LoginRequest","org.dmd.dmp.shared.generated.dmo.LoginRequestDMO", 504, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __LogoutRequest = new DmcClassInfo("LogoutRequest","org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO", 506, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __NotifyRequest = new DmcClassInfo("NotifyRequest","org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO", 519, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __PreAuthRequest = new DmcClassInfo("PreAuthRequest","org.dmd.dmp.shared.generated.dmo.PreAuthRequestDMO", 523, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __SetRequest = new DmcClassInfo("SetRequest","org.dmd.dmp.shared.generated.dmo.SetRequestDMO", 512, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __Response = new DmcClassInfo("Response","org.dmd.dmp.shared.generated.dmo.ResponseDMO", 503, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __ActionResponse = new DmcClassInfo("ActionResponse","org.dmd.dmp.shared.generated.dmo.ActionResponseDMO", 511, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __CreateResponse = new DmcClassInfo("CreateResponse","org.dmd.dmp.shared.generated.dmo.CreateResponseDMO", 515, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __DeleteResponse = new DmcClassInfo("DeleteResponse","org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO", 517, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __DenotifyResponse = new DmcClassInfo("DenotifyResponse","org.dmd.dmp.shared.generated.dmo.DenotifyResponseDMO", 522, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __GetResponse = new DmcClassInfo("GetResponse","org.dmd.dmp.shared.generated.dmo.GetResponseDMO", 509, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __LoginResponse = new DmcClassInfo("LoginResponse","org.dmd.dmp.shared.generated.dmo.LoginResponseDMO", 505, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __LogoutResponse = new DmcClassInfo("LogoutResponse","org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO", 507, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __NotifyResponse = new DmcClassInfo("NotifyResponse","org.dmd.dmp.shared.generated.dmo.NotifyResponseDMO", 520, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __PreAuthResponse = new DmcClassInfo("PreAuthResponse","org.dmd.dmp.shared.generated.dmo.PreAuthResponseDMO", 524, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __SetResponse = new DmcClassInfo("SetResponse","org.dmd.dmp.shared.generated.dmo.SetResponseDMO", 513, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Response,null);

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

        _SmAp.put(__FQNList.id,__FQNList);
        _SmAp.put(__actionName.id,__actionName);
        _SmAp.put(__actionTrigger.id,__actionTrigger);
        _SmAp.put(__applicationName.id,__applicationName);
        _SmAp.put(__applicationVersion.id,__applicationVersion);
        _SmAp.put(__attributeSelector.id,__attributeSelector);
        _SmAp.put(__blockingFactor.id,__blockingFactor);
        _SmAp.put(__cacheResponse.id,__cacheResponse);
        _SmAp.put(__eventChannelReady.id,__eventChannelReady);
        _SmAp.put(__eventTypeDMP.id,__eventTypeDMP);
        _SmAp.put(__filter.id,__filter);
        _SmAp.put(__filterByClass.id,__filterByClass);
        _SmAp.put(__handlerID.id,__handlerID);
        _SmAp.put(__lastResponse.id,__lastResponse);
        _SmAp.put(__listenerID.id,__listenerID);
        _SmAp.put(__myOwnEvent.id,__myOwnEvent);
        _SmAp.put(__newObject.id,__newObject);
        _SmAp.put(__notifyOriginator.id,__notifyOriginator);
        _SmAp.put(__objectList.id,__objectList);
        _SmAp.put(__objectsToCome.id,__objectsToCome);
        _SmAp.put(__originatorID.id,__originatorID);
        _SmAp.put(__parentName.id,__parentName);
        _SmAp.put(__readableFormat.id,__readableFormat);
        _SmAp.put(__registerForEvents.id,__registerForEvents);
        _SmAp.put(__requestID.id,__requestID);
        _SmAp.put(__requestRoot.id,__requestRoot);
        _SmAp.put(__responseCategory.id,__responseCategory);
        _SmAp.put(__responseFormat.id,__responseFormat);
        _SmAp.put(__responseText.id,__responseText);
        _SmAp.put(__responseType.id,__responseType);
        _SmAp.put(__scope.id,__scope);
        _SmAp.put(__sessionID.id,__sessionID);
        _SmAp.put(__slice.id,__slice);
        _SmAp.put(__source.id,__source);
        _SmAp.put(__sourceObject.id,__sourceObject);
        _SmAp.put(__sourceObjectClass.id,__sourceObjectClass);
        _SmAp.put(__target.id,__target);
        _SmAp.put(__targetObjectClass.id,__targetObjectClass);
        _SmAp.put(__targets.id,__targets);
        _SmAp.put(__timeMS.id,__timeMS);
        _SmAp.put(__timeoutSeconds.id,__timeoutSeconds);
        _SmAp.put(__trackingEnabled.id,__trackingEnabled);
        _SmAp.put(__userFQN.id,__userFQN);
        _CmAp.put(__ActionRequest.id,__ActionRequest);
        _CmAp.put(__ActionResponse.id,__ActionResponse);
        _CmAp.put(__CreateRequest.id,__CreateRequest);
        _CmAp.put(__CreateResponse.id,__CreateResponse);
        _CmAp.put(__DMPEvent.id,__DMPEvent);
        _CmAp.put(__DMPMessage.id,__DMPMessage);
        _CmAp.put(__DeleteRequest.id,__DeleteRequest);
        _CmAp.put(__DeleteResponse.id,__DeleteResponse);
        _CmAp.put(__DenotifyRequest.id,__DenotifyRequest);
        _CmAp.put(__DenotifyResponse.id,__DenotifyResponse);
        _CmAp.put(__GetRequest.id,__GetRequest);
        _CmAp.put(__GetResponse.id,__GetResponse);
        _CmAp.put(__LoginRequest.id,__LoginRequest);
        _CmAp.put(__LoginResponse.id,__LoginResponse);
        _CmAp.put(__LogoutRequest.id,__LogoutRequest);
        _CmAp.put(__LogoutResponse.id,__LogoutResponse);
        _CmAp.put(__NotifyRequest.id,__NotifyRequest);
        _CmAp.put(__NotifyResponse.id,__NotifyResponse);
        _CmAp.put(__PreAuthRequest.id,__PreAuthRequest);
        _CmAp.put(__PreAuthResponse.id,__PreAuthResponse);
        _CmAp.put(__Request.id,__Request);
        _CmAp.put(__Response.id,__Response);
        _CmAp.put(__SetRequest.id,__SetRequest);
        _CmAp.put(__SetResponse.id,__SetResponse);

        __DMPMessage.addMust(__requestID);
        __DMPMessage.addMay(__timeMS);
        __DMPMessage.addMay(__trackingEnabled);

        __Request.addMay(__handlerID);
        __Request.addMay(__sessionID);
        __Request.addMay(__readableFormat);
        __Request.addMay(__responseFormat);
        __Request.addMay(__originatorID);
        __Request.addMay(__timeoutSeconds);
        __Request.addMay(__notifyOriginator);
        __Request.addMay(DmrbaseDMSAG.__userName);

        __Response.addMust(__lastResponse);
        __Response.addMust(__responseType);
        __Response.addMay(__handlerID);
        __Response.addMay(__responseText);
        __Response.addMay(__responseCategory);

        __LoginRequest.addMust(DmrbaseDMSAG.__userName);
        __LoginRequest.addMust(DmrbaseDMSAG.__password);

        __LoginResponse.addMay(__sessionID);
        __LoginResponse.addMay(__originatorID);
        __LoginResponse.addMay(__requestRoot);
        __LoginResponse.addMay(__userFQN);

        __LogoutRequest.addMust(DmrbaseDMSAG.__userName);
        __LogoutRequest.addMust(__sessionID);

        __LogoutResponse.addMust(__sessionID);

        __GetRequest.addMust(__scope);
        __GetRequest.addMay(__targets);
        __GetRequest.addMay(__filter);
        __GetRequest.addMay(__filterByClass);
        __GetRequest.addMay(__blockingFactor);
        __GetRequest.addMay(__registerForEvents);
        __GetRequest.addMay(__attributeSelector);
        __GetRequest.addMay(__cacheResponse);
        __GetRequest.addMay(__slice);
        __GetRequest.addMay(MetaDMSAG.__classFilter);

        __GetResponse.addMay(__targets);
        __GetResponse.addMay(__objectList);
        __GetResponse.addMay(__cacheResponse);
        __GetResponse.addMay(__listenerID);
        __GetResponse.addMay(__objectsToCome);

        __ActionRequest.addMust(MetaDMSAG.__FQN);
        __ActionRequest.addMust(__actionName);
        __ActionRequest.addMay(__scope);
        __ActionRequest.addMay(__objectList);
        __ActionRequest.addMay(__actionTrigger);

        __ActionResponse.addMust(__timeMS);
        __ActionResponse.addMust(__actionName);
        __ActionResponse.addMay(__objectList);

        __SetRequest.addMust(__target);
        __SetRequest.addMust(MetaDMSAG.__modify);
        __SetRequest.addMay(__targetObjectClass);

        __SetResponse.addMust(__timeMS);
        __SetResponse.addMust(__target);
        __SetResponse.addMay(__objectList);

        __CreateRequest.addMust(__requestID);
        __CreateRequest.addMust(__newObject);
        __CreateRequest.addMay(__parentName);

        __CreateResponse.addMay(__objectList);

        __DeleteRequest.addMust(__targets);
        __DeleteRequest.addMay(__scope);

        __DeleteResponse.addMay(__objectList);

        __DMPEvent.addMust(__eventTypeDMP);
        __DMPEvent.addMay(__source);
        __DMPEvent.addMay(__sourceObjectClass);
        __DMPEvent.addMay(MetaDMSAG.__modify);
        __DMPEvent.addMay(__sourceObject);
        __DMPEvent.addMay(__originatorID);
        __DMPEvent.addMay(__handlerID);
        __DMPEvent.addMay(__notifyOriginator);
        __DMPEvent.addMay(__slice);
        __DMPEvent.addMay(__listenerID);
        __DMPEvent.addMay(__myOwnEvent);

        __NotifyRequest.addMust(__target);
        __NotifyRequest.addMay(__scope);
        __NotifyRequest.addMay(__filter);


        __DenotifyRequest.addMust(__target);
        __DenotifyRequest.addMay(__listenerID);
        __DenotifyRequest.addMay(__scope);
        __DenotifyRequest.addMay(__filter);

        __DenotifyResponse.addMay(__target);
        __DenotifyResponse.addMay(__scope);
        __DenotifyResponse.addMay(__filter);


        __PreAuthResponse.addMay(__applicationName);
        __PreAuthResponse.addMay(__applicationVersion);


    }

    static  DmpDMSAG instance;

    protected DmpDMSAG (){
    }

    public synchronized static DmpDMSAG instance(){
        if (instance == null)
            instance = new DmpDMSAG();
        
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


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

