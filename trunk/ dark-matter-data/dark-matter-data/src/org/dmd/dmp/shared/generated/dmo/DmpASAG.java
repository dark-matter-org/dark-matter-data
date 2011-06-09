package org.dmd.dmp.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from: org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:73)
public class DmpASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmp";

    public final static DmcAttributeInfo __FQNList = new DmcAttributeInfo("FQNList", 507, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __actionName = new DmcAttributeInfo("actionName", 515, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __actionTrigger = new DmcAttributeInfo("actionTrigger", 525, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __attributeSelector = new DmcAttributeInfo("attributeSelector", 533, "AttributeID", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __blockingFactor = new DmcAttributeInfo("blockingFactor", 519, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __cacheResponse = new DmcAttributeInfo("cacheResponse", 534, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __eventTypeDMP = new DmcAttributeInfo("eventTypeDMP", 523, "DMPEventTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __filter = new DmcAttributeInfo("filter", 520, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __filterByClass = new DmcAttributeInfo("filterByClass", 521, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID", 531, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("lastResponse", 510, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __modify = new DmcAttributeInfo("modify", 522, "Modifier", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __newObject = new DmcAttributeInfo("newObject", 513, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __notifyOriginator = new DmcAttributeInfo("notifyOriginator", 527, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __objectList = new DmcAttributeInfo("objectList", 512, "DmcObject", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("originatorID", 526, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __parentName = new DmcAttributeInfo("parentName", 529, "DmcAttribute", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat", 517, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __registerForEvents = new DmcAttributeInfo("registerForEvents", 530, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID", 501, "Integer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __requestRoot = new DmcAttributeInfo("requestRoot", 503, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("responseCategory", 505, "ResponseCategoryEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat", 516, "ResponseFormatEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("responseText", 506, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("responseType", 504, "ResponseTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope", 511, "ScopeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID", 502, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __slice = new DmcAttributeInfo("slice", 535, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __source = new DmcAttributeInfo("source", 532, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sourceObject = new DmcAttributeInfo("sourceObject", 514, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sourceObjectClass = new DmcAttributeInfo("sourceObjectClass", 509, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __target = new DmcAttributeInfo("target", 508, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __targetObjectClass = new DmcAttributeInfo("targetObjectClass", 536, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __targets = new DmcAttributeInfo("targets", 537, "NameContainer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS", 518, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userFQN = new DmcAttributeInfo("userFQN", 524, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__FQNList.id,__FQNList);
        _SmAp.put(__actionName.id,__actionName);
        _SmAp.put(__actionTrigger.id,__actionTrigger);
        _SmAp.put(__attributeSelector.id,__attributeSelector);
        _SmAp.put(__blockingFactor.id,__blockingFactor);
        _SmAp.put(__cacheResponse.id,__cacheResponse);
        _SmAp.put(__eventTypeDMP.id,__eventTypeDMP);
        _SmAp.put(__filter.id,__filter);
        _SmAp.put(__filterByClass.id,__filterByClass);
        _SmAp.put(__handlerID.id,__handlerID);
        _SmAp.put(__lastResponse.id,__lastResponse);
        _SmAp.put(__modify.id,__modify);
        _SmAp.put(__newObject.id,__newObject);
        _SmAp.put(__notifyOriginator.id,__notifyOriginator);
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
        _SmAp.put(__slice.id,__slice);
        _SmAp.put(__source.id,__source);
        _SmAp.put(__sourceObject.id,__sourceObject);
        _SmAp.put(__sourceObjectClass.id,__sourceObjectClass);
        _SmAp.put(__target.id,__target);
        _SmAp.put(__targetObjectClass.id,__targetObjectClass);
        _SmAp.put(__targets.id,__targets);
        _SmAp.put(__timeMS.id,__timeMS);
        _SmAp.put(__userFQN.id,__userFQN);

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


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


}

