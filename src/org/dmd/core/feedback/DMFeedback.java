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
public class DMFeedback {
	
	// The source of the error
	String			source;
	
	// The line where it occured or null if it's not known
	Integer			line;
	
	// true if this represents an error as opposed to a warning
	boolean	error;
	
	// The message to be displayed
	protected StringBuffer	message;
	
	/**
	 * Constructs an error with the specified message.
	 */
	public DMFeedback(String msg){
		error 	= true;
		message = new StringBuffer(msg);
		source 	= null;
		line	= null;
	}
	
	/**
	 * Construct and empty error or warning.
	 * @param f true for error false for warning.
	 */
	public DMFeedback(boolean f){
		error 	= f;
		message = new StringBuffer();
		source 	= null;
		line	= null;
	}
	
	/**
	 * Construct an error or warning with the specified message.
	 * @param f
	 * @param msg
	 */
	public DMFeedback(boolean f, String msg){
		error 	= f;
		message = new StringBuffer(msg);
		source 	= null;
		line	= null;
	}
	
	/**
	 * Construct an error or warning with the specified message.
	 * @param msg the error message
	 * @param src the file where error occured
	 * @param l the line number
	 */
	public DMFeedback(String msg, String src, int l){
		error 	= true;
		message = new StringBuffer(msg);
		source 	= src;
		line	= l;
	}
	
	/**
	 * Sets the location information.
	 * @param fn file name
	 * @param ln line number
	 */
	public void setLocation(String fn, int ln){
		source 	= fn;
		line	= ln;
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
	
	/**
	 * Dumps the feedback as a string.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		if (error)
			sb.append("Error: " + message.toString());
		else
			sb.append("Warning: " + message.toString());
		
		if (source != null)
			sb.append("\nSource: " + source + "\n");
		if (line != null)
			sb.append("\n  Line: " + line + "\n");
		
		return(sb.toString());
	}

}
