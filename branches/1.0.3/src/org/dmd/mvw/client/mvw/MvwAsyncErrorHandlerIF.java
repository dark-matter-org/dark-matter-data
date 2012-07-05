package org.dmd.mvw.client.mvw;

/**
 * The MvwAsyncErrorHandlerIF interface defines a component that can handle error
 * indications that result from failure to dynamically load code segments using
 * GWT's code splitting mechanisms.
 * <p/>
 * If any MVW component sets the codeSplit flag to true, then there must be a Controller
 * that sets its centralAsyncErrorHandler flag to true. That Controller's base implementation
 * will be generated to implement this interface.
 */
public interface MvwAsyncErrorHandlerIF {

	/**
	 * Implementors should do something useful when called ;-)
	 * @param error indicates the class we were trying to instantiate dynamically.
	 * @param reason the reason for the error.
	 */
	public void handleAsyncCodeError(String error, Throwable reason);
}
