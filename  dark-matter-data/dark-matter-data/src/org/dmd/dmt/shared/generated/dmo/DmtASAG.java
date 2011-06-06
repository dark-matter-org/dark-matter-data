package org.dmd.dmt.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.dmt.shared.generated.types.*;


// Generated from:  org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:73)
public class DmtASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmt";

    public final static DmcAttributeInfo __OUIFilter = new DmcAttributeInfo("OUIFilter", 10407, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __anObjName = new DmcAttributeInfo("anObjName", 10400, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __anotherDmtName = new DmcAttributeInfo("anotherDmtName", 10402, "DmtStringName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __attrIDs = new DmcAttributeInfo("attrIDs", 10406, "AttributeID", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __clientCountFilter = new DmcAttributeInfo("clientCountFilter", 10408, "ClientCountFilter", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __dmtStringName = new DmcAttributeInfo("dmtStringName", 10401, "DmtStringName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __hsDate = new DmcAttributeInfo("hsDate", 10012, "Date", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __hsDouble = new DmcAttributeInfo("hsDouble", 10042, "Double", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __hsFloat = new DmcAttributeInfo("hsFloat", 10052, "Float", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __hsInteger = new DmcAttributeInfo("hsInteger", 10062, "Integer", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __hsLong = new DmcAttributeInfo("hsLong", 10112, "Long", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __hsNames = new DmcAttributeInfo("hsNames", 10411, "NameContainer", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __hsString = new DmcAttributeInfo("hsString", 10142, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __hsTestEnum = new DmcAttributeInfo("hsTestEnum", 10410, "DmtTestEnum", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __intToString = new DmcAttributeInfo("intToString", 10080, "IntegerToString", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvBoolean = new DmcAttributeInfo("mvBoolean", 10001, "Boolean", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvDate = new DmcAttributeInfo("mvDate", 10011, "Date", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvDmcObject = new DmcAttributeInfo("mvDmcObject", 10021, "DmcObject", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvDouble = new DmcAttributeInfo("mvDouble", 10041, "Double", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvFloat = new DmcAttributeInfo("mvFloat", 10051, "Float", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvInteger = new DmcAttributeInfo("mvInteger", 10061, "Integer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvLong = new DmcAttributeInfo("mvLong", 10111, "Long", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvString = new DmcAttributeInfo("mvString", 10141, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvTestBasicNamedObjectFixed = new DmcAttributeInfo("mvTestBasicNamedObjectFixed", 10301, "TestBasicNamedObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __mvTestEnum = new DmcAttributeInfo("mvTestEnum", 10409, "DmtTestEnum", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __nonperString = new DmcAttributeInfo("nonperString", 10413, "String", ValueTypeEnum.HASHSET, DataTypeEnum.NONPERSISTENT, true);
    public final static DmcAttributeInfo __objRef = new DmcAttributeInfo("objRef", 10403, "ObjWithRefs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __objRefHM = new DmcAttributeInfo("objRefHM", 10405, "ObjWithRefs", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __objRefMV = new DmcAttributeInfo("objRefMV", 10404, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __svBoolean = new DmcAttributeInfo("svBoolean", 10000, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __svDate = new DmcAttributeInfo("svDate", 10010, "Date", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __svDmcObject = new DmcAttributeInfo("svDmcObject", 10020, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __svDouble = new DmcAttributeInfo("svDouble", 10040, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __svFloat = new DmcAttributeInfo("svFloat", 10050, "Float", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __svInteger = new DmcAttributeInfo("svInteger", 10060, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __svLong = new DmcAttributeInfo("svLong", 10110, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString", 10140, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __svTestBasicNamedObjectFixed = new DmcAttributeInfo("svTestBasicNamedObjectFixed", 10300, "TestBasicNamedObjectFixed", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __transString = new DmcAttributeInfo("transString", 10412, "String", ValueTypeEnum.HASHSET, DataTypeEnum.TRANSIENT, true);
    public final static DmcAttributeInfo __tsDate = new DmcAttributeInfo("tsDate", 10013, "Date", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __tsDouble = new DmcAttributeInfo("tsDouble", 10043, "Double", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __tsFloat = new DmcAttributeInfo("tsFloat", 10053, "Float", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __tsInteger = new DmcAttributeInfo("tsInteger", 10063, "Integer", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __tsLong = new DmcAttributeInfo("tsLong", 10113, "Long", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __tsString = new DmcAttributeInfo("tsString", 10153, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);

    public final static DmcSliceInfo __slice1 = new DmcSliceInfo("slice1");
    public final static DmcSliceInfo __sliceOfNamed = new DmcSliceInfo("sliceOfNamed");

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__OUIFilter.id,__OUIFilter);
        _SmAp.put(__anObjName.id,__anObjName);
        _SmAp.put(__anotherDmtName.id,__anotherDmtName);
        _SmAp.put(__attrIDs.id,__attrIDs);
        _SmAp.put(__clientCountFilter.id,__clientCountFilter);
        _SmAp.put(__dmtStringName.id,__dmtStringName);
        _SmAp.put(__hsDate.id,__hsDate);
        _SmAp.put(__hsDouble.id,__hsDouble);
        _SmAp.put(__hsFloat.id,__hsFloat);
        _SmAp.put(__hsInteger.id,__hsInteger);
        _SmAp.put(__hsLong.id,__hsLong);
        _SmAp.put(__hsNames.id,__hsNames);
        _SmAp.put(__hsString.id,__hsString);
        _SmAp.put(__hsTestEnum.id,__hsTestEnum);
        _SmAp.put(__intToString.id,__intToString);
        _SmAp.put(__mvBoolean.id,__mvBoolean);
        _SmAp.put(__mvDate.id,__mvDate);
        _SmAp.put(__mvDmcObject.id,__mvDmcObject);
        _SmAp.put(__mvDouble.id,__mvDouble);
        _SmAp.put(__mvFloat.id,__mvFloat);
        _SmAp.put(__mvInteger.id,__mvInteger);
        _SmAp.put(__mvLong.id,__mvLong);
        _SmAp.put(__mvString.id,__mvString);
        _SmAp.put(__mvTestBasicNamedObjectFixed.id,__mvTestBasicNamedObjectFixed);
        _SmAp.put(__mvTestEnum.id,__mvTestEnum);
        _SmAp.put(__nonperString.id,__nonperString);
        _SmAp.put(__objRef.id,__objRef);
        _SmAp.put(__objRefHM.id,__objRefHM);
        _SmAp.put(__objRefMV.id,__objRefMV);
        _SmAp.put(__svBoolean.id,__svBoolean);
        _SmAp.put(__svDate.id,__svDate);
        _SmAp.put(__svDmcObject.id,__svDmcObject);
        _SmAp.put(__svDouble.id,__svDouble);
        _SmAp.put(__svFloat.id,__svFloat);
        _SmAp.put(__svInteger.id,__svInteger);
        _SmAp.put(__svLong.id,__svLong);
        _SmAp.put(__svString.id,__svString);
        _SmAp.put(__svTestBasicNamedObjectFixed.id,__svTestBasicNamedObjectFixed);
        _SmAp.put(__transString.id,__transString);
        _SmAp.put(__tsDate.id,__tsDate);
        _SmAp.put(__tsDouble.id,__tsDouble);
        _SmAp.put(__tsFloat.id,__tsFloat);
        _SmAp.put(__tsInteger.id,__tsInteger);
        _SmAp.put(__tsLong.id,__tsLong);
        _SmAp.put(__tsString.id,__tsString);
        _NmAp.put(DmcTypeDmtStringNameSTATIC.instance.getNameClass(),DmcTypeDmtStringNameSTATIC.instance);

        __slice1.addAttributeID(10000);
        __slice1.addAttributeID(10051);
        _SImAp.put("slice1",__slice1);

        __sliceOfNamed.addAttributeID(10140);
        __sliceOfNamed.addAttributeID(10141);
        __sliceOfNamed.addAttributeID(10409);
        _SImAp.put("sliceOfNamed",__sliceOfNamed);

    }

    static  DmtASAG instance;

    protected DmtASAG (){
    }

    public static DmtASAG instance(){
        if (instance == null)
            instance = new DmtASAG();
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
