package org.dmd.dms.shared.generated.types;

import org.dmd.core.feedback.DMFeedbackSet;
import org.junit.Test;

public class RuleParamTest {

	@Test
	public void test1(){
		try {
			RuleParam param = new RuleParam("org.dmd.dmc.DmcObject: :obj:The object to be initialized");
		} catch (DMFeedbackSet e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
