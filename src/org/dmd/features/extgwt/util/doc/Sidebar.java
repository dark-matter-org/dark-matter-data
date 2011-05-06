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

public class Sidebar {

	public static void write(BufferedWriter out) throws IOException {
		out.write("		<div id=\"sidebar\">\n");
		out.write("		<ul class=\"navList\">\n");
		out.write("			<li class=\"navItem\"><a class=\"navLink\" href=\"applications.html\">\n");
		out.write("			Applications </a></li>\n");
		out.write("			<li class=\"navItem\"><a class=\"navLink\" href=\"controllers.html\">\n");
		out.write("			Controllers </a></li>\n");
		out.write("			<li class=\"navItem\"><a class=\"navLink\" href=\"views.html\">\n");
		out.write("			Views </a></li>\n");
		out.write("			<li class=\"navItem\"><a class=\"navLink\" href=\"events.html\">\n");
		out.write("			Events </a></li>\n");
		out.write("			<li class=\"navItem\"><a class=\"navLink\" href=\"serverEvents.html\">\n");
		out.write("			Server Events </a></li>\n");
		out.write("			<li class=\"navItem\"><a class=\"navLink\" href=\"registry.html\">\n");
		out.write("			Registry </a></li>\n");
		out.write("	   </ul>\n");
		out.write("	   </div>\n");
		
	}
}
