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
package org.dmd.dmt.dsd.dsdc.server.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.DsdCDMSAG;


/**
 * A domain specific definition schema for test purposes.
 * <P>
 * Generated from the dsdC schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:176)
 */
public class DsdCSchemaAG extends SchemaDefinition {

    public static ClassDefinition _CConceptBase;
    public static ClassDefinition _CConceptX;
    public static ClassDefinition _ModuleC;

    public static AttributeDefinition _dependsOnModuleC;
    public static AttributeDefinition _definedInModuleC;






    static DsdCSchemaAG instance;

    public DsdCSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG";

        dependsOnSchemaClasses.put("dsdB","org.dmd.dmt.dsd.dsdb.server.generated.DsdBSchemaAG");

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dsdC");
            me.setDotName("dsdC");
            me.setSchemaPackage("org.dmd.dmt.dsd.dsdc.shared");
            me.setDmwPackage("org.dmd.dmt.dsd.dsdc.server");
            me.setFile("/src/org/dmd/dmt/dsd/dsdc/shared/dmdconfig/dsdC.dms");


            me.addDependsOn("dsdB");
            dependsOnSchemaClasses.put("dsdB","org.dmd.dmt.dsd.dsdb.server.generated.DsdBSchemaAG");


            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            DmcOmni.instance().addCompactSchema(DsdCDMSAG.instance());
        }
    }

    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            ClassDefinitionDMO _CConceptBaseOBJ = new ClassDefinitionDMO();
            _CConceptBase = new ClassDefinition(_CConceptBaseOBJ,DsdCDMSAG.__CConceptBase);
            _CConceptBaseOBJ.setName("CConceptBase");
            _CConceptBaseOBJ.setDmdID("-500148");
            _CConceptBaseOBJ.setClassType("ABSTRACT");
            _CConceptBaseOBJ.setFile("/src/org/dmd/dmt/dsd/dsdc/shared/dmdconfig/classes.dmd");
            _CConceptBaseOBJ.setLineNumber("12");
            _CConceptBaseOBJ.setDescription("The base definition for this DSD module.");
            _CConceptBaseOBJ.setDerivedFrom("meta.DSDefinition");
            _CConceptBaseOBJ.setIsNamedBy("meta.name");
            _CConceptBaseOBJ.setUseWrapperType("EXTENDED");
            _CConceptBaseOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsdc.shared.generated.types.CConceptBaseREF");
            _CConceptBaseOBJ.setDmwIteratorClass("CConceptBaseIterableDMW");
            _CConceptBaseOBJ.addMust("meta.name");
            _CConceptBaseOBJ.addMust("meta.dotName");
            _CConceptBaseOBJ.addMust("dsdC.definedInModuleC");
            _CConceptBaseOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsdc.server.generated.dmw.CConceptBaseIterableDMW");
            _CConceptBaseOBJ.setDotName("dsdC.CConceptBase.ClassDefinition");
            _CConceptBase.setDefinedIn(this);
            addClassDefList(_CConceptBase);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            ClassDefinitionDMO _CConceptXOBJ = new ClassDefinitionDMO();
            _CConceptX = new ClassDefinition(_CConceptXOBJ,DsdCDMSAG.__CConceptX);
            _CConceptXOBJ.setName("CConceptX");
            _CConceptXOBJ.setDmdID("-500147");
            _CConceptXOBJ.setClassType("STRUCTURAL");
            _CConceptXOBJ.setFile("/src/org/dmd/dmt/dsd/dsdc/shared/dmdconfig/classes.dmd");
            _CConceptXOBJ.setLineNumber("20");
            _CConceptXOBJ.setDerivedFrom("dsdC.CConceptBase");
            _CConceptXOBJ.setIsNamedBy("meta.name");
            _CConceptXOBJ.setUseWrapperType("EXTENDED");
            _CConceptXOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsdc.shared.generated.types.CConceptXREF");
            _CConceptXOBJ.setDmwIteratorClass("CConceptXIterableDMW");
            _CConceptXOBJ.addMust("meta.name");
            _CConceptXOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsdc.server.generated.dmw.CConceptXIterableDMW");
            _CConceptXOBJ.setDotName("dsdC.CConceptX.ClassDefinition");
            _CConceptX.setDefinedIn(this);
            addClassDefList(_CConceptX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            ClassDefinitionDMO _ModuleCOBJ = new ClassDefinitionDMO();
            _ModuleC = new ClassDefinition(_ModuleCOBJ,DsdCDMSAG.__ModuleC);
            _ModuleCOBJ.setName("ModuleC");
            _ModuleCOBJ.setDmdID("-500149");
            _ModuleCOBJ.setInternallyGenerated("true");
            _ModuleCOBJ.setClassType("STRUCTURAL");
            _ModuleCOBJ.setFile("/src/org/dmd/dmt/dsd/dsdc/shared/dmdconfig/module.dmd");
            _ModuleCOBJ.setLineNumber("10");
            _ModuleCOBJ.setDerivedFrom("dsdC.CConceptBase");
            _ModuleCOBJ.setIsNamedBy("meta.name");
            _ModuleCOBJ.setUseWrapperType("EXTENDED");
            _ModuleCOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsdc.shared.generated.types.ModuleCREF");
            _ModuleCOBJ.setDmwIteratorClass("ModuleCIterableDMW");
            _ModuleCOBJ.addMay("meta.description");
            _ModuleCOBJ.addMay("dsdC.dependsOnModuleC");
            _ModuleCOBJ.addMay("dsdA.dependsOnModuleA");
            _ModuleCOBJ.addMust("meta.name");
            _ModuleCOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsdc.server.generated.dmw.ModuleCIterableDMW");
            _ModuleCOBJ.setDsdModuleDefinition("dsdC.ModuleC");
            _ModuleCOBJ.setDotName("dsdC.ModuleC.ClassDefinition");
            _ModuleC.setDefinedIn(this);
            addClassDefList(_ModuleC);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            AttributeDefinitionDMO _dependsOnModuleCOBJ = new AttributeDefinitionDMO();
            _dependsOnModuleC = new AttributeDefinition(_dependsOnModuleCOBJ);
            _dependsOnModuleCOBJ.setType("dsdC.ModuleC");
            _dependsOnModuleCOBJ.setName("dependsOnModuleC");
            _dependsOnModuleCOBJ.setDmdID("-500149");
            _dependsOnModuleCOBJ.setDescription("Indicates the ModuleC on which something depends.");
            _dependsOnModuleCOBJ.setDotName("dsdC.dependsOnModuleC.AttributeDefinition");
            _dependsOnModuleC.setDefinedIn(this);
            _dependsOnModuleCOBJ.setFile("/src/org/dmd/dmt/dsd/dsdc/shared/dmdconfig/attributes.dmd");
            _dependsOnModuleCOBJ.setLineNumber("6");
            addAttributeDefList(_dependsOnModuleC);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            AttributeDefinitionDMO _definedInModuleCOBJ = new AttributeDefinitionDMO();
            _definedInModuleC = new AttributeDefinition(_definedInModuleCOBJ);
            _definedInModuleCOBJ.setType("dsdC.ModuleC");
            _definedInModuleCOBJ.setName("definedInModuleC");
            _definedInModuleCOBJ.setDmdID("-500148");
            _definedInModuleCOBJ.setDescription("Indicates the name of the ModuleC in which a definition is defined.");
            _definedInModuleCOBJ.setDotName("dsdC.definedInModuleC.AttributeDefinition");
            _definedInModuleC.setDefinedIn(this);
            _definedInModuleCOBJ.setFile("/src/org/dmd/dmt/dsd/dsdc/shared/dmdconfig/attributes.dmd");
            _definedInModuleCOBJ.setLineNumber("12");
            addAttributeDefList(_definedInModuleC);

    }

    private void initTypes() throws DmcValueException {
    }

    private void initComplexTypes() throws DmcValueException {
    }

    private void initActions() throws DmcValueException {
    }

    private void initEnums() throws DmcValueException {
    }

    private void initRules() throws DmcValueException {
    }


    @Override
    public synchronized DsdCSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

