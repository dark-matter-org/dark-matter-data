package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.TreeMap;

import org.dmd.util.FileUpdateManager;
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
	 * @param schemaPackage
	 * @param ruleDefs
	 * @param rulesDir
	 * @throws ResultException 
	 * @throws IOException 
	 */
	public void dumpBaseImplementations(String schemaPackage, TreeMap<String,DmcUncheckedObject> ruleDefs, String rulesDir) throws ResultException, IOException{
		
		
		for(DmcUncheckedObject rule: ruleDefs.values()){
    		String name = GenUtility.capTheName(rule.getSV("name"));
    		
			BufferedWriter 	out = FileUpdateManager.instance().getWriter(rulesDir, name + "BaseImpl.java");
			
			out.write("package " + schemaPackage + ".generated.rules;\n\n");
			
			out.write("public class " + name + "BaseImpl {\n\n");
			
			out.write("}\n\n");
			
			out.close();
		}
		
	}

}
