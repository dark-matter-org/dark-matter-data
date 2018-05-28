package org.dmd.dmp.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1237)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:1152)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:1151)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:1153)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1154)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1155)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1159)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1160)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1165)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1205)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
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
    public final static DmcAttributeInfo __serverActionID = new DmcAttributeInfo("dmp", "serverActionID", 546, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_ActionCancelRequest = new DmcTypeInfo("ActionCancelRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ActionCancelResponse = new DmcTypeInfo("ActionCancelResponse", OriginalTypeEnum.OBJECT);
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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __DMPMessage = new DmcClassInfo("DMPMessage","org.dmd.dmp.shared.generated.dmo.DMPMessageDMO", 1001, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __DMPEvent = new DmcClassInfo("DMPEvent","org.dmd.dmp.shared.generated.dmo.DMPEventDMO", 1018, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __Request = new DmcClassInfo("Request","org.dmd.dmp.shared.generated.dmo.RequestDMO", 1002, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__DMPMessage,null);
    public final static DmcClassInfo __ActionCancelRequest = new DmcClassInfo("ActionCancelRequest","org.dmd.dmp.shared.generated.dmo.ActionCancelRequestDMO", 1025, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Request,null);
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
    public final static DmcClassInfo __ActionCancelResponse = new DmcClassInfo("ActionCancelResponse","org.dmd.dmp.shared.generated.dmo.ActionCancelResponseDMO", 1026, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,__Response,null);
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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        DmpDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
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

