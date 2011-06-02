package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SliceDefinition;
import org.dmd.dms.TypeDefinition;

public class SchemaPage {
	
	public static void writeStart(BufferedWriter out, String title) throws IOException {
		out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
		out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
		out.write("<head>\n");
		out.write("<meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"/>\n");
		out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"mvcstyle.css\" />\n");
		out.write("<title>" + title + "</title>\n");
		out.write("</head>\n");
		out.write("\n");
		out.write("<body>\n");
		out.write("\n");
		out.write("  <div id=\"header\"> <div class=\"headerBar\"> </div> </div>\n");
		out.write("\n");
		out.write("  <div id=\"main\">\n\n");
	}
	
	public static void writeSchemaSummary(BufferedWriter out, SchemaDefinition sd) throws IOException {
		TreeMap<String,ClassDefinition>		classes 	= new TreeMap<String, ClassDefinition>();
		TreeMap<String,AttributeDefinition>	attributes 	= new TreeMap<String, AttributeDefinition>();
		TreeMap<String,TypeDefinition>		types 		= new TreeMap<String, TypeDefinition>();
		TreeMap<String,SliceDefinition>		slices 		= new TreeMap<String, SliceDefinition>();
		
		for(ClassDefinition def :sd.getClassDefList()){
			classes.put(def.getObjectName().getNameString(), def);
		}
		
		for(AttributeDefinition def :sd.getAttributeDefList()){
			attributes.put(def.getObjectName().getNameString(), def);
		}
		
		for(TypeDefinition def :sd.getTypeDefList()){
			types.put(def.getObjectName().getNameString(), def);
		}
		
		for(SliceDefinition def :sd.getSliceDefList()){
			slices.put(def.getObjectName().getNameString(), def);
		}
		
		out.write("  <div class=\"schemaName\"> " + sd.getName() + " </div>\n\n");
		
		out.write("  <div class=\"summary\">\n\n");
		
		writeClasses(out, classes);
		
		writeAttributes(out, attributes);
		
		writeTypes(out, types);
		
		writeSlices(out, slices);
		
		out.write("  </div> <!--  summary -->\n\n");
		
	}
	
	static void writeClasses(BufferedWriter out, TreeMap<String,ClassDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"classList\">\n");
		out.write("    Classes\n");
		out.write("    <ul>\n");
		
		for(ClassDefinition def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeAttributes(BufferedWriter out, TreeMap<String,AttributeDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"classList\">\n");
		out.write("    Attributes\n");
		out.write("    <ul>\n");
		
		for(AttributeDefinition def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeTypes(BufferedWriter out, TreeMap<String,TypeDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"classList\">\n");
		out.write("    Types\n");
		out.write("    <ul>\n");
		
		for(TypeDefinition def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	static void writeSlices(BufferedWriter out, TreeMap<String,SliceDefinition> defs) throws IOException {
		if (defs.size() == 0)
			return;
		
		out.write("    <div class=\"classList\">\n");
		out.write("    Slices\n");
		out.write("    <ul>\n");
		
		for(SliceDefinition def: defs.values()){
			out.write("      <li> <a class=\"deflink\" href=\"#" + def.getName() + "\"> " + def.getName() + " </a></li>");
		}
		
		out.write("    </ul>\n");
		out.write("    </div>");
	}
	
	public static void writeEnd(BufferedWriter out) throws IOException {
		out.write("  </div> <!-- main -->\n");
		out.write("\n");
		out.write("  <div id=\"footer\"> </div>\n");
		out.write("\n");
		out.write("</body>\n");
		out.write("\n");
		out.write("</html>\n");
	}


}
