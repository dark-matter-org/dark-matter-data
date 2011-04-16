package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;


// Generated from: org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:72)
public class ExsecurityASAG implements DmcAttributeSchemaIF {


    static String schemaName = "exsecurity";


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;


    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

    }

    static  ExsecurityASAG instance;

    protected ExsecurityASAG (){
    }

    public static ExsecurityASAG instance(){
        if (instance == null)
            instance = new ExsecurityASAG();
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

