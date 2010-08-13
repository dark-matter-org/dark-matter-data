package org.dmd.test;

import java.io.IOException;

import org.dmd.util.exceptions.ResultException;

public class DmsSchemaParserTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			DmsSchemaParserTest pt = new DmsSchemaParserTest();
			
			pt.run();
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
