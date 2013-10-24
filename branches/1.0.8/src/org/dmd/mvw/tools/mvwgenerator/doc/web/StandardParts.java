package org.dmd.mvw.tools.mvwgenerator.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;

public class StandardParts {

	static void writePageHeader(BufferedWriter out, String title) throws IOException {
		out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
		out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
		out.write("<head>\n");
		out.write("<meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"/>\n");
		out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"mvwstyle.css\" />\n");
		out.write("<title>" + title + "</title>\n");
		out.write("</head>\n");
		out.write("\n");
		out.write("<body>\n");
		out.write("\n");
		out.write("  <div id=\"header\"> <div class=\"headerBar\"> </div> </div>\n");
		out.write("\n");
		out.write("  <div id=\"main\">\n\n");
	}
	
	static void writePageFooter(BufferedWriter out) throws IOException {
		out.write("  </div> <!-- main -->\n");
		out.write("\n");
		out.write("  <div id=\"footer\"> </div>\n");
		out.write("\n");
		out.write("</body>\n");
		out.write("\n");
		out.write("</html>\n");
	}

	static void writeContentStart(BufferedWriter out) throws IOException{
		out.write("    <div id=\"content\">\n\n");
	}

	static void writeContentEnd(BufferedWriter out) throws IOException{
		out.write("    </div>\n\n");
	}

	static String moduleLink(Module module) {
		return("<a class=\"navLink\" href=\"" + module.getCamelCaseName() + ".html\">" + module.getCamelCaseName() + "</a>");
	}

	static String definitionLink(MvwDefinition def) {
		Module module = def.getDefinedInModule();
		return("<a class=\"navLink\" href=\"" + module.getCamelCaseName() + ".html#" + def.getCamelCaseName()+ "\">" + def.getCamelCaseName() + "</a>");
	}

}
