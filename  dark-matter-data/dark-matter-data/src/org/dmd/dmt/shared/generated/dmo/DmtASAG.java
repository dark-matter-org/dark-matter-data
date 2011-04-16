package org.dmd.dmt.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmt.shared.generated.types.*;


// Generated from: org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:72)
public class DmtASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmt";

    public final static DmcAttributeInfo __anObjName = new DmcAttributeInfo("anObjName", 10400, "NameContainer", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __anotherDmtName = new DmcAttributeInfo("anotherDmtName", 10402, "DmtStringName", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __attrIDs = new DmcAttributeInfo("attrIDs", 10406, "AttributeID", ValueTypeEnum.HASHSET, true);
    public final static DmcAttributeInfo __dmtStringName = new DmcAttributeInfo("dmtStringName", 10401, "DmtStringName", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __hsDate = new DmcAttributeInfo("hsDate", 10012, "Date", ValueTypeEnum.HASHSET, true);
    public final static DmcAttributeInfo __hsDouble = new DmcAttributeInfo("hsDouble", 10042, "Double", ValueTypeEnum.HASHSET, true);
    public final static DmcAttributeInfo __hsFloat = new DmcAttributeInfo("hsFloat", 10052, "Float", ValueTypeEnum.HASHSET, true);
    public final static DmcAttributeInfo __hsInteger = new DmcAttributeInfo("hsInteger", 10062, "Integer", ValueTypeEnum.HASHSET, true);
    public final static DmcAttributeInfo __hsLong = new DmcAttributeInfo("hsLong", 10112, "Long", ValueTypeEnum.HASHSET, true);
    public final static DmcAttributeInfo __hsString = new DmcAttributeInfo("hsString", 10142, "String", ValueTypeEnum.HASHSET, true);
    public final static DmcAttributeInfo __intToString = new DmcAttributeInfo("intToString", 10080, "IntegerToString", ValueTypeEnum.HASHMAPPED, true);
    public final static DmcAttributeInfo __mvBoolean = new DmcAttributeInfo("mvBoolean", 10001, "Boolean", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __mvDate = new DmcAttributeInfo("mvDate", 10011, "Date", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __mvDmcObject = new DmcAttributeInfo("mvDmcObject", 10021, "DmcObject", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __mvDouble = new DmcAttributeInfo("mvDouble", 10041, "Double", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __mvFloat = new DmcAttributeInfo("mvFloat", 10051, "Float", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __mvInteger = new DmcAttributeInfo("mvInteger", 10061, "Integer", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __mvLong = new DmcAttributeInfo("mvLong", 10111, "Long", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __mvString = new DmcAttributeInfo("mvString", 10141, "String", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __mvTestBasicNamedObjectFixed = new DmcAttributeInfo("mvTestBasicNamedObjectFixed", 10301, "TestBasicNamedObjectFixed", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __objRef = new DmcAttributeInfo("objRef", 10403, "ObjWithRefs", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __objRefHM = new DmcAttributeInfo("objRefHM", 10405, "ObjWithRefs", ValueTypeEnum.HASHMAPPED, true);
    public final static DmcAttributeInfo __objRefMV = new DmcAttributeInfo("objRefMV", 10404, "ObjWithRefs", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __svBoolean = new DmcAttributeInfo("svBoolean", 10000, "Boolean", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __svDate = new DmcAttributeInfo("svDate", 10010, "Date", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __svDmcObject = new DmcAttributeInfo("svDmcObject", 10020, "DmcObject", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __svDouble = new DmcAttributeInfo("svDouble", 10040, "Double", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __svFloat = new DmcAttributeInfo("svFloat", 10050, "Float", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __svInteger = new DmcAttributeInfo("svInteger", 10060, "Integer", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __svLong = new DmcAttributeInfo("svLong", 10110, "Long", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString", 10140, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __svTestBasicNamedObjectFixed = new DmcAttributeInfo("svTestBasicNamedObjectFixed", 10300, "TestBasicNamedObjectFixed", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __tsDate = new DmcAttributeInfo("tsDate", 10013, "Date", ValueTypeEnum.TREESET, true);
    public final static DmcAttributeInfo __tsDouble = new DmcAttributeInfo("tsDouble", 10043, "Double", ValueTypeEnum.TREESET, true);
    public final static DmcAttributeInfo __tsFloat = new DmcAttributeInfo("tsFloat", 10053, "Float", ValueTypeEnum.TREESET, true);
    public final static DmcAttributeInfo __tsInteger = new DmcAttributeInfo("tsInteger", 10063, "Integer", ValueTypeEnum.TREESET, true);
    public final static DmcAttributeInfo __tsLong = new DmcAttributeInfo("tsLong", 10113, "Long", ValueTypeEnum.TREESET, true);
    public final static DmcAttributeInfo __tsString = new DmcAttributeInfo("tsString", 10153, "String", ValueTypeEnum.TREESET, true);

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;


    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();
        _SmAp.put(__anObjName.id,__anObjName);
        _SmAp.put(__anotherDmtName.id,__anotherDmtName);
        _SmAp.put(__attrIDs.id,__attrIDs);
        _SmAp.put(__dmtStringName.id,__dmtStringName);
        _SmAp.put(__hsDate.id,__hsDate);
        _SmAp.put(__hsDouble.id,__hsDouble);
        _SmAp.put(__hsFloat.id,__hsFloat);
        _SmAp.put(__hsInteger.id,__hsInteger);
        _SmAp.put(__hsLong.id,__hsLong);
        _SmAp.put(__hsString.id,__hsString);
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
        _SmAp.put(__tsDate.id,__tsDate);
        _SmAp.put(__tsDouble.id,__tsDouble);
        _SmAp.put(__tsFloat.id,__tsFloat);
        _SmAp.put(__tsInteger.id,__tsInteger);
        _SmAp.put(__tsLong.id,__tsLong);
        _SmAp.put(__tsString.id,__tsString);

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();
        _NmAp.put(DmcTypeDmtStringNameSTATIC.instance.getNameClass(),DmcTypeDmtStringNameSTATIC.instance);

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


    public String getSchemaName(){
        return(schemaName);
    }


}

