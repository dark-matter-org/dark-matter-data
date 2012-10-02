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

public class ControllerSummary {

	public static void writeStart(BufferedWriter out) throws IOException {
		out.write("        <div class=\"controllerSummary\">\n");
		out.write("\n");
		out.write("          <div class=\"controllerListTitle\">\n");
		out.write("			   Controllers \n");
		out.write("		     </div>\n");
		out.write("\n");
		out.write("	        <table class=\"controllerList\">\n");
	}
	
	public static void writeControllerEntry(BufferedWriter out, String name) throws IOException {
		out.write("		    <tr>\n");
		out.write("		      <td class=\"controllerListItem\">\n");
		out.write("			    <a href=\"#" + name + "\"> " + name + " </a>\n");
		out.write("			  </td>\n");
		out.write("		    </tr>\n");
	}
		
	public static void writeEnd(BufferedWriter out) throws IOException {
		out.write("          </table>\n");
		out.write("\n");
		out.write("        </div> <!--  controller summary -->\n");
	}
}
