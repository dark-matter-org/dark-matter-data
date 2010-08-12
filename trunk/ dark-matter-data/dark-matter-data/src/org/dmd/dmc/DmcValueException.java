package org.dmd.dmc;

/**
 * DmcValueExceptions are thrown when you attempt to set the value of a DmcAttribute
 * to a value that is not compatible with the type.
 */
@SuppressWarnings("serial")
public class DmcValueException extends Exception {

	public DmcValueException(String message){
		super(message);
	}
}
