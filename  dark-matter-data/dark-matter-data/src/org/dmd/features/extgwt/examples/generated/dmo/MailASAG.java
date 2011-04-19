package org.dmd.features.extgwt.examples.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;


// Generated from:  org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:72)
public class MailASAG implements DmcAttributeSchemaIF {


    static String schemaName = "mail";

    public final static DmcAttributeInfo __body = new DmcAttributeInfo("body", 905, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __email = new DmcAttributeInfo("email", 903, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __folderID = new DmcAttributeInfo("folderID", 900, "Integer", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __mailID = new DmcAttributeInfo("mailID", 901, "IntegerName", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __sender = new DmcAttributeInfo("sender", 902, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __subject = new DmcAttributeInfo("subject", 904, "String", ValueTypeEnum.SINGLE, true);

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();
        _SmAp.put(__body.id,__body);
        _SmAp.put(__email.id,__email);
        _SmAp.put(__folderID.id,__folderID);
        _SmAp.put(__mailID.id,__mailID);
        _SmAp.put(__sender.id,__sender);
        _SmAp.put(__subject.id,__subject);

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

    }

    static  MailASAG instance;

    protected MailASAG (){
    }

    public static MailASAG instance(){
        if (instance == null)
            instance = new MailASAG();
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

