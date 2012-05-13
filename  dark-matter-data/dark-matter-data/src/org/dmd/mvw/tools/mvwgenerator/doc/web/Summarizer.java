package org.dmd.mvw.tools.mvwgenerator.doc.web;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Event;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.util.MvwDefinitionManager;

public class Summarizer {
	
	// The aggregated definitions manager
	MvwDefinitionManager	defManager;
	
	String					outdir;

	// The content of the navigation sidebar
	StringBuffer	sidebar;

	public Summarizer(MvwDefinitionManager mdm, String od){
		defManager	= mdm;
		sidebar		= new StringBuffer();
		outdir		= od + File.separator + "mvw";
		buildSidebar();
	}
	
	public String getSideBar(){
		return(sidebar.toString());
	}

	void buildSidebar(){
		sidebar.append("    <div id=\"sidebar\">\n");
		
		for(Module module: defManager.getModules().values()){
			String name = module.getCamelCaseName().getNameString();
			sidebar.append("        <a class=\"navLink\" href=\"" + name + ".html\"> " + name + "</a>\n");
			
		}
		
		sidebar.append("    </div>\n");
	}
	
	/**
	 * This method dumps the summaries of each type of definition, events, controllers, activities, places etc.
	 * @throws IOException
	 */
	public void dumpSummaryFiles() throws IOException {
		dumpEventSummary();
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	void dumpEventSummary() throws IOException {
		String ofn = outdir + File.separator + "EventSummary.html";
		BufferedWriter out = new BufferedWriter( new FileWriter(ofn) );
		
		StandardParts.writePageHeader(out, "Event Summary");
		
		StandardParts.writeContentStart(out);
		
		out.write("    <table>\n\n");
		
		for(Event event: defManager.getEvents().values()){
			EventFormatter.dumpEventSummary(event,out);
		}

		out.write("    </table>\n\n");

		StandardParts.writeContentEnd(out);

		out.write(getSideBar());

		StandardParts.writePageFooter(out);

		out.close();

	}
	
	///////////////////////////////////////////////////////////////////////////
}
