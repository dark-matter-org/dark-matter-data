package org.dmd.features.extgwt.examples.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:515)
import org.dmd.dms.generated.dmo.MetaDMSAG;               // MetaDMSAG
import org.dmd.dms.generated.enums.ClassTypeEnum;         // Have class definitions
import org.dmd.dms.generated.enums.DataTypeEnum;          // Have class/attribute definitions
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Have attribute definitions



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:95)
public class MailDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "mail";

    public final static DmcAttributeInfo __body = new DmcAttributeInfo("body", 905, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __email = new DmcAttributeInfo("email", 903, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __folderID = new DmcAttributeInfo("folderID", 900, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mailID = new DmcAttributeInfo("mailID", 901, "IntegerName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sender = new DmcAttributeInfo("sender", 902, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __subject = new DmcAttributeInfo("subject", 904, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcClassInfo __Folder = new DmcClassInfo("Folder", 901, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __MailItem = new DmcClassInfo("MailItem", 902, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MailDMSAG.__mailID);


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

        _SmAp.put(__body.id,__body);
        _SmAp.put(__email.id,__email);
        _SmAp.put(__folderID.id,__folderID);
        _SmAp.put(__mailID.id,__mailID);
        _SmAp.put(__sender.id,__sender);
        _SmAp.put(__subject.id,__subject);
        _CmAp.put(__Folder.id,__Folder);
        _CmAp.put(__MailItem.id,__MailItem);

        __Folder.addMust(MetaDMSAG.__name);
        __Folder.addMay(__folderID);

        __MailItem.addMust(__mailID);
        __MailItem.addMust(__sender);
        __MailItem.addMust(__email);
        __MailItem.addMust(__subject);
        __MailItem.addMust(__body);


    }

    static  MailDMSAG instance;

    protected MailDMSAG (){
    }

    public synchronized static MailDMSAG instance(){
        if (instance == null)
            instance = new MailDMSAG();
        
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

