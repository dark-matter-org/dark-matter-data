package org.dmd.util.codegen;

import java.util.TreeMap;

import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;

public class ImportManager {
	
	TreeMap<String,ImportStatement>	imports;
	int								longestImport;

	static TreeMap<String,ImportStatement>	staticImports;
	
	static int staticLongestImport;
	
	static {
		staticImports = new TreeMap<String, ImportStatement>();
	}
	
	static public void resetStatic(){
		staticImports = new TreeMap<String, ImportStatement>();
		staticLongestImport = 0;
	}
	
	static public void addImportStatic(String cn, String reason){
		staticImports.put(cn, new ImportStatement(cn, reason));
		if (cn.length() > staticLongestImport)
			staticLongestImport = cn.length();
	}
	
	static public String getFormattedImportsStatic(){
		StringBuffer 	sb 		= new StringBuffer();
		int 			padding = staticLongestImport+17;
		PrintfFormat 	format 	= new PrintfFormat("%-" + padding + "s");
		
		sb.append("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("// " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
		
		for(ImportStatement i: staticImports.values()){
			sb.append(format.sprintf("import " + i.className + ";") + "// " + i.reason + "\n");			
		}
		
		return(sb.toString());
	}
	
	public ImportManager(){
		imports = new TreeMap<String, ImportStatement>();
		longestImport = 0;
	}
	
	public void reset(){
		imports = new TreeMap<String, ImportStatement>();
		longestImport = 0;
	}
	
	public void addImportsFrom(ImportManager im){
		for(ImportStatement is: im.imports.values()){
			if (is.className.length() > longestImport)
				longestImport = is.className.length();
			imports.put(is.className, is);
		}
	}
	
	public void addImport(String cn, String reason){
		// We take the first import we get
		if (imports.get(cn) != null){
//			DebugInfo.debug("Warning: duplicate import - " + cn + " - " + reason);
			return;
		}
		
		imports.put(cn, new ImportStatement(cn, reason + " - " + DebugInfo.getShortWhereWeWereCalledFrom()));
		if (cn.length() > longestImport)
			longestImport = cn.length();
	}
	
	public String getFormattedImports(){
		StringBuffer 	sb 		= new StringBuffer();
		int 			padding = longestImport+17;
		PrintfFormat 	format 	= new PrintfFormat("%-" + padding + "s");
		
		sb.append("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("// " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
		
		for(ImportStatement i: imports.values()){
			sb.append(format.sprintf("import " + i.className + ";") + "// " + i.reason + "\n");			
		}
		
		return(sb.toString());
	}
	
	

}
