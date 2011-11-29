package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.types.StringName;
import org.dmd.dms.ComplexTypeDefinition;
import org.dmd.dms.ExtendedReferenceTypeDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.TypeDefinitionDMO;
import org.dmd.dms.generated.types.DmcTypeStringNameSTATIC;
import org.dmd.dms.generated.types.DmcTypeStringNameSV;
import org.dmd.dms.generated.types.Field;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;

public class ExtendedReferenceTypeFormatter {

	public static void dumpExtendedReferenceTypes(String fileHeader, SchemaDefinition sd, String typedir) throws IOException, ResultException{
		for(ExtendedReferenceTypeDefinition ctd: sd.getExtendedReferenceTypeDefList()){
			dumpExtendedReferenceType(fileHeader,typedir,ctd);
		}
	}

    static void dumpExtendedReferenceType(String header, String od, ExtendedReferenceTypeDefinition ertd) throws IOException, ResultException {
    	String 			ctn 			= ertd.getName().getNameString();
    	String 			fieldSeparator 	= ertd.getFieldSeparator();
        Iterator<Field>	fields 			= null;
        ImportManager	imports			= new ImportManager();
        
    	if (fieldSeparator == null)
    		fieldSeparator = " ";
    	
    	if (header == null)
    		header = "";
    	
//        BufferedWriter out = new BufferedWriter(new FileWriter(od + "/" + ctn + ".java"));
        BufferedWriter out = FileUpdateManager.instance().getWriter(od, ctn + ".java");
        
DebugInfo.debug("Generating: " + od + "/" + ctn + ".java");
        
        fields = ertd.getField();
        
        // Determine if we have any reference fields
        boolean hasRefs = false;
        ArrayList<String> refFields = new ArrayList<String>();
        while(fields.hasNext()){
        	Field field = fields.next();
        	TypeDefinitionDMO type = field.getType().getObject();
        	
        	if (type == null){
        		DebugInfo.debug("Unknown type in ExtendedReferenceTypeDefinition: " + field.getType().getObjectName());
        		System.exit(1);
        	}

        	if (type.getIsRefType()){
        		hasRefs = true;
        		refFields.add(field.getName());
        	}
        }
        
        out.write(header);
        
        out.write("package " + ertd.getDefinedIn().getSchemaPackage() + ".generated.types;\n\n");
        
      	String nameBaseImport = ertd.getExtendedReferenceClass().getIsNamedBy().getType().getDefinedIn().getSchemaPackage() + ".generated.types.DmcType";
      	String nameImport = ertd.getExtendedReferenceClass().getIsNamedBy().getType().getName().getNameString() + "SV";
      	String staticNameType = ertd.getExtendedReferenceClass().getIsNamedBy().getType().getName().getNameString() + "STATIC";

      	imports.addImport(nameBaseImport + nameImport, "Name type");
      	imports.addImport(ertd.getExtendedReferenceClass().getIsNamedBy().getType().getPrimitiveType(), "Name type");
      	
      	imports.addImport(nameBaseImport + staticNameType, "Static type for name");

//        out.write("import java.io.Serializable;\n");
//        out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
//        out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");
//        out.write("import org.dmd.dmc.types.IntegerVar;\n");
        
        imports.addImport("java.io.Serializable", "Serialization support");
        imports.addImport("org.dmd.dmc.DmcInputStreamIF", "Serialization support");
        imports.addImport("org.dmd.dmc.DmcOutputStreamIF", "Serialization support");
        imports.addImport("org.dmd.dmc.types.IntegerVar", "Parsing support");
        
        if (hasRefs){
//          	out.write("import org.dmd.dmc.DmcNameResolverIF;\n");
//          	out.write("import org.dmd.dmc.DmcNamedObjectIF;\n");
//          	out.write("import org.dmd.dmc.DmcNamedObjectREF;\n");
//          	out.write("import org.dmd.dmc.DmcContainerIF;\n");
          	
            imports.addImport("org.dmd.dmc.DmcNameResolverIF", "Object reference support");
            imports.addImport("org.dmd.dmc.DmcNamedObjectIF", "Object reference support");
            imports.addImport("org.dmd.dmc.DmcNamedObjectREF", "Object reference support");
            imports.addImport("org.dmd.dmc.DmcContainerIF", "Object reference support");
        }

//        out.write("import org.dmd.dmc.DmcValueException;\n\n");
        
        imports.addImport("org.dmd.dmc.DmcValueException", "Value exceptions");
        
//        out.write(getComplexTypeImports(ertd));
        
        getComplexTypeImports(ertd, imports);
        
        out.write(imports.getFormattedImports() + "\n\n");
        
        out.write("@SuppressWarnings(\"serial\")\n");

        out.write("/**\n * The " + ctn + " class.\n");
        out.write(" * This code was auto-generated and shouldn't be alterred manually.\n");
        out.write(" * \n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");

        out.write("public class " + ctn + " extends " + ertd.getExtendedReferenceClass().getName() + "REF implements Serializable {\n\n");
        
        out.write(getComplexTypeFieldInstances(ertd));
        	
        out.write("    /**\n");
        out.write("     * Default constructor.\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(){\n");
    	out.write("    }\n\n");
        		            	
        out.write("    /**\n");
        out.write("     * Copy constructor.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(" + ctn + " original){\n");
        out.write("        myName = original.myName;\n");
        out.write("        object = original.object;\n");
        fields = ertd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	out.write("        " + field.getName() + " = original." + field.getName() + ";\n");
        }
    	out.write("    }\n\n");
        
    	String nametype = ertd.getExtendedReferenceClass().getIsNamedBy().getType().getName().getNameString();
    	String attrName = ertd.getExtendedReferenceClass().getIsNamedBy().getName().getNameString();
    	
        out.write("    /**\n");
        out.write("     * All fields constructor.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(" + nametype + " n, ");
        int fnum = 1;
        fields = ertd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	out.write(field.getType().getObjectName() + " f" + fnum);

        	fnum++;
        	if (fnum <= ertd.getFieldSize())
        		out.write(", ");
        }
        
        out.write(") throws DmcValueException {\n");
        out.write("        super(n);\n");
        fnum = 1;
        fields = ertd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	TypeDefinition	type = (TypeDefinition) field.getType().getObject().getContainer();
        	
        	if (type.getIsRefType()){
        		out.write("        " + field.getName() + " = DmcType" + field.getType().getObjectName() + "REFSTATIC.instance.typeCheck(f" + fnum + ");\n");
        	}
        	else{
        		out.write("        " + field.getName() + " = DmcType" + field.getType().getObjectName() + "STATIC.instance.typeCheck(f" + fnum + ");\n");
        	}
        	fnum++;
        }
    	out.write("    }\n\n");
    	
        out.write("    /**\n");
        out.write("     * String based constructor.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(String input) throws DmcValueException {\n");
        out.write("        IntegerVar seppos = new IntegerVar(-1);\n");
        
        out.write("        " + nametype + " n = DmcType" + nametype + "STATIC.instance.typeCheck(getNextField(input,seppos,\"object name\",false));\n");
        out.write("        myName = new DmcType" + nametype + "SV(__" + attrName + ");\n");
        out.write("        myName.set(n);\n\n");
        
//        StringName n = DmcTypeStringNameSTATIC.instance.typeCheck(getNextField(input,seppos,"object name",false));
//        myName = new DmcTypeStringNameSV(__name);
//        myName.set(n);

        fnum = 1;
        fields = ertd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	TypeDefinition	type = (TypeDefinition) field.getType().getObject().getContainer();
        	String REF = "";
        	if (type.getIsRefType())
        		REF = "REF";
        	
        	if (fnum == ertd.getFieldSize())
            	out.write("        " + field.getName() + " = DmcType" + field.getType().getObjectName() + REF + "STATIC.instance.typeCheck(getNextField(input,seppos,\"" + field.getName() + "\",true));\n");
            else
        		out.write("        " + field.getName() + " = DmcType" + field.getType().getObjectName() + REF + "STATIC.instance.typeCheck(getNextField(input,seppos,\"" + field.getName() + "\",false));\n");
            
        	fnum++;
        }
    	out.write("    }\n\n");
    	
    	
        out.write("    /**\n");
        out.write("     * Serialization.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("     */\n");
        out.write("    public void serializeIt(DmcOutputStreamIF dos) throws Exception {\n");
        out.write("        DmcType" + nametype + "STATIC.instance.serializeValue(dos, myName.getSV());\n");
        fields = ertd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	TypeDefinition	type = (TypeDefinition) field.getType().getObject().getContainer();
        	
        	if (type.getIsRefType())
            	out.write("        DmcType" + field.getType().getObjectName() + "REFSTATIC.instance.serializeValue(dos, " + field.getName() + ");\n");
        	else
        		out.write("        DmcType" + field.getType().getObjectName() + "STATIC.instance.serializeValue(dos, " + field.getName() + ");\n");
        }
    	out.write("    }\n\n");
    	
        out.write("    /**\n");
        out.write("     * Deserialization.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("     */\n");
        out.write("    public void deserializeIt(DmcInputStreamIF dis) throws Exception {\n");
        out.write("        " + nametype + " n = DmcType" + nametype + "STATIC.instance.deserializeValue(dis);\n");
        out.write("        myName = new DmcType" + nametype + "SV(__" + attrName + ");\n");
        out.write("        myName.set(n);\n\n");
        
        fields = ertd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	TypeDefinition	type = (TypeDefinition) field.getType().getObject().getContainer();
        	
        	if (type.getIsRefType())
            	out.write("        " + field.getName() + " = DmcType" + field.getType().getObjectName() + "REFSTATIC.instance.deserializeValue(dis);\n");
        	else
        		out.write("        " + field.getName() + " = DmcType" + field.getType().getObjectName() + "STATIC.instance.deserializeValue(dis);\n");
        }
    	out.write("    }\n\n");
    	
        out.write("    /**\n");
        out.write("     * String form.\n");
        out.write("     */\n");
        out.write("    public String toString(){\n");
        fnum = 1;
        out.write("        return(");
        out.write("myName.getSV().getNameString()");
        if (ertd.getFieldSize() > 0)
        	out.write(" + \"" + fieldSeparator + "\" + ");

        fields = ertd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	out.write(field.getName() + ".toString()");
        	if (fnum < ertd.getFieldSize())
        		out.write(" + \"" + fieldSeparator + "\" + ");
        	fnum++;
        }
        out.write(");\n");
    	out.write("    }\n\n");
    	
        fields = ertd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	TypeDefinition	type = (TypeDefinition) field.getType().getObject().getContainer();
        	
        	if (type.getIsRefType())
                out.write("    public " + field.getType().getObjectName() + "REF get" + GenUtility.capTheName(field.getName()) + "(){\n");
        	else
        		out.write("    public " + field.getType().getObjectName() + " get" + GenUtility.capTheName(field.getName()) + "(){\n");
        	
        	out.write("        return(" + field.getName() + ");\n");
        	out.write("    }\n\n");
        }
        
        if (hasRefs){
        	out.write("    @SuppressWarnings(\"unchecked\")\n");
            out.write("    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {\n");
        	out.write("        DmcNamedObjectIF  obj = null;\n\n");
            
            for(String fn: refFields){
            	out.write("        obj = resolver.findNamedObject(" + fn + ".getObjectName());\n");
            	out.write("        if (obj == null)\n");
            	out.write("            throw(new DmcValueException(\"Could not resolve reference to: \" + " + fn + ".getObjectName() + \" via attribute: \" + attrName));\n");
            	out.write("        \n");
            	out.write("        if (obj instanceof DmcContainerIF)\n");
            	out.write("            ((DmcNamedObjectREF)" + fn + ").setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());\n");
            	out.write("        else\n");
            	out.write("            ((DmcNamedObjectREF)" + fn + ").setObject(obj);\n");
            	out.write("        \n");
            }

        	out.write("    }\n\n");
        }
    	
    	out.write("    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {\n");
    	out.write("    	   String rc = null;\n");
    	out.write("    	   int start = seppos.intValue();\n");
    	out.write("\n");
    	out.write("    	   if ( (start+1) >= input.length())\n");
	    out.write("    		   throw (new DmcValueException(\"Missing value for field: \" + fn + \" in complex type: " + ctn + "\"));\n");
    	out.write("\n");
    	out.write("    	   if (last){\n");
	    out.write("    	       rc = input.substring(start+1);\n");
	    out.write("    	   }\n");
	    out.write("    	   else{\n");
    	out.write("    	       int pos = -1;\n");
    	out.write("    	       if (start > 0)\n");
    	out.write("    		       pos = input.indexOf(\"" + fieldSeparator + "\", start+1);\n");
    	out.write("    	       else\n");
    	out.write("    		       pos = input.indexOf(\"" + fieldSeparator + "\");\n");
    	out.write("\n");
    	out.write("    	       if (pos == -1)\n");
    	out.write("    		       throw (new DmcValueException(\"Missing value for field: \" + fn + \" in complex type: " + ctn + "\"));\n");
    	out.write("\n");
    	out.write("    		   while(pos < (input.length()-1)){\n");
    	out.write("    		       if ( input.charAt(pos+1) == '" + fieldSeparator + "')\n");
    	out.write("    		           pos++;\n");
    	out.write("    		       else\n");
    	out.write("    		           break;\n");
    	out.write("    		   }\n");
    	out.write("\n");
    	out.write("    	       rc = input.substring(start+1, pos).trim();\n");
    	out.write("\n");
    	out.write("    	       seppos.set(pos);\n");
    	out.write("        }\n");
    	out.write("\n");
    	out.write("        return(rc);\n");
    	out.write("    }\n\n");

        		            	
        out.write("}\n");

        out.close();
        
        GenUtility.dumpComplexTypeDmcType(header, ertd.getDefinedIn().getSchemaPackage(), od, ctn, hasRefs);

    }
    
    static String getComplexTypeFieldInstances(ComplexTypeDefinition ctd){
    	StringBuffer sb = new StringBuffer();
    	
    	Iterator<Field> fields = ctd.getField();
    	while(fields.hasNext()){
    		Field field = fields.next();
        	TypeDefinition	type = (TypeDefinition) field.getType().getObject().getContainer();
    		sb.append("    // " + field.getDescription() + "\n");
    		
    		if (type.getIsRefType())
        		sb.append("    " + field.getType().getObjectName() + "REF " + field.getName() + ";\n\n");
    		else
    			sb.append("    " + field.getType().getObjectName() + " " + field.getName() + ";\n\n");
    	}
    	
    	return(sb.toString());
    }
    

    
    static String getComplexTypeImports(ComplexTypeDefinition ctd) throws ResultException{
    	StringBuffer sb = new StringBuffer();
    	Iterator<Field>	fields = ctd.getField();
    	// Key:   import
    	// Value: comment
    	TreeMap<String,String>	uniqueImports = new TreeMap<String, String>();
    	
    	while(fields.hasNext()){
    		Field field = fields.next();
//    		DebugInfo.debug("field type = " + field.getType().getObjectName());
    		
        	TypeDefinition	type = (TypeDefinition) field.getType().getObject().getContainer();
        	
        	String primitiveType = type.getPrimitiveType();
        	
        	if (type.getInternallyGenerated()){
        		if (type.getIsEnumType()){
//        			System.out.println(type);
//        			DebugInfo.debug("Need enum code");
//        			System.exit(1);
        		}
        		else{
//        			System.out.println("ORIGINAL CLASS:\n" + type.getOriginalClass());
        			
        			uniqueImports.put(type.getOriginalClass().getJavaClass(), "Object reference");
        			uniqueImports.put(type.getOriginalClass().getDmtREFImport(), "Object reference");
        			
        			
//        			DebugInfo.debug("Need object reference code");
//        			System.exit(1);
        		}
        	}
        	
//        	DebugInfo.debug("\n" + type.toOIF());
        	
        	if (primitiveType == null){
//    			DebugInfo.debug("Couldn't get primitive type");
//    			System.exit(1);
        	}
        	else{
        		if (!type.getIsRefType())
        			uniqueImports.put(primitiveType, "Primitive type");
        	}
        	
        	if (type.getTypeClassName() != null){
        		String sp = type.getDefinedIn().getSchemaPackage();
        		String imp = null;
        		String comment = "";
//        		String imp = sp + ".generated.types.DmcType" + type.getName() + "STATIC";
        		if (type.getInternallyGenerated()){
        			imp = type.getTypeClassName() + "STATIC";
        			comment = "Internally generated type";
        		}
        		else{
        			imp = sp + ".generated.types.DmcType" + type.getName() + "STATIC";
        			comment = "Standard type";
        		}
        		
        		uniqueImports.put(imp,comment);
        	}
        	
    	}
    	
    	int longest = 0;
    	for(String importStr: uniqueImports.keySet()){
    		if (importStr.length() > longest)
    			longest = importStr.length();
    	}
		int padding = longest+17;
		PrintfFormat format = new PrintfFormat("%-" + padding + "s");
    	
        for(String importStr: uniqueImports.keySet()){
    		String comment = uniqueImports.get(importStr);
//    		sb.append("import " + importStr + "; // " + comment + "\n");
			sb.append(format.sprintf("import " + importStr + ";") + "// " + comment + "\n");
    	}
    	sb.append("\n");
    	
    	return(sb.toString());
    }
    
    static void getComplexTypeImports(ComplexTypeDefinition ctd, ImportManager imports) throws ResultException{
//    	StringBuffer sb = new StringBuffer();
    	Iterator<Field>	fields = ctd.getField();
    	// Key:   import
    	// Value: comment
//    	TreeMap<String,String>	uniqueImports = new TreeMap<String, String>();
    	
    	while(fields.hasNext()){
    		Field field = fields.next();
//    		DebugInfo.debug("field type = " + field.getType().getObjectName());
    		
        	TypeDefinition	type = (TypeDefinition) field.getType().getObject().getContainer();
        	
        	String primitiveType = type.getPrimitiveType();
        	
        	if (type.getInternallyGenerated()){
        		if (type.getIsEnumType()){
//        			System.out.println(type);
//        			DebugInfo.debug("Need enum code");
//        			System.exit(1);
        		}
        		else{
//        			System.out.println("ORIGINAL CLASS:\n" + type.getOriginalClass());
        			
//        			uniqueImports.put(type.getOriginalClass().getJavaClass(), "Object reference");
//        			uniqueImports.put(type.getOriginalClass().getDmtREFImport(), "Object reference");
        			
          			imports.addImport(type.getOriginalClass().getJavaClass(), "References to " + type.getOriginalClass().getName());
          			imports.addImport(type.getOriginalClass().getDmtREFImport(), "References to " + type.getOriginalClass().getName());
          		        			
        			
//        			DebugInfo.debug("Need object reference code");
//        			System.exit(1);
        		}
        	}
        	
//        	DebugInfo.debug("\n" + type.toOIF());
        	
        	if (primitiveType == null){
//    			DebugInfo.debug("Couldn't get primitive type");
//    			System.exit(1);
        	}
        	else{
        		if (!type.getIsRefType()){
        			imports.addImport(primitiveType, "Primitive type");
//        			uniqueImports.put(primitiveType, "Primitive type");
        		}
        	}
        	
        	if (type.getTypeClassName() != null){
        		String sp = type.getDefinedIn().getSchemaPackage();
        		String imp = null;
        		String comment = "";
//        		String imp = sp + ".generated.types.DmcType" + type.getName() + "STATIC";
        		if (type.getInternallyGenerated()){
        			imp = type.getTypeClassName() + "STATIC";
        			comment = "Internally generated type";
        		}
        		else{
        			imp = sp + ".generated.types.DmcType" + type.getName() + "STATIC";
        			comment = "Standard type";
        		}
        		
//        		uniqueImports.put(imp,comment);
        		imports.addImport(imp, comment);
        	}
        	
    	}
    	
//    	int longest = 0;
//    	for(String importStr: uniqueImports.keySet()){
//    		if (importStr.length() > longest)
//    			longest = importStr.length();
//    	}
//		int padding = longest+17;
//		PrintfFormat format = new PrintfFormat("%-" + padding + "s");
//    	
//        for(String importStr: uniqueImports.keySet()){
//    		String comment = uniqueImports.get(importStr);
////    		sb.append("import " + importStr + "; // " + comment + "\n");
//			sb.append(format.sprintf("import " + importStr + ";") + "// " + comment + "\n");
//    	}
//    	sb.append("\n");
//    	
//    	return(sb.toString());
    }
    

}
