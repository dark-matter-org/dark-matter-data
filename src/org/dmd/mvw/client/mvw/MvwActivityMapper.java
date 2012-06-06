package org.dmd.mvw.client.mvw;

import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

/**
 * The MvwActivityMapper is a generic activity mapper that's used in conjunction
 * with the Model View Whatever (MVW) framework. This works because of a couple
 * of design choices: 1. Places map one-to-one with Activities and 2. All places
 * are derived from a common MvwPlace which knows how to construct the Activity
 * associated with it. 
 */
public class MvwActivityMapper implements ActivityMapper {

	private final MvwRunContextIF	runContext;
	
	public MvwActivityMapper(MvwRunContextIF rc){
		runContext = rc;
	}

	@Override
	public Activity getActivity(Place place) {
		return( ((MvwPlace)place).getActivity(runContext) );
	}
}
