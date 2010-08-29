package org.dmd.features.extgwt.tools.mvcgenerator;

import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmoGeneratorMain class is just the mainline for the DMO Generator Utility.
 * <P>
 * If you want the utility to search other folders (beyond where you're running
 * the utility), just add a dAdrkMatter folder to your Application Data folder.
 * Add a file called sourcedirs.txt
 */
public class MvcGeneratorMain {

	public static void main(String[] args) {
		MvcGenUtility utility;
		try {
			utility = new MvcGenUtility();
			
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
