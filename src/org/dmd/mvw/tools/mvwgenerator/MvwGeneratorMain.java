//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.mvw.tools.mvwgenerator;

import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmoGeneratorMain class is just the mainline for the DMO Generator Utility.
 * <P>
 * If you want the utility to search other folders (beyond where you're running
 * the utility), just add a dAdrkMatter folder to your Application Data folder.
 * Add a file called sourcedirs.txt
 */
public class MvwGeneratorMain {

	public static void main(String[] args) {
		MvwGenUtility utility;
		try {
			utility = new MvwGenUtility(args);
			
			utility.run();
		} catch (ResultException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DmcValueException e) {
			e.printStackTrace();
		} catch (DmcValueExceptionSet e) {
			e.printStackTrace();
		}
		
		
	}
}
