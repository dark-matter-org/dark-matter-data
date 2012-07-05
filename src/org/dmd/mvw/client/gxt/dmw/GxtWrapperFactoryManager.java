package org.dmd.mvw.client.gxt.dmw;

import java.util.ArrayList;

import org.dmd.dmc.DmcObject;

/**
 * The GxtWrapperFactoryManager manages a set of GxtWrapperFactoryIF instances
 * and will wrap DMOs using the appropriate wrapper factory.
 */
public class GxtWrapperFactoryManager {
	
	ArrayList<GxtWrapperFactoryIF>	factories;

	public GxtWrapperFactoryManager(){
		factories = new ArrayList<GxtWrapperFactoryIF>();
	}
	
	public void addFactory(GxtWrapperFactoryIF factory){
		factories.add(factory);
	}
	
	public GxtWrapper wrapObject(DmcObject obj){
		GxtWrapper rc = null;
		
		for(GxtWrapperFactoryIF factory: factories){
			if ( (rc = factory.wrapObject(obj)) != null)
				break;
		}
		
		if (rc == null)
			throw new IllegalStateException("Could not wrap object - you need to add the appropriate GxtWrapperFactory: \n" + obj.toOIF());
		
		return(rc);
	}
}
