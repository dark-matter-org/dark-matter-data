package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dms.ComplexTypeDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.TypeDefinitionDMO;
import org.dmd.dms.generated.types.Field;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;

public class ComplexTypeFormatter {
	
	public static void dumpComplexTypes(String fileHeader, SchemaDefinition sd, String typedir) throws IOException, ResultException{
		for(ComplexTypeDefinition ctd: sd.getComplexTypeDefList()){
			dumpComplexType(fileHeader,typedir,ctd);
		}
	}

    static void dumpComplexType(String header, String od, ComplexTypeDefinition ctd) throws IOException, ResultException {
    	String 			ctn 			= ctd.getName().getNameString();
    	String 			fieldSeparator 	= ctd.getFieldSeparator();
        Iterator<Field>	fields 			= null;
    	
    	if (fieldSeparator == null)
    		fieldSeparator = " ";
    	
    	
//        BufferedWriter out = new BufferedWriter(new FileWriter(od + "/" + ctn + ".java"));
        BufferedWriter out = FileUpdateManager.instance().getWriter(od, ctn + ".java");
        
//DebugInfo.debug("Generating: " + od + File.separator + ctn + ".java");
        
        fields = ctd.getField();
        
        // Determine if we have any reference fields
        boolean hasRefs = false;
        ArrayList<String> refFields = new ArrayList<String>();
        while(fields.hasNext()){
        	Field field = fields.next();
        	TypeDefinitionDMO type = field.getType().getObject();
        	
        	if (type == null){
        		DebugInfo.debug("Unknown type in ComplexTypeDefinition: " + field.getType().getObjectName());
        		System.exit(1);
        	}

        	if (type.getIsRefType()){
        		hasRefs = true;
        		refFields.add(field.getName());
        	}
        }
        
        out.write(header);
        out.write("package " + ctd.getDefinedIn().getSchemaPackage() + ".generated.types;\n\n");

        out.write("import java.io.Serializable;\n");
        out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
        out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");
        out.write("import org.dmd.dmc.types.IntegerVar;\n");
        
        if (hasRefs){
          	out.write("import org.dmd.dmc.DmcNameResolverIF;\n");
          	out.write("import org.dmd.dmc.DmcNamedObjectIF;\n");
          	out.write("import org.dmd.dmc.DmcNamedObjectREF;\n");
          	out.write("import org.dmd.dmc.DmcContainerIF;\n");
        }

//        out.write("import org.dmd.dmc.DmcAttribute;\n");
//        out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
        out.write("import org.dmd.dmc.DmcValueException;\n\n");
        
        out.write(getComplexTypeImports(ctd));
        
        out.write("@SuppressWarnings(\"serial\")\n");

        out.write("/**\n * The " + ctn + " class.\n");
        out.write(" * This code was auto-generated and shouldn't be alterred manually.\n");
        out.write(" * \n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");

        out.write("public class " + ctn + " implements Serializable {\n\n");
        
        out.write(getComplexTypeFieldInstances(ctd));
        	
        out.write("    /**\n");
        out.write("     * Default constructor.\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(){\n");
    	out.write("    }\n\n");
        		            	
        out.write("    /**\n");
        out.write("     * Copy constructor.\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(" + ctn + " original){\n");
        fields = ctd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	out.write("        " + field.getName() + " = original." + field.getName() + ";\n");
        }
    	out.write("    }\n\n");
        
    	
        out.write("    /**\n");
        out.write("     * All fields constructor.\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(");
        int fnum = 1;
        fields = ctd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	out.write(field.getType().getObjectName() + " f" + fnum);

        	fnum++;
        	if (fnum <= ctd.getFieldSize())
        		out.write(", ");
        }
        
        out.write(") throws DmcValueException {\n");
        fnum = 1;
        fields = ctd.getField();
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
        out.write("     */\n");
        out.write("    public " + ctn + "(String input) throws DmcValueException {\n");
        out.write("        IntegerVar seppos = new IntegerVar(-1);\n");
        fnum = 1;
        fields = ctd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	TypeDefinition	type = (TypeDefinition) field.getType().getObject().getContainer();
        	String REF = "";
        	if (type.getIsRefType())
        		REF = "REF";
        	
        	if (fnum == ctd.getFieldSize())
            	out.write("        " + field.getName() + " = DmcType" + field.getType().getObjectName() + REF + "STATIC.instance.typeCheck(getNextField(input,seppos,\"" + field.getName() + "\",true));\n");
            else
        		out.write("        " + field.getName() + " = DmcType" + field.getType().getObjectName() + REF + "STATIC.instance.typeCheck(getNextField(input,seppos,\"" + field.getName() + "\",false));\n");
            
        	fnum++;
        }
    	out.write("    }\n\n");
    	
    	
        out.write("    /**\n");
        out.write("     * Serialization.\n");
        out.write("     */\n");
        out.write("    public void serializeIt(DmcOutputStreamIF dos) throws Exception {\n");
        fields = ctd.getField();
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
        out.write("     */\n");
        out.write("    public void deserializeIt(DmcInputStreamIF dis) throws Exception {\n");
        fields = ctd.getField();
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
        fields = ctd.getField();
        while(fields.hasNext()){
        	Field field = fields.next();
        	out.write(field.getName() + ".toString()");
        	if (fnum < ctd.getFieldSize())
        		out.write(" + \"" + fieldSeparator + "\" + ");
        	fnum++;
        }
        out.write(");\n");
    	out.write("    }\n\n");
    	
        fields = ctd.getField();
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
        
        GenUtility.dumpComplexTypeDmcType(header, ctd.getDefinedIn().getSchemaPackage(), od, ctn, hasRefs);

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
    

}
