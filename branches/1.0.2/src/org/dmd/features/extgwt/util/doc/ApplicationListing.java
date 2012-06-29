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
package org.dmd.features.extgwt.util.doc;

import java.io.BufferedWriter;
import java.io.IOException;

public class ApplicationListing {

	public static void writeStart(BufferedWriter out, String appname, String description) throws IOException {
		out.write("      <div class=\"application\" id=\"bodycopy\">\n");
		out.write("\n");
		out.write("        <div class=\"appHeader\">\n");
		out.write("          <div class=\"appName\">\n");
		out.write("            " + appname + "\n");
		out.write("	         </div>\n");
		out.write("	         <div class=\"description\">\n");
		out.write("            " + description + "\n");
		out.write("	         </div>\n");
		out.write("	       </div> <!-- app header -->\n");
		out.write("	\n");
	}
	
	public static void writeEnd(BufferedWriter out) throws IOException {
		out.write("	    </div> <!-- bodycopy -->\n");
		out.write("	\n");
	}
}
