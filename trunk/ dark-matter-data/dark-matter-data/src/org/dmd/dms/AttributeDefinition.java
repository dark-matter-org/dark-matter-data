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
package org.dmd.dms;

import java.util.ArrayList;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmw.AttributeDefinitionDMW;

public class AttributeDefinition extends AttributeDefinitionDMW {

	// The attribute mediator handles alterations to values associated with this
	// attribute definition. Mediators are constructed as part of a TypeDefinition
	// and set on the AttributeDefinition after the types are created.
	TypeDefinition	typeDef;
	
    // Indicates the classes that include this attribute.
    public ArrayList<ClassDefinition>   usedByClasses;

    /**
     * Indicates the actions that include this attribute.
     */
    public ArrayList<ActionDefinition>   usedByActions;

    /**
     * Default constructor.
     */
    public AttributeDefinition(){
    	
    }
    
	/**
	 * Default constructor used in creating the meta schema.
	 * @param mn The meta name of the definition.
	 * @throws DmcValueException 
	 */
	AttributeDefinition(String n, TypeDefinition td) throws DmcValueException{
		super(n);
		typeDef = td;
	}
	

	protected AttributeDefinition(String mn) throws DmcValueException {
		super(mn);
	}

    /**
     * Adds a class to our list of classes that use this attribute.
     */
    void addUsingClass(ClassDefinition cd){
        if (usedByClasses == null) {
            usedByClasses = new ArrayList<ClassDefinition>();
        }
        if (!usedByClasses.contains(cd)) {
            usedByClasses.add(cd);
        }
    }

    /**
     * Adds an action to our list of actions that use this attribute.
     */
    void addUsingAction(ActionDefinition ad){
        if (usedByActions == null) {
            usedByActions = new ArrayList<ActionDefinition>();
        }
        if (!usedByActions.contains(ad)) {
            usedByActions.add(ad);
        }
    }


}
