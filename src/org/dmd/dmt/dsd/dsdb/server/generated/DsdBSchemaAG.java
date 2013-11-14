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
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:176)
 */
public class DsdBSchemaAG extends SchemaDefinition {

    public static ClassDefinition _BConceptBase;
    public static ClassDefinition _BConceptX;
    public static ClassDefinition _ModuleB;

    public static AttributeDefinition _dependsOnModuleB;
    public static AttributeDefinition _definedInModuleB;






    static DsdBSchemaAG instance;

    public DsdBSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmt.dsd.dsdb.server.generated.DsdBSchemaAG";

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dsdB");
            me.setDotName("dsdB");
            me.setSchemaPackage("org.dmd.dmt.dsd.dsdb.shared");
            me.setDmwPackage("org.dmd.dmt.dsd.dsdb.server");
            me.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/dsdB.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            DmcOmni.instance().addCompactSchema(DsdBDMSAG.instance());
        }
    }

    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            ClassDefinitionDMO _BConceptBaseOBJ = new ClassDefinitionDMO();
            _BConceptBase = new ClassDefinition(_BConceptBaseOBJ,DsdBDMSAG.__BConceptBase);
            _BConceptBaseOBJ.setName("BConceptBase");
            _BConceptBaseOBJ.setDmdID("-500098");
            _BConceptBaseOBJ.setClassType("ABSTRACT");
            _BConceptBaseOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/classes.dmd");
            _BConceptBaseOBJ.setLineNumber("12");
            _BConceptBaseOBJ.setDescription("The base definition for this DSD module.");
            _BConceptBaseOBJ.setDerivedFrom("meta.DSDefinition");
            _BConceptBaseOBJ.setIsNamedBy("meta.name");
            _BConceptBaseOBJ.setUseWrapperType("EXTENDED");
            _BConceptBaseOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsdb.shared.generated.types.BConceptBaseREF");
            _BConceptBaseOBJ.setDmwIteratorClass("BConceptBaseIterableDMW");
            _BConceptBaseOBJ.addMust("meta.name");
            _BConceptBaseOBJ.addMust("meta.dotName");
            _BConceptBaseOBJ.addMust("dsdB.definedInModuleB");
            _BConceptBaseOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsdb.server.generated.dmw.BConceptBaseIterableDMW");
            _BConceptBaseOBJ.setDotName("dsdB.BConceptBase.ClassDefinition");
            _BConceptBase.setDefinedIn(this);
            addClassDefList(_BConceptBase);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
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
            _BConceptXOBJ.setDotName("dsdB.BConceptX.ClassDefinition");
            _BConceptX.setDefinedIn(this);
            addClassDefList(_BConceptX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            ClassDefinitionDMO _ModuleBOBJ = new ClassDefinitionDMO();
            _ModuleB = new ClassDefinition(_ModuleBOBJ,DsdBDMSAG.__ModuleB);
            _ModuleBOBJ.setName("ModuleB");
            _ModuleBOBJ.setDmdID("-500099");
            _ModuleBOBJ.setInternallyGenerated("true");
            _ModuleBOBJ.setClassType("STRUCTURAL");
            _ModuleBOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/module.dmd");
            _ModuleBOBJ.setLineNumber("7");
            _ModuleBOBJ.setIsNamedBy("meta.name");
            _ModuleBOBJ.setDmtREFImport("org.dmd.dmt.dsd.dsdb.shared.generated.types.ModuleBREF");
            _ModuleBOBJ.setDmwIteratorClass("ModuleBIterableDMW");
            _ModuleBOBJ.addMay("meta.description");
            _ModuleBOBJ.addMust("meta.name");
            _ModuleBOBJ.setDmwIteratorImport("org.dmd.dmt.dsd.dsdb.server.generated.dmw.ModuleBIterableDMW");
            _ModuleBOBJ.setDotName("dsdB.ModuleB.ClassDefinition");
            _ModuleB.setDefinedIn(this);
            addClassDefList(_ModuleB);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            AttributeDefinitionDMO _dependsOnModuleBOBJ = new AttributeDefinitionDMO();
            _dependsOnModuleB = new AttributeDefinition(_dependsOnModuleBOBJ);
            _dependsOnModuleBOBJ.setType("dsdB.ModuleB");
            _dependsOnModuleBOBJ.setName("dependsOnModuleB");
            _dependsOnModuleBOBJ.setDmdID("-500099");
            _dependsOnModuleBOBJ.setDescription("Indicates the ModuleB on which something depends.");
            _dependsOnModuleBOBJ.setDotName("dsdB.dependsOnModuleB.AttributeDefinition");
            _dependsOnModuleB.setDefinedIn(this);
            _dependsOnModuleBOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/attributes.dmd");
            _dependsOnModuleBOBJ.setLineNumber("6");
            addAttributeDefList(_dependsOnModuleB);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:552)
            AttributeDefinitionDMO _definedInModuleBOBJ = new AttributeDefinitionDMO();
            _definedInModuleB = new AttributeDefinition(_definedInModuleBOBJ);
            _definedInModuleBOBJ.setType("dsdB.ModuleB");
            _definedInModuleBOBJ.setName("definedInModuleB");
            _definedInModuleBOBJ.setDmdID("-500098");
            _definedInModuleBOBJ.setDescription("Indicates the name of the ModuleB in which a definition is defined.");
            _definedInModuleBOBJ.setDotName("dsdB.definedInModuleB.AttributeDefinition");
            _definedInModuleB.setDefinedIn(this);
            _definedInModuleBOBJ.setFile("/src/org/dmd/dmt/dsd/dsdb/shared/dmdconfig/attributes.dmd");
            _definedInModuleBOBJ.setLineNumber("12");
            addAttributeDefList(_definedInModuleB);

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
    public synchronized DsdBSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

