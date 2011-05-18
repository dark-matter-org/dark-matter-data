package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from: org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:73)
public class MvwASAG implements DmcAttributeSchemaIF {


    static String schemaName = "mvw";

    public final static DmcAttributeInfo __argVector = new DmcAttributeInfo("argVector", 803, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __broadcast = new DmcAttributeInfo("broadcast", 822, "EventWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __broadcastOnly = new DmcAttributeInfo("broadcastOnly", 823, "EventWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __clickEvent = new DmcAttributeInfo("clickEvent", 819, "OperationSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __componentName = new DmcAttributeInfo("componentName", 811, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __createEvent = new DmcAttributeInfo("createEvent", 821, "OperationSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule", 800, "Module", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __deleteEvent = new DmcAttributeInfo("deleteEvent", 818, "EventSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __dependsOnModule = new DmcAttributeInfo("dependsOnModule", 805, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __dependsOnSchema = new DmcAttributeInfo("dependsOnSchema", 808, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __displayDMO = new DmcAttributeInfo("displayDMO", 816, "DisplayDataSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __eventName = new DmcAttributeInfo("eventName", 809, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent", 801, "MvwEvent", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent", 802, "MvwEvent", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __isWidget = new DmcAttributeInfo("isWidget", 813, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __localEvent = new DmcAttributeInfo("localEvent", 814, "EventWithArgs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __modifyEvent = new DmcAttributeInfo("modifyEvent", 820, "OperationSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __moduleName = new DmcAttributeInfo("moduleName", 810, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __presenterMethod = new DmcAttributeInfo("presenterMethod", 824, "MethodWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __selectEvent = new DmcAttributeInfo("selectEvent", 817, "EventSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __selectedDMO = new DmcAttributeInfo("selectedDMO", 806, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __useBaseClass = new DmcAttributeInfo("useBaseClass", 807, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userDataImport = new DmcAttributeInfo("userDataImport", 804, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __viewMethod = new DmcAttributeInfo("viewMethod", 825, "MethodWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __viewName = new DmcAttributeInfo("viewName", 812, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__argVector.id,__argVector);
        _SmAp.put(__broadcast.id,__broadcast);
        _SmAp.put(__broadcastOnly.id,__broadcastOnly);
        _SmAp.put(__clickEvent.id,__clickEvent);
        _SmAp.put(__componentName.id,__componentName);
        _SmAp.put(__createEvent.id,__createEvent);
        _SmAp.put(__definedInModule.id,__definedInModule);
        _SmAp.put(__deleteEvent.id,__deleteEvent);
        _SmAp.put(__dependsOnModule.id,__dependsOnModule);
        _SmAp.put(__dependsOnSchema.id,__dependsOnSchema);
        _SmAp.put(__displayDMO.id,__displayDMO);
        _SmAp.put(__eventName.id,__eventName);
        _SmAp.put(__firesEvent.id,__firesEvent);
        _SmAp.put(__handlesEvent.id,__handlesEvent);
        _SmAp.put(__isWidget.id,__isWidget);
        _SmAp.put(__localEvent.id,__localEvent);
        _SmAp.put(__modifyEvent.id,__modifyEvent);
        _SmAp.put(__moduleName.id,__moduleName);
        _SmAp.put(__presenterMethod.id,__presenterMethod);
        _SmAp.put(__selectEvent.id,__selectEvent);
        _SmAp.put(__selectedDMO.id,__selectedDMO);
        _SmAp.put(__useBaseClass.id,__useBaseClass);
        _SmAp.put(__userDataImport.id,__userDataImport);
        _SmAp.put(__viewMethod.id,__viewMethod);
        _SmAp.put(__viewName.id,__viewName);

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

