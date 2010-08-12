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

import org.dmd.dms.generated.dmw.SchemaDefinitionDMW;

import org.dmd.util.exceptions.*;

public class SchemaDefinition extends SchemaDefinitionDMW {

    // Stores the name of the schema as it would be referred to in a static
    // reference
    protected String staticRefName;

    // Indicates if we've called initializeDefs() - we only do this once.
    protected boolean defsCompleteV;

	protected SchemaDefinition(String mn) {
		super(mn);
	}

	protected SchemaDefinition(ClassDefinition cd) {
		super(cd);
	}

    /**
     * Indicates if our initializeDefs() function has been called.
     */
    public boolean defsComplete(){
        return(defsCompleteV);
    }

    /**
     * Initializes the static members of the schema so that they can be referred
     * to by other schemas. At this level, this function does nothing. Derived
     * schemas classes (which are usually automatically generated) will overload
     * this function to perform the proper initialization.
     * @param rs Place to return result information.
     * @returns true If the initialization proceeded without problems and false otherwise.
     */
    public void initialize() throws ResultException {
        
    }

    /**
     * Initializes the values of the definitions. At this level, this function does nothing. Derived
     * schemas classes (which are usually automatically generated) will overload
     * this function to perform the proper initialization.
     * @param rs Place to return result information.
     * @returns true If the initialization proceeded without problems and false otherwise.
     */
    public void initializeDefs() throws ResultException {
        
    }

    /**
     * Determines if this version of the schema contains different classes compared
     * to its predecessor.
     */
    public int classChanges(SchemaDefinition pred, StringBuffer sb){
        int         rc = 0;

        return(rc);
    }

    /**
     * Determines if this version of the schema contains different attributes compared
     * to its predecessor.
     */
    public int attributeChanges(SchemaDefinition pred, StringBuffer sb, SchemaManager currManager){
//        DmdGenericAttribute c = (DmdGenericAttribute)this.getAttr(MetaSchema._attributeDefList);
//        DmdGenericAttribute p = (DmdGenericAttribute)pred.getAttr(MetaSchema._attributeDefList);
        int         rc = 0;
        
        /**
         * TODO finish implementing attributeChanges()
         */
        return(rc);
    }

    /**
     * Determines if this version of the schema contains different types compared
     * to its predecessor.
     */
    public int typeChanges(SchemaDefinition pred, StringBuffer sb){
//        DmdGenericAttribute c = (DmdGenericAttribute)this.getAttr(MetaSchema._typeDefList);
//        DmdGenericAttribute p = (DmdGenericAttribute)pred.getAttr(MetaSchema._typeDefList);
        int         rc = 0;

        /**
         * TODO finish implementing typeChanges()
         */

        return(rc);
    }

}

