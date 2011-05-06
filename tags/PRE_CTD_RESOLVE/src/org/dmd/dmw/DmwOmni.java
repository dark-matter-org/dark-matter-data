package org.dmd.dmw;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOmni;
import org.dmd.dms.DmwWrapper;
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
	
	/**
	 * @return the global schema manager.
	 */
	public SchemaManager getSchema(){
		return(schema);
	}
	
	public void addSchema(SchemaDefinition sd){
		try {
			// A little bit of trickiness here, the schema's name isn't available
			// until it has been initialized. The initialization is triggered by
			// calling getInstance().
			if (sd.getName() == null)
				sd.getInstance();
			
			if (schema.isSchema(sd.getName().getNameString()) == null)
				schema.manageSchema(sd);
			
		} catch (Exception e) {
			throw(new IllegalStateException("Managing an auto-generated schema should never throw an exception!", e));
		}
	}
	
	public DmcAttribute<DmcObjectNameIF> getNameAttribute(DmcObjectName oni){
		DmcAttribute<DmcObjectNameIF> rc = schema.getNameAttributeInstance(oni);
		DebugInfo.debug(oni.getClass().getName());
		return(rc);
	}
	
	/**
	 * A convenience function that will attempt to wrap the specified DMO.
	 * @param dmo
	 * @return The DMO inside its wrapper.
	 */
	public DmwWrapper wrapIt(DmcObject dmo){
		// BIG NOTE: this method is often called when dealing with events as a convenience 
		// mechanism to get back a wrapped object. However, if the object is already wrapped,
		// we DON'T WANT TO RECREATE THE WRAPPER!!!!
		if (dmo.getContainer() == null)
			return(schema.wrapIt(dmo));
		else
			return (DmwWrapper) (dmo.getContainer());
	}
}
