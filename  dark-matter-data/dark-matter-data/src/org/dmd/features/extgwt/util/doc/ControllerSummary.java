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
