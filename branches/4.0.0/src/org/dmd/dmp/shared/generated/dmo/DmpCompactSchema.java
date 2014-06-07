package org.dmd.dmp.shared.generated.dmo;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.dmogen.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:629)
import java.util.ArrayList;                                         // For storage of schema info - (DmoCompactSchemaFormatter.java:558)
import java.util.HashMap;                                           // For storage of schema info - (DmoCompactSchemaFormatter.java:557)
import java.util.Iterator;                                          // For access of schema info - (DmoCompactSchemaFormatter.java:559)
import org.dmd.core.interfaces.DmcFilterBuilderIF;                  // To support filter builders - (DmoCompactSchemaFormatter.java:563)
import org.dmd.core.interfaces.DmcNameBuilderIF;                    // To support name builders - (DmoCompactSchemaFormatter.java:562)
import org.dmd.core.rules.RuleIF;                                   // For rule info - (DmoCompactSchemaFormatter.java:561)
import org.dmd.core.schema.*;                                       // Core schema - (DmoCompactSchemaFormatter.java:560)
import org.dmd.dms.shared.generated.dmo.MetaCompactSchema;          // Required attribute from MetaCompactSchema - (DmoCompactSchemaFormatter.java:579)
import org.dmd.dms.shared.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:566)
import org.dmd.dms.shared.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:567)
import org.dmd.dms.shared.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:571)
import org.dmd.dms.shared.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:595)




// Generated from: org.dmd.dms.tools.generation.dmogen.DmoCompactSchemaFormatter.dumpCompactSchema(DmoCompactSchemaFormatter.java:127)
public class DmpCompactSchema implements DmcCompactSchemaIF {


    static String schemaName = "dmp";


    static int schemaBaseID = 500;


    static int schemaIDRange = 50;


    static int schemaMaxID = 550;

    public final static DmcAttributeInfo __FQNList = new DmcAttributeInfo("dmp", "FQNList", 7, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __actionName = new DmcAttributeInfo("dmp", "actionName", 15, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __actionTrigger = new DmcAttributeInfo("dmp", "actionTrigger", 25, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __applicationName = new DmcAttributeInfo("dmp", "applicationName", 41, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __applicationVersion = new DmcAttributeInfo("dmp", "applicationVersion", 42, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __attributeSelector = new DmcAttributeInfo("dmp", "attributeSelector", 33, "AttributeID", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __blockingFactor = new DmcAttributeInfo("dmp", "blockingFactor", 19, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __cacheResponse = new DmcAttributeInfo("dmp", "cacheResponse", 34, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __eventChannelReady = new DmcAttributeInfo("dmp", "eventChannelReady", 45, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __eventTypeDMP = new DmcAttributeInfo("dmp", "eventTypeDMP", 23, "DMPEventTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("dmp", "filter", 20, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __filterByClass = new DmcAttributeInfo("dmp", "filterByClass", 21, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("dmp", "handlerID", 31, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("dmp", "lastResponse", 10, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __listenerID = new DmcAttributeInfo("dmp", "listenerID", 38, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __myOwnEvent = new DmcAttributeInfo("dmp", "myOwnEvent", 43, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __newObject = new DmcAttributeInfo("dmp", "newObject", 13, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __notifyOriginator = new DmcAttributeInfo("dmp", "notifyOriginator", 27, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __objectList = new DmcAttributeInfo("dmp", "objectList", 12, "DmcObject", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __objectsToCome = new DmcAttributeInfo("dmp", "objectsToCome", 44, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("dmp", "originatorID", 26, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __parentName = new DmcAttributeInfo("dmp", "parentName", 29, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __password = new DmcAttributeInfo("dmp", "password", 47, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("dmp", "readableFormat", 17, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __registerForEvents = new DmcAttributeInfo("dmp", "registerForEvents", 30, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("dmp", "requestID", 1, "Integer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __requestRoot = new DmcAttributeInfo("dmp", "requestRoot", 3, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("dmp", "responseCategory", 5, "ResponseCategoryEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("dmp", "responseFormat", 16, "ResponseFormatEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("dmp", "responseText", 6, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("dmp", "responseType", 4, "ResponseTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("dmp", "scope", 11, "ScopeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("dmp", "sessionID", 2, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __slice = new DmcAttributeInfo("dmp", "slice", 35, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __source = new DmcAttributeInfo("dmp", "source", 32, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sourceObject = new DmcAttributeInfo("dmp", "sourceObject", 14, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sourceObjectClass = new DmcAttributeInfo("dmp", "sourceObjectClass", 9, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __target = new DmcAttributeInfo("dmp", "target", 8, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __targetObjectClass = new DmcAttributeInfo("dmp", "targetObjectClass", 36, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __targets = new DmcAttributeInfo("dmp", "targets", 37, "NameContainer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("dmp", "timeMS", 18, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __timeoutSeconds = new DmcAttributeInfo("dmp", "timeoutSeconds", 40, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __trackingEnabled = new DmcAttributeInfo("dmp", "trackingEnabled", 39, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __userFQN = new DmcAttributeInfo("dmp", "userFQN", 24, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("dmp", "userName", 46, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.tools.generation.dmogen.DmoCompactSchemaFormatter.dumpCompactSchema(DmoCompactSchemaFormatter.java:176)
    public final static DmcTypeInfo __type_ActionRequest = new DmcTypeInfo("ActionRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_ActionResponse = new DmcTypeInfo("ActionResponse", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_CreateRequest = new DmcTypeInfo("CreateRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_CreateResponse = new DmcTypeInfo("CreateResponse", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DMPEvent = new DmcTypeInfo("DMPEvent", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DMPEventTypeEnum = new DmcTypeInfo("DMPEventTypeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_DMPMessage = new DmcTypeInfo("DMPMessage", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DeleteRequest = new DmcTypeInfo("DeleteRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DeleteResponse = new DmcTypeInfo("DeleteResponse", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DenotifyRequest = new DmcTypeInfo("DenotifyRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DenotifyResponse = new DmcTypeInfo("DenotifyResponse", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_FileModeEnum = new DmcTypeInfo("FileModeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_GetRequest = new DmcTypeInfo("GetRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_GetResponse = new DmcTypeInfo("GetResponse", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_LoginRequest = new DmcTypeInfo("LoginRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_LoginResponse = new DmcTypeInfo("LoginResponse", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_LogoutRequest = new DmcTypeInfo("LogoutRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_LogoutResponse = new DmcTypeInfo("LogoutResponse", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_NotifyRequest = new DmcTypeInfo("NotifyRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_NotifyResponse = new DmcTypeInfo("NotifyResponse", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_PreAuthRequest = new DmcTypeInfo("PreAuthRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_PreAuthResponse = new DmcTypeInfo("PreAuthResponse", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_Request = new DmcTypeInfo("Request", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_Response = new DmcTypeInfo("Response", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_ResponseCategoryEnum = new DmcTypeInfo("ResponseCategoryEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ResponseFormatEnum = new DmcTypeInfo("ResponseFormatEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ResponseTypeEnum = new DmcTypeInfo("ResponseTypeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ScopeEnum = new DmcTypeInfo("ScopeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_SetRequest = new DmcTypeInfo("SetRequest", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_SetResponse = new DmcTypeInfo("SetResponse", OriginalTypeEnum.COMPLEXTYPE);

    // Generated from: org.dmd.dms.tools.generation.dmogen.DmoCompactSchemaFormatter.dumpCompactSchema(DmoCompactSchemaFormatter.java:219)
    public final static DmcClassInfo __DMPMessage = new DmcClassInfo("DMPMessage","org.dmd.dmp.sharedgenerated.dmo.DMPMessageDMO", 1, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __DMPEvent = new DmcClassInfo("DMPEvent","org.dmd.dmp.sharedgenerated.dmo.DMPEventDMO", 18, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __Request = new DmcClassInfo("Request","org.dmd.dmp.sharedgenerated.dmo.RequestDMO", 2, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __ActionRequest = new DmcClassInfo("ActionRequest","org.dmd.dmp.sharedgenerated.dmo.ActionRequestDMO", 10, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __CreateRequest = new DmcClassInfo("CreateRequest","org.dmd.dmp.sharedgenerated.dmo.CreateRequestDMO", 14, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __DeleteRequest = new DmcClassInfo("DeleteRequest","org.dmd.dmp.sharedgenerated.dmo.DeleteRequestDMO", 16, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __DenotifyRequest = new DmcClassInfo("DenotifyRequest","org.dmd.dmp.sharedgenerated.dmo.DenotifyRequestDMO", 21, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __GetRequest = new DmcClassInfo("GetRequest","org.dmd.dmp.sharedgenerated.dmo.GetRequestDMO", 8, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __LoginRequest = new DmcClassInfo("LoginRequest","org.dmd.dmp.sharedgenerated.dmo.LoginRequestDMO", 4, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __LogoutRequest = new DmcClassInfo("LogoutRequest","org.dmd.dmp.sharedgenerated.dmo.LogoutRequestDMO", 6, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __NotifyRequest = new DmcClassInfo("NotifyRequest","org.dmd.dmp.sharedgenerated.dmo.NotifyRequestDMO", 19, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __PreAuthRequest = new DmcClassInfo("PreAuthRequest","org.dmd.dmp.sharedgenerated.dmo.PreAuthRequestDMO", 23, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __SetRequest = new DmcClassInfo("SetRequest","org.dmd.dmp.sharedgenerated.dmo.SetRequestDMO", 12, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Request,null);
    public final static DmcClassInfo __Response = new DmcClassInfo("Response","org.dmd.dmp.sharedgenerated.dmo.ResponseDMO", 3, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __ActionResponse = new DmcClassInfo("ActionResponse","org.dmd.dmp.sharedgenerated.dmo.ActionResponseDMO", 11, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __CreateResponse = new DmcClassInfo("CreateResponse","org.dmd.dmp.sharedgenerated.dmo.CreateResponseDMO", 15, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __DeleteResponse = new DmcClassInfo("DeleteResponse","org.dmd.dmp.sharedgenerated.dmo.DeleteResponseDMO", 17, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __DenotifyResponse = new DmcClassInfo("DenotifyResponse","org.dmd.dmp.sharedgenerated.dmo.DenotifyResponseDMO", 22, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __GetResponse = new DmcClassInfo("GetResponse","org.dmd.dmp.sharedgenerated.dmo.GetResponseDMO", 9, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __LoginResponse = new DmcClassInfo("LoginResponse","org.dmd.dmp.sharedgenerated.dmo.LoginResponseDMO", 5, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __LogoutResponse = new DmcClassInfo("LogoutResponse","org.dmd.dmp.sharedgenerated.dmo.LogoutResponseDMO", 7, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __NotifyResponse = new DmcClassInfo("NotifyResponse","org.dmd.dmp.sharedgenerated.dmo.NotifyResponseDMO", 20, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __PreAuthResponse = new DmcClassInfo("PreAuthResponse","org.dmd.dmp.sharedgenerated.dmo.PreAuthResponseDMO", 24, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Response,null);
    public final static DmcClassInfo __SetResponse = new DmcClassInfo("SetResponse","org.dmd.dmp.sharedgenerated.dmo.SetResponseDMO", 13, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Response,null);

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

        DmpCompactSchemaAMAP.initSmAp(_SmAp);

        DmpCompactSchemaCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.tools.generation.dmogen.DmoCompactSchemaFormatter.dumpCompactSchema(DmoCompactSchemaFormatter.java:279)
    static {


        __ActionRequest.addMust(MetaCompactSchema.__FQN);
        __ActionRequest.addMust(__actionName);
        __ActionRequest.addMay(__scope);
        __ActionRequest.addMay(__objectList);
        __ActionRequest.addMay(__actionTrigger);

        __ActionResponse.addMust(__timeMS);
        __ActionResponse.addMust(__actionName);
        __ActionResponse.addMay(__objectList);

        __CreateRequest.addMust(__requestID);
        __CreateRequest.addMust(__newObject);
        __CreateRequest.addMay(__parentName);

        __CreateResponse.addMay(__objectList);

        __DMPEvent.addMust(__eventTypeDMP);
        __DMPEvent.addMay(__source);
        __DMPEvent.addMay(__sourceObjectClass);
        __DMPEvent.addMay(MetaCompactSchema.__modify);
        __DMPEvent.addMay(__sourceObject);
        __DMPEvent.addMay(__originatorID);
        __DMPEvent.addMay(__handlerID);
        __DMPEvent.addMay(__notifyOriginator);
        __DMPEvent.addMay(__slice);
        __DMPEvent.addMay(__listenerID);
        __DMPEvent.addMay(__myOwnEvent);

        __DMPMessage.addMust(__requestID);
        __DMPMessage.addMay(__timeMS);
        __DMPMessage.addMay(__trackingEnabled);

        __DeleteRequest.addMust(__targets);
        __DeleteRequest.addMay(__scope);

        __DeleteResponse.addMay(__objectList);

        __DenotifyRequest.addMust(__target);
        __DenotifyRequest.addMay(__listenerID);
        __DenotifyRequest.addMay(__scope);
        __DenotifyRequest.addMay(__filter);

        __DenotifyResponse.addMay(__target);
        __DenotifyResponse.addMay(__scope);
        __DenotifyResponse.addMay(__filter);

        __GetRequest.addMust(__scope);
        __GetRequest.addMay(__targets);
        __GetRequest.addMay(__filter);
        __GetRequest.addMay(__filterByClass);
        __GetRequest.addMay(__blockingFactor);
        __GetRequest.addMay(__registerForEvents);
        __GetRequest.addMay(__attributeSelector);
        __GetRequest.addMay(__cacheResponse);
        __GetRequest.addMay(__slice);
        __GetRequest.addMay(MetaCompactSchema.__classFilter);

        __GetResponse.addMay(__targets);
        __GetResponse.addMay(__objectList);
        __GetResponse.addMay(__cacheResponse);
        __GetResponse.addMay(__listenerID);
        __GetResponse.addMay(__objectsToCome);

        __LoginRequest.addMust(__userName);
        __LoginRequest.addMust(__password);

        __LoginResponse.addMay(__sessionID);
        __LoginResponse.addMay(__originatorID);
        __LoginResponse.addMay(__requestRoot);
        __LoginResponse.addMay(__userFQN);

        __LogoutRequest.addMust(__userName);
        __LogoutRequest.addMust(__sessionID);

        __LogoutResponse.addMust(__sessionID);

        __NotifyRequest.addMust(__target);
        __NotifyRequest.addMay(__scope);
        __NotifyRequest.addMay(__filter);



        __PreAuthResponse.addMay(__applicationName);
        __PreAuthResponse.addMay(__applicationVersion);

        __Request.addMay(__handlerID);
        __Request.addMay(__sessionID);
        __Request.addMay(__readableFormat);
        __Request.addMay(__responseFormat);
        __Request.addMay(__originatorID);
        __Request.addMay(__timeoutSeconds);
        __Request.addMay(__notifyOriginator);
        __Request.addMay(__userName);

        __Response.addMust(__lastResponse);
        __Response.addMust(__responseType);
        __Response.addMay(__handlerID);
        __Response.addMay(__responseText);
        __Response.addMay(__responseCategory);

        __SetRequest.addMust(__target);
        __SetRequest.addMust(MetaCompactSchema.__modify);
        __SetRequest.addMay(__targetObjectClass);

        __SetResponse.addMust(__timeMS);
        __SetResponse.addMust(__target);
        __SetResponse.addMay(__objectList);

    }

    // Generated from: org.dmd.dms.tools.generation.dmogen.DmoCompactSchemaFormatter.dumpCompactSchema(DmoCompactSchemaFormatter.java:327)
    static {


    }

    static  DmpCompactSchema instance;

    protected DmpCompactSchema (){
    }

    public synchronized static DmpCompactSchema instance(){
        if (instance == null)
            instance = new DmpCompactSchema();
        
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

