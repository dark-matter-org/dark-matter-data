package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.RuleCategory;
import org.dmd.dms.RuleDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.SliceDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.MetaDMSAG;

public class SchemaPage {
	
	static TreeMap<String,ClassDefinition>		classes;
	static TreeMap<String,AttributeDefinition>	attributes;
	static TreeMap<String,TypeDefinition>		types;
	static TreeMap<String,EnumDefinition>		enums;
	static TreeMap<String,SliceDefinition>		slices;
	static TreeMap<String,RuleCategory>			ruleCategories;
	static TreeMap<String,RuleDefinition>		ruleDefinitions;
	static TreeMap<String,DmcUncheckedObject>	parsedRules;

	public static void dumpSchemaPage(String outdir, SchemaManager sm, SchemaDefinition sd, Summarizer summarizer) throws IOException {
		String ofn = outdir + File.separator + sd.getName() + ".html";
		BufferedWriter out = new BufferedWriter( new FileWriter(ofn) );
		
		initTrees(sd);
		
		StandardParts.writePageHeader(out, "The " + sd.getName() + " Schema");
		
		StandardParts.writeContentStart(out);
		
		writeSchemaSummary(out, sm, sd);
		
		writeClasses(out);
		
		writeAttributes(out);
		
		writeTypes(out);
		
		writeEnums(out);
		
		StandardParts.writeContentEnd(out);
		
		out.write(summarizer.getSideBar());
		
		StandardParts.writePageFooter(out);
		
		out.close();
	}
	
	static void initTrees(SchemaDefinition sd){
		classes 		= new TreeMap<String, ClassDefinition>();
		attributes 		= new TreeMap<String, AttributeDefinition>();
		types 			= new TreeMap<String, TypeDefinition>();
		enums 			= new TreeMap<String, EnumDefinition>();
		slices 			= new TreeMap<String, SliceDefinition>();
		ruleCategories	= new TreeMap<String, RuleCategory>();
		ruleDefinitions = new TreeMap<String, RuleDefinition>();
		parsedRules 	= new TreeMap<String, DmcUncheckedObject>();
		
		for(ClassDefinition def :sd.getClassDefList()){
			classes.put(def.getObjectName().getNameString(), def);
		}
		
		for(AttributeDefinition def :sd.getAttributeDefList()){
			attributes.put(def.getObjectName().getNameString(), def);
		}
		
		for(TypeDefinition def :sd.getTypeDefList()){
			types.put(def.getObjectName().getNameString(), def);
		}
		
		for(EnumDefinition def :sd.getEnumDefList()){
			enums.put(def.getObjectName().getNameString(), def);
		}
		
		if (sd.getSliceDefListSize() > 0){
			for(SliceDefinition def :sd.getSliceDefList()){
				slices.put(def.getObjectName().getNameString(), def);
			}
		}
		
		if (sd.getRuleCategoryListSize() > 0){
			for(RuleCategory def: sd.getRuleCategoryList()){
				ruleCategories.put(def.getObjectName().getNameString(), def);
			}
		}
		
		if (sd.getRuleDefinitionListSize() > 0){
			for(RuleDefinition def: sd.getRuleDefinitionList()){
				ruleDefinitions.put(def.getObjectName().getNameString(), def);
			}
		}
		
		Iterator<DmcUncheckedObject> parsed = sd.getParsedRules();
		if (parsed != null){
			while(parsed.hasNext()){
				DmcUncheckedObject uco = parsed.next();
				String ruleName = uco.getSV(MetaDMSAG.__ruleName.name);
				parsedRules.put(ruleName,uco);
			}
		}
		
	}
	
	/**
	 * Determines if any of the objects in the defined hierarchies are defined in this schema and,
	 * if so, we dump those hierarchies and show where our classes fit in.
	 * @param out The output writer.
	 * @param sm  The overall set of schemas.
	 * @param sd  The schema we're formatting.
	 * @throws IOException
	 */
	static void writeHierarchy(BufferedWriter out, SchemaManager sm, SchemaDefinition sd) throws IOException {
				
		ArrayList<ClassDefinition>	ofInterest = new ArrayList<ClassDefinition>();
		for(ClassDefinition cd: sm.getHierarchicObjects().values()){
			if (wantThis(sd,cd))
				ofInterest.add(cd);
		}
		
		if (ofInterest.size() > 0){

			out.write("<div class=\"hierarchy\">\n\n");

			out.write("<h2> Instance Hierarchy </h2>\n\n");
			
			for(ClassDefinition cd: ofInterest){
				dumpHierarchy(out,cd,0);
			}

			out.write("</div> <!-- hierarchy -->\n\n<p />\n");
		}
		
	}
	
	static void dumpHierarchy(BufferedWriter out, ClassDefinition cd, int depth) throws IOException{
//		out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
		out.write("        <div class=\"hier" + depth + "\"> <a class=\"deflink\" href=\"#" + cd.getName() + "\"> " + cd.getName() + " </a> </div>\n\n");
//		out.write("        <div class=\"hier" + depth + "\"> " + cd.getName() + "</div>\n\n");
		if (cd.getAllowedSubcomps() == null)
			return;
		
		for(ClassDefinition subcomp: cd.getAllowedSubcomps().values()){
			dumpHierarchy(out,subcomp,depth+1);
		}
	}
	
	static boolean wantThis(SchemaDefinition sd, ClassDefinition cd){
		if (cd.getDefinedIn() == sd)
			return(true);
		
		if (cd.getAllowedSubcomps() == null)
			return(false);
		
		for(ClassDefinition subcomp: cd.getAllowedSubcomps().values()){
			if (wantThis(sd,subcomp))
				return(true);
		}
		
		return(false);
	}
	
	static void writeClasses(BufferedWriter out) throws IOException {
		if (classes.size() == 0)
			return;
		
		out.write("<div class=\"classDetails\">\n\n");
		
		out.write("<h2> Class Details </h2>\n\n");
		
//		out.write("  <table>\n\n");
		
		for(ClassDefinition cd: classes.values()){
			ClassFormatter.dumpDetails(out, cd);
		}
		
//		out.write("  </table>\n\n");
		
		out.write("</div> <!-- classDetails -->\n\n");
	}
	
	static void writeAttributes(BufferedWriter out) throws IOException {
		if (attributes.size() == 0)
			return;
		
		out.write("<div class=\"attributeDetails\">\n\n");
		
		out.write("<h2> Attribute Details </h2>\n\n");
		
		out.write("  <table>\n\n");
		
		for(AttributeDefinition ad: attributes.values()){
			AttributeFormatter.dumpDetails(out, ad);
		}
		
		out.write("  </table>\n\n");

		out.write("</div> <!-- attributeDetails -->\n\n");
	}
	
	static void writeTypes(BufferedWriter out) throws IOException{
		if (types.size() == 0)
			return;
		
		out.write("<div class=\"typeDetails\">\n\n");
		
		out.write("<h2> Type Details </h2>\n\n");
		
		out.write("  <table>\n\n");
		
		for(TypeDefinition td: types.values()){
			TypeFormatter.dumpDetails(out, td);
		}
		
		out.write("  </table>\n\n");

		out.write("</div> <!-- typeDetails -->\n\n");
	}
	
	static void writeEnums(BufferedWriter out) throws IOException{
		if (enums.size() == 0)
			return;
		
		out.write("<div class=\"enumDetails\">\n\n");
		
		out.write("<h2> Enum Details </h2>\n\n");
		
		out.write("  <table>\n\n");
		
		for(EnumDefinition ed: enums.values()){
			EnumFormatter.dumpDetails(out, ed);
		}
		
		out.write("  </table>\n\n");

		out.write("</div> <!-- enumDetails -->\n\n");
	}
	
//	static void writeStart(BufferedWriter out, String title) throws IOException {
//		out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
//		out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
//		out.write("<head>\n");
//		out.write("<meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"/>\n");
//		out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"dmsstyle.css\" />\n");
//		out.write("<title>" + title + "</title>\n");
//		out.write("</head>\n");
//		out.write("\n");
//		out.write("<body>\n");
//		out.write("\n");
//		out.write("  <div id=\"header\"> <div class=\"headerBar\"> </div> </div>\n");
//		out.write("\n");
//		out.write("  <div id=\"main\">\n\n");
//	}
	
	static void writeSchemaSummary(BufferedWriter out, SchemaManager sm, SchemaDefinition sd) throws IOException {
		out.write("  <div class=\"schemaName\"> " + sd.getName() + " </div>\n\n");
		
		out.write("  <div class=\"summary\">\n\n");
		
		writeClassSummary(out, classes);
		
		writeHierarchy(out, sm, sd);
		
//		writeAttributeSummary(out, attributes);
		
		writeTypeSummary(out, types);
		
		writeEnumSummary(out, enums);
		
		writeSliceSummary(out, slices);
		
		writeRuleCategorySummary(out, ruleCategories);
		
		writeRuleDefinitionSummary(out, ruleDefinitions);
		
		writeRuleInstancesSummary(out, parsedRules);
		
		out.write("  </div> <!--  summary -->\n\n");
		
	}
	
	static void writeClassSummary(BufferedWriter out, TreeMap<String,ClassDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"classList\">\n");
		out.write("    <h2> Classes (" + defs.size() + ")</h2>\n");
		out.write("    <table>\n");
		
		for(ClassDefinition def: defs.values()){
			out.write("      <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></td>\n");
			if (def.getIsNamedBy() != null){
				if (def.getIsNamedBy().getType().getIsHierarchicName())
					out.write("      <td> " + def.getIsNamedBy().getName() + " (H) </td>\n");
				else
					out.write("      <td> " + def.getIsNamedBy().getName() + " </td>\n");
			}
			out.write("      </tr>\n");
		}
		
		out.write("    </table>\n");
		out.write("    </div>");
	}
	
//	static void writeAttributeSummary(BufferedWriter out, TreeMap<String,AttributeDefinition> defs) throws IOException {
//		if (defs.size() == 0)
//			return;
//		
//		out.write("    <div class=\"attributeList\">\n");
//		out.write("    <h2> Attributes (" + defs.size() + ")</h2>\n");
//		out.write("    <ul>\n");
//		
//		for(AttributeDefinition def: defs.values()){
//			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
//		}
//		
//		out.write("    </ul>\n");
//		out.write("    </div>");
//	}
	
	static void writeTypeSummary(BufferedWriter out, TreeMap<String,TypeDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"typeList\">\n");
		out.write("    <h2>Types (" + defs.size() + ")</h2>\n");
		out.write("    <ul>\n");
		
		for(TypeDefinition def: defs.values()){
			if (def.getInternallyGenerated())
				continue;
			
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeEnumSummary(BufferedWriter out, TreeMap<String,EnumDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"enumList\">\n");
		out.write("    <h2>Enums (" + defs.size() + ")</h2>\n");
		out.write("    <ul>\n");
		
		for(EnumDefinition def: defs.values()){			
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeSliceSummary(BufferedWriter out, TreeMap<String,SliceDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"sliceList\">\n");
		out.write("    <h2> Slices (" + defs.size() + ")</h2>\n");
		out.write("    <ul>\n");
		
		for(SliceDefinition def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeRuleCategorySummary(BufferedWriter out, TreeMap<String,RuleCategory> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"categories\">\n");
		out.write("    <h2> Rule Categories (" + defs.size() + ")</h2>\n");
		out.write("    <ul>\n");
		
		for(RuleCategory def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeRuleDefinitionSummary(BufferedWriter out, TreeMap<String,RuleDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"ruledefs\">\n");
		out.write("    <h2> Rule Definitions (" + defs.size() + ")</h2>\n");
		out.write("    <ul>\n");
		
		for(RuleDefinition def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeRuleInstancesSummary(BufferedWriter out, TreeMap<String,DmcUncheckedObject> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"ruledefs\">\n");
		out.write("    <h2> Rule Instances (" + defs.size() + ")</h2>\n");
		out.write("    <ul>\n");
		
		for(DmcUncheckedObject def: defs.values()){
			String ruleName = def.getSV(MetaDMSAG.__ruleName.name);
			String ruleTitle = def.getSV(MetaDMSAG.__ruleTitle.name);
			out.write("      <li> <a class=\"deflink\" href=\"#" + ruleName + "\"> " + ruleTitle + " </a></li>\n");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
//	static void writeEnd(BufferedWriter out) throws IOException {
//		out.write("  </div> <!-- main -->\n");
//		out.write("\n");
//		out.write("  <div id=\"footer\"> </div>\n");
//		out.write("\n");
//		out.write("</body>\n");
//		out.write("\n");
//		out.write("</html>\n");
//	}


}
