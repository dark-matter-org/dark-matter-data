package org.dmd.util.codegen;

import java.util.TreeMap;

import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;

public class ImportManager {

	static TreeMap<String,ImportStatement>	imports;
	
	static int longestImport;
	
	static {
		imports = new TreeMap<String, ImportStatement>();
	}
	
	static public void reset(){
		imports = new TreeMap<String, ImportStatement>();
		longestImport = 0;
	}
	
	static public void addImport(String cn, String reason){
		imports.put(cn, new ImportStatement(cn, reason));
		if (cn.length() > longestImport)
			longestImport = cn.length();
	}
	
	static public String getFormattedImports(){
		StringBuffer 	sb 		= new StringBuffer();
		int 			padding = longestImport+17;
		PrintfFormat 	format 	= new PrintfFormat("%-" + padding + "s");
		
		sb.append("// Generated from: " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
		
		for(ImportStatement i: imports.values()){
			sb.append(format.sprintf("import " + i.className + ";") + "// " + i.reason + "\n");			
		}
		
		return(sb.toString());
	}
}
