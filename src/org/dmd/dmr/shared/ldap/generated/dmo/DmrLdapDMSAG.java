package org.dmd.dmr.shared.ldap.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:736)
import java.util.ArrayList;                                        // For storage of schema info - (DmoCompactSchemaFormatter.java:674)
import java.util.HashMap;                                          // For storage of schema info - (DmoCompactSchemaFormatter.java:673)
import java.util.Iterator;                                         // For access of schema info - (DmoCompactSchemaFormatter.java:675)
import org.dmd.dmc.*;                                              // Basic DMC stuff - (DmoCompactSchemaFormatter.java:676)
import org.dmd.dmc.rules.RuleIF;                                   // For rule info - (DmoCompactSchemaFormatter.java:677)
import org.dmd.dmr.shared.base.generated.dmo.DmrBaseDMSAG;         // Base class from DmrBaseDMSAG - (DmoCompactSchemaFormatter.java:697)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Optional attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:693)
import org.dmd.dms.generated.enums.ClassTypeEnum;                  // Have class definitions - (DmoCompactSchemaFormatter.java:681)
import org.dmd.dms.generated.enums.DataTypeEnum;                   // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:682)
import org.dmd.dms.generated.enums.ValueTypeEnum;                  // Have attribute definitions - (DmoCompactSchemaFormatter.java:704)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:100)
public class DmrLdapDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmr.ldap";


    static int schemaBaseID = 450;


    static int schemaIDRange = 50;


    static int schemaMaxID = 500;

    public final static DmcAttributeInfo __ldapIdPrefix = new DmcAttributeInfo("ldapIdPrefix", 450, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __reposName = new DmcAttributeInfo("reposName", 451, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcClassInfo __LDAPAttributeAUX = new DmcClassInfo("LDAPAttributeAUX","org.dmd.dmr.shared.ldap.generated.dmo.LDAPAttributeAUXDMO", 453, ClassTypeEnum.AUXILIARY, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __LDAPClassAUX = new DmcClassInfo("LDAPClassAUX","org.dmd.dmr.shared.ldap.generated.dmo.LDAPClassAUXDMO", 452, ClassTypeEnum.AUXILIARY, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __LDAPHierarchicObject = new DmcClassInfo("LDAPHierarchicObject","org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO", 454, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,DmrBaseDMSAG.__HierarchicObject,MetaDMSAG.__FQN);
    public final static DmcClassInfo __LDAPSchemaAUX = new DmcClassInfo("LDAPSchemaAUX","org.dmd.dmr.shared.ldap.generated.dmo.LDAPSchemaAUXDMO", 451, ClassTypeEnum.AUXILIARY, DataTypeEnum.PERSISTENT,null,null);

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _RmAp = new ArrayList<RuleIF>();

        _SmAp.put(__ldapIdPrefix.id,__ldapIdPrefix);
        _SmAp.put(__reposName.id,__reposName);
        _CmAp.put(__LDAPAttributeAUX.id,__LDAPAttributeAUX);
        _CmAp.put(__LDAPClassAUX.id,__LDAPClassAUX);
        _CmAp.put(__LDAPHierarchicObject.id,__LDAPHierarchicObject);
        _CmAp.put(__LDAPSchemaAUX.id,__LDAPSchemaAUX);

        __LDAPSchemaAUX.addMay(__ldapIdPrefix);

        __LDAPClassAUX.addMay(__reposName);
        __LDAPClassAUX.addMay(MetaDMSAG.__namingAttribute);

        __LDAPAttributeAUX.addMay(__reposName);

        __LDAPHierarchicObject.addMust(MetaDMSAG.__FQN);


    }

    static  DmrLdapDMSAG instance;

    protected DmrLdapDMSAG (){
    }

    public synchronized static DmrLdapDMSAG instance(){
        if (instance == null)
            instance = new DmrLdapDMSAG();
        
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
