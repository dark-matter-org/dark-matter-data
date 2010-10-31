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
	
	public static void writeEnd(BufferedWriter out, String appname, String description) throws IOException {
		
	}
}
