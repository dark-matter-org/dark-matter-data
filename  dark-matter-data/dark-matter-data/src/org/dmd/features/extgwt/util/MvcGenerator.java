package org.dmd.features.extgwt.util;

import java.io.PrintStream;


public class MvcGenerator {

	PrintStream	progress;

	public MvcGenerator(){
		initialize();
	}
	
	public MvcGenerator(PrintStream ps){
		progress = ps;
	}
	
	void initialize(){
		
	}
}
