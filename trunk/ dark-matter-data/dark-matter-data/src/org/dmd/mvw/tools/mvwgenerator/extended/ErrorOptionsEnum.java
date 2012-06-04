package org.dmd.mvw.tools.mvwgenerator.extended;

/**
 * The ErrorOptionsEnum indicates, for DMP or PC errors how the error
 * handling will be performed.
 * <ul>
 * <li> CENTRAL - send the error to the central error handler only</li>
 * <li> CENTRALANDLOCAL - send the error to the central handler first and then the local</li>
 * <li> LOCAL - send the error only to the local handler</li>
 * </ul>
 */
public enum ErrorOptionsEnum {
	CENTRAL,
	CENTRALANDLOCAL,
	LOCAL
}
