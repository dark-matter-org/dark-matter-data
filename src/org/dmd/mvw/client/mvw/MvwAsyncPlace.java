package org.dmd.mvw.client.mvw;

import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.activity.shared.Activity;

/**
 * The MvwAsynchPlace allows for asynchronous initialization of Activity code sections.
 * 
 */
abstract public class MvwAsyncPlace extends MvwPlace {
	
	protected Activity	activity;

	public MvwAsyncPlace(String t) {
		super(t);
	}

	@Override
	public Activity getActivity(MvwRunContextIF runContext) {
		return(activity);
	}
	
	abstract public void initActivity(MvwAsyncPlaceController apc, MvwRunContextIF runContext);

}
