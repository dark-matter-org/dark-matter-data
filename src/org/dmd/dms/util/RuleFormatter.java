package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.TreeMap;

import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmc.util.NamedStringArray;
import org.dmd.dms.RuleCategory;
import org.dmd.dms.RuleDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.enums.OperationalContextEnum;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The RuleFormatter will create the rule base implementation in generated/rules
 * and the [schema]RuleFactory that can instantiate a behavioral rule instance
 * based on the rule DMO that's passed in.
 * <p/>
 * The RuleFormatter runs in two modes, one for the meta schema and the other for
 * standard schemas.
 */
public class RuleFormatter {

	PrintStream	progress;
	
	public RuleFormatter(PrintStream ps){
		progress = ps;
	}
	
	/**
	 * 
	 * @param schemaName
	 * @param schemaPackage
	 * @param ruleDefs
	 * @param rulesDir
	 * @throws ResultException 
	 * @throws IOException 
	 */
	public void dumpBaseImplementations(String schemaName, String schemaPackage, TreeMap<String,DmcUncheckedObject> ruleDefs, TreeMap<String,DmcUncheckedObject> ruleCategoryDefs, String rulesDir) throws ResultException, IOException{
		
		ImportManager factoryImports = new ImportManager();
		
		for(DmcUncheckedObject rule: ruleDefs.values()){
    		String name = GenUtility.capTheName(rule.getSV("name"));
    		NamedStringArray categories = rule.get("ruleCategory");
    		
    		String scope = rule.getSV("ruleScope");
    		String type = rule.getSV("ruleType");
    		
    		ImportManager baseImports = new ImportManager();
    		StringBuffer interfaces = new StringBuffer();
    				
    		baseImports.addImport("org.dmd.dms.generated.enums.RuleScopeEnum", "Rule scope");
    		baseImports.addImport("org.dmd.dms.generated.enums.RuleTypeEnum", "Rule type");
    		baseImports.addImport("org.dmd.dmc.rules.RuleIF", "All rules implement this");
    		baseImports.addImport("java.util.ArrayList", "To store category IDs");
    		baseImports.addImport("java.util.Iterator", "To access category IDs");
    		interfaces.append("RuleIF");

    		
    		baseImports.addImport(schemaPackage + ".generated.dmo." + name + "DataDMO", "Rule parameters object");
    		
    		StringBuffer categoryInit = new StringBuffer();
    		
    		for(String cname: categories){
    			DmcUncheckedObject category = ruleCategoryDefs.get(cname);
    			
    			if (category == null){
    				ResultException ex = new ResultException("Unknown rule category: " + cname);
    				throw(ex);
    			}
    			
    			String categoryID = category.getSV("ruleCategoryID");
    			categoryInit.append("            categories.add(" + categoryID + ");\n");
    				
    			String ruleInterface = category.getSV("ruleInterface");
    			baseImports.addImport(ruleInterface, "Required by RuleCategory " + cname);
    			
    			if (interfaces.length() > 0)
    				interfaces.append(", ");
    			
    			int lastDot = ruleInterface.lastIndexOf(".");
    			interfaces.append(ruleInterface.substring(lastDot + 1));
    		}
    		
    		factoryImports.addImport(schemaPackage + ".extended.rules." + name, "The implementation of the " + name);
    		
			BufferedWriter 	out = FileUpdateManager.instance().getWriter(rulesDir, name + "BaseImpl.java");
			
			out.write("package " + schemaPackage + ".generated.rules;\n\n");
			
			out.write(baseImports.getFormattedImports() + "\n\n");
			
			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("abstract public class " + name + "BaseImpl implements " + interfaces + " {\n\n");
			
			out.write("    static RuleScopeEnum      scope = RuleScopeEnum." + scope + ";\n");
			out.write("    static RuleTypeEnum       type  = RuleTypeEnum." + type + ";\n\n");
			
			out.write("    static ArrayList<Integer> categories;\n\n");
			
			out.write("    protected " + name + "DataDMO ruleDMO;\n\n");
			
			out.write("    protected " + name + "BaseImpl(" + name + "DataDMO dmo){\n");
			out.write("        ruleDMO = dmo;\n");
			out.write("        if (categories == null){\n");
			out.write("            categories = new ArrayList<Integer>();\n");
			out.write(categoryInit.toString());
			out.write("        }\n");
			out.write("    }\n\n");
			
			out.write("    @Override\n");
			out.write("    public String getRuleTitle() {\n");
			out.write("        return(ruleDMO.getRuleTitle());\n");
			out.write("    }\n\n");

			out.write("    @Override\n");
			out.write("    public RuleScopeEnum getRuleScope() {\n");
			out.write("        return(scope);\n");
			out.write("    }\n\n");

			out.write("    @Override\n");
			out.write("    public RuleTypeEnum getRuleType() {\n");
			out.write("        return(type);\n");
			out.write("    }\n\n");

			out.write("    @Override\n");
			out.write("    public Iterator<Integer> getCategories() {\n");
			out.write("        return(categories.iterator());\n");
			out.write("    }\n\n");

			
			out.write("}\n\n");
			
			out.close();
		}
		
		
		
		
		
		
		
		
		
		String factoryName = GenUtility.capTheName(schemaName) + "RulesFactoryAG";
		
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(rulesDir, factoryName + ".java");
		
		out.write("package " + schemaPackage + ".generated.rules;\n\n");
		
		out.write("import " + schemaPackage + ".generated.dmo.*;\n\n");
		out.write(factoryImports.getFormattedImports() + "\n\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + factoryName + " {\n\n");
		
		out.write("    public " + factoryName + "(){\n\n");
		
		for(DmcUncheckedObject rule: ruleDefs.values()){
    		String name = GenUtility.capTheName(rule.getSV("name"));

    		out.write("        " + name + " " + name + "Instance = new " + name + "(new " + name + "DataDMO());\n\n");
		}
		
		out.write("    }\n\n");
		
		out.write("}\n\n");
		
		out.close();
		
		
	}
	
	/**
	 * We dump the base implementation of the rule. The subdirectory where the code gets dumped will
	 * vary based on the operational context for which we're dumping the rule.
	 * @param sm the schema manager 
	 * @param sd the schema definition
	 * @param gendir the base directory to which we're dumping the code
	 * @param context for which context we're dumping the rules
	 * @throws IOException
	 */
	public void dumpBaseImplementations(SchemaManager sm, SchemaDefinition sd, String gendir, OperationalContextEnum context) throws IOException {
		String genpackage = sd.getSchemaPackage() + ".generated.rulesdmo";
		String subfolder = gendir + "/rulesdmo";
		
		if (context == OperationalContextEnum.FULLJAVA){
			genpackage = sd.getDmwPackage() + ".generated.rulesfulljava";
			subfolder = gendir + "/rulesfulljava";
		}
		
			
		for(RuleDefinition rd : sd.getRuleDefinitionList()){
			if (context == OperationalContextEnum.DMO){
				// Skip full java rules if we're generating for the DMO context
				if (!rd.isDMOCompliant())
					continue;
			}
			else{
				if (rd.isDMOCompliant())
					continue;
			}
			
    		ImportManager baseImports = new ImportManager();
    		StringBuffer interfaces = new StringBuffer();
			
    		baseImports.addImport("org.dmd.dms.generated.enums.RuleScopeEnum", "Rule scope");
    		baseImports.addImport("org.dmd.dms.generated.enums.RuleTypeEnum", "Rule type");
    		baseImports.addImport("org.dmd.dmc.rules.RuleIF", "All rules implement this");
    		baseImports.addImport("java.util.ArrayList", "To store category IDs");
    		baseImports.addImport("java.util.Iterator", "To access category IDs");
    		interfaces.append("RuleIF");
			
    		baseImports.addImport(sd.getSchemaPackage() + ".generated.dmo." + rd.getName() + "DataDMO", "Rule parameters object");
    		
    		StringBuffer categoryInit = new StringBuffer();
    		
    		for (RuleCategory rc : rd.getRuleCategory()){
    			categoryInit.append("            categories.add(" + rc.getRuleCategoryID() + ");\n");
    			baseImports.addImport(rc.getRuleInterface(), "The interface for the " + rc.getName() + " category");
    			interfaces.append(",");
    			interfaces.append(GenUtility.getClassFromImport(rc.getRuleInterface()));
    		}

			BufferedWriter 	out = FileUpdateManager.instance().getWriter(subfolder, rd.getName() + "BaseImpl.java");
			
			out.write("package " + genpackage + ";\n\n");
			
			out.write(baseImports.getFormattedImports() + "\n\n");
			
			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("abstract public class " + rd.getName() + "BaseImpl implements " + interfaces + " {\n\n");
			
			out.write("    static RuleScopeEnum      scope = RuleScopeEnum." + rd.getRuleScope() + ";\n");
			out.write("    static RuleTypeEnum       type  = RuleTypeEnum." + rd.getRuleType() + ";\n\n");
			
			out.write("    static ArrayList<Integer> categories;\n\n");
			
			out.write("    protected " + rd.getName() + "DataDMO ruleDMO;\n\n");
			
			out.write("    protected " + rd.getName() + "BaseImpl(" + rd.getName() + "DataDMO dmo){\n");
			out.write("        ruleDMO = dmo;\n");
			out.write("        if (categories == null){\n");
			out.write("            categories = new ArrayList<Integer>();\n");
			out.write(categoryInit.toString());
			out.write("        }\n");
			out.write("    }\n\n");
			
			out.write("    @Override\n");
			out.write("    public String getRuleTitle() {\n");
			out.write("        return(ruleDMO.getRuleTitle());\n");
			out.write("    }\n\n");

			out.write("    @Override\n");
			out.write("    public RuleScopeEnum getRuleScope() {\n");
			out.write("        return(scope);\n");
			out.write("    }\n\n");

			out.write("    @Override\n");
			out.write("    public RuleTypeEnum getRuleType() {\n");
			out.write("        return(type);\n");
			out.write("    }\n\n");

			out.write("    @Override\n");
			out.write("    public Iterator<Integer> getCategories() {\n");
			out.write("        return(categories.iterator());\n");
			out.write("    }\n\n");

			
			out.write("}\n\n");
			
			out.close();

		}
	}

}
