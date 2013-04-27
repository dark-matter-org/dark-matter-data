//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmg.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.ComplexTypeDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.RuleDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.DMDefinitionDMO;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.dmo.SchemaDefinitionDMO;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.CodeFormatter;

/**
 * The SchemaFormatter dumps a SchemaDefinition as a class so that its definitions
 * can be used without having to read the schema from file.
 */
public class SchemaFormatter {
	
	// Functions in Java cannot exceed a set size. For larger schemas, it is possible
	// to exceed the function size when there are a lot of definitions, so we break
	// up the attribute initialization into manageable chunks.
	final static int 			BREAKOUT_SIZE = 100;
	
	String						fileHeader;

	PrintStream					progress;
	
	ArrayList<VarToObject>		allVars;
	
	ArrayList<VarToObject>		classVars;
	
	ArrayList<VarToObject>		attributeVars;
	
	ArrayList<VarToObject>		typeVars;
	
	ArrayList<VarToObject>		complexTypeVars;
	
	ArrayList<VarToObject>		actionVars;
	
	ArrayList<VarToObject>		enumVars;
	
	ArrayList<VarToObject>		ruleVars;
	
	SchemaManager				schemaManager;
	
	// When we call getInstantiations() we also add the import for any AUX
	// classes we need to this tree
	// Key:   aux class name
	// Value: aux class package
	TreeMap<DefinitionName,String>	auxImports;
	
	// The names of attributes that we don't dump as code - these are generated internally
	// by the SchemaManager
	TreeMap<String,String>	skip;
	
	public SchemaFormatter(){
		fileHeader 		= "";
		progress 		= null;
		allVars 		= new ArrayList<VarToObject>();
		classVars 		= new ArrayList<VarToObject>();
		attributeVars 	= new ArrayList<VarToObject>();
		typeVars 		= new ArrayList<VarToObject>();
		complexTypeVars = new ArrayList<VarToObject>();
		actionVars 		= new ArrayList<VarToObject>();
		enumVars 		= new ArrayList<VarToObject>();
		ruleVars 		= new ArrayList<VarToObject>();
		
		skip = new TreeMap<String, String>();
		skip.put(DmcObject.__objectClass.name, DmcObject.__objectClass.name);
		skip.put(MetaDMSAG.__derivedClasses.name, MetaDMSAG.__derivedClasses.name);
		skip.put(MetaDMSAG.__dmeClass.name, MetaDMSAG.__dmeClass.name);
		skip.put(MetaDMSAG.__dmeImport.name, MetaDMSAG.__dmeImport.name);
		skip.put(MetaDMSAG.__dmoClass.name, MetaDMSAG.__dmoClass.name);
		skip.put(MetaDMSAG.__dmoImport.name, MetaDMSAG.__dmoImport.name);
		skip.put(MetaDMSAG.__dmtClass.name, MetaDMSAG.__dmtClass.name);
		skip.put(MetaDMSAG.__dmtImport.name, MetaDMSAG.__dmtImport.name);
		skip.put(MetaDMSAG.__dmwClass.name, MetaDMSAG.__dmwClass.name);
		skip.put(MetaDMSAG.__dmwImport.name, MetaDMSAG.__dmwImport.name);
		skip.put(MetaDMSAG.__internalTypeRef.name, MetaDMSAG.__internalTypeRef.name);
		skip.put(MetaDMSAG.__javaClass.name, MetaDMSAG.__javaClass.name);
		skip.put(MetaDMSAG.__nameAttributeDef.name, MetaDMSAG.__nameAttributeDef.name);
	}

	public void setProgressStream(PrintStream ps) {
		progress = ps;
	}
	
	public void setFileHeader(String fh) {
		fileHeader = fh;
	}

	public void dumpSchema(String genDir, String genPackage, SchemaDefinition schema, SchemaManager sm) throws IOException{
		boolean	hasDependency = false;
		
		auxImports = new TreeMap<DefinitionName, String>();
		
		if (schema.getDependsOn() != null)
			hasDependency = true;
		
		schemaManager = sm;
			
		String schemaName 	= GeneratorUtils.dotNameToCamelCase(schema.getName().getNameString()) + "SchemaAG";
		String asagName		= GeneratorUtils.dotNameToCamelCase(schema.getName().getNameString()) + "DMSAG";
//		String ofn = genDir + File.separator + schemaName + ".java";
		
//        if (progress != null)
//        	progress.println("    Generating " + ofn);

        
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(genDir, schemaName + ".java");
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + genPackage + ".generated;\n\n");
        
        // get the static refs and populate the allVars array
        String staticRefs = getStaticRefs(schema);
        
        // We call this here so that we can determine the additional AUX class imports we need
        getInstantiations();
        
        out.write("import org.dmd.dmc.DmcOmni;\n");
        out.write("import org.dmd.dmc.DmcValueException;\n");
        out.write("import org.dmd.dms.*;\n");
        out.write("import org.dmd.dms.generated.dmo.*;\n");
        out.write("import " + schema.getSchemaPackage() + ".generated.dmo." + asagName + ";\n\n");
        
        for(DefinitionName key : auxImports.keySet()){
        	out.write("import " + auxImports.get(key) + ";\n");
        }
        
        out.write("\n");
        
        out.write("/**\n");
        CodeFormatter.dumpCodeComment(schema.getDescription(),out," * ");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + schema.getName() + " schema at version " + schema.getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");

        out.write("public class " + schemaName + " extends SchemaDefinition {\n\n");
        

        out.write(staticRefs);
        
        out.write("    static " + schemaName + " instance;\n\n");
        
        out.write("    public " + schemaName + "() throws DmcValueException {\n");
        out.write("        generatedSchema = true;\n");
        out.write("        staticRefName   = \"" + genPackage + ".generated." + schemaName + "\";\n\n");
        if (hasDependency){
        	Iterator<String> dependsOn = schema.getDependsOn();
        	while(dependsOn.hasNext()){
        		String dep = dependsOn.next();
                SchemaDefinition ds = sm.isSchema(dep);
                String sclass = ds.getDmwPackage() + ".generated." + GeneratorUtils.dotNameToCamelCase(dep) + "SchemaAG";
                out.write("        dependsOnSchemaClasses.put(\"" + dep + "\"," + "\"" + sclass + "\");\n");
        	}
        	out.write("\n");
        }

        out.write("    }\n\n");
        
        out.write("    private void initialize() throws DmcValueException {\n");
        out.write("        if (instance == null){\n");
        out.write("            instance        = this;\n");
        
        out.write("            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();\n");
        out.write("            me.setName(\"" + 			schema.getName() + "\");\n");
        out.write("            me.setDotName(\"" + 			schema.getName() + "\");\n");
        out.write("            me.setSchemaPackage(\"" + 	schema.getSchemaPackage() + "\");\n");
        out.write("            me.setDmwPackage(\"" + 		schema.getDmwPackage() + "\");\n");
        out.write("            me.setFile(\"" + 			schema.getFile() + "\");\n\n");
        
        if (hasDependency){
        	Iterator<String> dependsOn = schema.getDependsOn();
        
        	out.write("\n");
        	while(dependsOn.hasNext()){
        		String dep = dependsOn.next();
                out.write("            me.addDependsOn(\"" + dep + "\");\n");
                SchemaDefinition ds = sm.isSchema(dep);
                String sclass = ds.getDmwPackage() + ".generated." + GeneratorUtils.dotNameToCamelCase(dep) + "SchemaAG";
                out.write("            dependsOnSchemaClasses.put(\"" + dep + "\"," + "\"" + sclass + "\");\n\n");
        	}
        	out.write("\n");
        }
        
//        out.write(instantiations);
        out.write("            initClasses();\n");
        
        out.write(getSplitFunctionNames("initAttributes",attributeVars));
        
//        out.write("            initAttributes();\n");
        out.write("            initTypes();\n");
        out.write("            initComplexTypes();\n");
        out.write("            initActions();\n");
        out.write("            initEnums();\n");
        out.write("            initRules();\n");
       
        out.write("            DmcOmni.instance().addCompactSchema(" + asagName + ".instance());\n");
        
    	out.write("        }\n");
    	
        out.write("    }\n\n");
        
        dumpInitFunction(out,"initClasses", classVars);
        
        dumpSplitInitFunctions(out, "initAttributes", attributeVars);
        
//        dumpInitFunction(out,"initAttributes", attributeVars);
        
        dumpInitFunction(out,"initTypes", typeVars);
        
        dumpInitFunction(out,"initComplexTypes", complexTypeVars);
        
        dumpInitFunction(out,"initActions", actionVars);
        
        dumpInitFunction(out,"initEnums", enumVars);
        
        dumpInitFunction(out,"initRules", ruleVars);
        
                
        out.write("\n");
        out.write("    @Override\n");
        out.write("    public synchronized " + schemaName + " getInstance() throws DmcValueException{\n");
        out.write("    	   if (instance == null)\n");
        out.write("    		   initialize();\n");
        out.write("    	   return(instance);\n");
        out.write("    }\n");

        out.write("}\n\n");
        
        out.close();
	}
	
	/**
	 * Generates the name of a set of functions that will initialize a set of definitions.
	 * @param funcName the base name of the function.
	 * @param vars the definitions
	 * @return a string with funcName1, funcName2, funcName3 etc.
	 */
	String getSplitFunctionNames(String funcName, ArrayList<VarToObject> vars){
		StringBuffer	sb = new StringBuffer();
		
        int breakout = vars.size() / BREAKOUT_SIZE;
        int remainder = vars.size() % BREAKOUT_SIZE;
        
        if (remainder > 0)
        	breakout++;
        
//        DebugInfo.debug("*** total: " + vars.size() + "  breakout: " + breakout + "  remainder: " + remainder);
        
        for(int i=0,x=1; i<breakout; i++,x++){
        	sb.append("            " + funcName + x + "();\n");
        }
        
//        DebugInfo.debug("Function names\n\n" + sb.toString());
        
		return(sb.toString());
	}
		
	void dumpInitFunction(BufferedWriter out, String funcName, ArrayList<VarToObject> vars) throws IOException {
        out.write("    private void " + funcName + "() throws DmcValueException {\n");
        out.write(getInstantiations(vars));
        out.write("    }\n\n");
	}
	
	void dumpSplitInitFunctions(BufferedWriter out, String funcName, ArrayList<VarToObject> vars) throws IOException {
        int breakout = vars.size() / BREAKOUT_SIZE;
        int remainder = vars.size() % BREAKOUT_SIZE;
        
        if (remainder > 0)
        	breakout++;
        
        for (int i=0,func=1; i<breakout; i++,func++){
        	out.write("    private void " + funcName + func + "() throws DmcValueException {\n");
        	int start = i * BREAKOUT_SIZE;
        	int end = start + BREAKOUT_SIZE;
        	if (end > vars.size())
        		end = vars.size();
        	
        	for(int j=start; j<end; j++){
        		out.write(getInstantiation(vars.get(j)));
        	}
        	out.write("    }\n\n");
        }

//        out.write("    private void " + funcName + "() throws DmcValueException {\n");
//        out.write(getInstantiations(vars));
//        out.write("    }\n\n");
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
				else if (var.type.equals("ComplexTypeDefinition")){
					sb.append("            addComplexTypeDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("ActionDefinition")){
					sb.append("            addActionDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("RuleDefinition")){
					sb.append("            addRuleDefinitionList(" + var.name + ");\n");
				}
				sb.append("\n");
			}
		}
		
		return(sb.toString());
	}
	
	/**
	 * This method takes each VarToObject on the specified array and generates the code to
	 * instantiate the definition, set its attributes and add it to the class, attribute,
	 * enum, type of action list of the schema.
	 * @param vars
	 * @return
	 */
	String getInstantiations(ArrayList<VarToObject> vars){
		StringBuffer sb = new StringBuffer();
		
		for(VarToObject var : vars){
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
				else if (var.type.equals("ComplexTypeDefinition")){
					sb.append("            addComplexTypeDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("ActionDefinition")){
					sb.append("            addActionDefList(" + var.name + ");\n");
				}
				else if (var.type.equals("RuleDefinition")){
					sb.append("            addRuleDefinitionList(" + var.name + ");\n");
				}
				sb.append("\n");
			}
		}
		
		return(sb.toString());
	}
	
	/**
	 * This method generates the code to instantiate the specified definition, set its attributes
	 * and add it to the class, attribute, enum, type of action list of the schema.
	 * @param var
	 * @return
	 */
	String getInstantiation(VarToObject var){
		StringBuffer sb = new StringBuffer();
		
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
			else if (var.type.equals("ComplexTypeDefinition")){
				sb.append("            addComplexTypeDefList(" + var.name + ");\n");
			}
			else if (var.type.equals("ActionDefinition")){
				sb.append("            addActionDefList(" + var.name + ");\n");
			}
			else if (var.type.equals("RuleDefinition")){
				sb.append("            addRuleDefinitionList(" + var.name + ");\n");
			}
			sb.append("\n");
		}
		
		return(sb.toString());
	}
	
	String getStaticRefs(SchemaDefinition schema){
		StringBuffer sb = new StringBuffer();
		String asagName		= GeneratorUtils.dotNameToCamelCase(schema.getName().getNameString()) + "DMSAG";
		
		Iterator<ClassDefinition> classes = schema.getClassDefList();
		if (classes != null){
			while(classes.hasNext()){
				ClassDefinition cd = classes.next();
				sb.append("    public static ClassDefinition _" + cd.getName() + ";\n");
				allVars.add(new VarToObject("_" + cd.getName(), cd, "ClassDefinition", asagName));
				classVars.add(new VarToObject("_" + cd.getName(), cd, "ClassDefinition", asagName));
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
				attributeVars.add(new VarToObject("_" + ad.getName(), ad, "AttributeDefinition"));
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
				typeVars.add(new VarToObject("_" + td.getName(), td, "TypeDefinition"));
			}
			sb.append("\n");
			allVars.add(new VarToObject("", null,null));
		}
		
		Iterator<ComplexTypeDefinition> complextypes = schema.getComplexTypeDefList();
		if (complextypes != null){
			while(complextypes.hasNext()){
				ComplexTypeDefinition td = complextypes.next();
				sb.append("    public static ComplexTypeDefinition _" + td.getName() + ";\n");
				allVars.add(new VarToObject("_" + td.getName(), td, "ComplexTypeDefinition"));
				complexTypeVars.add(new VarToObject("_" + td.getName(), td, "ComplexTypeDefinition"));
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
				actionVars.add(new VarToObject("_" + ad.getName(), ad, "ActionDefinition"));
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
				enumVars.add(new VarToObject("_" + ed.getName(), ed, "EnumDefinition"));
			}
			sb.append("\n");
			allVars.add(new VarToObject("", null, null));
		}
		
		Iterator<RuleDefinition> rules = schema.getRuleDefinitionList();
		if (rules != null){
			while(rules.hasNext()){
				RuleDefinition rd = rules.next();
				sb.append("    public static RuleDefinition _" + rd.getName() + ";\n");
				allVars.add(new VarToObject("_" + rd.getName(), rd, "RuleDefinition"));
				ruleVars.add(new VarToObject("_" + rd.getName(), rd, "RuleDefinition"));
			}
			sb.append("\n");
			allVars.add(new VarToObject("", null, null));
		}
		
		
		return(sb.toString());
	}
		
//	@SuppressWarnings("unchecked")
	void getObjectAsCode(VarToObject var, String indent, StringBuffer sb){
		String obj = var.name + "OBJ";
		sb.append("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append(indent + var.type + "DMO " + var.name + "OBJ = new " + var.type + "DMO();\n");
		
		if (var.dmsagClassRef == null)
			sb.append(indent + var.name + " = new " + var.type + "(" + var.name + "OBJ);\n");
		else
			sb.append(indent + var.name + " = new " + var.type + "(" + var.name + "OBJ," + var.dmsagClassRef +");\n");

		for (DmcAttribute<?> attr : var.def.getDmcObject().getAttributes().values()){
			String an = GeneratorUtils.dotNameToCamelCase(attr.getName());
			String prefix = "";
			
			if (skip.get(attr.getName()) != null)
				continue;
			
			AttributeDefinition ad = schemaManager.isAttribute(attr.getName());
			ClassDefinition aux = isAuxAttribute(var.def, ad);
			
			TypeDefinition td = ad.getType();
			
			if (aux == null){
				if (attr.getMVSize() > 0){
					// Multi-value attribute
					Iterator<?> vals = attr.getMV();
					while(vals.hasNext()){
						prefix = "";
						Object val = vals.next();
						if (td.getIsRefType()){
							DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>) val;
							if (ref.getObject() instanceof DMDefinitionDMO){
								if ( !(ref.getObject() instanceof SchemaDefinitionDMO)){
									DMDefinitionDMO def = (DMDefinitionDMO) ref.getObject();
									if (!val.toString().contains("."))
										prefix =  def.getDefinedIn().getObjectName().getNameString() + ".";
								}
							}
						}
						sb.append(indent + obj + ".add" + an + "(\"" + prefix + val.toString() + "\");\n");
					}
				}
				else{
					prefix = "";
					if (td.getIsRefType()){
						DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>) attr.getSV();
						if (ref.getObject() instanceof DMDefinitionDMO){
							if ( !(ref.getObject() instanceof SchemaDefinitionDMO)){
								DMDefinitionDMO def = (DMDefinitionDMO) ref.getObject();
								if (!attr.getSV().toString().contains("."))
									prefix = def.getDefinedIn().getObjectName().getNameString() + ".";
							}
						}
					}
					// HACK HACK HACK
					// In order to handle the concept of the empty string as a nullReturn value, we have to check
					// to see if the nullReturnValue attribute is "" because if we don't, we wind up with
					//             _ATTRDEF.setNullReturnValue("""");
					boolean doubleQuotes = false;
					if (attr.getName().equals("nullReturnValue")){
						if (attr.getSV().toString().startsWith("\"")){
							doubleQuotes = true;
						}
					}

					// The definedIn attribute must be "pre-resolved"
					if (attr.getName().equals(MetaDMSAG.__definedIn.name)){
						sb.append(indent + var.name + ".set" + an + "(this);\n");
					}
					else{
						if (doubleQuotes)
							sb.append(indent + obj + ".set" + an + "(" + attr.getSV().toString() + ");\n");
						else
							sb.append(indent + obj + ".set" + an + "(\"" + prefix + attr.getSV().toString() + "\");\n");
					}
				}
			}
			else{
//				String schemaName = ad.getDefinedIn().getStaticRefName();
				
				if (attr.getSV() == null){
					// Multi-value attribute
					Iterator<?> vals = attr.getMV();
					while(vals.hasNext()){
						sb.append(indent + aux.getDmwAuxClass() + ".add" + an + "(" + var.name + ", \"" + vals.next().toString() + "\");\n");
//						sb.append(indent + aux.getDmoAuxClass() + ".add" + an + "(" + obj + ", \"" + vals.next().toString() + "\");\n");
					}
				}
				else{
					// HACK HACK HACK
					// In order to handle the concept of teh empty string as a nullReturn value, we have to check
					// to see if the nullReturnValue attribute is "" because if we don't, we wind up with
					//             _ATTRDEF.setNullReturnValue("""");
					boolean doubleQuotes = false;
					if (attr.getName().equals("nullReturnValue")){
						if (attr.getSV().toString().startsWith("\"")){
							doubleQuotes = true;
						}
					}
						
					if (doubleQuotes)
						sb.append(indent + aux.getDmwAuxClass() + ".set" + an + "(" + var.name + ", " + attr.getSV().toString() + ");\n");
					else
						sb.append(indent + aux.getDmwAuxClass() + ".set" + an + "(" + var.name + ", \"" + attr.getSV().toString() + "\");\n");
//					sb.append(indent + aux.getDmoAuxClass() + ".set" + an + "(" + obj + ", \"" + attr.getSV().toString() + "\");\n");
				}
			}
		}
	}
	
	/**
	 * This method determines if the attribute specified is part of the definition class
	 * or if it's an auxiliary attribute.
	 * @param def The definition.
	 * @param ad  The attribute.
	 * @return null if the attribute is standard member of the definition or the AUX class it's part of.
	 */
	ClassDefinition isAuxAttribute(DmsDefinition def, AttributeDefinition ad){
		ClassDefinition rc = null;
		
//		if (ad.getName().equals("namingAttribute")){
//			System.out.println("Here");
//		}
//DebugInfo.debug(def.getName() + "  " + ad.getName());

		Iterator<ClassDefinition> oc = def.getObjectClass();
		
		if (oc == null){
			DebugInfo.debug("No class info for " + def.getName());
			DebugInfo.debug(def.toOIF(15));
		}
		
		while(oc.hasNext()){
			ClassDefinition cd = oc.next();
			
			if (cd.hasAttribute(ad.getName()) != null){
				rc = cd;
				break;
			}
		}
		
		if ( (rc != null) && (rc.getClassType() == ClassTypeEnum.AUXILIARY)){
			auxImports.put(rc.getName(), rc.getDmwAuxClassImport());
//			auxImports.put(rc.getName(), rc.getDmoAuxClassImport());
		}
		else{
			rc = null;
		}
			
		return(rc);
	}
	
	class VarToObject {
		String 			name;
		DmsDefinition	def;
		String			type;
		String			dmsagClassRef;
		
		VarToObject(String vn, DmsDefinition d, String vt){
			name = vn;
			def = d;
			type = vt;
			dmsagClassRef = null;
		}
		
		/**
		 * Constructs a new Var for a ClassDefinition, this allows us to set the 
		 * class
		 * @param vn
		 * @param d
		 * @param vt
		 * @param dmsagClassRef
		 */
		VarToObject(String vn, DmsDefinition d, String vt, String schema){
			name = vn;
			def = d;
			type = vt;
			dmsagClassRef = schema + "._" + vn;
		}
	}
}
