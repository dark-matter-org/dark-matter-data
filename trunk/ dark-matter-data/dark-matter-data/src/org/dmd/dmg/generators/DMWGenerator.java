package org.dmd.dmg.generators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmg.DarkMatterGeneratorIF;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

public class DMWGenerator implements DarkMatterGeneratorIF {

	String gendir;
	String dmwdir;

	ArrayList<AttributeDefinition>	allAttr;
	
	PrintStream	progress;
	
	SchemaManager	schema;

	public DMWGenerator(){
		
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	// DarkMatterGeneratorIF implementation

	@Override
	public void gatherUserInput(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) {
		// Nothing for now
	}

	@Override
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		gendir = loc.getConfigParentDirectory() + File.separator + "generated";
		dmwdir = gendir + File.separator + "dmw";
		
		schema = sm;
		
		createGenDirs();
		
		createWrappers(config, loc, f, sm);
	}

	@Override
	public void setProgressStream(PrintStream ps) {
		progress = ps;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Our functionality

	
	/**
	 * Creates the output directory structure for our code.
	 */
	void createGenDirs(){
		File gdf = new File(gendir);
		if (!gdf.exists())
			gdf.mkdir();
		
		File ddf = new File(dmwdir);
		if (!ddf.exists())
			ddf.mkdir();
		
	}

	void createWrappers(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		Iterator<String> schemas = config.getSchemaToLoad();
		if (schemas != null){
			while(schemas.hasNext()){
				String s = schemas.next();
				SchemaDefinition sd = sm.isSchema(s);
				Iterator<ClassDefinition> cdefs = sd.getClassDefList();
				
				if (cdefs != null){
					while(cdefs.hasNext()){
						ClassDefinition cd = cdefs.next();
						
						if (cd.getClassType() != ClassTypeEnum.AUXILIARY){
							if (cd.getJavaClass() == null){
								ResultException ex = new ResultException();
								ex.addError("The " +cd.getName() + " class must define the javaClass attribute to facilitate wrapper creation.");
								ex.result.lastResult().fileName(cd.getFile());
								ex.result.lastResult().lineNumber(cd.getLineNumber());
								throw(ex);
							}
							dumpWrapper(config, loc, f, sm, cd);
						}
					}
				}
			}
		}
	}
	
	void dumpWrapper(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd) throws IOException {
		
		String ofn = dmwdir + File.separator + cd.getName() + "DMW.java";
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        out.write("package " + config.getGenPackage() + ".generated.dmw;\n\n");
        
		allAttr = new ArrayList<AttributeDefinition>();
		StringBuffer imports = new StringBuffer();
		
		getAttributesAndImports(cd, allAttr, imports);
        
//        out.write("import java.util.*;\n\n");
        out.write(imports.toString());
        out.write("import org.dmd.dmc.DmcObject;\n\n");
        		
//        out.write(getImports(cd));
        String impl = "";
        
        if (cd.getIsNamedBy() != null)
        	impl = "implements DmcNamedObjectIF ";
        
        if (cd.getDerivedFrom() == null)
        	out.write("public class " + cd.getName() + "DMW extends DmwWrapperBase " + impl + "{\n");
        else
        	out.write("public class " + cd.getName() + "DMW extends " + cd.getDerivedFrom().getJavaClass() + " " + impl + "{\n");
        
        out.write("\n");
//        out.write("    public " + cd.getName() + "DMW(){\n");
//        out.write("\n");
//        out.write("    }\n");
//        out.write("\n");
//        out.write("    public " + cd.getName() + "DMW(" + cd.getName() + "DMO obj){\n");
//        out.write("        super(obj);\n");
//        out.write("    }\n");
//        out.write("\n");
        
        out.write("    private " + cd.getName() + "DMO mycore;\n\n");

        // All dark matter wrappers have to have a standard constructor that takes no
        // arguments and constructs the appropriate DMO for the wrapper.
        
        	
        if (cd.getClassType() != ClassTypeEnum.ABSTRACT){
	        out.write("    public " + cd.getName() + "DMW() {\n");
        	// We only instantiate the core if, we're not abstract
	        out.write("        super(new " + cd.getName() + "DMO());\n");
	        out.write("        mycore = (" + cd.getName() + "DMO) core;\n");
	        out.write("        mycore.setContainer(this);\n");
	        out.write("    }\n\n");
        }

        out.write("    protected " + cd.getName() + "DMW(DmcObject obj) {\n");
        out.write("        super(obj);\n");
        out.write("        mycore = (" + cd.getName() + "DMO) core;\n");
//        out.write("        mycore.setContainer(this);\n");
        out.write("    }\n\n");
        
        out.write("    @SuppressWarnings(\"unchecked\")\n");
        out.write("    @Override\n");
        out.write("    protected ArrayList getAuxDataHolder() {\n");
        out.write("        return(new ArrayList<" + cd.getJavaClass() + ">());\n");
        out.write("    }\n\n");

        out.write(getAccessFunctions(cd));
        out.write("\n");
        out.write("}\n");
		
        out.close();
	}
	
	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd        The class definition of the object.
	 * @param baseClass The base class of the object you're generating or null if there's no base class.
	 * @param allAttr   An array that will be populated with all attribute definitions of the class.
	 * @param sb        The buffer where the import statements are accumulated.
	 */
	public void getAttributesAndImports(ClassDefinition cd, ArrayList<AttributeDefinition> allAttr, StringBuffer sb){
//	public void getAttributesAndImports(ClassDefinition cd, String baseClass, ArrayList<AttributeDefinition> allAttr, StringBuffer sb){
		boolean			needDmcAttr	= false;
		TreeMap<String,TypeDefinition>	types = new TreeMap<String,TypeDefinition>();
		
		Iterator<AttributeDefinition> may = cd.getMay();
		if (may != null){
			while(may.hasNext()){
				AttributeDefinition ad = may.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				if (ad.getIsMultiValued() && td.getIsRefType())
					needDmcAttr = true;
				
				allAttr.add(ad);
			}
		}
		
		Iterator<AttributeDefinition> must = cd.getMust();
		if (must != null){
			while(must.hasNext()){
				AttributeDefinition ad = must.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				if (ad.getIsMultiValued() && td.getIsRefType())
					needDmcAttr = true;
				
				allAttr.add(ad);
			}
		}
		
		sb.append("import java.util.*;\n\n");

		if (needDmcAttr){
			// We only need this when there are MV attributes that reference objects
			sb.append("import org.dmd.dmc.DmcAttribute;\n\n");
		}
		
		sb.append("import org.dmd.dmc.DmcValueException;\n");
		
		Iterator<TypeDefinition> t = types.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();
			
			
			if (td.getIsRefType()){
				sb.append("// import 1\n");
				sb.append("import " + td.getAuxHolderImport() + ";\n");
			}
			else if (td.getPrimitiveType() != null){
				sb.append("// import 2\n");
				sb.append("import " + td.getPrimitiveType() + ";\n");
			}
//			sb.append("import " + td.getTypeClassName() + ";\n");
		}
		
		sb.append("\n");
		
		if (cd.getIsNamedBy() != null){
			sb.append("import org.dmd.dmc.DmcNamedObjectIF;\n");
		}

		if (cd.getDerivedFrom() == null){
			// We import the base wrapper
			sb.append("import org.dmd.dmw.DmwWrapperBase;\n");
		}
		else{
			// If we're NOT defined in the same schema, import the base class
			// Otherwise, we don't need to import
			if (cd.getDefinedIn() != cd.getDerivedFrom().getDefinedIn()){
				sb.append("import " + cd.getDerivedFrom().getJavaClass() + ";\n");
			}
		}
			
//		if (baseClass != null){
//			
//			sb.append("// import 3\n");
//			sb.append("import " + baseClass + ";\n");
//		}

		sb.append("// import 4\n");
		sb.append("import " + cd.getDmoImport() + ";\n");
		
		sb.append("\n");
	}
	

	
	String getAccessFunctions(ClassDefinition cd){
		StringBuffer sb	= new StringBuffer();
		
		// provide the getObjectName() method to support DmcNamedObjectIF
		if (cd.getIsNamedBy() != null){
	    	StringBuffer 	attrNameCapped 	= new StringBuffer();
	    	attrNameCapped.append(cd.getIsNamedBy().getName());
	    	attrNameCapped.setCharAt(0,Character.toUpperCase(attrNameCapped.charAt(0)));

			sb.append("    public String getObjectName(){\n");
			sb.append("        return(mycore.get" + attrNameCapped.toString() + "());\n");
			sb.append("    }\n\n");
			
			sb.append("    public boolean equals(Object obj){\n");
			sb.append("        if (obj instanceof " + cd.getName()+ "DMW){\n");
			sb.append("            return( getObjectName().equals( ((" + cd.getName() + "DMW) obj).getObjectName()) );\n");
			sb.append("        }\n");
			sb.append("        return(false);\n");
			sb.append("    }\n\n");

		}
		
		for(AttributeDefinition ad : allAttr){
			if (ad.getIsMultiValued())
				formatMV(cd,ad,sb);
			else
				formatSV(ad,sb);
		}
		
		return(sb.toString());
	}
	
	void formatSV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
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
		sb.append("        return(mycore.get" + functionName + "());\n");
    	sb.append("    }\n\n");
		
    	////////////////////////////////////////////////////////////////////////////////
    	// setter
    	
    	sb.append("    /**\n");
    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
    	sb.append("     * @param value A value compatible with " + attrType + "\n");
    	sb.append("     */\n");
    	sb.append("    public void set" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        mycore.set" + functionName + "(value);\n");
    	sb.append("    }\n\n");
	}
	
	/**
	 * 
	 * @param ad The attribute definition we're creating the access functions for.
	 * @param sb Where we're appending the functions.
	 */
	void formatMV(ClassDefinition cd, AttributeDefinition ad, StringBuffer sb){
		// The fully qualified name of the DmcType for the attribute
    	String typeClassName = ad.getType().getTypeClassName();
    	
    	// The last part typeClassName
    	String attrType = "DmcType" + ad.getType().getName();
    	
    	// 
    	String typeName = ad.getType().getName();
    	
    	// Complicated stuff. When we're referring to wrapped objects through a reference
    	// attribute we can have two cases. Either, we have a straight wrapper e.g. generated.dmw.classDMW
    	// or, the generated wrapper has been extended e.g.  extended.class
    	// So, we need to handle both of these cases and the internally generated type gives us
    	// this info via the auxHolderType
    	String auxHolderClass = ad.getType().getAuxHolderClass();
    	
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

		if (ad.getType().getIsRefType()){
//		    @SuppressWarnings("unchecked")
//		    public Iterator<AttributeDefinition> getMustParm(){
//		        DmcAttribute attr = (DmcTypeAttributeDefinitionREF) mycore.get(ActionDefinitionDMO._mustParm);
//		        if (attr == null)
//		            return(null);
//
//		        ArrayList<AttributeDefinition> refs = (ArrayList<AttributeDefinition>) attr.getAuxData();
//
//		        if (refs == null)
//		            return(null);
//
//		        return(refs.iterator());
//		    }
			
	    	sb.append("    /**\n");
			sb.append("     * @returns An Iterator of " + typeName + "DMO objects.\n");
			sb.append("     */\n");
			sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    public Iterator<" + auxHolderClass + "> get" + functionName + "(){\n");
			sb.append("        DmcAttribute attr = mycore.get(" + cd.getName() + "DMO._" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("        \n");
			sb.append("        ArrayList<" + auxHolderClass + "> refs = (ArrayList<" + auxHolderClass + ">) attr.getAuxData();\n");
			sb.append("        \n");
			sb.append("        if (refs == null)\n");
			sb.append("            return(null);\n");
			sb.append("        \n");
			sb.append("        return(refs.iterator());\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// adder

//		    @SuppressWarnings("unchecked")
//		    public DmcAttribute addMustParm(AttributeDefinition value) throws DmcValueException {
//		        DmcAttribute attr = mycore.addMustParm(value.getDmcObject());
//		        ArrayList<AttributeDefinition> refs = (ArrayList<AttributeDefinition>) attr.getAuxData();
//		        
//		        if (refs == null){
//		            refs = new ArrayList<AttributeDefinition>();
//		            attr.setAuxData(refs);
//		        }
//		        refs.add(value);
//		        return(attr);
//		    }
			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    public DmcAttribute add" + functionName + "(" + auxHolderClass + " value) throws DmcValueException {\n");
	    	sb.append("        DmcAttribute attr = mycore.add" + functionName + "(value.getDmcObject());\n");
	    	sb.append("        ArrayList<" + auxHolderClass + "> refs = (ArrayList<" + auxHolderClass + ">) attr.getAuxData();\n");
	    	sb.append("        \n");
	    	sb.append("        if (refs == null){\n");
	    	sb.append("            refs = new ArrayList<" + auxHolderClass + ">();\n");
	    	sb.append("            attr.setAuxData(refs);\n");
	    	sb.append("        }\n");
	    	sb.append("        refs.add(value);\n");
	    	sb.append("        return(attr);\n");
			sb.append("    }\n\n");

		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @returns An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
			sb.append("        return(mycore.get" + functionName + "());\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// adder

			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    public void add" + functionName + "(Object value) throws DmcValueException {\n");
	    	sb.append("        mycore.add" + functionName + "(value);\n");
			sb.append("    }\n\n");
		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		sb.append("    /**\n");
		sb.append("     * Deletes a " + ad.getName() + " value.\n");
		sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
		sb.append("     */\n");
		sb.append("    public void del" + functionName + "(Object value){\n");
		sb.append("        mycore.del" + functionName + "(value);\n");
		sb.append("    }\n\n");

		
	}



}
