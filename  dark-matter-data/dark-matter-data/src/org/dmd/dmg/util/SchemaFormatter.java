package org.dmd.dmg.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;
import org.dmd.dms.generated.dmo.DmsDefinitionDMO;

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
	
	// The names of attributes that we don't dump as code - these are generated internally
	// by the SchemaManager
	TreeMap<String,String>	skip;
	
	public SchemaFormatter(){
		fileHeader = "";
		progress = null;
		allVars = new ArrayList<VarToObject>();
		
		skip = new TreeMap<String, String>();
		skip.put(DmcObject._ocl, DmcObject._ocl);
		skip.put(ClassDefinitionDMO._derivedClasses, ClassDefinitionDMO._derivedClasses);
		skip.put(ClassDefinitionDMO._dmeClass, ClassDefinitionDMO._dmeClass);
		skip.put(ClassDefinitionDMO._dmeImport, ClassDefinitionDMO._dmeImport);
		skip.put(ClassDefinitionDMO._dmoClass, ClassDefinitionDMO._dmoClass);
		skip.put(ClassDefinitionDMO._dmoImport, ClassDefinitionDMO._dmoImport);
		skip.put(ClassDefinitionDMO._dmtClass, ClassDefinitionDMO._dmtClass);
		skip.put(ClassDefinitionDMO._dmtImport, ClassDefinitionDMO._dmtImport);
		skip.put(ClassDefinitionDMO._dmwClass, ClassDefinitionDMO._dmwClass);
		skip.put(ClassDefinitionDMO._dmwImport, ClassDefinitionDMO._dmwImport);
		skip.put(ClassDefinitionDMO._internalTypeRef, ClassDefinitionDMO._internalTypeRef);
		skip.put(ClassDefinitionDMO._javaClass, ClassDefinitionDMO._javaClass);
	}

	public void setProgressStream(PrintStream ps) {
		progress = ps;
	}
	
	public void setFileHeader(String fh) {
		fileHeader = fh;
	}

	public void dumpSchema(String genDir, String genPackage, SchemaDefinition schema, SchemaManager sm) throws IOException{
		boolean	hasDependency = false;
		
		if (schema.getDependsOn() != null)
			hasDependency = true;
			
		String schemaName = GeneratorUtils.dotNameToCamelCase(schema.getName()) + "SchemaAG";
		String ofn = genDir + File.separator + schemaName + ".java";
		
        if (progress != null)
        	progress.println("    Generating " + ofn);

        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        out.write(fileHeader);
        out.write("package " + genPackage + ".generated;\n\n");
        
        out.write("import java.util.TreeMap;\n\n");
        
        out.write("import org.dmd.dmc.DmcValueException;\n");
        out.write("import org.dmd.dms.*;\n\n");
        out.write("import org.dmd.dms.generated.dmo.*;\n\n");
        
        out.write("public class " + schemaName + " extends SchemaDefinition {\n\n");
        
        if (hasDependency)
        	out.write("    static TreeMap<String,String> dependsOnSchemaClasses;\n");

        out.write(getStaticRefs(schema));
        
        out.write("    static " + schemaName + " instance;\n\n");
        
        out.write("    public " + schemaName + "() throws DmcValueException {\n");
        
        out.write("        if (instance == null){\n");
        out.write("            instance = this;\n");
        
        out.write("            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();\n");
        out.write("            me.setName(\"" + 			schema.getName() + "\");\n");
        out.write("            me.setSchemaPackage(\"" + 	schema.getSchemaPackage() + "\");\n");
        out.write("            me.setDmwPackage(\"" + 		schema.getDmwPackage() + "\");\n");
        out.write("            me.setFile(\"" + 			schema.getFile() + "\");\n\n");
        
        if (hasDependency){
        	Iterator<String> dependsOn = schema.getDependsOn();
        
        	out.write("\n");
            out.write("            dependsOnSchemaClasses = new TreeMap<String,String>();\n");
        	while(dependsOn.hasNext()){
        		String dep = dependsOn.next();
                out.write("            me.addDependsOn(\"" + dep + "\");\n\n");
                SchemaDefinition ds = sm.isSchema(dep);
                String sclass = ds.getDmwPackage() + ".generated." + GeneratorUtils.dotNameToCamelCase(dep) + "SchemaAG";
                out.write("            dependsOnSchemaClasses.put(\"" + dep + "\"," + "\"" + sclass + "\");\n");
        	}
        	out.write("\n");
        }
        
        out.write(getInstantiations());
        
    	out.write("        }\n");
    	
        out.write("    }\n\n");
                
        out.write("\n");
        out.write("    public " + schemaName + " getInstance() throws DmcValueException{\n");
        out.write("    	   if (instance == null)\n");
        out.write("    		   instance = new " + schemaName + "();\n");
        out.write("    	   return(instance);\n");
        out.write("    }\n");

//        out.write("\n");
//        out.write("    public String getDependsOnClass(String schemaName) throws DmcValueException{\n");
//        out.write("    	   if (dependsOnSchemaClasses == null)\n");
//        out.write("    		   return(null);\n");
//        out.write("    	   return(dependsOnSchemaClasses.get(schemaName));\n");
//        out.write("    }\n");

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
				getObjectAsCode(var, "            ", sb);
				
				if (var.type.equals("ClassDefinition")){
					sb.append("            addClassDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("AttributeDefinition")){
					sb.append("            addAttributeDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("EnumDefinition")){
					sb.append("            addEnumDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("TypeDefinition")){
					sb.append("            addTypeDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("ActionDefinition")){
					sb.append("            addActionDefList(" + var.name + ");\n");
				}
				sb.append("\n");
			}
		}
		
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
		sb.append(indent + var.name + " = new " + var.type + "(" + var.name + "OBJ);\n");

		for (DmcAttribute attr : var.def.getDmcObject().getAttributes().values()){
			String an = GeneratorUtils.dotNameToCamelCase(attr.getName());
			
			if (skip.get(attr.getName()) != null)
				continue;
			
			if (attr.getSV() == null){
				// Multi-value attribute
				Iterator vals = attr.getMV();
				while(vals.hasNext()){
					sb.append(indent + obj + ".add" + an + "(\"" + vals.next().toString() + "\");\n");
				}
			}
			else{
				// The definedIn attribute must be "pre-resolved"
				if (attr.getName().equals(DmsDefinitionDMO._definedIn)){
					sb.append(indent + var.name + ".set" + an + "(this);\n");
				}
				else{
					sb.append(indent + obj + ".set" + an + "(\"" + attr.getSV().toString() + "\");\n");
				}
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
