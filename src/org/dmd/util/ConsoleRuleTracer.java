package org.dmd.util;

import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.RuleTracerIF;

public class ConsoleRuleTracer implements RuleTracerIF {

	@Override
	public void ruleExecuted(String info) {
		System.out.println(info);
	}

	@Override
	public void ruleFailed(DmcRuleExceptionSet errors) {
		System.out.println(errors.toString());
	}

	@Override
	public void ruleAdded(String info) {
		System.out.println(info);
	}

}
