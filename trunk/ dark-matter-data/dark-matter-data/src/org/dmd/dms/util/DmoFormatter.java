package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.CodeFormatter;

/**
 * The DmoFormatter class takes a ClassDefinition and generates the associated
 * DarkMatter Object.
 */
public class DmoFormatter {

	// this is filled as a side effect of calling getImports()
	StringBuffer 	staticNames;
	
	ArrayList<AttributeDefinition>	allAttr;
	
	PrintStream		progress;
	
	public DmoFormatter(){
		progress = null;
	}
	
	public DmoFormatter(PrintStream o){
		progress = o;
	}
	/**
	 * For all ClassDefinitions in the schema, this method dumps the DmcObjects that
	 * represent them.
	 * @param sd     The schema.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	public void dumpDMOs(SchemaDefinition sd, String outdir) throws IOException{
		if (progress != null)
			progress.println("\n");
		
		Iterator<ClassDefinition> cdl = sd.getClassDefList();
		while(cdl.hasNext())
			dumpDMO(cdl.next(),outdir);
	}
	
	/**
	 * Dumps a file named <class name>DMO.java to the specified output directory.
	 * @param cd     The definition of the class.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	private void dumpDMO(ClassDefinition cd, String outdir) throws IOException {
		// reset the static names, just in case we've been here before
		staticNames = new StringBuffer();
		
		allAttr = new ArrayList<AttributeDefinition>();
		
		String ofn = outdir + File.separator + cd.getName() + "DMO.java";
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);

        out.write("package " + cd.getDefinedIn().getSchemaPackage() + ".generated.dmo;\n\n");
        
        out.write(getImports(cd));
        
        out.write(getClassHeader(cd));
        
        out.write(" {\n\n");
        
        out.write(staticNames.toString() + "\n");
        
        out.write("    public " + cd.getName() + "DMO() {\n");
        out.write("    }\n");
        out.write("\n");
        out.write(getAccessFunctions(cd));
        out.write("\n");
        
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
				
				allAttr.add(ad);
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
				
				allAttr.add(ad);
			}
		}
		
		if (needJavaUtil)
			sb.append("import java.util.*;\n\n");
		
		sb.append("import org.dmd.dmc.DmcAttribute;\n");
		sb.append("import org.dmd.dmc.DmcValueException;\n");
		
		Iterator<TypeDefinition> t = types.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();
			if (td.getPrimitiveType() != null){
				sb.append("import " + td.getPrimitiveType() + ";\n");
			}
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
		
		sb.append("/**\n");
        CodeFormatter.dumpCodeComment(cd.getDescription(),sb," * ");
        sb.append(" * \n");
        sb.append(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        sb.append(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        sb.append(" */\n");
		
		
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
	
	String getAccessFunctions(ClassDefinition cd){
		StringBuffer sb	= new StringBuffer();
		
		// provide the getObjectName() method to support DmcNamedObjectIF
		if (cd.getIsNamedBy() != null){
			sb.append("    public String getObjectName(){\n");
			sb.append("        return attributes.get(_" + cd.getIsNamedBy().getName() + ");\n");
			sb.append("    }\n\n");
		}
		
		for(AttributeDefinition ad : allAttr){
			if (ad.getIsMultiValued())
				formatMV(ad,sb);
			else
				formatSV(ad,sb);
		}
		
		return(sb.toString());
	}
	
	void formatSV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String nullReturnValue = ad.getType().getNullReturnValue();
    	String typeName = ad.getType().getName();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    		typeName = typeName + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
		
		sb.append("    public " + typeName + " get" + functionName + "(){\n");
		sb.append("        " + attrType + " attr = (" + attrType + ") attributes.get(_" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		
    	if (nullReturnValue == null)
    		sb.append("            return(null);\n");
    	else
    		sb.append("            return(" + nullReturnValue + ");\n");

    	sb.append("\n");
    	sb.append("        return(attr.getSV());\n");
    	sb.append("    }\n\n");
		
    	////////////////////////////////////////////////////////////////////////////////
    	// setter
    	
    	sb.append("    /**\n");
    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
    	sb.append("     * @param value A value compatible with " + attrType + "\n");
    	sb.append("     */\n");
    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
    	sb.append("    public void set" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute attr = attributes.get(_" + ad.getName() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "();\n");
    	sb.append("        \n");
    	sb.append("        attr.set(value);\n");
    	sb.append("        set(_" + ad.getName() + ",attr);\n");
    	sb.append("    }\n\n");
	}
	
	void formatMV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

    	sb.append("    /**\n");
		
		if (ad.getType().getIsRefType()){
			sb.append("     * @returns An Iterator of " + typeName + "DMO objects.\n");
			sb.append("     */\n");
			sb.append("    public Iterator<" + typeName + "REF> get" + functionName + "(){\n");
		}
		else{
			sb.append("     * @returns An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
		}
		sb.append("        " + attrType + " attr = (" + attrType + ") attributes.get(_" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(null);\n");
		sb.append("\n");
		sb.append("        return(attr.getMV());\n");
		sb.append("    }\n\n");
		
    	////////////////////////////////////////////////////////////////////////////////
    	// adder

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value A value compatible with " + typeName + "\n");
		sb.append("     */\n");
    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
		sb.append("    public void add" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute attr = attributes.get(_" + ad.getName() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "();\n");
    	sb.append("        \n");
    	sb.append("        attr.add(value);\n");
    	sb.append("        add(_" + ad.getName() + ",attr);\n");
		sb.append("    }\n\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		sb.append("    /**\n");
		sb.append("     * Deletes a " + ad.getName() + " value.\n");
		sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
		sb.append("     */\n");
		sb.append("    public void del" + functionName + "(Object value){\n");
		sb.append("        try{\n");
		sb.append("            del(_" + ad.getName() + ", value);\n");
		sb.append("        }\n");
		sb.append("        catch(Exception ex){\n");
		sb.append("            ex.printStackTrace();\n");
		sb.append("        }\n");
		sb.append("    }\n\n");

		
	}
}
