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
package org.dmd.dmv.shared.generated;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;


public class DmvSchemaAG extends SchemaDefinition {

    public static ClassDefinition _Rule;
    public static ClassDefinition _SharedRule;
    public static ClassDefinition _SharedAttributeRule;
    public static ClassDefinition _IntegerRangeRule;

    static DmvSchemaAG instance;

    public DmvSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmv.shared.generated.DmvSchemaAG";

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmv");
            me.setSchemaPackage("org.dmd.dmv.shared");
            me.setDmwPackage("org.dmd.dmv.shared");
            me.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/dmv.dms");

            ClassDefinitionDMO _RuleOBJ = new ClassDefinitionDMO();
            _Rule = new ClassDefinition(_RuleOBJ);
            _RuleOBJ.setClassType("ABSTRACT");
            _Rule.setDefinedIn(this);
            _RuleOBJ.setDescription("A Rule is meant to represent an object that defines the validation logic to be applied to Dark Matter Object as a whole or to its attributes.");
            _RuleOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _RuleOBJ.setIsNamedBy("name");
            _RuleOBJ.setLineNumber("10");
            _RuleOBJ.addMust("name");
            _RuleOBJ.setName("Rule");
            _RuleOBJ.addObjectClass("ClassDefinition");
            _RuleOBJ.setUseWrapperType("SHAREDEXTENDED");
            addClassDefList(_Rule);

            ClassDefinitionDMO _SharedRuleOBJ = new ClassDefinitionDMO();
            _SharedRule = new ClassDefinition(_SharedRuleOBJ);
            _SharedRuleOBJ.setClassType("ABSTRACT");
            _SharedRule.setDefinedIn(this);
            _SharedRuleOBJ.setDerivedFrom("Rule");
            _SharedRuleOBJ.setDescription("A SharedRule is intended for use on both clients and servers or browsers and servlets or whatever. For the most part SharedRules are limited to checking attributes within a single object. The wrapper classes for shared validators are NOT the same as those used ServerRules.");
            _SharedRuleOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _SharedRuleOBJ.setLineNumber("20");
            _SharedRuleOBJ.setName("SharedRule");
            _SharedRuleOBJ.addObjectClass("ClassDefinition");
            _SharedRuleOBJ.setUseWrapperType("SHAREDEXTENDED");
            addClassDefList(_SharedRule);

            ClassDefinitionDMO _SharedAttributeRuleOBJ = new ClassDefinitionDMO();
            _SharedAttributeRule = new ClassDefinition(_SharedAttributeRuleOBJ);
            _SharedAttributeRuleOBJ.setClassType("ABSTRACT");
            _SharedAttributeRule.setDefinedIn(this);
            _SharedAttributeRuleOBJ.setDerivedFrom("SharedRule");
            _SharedAttributeRuleOBJ.setDescription("The SharedAttributeRule is the simplest rule that operates on a single attribute.");
            _SharedAttributeRuleOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _SharedAttributeRuleOBJ.setLineNumber("28");
            _SharedAttributeRuleOBJ.setName("SharedAttributeRule");
            _SharedAttributeRuleOBJ.addObjectClass("ClassDefinition");
            _SharedAttributeRuleOBJ.setUseWrapperType("SHAREDEXTENDED");
            addClassDefList(_SharedAttributeRule);

            ClassDefinitionDMO _IntegerRangeRuleOBJ = new ClassDefinitionDMO();
            _IntegerRangeRule = new ClassDefinition(_IntegerRangeRuleOBJ);
            _IntegerRangeRuleOBJ.setClassType("STRUCTURAL");
            _IntegerRangeRule.setDefinedIn(this);
            _IntegerRangeRuleOBJ.setDerivedFrom("SharedAttributeRule");
            _IntegerRangeRuleOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _IntegerRangeRuleOBJ.setLineNumber("33");
            _IntegerRangeRuleOBJ.setName("IntegerRangeRule");
            _IntegerRangeRuleOBJ.addObjectClass("ClassDefinition");
            _IntegerRangeRuleOBJ.setUseWrapperType("SHAREDEXTENDED");
            addClassDefList(_IntegerRangeRule);


        }
    }


    @Override
    public DmvSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

