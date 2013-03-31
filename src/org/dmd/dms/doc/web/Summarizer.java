package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.DMDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.dmo.RuleDataDMO;
import org.dmd.util.exceptions.DebugInfo;

public class Summarizer {

	TreeMap<Integer,SchemaDefinition>				allSchemasByID;
	
	TreeMap<String,SchemaDefinition>				allSchemasByName;

	TreeMap<String,TreeMap<String,DMDefinition>>	definitionsByLetter;
	
	String 				outDir;
	
	// The content of the navigation sidebar
	StringBuffer		sidebar;
	
	StringBuffer		idSummary;
	
//    DmoObjectFactory	dmofactory;
//    DmwObjectFactory	dmwFactory;

    public Summarizer(SchemaManager sm, String od){
		allSchemasByID 		= new TreeMap<Integer, SchemaDefinition>();
		allSchemasByName 	= new TreeMap<String, SchemaDefinition>();
		definitionsByLetter = new TreeMap<String, TreeMap<String,DMDefinition>>();
		outDir 				= od;
		sidebar				= new StringBuffer();
		idSummary			= new StringBuffer();
//        dmofactory			= new DmoObjectFactory(sm);
//        dmwFactory			= new DmwObjectFactory(sm);
		
		Iterator<SchemaDefinition> sdit = sm.getSchemas();
		if (sdit != null){
			while(sdit.hasNext()){
				SchemaDefinition sd = sdit.next();
				allSchemasByID.put(sd.getSchemaBaseID(), sd);
				allSchemasByName.put(sd.getName().getNameString(), sd);
				
			}
		}
		
		buildSidebar();
		
		buildIDSummary();
		
		DmcOmni.instance().setTrackSchemaReferences(true);
		DmcOmni.instance().backRefTracking(true);		

		for(DMDefinition def: sm.allDefs.values()){
			def.getDMO().clearReferenceInfo();
		}
		
		for(DMDefinition def: sm.allDefs.values()){
			addDefinition(def);
			try {
				def.resolveReferences(sm);
				
			} catch (DmcValueExceptionSet e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(SchemaDefinition sd: allSchemasByName.values()){
			Iterator<RuleDataDMO> rules = sd.getParsedRulesDMOs(sm);
			while(rules.hasNext()){
				RuleDataDMO rule = rules.next();
				try {
					rule.resolveReferences(sm);
				} catch (DmcValueExceptionSet e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public String getSideBar(){
		return(sidebar.toString());
	}
	
	void buildSidebar(){
		sidebar.append("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
		sidebar.append("    <div id=\"sidebar\">\n");
		
		for(SchemaDefinition sd: allSchemasByName.values()){
			String name = sd.getName().getNameString();
			sidebar.append("        <a class=\"navLink\" href=\"" + name + ".html\"> " + name + "</a>\n");
		}
		
		sidebar.append("        <a class=\"navLink\" href=\"SchemaSummaryPage.html\"> Summary </a>\n");
		
		
		sidebar.append("    </div>\n");
	}
	
	void buildIDSummary(){
		idSummary.append("<div class=\"idSummary\">\n\n");
		
		idSummary.append("<h2> Schema Identifier Ranges </h2>\n\n");
		
		idSummary.append("  <table>\n\n");
		
		for(SchemaDefinition sd: allSchemasByID.values()){
			int end = sd.getSchemaBaseID() + sd.getSchemaIDRange();
			String name = sd.getName().getNameString();
			idSummary.append("    <tr>\n");
			idSummary.append("      <td>\n");
			idSummary.append("    " + name + "\n");
			idSummary.append("      </td>\n");
			idSummary.append("      <td>\n");
			idSummary.append("      " + sd.getSchemaBaseID() + "\n");
			idSummary.append("      </td>\n");
			idSummary.append("      <td>\n");
			idSummary.append("      " + end + "\n");
			idSummary.append("      </td>\n");
			idSummary.append("    </tr>\n");
		}
		
		idSummary.append("  </table>\n\n");

		idSummary.append("</div> <!-- idSummary -->\n\n");

//		idSummary.append("<table>\n");
		
	}
	
	void addDefinition(DMDefinition def){
		String firstLetter = Character.toUpperCase(def.getName().getNameString().charAt(0)) + "";
		
		TreeMap<String,DMDefinition> startingWith = definitionsByLetter.get(firstLetter);
		
		if (startingWith == null){
			startingWith = new TreeMap<String,DMDefinition>();
			definitionsByLetter.put(firstLetter, startingWith);
		}
		
		startingWith.put(def.getName().getNameString(), def);
	}
	
	public void dumpTextSummary(){
		for(String firstLetter: definitionsByLetter.keySet()){
			TreeMap<String,DMDefinition> startingWith = definitionsByLetter.get(firstLetter);
			
			System.out.println("---------- " + firstLetter + " ----------  (" + startingWith.size()+ ")");
			for(DMDefinition def: startingWith.values()){
				System.out.println("    " + def.getName().getNameString() + " (" + def.getDMO().referenceCount() + ")");
			}
		}
	}
	
	public void dumpSchemaSummaryPage(String outdir) throws IOException{
		String ofn = outdir + File.separator + "SchemaSummaryPage.html";
		BufferedWriter out = new BufferedWriter( new FileWriter(ofn) );
		
		StandardParts.writePageHeader(out, "Schema Summary");
		
		StandardParts.writeContentStart(out);
		
		out.write(idSummary.toString());
		
		StandardParts.writeContentEnd(out);

		out.write(this.getSideBar());
		
		StandardParts.writePageFooter(out);
		
		out.close();
	}
	
}
