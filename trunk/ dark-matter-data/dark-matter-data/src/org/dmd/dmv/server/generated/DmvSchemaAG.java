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

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;


public class DmvSchemaAG extends SchemaDefinition {

    public static ClassDefinition _Rule;
    public static ClassDefinition _AttributeRule;
    public static ClassDefinition _ClassRule;
    public static ClassDefinition _MustRule;
    public static ClassDefinition _MayRule;
    public static ClassDefinition _IntegerRangeRule;

    public static AttributeDefinition _ruleTitle;
    public static AttributeDefinition _applyToAttribute;

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
            me.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/dmv.dms");

            ClassDefinitionDMO _RuleOBJ = new ClassDefinitionDMO();
            _Rule = new ClassDefinition(_RuleOBJ);
            _RuleOBJ.setClassType("ABSTRACT");
            _Rule.setDefinedIn(this);
            _RuleOBJ.setDescription("A Rule is meant to represent an object that defines the validation logic to be applied to Dark Matter Object as a whole or to its attributes.");
            _RuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _RuleOBJ.setIsNamedBy("name");
            _RuleOBJ.setLineNumber("11");
            _RuleOBJ.addMust("name");
            _RuleOBJ.addMust("ruleTitle");
            _RuleOBJ.setName("Rule");
            _RuleOBJ.addObjectClass("ClassDefinition");
            _RuleOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_Rule);

            ClassDefinitionDMO _AttributeRuleOBJ = new ClassDefinitionDMO();
            _AttributeRule = new ClassDefinition(_AttributeRuleOBJ);
            _AttributeRuleOBJ.setClassType("ABSTRACT");
            _AttributeRule.setDefinedIn(this);
            _AttributeRuleOBJ.setDerivedFrom("Rule");
            _AttributeRuleOBJ.setDescription("The AttributeRule is the simplest rule that operates on a single attribute.");
            _AttributeRuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _AttributeRuleOBJ.setLineNumber("19");
            _AttributeRuleOBJ.setName("AttributeRule");
            _AttributeRuleOBJ.addObjectClass("ClassDefinition");
            _AttributeRuleOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_AttributeRule);

            ClassDefinitionDMO _ClassRuleOBJ = new ClassDefinitionDMO();
            _ClassRule = new ClassDefinition(_ClassRuleOBJ);
            _ClassRuleOBJ.setClassType("ABSTRACT");
            _ClassRule.setDefinedIn(this);
            _ClassRuleOBJ.setDerivedFrom("Rule");
            _ClassRuleOBJ.setDescription("The ClassRule is a rule that applies to an entire object and its collection of attributes.");
            _ClassRuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _ClassRuleOBJ.setLineNumber("27");
            _ClassRuleOBJ.setName("ClassRule");
            _ClassRuleOBJ.addObjectClass("ClassDefinition");
            _ClassRuleOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_ClassRule);

            ClassDefinitionDMO _MustRuleOBJ = new ClassDefinitionDMO();
            _MustRule = new ClassDefinition(_MustRuleOBJ);
            _MustRuleOBJ.setClassType("STRUCTURAL");
            _MustRule.setDefinedIn(this);
            _MustRuleOBJ.setDerivedFrom("ClassRule");
            _MustRuleOBJ.setDescription("The MustRule verifies that an object has its must attributes.");
            _MustRuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _MustRuleOBJ.setLineNumber("34");
            _MustRuleOBJ.setName("MustRule");
            _MustRuleOBJ.addObjectClass("ClassDefinition");
            _MustRuleOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MustRule);

            ClassDefinitionDMO _MayRuleOBJ = new ClassDefinitionDMO();
            _MayRule = new ClassDefinition(_MayRuleOBJ);
            _MayRuleOBJ.setClassType("STRUCTURAL");
            _MayRule.setDefinedIn(this);
            _MayRuleOBJ.setDerivedFrom("ClassRule");
            _MayRuleOBJ.setDescription("The MustRule verifies that an object has its must attributes.");
            _MayRuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _MayRuleOBJ.setLineNumber("41");
            _MayRuleOBJ.setName("MayRule");
            _MayRuleOBJ.addObjectClass("ClassDefinition");
            _MayRuleOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MayRule);

            ClassDefinitionDMO _IntegerRangeRuleOBJ = new ClassDefinitionDMO();
            _IntegerRangeRule = new ClassDefinition(_IntegerRangeRuleOBJ);
            _IntegerRangeRuleOBJ.setClassType("STRUCTURAL");
            _IntegerRangeRule.setDefinedIn(this);
            _IntegerRangeRuleOBJ.setDerivedFrom("AttributeRule");
            _IntegerRangeRuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _IntegerRangeRuleOBJ.setLineNumber("46");
            _IntegerRangeRuleOBJ.setName("IntegerRangeRule");
            _IntegerRangeRuleOBJ.addObjectClass("ClassDefinition");
            _IntegerRangeRuleOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_IntegerRangeRule);


            AttributeDefinitionDMO _ruleTitleOBJ = new AttributeDefinitionDMO();
            _ruleTitle = new AttributeDefinition(_ruleTitleOBJ);
            _ruleTitle.setDefinedIn(this);
            _ruleTitleOBJ.setDescription("The description title of a rule.");
            _ruleTitleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/attributes.dmd");
            _ruleTitleOBJ.setLineNumber("5");
            _ruleTitleOBJ.setName("ruleTitle");
            _ruleTitleOBJ.addObjectClass("AttributeDefinition");
            _ruleTitleOBJ.setType("String");
            addAttributeDefList(_ruleTitle);

            AttributeDefinitionDMO _applyToAttributeOBJ = new AttributeDefinitionDMO();
            _applyToAttribute = new AttributeDefinition(_applyToAttributeOBJ);
            _applyToAttribute.setDefinedIn(this);
            _applyToAttributeOBJ.setDescription("A reference to the definition of an attribute to which a  rule should be applied.");
            _applyToAttributeOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/attributes.dmd");
            _applyToAttributeOBJ.setLineNumber("11");
            _applyToAttributeOBJ.setName("applyToAttribute");
            _applyToAttributeOBJ.addObjectClass("AttributeDefinition");
            _applyToAttributeOBJ.setType("AttributeDefinition");
            addAttributeDefList(_applyToAttribute);


        }
    }


    @Override
    public DmvSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

