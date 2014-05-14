package org.dmd.core.feedback;

/**
 * The DMParsingException is thrown when we encounter problems parsing textual
 * information from some source, often a file, but it might be something else.
 */
public class DMParsingFeedback extends DMFeedback {

	/**
	 * Creates an empty error.
	 */
	public DMParsingFeedback(){
		super(true);
	}
	
	/**
	 * Creates a new error with the specified message.
	 * @param msg the message.
	 */
	public DMParsingFeedback(String msg){
		super(msg);
	}
	
	/**
	 * Creates a new piece of parsing feedback with the specified message.
	 * @param error set this to false if you want to generate a warning.
	 * @param msg the message.
	 */
	public DMParsingFeedback(boolean error, String msg){
		super(error,msg);
	}
	
	/**
	 * Creates a new exception with the specified message and source.
	 * @param msg the message.
	 * @param src the source of the error.
	 */
	public DMParsingFeedback(String msg, String src){
		super(true);
		message = new StringBuffer(msg);
		source = new SourceInfo(src, 0);
	}
	
	public DMParsingFeedback(String msg, String src, int l){
		super(msg,src,l);
	}
	
}
