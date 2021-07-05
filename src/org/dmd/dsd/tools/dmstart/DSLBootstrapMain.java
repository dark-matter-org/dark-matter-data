package org.dmd.dsd.tools.dmstart;


public class DSLBootstrapMain {

	public static void main(String[] args) {
		try {
			DSDInteractive interactive = new DSDInteractive(args);
			interactive.run();
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		
	}
}
