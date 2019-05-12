package org.dmd.templates.tools.dmtdlgen;


public class DmtdlGenMain {

	public static void main(String[] args) {
		DmtdlGen gen = new DmtdlGen();
		
		try {
			gen.run(args);
		} catch (Exception e) {
			System.err.println(e.toString());
			e.printStackTrace();
			System.exit(1);
		}

	}

}
