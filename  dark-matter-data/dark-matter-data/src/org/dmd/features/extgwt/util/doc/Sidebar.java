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
