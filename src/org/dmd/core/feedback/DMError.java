package org.dmd.core.feedback;

/**
 * The DMError indicates an error with no particular location.
 */
public class DMError extends DMFeedback {

	public DMError(String msg){
		super(true,msg);
	}
}
