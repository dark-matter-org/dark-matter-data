package org.dmd.dmw;

import org.dmd.core.DmcAttribute;
import org.dmd.core.DmcObject;
import org.dmd.core.DmcObjectName;
import org.dmd.core.DmcOmni;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DmcNameClashException;
import org.dmd.core.interfaces.DmcObjectNameIF;
import org.dmd.dms.server.extended.SchemaDefinition;
import org.dmd.dms.server.extended.SchemaManager;
import org.dmd.util.runtime.DebugInfo;


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
	
	static public synchronized DmwOmni instance(){
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
	 * @throws DmcNameClashException  
	 * @throws DMFeedbackSet 
	 */
	public DmwWrapper wrapIt(DmcObject dmo) throws DmcNameClashException, DMFeedbackSet {
		// BIG NOTE: this method is often called when dealing with events as a convenience 
		// mechanism to get back a wrapped object. However, if the object is already wrapped,
		// we DON'T WANT TO RECREATE THE WRAPPER!!!!
		if (dmo.getContainer() == null)
			return(schema.wrapIt(dmo));
		else
			return (DmwWrapper) (dmo.getContainer());
	}
}
