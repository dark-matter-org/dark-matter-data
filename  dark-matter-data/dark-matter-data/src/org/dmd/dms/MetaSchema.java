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

import org.dmd.dmc.DmcValueException;
import org.dmd.util.exceptions.*;

public class MetaSchema extends MetaSchemaAG {

    /**
     * Provides access to the first schema manager that instantiates the meta-schema.
     * This is useful for GDO classes that may need to the schema for various
     * purposes.
     */
    public static SchemaManager  schemaManager;
    
	public MetaSchema() throws DmcValueException{
		super();
	}
	
	/**
	 * TODO add proper logging capability to the metaschema
	 */
	public static void logException(ResultException ex){
		DebugInfo.debug(ex.toString());
		DebugInfo.debug(DebugInfo.getCurrentStack());
	}
	
    /**
     * Sets the schema manager if it's not already set.
     */
    public void setSchemaManager(SchemaManager sm){
        if (schemaManager == null)
            schemaManager = sm;
    }

}
