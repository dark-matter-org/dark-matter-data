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
package org.dmd.dmt.dsd.dsda.server.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;


/**
 * A domain specific definition schema for test purposes.
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:182)
 */
public class DsdASchemaAG extends SchemaDefinition {

    public static ClassDefinition _AConceptBase;
    public static ClassDefinition _AConceptX;
    public static ClassDefinition _ABConceptX;
    public static ClassDefinition _ModuleA;

    public static AttributeDefinition _dependsOnModuleA;
    public static AttributeDefinition _definedInModuleA;
    public static AttributeDefinition _referenceToAB;


    public static ComplexTypeDefinition _Reference;




    public static DSDefinitionModule _ModuleADSD;

    static DsdASchemaAG instance;

    public DsdASchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG";

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:208)
    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dsdA");
            me.setDotName("dsdA");
            me.setSchemaPackage("org.dmd.dmt.dsd.dsda.shared");
            me.setDmwPackage("org.dmd.dmt.dsd.dsda.server");
            me.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/dsdA.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            initDSDModules();
            DmcOmni.instance().addCompactSchema(DsdADMSAG.instance());
        }
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _AConceptBaseOBJ = new ClassDefinitionDMO();
            _AConceptBase = new ClassDefinition(_AConceptBaseOBJ,DsdADMSAG.__AConceptBase);
            _AConceptBaseOBJ.setName("AConceptBase");
            _AConceptBaseOBJ.setDmdID("-1000098");
            _AConceptBaseOBJ.setClassType("ABSTRACT");
            _AConceptBaseOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/classes.dmd");
            _AConceptBaseOBJ.setLineNumber("12");
            _AConceptBaseOBJ.setIsNamedBy("meta.name");
            _AConceptBaseOBJ.addDescription("The base definition for this DSD module.");
            _AConceptBaseOBJ.setUseWrapperType("EXTENDED");
            _AConceptBaseOBJ.setDerivedFrom("meta.DSDefinition");
            _AConceptBaseOBJ.addMust("meta.name");
            _AConceptBaseOBJ.addMust("meta.dotName");
            _AConceptBaseOBJ.addMust("dsdA.definedInModuleA");
            _AConceptBaseOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsda.server.generated.dmw.AConceptBaseIterableDMW");
            _AConceptBaseOBJ.setDmwIteratorClass("AConceptBaseIterableDMW");
            _AConceptBaseOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsda.shared.generated.types.AConceptBaseREF");
            _AConceptBaseOBJ.setDotName("dsdA.AConceptBase.ClassDefinition");
            _AConceptBaseOBJ.setPartOfDefinitionModule("dsdA.ModuleA");
            _AConceptBase.setDefinedIn(this);
            addClassDefList(_AConceptBase);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _AConceptXOBJ = new ClassDefinitionDMO();
            _AConceptX = new ClassDefinition(_AConceptXOBJ,DsdADMSAG.__AConceptX);
            _AConceptXOBJ.setName("AConceptX");
            _AConceptXOBJ.setDmdID("-1000097");
            _AConceptXOBJ.setClassType("STRUCTURAL");
            _AConceptXOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/classes.dmd");
            _AConceptXOBJ.setLineNumber("21");
            _AConceptXOBJ.setIsNamedBy("meta.name");
            _AConceptXOBJ.setUseWrapperType("EXTENDED");
            _AConceptXOBJ.setDerivedFrom("dsdA.AConceptBase");
            _AConceptXOBJ.addMust("meta.name");
            _AConceptXOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsda.server.generated.dmw.AConceptXIterableDMW");
            _AConceptXOBJ.setDmwIteratorClass("AConceptXIterableDMW");
            _AConceptXOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsda.shared.generated.types.AConceptXREF");
            _AConceptXOBJ.setDotName("dsdA.AConceptX.ClassDefinition");
            _AConceptXOBJ.setPartOfDefinitionModule("dsdA.ModuleA");
            _AConceptX.setDefinedIn(this);
            addClassDefList(_AConceptX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ABConceptXOBJ = new ClassDefinitionDMO();
            _ABConceptX = new ClassDefinition(_ABConceptXOBJ,DsdADMSAG.__ABConceptX);
            _ABConceptXOBJ.setName("ABConceptX");
            _ABConceptXOBJ.setDmdID("-1000096");
            _ABConceptXOBJ.setClassType("STRUCTURAL");
            _ABConceptXOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/classes.dmd");
            _ABConceptXOBJ.setLineNumber("30");
            _ABConceptXOBJ.setIsNamedBy("meta.name");
            _ABConceptXOBJ.setUseWrapperType("EXTENDED");
            _ABConceptXOBJ.setDerivedFrom("dsdA.AConceptX");
            _ABConceptXOBJ.addMust("meta.name");
            _ABConceptXOBJ.addMay("dsdA.referenceToAB");
            _ABConceptXOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsda.server.generated.dmw.ABConceptXIterableDMW");
            _ABConceptXOBJ.setDmwIteratorClass("ABConceptXIterableDMW");
            _ABConceptXOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsda.shared.generated.types.ABConceptXREF");
            _ABConceptXOBJ.setDotName("dsdA.ABConceptX.ClassDefinition");
            _ABConceptXOBJ.setPartOfDefinitionModule("dsdA.ModuleA");
            _ABConceptX.setDefinedIn(this);
            addClassDefList(_ABConceptX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ModuleAOBJ = new ClassDefinitionDMO();
            _ModuleA = new ClassDefinition(_ModuleAOBJ,DsdADMSAG.__ModuleA);
            _ModuleAOBJ.setName("ModuleA");
            _ModuleAOBJ.setDmdID("-1000099");
            _ModuleAOBJ.setClassType("STRUCTURAL");
            _ModuleAOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/module.dmd");
            _ModuleAOBJ.setLineNumber("8");
            _ModuleAOBJ.setInternallyGenerated("true");
            _ModuleAOBJ.setIsNamedBy("meta.name");
            _ModuleAOBJ.setUseWrapperType("EXTENDED");
            _ModuleAOBJ.setDerivedFrom("dsdA.AConceptBase");
            _ModuleAOBJ.addMust("meta.name");
            _ModuleAOBJ.addMay("meta.description");
            _ModuleAOBJ.addMay("meta.defFiles");
            _ModuleAOBJ.addMay("dsdA.dependsOnModuleA");
            _ModuleAOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsda.server.generated.dmw.ModuleAIterableDMW");
            _ModuleAOBJ.setDmwIteratorClass("ModuleAIterableDMW");
            _ModuleAOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF");
            _ModuleAOBJ.setDsdModuleDefinition("dsdA.ModuleA");
            _ModuleAOBJ.setDotName("dsdA.ModuleA.ClassDefinition");
            _ModuleAOBJ.setPartOfDefinitionModule("dsdA.ModuleA");
            _ModuleA.setDefinedIn(this);
            addClassDefList(_ModuleA);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _dependsOnModuleAOBJ = new AttributeDefinitionDMO();
            _dependsOnModuleA = new AttributeDefinition(_dependsOnModuleAOBJ);
            _dependsOnModuleAOBJ.addDescription("Indicates the ModuleA on which something depends.");
            _dependsOnModuleAOBJ.setName("dependsOnModuleA");
            _dependsOnModuleAOBJ.setDmdID("-500049");
            _dependsOnModuleAOBJ.setType("dsdA.ModuleA");
            _dependsOnModuleAOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/attributes.dmd");
            _dependsOnModuleAOBJ.setDotName("dsdA.dependsOnModuleA.AttributeDefinition");
            _dependsOnModuleAOBJ.setLineNumber("7");
            _dependsOnModuleAOBJ.setValueType("MULTI");
            _dependsOnModuleA.setDefinedIn(this);
            addAttributeDefList(_dependsOnModuleA);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _definedInModuleAOBJ = new AttributeDefinitionDMO();
            _definedInModuleA = new AttributeDefinition(_definedInModuleAOBJ);
            _definedInModuleAOBJ.addDescription("Indicates the name of the ModuleA in which a definition is defined.");
            _definedInModuleAOBJ.setName("definedInModuleA");
            _definedInModuleAOBJ.setDmdID("-500048");
            _definedInModuleAOBJ.setType("dsdA.ModuleA");
            _definedInModuleAOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/attributes.dmd");
            _definedInModuleAOBJ.setDotName("dsdA.definedInModuleA.AttributeDefinition");
            _definedInModuleAOBJ.setLineNumber("13");
            _definedInModuleA.setDefinedIn(this);
            addAttributeDefList(_definedInModuleA);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _referenceToABOBJ = new AttributeDefinitionDMO();
            _referenceToAB = new AttributeDefinition(_referenceToABOBJ);
            _referenceToABOBJ.addDescription("Indicates a reference to an ABConceptX object");
            _referenceToABOBJ.setName("referenceToAB");
            _referenceToABOBJ.setDmdID("-500047");
            _referenceToABOBJ.setType("dsdA.Reference");
            _referenceToABOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/attributes.dmd");
            _referenceToABOBJ.setDotName("dsdA.referenceToAB.AttributeDefinition");
            _referenceToABOBJ.setLineNumber("19");
            _referenceToAB.setDefinedIn(this);
            addAttributeDefList(_referenceToAB);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initComplexTypes() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ComplexTypeDefinitionDMO _ReferenceOBJ = new ComplexTypeDefinitionDMO();
            _Reference = new ComplexTypeDefinition(_ReferenceOBJ);
            _ReferenceOBJ.addRequiredPart("ABConceptX toConcept \"The reference toanother ABConcept\"");
            _ReferenceOBJ.setName("Reference");
            _ReferenceOBJ.addOptionalPart("String descr \"An optional description\" quoted=true");
            _ReferenceOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/types.dmd");
            _ReferenceOBJ.setDotName("dsdA.Reference.ComplexTypeDefinition");
            _ReferenceOBJ.setLineNumber("4");
            _Reference.setDefinedIn(this);
            addComplexTypeDefList(_Reference);

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
            DSDefinitionModuleDMO _ModuleADSDOBJ = new DSDefinitionModuleDMO();
            _ModuleADSD = new DSDefinitionModule(_ModuleADSDOBJ);
            _ModuleADSDOBJ.setFileExtension("tma");
            _ModuleADSDOBJ.setName("ModuleA");
            _ModuleADSDOBJ.setDmdID("1");
            _ModuleADSDOBJ.setModuleClassName("ModuleA");
            _ModuleADSDOBJ.setBaseDefinition("dsdA.AConceptBase");
            _ModuleADSDOBJ.setModuleDependenceAttribute("dsdA.dependsOnModuleA");
            _ModuleADSDOBJ.setDefinedInModuleAttribute("dsdA.definedInModuleA");
            _ModuleADSDOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/module.dmd");
            _ModuleADSDOBJ.setDotName("dsdA.ModuleA.DSDefinitionModule");
            _ModuleADSDOBJ.setLineNumber("8");
            _ModuleADSD.setDefinedIn(this);
            addDsdModuleList(_ModuleADSD);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:272)

    @Override
    public synchronized DsdASchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

