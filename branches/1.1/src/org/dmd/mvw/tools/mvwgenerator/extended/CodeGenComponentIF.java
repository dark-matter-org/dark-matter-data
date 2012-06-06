package org.dmd.mvw.tools.mvwgenerator.extended;

/**
 * The CodeGenComponentIF interface defines components that require additional initialization
 * after all related MVW definitions have been read.
 */
public interface CodeGenComponentIF {
	
	/**
	 * Resets the component's code generation information.
	 */
	public void resetCodeGenInfo();
}
