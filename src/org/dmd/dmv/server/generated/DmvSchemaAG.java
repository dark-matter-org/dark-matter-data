//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmv.server.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;


/**
 * The dmv schema defines classes associated with the Dark Matter Validation
 * (DMV) framework based on RuleDefinitions. Although you are completely free
 * to define your own rules, DMV provides a collection of commonly useful
 * rules taht can be used in a DMO run context.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:165)
 */
public class DmvSchemaAG extends SchemaDefinition {

    public static ClassDefinition _AllowedAttributesRuleData;
    public static ClassDefinition _InitRuleData;
    public static ClassDefinition _IntegerRangeRuleData;
    public static ClassDefinition _UCOAllowedAttributesRuleData;

    public static AttributeDefinition _irrMinimum;
    public static AttributeDefinition _irrMaximum;




    static DmvSchemaAG instance;

    public DmvSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmv.server.generated.DmvSchemaAG";

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmv");
            me.setSchemaPackage("org.dmd.dmv.shared");
            me.setDmwPackage("org.dmd.dmv.server");
            me.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/dmv.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initActions();
            initEnums();
            DmcOmni.instance().addCompactSchema(DmvDMSAG.instance());
        }
    }

    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            ClassDefinitionDMO _AllowedAttributesRuleDataOBJ = new ClassDefinitionDMO();
            _AllowedAttributesRuleData = new ClassDefinition(_AllowedAttributesRuleDataOBJ,DmvDMSAG.__AllowedAttributesRuleData);
            _AllowedAttributesRuleDataOBJ.setName("AllowedAttributesRuleData");
            _AllowedAttributesRuleDataOBJ.setDmdID("-959999");
            _AllowedAttributesRuleDataOBJ.setInternallyGenerated("true");
            _AllowedAttributesRuleDataOBJ.setClassType("STRUCTURAL");
            _AllowedAttributesRuleDataOBJ.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _AllowedAttributesRuleDataOBJ.setLineNumber("19");
            _AllowedAttributesRuleDataOBJ.setDerivedFrom("RuleData");
            _AllowedAttributesRuleDataOBJ.setDmtREFImport("org.dmd.dmv.shared.generated.types.AllowedAttributesRuleDataREF");
            _AllowedAttributesRuleDataOBJ.setRuleDefinition("AllowedAttributesRule");
            _AllowedAttributesRuleDataOBJ.setDmwIteratorClass("AllowedAttributesRuleDataIterableDMW");
            _AllowedAttributesRuleDataOBJ.addMay("description");
            _AllowedAttributesRuleDataOBJ.addMust("ruleName");
            _AllowedAttributesRuleDataOBJ.addMust("ruleTitle");
            _AllowedAttributesRuleDataOBJ.setDmwIteratorImport("org.dmd.dmv.server.generated.dmw.AllowedAttributesRuleDataIterableDMW");
            _AllowedAttributesRuleData.setDefinedIn(this);
            addClassDefList(_AllowedAttributesRuleData);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            ClassDefinitionDMO _InitRuleDataOBJ = new ClassDefinitionDMO();
            _InitRuleData = new ClassDefinition(_InitRuleDataOBJ,DmvDMSAG.__InitRuleData);
            _InitRuleDataOBJ.setName("InitRuleData");
            _InitRuleDataOBJ.setDmdID("-959998");
            _InitRuleDataOBJ.setInternallyGenerated("true");
            _InitRuleDataOBJ.setClassType("EXTENSIBLE");
            _InitRuleDataOBJ.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _InitRuleDataOBJ.setLineNumber("50");
            _InitRuleDataOBJ.setDerivedFrom("RuleData");
            _InitRuleDataOBJ.setDmtREFImport("org.dmd.dmv.shared.generated.types.InitRuleDataREF");
            _InitRuleDataOBJ.setRuleDefinition("InitRule");
            _InitRuleDataOBJ.setDmwIteratorClass("InitRuleDataIterableDMW");
            _InitRuleDataOBJ.addMay("description");
            _InitRuleDataOBJ.addMust("ruleName");
            _InitRuleDataOBJ.addMust("ruleTitle");
            _InitRuleDataOBJ.setDmwIteratorImport("org.dmd.dmv.server.generated.dmw.InitRuleDataIterableDMW");
            _InitRuleData.setDefinedIn(this);
            addClassDefList(_InitRuleData);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            ClassDefinitionDMO _IntegerRangeRuleDataOBJ = new ClassDefinitionDMO();
            _IntegerRangeRuleData = new ClassDefinition(_IntegerRangeRuleDataOBJ,DmvDMSAG.__IntegerRangeRuleData);
            _IntegerRangeRuleDataOBJ.setName("IntegerRangeRuleData");
            _IntegerRangeRuleDataOBJ.setDmdID("-959997");
            _IntegerRangeRuleDataOBJ.setInternallyGenerated("true");
            _IntegerRangeRuleDataOBJ.setClassType("STRUCTURAL");
            _IntegerRangeRuleDataOBJ.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _IntegerRangeRuleDataOBJ.setLineNumber("72");
            _IntegerRangeRuleDataOBJ.setDerivedFrom("RuleData");
            _IntegerRangeRuleDataOBJ.setDmtREFImport("org.dmd.dmv.shared.generated.types.IntegerRangeRuleDataREF");
            _IntegerRangeRuleDataOBJ.setRuleDefinition("IntegerRangeRule");
            _IntegerRangeRuleDataOBJ.setDmwIteratorClass("IntegerRangeRuleDataIterableDMW");
            _IntegerRangeRuleDataOBJ.addMay("description");
            _IntegerRangeRuleDataOBJ.addMust("ruleName");
            _IntegerRangeRuleDataOBJ.addMust("ruleTitle");
            _IntegerRangeRuleDataOBJ.addMust("irrMinimum");
            _IntegerRangeRuleDataOBJ.addMust("irrMaximum");
            _IntegerRangeRuleDataOBJ.setDmwIteratorImport("org.dmd.dmv.server.generated.dmw.IntegerRangeRuleDataIterableDMW");
            _IntegerRangeRuleData.setDefinedIn(this);
            addClassDefList(_IntegerRangeRuleData);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            ClassDefinitionDMO _UCOAllowedAttributesRuleDataOBJ = new ClassDefinitionDMO();
            _UCOAllowedAttributesRuleData = new ClassDefinition(_UCOAllowedAttributesRuleDataOBJ,DmvDMSAG.__UCOAllowedAttributesRuleData);
            _UCOAllowedAttributesRuleDataOBJ.setName("UCOAllowedAttributesRuleData");
            _UCOAllowedAttributesRuleDataOBJ.setDmdID("-959996");
            _UCOAllowedAttributesRuleDataOBJ.setInternallyGenerated("true");
            _UCOAllowedAttributesRuleDataOBJ.setClassType("STRUCTURAL");
            _UCOAllowedAttributesRuleDataOBJ.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _UCOAllowedAttributesRuleDataOBJ.setLineNumber("82");
            _UCOAllowedAttributesRuleDataOBJ.setDerivedFrom("RuleData");
            _UCOAllowedAttributesRuleDataOBJ.setDmtREFImport("org.dmd.dmv.shared.generated.types.UCOAllowedAttributesRuleDataREF");
            _UCOAllowedAttributesRuleDataOBJ.setRuleDefinition("UCOAllowedAttributesRule");
            _UCOAllowedAttributesRuleDataOBJ.setDmwIteratorClass("UCOAllowedAttributesRuleDataIterableDMW");
            _UCOAllowedAttributesRuleDataOBJ.addMay("description");
            _UCOAllowedAttributesRuleDataOBJ.addMust("ruleName");
            _UCOAllowedAttributesRuleDataOBJ.addMust("ruleTitle");
            _UCOAllowedAttributesRuleDataOBJ.setDmwIteratorImport("org.dmd.dmv.server.generated.dmw.UCOAllowedAttributesRuleDataIterableDMW");
            _UCOAllowedAttributesRuleData.setDefinedIn(this);
            addClassDefList(_UCOAllowedAttributesRuleData);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _irrMinimumOBJ = new AttributeDefinitionDMO();
            _irrMinimum = new AttributeDefinition(_irrMinimumOBJ);
            _irrMinimumOBJ.setType("Integer");
            _irrMinimumOBJ.setName("irrMinimum");
            _irrMinimumOBJ.setDmdID("-479999");
            _irrMinimumOBJ.setDescription("The minimum integer value.");
            _irrMinimum.setDefinedIn(this);
            _irrMinimumOBJ.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/attributes.dmd");
            _irrMinimumOBJ.setLineNumber("6");
            addAttributeDefList(_irrMinimum);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _irrMaximumOBJ = new AttributeDefinitionDMO();
            _irrMaximum = new AttributeDefinition(_irrMaximumOBJ);
            _irrMaximumOBJ.setType("Integer");
            _irrMaximumOBJ.setName("irrMaximum");
            _irrMaximumOBJ.setDmdID("-479998");
            _irrMaximumOBJ.setDescription("The maximum integer value.");
            _irrMaximum.setDefinedIn(this);
            _irrMaximumOBJ.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/attributes.dmd");
            _irrMaximumOBJ.setLineNumber("11");
            addAttributeDefList(_irrMaximum);

    }

    private void initTypes() throws DmcValueException {
    }

    private void initActions() throws DmcValueException {
    }

    private void initEnums() throws DmcValueException {
    }


    @Override
    public synchronized DmvSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

