package org.dmd.dmg.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.TypeDefinition;

/**
 * The SchemaFormatter dumps a SchemaDefinition as a class so that its definitions
 * can be used without having to read the schema from file.
 * @author Peter
 *
 */
public class SchemaFormatter {
	
	String			fileHeader;

	PrintStream		progress;
	
	ArrayList<VarToObject>		allVars;
	
	public SchemaFormatter(){
		fileHeader = "";
		progress = null;
		allVars = new ArrayList<VarToObject>();
	}

	public void setProgressStream(PrintStream ps) {
		progress = ps;
	}
	
	public void setFileHeader(String fh) {
		fileHeader = fh;
	}

	public void dumpSchema(String genDir, String genPackage, SchemaDefinition schema) throws IOException{
		String schemaName = GeneratorUtils.dotNameToCamelCase(schema.getName()) + "SchemaAG";
		String ofn = genDir + File.separator + schemaName + ".java";
		
        if (progress != null)
        	progress.println("    Generating " + ofn);

        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        out.write(fileHeader);
        out.write("package " + genPackage + ".generated;\n\n");
        
        out.write("import org.dmd.dmc.DmcValueException;\n");
        out.write("import org.dmd.dms.*;\n\n");
        out.write("import org.dmd.dms.generated.dmo.*;\n\n");
        
        out.write("public class " + schemaName + " extends SchemaDefinition {\n\n");
        
        out.write(getStaticRefs(schema));
        
        out.write("    public " + schemaName + "() throws DmcValueException {\n");
        
        out.write(getInstantiations());
        
        out.write("    }\n\n");
                
        out.write("}\n\n");
        
        out.close();
	}
		
	String getInstantiations(){
		StringBuffer sb = new StringBuffer();
		
		for(VarToObject var : allVars){
			if (var.name.length() == 0){
				sb.append("\n");
			}
			else{
				getObjectAsCode(var, "        ", sb);
				sb.append("        " + var.name + " = new " + var.type + "(" + var.name + "OBJ);\n");
				
				if (var.type.equals("ClassDefinition")){
					sb.append("        addClassDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("AttributeDefinition")){
					sb.append("        addAttributeDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("EnumDefinition")){
					sb.append("        addEnumDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("TypeDefinition")){
					sb.append("        addTypeDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("ActionDefinition")){
					sb.append("        addActionDefList(" + var.name + ");\n");
				}
				sb.append("\n");
			}
		}
		
		sb.append("\n");
		
		return(sb.toString());
	}
	
	String getStaticRefs(SchemaDefinition schema){
		StringBuffer sb = new StringBuffer();
		
		Iterator<ClassDefinition> classes = schema.getClassDefList();
		if (classes != null){
			while(classes.hasNext()){
				ClassDefinition cd = classes.next();
				sb.append("    public static ClassDefinition _" + cd.getName() + ";\n");
				allVars.add(new VarToObject("_" + cd.getName(), cd, "ClassDefinition"));
			}
			sb.append("\n");
			allVars.add(new VarToObject("", null,null));
		}
		
		Iterator<AttributeDefinition> attributes = schema.getAttributeDefList();
		if (attributes != null){
			while(attributes.hasNext()){
				AttributeDefinition ad = attributes.next();
				sb.append("    public static AttributeDefinition _" + ad.getName() + ";\n");
				allVars.add(new VarToObject("_" + ad.getName(), ad, "AttributeDefinition"));
			}
			sb.append("\n");
			allVars.add(new VarToObject("", null,null));
		}
		
		Iterator<TypeDefinition> types = schema.getTypeDefList();
		if (types != null){
			while(types.hasNext()){
				TypeDefinition td = types.next();
				sb.append("    public static TypeDefinition _" + td.getName() + ";\n");
				allVars.add(new VarToObject("_" + td.getName(), td, "TypeDefinition"));
			}
			sb.append("\n");
			allVars.add(new VarToObject("", null,null));
		}
		
		Iterator<ActionDefinition> actions = schema.getActionDefList();
		if (actions != null){
			while(actions.hasNext()){
				ActionDefinition ad = actions.next();
				sb.append("    public static ActionDefinition _" + ad.getName() + ";\n");
				allVars.add(new VarToObject("_" + ad.getName(), ad, "ActionDefinition"));
			}
			sb.append("\n");
			allVars.add(new VarToObject("", null,null));
		}
		
		Iterator<EnumDefinition> enums = schema.getEnumDefList();
		if (enums != null){
			while(enums.hasNext()){
				EnumDefinition ed = enums.next();
				sb.append("    public static EnumDefinition _" + ed.getName() + ";\n");
				allVars.add(new VarToObject("_" + ed.getName(), ed, "EnumDefinition"));
			}
			sb.append("\n");
			allVars.add(new VarToObject("", null, null));
		}
		
		
		return(sb.toString());
	}
	
	@SuppressWarnings("unchecked")
	void getObjectAsCode(VarToObject var, String indent, StringBuffer sb){
		String obj = var.name + "OBJ";
		sb.append(indent + var.type + "DMO " + var.name + "OBJ = new " + var.type + "DMO();\n");

		for (DmcAttribute attr : var.def.getDmcObject().getAttributes().values()){
			String an = GeneratorUtils.dotNameToCamelCase(attr.getName());
			
			if (attr.getName() == DmcObject._ocl)
				continue;
			
			if (attr.getSV() == null){
				// Multi-value attribute
				Iterator vals = attr.getMV();
				while(vals.hasNext()){
					sb.append(indent + obj + ".add" + an + "(\"" + vals.next().toString() + "\");\n");
				}
			}
			else{
				sb.append(indent + obj + ".set" + an + "(\"" + attr.getSV().toString() + "\");\n");
			}
		}
	}
	
	class VarToObject {
		String name;
		DmsDefinition	def;
		String	type;
		
		VarToObject(String vn, DmsDefinition d, String vt){
			name = vn;
			def = d;
			type = vt;
		}
	}
}
