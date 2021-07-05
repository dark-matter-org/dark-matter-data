package org.dmd.util;

/**
 * The UtilityOptions class provides a singleton that contains flags to control various
 * levels of feedback output from utilities such as DmoGen and DmgGen.
 * @author peter
 *
 */
public class UtilityOptions {
	
	// If set true, we don't display progress messages
	private boolean quietProgress;
	
	// If set to true, we don't display warning messages
	private boolean quietWarnings;

	private static UtilityOptions instance;
	
	private UtilityOptions() {
		
	}
	
	public static UtilityOptions instance() {
		if (instance == null)
			instance = new UtilityOptions();
		return(instance);
	}
	
	public void quiteProgress(boolean flag) {
		quietProgress = flag;
	}
	
	public boolean quietProgress() {
		return(quietProgress);
	}
	
	public void quiteWarnings(boolean flag) {
		quietWarnings = flag;
	}
	
	public boolean quietWarnings() {
		return(quietWarnings);
	}
}
