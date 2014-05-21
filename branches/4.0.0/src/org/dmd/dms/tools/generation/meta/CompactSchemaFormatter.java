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
package org.dmd.dms.tools.generation.meta;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.core.feedback.DMFeedback;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.core.util.NamedStringArray;
import org.dmd.dms.shared.types.DefinitionName;
import org.dmd.dms.tools.generation.util.CompactSchemaHelper;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.Manipulator;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.runtime.DebugInfo;

/**
 * The DmoCompactSchemaFormatter is used to generate a compact form of the Dark Matter Schema
 * for use in restricted Java environments, such as GWT.
 */
public class CompactSchemaFormatter {

	PrintStream	progress;
	
	// This value is incremented as we format non-native attributes on extensible classes
	// so that their temporary container attribute instances have unique names.
	int	uniqueNum;
	
	public CompactSchemaFormatter(PrintStream p){
		progress = p;
		uniqueNum = 1;
	}
	
	
	DefinitionName getDefinitionName(String cn, String dn) throws DMFeedbackSet{
		DefinitionName rc = null;
		
		// Note: since the intrinsic checking on DefinitionName was relaxed , we 
		// need to check this manually here.
		if (dn.matches("[a-zA-Z][a-zA-Z0-9_]*")){
		rc = new DefinitionName(dn);
		}
		else{
			DMFeedback error = new DMFeedback("This is not a legal attribute name: " + dn);
			error.addToMessage("DefinitionNames must begin with an alpha character and contain only letters and numbers.");
			error.addToMessage("This occurred while formatting the compact schema for class: " + cn);
			throw(new DMFeedbackSet(error));
		}
		
		return(rc);
	}

	/**
	 * For all AttributeDefinitions in the schema, this method dumps a [schema]ASAG
	 * to the DMO subdirectory. THIS METHOD IS FOR THE METAGENERATOR.
	 * @param sn  The schema name.
	 * @param schemaPackage The schema package prefix.
	 * @param classes the class definitions.
	 * @param attributes the attribute definitions.
	 * @param types the type definitions.
	 * @param dmodir The output directory.
	 * @param baseID the base ID for the schema
	 * @param idRange the range of IDs permissible
	 * @throws IOException 
	 * @throws IOException 
	 * @throws DMFeedbackSet 
	 * @throws DMFeedbackSet 
	 */
//	public void dumpSchema(String sn, String schemaPackage, TreeMap<String,DMUncheckedObject> classes, TreeMap<String,DMUncheckedObject> attributes, TreeMap<String,DMUncheckedObject> types, TreeMap<String,DMUncheckedObject> rules, String dmodir, int baseID, int idRange) throws IOException, DMFeedbackSet{
	public void dumpSchema(String sn, String schemaPackage, TreeMap<String,DMUncheckedObject> classes, TreeMap<String,DMUncheckedObject> attributes, TreeMap<String,DMUncheckedObject> types, String dmodir, int baseID, int idRange) throws IOException, DMFeedbackSet{
		String schemaName = Manipulator.dotNameToCamelCase(sn) + "DMSAG";
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + ".java");

        dumpHeaderMETA(out,schemaPackage);
        
        StringBuilder nameBuilders = new StringBuilder();
        if (types != null){
	        for(DMUncheckedObject td: types.values()){
	        	String tname = td.getSV("name");
	        	String isNameType = td.getSV("isNameType");
	        	
	        	if (isNameType != null){
	        		String nameAttributeDef = td.getSV("nameAttributeDef");
	        		
	        		if (nameAttributeDef == null)
						throw(new IllegalStateException("TypeDefinition " + tname + "  does not have a designated naming attribute."));
	        		
					nameBuilders.append("        _NmAp.put(DmcType" + tname + "STATIC.instance.getNameClass(),DmcType" + tname + "STATIC.instance);\n");
	        		
	        	}
	        }
        }
        
        StringBuilder filterBuilders = new StringBuilder();
        if (types != null){
	        for(DMUncheckedObject td: types.values()){
	        	String tname = td.getSV("name");
	        	String isFilterType = td.getSV("isFilterType");
	        	
	        	if (isFilterType != null){
	        		String filterAttributeDef = td.getSV("filterAttributeDef");
	        		
	        		if (filterAttributeDef == null)
						throw(new IllegalStateException("TypeDefinition " + tname + "  does not have a designated filter attribute."));
	        		
					filterBuilders.append("        _FmAp.put(DmcType" + tname + "STATIC.instance.getFilterClass(),DmcType" + tname + "STATIC.instance);\n");
	        		
	        	}
	        }
        }
        
        out.write("\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + schemaName + " implements DmcCompactSchemaIF {\n\n");

        out.write("\n");
        out.write("    static String schemaName = \"" + sn + "\";\n");
        out.write("\n");

        out.write("\n");
        out.write("    static int schemaBaseID = " + baseID + ";\n");
        out.write("\n");

        out.write("\n");
        out.write("    static int schemaIDRange = " + idRange + ";\n");
        out.write("\n");

        int max = baseID + idRange;
        
        out.write("\n");
        out.write("    static int schemaMaxID = " + max + ";\n");
        out.write("\n");

        if (attributes != null){
    		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        for(DMUncheckedObject ad: attributes.values()){
	        	String n				= ad.getSV("name");
            	String t 				= ad.getSV("type");
            	String ID 				= ad.getSV("dmdID");
            	String mv 				= ad.getSV("valueType");
            	String indexSize		= ad.getSV("indexSize");
	        	String weakReference	= ad.getSV("weakReference");
	        	
	        	if (indexSize == null)
	        		indexSize = "0";
	        	
	        	if (weakReference == null)
	        		weakReference = "false";
        		
            	writeAttributeInfoMETA(out, n, ID, t, mv, "false", indexSize, weakReference);
			}
		}
        
        if (types != null){
            out.write("\n");
    		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
            for(DMUncheckedObject uco: types.values()){
	        	String name					= uco.getSV("name");
	        	String isRefType			= uco.getSV("isRefType");
	        	String isExtendedRefType	= uco.getSV("isExtendedRefType");
	        	String isEnumType			= uco.getSV("isEnumType");
	        	String isNameType			= uco.getSV("isNameType");
	        	String internallyGenerated	= uco.getSV("internallyGenerated");
	        	String originalClass		= uco.getSV("originalClass");
	        	
	        	if (name.equals("WrapperTypeEnum")){
	        		DebugInfo.debug("WRAPPER TYPE ENUM: " + uco.toOIF() + "\n\n");
	        	}
	        	if (internallyGenerated == null){
	        		// This is a straightforward type definition
	        		
	        		if (isNameType == null)
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.TYPE);\n");
	        		else
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.NAMETYPE);\n");

	        	}
	        	else{
	        		if (isEnumType != null)
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.ENUM);\n");
	        		else if (isRefType != null)
	        			out.write("    public final static DmcTypeInfo __type_" + originalClass + " = new DmcTypeInfo(\"" + originalClass + "\", OriginalTypeEnum.REFERENCE);\n");
	        		else if (isExtendedRefType != null)
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.EXTREF);\n");
	        		else 
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.COMPLEXTYPE);\n");
	        	}
//        		System.out.println(uco.toOIF() + "\n");
        	}
        }
        
		if (classes != null){
			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			TreeMap<String,ClassNode> hierarchy = getHierarchyMETA(classes.values().iterator());
			out.write("\n");
	        for(ClassNode cn: hierarchy.values()){
            	cn.writeClassInfo(out);
			}
		}
		
//		if (rules != null){
//			out.write("\n");
//			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
//			for(DMUncheckedObject ruleData: rules.values()){
//				String dataName 	= ruleData.getConstructionClass();
//				int dataPos 		= dataName.indexOf("Data");
//				String ruleClass 	= dataName.substring(0, dataPos);
//				String ruleName		= ruleData.getSV("ruleName");
//				
//				out.write("    public final static " + ruleClass + " " + ruleName + ";\n");
//			}
//		}

        
		CompactSchemaHelper.writeCommonPart1(out);
        
        // Inside the static initializer
        
		if (attributes != null){
			out.write("\n        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        for(DMUncheckedObject ad: attributes.values()){
	        	String n	= ad.getSV("name");
	            // _SmAp.put(__jobName.name,__jobName);
				out.write("        _SmAp.put(__" + n + ".id,__" + n + ");\n");
			}
		}
        
		if (classes != null){
			out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        for(DMUncheckedObject cd: classes.values()){
	        	String n	= cd.getSV("name");
	            // _SmAp.put(__jobName.name,__jobName);
				out.write("        _CmAp.put(__" + n + ".id,__" + n + ");\n");
			}
	        
			out.write("\n        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        for(DMUncheckedObject cd: classes.values()){
	        	out.write("\n");
	        	String cn	= cd.getSV("name");
	            TreeSet<String> 		must 	= new TreeSet<String>();
	            TreeSet<String> 		may		= new TreeSet<String>();

	            getAllMustAndMay(cd, must, may, classes);
	            
	            for(String an: must){
        			out.write("        __" + cn + ".addMust(__" + an + ");\n");
	            }
	            
	            for(String an: may){
        			out.write("        __" + cn + ".addMay(__" + an + ");\n");
	            }
			}
		}
		
//		if ((rules != null) && (rules.size() > 0)){
//			out.write("\n");
//			PrintfFormat pf = new PrintfFormat("%-28s");
//			out.write("        try{\n");
//			
//			for(DMUncheckedObject ruleData: rules.values()){
//				
//				
//				// ONLY DUMP DMO COMPATIBLE RULES!!!!!!!!!!!!!!!!!!!!!!!!
//				
//				
//				String dataName 	= ruleData.getConstructionClass();
//				int dataPos 		= dataName.indexOf("Data");
//				String ruleClass 	= dataName.substring(0, dataPos);
//				String ruleName		= ruleData.getSV("ruleName");
//				
//				out.write("            " + dataName + "DMO _" + ruleName + "Data = new " + dataName + "DMO();\n");
//				
//				setAttributeValuesMETA(out, ruleData, pf, types, attributes);
//
//				out.write("            " + ruleClass + " " + ruleName + " = new " + ruleClass + "(_" + ruleName + "Data);\n\n");
//			}
//			out.write("        } catch(DmcValueException ex){\n");
//			out.write("            throw(new IllegalStateException(ex));\n");
//			out.write("        }\n");
//		}
		
		out.write("\n");        
        out.write(nameBuilders.toString());
        
        out.write(filterBuilders.toString());
        
        // End of static initializer
        
        CompactSchemaHelper.writeCommonPart2(out, schemaName);
	        
		
		out.write("}\n\n");
		
		out.close();
	}
	
    public void getAllMustAndMay(DMUncheckedObject uco, TreeSet<String> must, TreeSet<String> may, TreeMap<String,DMUncheckedObject> classDefs) throws DMFeedbackSet{
    	String derivedFrom = uco.getSV("derivedFrom");
   
    	if (derivedFrom != null){
    		DMUncheckedObject base = classDefs.get(derivedFrom);
    		getAllMustAndMay(base, must, may, classDefs);
    	}
    	
    	NamedStringArray mustAttr = uco.get("must");
    	if (mustAttr != null){
    		for(String name: mustAttr){
    			must.add(name);
    		}
    	}
    	
    	NamedStringArray mayAttr = uco.get("may");
    	if (mayAttr != null){
    		for(String name: mayAttr){
    			may.add(name);
    		}
    	}
    }
    	
	void dumpHeaderMETA(BufferedWriter out, String schemaPackage) throws IOException {
        out.write("package " + schemaPackage + ".generated.dmo;\n\n");
        
        ImportManager imports = new ImportManager();

        imports.addImport("java.util.HashMap","To store our various schema info");
        imports.addImport("java.util.ArrayList","For rule instances");
        imports.addImport("java.util.Iterator","To allow iteration");
        imports.addImport("org.dmd.core.schema.*","Access to the various schema info");
        imports.addImport("org.dmd.core.interfaces.DmcNameBuilderIF","For name builders");
        imports.addImport("org.dmd.core.interfaces.DmcFilterBuilderIF","For filter builders");
        imports.addImport("org.dmd.dms.shared.generated.enums.ClassTypeEnum","For class type specification");
        imports.addImport("org.dmd.dms.shared.generated.enums.ValueTypeEnum","For value type specification");
        imports.addImport("org.dmd.dms.shared.generated.enums.DataTypeEnum","For data type specification");
        imports.addImport("org.dmd.dms.shared.generated.enums.OriginalTypeEnum","For original base types for internally created types");
        imports.addImport("org.dmd.dms.shared.generated.types.*","Easy access to all types");
        imports.addImport("org.dmd.core.rules.RuleIF","For rule instances");
        
        out.write(imports.getFormattedImports() + "\n");
        
	}
	
	
	/**
	 * 
	 * @param out
	 * @param n   attribute name
	 * @param ID  ID
	 * @param t   type name
	 * @param mv  valueType
	 * @param opt optional
	 * @param is  index size
	 * @param wr  weak reference
	 * @throws IOException
	 */
    void writeAttributeInfoMETA(BufferedWriter out, String n, String ID, String t, String mv, String opt, String is, String wr) throws IOException {
    	out.write("    public final static DmcAttributeInfo __" + n + " = new DmcAttributeInfo(");
    	out.write("\"meta\",");
    	out.write("\"" + n + "\",");
    	out.write(ID + ",");
    	out.write("\"" + t + "\",");
    	
    	if (mv == null)
    		out.write("ValueTypeEnum.SINGLE,");
    	else
    		out.write("ValueTypeEnum.MULTI,");
    	
   		out.write("DataTypeEnum.PERSISTENT");
    	
   		out.write("," + is);
    	
   		out.write("," + wr);
    	
    	out.write(");\n");

    }
    
    TreeMap<String,ClassNode> getHierarchyMETA(Iterator<DMUncheckedObject> classes) throws DMFeedbackSet{
    	TreeMap<String,ClassNode> sorted = new TreeMap<String, ClassNode>();
    	TreeMap<String,ClassNode> hierarchy = new TreeMap<String, ClassNode>();
    	
    	while(classes.hasNext()){
    		DMUncheckedObject uco = classes.next();
    		String name = uco.getSV("name");
    		sorted.put(name, new ClassNode(name,uco));
    	}
    	
    	for(ClassNode cn: sorted.values()){
    		String derivedFrom = cn.uco.getSV("derivedFrom");
    		
    		if (derivedFrom == null)
    			hierarchy.put(cn.name, cn);
    		else{
    			ClassNode parent = sorted.get(derivedFrom);
    			parent.addDerived(cn);
    		}	
    	}
    	
    	return(hierarchy);
    }

    class ClassNode {
    	String 						name;
    	DMUncheckedObject			uco;
    	TreeMap<String,ClassNode>	derived;
    	String						parentRef;
    	
    	ClassNode(String n, DMUncheckedObject def){
    		name	= n;
    		uco		= def;
    		derived = new TreeMap<String, ClassNode>();
    	}
    	
    	void addDerived(ClassNode cn){
    		derived.put(cn.name, cn);
    	}
    	
    	/**
    	 * Recursively writes the class information for this class and all of its derived classes.
    	 * @param out
    	 * @throws IOException
    	 * @throws DMFeedbackSet
    	 */
    	void writeClassInfo(BufferedWriter out) throws IOException {
			String ID = uco.getSV("dmdID");
			String ct = uco.getSV("classType");
			String derivedFrom = uco.getSV("derivedFrom");
			String isNamedBy = uco.getSV("isNamedBy");
			String dmoImport = uco.getSV("dmoImport");
			
	    	out.write("    public final static DmcClassInfo __" + name + " = new DmcClassInfo(");
	    	out.write("\"" + name + "\",");
	    	out.write("\"" + dmoImport + "\",");
	    	out.write(ID + ",");
	   		out.write("ClassTypeEnum." + ct + ",");
	   		out.write("DataTypeEnum.PERSISTENT");
	   		if (derivedFrom == null)
	   			out.write(",null");
	   		else
	   			out.write(",__" + derivedFrom);
	   		
	   		if (isNamedBy == null)
	   			out.write(",null");
	   		else{
	   			out.write(",MetaDMSAG.__" + isNamedBy);
	   		}

	    	out.write(");\n");	
	    	
    		for(ClassNode cn: derived.values()){
    			cn.writeClassInfo(out);
    		}
		}
    }
			
    
    
    ///////////////////////////////////////////////////////////////////////////
    
//	private void setAttributeValuesMETA(BufferedWriter out, DMUncheckedObject obj, PrintfFormat pf, TreeMap<String,DMUncheckedObject>	typeDefs, TreeMap<String,DMUncheckedObject> attributeDefs) throws IOException, DMFeedbackSet {
//		String				attrName	= null;
//		String          	objName		= null;
//		DMUncheckedObject 	attrDef		= null;
//		String          	typeName    = null;
//		DMUncheckedObject  typeDef     = null;
//		boolean				multiValued	= false;
//		boolean         	isReference = false;
//		boolean         	isEnumType  = false;
//		
//		objName = obj.getSV("ruleName") + "Data";
//		
//		Iterator<String> attributeNames = obj.getAttributeNames();
//		while(attributeNames.hasNext()){
//			NamedStringArray attr = obj.get(attributeNames.next());
//			attrName = attr.getName();
//			if (attrName == null){
//				DebugInfo.debug("Attr name null");
//				continue;
//			}
//			attrDef  = attributeDefs.get(attrName);
//			multiValued = false;
//			isReference	= false;
//			isEnumType  = false;
//			
//			if (attrDef == null){
//				DMParsingFeedback dpf = new DMParsingFeedback("Unknown attribute: " + attrName, obj.getFile(), obj.getLineNumber());
//				throw(new DMFeedbackSet(dpf));
//			}
//			
//			if (obj.getConstructionClass().equals("InitRuleData")){
//				if (attrName.equals("ruleName") || attrName.equals("ruleTitle") || attrName.equals("description") || attrName.equals("applyToClass")){
//					// Just keep going
//				}
//				else{
//					formatOtherAttribute(out,pf,typeDefs,attrDef);
//					continue;
//				}
//			}
//			
//			
//			// MULTIVALUED 1
//			if (attrDef.getSV("valueType") != null)
//				multiValued = true;
//			
//			typeName = attrDef.getSV("type");
//			typeDef = typeDefs.get(typeName);
//			
//			if (typeDef == null){
//				// If this is null, we need to look for an internally generated Reference type
//				typeDef = typeDefs.get(typeName + "REF");
//				isReference = true;
//				
//				if (typeDef.getSV("isEnumType") != null)
//					isEnumType = true;
//			}
//			
//	    	StringBuffer 	attrNameCapped 	= new StringBuffer();
//	    	attrNameCapped.append(attrName);
//	    	attrNameCapped.setCharAt(0,Character.toUpperCase(attrNameCapped.charAt(0)));
//			
//			if (attrName.equals("type")){
//				// The type attribute has to be handled slightly differently than most attributes
//				// to adjust for the fact that we create those internal Reference types to handle
//				// references to definitions.
//				isReference = false;
//				isEnumType  = false;
//				typeName = obj.getSV("type");
//				typeDef = typeDefs.get(typeName);
//				
//				if (typeDef == null){
//					// If this is null, we need to look for an internally generated Reference type
//					typeDef = typeDefs.get(typeName + "REF");
//					isReference = true;
//					
//					if (typeDef.getSV("isEnumType") != null)
//						isEnumType = true;
//				}
//				
//	            out.write("            _" + pf.sprintf(objName));
//	            
//				out.write(".setType(");
//				
//				if (isReference){
//					out.write("_" + obj.getSV(attrName) + "REF);\n");
//				}
//				else{
//					out.write("_" + obj.getSV(attrName) + ");\n");
//				}
//			}
//			else{
//				if (multiValued){
//					
//					for(String attrVal: attr){
//			            out.write("            _" + pf.sprintf(objName));
//						out.write(".add" + attrNameCapped + "(");
//						
//						if (isReference){
//							if (isEnumType)
//								out.write(typeName + "." + attrVal + ");\n");
//							else
//								out.write("_" + attrVal + ");\n");
//						}
//						else{
//							out.write("\"" + attrVal + "\");\n");
//						}
//					}
//				}
//				else{
//		            out.write("            _" + pf.sprintf(objName));
//					out.write(".set" + attrNameCapped + "(");
//					
//					
//
//					if (isReference){
//						if (isEnumType)
//							out.write(typeName + "." + obj.getSV(attrName) + ");\n");
//						else
//							out.write("_" + obj.getSV(attrName) + ");\n");
//					}
//					else{
//						String value = obj.getSV(attrName);
//						
//						if (attrName.equals("name")){
//							String val = obj.getSV(attrName);
//							if (val.endsWith("EnumREF")){
//								value = val.replaceFirst("REF", "");
//							}
//						}
//
//						out.write("\"" + value + "\");\n");
//					}
//				}
//			}
//			
//		}
//		
//		out.write("\n");
//		
//	}	

//	private void formatOtherAttribute(BufferedWriter out, PrintfFormat pf, TreeMap<String,DMUncheckedObject>	typeDefs, DMUncheckedObject attribute) throws IOException, DMFeedbackSet {
//		String typeName = attribute.getSV("type");
//		DMUncheckedObject type = typeDefs.get(typeName);
//		DebugInfo.debug(type.toOIF() + "\n");
//	}


}
