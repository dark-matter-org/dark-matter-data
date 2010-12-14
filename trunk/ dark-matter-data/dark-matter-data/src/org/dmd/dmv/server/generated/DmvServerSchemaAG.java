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


public class DmvServerSchemaAG extends SchemaDefinition {

    public static ClassDefinition _ServerRule;
    public static ClassDefinition _ClassRule;
    public static ClassDefinition _MustRule;
    public static ClassDefinition _MayRule;

    static DmvServerSchemaAG instance;

    public DmvServerSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmv.server.generated.DmvServerSchemaAG";

        dependsOnSchemaClasses.put("dmv","org.dmd.dmv.shared.generated.DmvSchemaAG");

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmv.server");
            me.setSchemaPackage("org.dmd.dmv.server");
            me.setDmwPackage("org.dmd.dmv.server");
            me.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/server/dmdconfig/v0dot1/dmv.server.dms");


            me.addDependsOn("dmv");
            dependsOnSchemaClasses.put("dmv","org.dmd.dmv.shared.generated.DmvSchemaAG");


            ClassDefinitionDMO _ServerRuleOBJ = new ClassDefinitionDMO();
            _ServerRule = new ClassDefinition(_ServerRuleOBJ);
            _ServerRuleOBJ.setClassType("ABSTRACT");
            _ServerRule.setDefinedIn(this);
            _ServerRuleOBJ.setDerivedFrom("Rule");
            _ServerRuleOBJ.setDescription("The ServerRule is intended for use on the server/servlet side of things. It is generally used in a context where schema is available and allows for");
            _ServerRuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/server/dmdconfig/v0dot1/classes.dmd");
            _ServerRuleOBJ.setLineNumber("8");
            _ServerRuleOBJ.setName("ServerRule");
            _ServerRuleOBJ.addObjectClass("ClassDefinition");
            addClassDefList(_ServerRule);

            ClassDefinitionDMO _ClassRuleOBJ = new ClassDefinitionDMO();
            _ClassRule = new ClassDefinition(_ClassRuleOBJ);
            _ClassRuleOBJ.setClassType("ABSTRACT");
            _ClassRule.setDefinedIn(this);
            _ClassRuleOBJ.setDerivedFrom("ServerRule");
            _ClassRuleOBJ.setDescription("The SharedClassRule is a rule that applies to an entire object and its collection of attributes.");
            _ClassRuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/server/dmdconfig/v0dot1/classes.dmd");
            _ClassRuleOBJ.setLineNumber("16");
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
            _MustRuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/server/dmdconfig/v0dot1/classes.dmd");
            _MustRuleOBJ.setLineNumber("23");
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
            _MayRuleOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmv/server/dmdconfig/v0dot1/classes.dmd");
            _MayRuleOBJ.setLineNumber("30");
            _MayRuleOBJ.setName("MayRule");
            _MayRuleOBJ.addObjectClass("ClassDefinition");
            _MayRuleOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MayRule);


        }
    }


    @Override
    public DmvServerSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

