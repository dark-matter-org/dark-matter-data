package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.TreeMap;

import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedObject;
import org.dmd.util.parsing.NamedStringArray;

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
    		
    		ImportManager baseImports = new ImportManager();
    		StringBuffer interfaces = new StringBuffer();
    				
    		baseImports.addImport("org.dmd.dms.shared.interfaces.RuleIF", "All rules implement this");
    		interfaces.append("RuleIF");

    		
    		baseImports.addImport(schemaPackage + ".generated.dmo." + name + "DMO", "Rule parameters object");
    		
    		for(String cname: categories){
    			DmcUncheckedObject category = ruleCategoryDefs.get(cname);
    			
    			if (category == null){
    				ResultException ex = new ResultException("Unknown rule category: " + cname);
    				throw(ex);
    			}
    				
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
			
			out.write("    protected " + name + "DMO ruleDMO;\n\n");
			
			out.write("    protected " + name + "BaseImpl(" + name + "DMO dmo){\n");
			out.write("        ruleDMO = dmo;\n");
			out.write("    }\n\n");
			
			out.write("    @Override\n");
			out.write("    public String getRuleTitle() {\n");
			out.write("        return(ruleDMO.getRuleTitle());\n");
			out.write("    }\n");

			
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

    		out.write("        " + name + " " + name + "Instance = new " + name + "(new " + name + "DMO());\n\n");
		}
		
		out.write("    }\n\n");
		
		out.write("}\n\n");
		
		out.close();
		
		
	}

}
