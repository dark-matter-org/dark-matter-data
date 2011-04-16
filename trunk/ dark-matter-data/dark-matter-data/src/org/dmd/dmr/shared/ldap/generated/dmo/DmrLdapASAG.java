package org.dmd.dmr.shared.ldap.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;


// Generated from: org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:72)
public class DmrLdapASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmr.ldap";

    public final static DmcAttributeInfo __ldapIdPrefix = new DmcAttributeInfo("ldapIdPrefix", 450, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __reposName = new DmcAttributeInfo("reposName", 451, "String", ValueTypeEnum.SINGLE, true);

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;


    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();
        _SmAp.put(__ldapIdPrefix.id,__ldapIdPrefix);
        _SmAp.put(__reposName.id,__reposName);

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

    }

    static  DmrLdapASAG instance;

    protected DmrLdapASAG (){
    }

    public static DmrLdapASAG instance(){
        if (instance == null)
            instance = new DmrLdapASAG();
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

