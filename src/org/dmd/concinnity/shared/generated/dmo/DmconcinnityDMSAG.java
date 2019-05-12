//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.concinnity.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1237)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:1152)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:1151)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:1153)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1154)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1155)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Base class from MetaDMSAG - (DmoCompactSchemaFormatter.java:1190)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1159)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1160)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1165)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1205)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
public class DmconcinnityDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmconcinnity";


    static int schemaBaseID = -42000;


    static int schemaIDRange = 10;


    static int schemaMaxID = -41990;

    public final static DmcAttributeInfo __definedInConcinnityModule = new DmcAttributeInfo("dmconcinnity", "definedInConcinnityModule", -41999, "ConcinnityModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dependsOnConcinnityModule = new DmcAttributeInfo("dmconcinnity", "dependsOnConcinnityModule", -41998, "ConcinnityModule", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __is = new DmcAttributeInfo("dmconcinnity", "is", -41997, "Concept", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __isLike = new DmcAttributeInfo("dmconcinnity", "isLike", -41996, "Concept", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __isRelatedTo = new DmcAttributeInfo("dmconcinnity", "isRelatedTo", -41995, "Concept", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __parent = new DmcAttributeInfo("dmconcinnity", "parent", -41993, "Concept", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __represents = new DmcAttributeInfo("dmconcinnity", "represents", -41994, "Concept", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_Concept = new DmcTypeInfo("Concept", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ConcinnityDefinition = new DmcTypeInfo("ConcinnityDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ConcinnityModule = new DmcTypeInfo("ConcinnityModule", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __ConcinnityDefinition = new DmcClassInfo("ConcinnityDefinition","org.dmd.concinnity.shared.generated.dmo.ConcinnityDefinitionDMO", -83998, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__Concinnity,MetaDMSAG.__name);
    public final static DmcClassInfo __Concept = new DmcClassInfo("Concept","org.dmd.concinnity.shared.generated.dmo.ConceptDMO", -83997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ConcinnityDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ConcinnityModule = new DmcClassInfo("ConcinnityModule","org.dmd.concinnity.shared.generated.dmo.ConcinnityModuleDMO", -83999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ConcinnityDefinition,MetaDMSAG.__name);

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

        DmconcinnityDMSAGAMAP.initSmAp(_SmAp);

        DmconcinnityDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        DmconcinnityDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {


    }

    static  DmconcinnityDMSAG instance;

    protected DmconcinnityDMSAG (){
    }

    public synchronized static DmconcinnityDMSAG instance(){
        if (instance == null)
            instance = new DmconcinnityDMSAG();
        
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

