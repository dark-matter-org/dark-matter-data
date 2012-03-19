package org.dmd.mvw.tools.mvwgenerator.doc.web;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Module;

/**
 * The ModulePage class will format the information for a single module with a navigation
 * area to access all modules associated with a particular project.
 */
public class ModulePage {

	static public void dumpModule(String outdir, Module mod, Summarizer summarizer) throws IOException {
		String ofn = outdir + File.separator + mod.getCamelCaseName() + ".html";
		BufferedWriter out = new BufferedWriter( new FileWriter(ofn) );
		
		StandardParts.writePageHeader(out, "The " + mod.getCamelCaseName() + " Module");
		
		StandardParts.writeContentStart(out);
		
		dumpModule(mod, out);

		StandardParts.writeContentEnd(out);

		out.write(summarizer.getSideBar());

		StandardParts.writePageFooter(out);

		out.close();
	}
	
	static void dumpModule(Module mod, BufferedWriter out) throws IOException{
		out.write("      <div class=\"module-name\">" + mod.getCamelCaseName() + " </div>\n\n");
		out.write("      <div class=\"description\">" + mod.getDescription() + " </div>\n\n");
	}
}
