//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
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
import org.dmd.dms.MetaSchema;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.CodeFormatter;

/**
 * The DmoFormatter class takes a ClassDefinition and generates the associated
 * DarkMatter Object.
 */
public class DmoFormatter {
	
	String 			fileHeader;
	
	SchemaManager	schema;
	
	// this is filled as a side effect of calling getImports()
	StringBuffer 	staticNames;
	
	ArrayList<AttributeDefinition>	allAttr;
	
	PrintStream		progress;
	
	// A common chunk of code - this is initialized once and then used for all AUX classes
	String			auxCommon;
	
	// These are used when generating AUX classes. We set them in the getImports() method
	// so that we can generate the appropriate private set()/get() methods as required.
	boolean	anyMVAttributes;
	boolean anySVAttributes;
	
	public DmoFormatter(){
		progress = null;
	}
	
	public DmoFormatter(PrintStream o){
		progress = o;
	}
	
	public void setFileHeader(String fh){
		fileHeader = fh;
	}
	

	/**
	 * For all ClassDefinitions in the schema, this method dumps the DmcObjects that
	 * represent them.
	 * @param sd     The schema.
	 * @param dmodir The output directory.
	 * @param auxdir The output directory for auxiliary classes.
	 * @throws IOException 
	 */
	public void dumpDMOs(SchemaManager sm, SchemaDefinition sd, String dmodir, String auxdir) throws IOException{
		schema = sm;
		
		if (progress != null)
			progress.println("\n");
		
		Iterator<ClassDefinition> cdl = sd.getClassDefList();
		if (cdl != null){
			while(cdl.hasNext()){
				ClassDefinition cd = cdl.next();
				if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
					dumpAUX(cd, auxdir);
				}
				else{
					dumpDMO(cd,dmodir);
				}
			}
		}
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
        
        if (fileHeader != null)
        	out.write(fileHeader);

        out.write("package " + cd.getDefinedIn().getSchemaPackage() + ".generated.dmo;\n\n");
        
        out.write(getImports(cd));
        
        out.write(getClassHeader(cd));
        
        out.write(" {\n\n");
        
        out.write(staticNames.toString() + "\n");
        
        out.write("    public " + cd.getName() + "DMO() {\n");
        out.write("        super(\"" + cd.getName() + "\");\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("    protected " + cd.getName() + "DMO(String oc) {\n");
        out.write("        super(oc);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write(getAccessFunctions(cd));
        out.write("\n");
        
        out.write("\n\n}\n");
        
        out.close();
	}
	
	/**
	 * Dumps a file named <class name>AUX.java to the specified output directory.
	 * @param cd     The definition of the class.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	private void dumpAUX(ClassDefinition cd, String outdir) throws IOException {
		// reset the static names, just in case we've been here before
		staticNames = new StringBuffer();
		
		allAttr = new ArrayList<AttributeDefinition>();
		
		String ofn = outdir + File.separator + cd.getName() + "DMO.java";
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);

        out.write("package " + cd.getDefinedIn().getSchemaPackage() + ".generated.auxw;\n\n");
        
        anyMVAttributes = false;
        anySVAttributes = false;
        
        out.write(getImports(cd));
        
        out.write(getClassHeader(cd));
        
        out.write(" {\n\n");
        
        out.write("    DmcObject core;\n\n");
        
        out.write("    public final static String _auxClass = \"" + cd.getName() + "\";\n");
        out.write(staticNames.toString() + "\n");
        
        out.write("    public " + cd.getName() + "DMO() {\n");
        out.write("        core = null;\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("    public " + cd.getName() + "DMO(DmcObject obj) {\n");
        out.write("        core = obj;\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write(getCommonAUXFunctions());
        
        out.write(getAccessFunctions(cd));
        
        out.write("\n");
        
        out.write("\n\n}\n");
        
        out.close();
	}
	
	String getCommonAUXFunctions(){
		if (auxCommon == null){
			StringBuffer sb = new StringBuffer();
			
			sb.append("    public void wrap(DmcObject obj) {\n");
			sb.append("        core = obj;\n");
			sb.append("    }\n");
			sb.append("\n");

			sb.append("    /**\n");
			sb.append("     * This method adds the auxiliary class name to the wrapped object if it doesn't already exist.\n");
			sb.append("     */\n");
			sb.append("    public void addAux() throws DmcValueException {\n");
			sb.append("        if (core == null)\n");
			sb.append("            return;\n");
			sb.append("        core.addAux(_auxClass);\n");
			sb.append("    }\n");
			sb.append("\n");

			sb.append("    /**\n");
			sb.append("     * This method removes the auxiliary class name from the wrapped object.\n");
			sb.append("     */\n");
			sb.append("    public void removeAux() throws DmcValueException {\n");
			sb.append("        if (core == null)\n");
			sb.append("            return;\n");
			sb.append("        core.removeAux(_auxClass);\n");
			sb.append("    }\n");
			sb.append("\n");

			sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    private DmcAttribute get(String name){\n");
			sb.append("        if (core == null)\n");
			sb.append("            return(null);\n");
			sb.append("        return(core.get(name));\n");
			sb.append("    }\n");
			sb.append("\n");

			if (anySVAttributes){
				sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    private DmcAttribute set(String attrName, DmcAttribute attr) throws DmcValueException {\n");
				sb.append("        if (core == null)\n");
				sb.append("            return(null);\n");
				sb.append("        return(core.set(attrName,attr));\n");
				sb.append("    }\n");
				sb.append("\n");
			}

			if (anyMVAttributes){
				sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    private DmcAttribute add(String attrName, DmcAttribute attr) throws DmcValueException {\n");
				sb.append("        if (core == null)\n");
				sb.append("            return(null);\n");
				sb.append("        return(core.add(attrName,attr));\n");
				sb.append("    }\n");
				sb.append("\n");
			}
			
			auxCommon = sb.toString();
		}
		return(auxCommon);
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
		boolean			anyAttributes	= false;
		TreeMap<String,TypeDefinition>	types = new TreeMap<String,TypeDefinition>();
		
//		if (cd.getName().equals("DMPMessage")){
//			DebugInfo.debug("\n" + cd.toOIF(15) + "\n");
//		}
		
//		// We add the objectClass attribute and the string type
//		staticNames.append("    public final static String _objectClass =\"objectClass\";\n");
//		TypeDefinition stringType = schema.isType("String");
//		types.put(stringType.getName(), stringType);
		
		Iterator<AttributeDefinition> may = cd.getMay();
		if (may != null){
			anyAttributes = true;
			while(may.hasNext()){
				AttributeDefinition ad = may.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				if (ad.getIsMultiValued()){
					anyMVAttributes = true;
					needJavaUtil = true;
				}
				else{
					anySVAttributes = true;
				}
				// Add this attribute to our static names
				staticNames.append("    public final static String _" + ad.getName() + " = \"" + ad.getName() + "\";\n");
				
				allAttr.add(ad);
			}
		}
		
		Iterator<AttributeDefinition> must = cd.getMust();
		if (must != null){
			anyAttributes = true;
			while(must.hasNext()){
				AttributeDefinition ad = must.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				
				if (ad.getIsMultiValued()){
					anyMVAttributes = true;
					needJavaUtil = true;
				}
				else{
					anySVAttributes = true;
				}
				
				// Add this attribute to our static names
				staticNames.append("    public final static String _" + ad.getName() + " = \"" + ad.getName() + "\";\n");
				
				allAttr.add(ad);
			}
		}
		
		if (needJavaUtil)
			sb.append("import java.util.*;\n\n");
		
		if (anyAttributes){
			sb.append("import org.dmd.dmc.DmcAttribute;\n");
			sb.append("import org.dmd.dmc.DmcValueException;\n");
		}
		
		// If the class is auxiliary, we need the DmcTypeString to manipulate the ocl attribute
		if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
			types.put("String", MetaSchema._String);
		}

//DebugInfo.debug("imports for " + cd.getName());

		Iterator<TypeDefinition> t = types.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();

//DebugInfo.debug("\n" + td.toOIF(15));

			if ( (td.getPrimitiveType() != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY) ){
				
				if (td.getInternallyGenerated() && td.getIsRefType()){
					// We have an internally generated reference type, only import if
					// the definition is from a different schema, otherwise, we're
					// already in the same package and don't need to import it
					if (cd.getDefinedIn() != td.getDefinedIn()){
						sb.append("// import 1\n");
						sb.append("import " + td.getPrimitiveType() + ";\n");
					}
				}
				else{
					sb.append("// import 2\n");
					sb.append("import " + td.getPrimitiveType() + ";\n");
				}
			}
			
			sb.append("// import 3 " + td.getName() + "\n");
			
			if (td.getIsRefType()){
				sb.append("import " + td.getOriginalClass().getDmtImport() + ";\n");
			}
			else{
				sb.append("import " + td.getTypeClassName() + ";\n");
			}
			
			if (td.getHelperClassName() != null){
				sb.append("// import 4\n");
				sb.append("import " + td.getHelperClassName() + ";\n");
			}
		}
		
		sb.append("\n");
		
		if (cd.getDerivedFrom() == null){
			sb.append("// import 5\n");

			sb.append("import org.dmd.dmc.DmcObject;\n");
		}
		else{
			sb.append("// import 6\n");

			sb.append("import " + cd.getDerivedFrom().getDmoImport() + ";\n");
		}
		
		if (cd.getIsNamedBy() != null){
			sb.append("// import 7\n");

			sb.append("import org.dmd.dmc.DmcNamedObjectIF;\n");
		}

		
		sb.append("\n");
		
		return(sb.toString());
	}
	
	String getClassHeader(ClassDefinition cd){
		StringBuffer sb = new StringBuffer();
		
		if (cd.getClassType() != ClassTypeEnum.AUXILIARY)
			sb.append("@SuppressWarnings(\"serial\")\n");
		
		sb.append("/**\n");
        CodeFormatter.dumpCodeComment(cd.getDescription(),sb," * ");
        sb.append(" * <P>\n");
        sb.append(" * Generated from the " + cd.getDefinedIn().getName() + " schema at version " + cd.getDefinedIn().getVersion() + "\n");
        sb.append(" * <P>\n");
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
		
//		if (cd.getClassType() == ClassTypeEnum.AUXILIARY)
//			sb.append(cd.getName());
//		else
			sb.append(cd.getName() + "DMO ");
		
		if (cd.getDerivedFrom() == null){
			if (cd.getClassType() != ClassTypeEnum.AUXILIARY)
				sb.append(" extends DmcObject ");
		}
		else
			sb.append(" extends " + cd.getDerivedFrom().getName() + "DMO ");
		
		if (cd.getIsNamedBy() == null){
			if (cd.getUsesInterface() != null)
				sb.append(" implements " + cd.getUsesInterface());
		}
		else{
			sb.append(" implements DmcNamedObjectIF");
			if (cd.getUsesInterface() == null)
				sb.append(" ");
			else
				sb.append("," + cd.getUsesInterface() + " ");
		}
		
		return(sb.toString());
	}
	
	String getAccessFunctions(ClassDefinition cd){
		StringBuffer sb	= new StringBuffer();
		
		// provide the getObjectName() method to support DmcNamedObjectIF
		if (cd.getIsNamedBy() != null){
			sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    public String getObjectName(){\n");
			sb.append("        DmcAttribute name = get(_" + cd.getIsNamedBy().getName() + ");\n");
			sb.append("        if (name != null)\n");
			sb.append("            return(name.getString());\n");
			sb.append("    \n");
			sb.append("        return(null);\n");
			sb.append("    }\n\n");
			
			sb.append("    public boolean equals(Object obj){\n");
			sb.append("        if (obj instanceof " + cd.getName()+ "DMO){\n");
			sb.append("            return( getObjectName().equals( ((" + cd.getName() + "DMO) obj).getObjectName()) );\n");
			sb.append("        }\n");
			sb.append("        return(false);\n");
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
		sb.append("        " + attrType + " attr = (" + attrType + ") get(_" + ad.getName() + ");\n");
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
    	sb.append("        DmcAttribute attr = get(_" + ad.getName() + ");\n");
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
		sb.append("        " + attrType + " attr = (" + attrType + ") get(_" + ad.getName() + ");\n");
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
		sb.append("    public DmcAttribute add" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute attr = get(_" + ad.getName() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "();\n");
    	sb.append("        \n");
    	sb.append("        attr.add(value);\n");
    	sb.append("        add(_" + ad.getName() + ",attr);\n");
    	sb.append("        return(attr);\n");
		sb.append("    }\n\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		sb.append("    /**\n");
		sb.append("     * Deletes a " + ad.getName() + " value.\n");
		sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
		sb.append("     */\n");
    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
		sb.append("    public DmcAttribute del" + functionName + "(Object value){\n");
//		sb.append("        try{\n");
		sb.append("        return(del(_" + ad.getName() + ", value));\n");
//		sb.append("        }\n");
//		sb.append("        catch(Exception ex){\n");
//		sb.append("            ex.printStackTrace();\n");
//		sb.append("        }\n");
		sb.append("    }\n\n");

		
	}
}
