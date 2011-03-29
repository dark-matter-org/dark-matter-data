package org.dmd.dmw;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOmni;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The DmwOmni extends the basic DmcOmni and adds support for managing
 * a greater range of information that's useful in a full Java environment.
 * This includes mechanisms used by the DMW wrappers to handle the wrapping
 * of primitive name types with DmcType information.
 */
public class DmwOmni extends DmcOmni {
	
	protected static DmwOmni dmwomni;
	
	SchemaManager	schema;

	protected DmwOmni(){
		super();
		dmwomni = this;
		try {
			schema = new SchemaManager();
			
			// Add the schema manager as a resolver
			addResolver(schema);
		} catch (Exception e) {
			throw(new IllegalStateException("Instantiation of the SchemaManager should never throw an exception!", e));
		}
	}
	
	static public DmwOmni instance(){
		if (dmwomni == null)
			new DmwOmni();
		return(dmwomni);
	}
	
	public void addSchema(SchemaDefinition sd){
		try {
			schema.manageSchema(sd);
		} catch (Exception e) {
			throw(new IllegalStateException("Managing an auto-generated schema should never throw an exception!", e));
		}
	}
	
	public DmcAttribute<DmcObjectNameIF> getNameAttribute(DmcObjectNameIF oni){
		DmcAttribute<DmcObjectNameIF> rc = schema.getNameAttributeInstance(oni.getClass().getName());
		DebugInfo.debug(oni.getClass().getName());
		return(rc);
	}
}
