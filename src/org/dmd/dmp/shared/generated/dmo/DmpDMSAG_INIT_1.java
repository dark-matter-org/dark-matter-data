package org.dmd.dmp.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Required attribute from DmpDMSAG - (DmoCompactSchemaFormatter.java:562)
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;         // Optional attribute (1): userName from DmrbaseDMSAG - (DmoCompactSchemaFormatter.java:566)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // For Meta references - (DmoCompactSchemaFormatter.java:552)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DmpDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- DMPMessage
        DmpDMSAG.__DMPMessage.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__DMPMessage.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__DMPMessage.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__DMPMessage.addMay(DmpDMSAG.__trackingEnabled);

    // 2 -- Request
        DmpDMSAG.__Request.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__Request.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__Request.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__Request.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__Request.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__Request.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__Request.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__Request.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__Request.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__Request.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__Request.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__Request.addMay(DmrbaseDMSAG.__userName);

    // 3 -- Response
        DmpDMSAG.__Response.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__Response.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__Response.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__Response.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__Response.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__Response.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__Response.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__Response.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__Response.addMay(DmpDMSAG.__trackingEnabled);

    // 4 -- LoginRequest
        DmpDMSAG.__LoginRequest.addMust(DmrbaseDMSAG.__password);
        DmpDMSAG.__LoginRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__LoginRequest.addMust(DmrbaseDMSAG.__userName);
        DmpDMSAG.__LoginRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__LoginRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__LoginRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__LoginRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__LoginRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__LoginRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__LoginRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__LoginRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__LoginRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__LoginRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__LoginRequest.addMay(DmrbaseDMSAG.__userName);

    // 5 -- LoginResponse
        DmpDMSAG.__LoginResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__LoginResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__LoginResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__LoginResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__LoginResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__LoginResponse.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__LoginResponse.addMay(DmpDMSAG.__requestRoot);
        DmpDMSAG.__LoginResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__LoginResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__LoginResponse.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__LoginResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__LoginResponse.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__LoginResponse.addMay(DmpDMSAG.__userFQN);

    // 6 -- LogoutRequest
        DmpDMSAG.__LogoutRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__LogoutRequest.addMust(DmpDMSAG.__sessionID);
        DmpDMSAG.__LogoutRequest.addMust(DmrbaseDMSAG.__userName);
        DmpDMSAG.__LogoutRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__LogoutRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__LogoutRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__LogoutRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__LogoutRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__LogoutRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__LogoutRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__LogoutRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__LogoutRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__LogoutRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__LogoutRequest.addMay(DmrbaseDMSAG.__userName);

    // 7 -- LogoutResponse
        DmpDMSAG.__LogoutResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__LogoutResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__LogoutResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__LogoutResponse.addMust(DmpDMSAG.__sessionID);
        DmpDMSAG.__LogoutResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__LogoutResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__LogoutResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__LogoutResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__LogoutResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__LogoutResponse.addMay(DmpDMSAG.__trackingEnabled);

    // 8 -- GetRequest
        DmpDMSAG.__GetRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__GetRequest.addMust(DmpDMSAG.__scope);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__attributeSelector);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__blockingFactor);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__cacheResponse);
        DmpDMSAG.__GetRequest.addMay(MetaDMSAG.__classFilter);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__filter);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__filterByClass);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__GetRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__registerForEvents);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__slice);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__targets);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__GetRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__GetRequest.addMay(DmrbaseDMSAG.__userName);

    // 9 -- GetResponse
        DmpDMSAG.__GetResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__GetResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__GetResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__cacheResponse);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__listenerID);
        DmpDMSAG.__GetResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__objectList);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__objectsToCome);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__targets);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__GetResponse.addMay(DmpDMSAG.__trackingEnabled);

    // 10 -- ActionRequest
        DmpDMSAG.__ActionRequest.addMust(MetaDMSAG.__FQN);
        DmpDMSAG.__ActionRequest.addMust(DmpDMSAG.__actionName);
        DmpDMSAG.__ActionRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__actionTrigger);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__ActionRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__objectList);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__scope);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__ActionRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__ActionRequest.addMay(DmrbaseDMSAG.__userName);

    // 11 -- ActionResponse
        DmpDMSAG.__ActionResponse.addMust(DmpDMSAG.__actionName);
        DmpDMSAG.__ActionResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__ActionResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__ActionResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__ActionResponse.addMust(DmpDMSAG.__timeMS);
        DmpDMSAG.__ActionResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__ActionResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__ActionResponse.addMay(DmpDMSAG.__objectList);
        DmpDMSAG.__ActionResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__ActionResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__ActionResponse.addMay(DmpDMSAG.__serverActionID);
        DmpDMSAG.__ActionResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__ActionResponse.addMay(DmpDMSAG.__trackingEnabled);

    // 12 -- SetRequest
        DmpDMSAG.__SetRequest.addMust(MetaDMSAG.__modify);
        DmpDMSAG.__SetRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__SetRequest.addMust(DmpDMSAG.__target);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__SetRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__targetObjectClass);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__SetRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__SetRequest.addMay(DmrbaseDMSAG.__userName);

    // 13 -- SetResponse
        DmpDMSAG.__SetResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__SetResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__SetResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__SetResponse.addMust(DmpDMSAG.__target);
        DmpDMSAG.__SetResponse.addMust(DmpDMSAG.__timeMS);
        DmpDMSAG.__SetResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__SetResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__SetResponse.addMay(DmpDMSAG.__objectList);
        DmpDMSAG.__SetResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__SetResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__SetResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__SetResponse.addMay(DmpDMSAG.__trackingEnabled);

    // 14 -- CreateRequest
        DmpDMSAG.__CreateRequest.addMust(DmpDMSAG.__newObject);
        DmpDMSAG.__CreateRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__CreateRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__parentName);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__CreateRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__CreateRequest.addMay(DmrbaseDMSAG.__userName);

    // 15 -- CreateResponse
        DmpDMSAG.__CreateResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__CreateResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__CreateResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__CreateResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__CreateResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__CreateResponse.addMay(DmpDMSAG.__objectList);
        DmpDMSAG.__CreateResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__CreateResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__CreateResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__CreateResponse.addMay(DmpDMSAG.__trackingEnabled);

    // 16 -- DeleteRequest
        DmpDMSAG.__DeleteRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__DeleteRequest.addMust(DmpDMSAG.__targets);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__DeleteRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__scope);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__DeleteRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__DeleteRequest.addMay(DmrbaseDMSAG.__userName);

    // 17 -- DeleteResponse
        DmpDMSAG.__DeleteResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__DeleteResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__DeleteResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__DeleteResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__DeleteResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__DeleteResponse.addMay(DmpDMSAG.__objectList);
        DmpDMSAG.__DeleteResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__DeleteResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__DeleteResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__DeleteResponse.addMay(DmpDMSAG.__trackingEnabled);

    // 18 -- DMPEvent
        DmpDMSAG.__DMPEvent.addMust(DmpDMSAG.__eventTypeDMP);
        DmpDMSAG.__DMPEvent.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__listenerID);
        DmpDMSAG.__DMPEvent.addMay(MetaDMSAG.__modify);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__myOwnEvent);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__DMPEvent.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__slice);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__source);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__sourceObject);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__sourceObjectClass);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__DMPEvent.addMay(DmpDMSAG.__trackingEnabled);

    // 19 -- NotifyRequest
        DmpDMSAG.__NotifyRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__NotifyRequest.addMust(DmpDMSAG.__target);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__filter);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__NotifyRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__scope);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__NotifyRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__NotifyRequest.addMay(DmrbaseDMSAG.__userName);

    // 20 -- NotifyResponse
        DmpDMSAG.__NotifyResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__NotifyResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__NotifyResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__NotifyResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__NotifyResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__NotifyResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__NotifyResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__NotifyResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__NotifyResponse.addMay(DmpDMSAG.__trackingEnabled);

    // 21 -- DenotifyRequest
        DmpDMSAG.__DenotifyRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__DenotifyRequest.addMust(DmpDMSAG.__target);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__filter);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__listenerID);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__DenotifyRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__scope);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__DenotifyRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__DenotifyRequest.addMay(DmrbaseDMSAG.__userName);

    // 22 -- DenotifyResponse
        DmpDMSAG.__DenotifyResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__DenotifyResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__DenotifyResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__DenotifyResponse.addMay(DmpDMSAG.__filter);
        DmpDMSAG.__DenotifyResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__DenotifyResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__DenotifyResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__DenotifyResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__DenotifyResponse.addMay(DmpDMSAG.__scope);
        DmpDMSAG.__DenotifyResponse.addMay(DmpDMSAG.__target);
        DmpDMSAG.__DenotifyResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__DenotifyResponse.addMay(DmpDMSAG.__trackingEnabled);

    // 23 -- PreAuthRequest
        DmpDMSAG.__PreAuthRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__PreAuthRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__PreAuthRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__PreAuthRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__PreAuthRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__PreAuthRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__PreAuthRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__PreAuthRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__PreAuthRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__PreAuthRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__PreAuthRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__PreAuthRequest.addMay(DmrbaseDMSAG.__userName);

    // 24 -- PreAuthResponse
        DmpDMSAG.__PreAuthResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__PreAuthResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__PreAuthResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__PreAuthResponse.addMay(DmpDMSAG.__applicationName);
        DmpDMSAG.__PreAuthResponse.addMay(DmpDMSAG.__applicationVersion);
        DmpDMSAG.__PreAuthResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__PreAuthResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__PreAuthResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__PreAuthResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__PreAuthResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__PreAuthResponse.addMay(DmpDMSAG.__trackingEnabled);

    // 25 -- ActionCancelRequest
        DmpDMSAG.__ActionCancelRequest.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__ActionCancelRequest.addMust(DmpDMSAG.__serverActionID);
        DmpDMSAG.__ActionCancelRequest.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__ActionCancelRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmpDMSAG.__ActionCancelRequest.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__ActionCancelRequest.addMay(DmpDMSAG.__originatorID);
        DmpDMSAG.__ActionCancelRequest.addMay(DmpDMSAG.__readableFormat);
        DmpDMSAG.__ActionCancelRequest.addMay(DmpDMSAG.__responseFormat);
        DmpDMSAG.__ActionCancelRequest.addMay(DmpDMSAG.__sessionID);
        DmpDMSAG.__ActionCancelRequest.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__ActionCancelRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmpDMSAG.__ActionCancelRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmpDMSAG.__ActionCancelRequest.addMay(DmrbaseDMSAG.__userName);

    // 26 -- ActionCancelResponse
        DmpDMSAG.__ActionCancelResponse.addMust(DmpDMSAG.__lastResponse);
        DmpDMSAG.__ActionCancelResponse.addMust(DmpDMSAG.__requestID);
        DmpDMSAG.__ActionCancelResponse.addMust(DmpDMSAG.__responseType);
        DmpDMSAG.__ActionCancelResponse.addMay(DmpDMSAG.__handlerID);
        DmpDMSAG.__ActionCancelResponse.addMay(MetaDMSAG.__nvp);
        DmpDMSAG.__ActionCancelResponse.addMay(DmpDMSAG.__responseCategory);
        DmpDMSAG.__ActionCancelResponse.addMay(DmpDMSAG.__responseText);
        DmpDMSAG.__ActionCancelResponse.addMay(DmpDMSAG.__timeMS);
        DmpDMSAG.__ActionCancelResponse.addMay(DmpDMSAG.__trackingEnabled);


    }

}

