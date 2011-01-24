package org.dmd.dms.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.Modification;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.MetaSchema;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.ModifyTypeEnum;

public class GenUtility {
	
	static public boolean 							anyMVAttributes;
	static public boolean							anySVAttributes;
	static public StringBuffer						staticNames;
	static public ArrayList<AttributeDefinition>	allAttr;

	static public String getImports(ActionDefinition ad){
		StringBuffer 	sb 	= new StringBuffer();
		getImports(sb,ad,ad.getMustParm(),ad.getMayParm());
		
		sb.append("\n");

		return(sb.toString());
	}
	
	static public String getImports(ClassDefinition cd){
		StringBuffer 	sb 	= new StringBuffer();
		getImports(sb, cd, cd.getMust(),cd.getMay());
		
		sb.append("\n");
		
		if (cd.getDerivedFrom() == null){
			sb.append("// import 5\n");
			if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
				sb.append("import org.dmd.dmc.DmcObject;\n");
			}
			else{
				sb.append("import org.dmd.dms.generated.dmo.DmwWrapperDMO;\n");
			}
			
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
	
	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd
	 * @return
	 */
	static void getImports(StringBuffer sb, DmsDefinition def, Iterator<AttributeDefinition> must, Iterator<AttributeDefinition> may){
		ClassDefinition	cd 				= null;
		boolean			needJavaUtil	= false;
		boolean			anyAttributes	= false;
		TreeMap<String,TypeDefinition>	types = new TreeMap<String,TypeDefinition>();
		
		anyMVAttributes = false;
		anySVAttributes	= false;
		staticNames 	= new StringBuffer();
		allAttr 		= new ArrayList<AttributeDefinition>();
		
		if (def instanceof ClassDefinition){
			cd = (ClassDefinition) def;
		}

		//		if (cd.getName().equals("DMPMessage")){
//			DebugInfo.debug("\n" + cd.toOIF(15) + "\n");
//		}
		
//		// We add the objectClass attribute and the string type
//		staticNames.append("    public final static String _objectClass =\"objectClass\";\n");
//		TypeDefinition stringType = schema.isType("String");
//		types.put(stringType.getName(), stringType);
		
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
		
		if (anyMVAttributes){
			sb.append("import org.dmd.dms.generated.enums.ModifyTypeEnum;\n");
			sb.append("import org.dmd.dmc.types.DmcTypeModifier;\n");
			sb.append("import org.dmd.dmc.types.Modification;\n");
		}

		if (anyAttributes){
			sb.append("import org.dmd.dmc.DmcAttribute;\n");
			sb.append("import org.dmd.dmc.DmcValueException;\n");
		}
		
		// If the class is auxiliary, we need the DmcTypeString to manipulate the ocl attribute
		if (cd != null){
			if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
				types.put("String", MetaSchema._String);
			}
		}

//DebugInfo.debug("imports for " + cd.getName());

		Iterator<TypeDefinition> t = types.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();

//DebugInfo.debug("\n" + td.toOIF(15));

			if (cd != null){
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
		
	}
	
	static public void formatSV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName 	= ad.getType().getTypeClassName();
    	String attrType 		= "DmcType" + ad.getType().getName();
    	String nullReturnValue 	= ad.getType().getNullReturnValue();
    	String typeName 		= ad.getType().getName();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
//    		typeName = typeName + "REF";
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
		
    	if (ad.getType().getIsRefType()){
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    public " + typeName + "DMO get" + functionName + "(){\n");		
			}
			else{
				sb.append("    public " + typeName + "REF get" + functionName + "(){\n");
			}

			sb.append("        " + attrType + " attr = (" + attrType + ") get(_" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			
	    	if (nullReturnValue == null)
	    		sb.append("            return(null);\n");
	    	else
	    		sb.append("            return(" + nullReturnValue + ");\n");
	
	    	sb.append("\n");
	    	sb.append("        return(attr.getSV());\n");
	    	sb.append("    }\n\n");
    	}
    	else{
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
    	}
    	
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
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(_" + ad.getName() + ");\n");
		sb.append("    }\n\n");
		

	}
	
	static public void formatMV(AttributeDefinition ad, StringBuffer sb){
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

		
		if (ad.getType().getIsRefType()){
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + "DMO objects.\n");
			sb.append("     */\n");
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    public Iterator<" + typeName + "DMO> get" + functionName + "(){\n");			
				sb.append("        " + attrType + " attr = (" + attrType + ") get(_" + ad.getName() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return(Collections.<" + typeName + "DMO> emptyList().iterator());\n");
				sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
			}
			else{
				sb.append("    public Iterator<" + typeName + "REF> get" + functionName + "(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(_" + ad.getName() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return(Collections.<" + typeName + "REF> emptyList().iterator());\n");
				sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
			}
//			sb.append("        " + attrType + " attr = (" + attrType + ") get(_" + ad.getName() + ");\n");
//			sb.append("        if (attr == null)\n");
//			sb.append("            return(Collections.<" + typeName + "> emptyList().iterator());\n");
//			sb.append("            return(null);\n");
//			sb.append("\n");
//			sb.append("        return(attr.getMV());\n");
//			sb.append("    }\n\n");
		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(_" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(Collections.<" + typeName + "> emptyList().iterator());\n");
//			sb.append("            return(null);\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
		}
		
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

		if (ad.getType().getIsRefType()){
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    public DmcAttribute del" + functionName + "(Object value){\n");
		    	sb.append("        DmcAttribute attr = del(_" + ad.getName() + ", value);\n");
//				sb.append("        if (attr == null){\n");
//				sb.append("            DmcTypeModifier mods = getModifier();\n");
//				sb.append("            if (mods != null){\n");
//		    	sb.append("                attr = new " + attrType+ "();\n");
//				sb.append("                attr.setName(_" + ad.getName() + ");\n");
//				sb.append("                attr.add(value);\n");
//				sb.append("                mods.add(new Modification(ModifyTypeEnum.DEL, attr));\n");
//				sb.append("            }\n");
//				sb.append("        }\n");
				sb.append("        return(attr);\n");
//				sb.append("        return(del(_" + ad.getName() + ", value));\n");
				sb.append("    }\n\n");
			}
			else{
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    public DmcAttribute del" + functionName + "(Object value) throws DmcValueException {\n");
		    	sb.append("        DmcAttribute attr = del(_" + ad.getName() + ", ((DmcNamedObjectIF)value).getObjectName());\n");
				sb.append("        if (attr == null){\n");
				sb.append("            DmcTypeModifier mods = getModifier();\n");
				sb.append("            if (mods != null){\n");
		    	sb.append("                attr = new " + attrType+ "();\n");
				sb.append("                attr.setName(_" + ad.getName() + ");\n");
				sb.append("                attr.add(((DmcNamedObjectIF)value).getObjectName());\n");
				sb.append("                mods.add(new Modification(ModifyTypeEnum.DEL, attr));\n");
				sb.append("            }\n");
				sb.append("        }\n");
				sb.append("        return(attr);\n");
//				sb.append("        return(del(_" + ad.getName() + ", ((DmcNamedObjectIF)value).getObjectName()));\n");
				sb.append("    }\n\n");
			}
		}
		else{
			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    public DmcAttribute del" + functionName + "(Object value) throws DmcValueException {\n");
	    	sb.append("        DmcAttribute attr = del(_" + ad.getName() + ", value);\n");
			sb.append("        if (attr == null){\n");
			sb.append("            DmcTypeModifier mods = getModifier();\n");
			sb.append("            if (mods != null){\n");
	    	sb.append("                attr = new " + attrType+ "();\n");
			sb.append("                attr.setName(_" + ad.getName() + ");\n");
			sb.append("                attr.add(value);\n");
			sb.append("                mods.add(new Modification(ModifyTypeEnum.DEL, attr));\n");
			sb.append("            }\n");
			sb.append("        }\n");
			sb.append("        return(attr);\n");
//			sb.append("        return(del(_" + ad.getName() + ", value));\n");
			sb.append("    }\n\n");
		}

    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(_" + ad.getName() + ");\n");
		sb.append("    }\n\n");
		
		
	}

	static public String capTheName(String value){
    	StringBuffer 	name 	= new StringBuffer();
    	name.append(value);
    	name.setCharAt(0,Character.toUpperCase(name.charAt(0)));
    	return(name.toString());
	}

}
