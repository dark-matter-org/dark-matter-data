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

/**
 * The ApplicationPage dumps the front and end matter for an Application page.
 */
public class ApplicationPage {

	public static void writeStart(BufferedWriter out, String title) throws IOException {
		out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
		out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
		out.write("<head>\n");
		out.write("<meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"/>\n");
		out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"mvcstyle.css\" />\n");
		out.write("<title>" + title + "</title>\n");
		out.write("</head>\n");
		out.write("\n");
		out.write("<body>\n");
		out.write("\n");
		out.write("  <div id=\"header\"> <div class=\"headerBar\"> </div> </div>\n");
		out.write("\n");
		out.write("  <div id=\"main\">\n");
	}
	
	public static void writeEnd(BufferedWriter out) throws IOException {
		out.write("  </div> <!-- main -->\n");
		out.write("\n");
		out.write("  <div id=\"footer\"> </div>\n");
		out.write("\n");
		out.write("</body>\n");
		out.write("\n");
		out.write("</html>\n");
	}
}