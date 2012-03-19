package org.dmd.mvw.tools.mvwgenerator.doc.web;

import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.util.MvwDefinitionManager;

public class Summarizer {
	
	MvwDefinitionManager	defManager;

	// The content of the navigation sidebar
	StringBuffer	sidebar;

	public Summarizer(MvwDefinitionManager mdm){
		defManager	= mdm;
		sidebar		= new StringBuffer();
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
}
