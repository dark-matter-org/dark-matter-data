package org.dmd.dmc.rules;

public interface RuleTracerIF {

	public void ruleExecuted(String info);
	
	public void ruleFailed(DmcRuleExceptionSet errors);
}
