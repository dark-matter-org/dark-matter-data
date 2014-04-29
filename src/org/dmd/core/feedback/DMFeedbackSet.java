package org.dmd.core.feedback;

import java.util.ArrayList;

/**
 * The DMFeedbackSet allows for gathering a set of related feedback together. This
 * approach can reduce the annoying situation where you hit one exception after another 
 * during iterative executions of the same utility/tool. For instance, if you are sanity
 * checking an object, you'd rather get all of the problems with the object on the first
 * run, instead of hitting one problem after another.
 */
@SuppressWarnings("serial")
public class DMFeedbackSet extends Exception {

	// The number of errors that have been added
	int					errors;
	
	// The feedback we've gathered
	ArrayList<DMFeedback> feedback;
	
	/**
	 * Constructs a new DMExceptionSet.
	 */
	public DMFeedbackSet(){
		errors		= 0;
		feedback 	= new ArrayList<>();
	}
	
	/**
	 * Shorthand mechanism to create a DMFeedbackSet with a single piece of error feedback.
	 */
	public DMFeedbackSet(String msg){
		errors		= 0;
		feedback 	= new ArrayList<>();
		feedback.add(new DMError(msg));
	}
	
	/**
	 * Constructs a new DMExceptionSet with the specified exception.
	 * @param e the exception to be added
	 */
	public DMFeedbackSet(DMFeedback dme){
		feedback = new ArrayList<>();
		feedback.add(dme);
		if (dme.error())
			errors++;
	}
	
	/**
	 * Add another individual exception.
	 * @param e the exception.
	 * @return this DMFeedbackSet
	 */
	public DMFeedbackSet add(DMFeedback dme){
		feedback.add(dme);
		if (dme.error())
			errors++;
		return(this);
	}
	
	/**
	 * Add another set of exceptions.
	 * @param set the exceptions.
	 * @return this DMFeedbackSet
	 */
	public DMFeedbackSet add(DMFeedbackSet set){
		feedback.addAll(set.feedback);
		return(this);
	}
	
	/**
	 * @return true if we have any errors.
	 */
	public boolean error(){
		return(errors > 0);
	}
	
	/**
	 * @return the number of error we encountered.
	 */
	public int errors(){
		return(errors);
	}
	
	/**
	 * @return the last feedback that was added.
	 */
	public DMFeedback last(){
		if (feedback.size() > 0)
			return(feedback.get(feedback.size()-1));
		return(null);
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		for(DMFeedback fb: feedback)
			sb.append(fb.toString() + "\n");
		
		return(sb.toString());
	}
}
