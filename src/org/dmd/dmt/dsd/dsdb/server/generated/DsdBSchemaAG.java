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
package org.dmd.dmt.dsd.dsdb.server.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.DsdBDMSAG;


/**
 * A domain specific definition schema for test purposes.
 * <P>
 * Generated from the dsdB schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:182)
 */
public class DsdBSchemaAG extends SchemaDefinition {

    public static ClassDefinition _BConceptBase;
    public static ClassDefinition _BConceptX;
    public static ClassDefinition _ModuleB;

    public static AttributeDefinition _dependsOnModuleB;
    public static AttributeDefinition _definedInModuleB;






    public static DSDefinitionModule _ModuleBDSD;

    static DsdBSchemaAG instance;

    public DsdBSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmt.dsd.dsdb.server.generated.DsdBSchemaAG";

        dependsOnSchemaClasses.put("dsdA","org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG");

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:208)
    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dsdB");
            me.setDotName("dsdB");
            me.setSchemaPackage("org.dmd.dmt.dsd.dsdb.shared");
            me.setDmwPackage("org.dmd.dmt.dsd.dsdb.server");
            me.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/dsdB.dms");


            me.addDependsOn("dsdA");
            dependsOnSchemaClasses.put("dsdA","org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG");


            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            initDSDModules();
            DmcOmni.instance().addCompactSchema(DsdBDMSAG.instance());
        }
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _BConceptBaseOBJ = new ClassDefinitionDMO();
            _BConceptBase = new ClassDefinition(_BConceptBaseOBJ,DsdBDMSAG.__BConceptBase);
            _BConceptBaseOBJ.setName("BConceptBase");
            _BConceptBaseOBJ.setDmdID("-500098");
            _BConceptBaseOBJ.setClassType("ABSTRACT");
            _BConceptBaseOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/classes.dmd");
            _BConceptBaseOBJ.setLineNumber("12");
            _BConceptBaseOBJ.addDescription("The base definition for this DSD module.");
            _BConceptBaseOBJ.setDerivedFrom("meta.DSDefinition");
            _BConceptBaseOBJ.setIsNamedBy("meta.name");
            _BConceptBaseOBJ.setUseWrapperType("EXTENDED");
            _BConceptBaseOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsdb.shared.generated.types.BConceptBaseREF");
            _BConceptBaseOBJ.setDmwIteratorClass("BConceptBaseIterableDMW");
            _BConceptBaseOBJ.addMust("meta.name");
            _BConceptBaseOBJ.addMust("meta.dotName");
            _BConceptBaseOBJ.addMust("dsdB.definedInModuleB");
            _BConceptBaseOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsdb.server.generated.dmw.BConceptBaseIterableDMW");
            _BConceptBaseOBJ.setPartOfDefinitionModule("dsdB.ModuleB");
            _BConceptBaseOBJ.setDotName("dsdB.BConceptBase.ClassDefinition");
            _BConceptBase.setDefinedIn(this);
            addClassDefList(_BConceptBase);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _BConceptXOBJ = new ClassDefinitionDMO();
            _BConceptX = new ClassDefinition(_BConceptXOBJ,DsdBDMSAG.__BConceptX);
            _BConceptXOBJ.setName("BConceptX");
            _BConceptXOBJ.setDmdID("-500097");
            _BConceptXOBJ.setClassType("STRUCTURAL");
            _BConceptXOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/classes.dmd");
            _BConceptXOBJ.setLineNumber("20");
            _BConceptXOBJ.setDerivedFrom("dsdB.BConceptBase");
            _BConceptXOBJ.setIsNamedBy("meta.name");
            _BConceptXOBJ.setUseWrapperType("EXTENDED");
            _BConceptXOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsdb.shared.generated.types.BConceptXREF");
            _BConceptXOBJ.setDmwIteratorClass("BConceptXIterableDMW");
            _BConceptXOBJ.addMust("meta.name");
            _BConceptXOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsdb.server.generated.dmw.BConceptXIterableDMW");
            _BConceptXOBJ.setPartOfDefinitionModule("dsdB.ModuleB");
            _BConceptXOBJ.setDotName("dsdB.BConceptX.ClassDefinition");
            _BConceptX.setDefinedIn(this);
            addClassDefList(_BConceptX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ModuleBOBJ = new ClassDefinitionDMO();
            _ModuleB = new ClassDefinition(_ModuleBOBJ,DsdBDMSAG.__ModuleB);
            _ModuleBOBJ.setName("ModuleB");
            _ModuleBOBJ.setDmdID("-500099");
            _ModuleBOBJ.setInternallyGenerated("true");
            _ModuleBOBJ.setClassType("STRUCTURAL");
            _ModuleBOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/module.dmd");
            _ModuleBOBJ.setLineNumber("9");
            _ModuleBOBJ.setDerivedFrom("dsdB.BConceptBase");
            _ModuleBOBJ.setIsNamedBy("meta.name");
            _ModuleBOBJ.setUseWrapperType("EXTENDED");
            _ModuleBOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsdb.shared.generated.types.ModuleBREF");
            _ModuleBOBJ.setDmwIteratorClass("ModuleBIterableDMW");
            _ModuleBOBJ.addMay("meta.description");
            _ModuleBOBJ.addMay("meta.defFiles");
            _ModuleBOBJ.addMay("dsdB.dependsOnModuleB");
            _ModuleBOBJ.addMay("dsdA.dependsOnModuleA");
            _ModuleBOBJ.addMust("meta.name");
            _ModuleBOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsdb.server.generated.dmw.ModuleBIterableDMW");
            _ModuleBOBJ.setDsdModuleDefinition("dsdB.ModuleB");
            _ModuleBOBJ.setPartOfDefinitionModule("dsdB.ModuleB");
            _ModuleBOBJ.setDotName("dsdB.ModuleB.ClassDefinition");
            _ModuleB.setDefinedIn(this);
            addClassDefList(_ModuleB);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _dependsOnModuleBOBJ = new AttributeDefinitionDMO();
            _dependsOnModuleB = new AttributeDefinition(_dependsOnModuleBOBJ);
            _dependsOnModuleBOBJ.setType("dsdB.ModuleB");
            _dependsOnModuleBOBJ.setName("dependsOnModuleB");
            _dependsOnModuleBOBJ.setDmdID("-500099");
            _dependsOnModuleBOBJ.addDescription("Indicates the ModuleB on which something depends.");
            _dependsOnModuleBOBJ.setValueType("MULTI");
            _dependsOnModuleBOBJ.setDotName("dsdB.dependsOnModuleB.AttributeDefinition");
            _dependsOnModuleB.setDefinedIn(this);
            _dependsOnModuleBOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/attributes.dmd");
            _dependsOnModuleBOBJ.setLineNumber("7");
            addAttributeDefList(_dependsOnModuleB);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _definedInModuleBOBJ = new AttributeDefinitionDMO();
            _definedInModuleB = new AttributeDefinition(_definedInModuleBOBJ);
            _definedInModuleBOBJ.setType("dsdB.ModuleB");
            _definedInModuleBOBJ.setName("definedInModuleB");
            _definedInModuleBOBJ.setDmdID("-500098");
            _definedInModuleBOBJ.addDescription("Indicates the name of the ModuleB in which a definition is defined.");
            _definedInModuleBOBJ.setDotName("dsdB.definedInModuleB.AttributeDefinition");
            _definedInModuleB.setDefinedIn(this);
            _definedInModuleBOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/attributes.dmd");
            _definedInModuleBOBJ.setLineNumber("13");
            addAttributeDefList(_definedInModuleB);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initComplexTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initActions() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initEnums() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initRules() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initDSDModules() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            DSDefinitionModuleDMO _ModuleBDSDOBJ = new DSDefinitionModuleDMO();
            _ModuleBDSD = new DSDefinitionModule(_ModuleBDSDOBJ);
            _ModuleBDSDOBJ.setName("ModuleB");
            _ModuleBDSDOBJ.setDmdID("1");
            _ModuleBDSDOBJ.setModuleClassName("ModuleB");
            _ModuleBDSDOBJ.setFileExtension("tmb");
            _ModuleBDSDOBJ.setDefinedInModuleAttribute("dsdB.definedInModuleB");
            _ModuleBDSDOBJ.setDotName("dsdB.ModuleB.DSDefinitionModule");
            _ModuleBDSDOBJ.addRefersToDefsFromDSD("dsdA.ModuleA");
            _ModuleBDSDOBJ.setModuleDependenceAttribute("dsdB.dependsOnModuleB");
            _ModuleBDSDOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/module.dmd");
            _ModuleBDSDOBJ.setBaseDefinition("dsdB.BConceptBase");
            _ModuleBDSDOBJ.setLineNumber("9");
            _ModuleBDSD.setDefinedIn(this);
            addDsdModuleList(_ModuleBDSD);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:272)

    @Override
    public synchronized DsdBSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

