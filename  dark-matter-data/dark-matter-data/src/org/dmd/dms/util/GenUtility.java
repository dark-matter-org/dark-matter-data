//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import org.dmd.dmc.types.StringName;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.MetaSchema;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.util.exceptions.DebugInfo;

public class GenUtility {
	
	static public boolean 							anyMVAttributes;
	static public boolean							anySVAttributes;
	static public StringBuffer						attributeInfo;
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
	
    static public void appendAttributeInfo(StringBuffer out, String n, int ID, String t, ValueTypeEnum vte, String opt){
    	out.append("    public final static DmcAttributeInfo __" + n + " = new DmcAttributeInfo(");
    	out.append("\"" + n + "\",");
    	out.append(ID + ",");
    	out.append("\"" + t + "\",");
		out.append("ValueTypeEnum." + vte.toString() + ",");
    	out.append(opt + ");\n");

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
		TreeMap<StringName,TypeDefinition>	types = new TreeMap<StringName,TypeDefinition>();
		
		anyMVAttributes = false;
		anySVAttributes	= false;
		attributeInfo 	= new StringBuffer();
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
				
				switch(ad.getValueType()){
				case SINGLE:
					anySVAttributes = true;
					break;
				case MULTI:
				case HASHMAPPED:
				case SORTMAPPED:
				case HASHSET:
				case TREESET:
					anyMVAttributes = true;
					needJavaUtil = true;
					break;
				}

//				if (ad.getIsMultiValued()){
//					anyMVAttributes = true;
//					needJavaUtil = true;
//				}
//				else{
//					anySVAttributes = true;
//				}
				// Add this attribute to our static names
//				attributeInfo.append("    public final static String _" + ad.getName() + " = \"" + ad.getName() + "\";\n");
				
				appendAttributeInfo(attributeInfo, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), "true");
				
				allAttr.add(ad);
			}
		}
		
		if (must != null){
			anyAttributes = true;
			while(must.hasNext()){
				AttributeDefinition ad = must.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				
				switch(ad.getValueType()){
				case SINGLE:
					anySVAttributes = true;
					break;
				case MULTI:
				case HASHMAPPED:
				case SORTMAPPED:
				case HASHSET:
				case TREESET:
					anyMVAttributes = true;
					needJavaUtil = true;
					break;
				}

//				if (ad.getIsMultiValued()){
//					anyMVAttributes = true;
//					needJavaUtil = true;
//				}
//				else{
//					anySVAttributes = true;
//				}
				
				// Add this attribute to our static names
//				attributeInfo.append("    public final static String _" + ad.getName() + " = \"" + ad.getName() + "\";\n");
				
				appendAttributeInfo(attributeInfo, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), "false");

				allAttr.add(ad);
			}
		}
		
		if (needJavaUtil)
			sb.append("import java.util.*;\n\n");
		
//		if (anyMVAttributes){
//			sb.append("import org.dmd.dms.generated.enums.ModifyTypeEnum;\n");
//			sb.append("import org.dmd.dmc.types.DmcTypeModifier;\n");
//			sb.append("import org.dmd.dmc.types.Modification;\n");
//		}

		if (anyAttributes){
			sb.append("import org.dmd.dmc.DmcAttribute;\n");
			sb.append("import org.dmd.dmc.DmcValueException;\n");
			sb.append("import org.dmd.dmc.DmcAttributeInfo;\n");
			sb.append("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
		}
		
		// If the class is auxiliary, we need the DmcTypeString to manipulate the ocl attribute
		if (cd != null){
			if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
				types.put(new StringName("String"), MetaSchema._String);
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
    	// Try to get the nullReturnValue from the attribute first - and try the type second
    	String nullReturnValue 	= ad.getNullReturnValue();
    	String typeName 		= ad.getType().getName().getNameString();
    	
    	if (ad.getName().getNameString().equals("ipAddr")){
    		DebugInfo.debug(ad.toOIF(15));
    	}
    	
    	if (nullReturnValue == null){
    		nullReturnValue = ad.getType().getNullReturnValue();
    	}
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
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
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    public " + typeName + "DMO get" + functionName + "(){\n");		
				sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
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
				sb.append("    public " + typeName + "REF get" + functionName + "(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
				sb.append("        if (attr == null)\n");
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		    	sb.append("\n");
		    	sb.append("        return(attr.getSV());\n");
		    	sb.append("    }\n\n");
		    	
			}	    	

	    	sb.append("    /**\n");
	    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value " + typeName + "DMO\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public void set" + functionName + "(" + typeName + "DMO value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            attr.set(value);\n");
	    	sb.append("            set(__" + ad.getName() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DmcValueException ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific set() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("    }\n\n");

    	}
    	else{
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + typeName + " get" + functionName + "(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			
	    	if (nullReturnValue == null)
	    		sb.append("            return(null);\n");
	    	else
	    		sb.append("            return(" + nullReturnValue + ");\n");
	
	    	sb.append("\n");
	    	sb.append("        return(attr.getSV());\n");
	    	sb.append("    }\n\n");
	    	
	    	sb.append("    /**\n");
	    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public void set" + functionName + "(" + typeName + " value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            attr.set(value);\n");
	    	sb.append("            set(__" + ad.getName() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DmcValueException ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific set() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("    }\n\n");
	    
    	}
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// setter
    	
    	sb.append("    /**\n");
    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
    	sb.append("     * @param value A value compatible with " + attrType + "\n");
    	sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
    	sb.append("    public void set" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
    	sb.append("        \n");
    	sb.append("        attr.set(value);\n");
    	sb.append("        set(__" + ad.getName() + ",attr);\n");
    	sb.append("    }\n\n");
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(__" + ad.getName() + ");\n");
		sb.append("    }\n\n");
		

	}
	
	static public void formatMV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName().getNameString();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    	}
    	
    	if (ad.getValueType() == ValueTypeEnum.HASHSET){
    		DebugInfo.debug("HASHSET");
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
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public Iterator<" + typeName + "DMO> get" + functionName + "(){\n");			
				sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return( ((List<" + typeName + "DMO>) Collections.EMPTY_LIST).iterator() );\n");
				sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
				
			}
			else{
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public Iterator<" + typeName + "REF> get" + functionName + "(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return( ((List<" + typeName + "REF>) Collections.EMPTY_LIST).iterator() );\n");
				sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
			}
			
	    	sb.append("    /**\n");
	    	sb.append("     * Adds another " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName + "DMO value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            attr.add(value);\n");
	    	sb.append("            add(__" + ad.getName() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DmcValueException ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("        return(attr);\n");
	    	sb.append("    }\n\n");

		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
//			sb.append("            return(Collections.<" + typeName + "> emptyList().iterator());\n");
			sb.append("            return( ((List<" + typeName + ">) Collections.EMPTY_LIST).iterator());\n");
//			sb.append("            return(null);\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
			
	    	sb.append("    /**\n");
	    	sb.append("     * Adds another " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName + " value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            attr.add(value);\n");
	    	sb.append("            add(__" + ad.getName() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DmcValueException ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("        return(attr);\n");
	    	sb.append("    }\n\n");

		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// adder

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value A value compatible with " + typeName + "\n");
		sb.append("     */\n");
//    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public DmcAttribute<?> add" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
    	sb.append("        \n");
    	sb.append("        attr.add(value);\n");
    	sb.append("        add(__" + ad.getName() + ",attr);\n");
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
//		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(Object value){\n");
		    	sb.append("        DmcAttribute<?> attr = del(__" + ad.getName() + ", value);\n");
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
//		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(Object value) throws DmcValueException {\n");
		    	sb.append("        DmcAttribute<?> attr = del(__" + ad.getName() + ", ((DmcNamedObjectIF)value).getObjectName());\n");
//				sb.append("        if (attr == null){\n");
//				sb.append("            DmcTypeModifier mods = getModifier();\n");
//				sb.append("            if (mods != null){\n");
//		    	sb.append("                attr = new " + attrType+ "();\n");
//				sb.append("                attr.setName(__" + ad.getName() + ".name);\n");
//				sb.append("                attr.add(((DmcNamedObjectIF)value).getObjectName());\n");
//				sb.append("                mods.add(new Modification(ModifyTypeEnum.DEL, attr));\n");
//				sb.append("            }\n");
//				sb.append("        }\n");
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
//	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> del" + functionName + "(Object value) throws DmcValueException {\n");
	    	sb.append("        DmcAttribute<?> attr = del(__" + ad.getName() + ", value);\n");
//			sb.append("        if (attr == null){\n");
//			sb.append("            DmcTypeModifier mods = getModifier();\n");
//			sb.append("            if (mods != null){\n");
//	    	sb.append("                attr = new " + attrType+ "(__" + ad.getName() + ");\n");
//			sb.append("                attr.setName(__" + ad.getName() + ".name);\n");
//			sb.append("                attr.add(value);\n");
//			sb.append("                mods.add(new Modification(ModifyTypeEnum.DEL, attr));\n");
//			sb.append("            }\n");
//			sb.append("        }\n");
			sb.append("        return(attr);\n");
//			sb.append("        return(del(_" + ad.getName() + ", value));\n");
			sb.append("    }\n\n");
		}

    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(__" + ad.getName() + ");\n");
		sb.append("    }\n\n");
		
		
	}

	
	static public void formatMAPPED(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName().getNameString();
    	
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
			DebugInfo.debug("*** HashedValues not yet supported for object reference types.");
//	    	sb.append("    /**\n");
//			sb.append("     * @return An Iterator of " + typeName + "DMO objects.\n");
//			sb.append("     */\n");
//			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
//				sb.append("    public Iterator<" + typeName + "DMO> get" + functionName + "(){\n");			
//				sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
//				sb.append("        if (attr == null)\n");
//				sb.append("            return(Collections.<" + typeName + "DMO> emptyList().iterator());\n");
//				sb.append("\n");
//				sb.append("        return(attr.getMV());\n");
//				sb.append("    }\n\n");
//			}
//			else{
//				sb.append("    public Iterator<" + typeName + "REF> get" + functionName + "(){\n");
//				sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
//				sb.append("        if (attr == null)\n");
//				sb.append("            return(Collections.<" + typeName + "REF> emptyList().iterator());\n");
//				sb.append("\n");
//				sb.append("        return(attr.getMV());\n");
//				sb.append("    }\n\n");
//			}
		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
//			sb.append("            return(Collections.<" + typeName + "> emptyList().iterator());\n");
			sb.append("            return( ((List<" + typeName + ">) Collections.EMPTY_LIST).iterator());\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// get by key
		
    	sb.append("    /**\n");
		sb.append("     * @param key The key of the value you want.\n");
		sb.append("     * @return The " + typeName + " associated with the specified key.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public " + typeName + " get" + functionName + "(Object key){\n");
		sb.append("        " + attrType + " attr = (" + attrType + ") get(__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(null);\n");
		sb.append("\n");
		sb.append("        return(attr.getByKey(key));\n");
		sb.append("    }\n\n");
		
    	////////////////////////////////////////////////////////////////////////////////
    	// adder

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value A value compatible with " + typeName + "\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public DmcAttribute<?> add" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
    	sb.append("        \n");
    	sb.append("        attr.add(value);\n");
    	sb.append("        add(__" + ad.getName() + ",attr);\n");
    	sb.append("        return(attr);\n");
		sb.append("    }\n\n");

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value " + typeName + "\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName+ " value) {\n");
    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
    	sb.append("        \n");
    	sb.append("        try{\n");
    	sb.append("            attr.add(value);\n");
    	sb.append("            add(__" + ad.getName() + ",attr);\n");
    	sb.append("        }\n");
    	sb.append("        catch(DmcValueException ex){\n");
    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
    	sb.append("        }\n");
    	sb.append("        return(attr);\n");
		sb.append("    }\n\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		if (ad.getType().getIsRefType()){
			DebugInfo.debug("*** HashedValues not yet supported for object reference types.");
//			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
//				sb.append("    /**\n");
//				sb.append("     * Deletes a " + ad.getName() + " value.\n");
//				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
//				sb.append("     */\n");
//		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
//				sb.append("    public DmcAttribute del" + functionName + "(Object value){\n");
//		    	sb.append("        DmcAttribute attr = del(__" + ad.getName() + ", value);\n");
//				sb.append("        return(attr);\n");
//				sb.append("    }\n\n");
//			}
//			else{
//				sb.append("    /**\n");
//				sb.append("     * Deletes a " + ad.getName() + " value.\n");
//				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
//				sb.append("     */\n");
//		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
//				sb.append("    public DmcAttribute del" + functionName + "(Object value) throws DmcValueException {\n");
//		    	sb.append("        DmcAttribute attr = del(__" + ad.getName() + ", ((DmcNamedObjectIF)value).getObjectName());\n");
//				sb.append("        if (attr == null){\n");
//				sb.append("            DmcTypeModifier mods = getModifier();\n");
//				sb.append("            if (mods != null){\n");
//		    	sb.append("                attr = new " + attrType+ "();\n");
//				sb.append("                attr.setName(__" + ad.getName() + ".name);\n");
//				sb.append("                attr.add(((DmcNamedObjectIF)value).getObjectName());\n");
//				sb.append("                mods.add(new Modification(ModifyTypeEnum.DEL, attr));\n");
//				sb.append("            }\n");
//				sb.append("        }\n");
//				sb.append("        return(attr);\n");
//				sb.append("    }\n\n");
//			}
		}
		else{
			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param key The key of the " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
//	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> del" + functionName + "(Object key) throws DmcValueException {\n");
	    	sb.append("        DmcAttribute<?> attr = del(__" + ad.getName() + ", key);\n");
//			sb.append("        if (attr == null){\n");
//			sb.append("            DmcTypeModifier mods = getModifier();\n");
//			sb.append("            if (mods != null){\n");
//	    	sb.append("                attr = new " + attrType+ "();\n");
//			sb.append("                attr.setName(__" + ad.getName() + ".name);\n");
//			sb.append("                attr.add(key);\n");
//			sb.append("                mods.add(new Modification(ModifyTypeEnum.DEL, attr));\n");
//			sb.append("            }\n");
//			sb.append("        }\n");
			sb.append("        return(attr);\n");
			sb.append("    }\n\n");
		}

    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(__" + ad.getName() + ");\n");
		sb.append("    }\n\n");
		
		
	}

	static public String capTheName(String value){
    	StringBuffer 	name 	= new StringBuffer();
    	name.append(value);
    	name.setCharAt(0,Character.toUpperCase(name.charAt(0)));
    	return(name.toString());
	}
	
	static public void dumpIterable(String dmwdir, String basePackage, String typeImport, String typeName, String fileHeader, PrintStream progress) throws IOException {
		
		String ofn = dmwdir + File.separator + typeName + "IterableDMW.java";
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.dmw;\n\n");
        
        out.write("import java.util.Iterator;\n\n");
        out.write("import org.dmd.dmw.DmwMVIterator;\n");
        out.write("import " + typeImport + ";\n");
                 	                
        out.write("/**\n");
        out.write(" * The " + typeName + "IterableDMW wraps an Iterator for a particular type and makes \n");
        out.write(" * it Iterable.\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
        
        
        out.write("public class " + typeName + "IterableDMW extends DmwMVIterator<" + typeName + "> {\n");
        out.write("\n");
        out.write("    public final static " + typeName + "IterableDMW emptyList = new " + typeName + "IterableDMW();\n");
        out.write("\n");
        out.write("    protected " + typeName + "IterableDMW(){\n");
        out.write("        super();\n");
        out.write("    }\n");
        out.write("\n");
        out.write("    public " + typeName + "IterableDMW(Iterator<" + typeName + "> it){\n");
        out.write("        super(it);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("}\n\n");
        
        out.close();

	}


}
