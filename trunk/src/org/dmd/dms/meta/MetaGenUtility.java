package org.dmd.dms.meta;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;

import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;

/**
 * Provides various utilties to dump aspects of the meta schema implementation.
 */
public class MetaGenUtility {

	/**
	 * 
	 * @param dmwdir the DMW output directory
	 * @param basePackage the base package, in this case the meta schema
	 * @param typeImport import for the type we're iterating
	 * @param typeName just the type name
	 * @param genericArgs any generic arguments associated with the type definition
	 * @param fileHeader the standard LGPL header
	 * @param progress place to indicate progress
	 * @throws IOException
	 */
	static public void dumpIterable(String dmwdir, String basePackage, String typeImport, String typeName, String genericArgs, String fileHeader, PrintStream progress) throws IOException {
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmwdir, typeName + "IterableDMW.java");
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.dmw;\n\n");
        
        ImportManager imports = new ImportManager();
        	
        imports.addImport("java.util.Iterator", "Because we're iterating");
        imports.addImport("org.dmd.dmw.DmwMVIterator", "The base multi-value iterator");
        
        if (typeImport != null){
            imports.addImport(typeImport, "This is the type we're iterating");
        }
        
        out.write(imports.getFormattedImports() + "\n");
        
        String suffix = "";
        if ( (typeImport != null) && (typeImport.endsWith("DMO"))){
        	suffix = "DMO";
        }
        
        String args = "";
        if (genericArgs != null)
        	args = genericArgs;
                 	                
        out.write("/**\n");
        out.write(" * The " + typeName + "IterableDMW wraps an Iterator for a particular type and makes \n");
        out.write(" * it Iterable.\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        
        
        out.write("public class " + typeName + "IterableDMW extends DmwMVIterator<" + typeName + suffix + args +"> {\n");
        out.write("\n");
        out.write("    public final static " + typeName + "IterableDMW emptyList = new " + typeName + "IterableDMW();\n");
        out.write("\n");
        out.write("    protected " + typeName + "IterableDMW(){\n");
        out.write("        super();\n");
        out.write("    }\n");
        out.write("\n");
        out.write("    public " + typeName + "IterableDMW(Iterator<" + typeName + suffix + args +"> it){\n");
        out.write("        super(it);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("}\n\n");
        
        out.close();

	}

	/**
	 * This method should only be called for named object types.
	 * @param dmwdir		The output directory.
	 * @param basePackage   The base package for the generated code.
	 * @param className the for which we're generating the iterator.
	 * @param extended flag indicating if the calss is extended.
	 * @param extendedPackage the package if the class is extended.
	 * @param fileHeader the header to be dumped on the file.
	 * @param progress the progress reporting stream.
	 * @throws IOException
	 */
	static public void dumpIterableREF(String dmwdir, String basePackage, String className, boolean extended, String extendedPackage, String fileHeader, PrintStream progress) throws IOException {
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmwdir, className + "IterableDMW.java");
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        String CAST = className + "DMW";
        String REF 	= className + "REF";
        
        out.write("package " + basePackage + ".generated.dmw;\n\n");
        
        ImportManager imports = new ImportManager();
        
        imports.addImport("java.util.Iterator", "Because we're iterating!");
        imports.addImport("org.dmd.dmw.DmwContainerIterator", "Because we're extending the parameterized class");
        imports.addImport(basePackage + ".generated.types." + className + "REF", "To access our reference type");
        
        if (extended){
            imports.addImport(extendedPackage + "." + className, "Because " + className + " uses extended wrappers");
            CAST = className;
        }
        else{
            imports.addImport(basePackage + ".generated.dmw." + className + "DMW", "Because " + className + " is not extended");
        }
        
        out.write(imports.getFormattedImports() + "\n");
          	                
        out.write("/**\n");
        out.write(" * The " + className + "IteratorDMW will cast from an underlying " + REF + " class to \n");
        out.write(" * the associated wrapper class: " + CAST + " when accessing object references in a wrapper context.\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
        
        
        out.write("public class " + className + "IterableDMW extends DmwContainerIterator<" + CAST + "," + REF + "> {\n");
        out.write("\n");
        out.write("    public final static " + className + "IterableDMW emptyList = new " + className + "IterableDMW();\n");
        out.write("\n");
        out.write("    protected " + className + "IterableDMW(){\n");
        out.write("        super();\n");
        out.write("    }\n");
        out.write("\n");
        out.write("    public " + className + "IterableDMW(Iterator<" + REF + "> it){\n");
        out.write("        super(it);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("}\n\n");
        
        out.close();
	}
	

}
