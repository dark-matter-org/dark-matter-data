package org.dmd.mvw.client.gxt.store;

import org.dmd.mvw.client.gxt.dmw.GxtWrapper;

import com.extjs.gxt.ui.client.store.ListStore;

/**
 * The GxtListStore extends the basic GXT ListStore and stores a set of GxtWrapped
 * Dark Matter Objects.
 */
public class GxtListStore<E extends GxtWrapper> extends ListStore<E>{

	/**
	 * Constructs a new GxtListStore.
	 */
	public GxtListStore(){
	}
	
}
