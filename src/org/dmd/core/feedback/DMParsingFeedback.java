package org.dmd.core.feedback;

/**
 * The DMParsingException is thrown when we encounter problems parsing textual
 * information from some source, often a file, but it might be something else.
 */
public class DMParsingFeedback extends DMFeedback {

	// The source of the error
	String			source;
	
	// The line where it occured or null if it's not known
	Integer			line;
	
	/**
	 * Creates an empty error.
	 */
	public DMParsingFeedback(){
		super(true);
		message = new StringBuffer();
		source 	= null;
		line	= null;
	}
	
	/**
	 * Creates a new error with the specified message.
	 * @param msg the message.
	 */
	public DMParsingFeedback(String msg){
		super(true);
		message = new StringBuffer(msg);
		source	= null;
		line	= null;
	}
	
	/**
	 * Creates a new piece of parsing feedback with the specified message.
	 * @param error set this to false if you want to generate a warning.
	 * @param msg the message.
	 */
	public DMParsingFeedback(boolean error, String msg){
		super(error);
		message = new StringBuffer(msg);
		source	= null;
		line	= null;
	}
	
	/**
	 * Creates a new exception with the specified message and source.
	 * @param msg the message.
	 * @param src the source of the error.
	 */
	public DMParsingFeedback(String msg, String src){
		super(true);
		message = new StringBuffer(msg);
		source	= src;
		line	= null;
	}
	
	public DMParsingFeedback(String msg, String src, int l){
		super(true);
		message = new StringBuffer(msg);
		source	= src;
		line	= l;
	}
	
	/**
	 * Appends a newline and then the additional message.
	 * @param msg
	 */
	public void addToMessage(String msg){
		message.append("\n" + msg);
	}
	
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
