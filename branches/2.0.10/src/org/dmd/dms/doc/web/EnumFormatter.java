package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dms.EnumDefinition;
import org.dmd.dms.types.EnumValue;
import org.dmd.util.exceptions.DebugInfo;

public class EnumFormatter {

	static public void dumpDetails(BufferedWriter out, EnumDefinition ed) throws IOException {
		out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");

		enumName(out, ed);
		description(out, ed);
		Iterator<EnumValue>	evi = ed.getEnumValue();
		while(evi.hasNext()){
			EnumValue ev = evi.next();
			enumValue(out, ev);
		}
	}
	
	static void enumName(BufferedWriter out, EnumDefinition ed) throws IOException{
		out.write("    <tr> <td class=\"className\" colspan=\"4\"> <a name=\"" + ed.getName() + "\"> " + ed.getName() + " </a> </td></tr>\n");
	}
	
	static void description(BufferedWriter out, EnumDefinition ed) throws IOException{
		if (ed.getDescription() != null){
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\" colspan=\"2\">Description</td>\n");
			out.write("      <td>" + ed.getDescription() + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}
	
	static void enumValue(BufferedWriter out, EnumValue ev) throws IOException{
		out.write("    <tr>\n");
		out.write("      <td class=\"spacer\"> </td>\n");
		out.write("      <td> " + ev.getId() + "</td>\n");
		out.write("      <td> " + ev.getName() + "</td>\n");
		out.write("      <td>" + ev.getDescription() + "</td>\n");
		out.write("    </tr>\n\n");
	}

}
