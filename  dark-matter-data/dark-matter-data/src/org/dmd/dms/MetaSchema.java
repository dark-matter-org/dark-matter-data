package org.dmd.dms;

import org.dmd.util.exceptions.*;

public class MetaSchema extends MetaSchemaAG {

    /**
     * Provides access to the first schema manager that instantiates the meta-schema.
     * This is useful for GDO classes that may need to the schema for various
     * purposes.
     */
    public static SchemaManager  schemaManager;
    
	public MetaSchema(){
		
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
