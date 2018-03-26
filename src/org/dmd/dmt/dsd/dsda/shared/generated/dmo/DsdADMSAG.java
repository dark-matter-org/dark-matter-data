//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmt.dsd.dsda.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1232)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:1147)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:1146)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:1148)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1149)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1150)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Base class from MetaDMSAG - (DmoCompactSchemaFormatter.java:1185)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1154)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1155)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1160)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1200)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
public class DsdADMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dsdA";


    static int schemaBaseID = -500050;


    static int schemaIDRange = 50;


    static int schemaMaxID = -500000;

    public final static DmcAttributeInfo __definedInModuleA = new DmcAttributeInfo("dsdA", "definedInModuleA", -500048, "ModuleA", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dependsOnModuleA = new DmcAttributeInfo("dsdA", "dependsOnModuleA", -500049, "ModuleA", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_ABConceptX = new DmcTypeInfo("ABConceptX", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_AConceptBase = new DmcTypeInfo("AConceptBase", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_AConceptX = new DmcTypeInfo("AConceptX", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ModuleA = new DmcTypeInfo("ModuleA", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __AConceptBase = new DmcClassInfo("AConceptBase","org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptBaseDMO", -1000098, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __AConceptX = new DmcClassInfo("AConceptX","org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptXDMO", -1000097, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__AConceptBase,MetaDMSAG.__name);
    public final static DmcClassInfo __ABConceptX = new DmcClassInfo("ABConceptX","org.dmd.dmt.dsd.dsda.shared.generated.dmo.ABConceptXDMO", -1000096, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__AConceptX,MetaDMSAG.__name);
    public final static DmcClassInfo __ModuleA = new DmcClassInfo("ModuleA","org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO", -1000099, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__AConceptBase,MetaDMSAG.__name);

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

        DsdADMSAGAMAP.initSmAp(_SmAp);

        DsdADMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        DsdADMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {


    }

    static  DsdADMSAG instance;

    protected DsdADMSAG (){
    }

    public synchronized static DsdADMSAG instance(){
        if (instance == null)
            instance = new DsdADMSAG();
        
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

