package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SliceDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.util.exceptions.DebugInfo;

public class SchemaPage {
	
	static TreeMap<String,ClassDefinition>		classes;
	static TreeMap<String,AttributeDefinition>	attributes;
	static TreeMap<String,TypeDefinition>		types;
	static TreeMap<String,EnumDefinition>		enums;
	static TreeMap<String,SliceDefinition>		slices;

	public static void dumpSchemaPage(String outdir, SchemaDefinition sd) throws IOException {
		String ofn = outdir + File.separator + sd.getName() + ".html";
		BufferedWriter out = new BufferedWriter( new FileWriter(ofn) );
		
		initTrees(sd);
		
		writeStart(out, "The " + sd.getName() + " Schema");
		
		writeSchemaSummary(out, sd);
		
		writeClasses(out);
		
		writeAttributes(out);
		
		writeEnd(out);
		
		out.close();
	}
	
	static void initTrees(SchemaDefinition sd){
		classes 	= new TreeMap<String, ClassDefinition>();
		attributes 	= new TreeMap<String, AttributeDefinition>();
		types 		= new TreeMap<String, TypeDefinition>();
		enums 		= new TreeMap<String, EnumDefinition>();
		slices 		= new TreeMap<String, SliceDefinition>();
		
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
		
		for(SliceDefinition def :sd.getSliceDefList()){
			slices.put(def.getObjectName().getNameString(), def);
		}
		
	}
	
	static void writeClasses(BufferedWriter out) throws IOException{
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
	
	static void writeAttributes(BufferedWriter out) throws IOException{
		if (attributes.size() == 0)
			return;
		
		out.write("<div class=\"attributeDetails\">\n\n");
		
		out.write("<h2> Attribute Details </h2>\n\n");
		
		out.write("  <table>\n\n");
		
		for(AttributeDefinition cd: attributes.values()){
			AttributeFormatter.dumpDetails(out, cd);
		}
		
		out.write("  </table>\n\n");

		out.write("</div> <!-- attributeDetails -->\n\n");
	}
	
	static void writeStart(BufferedWriter out, String title) throws IOException {
		out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
		out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
		out.write("<head>\n");
		out.write("<meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"/>\n");
		out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"dmsstyle.css\" />\n");
		out.write("<title>" + title + "</title>\n");
		out.write("</head>\n");
		out.write("\n");
		out.write("<body>\n");
		out.write("\n");
		out.write("  <div id=\"header\"> <div class=\"headerBar\"> </div> </div>\n");
		out.write("\n");
		out.write("  <div id=\"main\">\n\n");
	}
	
	static void writeSchemaSummary(BufferedWriter out, SchemaDefinition sd) throws IOException {
		out.write("  <div class=\"schemaName\"> " + sd.getName() + " </div>\n\n");
		
		out.write("  <div class=\"summary\">\n\n");
		
		writeClassSummary(out, classes);
		
		writeAttributeSummary(out, attributes);
		
		writeTypeSummary(out, types);
		
		writeEnumSummary(out, enums);
		
		writeSliceSummary(out, slices);
		
		out.write("  </div> <!--  summary -->\n\n");
		
	}
	
	static void writeClassSummary(BufferedWriter out, TreeMap<String,ClassDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"classList\">\n");
		out.write("    Classes\n");
		out.write("    <ul>\n");
		
		for(ClassDefinition def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeAttributeSummary(BufferedWriter out, TreeMap<String,AttributeDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"classList\">\n");
		out.write("    Attributes\n");
		out.write("    <ul>\n");
		
		for(AttributeDefinition def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeTypeSummary(BufferedWriter out, TreeMap<String,TypeDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"classList\">\n");
		out.write("    Types\n");
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
		
		out.write("    <div class=\"classList\">\n");
		out.write("    Enums\n");
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
		
		out.write("    <div class=\"classList\">\n");
		out.write("    Slices\n");
		out.write("    <ul>\n");
		
		for(SliceDefinition def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>\n");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeEnd(BufferedWriter out) throws IOException {
		out.write("  </div> <!-- main -->\n");
		out.write("\n");
		out.write("  <div id=\"footer\"> </div>\n");
		out.write("\n");
		out.write("</body>\n");
		out.write("\n");
		out.write("</html>\n");
	}


}
