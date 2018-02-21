package org.dmd.dmp.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1088)
import java.util.ArrayList;                                        // For storage of schema info - (DmoCompactSchemaFormatter.java:1022)
import java.util.HashMap;                                          // For storage of schema info - (DmoCompactSchemaFormatter.java:1021)
import java.util.Iterator;                                         // For access of schema info - (DmoCompactSchemaFormatter.java:1023)
import org.dmd.dmc.*;                                              // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1024)
import org.dmd.dmc.rules.RuleIF;                                   // For rule info - (DmoCompactSchemaFormatter.java:1025)
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;         // Optional attribute from DmrbaseDMSAG - (DmoCompactSchemaFormatter.java:1045)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Optional attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1045)
import org.dmd.dms.generated.enums.ClassTypeEnum;                  // Have class definitions - (DmoCompactSchemaFormatter.java:1029)
import org.dmd.dms.generated.enums.DataTypeEnum;                   // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1030)
import org.dmd.dms.generated.enums.OriginalTypeEnum;               // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1035)
import org.dmd.dms.generated.enums.ValueTypeEnum;                  // Have attribute definitions - (DmoCompactSchemaFormatter.java:1056)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:138)
public class DmpDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmp";


    static int schemaBaseID = 500;


    static int schemaIDRange = 50;


    static int schemaMaxID = 550;

    public final static DmcAttributeInfo __FQNList = new DmcAttributeInfo("dmp", "FQNList", 507, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __actionName = new DmcAttributeInfo("dmp", "actionName", 515, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __actionTrigger = new DmcAttributeInfo("dmp", "actionTrigger", 525, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __applicationName = new DmcAttributeInfo("dmp", "applicationName", 541, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __applicationVersion = new DmcAttributeInfo("dmp", "applicationVersion", 542, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __attributeSelector = new DmcAttributeInfo("dmp", "attributeSelector", 533, "AttributeID", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __blockingFactor = new DmcAttributeInfo("dmp", "blockingFactor", 519, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __cacheResponse = new DmcAttributeInfo("dmp", "cacheResponse", 534, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __eventChannelReady = new DmcAttributeInfo("dmp", "eventChannelReady", 545, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __eventTypeDMP = new DmcAttributeInfo("dmp", "eventTypeDMP", 523, "DMPEventTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("dmp", "filter", 520, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __filterByClass = new DmcAttributeInfo("dmp", "filterByClass", 521, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("dmp", "handlerID", 531, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("dmp", "lastResponse", 510, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __listenerID = new DmcAttributeInfo("dmp", "listenerID", 538, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __myOwnEvent = new DmcAttributeInfo("dmp", "myOwnEvent", 543, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __newObject = new DmcAttributeInfo("dmp", "newObject", 513, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __notifyOriginator = new DmcAttributeInfo("dmp", "notifyOriginator", 527, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __objectList = new DmcAttributeInfo("dmp", "objectList", 512, "DmcObject", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __objectsToCome = new DmcAttributeInfo("dmp", "objectsToCome", 544, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("dmp", "originatorID", 526, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __parentName = new DmcAttributeInfo("dmp", "parentName", 529, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("dmp", "readableFormat", 517, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __registerForEvents = new DmcAttributeInfo("dmp", "registerForEvents", 530, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("dmp", "requestID", 501, "Integer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __requestRoot = new DmcAttributeInfo("dmp", "requestRoot", 503, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("dmp", "responseCategory", 505, "ResponseCategoryEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("dmp", "responseFormat", 516, "ResponseFormatEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("dmp", "responseText", 506, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("dmp", "responseType", 504, "ResponseTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("dmp", "scope", 511, "ScopeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("dmp", "sessionID", 502, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __slice = new DmcAttributeInfo("dmp", "slice", 535, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __source = new DmcAttributeInfo("dmp", "source", 532, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sourceObject = new DmcAttributeInfo("dmp", "sourceObject", 514, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sourceObjectClass = new DmcAttributeInfo("dmp", "sourceObjectClass", 509, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __target = new DmcAttributeInfo("dmp", "target", 508, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __targetObjectClass = new DmcAttributeInfo("dmp", "targetObjectClass", 536, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __targets = new DmcAttributeInfo("dmp", "targets", 537, "NameContainer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("dmp", "timeMS", 518, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __timeoutSeconds = new DmcAttributeInfo("dmp", "timeoutSeconds", 540, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __trackingEnabled = new DmcAttributeInfo("dmp", "trackingEnabled", 539, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __userFQN = new DmcAttributeInfo("dmp", "userFQN", 524, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:184)
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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:225)
    public final static DmcClassInfo __DMPMessage = new DmcClassInfo("DMPMessage","org.dmd.dmp.shared.generated.dmo.DMPMessageDMO", 1001, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __DMPEvent = new DmcClassInfo("DMPEvent","org.dmd.dmp.shared.generated.dmo.DMPEventDMO", 1018, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __Request = new DmcClassInfo("Request","org.dmd.dmp.shared.generated.dmo.RequestDMO", 1002, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __ActionRequest = new DmcClassInfo("ActionRequest","org.dmd.dmp.shared.generated.dmo.ActionRequestDMO", 1010, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __CreateRequest = new DmcClassInfo("CreateRequest","org.dmd.dmp.shared.generated.dmo.CreateRequestDMO", 1014, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __DeleteRequest = new DmcClassInfo("DeleteRequest","org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO", 1016, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __DenotifyRequest = new DmcClassInfo("DenotifyRequest","org.dmd.dmp.shared.generated.dmo.DenotifyRequestDMO", 1021, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __GetRequest = new DmcClassInfo("GetRequest","org.dmd.dmp.shared.generated.dmo.GetRequestDMO", 1008, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __LoginRequest = new DmcClassInfo("LoginRequest","org.dmd.dmp.shared.generated.dmo.LoginRequestDMO", 1004, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __LogoutRequest = new DmcClassInfo("LogoutRequest","org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO", 1006, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __NotifyRequest = new DmcClassInfo("NotifyRequest","org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO", 1019, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __PreAuthRequest = new DmcClassInfo("PreAuthRequest","org.dmd.dmp.shared.generated.dmo.PreAuthRequestDMO", 1023, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __SetRequest = new DmcClassInfo("SetRequest","org.dmd.dmp.shared.generated.dmo.SetRequestDMO", 1012, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __Response = new DmcClassInfo("Response","org.dmd.dmp.shared.generated.dmo.ResponseDMO", 1003, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __ActionResponse = new DmcClassInfo("ActionResponse","org.dmd.dmp.shared.generated.dmo.ActionResponseDMO", 1011, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __CreateResponse = new DmcClassInfo("CreateResponse","org.dmd.dmp.shared.generated.dmo.CreateResponseDMO", 1015, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __DeleteResponse = new DmcClassInfo("DeleteResponse","org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO", 1017, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __DenotifyResponse = new DmcClassInfo("DenotifyResponse","org.dmd.dmp.shared.generated.dmo.DenotifyResponseDMO", 1022, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __GetResponse = new DmcClassInfo("GetResponse","org.dmd.dmp.shared.generated.dmo.GetResponseDMO", 1009, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __LoginResponse = new DmcClassInfo("LoginResponse","org.dmd.dmp.shared.generated.dmo.LoginResponseDMO", 1005, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __LogoutResponse = new DmcClassInfo("LogoutResponse","org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO", 1007, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __NotifyResponse = new DmcClassInfo("NotifyResponse","org.dmd.dmp.shared.generated.dmo.NotifyResponseDMO", 1020, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __PreAuthResponse = new DmcClassInfo("PreAuthResponse","org.dmd.dmp.shared.generated.dmo.PreAuthResponseDMO", 1024, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __SetResponse = new DmcClassInfo("SetResponse","org.dmd.dmp.shared.generated.dmo.SetResponseDMO", 1013, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Response,null);

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

        DmpDMSAGAMAP.initSmAp(_SmAp);

        DmpDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:308)
    static {


        __DMPMessage.addMust(__requestID);
        __DMPMessage.addMay(MetaDMSAG.__nvp);
        __DMPMessage.addMay(__timeMS);
        __DMPMessage.addMay(__trackingEnabled);

        __Request.addMust(__requestID);
        __Request.addMay(__handlerID);
        __Request.addMay(__notifyOriginator);
        __Request.addMay(MetaDMSAG.__nvp);
        __Request.addMay(__originatorID);
        __Request.addMay(__readableFormat);
        __Request.addMay(__responseFormat);
        __Request.addMay(__sessionID);
        __Request.addMay(__timeMS);
        __Request.addMay(__timeoutSeconds);
        __Request.addMay(__trackingEnabled);
        __Request.addMay(DmrbaseDMSAG.__userName);

        __Response.addMust(__lastResponse);
        __Response.addMust(__requestID);
        __Response.addMust(__responseType);
        __Response.addMay(__handlerID);
        __Response.addMay(MetaDMSAG.__nvp);
        __Response.addMay(__responseCategory);
        __Response.addMay(__responseText);
        __Response.addMay(__timeMS);
        __Response.addMay(__trackingEnabled);

        __LoginRequest.addMust(DmrbaseDMSAG.__password);
        __LoginRequest.addMust(__requestID);
        __LoginRequest.addMust(DmrbaseDMSAG.__userName);
        __LoginRequest.addMay(__handlerID);
        __LoginRequest.addMay(__notifyOriginator);
        __LoginRequest.addMay(MetaDMSAG.__nvp);
        __LoginRequest.addMay(__originatorID);
        __LoginRequest.addMay(__readableFormat);
        __LoginRequest.addMay(__responseFormat);
        __LoginRequest.addMay(__sessionID);
        __LoginRequest.addMay(__timeMS);
        __LoginRequest.addMay(__timeoutSeconds);
        __LoginRequest.addMay(__trackingEnabled);
        __LoginRequest.addMay(DmrbaseDMSAG.__userName);

        __LoginResponse.addMust(__lastResponse);
        __LoginResponse.addMust(__requestID);
        __LoginResponse.addMust(__responseType);
        __LoginResponse.addMay(__handlerID);
        __LoginResponse.addMay(MetaDMSAG.__nvp);
        __LoginResponse.addMay(__originatorID);
        __LoginResponse.addMay(__requestRoot);
        __LoginResponse.addMay(__responseCategory);
        __LoginResponse.addMay(__responseText);
        __LoginResponse.addMay(__sessionID);
        __LoginResponse.addMay(__timeMS);
        __LoginResponse.addMay(__trackingEnabled);
        __LoginResponse.addMay(__userFQN);

        __LogoutRequest.addMust(__requestID);
        __LogoutRequest.addMust(__sessionID);
        __LogoutRequest.addMust(DmrbaseDMSAG.__userName);
        __LogoutRequest.addMay(__handlerID);
        __LogoutRequest.addMay(__notifyOriginator);
        __LogoutRequest.addMay(MetaDMSAG.__nvp);
        __LogoutRequest.addMay(__originatorID);
        __LogoutRequest.addMay(__readableFormat);
        __LogoutRequest.addMay(__responseFormat);
        __LogoutRequest.addMay(__sessionID);
        __LogoutRequest.addMay(__timeMS);
        __LogoutRequest.addMay(__timeoutSeconds);
        __LogoutRequest.addMay(__trackingEnabled);
        __LogoutRequest.addMay(DmrbaseDMSAG.__userName);

        __LogoutResponse.addMust(__lastResponse);
        __LogoutResponse.addMust(__requestID);
        __LogoutResponse.addMust(__responseType);
        __LogoutResponse.addMust(__sessionID);
        __LogoutResponse.addMay(__handlerID);
        __LogoutResponse.addMay(MetaDMSAG.__nvp);
        __LogoutResponse.addMay(__responseCategory);
        __LogoutResponse.addMay(__responseText);
        __LogoutResponse.addMay(__timeMS);
        __LogoutResponse.addMay(__trackingEnabled);

        __GetRequest.addMust(__requestID);
        __GetRequest.addMust(__scope);
        __GetRequest.addMay(__attributeSelector);
        __GetRequest.addMay(__blockingFactor);
        __GetRequest.addMay(__cacheResponse);
        __GetRequest.addMay(MetaDMSAG.__classFilter);
        __GetRequest.addMay(__filter);
        __GetRequest.addMay(__filterByClass);
        __GetRequest.addMay(__handlerID);
        __GetRequest.addMay(__notifyOriginator);
        __GetRequest.addMay(MetaDMSAG.__nvp);
        __GetRequest.addMay(__originatorID);
        __GetRequest.addMay(__readableFormat);
        __GetRequest.addMay(__registerForEvents);
        __GetRequest.addMay(__responseFormat);
        __GetRequest.addMay(__sessionID);
        __GetRequest.addMay(__slice);
        __GetRequest.addMay(__targets);
        __GetRequest.addMay(__timeMS);
        __GetRequest.addMay(__timeoutSeconds);
        __GetRequest.addMay(__trackingEnabled);
        __GetRequest.addMay(DmrbaseDMSAG.__userName);

        __GetResponse.addMust(__lastResponse);
        __GetResponse.addMust(__requestID);
        __GetResponse.addMust(__responseType);
        __GetResponse.addMay(__cacheResponse);
        __GetResponse.addMay(__handlerID);
        __GetResponse.addMay(__listenerID);
        __GetResponse.addMay(MetaDMSAG.__nvp);
        __GetResponse.addMay(__objectList);
        __GetResponse.addMay(__objectsToCome);
        __GetResponse.addMay(__responseCategory);
        __GetResponse.addMay(__responseText);
        __GetResponse.addMay(__targets);
        __GetResponse.addMay(__timeMS);
        __GetResponse.addMay(__trackingEnabled);

        __ActionRequest.addMust(MetaDMSAG.__FQN);
        __ActionRequest.addMust(__actionName);
        __ActionRequest.addMust(__requestID);
        __ActionRequest.addMay(__actionTrigger);
        __ActionRequest.addMay(__handlerID);
        __ActionRequest.addMay(__notifyOriginator);
        __ActionRequest.addMay(MetaDMSAG.__nvp);
        __ActionRequest.addMay(__objectList);
        __ActionRequest.addMay(__originatorID);
        __ActionRequest.addMay(__readableFormat);
        __ActionRequest.addMay(__responseFormat);
        __ActionRequest.addMay(__scope);
        __ActionRequest.addMay(__sessionID);
        __ActionRequest.addMay(__timeMS);
        __ActionRequest.addMay(__timeoutSeconds);
        __ActionRequest.addMay(__trackingEnabled);
        __ActionRequest.addMay(DmrbaseDMSAG.__userName);

        __ActionResponse.addMust(__actionName);
        __ActionResponse.addMust(__lastResponse);
        __ActionResponse.addMust(__requestID);
        __ActionResponse.addMust(__responseType);
        __ActionResponse.addMust(__timeMS);
        __ActionResponse.addMay(__handlerID);
        __ActionResponse.addMay(MetaDMSAG.__nvp);
        __ActionResponse.addMay(__objectList);
        __ActionResponse.addMay(__responseCategory);
        __ActionResponse.addMay(__responseText);
        __ActionResponse.addMay(__timeMS);
        __ActionResponse.addMay(__trackingEnabled);

        __SetRequest.addMust(MetaDMSAG.__modify);
        __SetRequest.addMust(__requestID);
        __SetRequest.addMust(__target);
        __SetRequest.addMay(__handlerID);
        __SetRequest.addMay(__notifyOriginator);
        __SetRequest.addMay(MetaDMSAG.__nvp);
        __SetRequest.addMay(__originatorID);
        __SetRequest.addMay(__readableFormat);
        __SetRequest.addMay(__responseFormat);
        __SetRequest.addMay(__sessionID);
        __SetRequest.addMay(__targetObjectClass);
        __SetRequest.addMay(__timeMS);
        __SetRequest.addMay(__timeoutSeconds);
        __SetRequest.addMay(__trackingEnabled);
        __SetRequest.addMay(DmrbaseDMSAG.__userName);

        __SetResponse.addMust(__lastResponse);
        __SetResponse.addMust(__requestID);
        __SetResponse.addMust(__responseType);
        __SetResponse.addMust(__target);
        __SetResponse.addMust(__timeMS);
        __SetResponse.addMay(__handlerID);
        __SetResponse.addMay(MetaDMSAG.__nvp);
        __SetResponse.addMay(__objectList);
        __SetResponse.addMay(__responseCategory);
        __SetResponse.addMay(__responseText);
        __SetResponse.addMay(__timeMS);
        __SetResponse.addMay(__trackingEnabled);

        __CreateRequest.addMust(__newObject);
        __CreateRequest.addMust(__requestID);
        __CreateRequest.addMay(__handlerID);
        __CreateRequest.addMay(__notifyOriginator);
        __CreateRequest.addMay(MetaDMSAG.__nvp);
        __CreateRequest.addMay(__originatorID);
        __CreateRequest.addMay(__parentName);
        __CreateRequest.addMay(__readableFormat);
        __CreateRequest.addMay(__responseFormat);
        __CreateRequest.addMay(__sessionID);
        __CreateRequest.addMay(__timeMS);
        __CreateRequest.addMay(__timeoutSeconds);
        __CreateRequest.addMay(__trackingEnabled);
        __CreateRequest.addMay(DmrbaseDMSAG.__userName);

        __CreateResponse.addMust(__lastResponse);
        __CreateResponse.addMust(__requestID);
        __CreateResponse.addMust(__responseType);
        __CreateResponse.addMay(__handlerID);
        __CreateResponse.addMay(MetaDMSAG.__nvp);
        __CreateResponse.addMay(__objectList);
        __CreateResponse.addMay(__responseCategory);
        __CreateResponse.addMay(__responseText);
        __CreateResponse.addMay(__timeMS);
        __CreateResponse.addMay(__trackingEnabled);

        __DeleteRequest.addMust(__requestID);
        __DeleteRequest.addMust(__targets);
        __DeleteRequest.addMay(__handlerID);
        __DeleteRequest.addMay(__notifyOriginator);
        __DeleteRequest.addMay(MetaDMSAG.__nvp);
        __DeleteRequest.addMay(__originatorID);
        __DeleteRequest.addMay(__readableFormat);
        __DeleteRequest.addMay(__responseFormat);
        __DeleteRequest.addMay(__scope);
        __DeleteRequest.addMay(__sessionID);
        __DeleteRequest.addMay(__timeMS);
        __DeleteRequest.addMay(__timeoutSeconds);
        __DeleteRequest.addMay(__trackingEnabled);
        __DeleteRequest.addMay(DmrbaseDMSAG.__userName);

        __DeleteResponse.addMust(__lastResponse);
        __DeleteResponse.addMust(__requestID);
        __DeleteResponse.addMust(__responseType);
        __DeleteResponse.addMay(__handlerID);
        __DeleteResponse.addMay(MetaDMSAG.__nvp);
        __DeleteResponse.addMay(__objectList);
        __DeleteResponse.addMay(__responseCategory);
        __DeleteResponse.addMay(__responseText);
        __DeleteResponse.addMay(__timeMS);
        __DeleteResponse.addMay(__trackingEnabled);

        __DMPEvent.addMust(__eventTypeDMP);
        __DMPEvent.addMust(__requestID);
        __DMPEvent.addMay(__handlerID);
        __DMPEvent.addMay(__listenerID);
        __DMPEvent.addMay(MetaDMSAG.__modify);
        __DMPEvent.addMay(__myOwnEvent);
        __DMPEvent.addMay(__notifyOriginator);
        __DMPEvent.addMay(MetaDMSAG.__nvp);
        __DMPEvent.addMay(__originatorID);
        __DMPEvent.addMay(__slice);
        __DMPEvent.addMay(__source);
        __DMPEvent.addMay(__sourceObject);
        __DMPEvent.addMay(__sourceObjectClass);
        __DMPEvent.addMay(__timeMS);
        __DMPEvent.addMay(__trackingEnabled);

        __NotifyRequest.addMust(__requestID);
        __NotifyRequest.addMust(__target);
        __NotifyRequest.addMay(__filter);
        __NotifyRequest.addMay(__handlerID);
        __NotifyRequest.addMay(__notifyOriginator);
        __NotifyRequest.addMay(MetaDMSAG.__nvp);
        __NotifyRequest.addMay(__originatorID);
        __NotifyRequest.addMay(__readableFormat);
        __NotifyRequest.addMay(__responseFormat);
        __NotifyRequest.addMay(__scope);
        __NotifyRequest.addMay(__sessionID);
        __NotifyRequest.addMay(__timeMS);
        __NotifyRequest.addMay(__timeoutSeconds);
        __NotifyRequest.addMay(__trackingEnabled);
        __NotifyRequest.addMay(DmrbaseDMSAG.__userName);

        __NotifyResponse.addMust(__lastResponse);
        __NotifyResponse.addMust(__requestID);
        __NotifyResponse.addMust(__responseType);
        __NotifyResponse.addMay(__handlerID);
        __NotifyResponse.addMay(MetaDMSAG.__nvp);
        __NotifyResponse.addMay(__responseCategory);
        __NotifyResponse.addMay(__responseText);
        __NotifyResponse.addMay(__timeMS);
        __NotifyResponse.addMay(__trackingEnabled);

        __DenotifyRequest.addMust(__requestID);
        __DenotifyRequest.addMust(__target);
        __DenotifyRequest.addMay(__filter);
        __DenotifyRequest.addMay(__handlerID);
        __DenotifyRequest.addMay(__listenerID);
        __DenotifyRequest.addMay(__notifyOriginator);
        __DenotifyRequest.addMay(MetaDMSAG.__nvp);
        __DenotifyRequest.addMay(__originatorID);
        __DenotifyRequest.addMay(__readableFormat);
        __DenotifyRequest.addMay(__responseFormat);
        __DenotifyRequest.addMay(__scope);
        __DenotifyRequest.addMay(__sessionID);
        __DenotifyRequest.addMay(__timeMS);
        __DenotifyRequest.addMay(__timeoutSeconds);
        __DenotifyRequest.addMay(__trackingEnabled);
        __DenotifyRequest.addMay(DmrbaseDMSAG.__userName);

        __DenotifyResponse.addMust(__lastResponse);
        __DenotifyResponse.addMust(__requestID);
        __DenotifyResponse.addMust(__responseType);
        __DenotifyResponse.addMay(__filter);
        __DenotifyResponse.addMay(__handlerID);
        __DenotifyResponse.addMay(MetaDMSAG.__nvp);
        __DenotifyResponse.addMay(__responseCategory);
        __DenotifyResponse.addMay(__responseText);
        __DenotifyResponse.addMay(__scope);
        __DenotifyResponse.addMay(__target);
        __DenotifyResponse.addMay(__timeMS);
        __DenotifyResponse.addMay(__trackingEnabled);

        __PreAuthRequest.addMust(__requestID);
        __PreAuthRequest.addMay(__handlerID);
        __PreAuthRequest.addMay(__notifyOriginator);
        __PreAuthRequest.addMay(MetaDMSAG.__nvp);
        __PreAuthRequest.addMay(__originatorID);
        __PreAuthRequest.addMay(__readableFormat);
        __PreAuthRequest.addMay(__responseFormat);
        __PreAuthRequest.addMay(__sessionID);
        __PreAuthRequest.addMay(__timeMS);
        __PreAuthRequest.addMay(__timeoutSeconds);
        __PreAuthRequest.addMay(__trackingEnabled);
        __PreAuthRequest.addMay(DmrbaseDMSAG.__userName);

        __PreAuthResponse.addMust(__lastResponse);
        __PreAuthResponse.addMust(__requestID);
        __PreAuthResponse.addMust(__responseType);
        __PreAuthResponse.addMay(__applicationName);
        __PreAuthResponse.addMay(__applicationVersion);
        __PreAuthResponse.addMay(__handlerID);
        __PreAuthResponse.addMay(MetaDMSAG.__nvp);
        __PreAuthResponse.addMay(__responseCategory);
        __PreAuthResponse.addMay(__responseText);
        __PreAuthResponse.addMay(__timeMS);
        __PreAuthResponse.addMay(__trackingEnabled);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:360)
    static {


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

