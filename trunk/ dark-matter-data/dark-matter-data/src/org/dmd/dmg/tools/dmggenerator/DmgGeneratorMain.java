package org.dmd.dmg.tools.dmggenerator;

import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.util.exceptions.ResultException;

public class DmgGeneratorMain {

	public static void main(String[] args) {
		DmgGenUtility utility;
		try {
			utility = new DmgGenUtility();
			
			utility.run();
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
