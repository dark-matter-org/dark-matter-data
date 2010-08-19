package org.dmd.dms.tools.dmogenerator;

import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.util.exceptions.ResultException;

public class DmoGeneratorMain {

	public static void main(String[] args) {
		try {
			DmoGenUtility	gen = new DmoGenUtility();
			
			gen.run();
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
