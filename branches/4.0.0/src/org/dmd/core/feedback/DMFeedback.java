package org.dmd.core.feedback;

/**
 * The DMFeedback object provides a mechanism for passing feedback back through some
 * chain of processing or data handling.
 * <p/>
 * Why?
 * <p/>
 * Because it's useful to have a common mechanism to handle both errors and warnings
 * and to allow entities at the top of the food chain to determine what to do with the
 * feedback they receive. 
 */
abstract public class DMFeedback {
	
	// true if this represents an error as opposed to a warning
	boolean	error;
	
	// The message to be displayed
	protected StringBuffer	message;
	
	/**
	 * Construct an empty error.
	 */
	public DMFeedback(){
		error 	= true;
		message = new StringBuffer();
	}
	
	/**
	 * Construct and empty error or warning.
	 * @param f true for error false for warning.
	 */
	public DMFeedback(boolean f){
		error 	= f;
		message = new StringBuffer();
	}
	
	/**
	 * Construct an error or warning with the specified message.
	 * @param f
	 * @param msg
	 */
	public DMFeedback(boolean f, String msg){
		error 	= f;
		message = new StringBuffer(msg);
	}
	
	/**
	 * @return true if this is an error.
	 */
	public boolean error(){
		return(error);
	}

	/**
	 * Appends a newline and then the additional message.
	 * @param msg
	 */
	public void addToMessage(String msg){
		message.append("\n" + msg);
	}
	
}
