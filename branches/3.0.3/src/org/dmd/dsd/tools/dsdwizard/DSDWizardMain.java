package org.dmd.dsd.tools.dsdwizard;


public class DSDWizardMain {

	public static void main(String[] args) {
		try {
			DSDInteractive interactive = new DSDInteractive(args);
			interactive.run();
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		
	}
}
