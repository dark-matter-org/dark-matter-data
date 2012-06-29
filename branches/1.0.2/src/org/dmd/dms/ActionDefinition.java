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
import org.dmd.dms.generated.dmo.ActionDefinitionDMO;
import org.dmd.dms.generated.dmw.ActionDefinitionDMW;

public class ActionDefinition extends ActionDefinitionDMW {

	// The classes that use this action
    public ArrayList<ClassDefinition> usedByClasses;
    
    // The classes to which this action is attached
    public ArrayList<ClassDefinition> attachedToClasses;

    /**
     * Default constructor.
     */
    public ActionDefinition(){
    	super(new ActionDefinitionDMO(),MetaSchemaAG._ActionDefinition);
    }
    
    public ActionDefinition(ActionDefinitionDMO obj){
    	super(obj);
    }
    
	protected ActionDefinition(String mn) throws DmcValueException {
		super(mn);
	}

    /**
     * Adds a class to our list of classes that use this action.
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
     * Adds a class to our list of classes that this action is attached to.
     */
    void addAttachedToClass(ClassDefinition cd){
        if (attachedToClasses == null) {
            attachedToClasses = new ArrayList<ClassDefinition>();
        }
        if (!attachedToClasses.contains(cd)) {
            attachedToClasses.add(cd);
        }
    }

}
