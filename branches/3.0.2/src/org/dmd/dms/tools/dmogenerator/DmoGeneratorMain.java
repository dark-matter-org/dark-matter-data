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
package org.dmd.dms.tools.dmogenerator;

import java.io.IOException;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.util.exceptions.ResultException;

public class DmoGeneratorMain {

	public static void main(String[] args) {
		try {
			DmoGenUtility	gen = new DmoGenUtility(args);
			
			gen.run();
		} catch (ResultException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DmcValueException e) {
			e.printStackTrace();
		} catch (DmcValueExceptionSet e) {
			e.printStackTrace();
		} catch (DmcRuleExceptionSet e) {
			System.err.print(e.toString());
		} catch (DmcNameClashException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
