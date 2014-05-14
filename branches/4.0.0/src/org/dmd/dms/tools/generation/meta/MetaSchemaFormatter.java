package org.dmd.dms.tools.generation.meta;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.core.util.NamedStringArray;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.Manipulator;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.parsing.DMUncheckedObjectManager;
import org.dmd.util.runtime.DebugInfo;


public class MetaSchemaFormatter {
	
	private final static int META_BASE_ID = 0;
	private final static int META_ID_RANGE = 200;
	
	static ArrayList<String> origOrderClasses;
	static ArrayList<String> origOrderAttrs;
	static ArrayList<String> origOrderTypes;
	static ArrayList<String> origOrderEnums;
	static ArrayList<String> origOrderComplexTypes;
	static ArrayList<String> origOrderCategories;

	static TreeMap<String,DMUncheckedObject>	ucoClassDefs;
	static TreeMap<String,DMUncheckedObject>	ucoAttributeDefs;
	static TreeMap<String,DMUncheckedObject>	ucoTypeDefs;
	static TreeMap<String,DMUncheckedObject>	ucoEnumDefs;
	static TreeMap<String,DMUncheckedObject>	ucoComplexTypeDefs;
	static TreeMap<String,DMUncheckedObject>	ucoCategoryDefs;

	public static void dumpMetaSchemaAG(DMUncheckedObjectManager ucoManager, String od, String LGPL) throws IOException, DMFeedbackSet {
		ucoClassDefs 		= ucoManager.getObjects("ClassDefinition");
		ucoAttributeDefs 	= ucoManager.getObjects("AttributeDefinition");
		ucoTypeDefs 		= ucoManager.getObjects("TypeDefinition");
		ucoEnumDefs 		= ucoManager.getObjects("EnumDefinition");
		ucoComplexTypeDefs 	= ucoManager.getObjects("ComplexTypeDefinition");
		ucoCategoryDefs 	= ucoManager.getObjects("RuleCategory");

		BufferedWriter out = null;
		ImportManager		imports = new ImportManager();
		
		origOrderClasses 		= ucoManager.getOriginalOrder("ClassDefinition");
		origOrderAttrs 			= ucoManager.getOriginalOrder("AttributeDefinition");
		origOrderTypes 			= ucoManager.getOriginalOrder("TypeDefinition");
		origOrderEnums 			= ucoManager.getOriginalOrder("EnumDefinition");
		origOrderComplexTypes 	= ucoManager.getOriginalOrder("ComplexTypeDefinition");
		origOrderCategories 	= ucoManager.getOriginalOrder("RuleCategory");
		
		imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "To handle potential value exceptions.");
		imports.addImport("org.dmd.dms.server.extended.*", "Access to meta schema extended classes");
		imports.addImport("org.dmd.dms.shared.generated.dmo.*", "Access to meta schema DMOs");

		out = FileUpdateManager.instance().getWriter(od, "MetaSchemaAG.java");

		out.write(LGPL);
		out.write("package org.dmd.dms.server.generated;\n\n");

		out.write(imports.getFormattedImports() + "\n\n");
		
		out.write("/**\n");
		out.write("  * This class creates the basic definitions that allow for the definition of schemas.\n");
		out.write("  * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("  */\n");

		out.write("public class MetaSchemaAG extends SchemaDefinition {\n");

		dumpStaticDefinitions(out);
		
		out.write("    public MetaSchemaAG() throws DMFeedbackSet {\n\n");
		out.write("        super(\"meta\");\n\n");
		
		out.write("        // We only ever want to initialize the schema once, so check\n");
		out.write("        // to see if we've initialized the first class definition\n");

		out.write("        if (_metaSchema == null){\n");

		out.write("            _metaSchema = this;\n");
		out.write("            staticRefName = new String(\"MetaSchema._\");\n\n");
		out.write("            this.addDescription(\"The meta schema defines the elements used to define schemas.\");\n");
		out.write("            this.setDotName(\"meta.SchemaDefinition\");\n");
//		out.write("            this.setNameAndTypeName(\"meta.SchemaDefinition\");\n");

		// Set the prefix for the generated output directory and the generated
		// package prefixes
		out.write("            this.setSchemaPackage(\"org.dmd.dms\");\n");
		out.write("            this.setDmwPackage(\"org.dmd.dms\");\n");

		out.write("            this.setSchemaBaseID(" + META_BASE_ID + ");\n");
		out.write("            this.setSchemaIDRange(" + META_ID_RANGE + ");\n");

		
		out.write("            initClasses();\n");
		out.write("            initAttributes();\n");
		out.write("            initTypes();\n");
		out.write("            initEnums();\n");
		out.write("            initRuleCategories();\n");
		out.write("            initComplexTypes();\n");
		
		out.write("        }\n");
		
		out.write("    }\n");
		
		dumpInitClasses(out);
		dumpInitAttributes(out);
		dumpInitTypes(out);
		dumpInitEnums(out);
		dumpInitRuleCategories(out);
		dumpInitComplexTypes(out);
		
		out.write("}\n");
		
		out.close();
	}
	
	/**
	 * This dumps the static definition of the various definitions.
	 * @param out
	 * @throws IOException  
	 */
	static void dumpStaticDefinitions(BufferedWriter out) throws IOException {
		out.write("    public static SchemaDefinition    _metaSchema;\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow()
				+ "\n");
		for (int i = 0; i < origOrderClasses.size(); i++) {
			out.write("    public static ClassDefinition     _" + origOrderClasses.get(i) + ";\n");
		}
		out.write("\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow()
				+ "\n");
		for (int i = 0; i < origOrderEnums.size(); i++)
			out.write("    public static EnumDefinition      _" + origOrderEnums.get(i) + ";\n");
		out.write("\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow()
				+ "\n");
		
		
		for (int i = 0; i < origOrderTypes.size(); i++){
			DMUncheckedObject td = ucoTypeDefs.get(origOrderTypes.get(i));
			String internallyGenerated = td.getSV("internallyGenerated");
			if (internallyGenerated != null)
				continue;
			out.write("    public static TypeDefinition      _" + origOrderTypes.get(i) + ";\n");
		}
		out.write("\n");


		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow()
				+ "\n");
		for (int i = 0; i < origOrderAttrs.size(); i++)
			out.write("    public static AttributeDefinition _" + origOrderAttrs.get(i) + ";\n");
		out.write("\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		for (int i = 0; i < origOrderComplexTypes.size(); i++)
			out.write("    public static ComplexTypeDefinition _" + origOrderComplexTypes.get(i) + ";\n");
		out.write("\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow()
				+ "\n");
		for (int i = 0; i < origOrderCategories.size(); i++)
			out.write("    public static RuleCategory        _" + origOrderCategories.get(i) + ";\n");
		out.write("\n");

//		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
//		for (int i = 0; i < origOrderRules.size(); i++)
//			out.write("    public static RuleDefinition      _" + origOrderRules.get(i) + ";\n");
//		out.write("\n");
	}

	
	static void dumpInitClasses(BufferedWriter out) throws IOException {
		out.write("\n");
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    private void initClasses() throws DMFeedbackSet {\n\n");
		
		for(String cn : origOrderClasses){
			DMUncheckedObject classDef = ucoClassDefs.get(cn);
			String name = classDef.getSV("name");
			String dmoName = "_" + name + "OBJ";
			
			out.write("        ClassDefinitionDMO " + dmoName + " = new ClassDefinitionDMO();\n");
			out.write("        _" + name + " = new ClassDefinition(" + dmoName + ",MetaDMSAG.__" + name + ");\n");
			dumpAttrValues("        ", dmoName, classDef, out);
			out.write("        _" + name + ".setDefinedIn(this);\n");
			out.write("        addClassDefList(_" + name + ");\n");
			out.write("\n");
		}
		
		out.write("    }\n");
		
	}
	
	static void dumpInitAttributes(BufferedWriter out) throws IOException {
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    private void initAttributes() throws DMFeedbackSet {\n\n");
		
		for (DMUncheckedObject attrDef: ucoAttributeDefs.values()) {
			String name = attrDef.getSV("name");
			String dmoName = "_" + name + "OBJ";
			
			out.write("        AttributeDefinitionDMO " + dmoName + " = new AttributeDefinitionDMO();\n");
			out.write("        _" + name + " = new AttributeDefinition(" + dmoName + ");\n");
			dumpAttrValues("        ", dmoName, attrDef, out);
			out.write("        _" + name + ".setDefinedIn(this);\n");
			out.write("        addAttributeDefList(_" + name + ");\n");
			out.write("\n");
		}
		
		out.write("    }\n");
	}
	
	static void dumpInitTypes(BufferedWriter out) throws IOException {
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    private void initTypes() throws DMFeedbackSet {\n\n");
		
		for (DMUncheckedObject typeDef: ucoTypeDefs.values()) {
			String internallyGenerated = typeDef.getSV("internallyGenerated");
			
			if (internallyGenerated != null)
				continue;
			
			String name = typeDef.getSV("name");
			String dmoName = "_" + name + "OBJ";
			
			out.write("        TypeDefinitionDMO " + dmoName + " = new TypeDefinitionDMO();\n");
			out.write("        _" + name + " = new TypeDefinition(" + dmoName + ");\n");
			dumpAttrValues("        ", dmoName, typeDef, out);
			out.write("        _" + name + ".setDefinedIn(this);\n");
			out.write("        addTypeDefList(_" + name + ");\n");
			out.write("\n");
		}
		
		out.write("    }\n");
	}
	
	static void dumpInitEnums(BufferedWriter out) throws IOException {
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    private void initEnums() throws DMFeedbackSet {\n\n");
		
		for (DMUncheckedObject enumDef: ucoEnumDefs.values()) {
			String name = enumDef.getSV("name");
			String dmoName = "_" + name + "OBJ";
			
			out.write("        EnumDefinitionDMO " + dmoName + " = new EnumDefinitionDMO();\n");
			out.write("        _" + name + " = new EnumDefinition(" + dmoName + ");\n");
			dumpAttrValues("        ", dmoName, enumDef, out);
			out.write("        _" + name + ".setDefinedIn(this);\n");
			out.write("        addEnumDefList(_" + name + ");\n");
			out.write("\n");
		}
				
		out.write("    }\n");
	}
	
	static void dumpInitRuleCategories(BufferedWriter out) throws IOException {
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    private void initRuleCategories() throws DMFeedbackSet {\n\n");
		
		for (DMUncheckedObject catDef: ucoCategoryDefs.values()) {
			String name = catDef.getSV("name");
			String dmoName = "_" + name + "OBJ";
			
			out.write("        RuleCategoryDMO " + dmoName + " = new RuleCategoryDMO();\n");
			out.write("        _" + name + " = new RuleCategory(" + dmoName + ");\n");
			dumpAttrValues("        ", dmoName, catDef, out);
			out.write("        _" + name + ".setDefinedIn(this);\n");
			out.write("        addRuleCategoryList(_" + name + ");\n");
			out.write("\n");
		}
		
		out.write("    }\n");
	}
	
	static void dumpInitComplexTypes(BufferedWriter out) throws IOException {
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    private void initComplexTypes() throws DMFeedbackSet {\n\n");
		
		for (DMUncheckedObject ctypeDef: ucoComplexTypeDefs.values()) {
			String name = ctypeDef.getSV("name");
			String dmoName = "_" + name + "OBJ";
			
			out.write("        ComplexTypeDefinitionDMO " + dmoName + " = new ComplexTypeDefinitionDMO();\n");
			out.write("        _" + name + " = new ComplexTypeDefinition(" + dmoName + ");\n");
			dumpAttrValues("        ", dmoName, ctypeDef, out);
			out.write("        _" + name + ".setDefinedIn(this);\n");
			out.write("        addComplexTypeDefList(_" + name + ");\n");
			out.write("\n");
		}
		
		out.write("    }\n");
	}
	
	static void dumpAttrValues(String prefix, String dmoName, DMUncheckedObject obj, BufferedWriter out) throws IOException{
		Iterator<String> names = obj.getAttributeNames();
		if (names == null)
			return;
		
		while(names.hasNext()){
			String 				an 			= names.next();
//if (an.equals("requiredPart"))
//	DebugInfo.debug("HERE");
			String				anCapped	= Manipulator.capFirstChar(an);
			DMUncheckedObject	attrDef 	= ucoAttributeDefs.get(an);
			String				valueType	= attrDef.getSV("valueType");
			boolean				sv			= true;
			
			String				type		= attrDef.getSV("type") + "REF";
			DMUncheckedObject	typeDef 	= ucoTypeDefs.get(type);
			boolean				isReference	= false;
			if (typeDef != null){
				String isRefType = typeDef.getSV("isRefType");
				if (isRefType != null)
					isReference = true;
			}
			
			if ( (valueType != null) && (valueType.equals("MULTI")) )
				sv = false;
			
			if (sv){
				if (an.equals("description")){
					String fixed = obj.getSV(an).replaceAll("\n", "\\\\n");
					out.write(prefix + dmoName + ".set" + anCapped + "(\"" + fixed + "\");\n");
				}
				else{
					if (isReference)
						out.write(prefix + dmoName + ".set" + anCapped + "(\"meta." + obj.getSV(an) + "\");\n");
					else
						out.write(prefix + dmoName + ".set" + anCapped + "(\"" + obj.getSV(an) + "\");\n");
				}
			}
			else{
				NamedStringArray values = obj.get(an);
				for(String value: values){
					if (value.indexOf("\"") != -1){
						// We have embedded quotes, escape them
						value = value.replaceAll("\"", "\\\\\"");
					}
					if (isReference)
						out.write(prefix + dmoName + ".add" + anCapped + "(\"meta." + value + "\");\n");
					else
						out.write(prefix + dmoName + ".add" + anCapped + "(\"" + value + "\");\n");
				}
			}
		}
	}
	


}
