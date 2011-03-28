package org.dmd.dmc;

/**
 * The DmcOmni (short for omnipresent) provides a single point of access to information
 * and settings that is useful in the operational environment of Dark Matter Objects.
 */
public class DmcOmni {

	private static DmcOmni omni;
	
	boolean	trackBackRefs;
	
	protected DmcOmni(){
		trackBackRefs = false;
	}
	
	static private void init(){
		if (omni == null)
			omni = new DmcOmni();
	}
	
	/**
	 * @return true if DMO back reference tracking should be performed.
	 */
	public static boolean backRefTrackingOn(){
		init();
		return(omni.trackBackRefs);
	}
	
	public static void backRefTrackingOn(boolean f){
		init();
		omni.trackBackRefs = f;
	}
	
	
}
