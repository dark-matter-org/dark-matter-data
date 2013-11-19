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
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:176)
 */
public class DsdASchemaAG extends SchemaDefinition {

    public static ClassDefinition _AConceptBase;
    public static ClassDefinition _AConceptX;
    public static ClassDefinition _ModuleA;

    public static AttributeDefinition _dependsOnModuleA;
    public static AttributeDefinition _definedInModuleA;






    static DsdASchemaAG instance;

    public DsdASchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG";

    }

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
            DmcOmni.instance().addCompactSchema(DsdADMSAG.instance());
        }
    }

    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            ClassDefinitionDMO _AConceptBaseOBJ = new ClassDefinitionDMO();
            _AConceptBase = new ClassDefinition(_AConceptBaseOBJ,DsdADMSAG.__AConceptBase);
            _AConceptBaseOBJ.setName("AConceptBase");
            _AConceptBaseOBJ.setDmdID("-500048");
            _AConceptBaseOBJ.setClassType("ABSTRACT");
            _AConceptBaseOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/classes.dmd");
            _AConceptBaseOBJ.setLineNumber("12");
            _AConceptBaseOBJ.setDescription("The base definition for this DSD module.");
            _AConceptBaseOBJ.setDerivedFrom("meta.DSDefinition");
            _AConceptBaseOBJ.setIsNamedBy("meta.name");
            _AConceptBaseOBJ.setUseWrapperType("EXTENDED");
            _AConceptBaseOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsda.shared.generated.types.AConceptBaseREF");
            _AConceptBaseOBJ.setDmwIteratorClass("AConceptBaseIterableDMW");
            _AConceptBaseOBJ.addMust("meta.name");
            _AConceptBaseOBJ.addMust("meta.dotName");
            _AConceptBaseOBJ.addMust("dsdA.definedInModuleA");
            _AConceptBaseOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsda.server.generated.dmw.AConceptBaseIterableDMW");
            _AConceptBaseOBJ.setDotName("dsdA.AConceptBase.ClassDefinition");
            _AConceptBase.setDefinedIn(this);
            addClassDefList(_AConceptBase);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            ClassDefinitionDMO _AConceptXOBJ = new ClassDefinitionDMO();
            _AConceptX = new ClassDefinition(_AConceptXOBJ,DsdADMSAG.__AConceptX);
            _AConceptXOBJ.setName("AConceptX");
            _AConceptXOBJ.setDmdID("-500047");
            _AConceptXOBJ.setClassType("STRUCTURAL");
            _AConceptXOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/classes.dmd");
            _AConceptXOBJ.setLineNumber("20");
            _AConceptXOBJ.setDerivedFrom("dsdA.AConceptBase");
            _AConceptXOBJ.setIsNamedBy("meta.name");
            _AConceptXOBJ.setUseWrapperType("EXTENDED");
            _AConceptXOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsda.shared.generated.types.AConceptXREF");
            _AConceptXOBJ.setDmwIteratorClass("AConceptXIterableDMW");
            _AConceptXOBJ.addMust("meta.name");
            _AConceptXOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsda.server.generated.dmw.AConceptXIterableDMW");
            _AConceptXOBJ.setDotName("dsdA.AConceptX.ClassDefinition");
            _AConceptX.setDefinedIn(this);
            addClassDefList(_AConceptX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            ClassDefinitionDMO _ModuleAOBJ = new ClassDefinitionDMO();
            _ModuleA = new ClassDefinition(_ModuleAOBJ,DsdADMSAG.__ModuleA);
            _ModuleAOBJ.setName("ModuleA");
            _ModuleAOBJ.setDmdID("-500049");
            _ModuleAOBJ.setInternallyGenerated("true");
            _ModuleAOBJ.setClassType("STRUCTURAL");
            _ModuleAOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/module.dmd");
            _ModuleAOBJ.setLineNumber("8");
            _ModuleAOBJ.setDerivedFrom("dsdA.AConceptBase");
            _ModuleAOBJ.setIsNamedBy("meta.name");
            _ModuleAOBJ.setUseWrapperType("EXTENDED");
            _ModuleAOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF");
            _ModuleAOBJ.setDmwIteratorClass("ModuleAIterableDMW");
            _ModuleAOBJ.addMay("meta.description");
            _ModuleAOBJ.addMay("dsdA.dependsOnModuleA");
            _ModuleAOBJ.addMust("meta.name");
            _ModuleAOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsda.server.generated.dmw.ModuleAIterableDMW");
            _ModuleAOBJ.setDotName("dsdA.ModuleA.ClassDefinition");
            _ModuleA.setDefinedIn(this);
            addClassDefList(_ModuleA);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            AttributeDefinitionDMO _dependsOnModuleAOBJ = new AttributeDefinitionDMO();
            _dependsOnModuleA = new AttributeDefinition(_dependsOnModuleAOBJ);
            _dependsOnModuleAOBJ.setType("dsdA.ModuleA");
            _dependsOnModuleAOBJ.setName("dependsOnModuleA");
            _dependsOnModuleAOBJ.setDmdID("-500049");
            _dependsOnModuleAOBJ.setDescription("Indicates the ModuleA on which something depends.");
            _dependsOnModuleAOBJ.setDotName("dsdA.dependsOnModuleA.AttributeDefinition");
            _dependsOnModuleA.setDefinedIn(this);
            _dependsOnModuleAOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/attributes.dmd");
            _dependsOnModuleAOBJ.setLineNumber("6");
            addAttributeDefList(_dependsOnModuleA);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            AttributeDefinitionDMO _definedInModuleAOBJ = new AttributeDefinitionDMO();
            _definedInModuleA = new AttributeDefinition(_definedInModuleAOBJ);
            _definedInModuleAOBJ.setType("dsdA.ModuleA");
            _definedInModuleAOBJ.setName("definedInModuleA");
            _definedInModuleAOBJ.setDmdID("-500048");
            _definedInModuleAOBJ.setDescription("Indicates the name of the ModuleA in which a definition is defined.");
            _definedInModuleAOBJ.setDotName("dsdA.definedInModuleA.AttributeDefinition");
            _definedInModuleA.setDefinedIn(this);
            _definedInModuleAOBJ.setFile("/src/org/dmd/dmt/dsd/dsda/shared/dmdconfig/attributes.dmd");
            _definedInModuleAOBJ.setLineNumber("12");
            addAttributeDefList(_definedInModuleA);

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
    public synchronized DsdASchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

