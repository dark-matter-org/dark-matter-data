package org.dmd.dms.server.util;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.dms.server.extended.DmsModule;

public interface DmsModuleIF {

	public DmsModule dmsModuleInstance() throws DMFeedbackSet;
	
}
