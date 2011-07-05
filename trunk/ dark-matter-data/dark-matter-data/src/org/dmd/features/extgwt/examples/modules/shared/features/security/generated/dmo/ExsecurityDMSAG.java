package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:510)
import org.dmd.dms.generated.dmo.MetaDMSAG;               // MetaDMSAG
import org.dmd.dms.generated.enums.ClassTypeEnum;         // Have class definitions
import org.dmd.dms.generated.enums.DataTypeEnum;          // Have class/attribute definitions



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:95)
public class ExsecurityDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "exsecurity";

    public final static DmcClassInfo __User = new DmcClassInfo("User", 5001, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null);
    public final static DmcClassInfo __UserGroup = new DmcClassInfo("UserGroup", 5002, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null);


    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _CmAp.put(__User.id,__User);
        _CmAp.put(__UserGroup.id,__UserGroup);

        __User.addMust(MetaDMSAG.__name);

        __UserGroup.addMust(MetaDMSAG.__name);


    }

    static  ExsecurityDMSAG instance;

    protected ExsecurityDMSAG (){
    }

    public synchronized static ExsecurityDMSAG instance(){
        if (instance == null)
            instance = new ExsecurityDMSAG();
        
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


    public String getSchemaName(){
        return(schemaName);
    }


}

