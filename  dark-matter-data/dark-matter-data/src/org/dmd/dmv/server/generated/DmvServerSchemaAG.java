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

    public static ClassDefinition _ServerValidator;
    public static ClassDefinition _MustValidator;

    static DmvServerSchemaAG instance;

    public DmvServerSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmv.server.generated.DmvServerSchemaAG";

        dependsOnSchemaClasses.put("dmv","org.dmd.dmv.server.generated.DmvSchemaAG");

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmv.server");
            me.setSchemaPackage("org.dmd.dmv.server");
            me.setDmwPackage("org.dmd.dmv.server");
            me.setFile("C:/Dev/workspace/dark-matter-data/src/org/dmd/dmv/server/dmdconfig/v0dot1/dmv.server.dms");


            me.addDependsOn("dmv");
            dependsOnSchemaClasses.put("dmv","org.dmd.dmv.server.generated.DmvSchemaAG");


            ClassDefinitionDMO _ServerValidatorOBJ = new ClassDefinitionDMO();
            _ServerValidator = new ClassDefinition(_ServerValidatorOBJ);
            _ServerValidatorOBJ.setClassType("ABSTRACT");
            _ServerValidator.setDefinedIn(this);
            _ServerValidatorOBJ.setDerivedFrom("Validator");
            _ServerValidatorOBJ.setDescription("The ServerValidator is intended for use on the server/servlet side of things. It is generally used in a context where schema is available and allows for");
            _ServerValidatorOBJ.setFile("C:/Dev/workspace/dark-matter-data/src/org/dmd/dmv/server/dmdconfig/v0dot1/classes.dmd");
            _ServerValidatorOBJ.setLineNumber("8");
            _ServerValidatorOBJ.setName("ServerValidator");
            _ServerValidatorOBJ.addObjectClass("ClassDefinition");
            addClassDefList(_ServerValidator);

            ClassDefinitionDMO _MustValidatorOBJ = new ClassDefinitionDMO();
            _MustValidator = new ClassDefinition(_MustValidatorOBJ);
            _MustValidatorOBJ.setClassType("STRUCTURAL");
            _MustValidator.setDefinedIn(this);
            _MustValidatorOBJ.setDerivedFrom("ServerValidator");
            _MustValidatorOBJ.setDescription("The MustValidator verifies that an object has its must attributes.");
            _MustValidatorOBJ.setFile("C:/Dev/workspace/dark-matter-data/src/org/dmd/dmv/server/dmdconfig/v0dot1/classes.dmd");
            _MustValidatorOBJ.setLineNumber("15");
            _MustValidatorOBJ.setName("MustValidator");
            _MustValidatorOBJ.addObjectClass("ClassDefinition");
            _MustValidatorOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_MustValidator);


        }
    }


    @Override
    public DmvServerSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

