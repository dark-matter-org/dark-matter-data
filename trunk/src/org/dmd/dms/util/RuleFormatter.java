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
	public void dumpBaseImplementations(String schemaName, String schemaPackage, TreeMap<String,DmcUncheckedObject> ruleDefs, String rulesDir) throws ResultException, IOException{
		
		ImportManager im = new ImportManager();
		
		for(DmcUncheckedObject rule: ruleDefs.values()){
    		String name = GenUtility.capTheName(rule.getSV("name"));
    		
    		im.addImport(schemaPackage + ".extended.rules." + name, "The implementation of the " + name);
    		
			BufferedWriter 	out = FileUpdateManager.instance().getWriter(rulesDir, name + "BaseImpl.java");
			
			out.write("package " + schemaPackage + ".generated.rules;\n\n");
			
			out.write("public class " + name + "BaseImpl {\n\n");
			
			out.write("}\n\n");
			
			out.close();
		}
		
		String factoryName = GenUtility.capTheName(schemaName) + "RulesFactoryAG";
		
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(rulesDir, factoryName + ".java");
		
		out.write("package " + schemaPackage + ".generated.rules;\n\n");
		
		out.write("import " + schemaPackage + ".generated.dmo.*;\n\n");
		out.write(im.getFormattedImports() + "\n\n");
		
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
