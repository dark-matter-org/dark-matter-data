package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.TypeDefinition;

/**
 * The DmoFormatter class takes a ClassDefinition and generates the associated
 * DarkMatter Object.
 */
public class DmoFormatter {

	// this is filled as a side effect of calling getImports()
	StringBuffer 	staticNames;
	
	PrintStream		progress;
	
	public DmoFormatter(){
		progress = null;
	}
	
	public DmoFormatter(PrintStream o){
		progress = o;
	}
	
	/**
	 * Dumps a file named <class name>DMO.java to the specified output directory.
	 * @param cd     The definition of the class.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	public void dumpDMO(ClassDefinition cd, String outdir) throws IOException {
		// reset the static names, just in case we've been here before
		staticNames = new StringBuffer();
		
		String ofn = outdir + File.separator + cd.getName() + "DMO.java";
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);

        out.write("package " + cd.getDefinedIn().getSchemaPackage() + ".generated.dmo;\n\n");
        
        out.write(getImports(cd));
        
        out.write(getClassHeader(cd));
        
        out.write(" {\n");
        
        out.write(staticNames.toString());
        
        out.write("\n\n}\n");
        
        out.close();
	}
	
	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd
	 * @return
	 */
	String getImports(ClassDefinition cd){
		StringBuffer 	sb 				= new StringBuffer();
		boolean			needJavaUtil	= false;
		TreeMap<String,TypeDefinition>	types = new TreeMap<String,TypeDefinition>();
		
		Iterator<AttributeDefinition> may = cd.getMay();
		if (may != null){
			while(may.hasNext()){
				AttributeDefinition ad = may.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				if (ad.getIsMultiValued())
					needJavaUtil = true;
				
				// Add this attribute to our static names
				staticNames.append("    public final static String _" + ad.getName() + " = \"" + ad.getName() + "\";\n");
			}
		}
		
		Iterator<AttributeDefinition> must = cd.getMust();
		if (must != null){
			while(must.hasNext()){
				AttributeDefinition ad = must.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				if (ad.getIsMultiValued())
					needJavaUtil = true;
				
				// Add this attribute to our static names
				staticNames.append("    public final static String _" + ad.getName() + " = \"" + ad.getName() + "\";\n");
			}
		}
		
		if (needJavaUtil)
			sb.append("import java.util.*;\n\n");
		
		Iterator<TypeDefinition> t = types.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();
			sb.append("import " + td.getTypeClassName() + ";\n");
		}
		
		sb.append("\n");
		
		if (cd.getDerivedFrom() == null){
			sb.append("import org.dmd.dmc.DmcObject;\n");
		}
		else{
			sb.append("import " + cd.getDerivedFrom().getDmoClass() + ";\n");
		}
		
		if (cd.getIsNamedBy() != null){
			sb.append("import org.dmd.dmc.DmcnamedObjectIF;\n");
		}

		
		sb.append("\n");
		
		return(sb.toString());
	}
	
	String getClassHeader(ClassDefinition cd){
		StringBuffer sb = new StringBuffer();
		
		sb.append("@SuppressWarnings(\"serial\")\n");
		
		switch(cd.getClassType()){
		case ABSTRACT:
			sb.append("abstract public class ");
			break;
		case AUXILIARY:
		case EXTENSIBLE:
		case STRUCTURAL:
			sb.append("public class ");
			break;
		}
		
		sb.append(cd.getName() + "DMO ");
		
		if (cd.getDerivedFrom() == null)
			sb.append(" extends DmcObject ");
		else
			sb.append(" extends " + cd.getDerivedFrom().getName() + "DMO ");
		
		if (cd.getIsNamedBy() != null){
			sb.append(" implements DmcNamedObjectIF ");
		}
		
		return(sb.toString());
	}
}
