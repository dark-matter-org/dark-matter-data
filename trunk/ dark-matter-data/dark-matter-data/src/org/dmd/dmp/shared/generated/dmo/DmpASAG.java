package org.dmd.dmp.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;


// Generated from:  org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:72)
public class DmpASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmp";

    public final static DmcAttributeInfo __FQNList = new DmcAttributeInfo("FQNList", 507, "String", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __actionName = new DmcAttributeInfo("actionName", 515, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __actionTrigger = new DmcAttributeInfo("actionTrigger", 525, "DmcObject", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __blockingFactor = new DmcAttributeInfo("blockingFactor", 519, "Integer", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __eventObject = new DmcAttributeInfo("eventObject", 514, "DmcObject", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __eventTypeDMP = new DmcAttributeInfo("eventTypeDMP", 523, "DMPEventTypeEnum", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("filter", 520, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __filterByClass = new DmcAttributeInfo("filterByClass", 521, "ClassDefinition", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID", 532, "Integer", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("lastResponse", 510, "Boolean", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __modify = new DmcAttributeInfo("modify", 522, "Modifier", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __newObject = new DmcAttributeInfo("newObject", 513, "DmcObject", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __notifyOriginator = new DmcAttributeInfo("notifyOriginator", 527, "Boolean", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __objClass = new DmcAttributeInfo("objClass", 509, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __objName = new DmcAttributeInfo("objName", 508, "DmcAttribute", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __objectList = new DmcAttributeInfo("objectList", 512, "DmcObject", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("originatorID", 526, "Integer", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __parentName = new DmcAttributeInfo("parentName", 529, "DmcAttribute", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat", 517, "Boolean", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __registerForEvents = new DmcAttributeInfo("registerForEvents", 531, "Boolean", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID", 501, "Integer", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __requestRoot = new DmcAttributeInfo("requestRoot", 503, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("responseCategory", 505, "ResponseCategoryEnum", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat", 516, "ResponseFormatEnum", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("responseText", 506, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("responseType", 504, "ResponseTypeEnum", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope", 511, "ScopeEnum", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID", 502, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __targetObject = new DmcAttributeInfo("targetObject", 530, "NameContainer", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS", 518, "Long", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __userFQN = new DmcAttributeInfo("userFQN", 524, "String", ValueTypeEnum.SINGLE, true);

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;


    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();
        _SmAp.put(__FQNList.id,__FQNList);
        _SmAp.put(__actionName.id,__actionName);
        _SmAp.put(__actionTrigger.id,__actionTrigger);
        _SmAp.put(__blockingFactor.id,__blockingFactor);
        _SmAp.put(__eventObject.id,__eventObject);
        _SmAp.put(__eventTypeDMP.id,__eventTypeDMP);
        _SmAp.put(__filter.id,__filter);
        _SmAp.put(__filterByClass.id,__filterByClass);
        _SmAp.put(__handlerID.id,__handlerID);
        _SmAp.put(__lastResponse.id,__lastResponse);
        _SmAp.put(__modify.id,__modify);
        _SmAp.put(__newObject.id,__newObject);
        _SmAp.put(__notifyOriginator.id,__notifyOriginator);
        _SmAp.put(__objClass.id,__objClass);
        _SmAp.put(__objName.id,__objName);
        _SmAp.put(__objectList.id,__objectList);
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
        _SmAp.put(__targetObject.id,__targetObject);
        _SmAp.put(__timeMS.id,__timeMS);
        _SmAp.put(__userFQN.id,__userFQN);

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

    }

    static  DmpASAG instance;

    protected DmpASAG (){
    }

    public static DmpASAG instance(){
        if (instance == null)
            instance = new DmpASAG();
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


    public String getSchemaName(){
        return(schemaName);
    }


}

