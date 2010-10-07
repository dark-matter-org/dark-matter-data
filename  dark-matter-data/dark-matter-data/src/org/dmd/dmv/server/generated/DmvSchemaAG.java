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

    public static ClassDefinition _Validator;
    public static ClassDefinition _SharedValidator;

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
            me.setFile("C:/Dev/workspace/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/dmv.dms");

            ClassDefinitionDMO _ValidatorOBJ = new ClassDefinitionDMO();
            _Validator = new ClassDefinition(_ValidatorOBJ);
            _ValidatorOBJ.setClassType("ABSTRACT");
            _Validator.setDefinedIn(this);
            _ValidatorOBJ.setDescription("A Validator is meant to represent an object that performs validation logic against an entire Dark Matter Object or one or more of its attributes.");
            _ValidatorOBJ.setFile("C:/Dev/workspace/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _ValidatorOBJ.setLineNumber("7");
            _ValidatorOBJ.setName("Validator");
            _ValidatorOBJ.addObjectClass("ClassDefinition");
            addClassDefList(_Validator);

            ClassDefinitionDMO _SharedValidatorOBJ = new ClassDefinitionDMO();
            _SharedValidator = new ClassDefinition(_SharedValidatorOBJ);
            _SharedValidatorOBJ.setClassType("ABSTRACT");
            _SharedValidator.setDefinedIn(this);
            _SharedValidatorOBJ.setDerivedFrom("Validator");
            _SharedValidatorOBJ.setDescription("A SharedValidator is intended for use on both clients and servers or browsers and servlets or whatever. For the most part SharedValidators are limited to checking attributes within a single object.");
            _SharedValidatorOBJ.setFile("C:/Dev/workspace/dark-matter-data/src/org/dmd/dmv/shared/dmdconfig/v0dot1/classes.dmd");
            _SharedValidatorOBJ.setLineNumber("15");
            _SharedValidatorOBJ.setName("SharedValidator");
            _SharedValidatorOBJ.addObjectClass("ClassDefinition");
            addClassDefList(_SharedValidator);


        }
    }


    @Override
    public DmvSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

