package org.dmd.dmr.shared.ldap.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1232)
import java.util.ArrayList;                                        // For storage of schema info - (DmoCompactSchemaFormatter.java:1147)
import java.util.HashMap;                                          // For storage of schema info - (DmoCompactSchemaFormatter.java:1146)
import java.util.Iterator;                                         // For access of schema info - (DmoCompactSchemaFormatter.java:1148)
import org.dmd.dmc.*;                                              // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1149)
import org.dmd.dmc.rules.RuleIF;                                   // For rule info - (DmoCompactSchemaFormatter.java:1150)
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;         // Base class from DmrbaseDMSAG - (DmoCompactSchemaFormatter.java:1185)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Naming attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1191)
import org.dmd.dms.generated.enums.ClassTypeEnum;                  // Have class definitions - (DmoCompactSchemaFormatter.java:1154)
import org.dmd.dms.generated.enums.DataTypeEnum;                   // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1155)
import org.dmd.dms.generated.enums.OriginalTypeEnum;               // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1160)
import org.dmd.dms.generated.enums.ValueTypeEnum;                  // Have attribute definitions - (DmoCompactSchemaFormatter.java:1200)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
public class DmrldapDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmrldap";


    static int schemaBaseID = 450;


    static int schemaIDRange = 50;


    static int schemaMaxID = 500;

    public final static DmcAttributeInfo __ldapIdPrefix = new DmcAttributeInfo("dmrldap", "ldapIdPrefix", 450, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __reposName = new DmcAttributeInfo("dmrldap", "reposName", 451, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_LDAPHierarchicObject = new DmcTypeInfo("LDAPHierarchicObject", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __LDAPAttributeAUX = new DmcClassInfo("LDAPAttributeAUX","org.dmd.dmr.shared.ldap.generated.dmo.LDAPAttributeAUXDMO", 903, ClassTypeEnum.AUXILIARY, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __LDAPClassAUX = new DmcClassInfo("LDAPClassAUX","org.dmd.dmr.shared.ldap.generated.dmo.LDAPClassAUXDMO", 902, ClassTypeEnum.AUXILIARY, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __LDAPHierarchicObject = new DmcClassInfo("LDAPHierarchicObject","org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO", 904, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,DmrbaseDMSAG.__HierarchicObject,MetaDMSAG.__FQN);
    public final static DmcClassInfo __LDAPSchemaAUX = new DmcClassInfo("LDAPSchemaAUX","org.dmd.dmr.shared.ldap.generated.dmo.LDAPSchemaAUXDMO", 901, ClassTypeEnum.AUXILIARY, DataTypeEnum.PERSISTENT,null,null);

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

        DmrldapDMSAGAMAP.initSmAp(_SmAp);

        DmrldapDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        DmrldapDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {


    }

    static  DmrldapDMSAG instance;

    protected DmrldapDMSAG (){
    }

    public synchronized static DmrldapDMSAG instance(){
        if (instance == null)
            instance = new DmrldapDMSAG();
        
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


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

