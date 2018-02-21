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
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.IntegerVar;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.ExtendedReferenceTypeDefinition;
import org.dmd.dms.MetaSchema;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.util.BooleanVar;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;

public class GenUtility {
	
	static public StringBuffer						attributeInfo;

	static public String getImports(ActionDefinition ad, ArrayList<AttributeDefinition> allAttr, BooleanVar anySVAttributes, BooleanVar anyMVAttributes) throws ResultException {
		attributeInfo = new StringBuffer();
		return(getImports((ClassDefinition)null,ad,ad.getMayParm(),ad.getMustParm(),allAttr,anySVAttributes,anyMVAttributes));
	}
	
	public static String getImports(ClassDefinition cd, Iterator<AttributeDefinition> may, Iterator<AttributeDefinition> must, ArrayList<AttributeDefinition> allAttr, BooleanVar anySVAttributes, BooleanVar anyMVAttributes) throws ResultException{
		return(getImports(cd,null,may,must,allAttr,anySVAttributes,anyMVAttributes));
	}
		
	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd
	 * @param anyMVAttributes 
	 * @param anySVAttributes 
	 * @return
	 * @throws ResultException 
	 */
	static String getImports(ClassDefinition cd, ActionDefinition act, Iterator<AttributeDefinition> may, Iterator<AttributeDefinition> must, ArrayList<AttributeDefinition> allAttr, BooleanVar anySVAttributes, BooleanVar anyMVAttributes) throws ResultException{
		boolean								anyAttributes	= false;
		boolean								anyAttributesAtThisLevel = false;
		IntegerVar							longestImport	= new IntegerVar();
		TreeMap<DefinitionName,TypeDefinition>	types 			= new TreeMap<DefinitionName,TypeDefinition>();
		TreeMap<String,TypeAndAttr>			typeAndAttr 	= new TreeMap<String,TypeAndAttr>();
		TreeSet<String>						genericImports	= new TreeSet<String>();
		
		anyMVAttributes.set(false);
		anySVAttributes.set(false);
		if ((cd != null) && cd.getName().getNameString().startsWith("WifiStatsInfo"))
			DebugInfo.debug("HERE");
		
//		boolean interested = false;
//		String	theType = " ";
//		if (cd.getName().getNameString().equals("RadioConfigProfile")){
//			DebugInfo.debug("HERE");
//			interested = true;
//		}
		
		// Key: type name
		// Value: comment
		TreeMap<String,String>	uniqueImports = new TreeMap<String, String>();
		
		if (may != null){
			while(may.hasNext()){
				AttributeDefinition ad = may.next();
				anyAttributes = true;
				
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				
				TypeAndAttr ta = new TypeAndAttr(td,ad.getValueType(),ad.getIndexSize());
				typeAndAttr.put(ta.name, ta);
				
				switch(ad.getValueType()){
				case SINGLE:
					anySVAttributes.set(true);;
					break;
				case MULTI:
					if (ad.getIndexSize() == null){
						anyMVAttributes.set(true);
					}
					else{
						if (td.getIsRefType() == false)
							anyMVAttributes.set(true);
					}
					break;
				case HASHMAPPED:
				case TREEMAPPED:
				case HASHSET:
				case TREESET:
					anyMVAttributes.set(true);
					break;
				}
				
				if (ad.getGenericArgsImport() != null)
					genericImports.add(ad.getGenericArgsImport());
				
				if (attributeInfo != null)
					appendAttributeInfo(attributeInfo, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), "true");

				if ((cd != null) && (cd.getClassType() == ClassTypeEnum.AUXILIARY))
					addImport(uniqueImports, longestImport, ad.getDefinedIn().getDMSASGImport(), "Attribute from " + ad.getDefinedIn().getName() + " schema");
					
				if ((cd != null) && (ad.getDefinedIn() != cd.getDefinedIn()))
					addImport(uniqueImports, longestImport, ad.getDefinedIn().getDMSASGImport(), "Attribute from " + ad.getDefinedIn().getName() + " schema");
					
				if ((act != null) && (ad.getDefinedIn() != act.getDefinedIn()))
					addImport(uniqueImports, longestImport, ad.getDefinedIn().getDMSASGImport(), "Attribute from " + ad.getDefinedIn().getName() + " schema");
					
				allAttr.add(ad);
			}
		}
		
		if (must != null){
			while(must.hasNext()){
				AttributeDefinition ad = must.next();
				anyAttributes = true;
				
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				
				TypeAndAttr ta = new TypeAndAttr(td,ad.getValueType(),ad.getIndexSize());
				typeAndAttr.put(ta.name, ta);
				
//				if (interested){
//					if (ad.getName().getNameString().equals("wlanConfigProfiles")){
//						DebugInfo.debug("The type is: " + ta.name);
//						theType = ta.name;
//					}
//				}
				
				switch(ad.getValueType()){
				case SINGLE:
					anySVAttributes.set(true);
					break;
				case MULTI:
					// We don't need java.util with indexed multi-values
					if (ad.getIndexSize() == null){
						anyMVAttributes.set(true);
					}
					else{
						if (td.getIsRefType() == false)
							anyMVAttributes.set(true);
					}
					break;
				case HASHMAPPED:
				case TREEMAPPED:
				case HASHSET:
				case TREESET:
					anyMVAttributes.set(true);
					break;
				}
								
				if (ad.getGenericArgsImport() != null)
					genericImports.add(ad.getGenericArgsImport());

				if (attributeInfo != null)
					appendAttributeInfo(attributeInfo, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), "true");

				if ((cd != null) && (cd.getClassType() == ClassTypeEnum.AUXILIARY))
					addImport(uniqueImports, longestImport, ad.getDefinedIn().getDMSASGImport(), "Attribute from " + ad.getDefinedIn().getName() + " schema");

				if ((cd != null) && (ad.getDefinedIn() != cd.getDefinedIn()))
					addImport(uniqueImports, longestImport, ad.getDefinedIn().getDMSASGImport(), "Attribute from " + ad.getDefinedIn().getName() + " schema");
					
				if ((act != null) && (ad.getDefinedIn() != act.getDefinedIn()))
					addImport(uniqueImports, longestImport, ad.getDefinedIn().getDMSASGImport(), "Attribute from " + ad.getDefinedIn().getName() + " schema");
					
				allAttr.add(ad);
			}
		}
		
		
		anyAttributesAtThisLevel = anyAttributes;
		
		if ( (cd != null) && (cd.getFullAttrMap().size() > 0) )
			anyAttributes = true;
		
//		if (cd == null){
//			if (anyMVAttributes.booleanValue())
//				addImport(uniqueImports, longestImport, "java.util.*", "Always required if we have any MV attributes");
//		}
//		else{
//			if (cd.getClassType() != ClassTypeEnum.AUXILIARY){
//				if (anyMVAttributes.booleanValue())
//					addImport(uniqueImports, longestImport, "java.util.*", "Always required if we have any MV attributes");
//			}
//		}
		
		if (anyMVAttributes.booleanValue())
			addImport(uniqueImports, longestImport, "java.util.*", "Always required if we have any MV attributes");
			
		if ( (cd != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY))
			addImport(uniqueImports, longestImport, "java.io.Serializable", "Always required");
			
		if ( (cd != null) && (cd.getClassType() != ClassTypeEnum.ABSTRACT) && (cd.getClassType() != ClassTypeEnum.AUXILIARY)){
			addImport(uniqueImports, longestImport, "org.dmd.dms.generated.types.DmcTypeModifierMV", "Required for MODREC constructor");
			addImport(uniqueImports, longestImport, "org.dmd.dms.generated.dmo.MetaDMSAG", "Required for MODREC constructor");
			addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcSliceInfo", "Required for object slicing");
		}
			
//		if (anyAttributes){
//			addImport(uniqueImports, longestImport, "org.dmd.dms.generated.enums.ValueTypeEnum", "Required if we have any attributes");
//			addImport(uniqueImports, longestImport, "org.dmd.dms.generated.enums.DataTypeEnum", "Required if we have any attributes");
//		}
//
//		addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcAttributeInfo", "Always required");
		
		if ( (cd != null) && (cd.getClassType() == ClassTypeEnum.AUXILIARY) ){
			addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcAttributeInfo", "To support common aux functions");
			addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcObject", "To support aux addition/removal");			
		}
		
		if (anyAttributesAtThisLevel){
			addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcAttribute", "Any attributes");
			addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcValueException", "Any attributes");
		}
		
		for(String s: genericImports){
			addImport(uniqueImports, longestImport, s, "Generic args import");
		}

//		DebugInfo.debug("For class: " + cd.getName());
		
		for(TypeAndAttr ta: typeAndAttr.values()){
			
			TypeDefinition td = ta.td;
			
//			if (interested && ta.name.startsWith(theType)){
//				DebugInfo.debug("HERE");
//			}

//			if ( (td.getPrimitiveType() != null) && (cd != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY) ){
			// FIX: wasn't picking up a complex type import for an AUX class - don't remember why AUX classes were excluded here
			if ( (td.getPrimitiveType() != null) && (cd != null)){
				if (td.getInternallyGenerated() && td.getIsRefType()){
					// We have an internally generated reference type, only import if
					// the definition is from a different schema, otherwise, we're
					// already in the same package and don't need to import it
					if (cd.getDefinedIn() != td.getDefinedIn()){
						// NOTE: GetRequest has an unneeded ClassDefinitionDMO import because of this
						// need to figure out the right criteria
						
//						addImport(uniqueImports, longestImport, td.getPrimitiveType(), "Primitive type and !auxiliary - internally generated reference type");
					}
				}
				else{
//					addImport(uniqueImports, longestImport, td.getPrimitiveType(), "Primitive type and !auxiliary class");
					addImport(uniqueImports, longestImport, td.getPrimitiveType(), "Primitive type");
				}
			}
			
			if ( (td.getPrimitiveType() != null) && (act != null) ){
				if (td.getInternallyGenerated() && td.getIsRefType()){
					// We have an internally generated reference type, only import if
					// the definition is from a different schema, otherwise, we're
					// already in the same package and don't need to import it
					if (act.getDefinedIn() != td.getDefinedIn()){
						// NOTE: GetRequest has an unneeded ClassDefinitionDMO import because of this
						// need to figure out the right criteria
						
//						addImport(uniqueImports, longestImport, td.getPrimitiveType(), "Primitive type and !auxiliary - internally generated reference type");
					}
				}
				else{
					addImport(uniqueImports, longestImport, td.getPrimitiveType(), "Primitive type and !auxiliary class");
				}
			}

			
			if (td.getAltType() != null){
				if (td.getAltTypeImport() != null)
					addImport(uniqueImports, longestImport, td.getAltTypeImport(), "Alternative type for " + td.getName() + " values");
			}
			
			
			if (td.getIsRefType() && !td.getIsExtendedRefType()){
				addImport(uniqueImports, longestImport, ta.getImport(), "Reference type");
				
				if (ta.valueType == ValueTypeEnum.TREEMAPPED){
					if (td.getOriginalClass().getIsNamedBy() != null)
						addImport(uniqueImports, longestImport, td.getOriginalClass().getIsNamedBy().getType().getPrimitiveType(),"Name attribute type");
				}
				
				addImport(uniqueImports, longestImport, td.getOriginalClass().getDmoImport(), "Type specific set/add");
				
//				addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcNamedObjectIF", "Named object reference");

				if (td.getOriginalClass().getInternalTypeRef().getHelperClassName() == null){
//					DebugInfo.debug("\n\n*** PROBABLY MISSING isNamedBy FQN on a hierarchic object: " + td.getName() + " ***\n\n");
				}
				else{
					
//					DebugInfo.debug(td.toOIF(20));
					addImport(uniqueImports, longestImport, td.getOriginalClass().getInternalTypeRef().getHelperClassName(), "Reference type helper class");
					
					if ( (cd != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY))
						addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcOmni", "Lazy resolution");
										
				}
			}
			else{
				if (td.getIsExtendedRefType())
					addImport(uniqueImports, longestImport, td.getPrimitiveType(), "Extended reference type");

				addImport(uniqueImports, longestImport, ta.getImport(), "Required type");
			}
			
			if (td.getIsExtendedRefType())
				addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcOmni", "Lazy resolution");
			
			if (td.getHelperClassName() != null){
				addImport(uniqueImports, longestImport, td.getHelperClassName(), "Helper class");
			}
			
			if (td.getKeyImport() != null){
				addImport(uniqueImports, longestImport, td.getKeyImport(), "Key class");
			}
		}
		
		if (cd != null){
			if (cd.getDerivedFrom() == null){
				if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
					addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcObject", "Auxiliary class");
					addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcAttributeInfo", "Auxiliary class");
				}
				else{
//					addImport(uniqueImports, longestImport, "org.dmd.dms.generated.dmo.DmwWrapperDMO", "Structural class");
					addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcObject", "Structural class");
				}
			}
			else{
				if ( (cd != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY))
					addImport(uniqueImports, longestImport, cd.getDerivedFrom().getDmoImport(), "Base class");
			}
			
			if (cd.getIsNamedBy() != null){
				AttributeDefinition isNamedBy = cd.getIsNamedBy();
				String nameAttributeType = isNamedBy.getType().getPrimitiveType();
				
				if (nameAttributeType == null){
					ResultException ex = new ResultException("Naming attribute for class " + cd.getName() + " must be a complex type.");
					ex.result.lastResult().moreMessages("Check the type of attribute " + isNamedBy.getName().getNameString());
					ex.result.lastResult().fileName(isNamedBy.getFile());
					ex.result.lastResult().lineNumber(isNamedBy.getLineNumber());
					throw(ex);
				}
				
				addImport(uniqueImports, longestImport, nameAttributeType, "Naming attribute type");
				
				if (isNamedBy.getType().getIsHierarchicName())
					addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcHierarchicNamedObjectIF", "Named object");
				
				addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcNamedObjectIF", "Named object");
				addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcAttribute", "Named object");
			}
		}

		return(formatImports(uniqueImports, longestImport.intValue()));
	}
	
	public static void addImport(TreeMap<String,String> map, IntegerVar longest, String i, String c){
		
		if (i.length() > longest.intValue())
			longest.set(i.length());
		
		map.put(i,c + " - " + DebugInfo.getShortWhereWeWereCalledFrom());
	}
	
	public static String formatImports(TreeMap<String,String> map, int longest){
		int padding = longest+17;
		StringBuffer sb = new StringBuffer();
		PrintfFormat format = new PrintfFormat("%-" + padding + "s");
		
		sb.append("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
			sb.append(format.sprintf("import " + key + ";") + "// " + map.get(key) + "\n");
		}
		
		sb.append("\n");
		
		return(sb.toString());
	}
	
	/**
	 * This method takes a dot name, for example app.event.explosion and turns it into a camel
	 * case string like: AppEventExplosion
	 * @return A camel case string.
	 */
	static public String dotNameToCamelCase(String in){
		StringBuffer sb = new StringBuffer();
		StringTokenizer	tokenizer = new StringTokenizer(in,".");
		
		while(tokenizer.hasMoreTokens()){
			StringBuffer t = new StringBuffer(tokenizer.nextToken());
	    	t.setCharAt(0,Character.toUpperCase(t.charAt(0)));
	    	sb.append(t.toString());
		}
		
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
	
    static public void appendAttributeInfo(BufferedWriter out, String n, int ID, String t, ValueTypeEnum vte, String opt) throws IOException{
    	out.write("    public final static DmcAttributeInfo __" + n + " = new DmcAttributeInfo(");
    	out.write("\"" + n + "\",");
    	out.write(ID + ",");
    	out.write("\"" + t + "\",");
		out.write("ValueTypeEnum." + vte.toString() + ",");
    	out.write(opt + ");\n");
    }
	
//    static public void appendAttributeInfo(BufferedWriter out, AttributeDefinition ad, String optional) throws IOException {
    static public void appendAttributeInfo(BufferedWriter out, AttributeDefinition ad) throws IOException {
    	out.write("    public final static DmcAttributeInfo __" + ad.getName().getNameString() + " = new DmcAttributeInfo(");
    	out.write("\"" + ad.getName().getNameString() + "\",");
    	out.write(ad.getDmdID() + ",");
    	out.write("\"" + ad.getType().getName().getNameString() + "\",");
		out.write("ValueTypeEnum." + ad.getValueType() + ",");
		out.write("DataTypeEnum." + ad.getDataType() + ");\n");

		//		out.write("DataTypeEnum." + ad.getDataType() + ",");
//    	out.write(optional + ");\n");
    }
	
	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd
	 * @return
	 */
	static void getImports(StringBuffer sb, DmsDefinition def, Iterator<AttributeDefinition> must, Iterator<AttributeDefinition> may, ArrayList<AttributeDefinition> allAttr, BooleanVar anySVAttributes, BooleanVar anyMVAttributes){
		ClassDefinition	cd 				= null;
		boolean			needJavaUtil	= false;
		boolean			anyAttributes	= false;
		TreeMap<DefinitionName,TypeDefinition>	types = new TreeMap<DefinitionName,TypeDefinition>();
		TreeSet<String>	genericImports	= new TreeSet<String>();
		
		anyMVAttributes.set(false);
		anySVAttributes.set(false);
		attributeInfo 	= new StringBuffer();
		allAttr 		= new ArrayList<AttributeDefinition>();
		
		if (def instanceof ClassDefinition){
			cd = (ClassDefinition) def;
		}
		
		if (may != null){
			anyAttributes = true;
			while(may.hasNext()){
				AttributeDefinition ad = may.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				
				switch(ad.getValueType()){
				case SINGLE:
					anySVAttributes.set(true);
					break;
				case MULTI:
				case HASHMAPPED:
				case TREEMAPPED:
				case HASHSET:
				case TREESET:
					anyMVAttributes.set(true);
					needJavaUtil = true;
					break;
				}

				appendAttributeInfo(attributeInfo, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), "true");
				
				if (ad.getGenericArgsImport() != null)
					genericImports.add(ad.getGenericArgsImport());
				
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
					anySVAttributes.set(true);
					break;
				case MULTI:
				case HASHMAPPED:
				case TREEMAPPED:
				case HASHSET:
				case TREESET:
					anyMVAttributes.set(true);
					needJavaUtil = true;
					break;
				}

				appendAttributeInfo(attributeInfo, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), "false");

				if (ad.getGenericArgsImport() != null)
					genericImports.add(ad.getGenericArgsImport());
				
				allAttr.add(ad);
			}
		}
		
		if (needJavaUtil)
			sb.append("import java.util.*;\n\n");
		
		if (anyAttributes){
			sb.append("import org.dmd.dmc.DmcAttribute;\n");
			sb.append("import org.dmd.dmc.DmcValueException;\n");
			sb.append("import org.dmd.dmc.DmcAttributeInfo;\n");
			sb.append("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
		}
		
		for(String s: genericImports){
			sb.append("import " + s + ";\n");
		}

		// If the class is auxiliary, we need the DmcTypeString to manipulate the ocl attribute
		if (cd != null){
			if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
				try {
					types.put(new DefinitionName("String"), MetaSchema._String);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		Iterator<TypeDefinition> t = types.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();

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
//		if (ad.getName().getNameString().equals("valueType"))
//			DebugInfo.debug("HERE");
		
    	String typeClassName 	= ad.getType().getTypeClassName();
    	String attrType 		= "DmcType" + ad.getType().getName();
    	// Try to get the nullReturnValue from the attribute first - and try the type second
    	String nullReturnValue 	= ad.getNullReturnValue();
    	String typeName 		= ad.getType().getName().getNameString();
    	String genericArgs		= ad.getGenericArgs();
    	
    	if (genericArgs == null)
    		genericArgs = "<?>";
    	
//    	if (ad.getName().getNameString().equals("ipAddr")){
//    		DebugInfo.debug(ad.toOIF(15));
//    	}
    	
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
    	
    	attrType = attrType + "SV";
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
		
    	if (ad.getType().getIsRefType() && !ad.getType().getIsExtendedRefType()){
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    public " + typeName + "DMO get" + functionName + "(){\n");		
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
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
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        if (attr == null)\n");
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		    	sb.append("\n");
		    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
		    	sb.append("            if (attr.doLazyResolution(this)){\n");
		    	sb.append("                rem(attr.getAttributeInfo());\n");
	    		sb.append("                return(null);\n");
		    	sb.append("            }\n");
		    	sb.append("        }\n");
		    	sb.append("\n");
		    	sb.append("        return(attr.getSV());\n");
		    	sb.append("    }\n\n");
		    	
		    	sb.append("    /**\n");
		    	sb.append("     * Returns the reference to " + typeName + " without attempting lazy resolution (if turned on).\n");
		    	sb.append("     */\n");
				sb.append("    public " + typeName + "REF get" + functionName + "REF(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        if (attr == null)\n");
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		    	sb.append("\n");
		    	sb.append("        return(attr.getSV());\n");
		    	sb.append("    }\n\n");
		    	
			}	    	

			// NOTE: We need the attribute cast to the correct type here because of the removeBackReferences call
	    	sb.append("    /**\n");
	    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value " + typeName + "DMO\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public void set" + functionName + "(" + typeName + "DMO value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
//	    	sb.append("        " + attrType + " attr  = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
	    	
	    	if (ad.getType().getIsRefType() && (ad.getType().getOriginalClass().getIsNamedBy() != null)){
	        	sb.append("        else\n");
	        	sb.append("            ((" + attrType + ")attr).removeBackReferences();\n");
	    	}
	    	
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            attr.set(value);\n");
	    	sb.append("            set(" + ad.getDMSAGReference() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DmcValueException ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific set() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("    }\n\n");

    	}
    	else{
    		if (ad.getType().getIsExtendedRefType()){
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    /**\n");
				sb.append("     * @return The " + typeName + ", attempting lazy resolution (if it's turned on).\n");
				sb.append("     */\n");
				sb.append("    public " + typeName + " get" + functionName + "(){\n");
	
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        if (attr == null)\n");
				
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		
		    	sb.append("\n");
		    	
		    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
		    	sb.append("            if (attr.doLazyResolution(this)){\n");
		    	sb.append("                rem(attr.getAttributeInfo());\n");
	    		sb.append("                return(null);\n");
		    	sb.append("            }\n");
		    	sb.append("        }\n");
		    	sb.append("\n");
		    	
		    	sb.append("        return(attr.getSV());\n");
		    	
		    	sb.append("    }\n\n");
		    	
		    	///////////////////////////////////////////////////////////////
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    /**\n");
				sb.append("     * @return The " + typeName + " without attempting lazy resolution (if it's turned on).\n");
				sb.append("     */\n");
				sb.append("    public " + typeName + " get" + functionName + "REF(){\n");
	
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
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
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				if (typeName.equals("DmcAttribute")){
					if (!genericArgs.equals("<?>"))
						sb.append("    @SuppressWarnings(\"unchecked\")\n");
					sb.append("    public DmcAttribute" + genericArgs + " get" + functionName + "(){\n");
				}
				else if (ad.getType() == MetaSchema._Boolean){
					sb.append("    public " + typeName + " is" + functionName + "(){\n");
				}
				else{
					sb.append("    public " + typeName + " get" + functionName + "(){\n");
				}
	
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        if (attr == null)\n");
				
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		
		    	sb.append("\n");
		    	
		    	if (typeName.equals("DmcAttribute")){
			    	if (!genericArgs.equals("<?>"))
				    	sb.append("        return((DmcAttribute" + genericArgs + ")attr.getSV());\n");
			    	else
			    		sb.append("        return(attr.getSV());\n");
		    	}
		    	else
		    		sb.append("        return(attr.getSV());\n");
		    	
		    	sb.append("    }\n\n");
		    	
    		}
    		
	    	sb.append("    /**\n");
	    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (typeName.equals("DmcAttribute"))
				sb.append("    public void set" + functionName + "(DmcAttribute" + genericArgs + " value) {\n");
			else
				sb.append("    public void set" + functionName + "(" + typeName + " value) {\n");
//	    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
//	    	sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType + "(" + ad.getDMSAGReference() + ");\n");
//	    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            attr.set(value);\n");
	    	sb.append("            set(" + ad.getDMSAGReference() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DmcValueException ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific set() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("    }\n\n");
	    	
	    	if (ad.getType().getAltType() != null){
		    	sb.append("    /**\n");
		    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public void set" + functionName + "(" + ad.getType().getAltType() + " value) {\n");
//		    	sb.append("        DmcAttribute<?> attr = get(__" + ad.getName() + ");\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
//		    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            attr.set(value);\n");
		    	sb.append("            set(" + ad.getDMSAGReference() + ",attr);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DmcValueException ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The alternative type specific set() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("    }\n\n");
	    	}
	    
    	}
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// setter
    	
    	sb.append("    /**\n");
    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
    	sb.append("     * @param value A value compatible with " + attrType + "\n");
    	sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
    	sb.append("    public void set" + functionName + "(Object value) throws DmcValueException {\n");
//    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
    	sb.append("        " + attrType + " attr  = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
    	if (ad.getType().getIsRefType() && (ad.getType().getOriginalClass().getIsNamedBy() != null)){
        	sb.append("        else\n");
        	sb.append("            attr.removeBackReferences();\n");
    	}
    	sb.append("        \n");
    	sb.append("        attr.set(value);\n");
    	sb.append("        set(" + ad.getDMSAGReference() + ",attr);\n");
    	sb.append("    }\n\n");
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(" + ad.getDMSAGReference() + ");\n");
		sb.append("    }\n\n");
		

	}
	
	static public void formatMV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName().getNameString();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    	}
    	
//    	if (ad.getValueType() == ValueTypeEnum.HASHSET){
//    		DebugInfo.debug("HASHSET");
//    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	if (ad.getValueType() == ValueTypeEnum.MULTI)
    		attrType = attrType + "MV";
    	else if (ad.getValueType() == ValueTypeEnum.HASHSET)
    		attrType = attrType + "SET";
    	else if (ad.getValueType() == ValueTypeEnum.TREESET)
    		attrType = attrType + "SET";
    	
    	
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

		
		if (ad.getType().getIsRefType()){
			String REF = "REF";
			String DMO = "DMO";
			
			if  (ad.getType().getIsExtendedRefType()){
				REF = "";
				DMO = "";
			}
			
			if (ad.getIndexSize() == null){

				sb.append("    /**\n");
				sb.append("     * @return An Iterator of " + typeName + "DMO objects.\n");
				sb.append("     */\n");
		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				if (ad.getType().getOriginalClass().getIsNamedBy() == null){
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public Iterator<" + typeName + "DMO> get" + functionName + "(){\n");			
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return( ((List<" + typeName + "DMO>) Collections.EMPTY_LIST).iterator() );\n");
					sb.append("\n");
					sb.append("        return(attr.getMV());\n");
					sb.append("    }\n\n");
					
				}
				else{
					
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public Iterator<" + typeName + REF + "> get" + functionName + "(){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return( ((List<" + typeName + REF + ">) Collections.EMPTY_LIST).iterator() );\n");
			    	sb.append("\n");
			    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
			    	sb.append("            if (attr.doLazyResolution(this)){\n");
			    	sb.append("                rem(attr.getAttributeInfo());\n");
					sb.append("                return( ((List<" + typeName + REF + ">) Collections.EMPTY_LIST).iterator() );\n");
			    	sb.append("            }\n");
			    	sb.append("        }\n");
			    	sb.append("\n");
					sb.append("        return(attr.getMV());\n");
					sb.append("    }\n\n");
					
			    	sb.append("    /**\n");
					sb.append("     * @return An Iterator of " + typeName + "REFs without attempting lazy resolution (if it's turned on).\n");
					sb.append("     */\n");
			    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public Iterator<" + typeName + REF + "> get" + functionName + "REFs(){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return( ((List<" + typeName + REF + ">) Collections.EMPTY_LIST).iterator() );\n");
			    	sb.append("\n");
					sb.append("        return(attr.getMV());\n");
					sb.append("    }\n\n");
				}
			
		    	sb.append("    /**\n");
		    	sb.append("     * Adds another " + ad.getName() + " to the specified value.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName + DMO + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            setLastValue(attr.add(value));\n");
		    	sb.append("            add(" + ad.getDMSAGReference() + ",attr);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DmcValueException ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");
			}
			else{
				if (ad.getType().getOriginalClass().getIsNamedBy() == null){
			    	sb.append("    /**\n");
					sb.append("     * @return The nth " + typeName + " value without attempting lazy resolution.\n");
					sb.append("     */\n");
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public " + typeName + DMO + " getNth" + functionName + "(int i){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return(null);\n");
					sb.append("\n");
					sb.append("        return(attr.getMVnth(i));\n");
					sb.append("    }\n\n");
				}
				else{
			    	sb.append("    /**\n");
					sb.append("     * @return The nth " + typeName + " value and attempt lazy resolution if it's on.\n");
					sb.append("     */\n");
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public " + typeName + REF + " getNth" + functionName + "(int i){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return(null);\n");
					sb.append("\n");
			    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
			    	sb.append("            if (attr.doLazyResolution(this)){\n");
			    	sb.append("                rem(attr.getAttributeInfo());\n");
					sb.append("                return(null);\n");
			    	sb.append("            }\n");
			    	sb.append("        }\n");
					sb.append("\n");
					sb.append("        return(attr.getMVnth(i));\n");
					sb.append("    }\n\n");
					
			    	sb.append("    /**\n");
					sb.append("     * @return The nth " + typeName + " value without attempting lazy resolution.\n");
					sb.append("     */\n");
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public " + typeName + REF + " getNth" + functionName + "REF(int i){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return(null);\n");
					sb.append("\n");
					sb.append("        return(attr.getMVnth(i));\n");
					sb.append("    }\n\n");
				}
				
		    	sb.append("    /**\n");
		    	sb.append("     * Sets the " + ad.getName() + " value at the specified index.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> setNth" + functionName + "(int index, " + typeName + DMO + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        if (attr == null){\n");
		    	sb.append("            if (value == null){\n");
		    	sb.append("                if (getModifier() == null)\n");
		    	sb.append("                    throw(new IllegalStateException(\"Calling setNth() on a non-existent attribute with a null value makes no sense!\"));\n");
		    	sb.append("                else{\n");
		    	sb.append("                    nthNullFromEmptyAttribute(" + ad.getDMSAGReference() + ", index);\n");
		    	sb.append("                    return(null);\n");
		    	sb.append("                }\n");
		    	sb.append("            }\n");
		    	sb.append("            else\n");
		    	sb.append("                attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        }\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	if (ad.getType().getOriginalClass().getIsNamedBy() == null){
			    	sb.append("            setLastValue(attr.setMVnth(index, value));\n");
			    	sb.append("            nth(" + ad.getDMSAGReference() + ", index ,attr, null);\n");
		    	}
		    	else{
		    		sb.append("            " + typeName + REF + " previous = (" + typeName + REF + ") attr.getMVnth(index);\n");
			    	sb.append("            setLastValue(attr.setMVnth(index, value));\n");
			    	sb.append("            nth(" + ad.getDMSAGReference() + ",index ,attr,previous);\n");
		    	}
		    	sb.append("        }\n");
		    	sb.append("        catch(DmcValueException ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The type specific setNth() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");

			}

		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return( ((List<" + typeName + ">) Collections.EMPTY_LIST).iterator());\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
			
	    	sb.append("    /**\n");
			sb.append("     * @return The nth " + typeName + " value.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + typeName + " getNth" + functionName + "(int i){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("\n");
			sb.append("        return(attr.getMVnth(i));\n");
			sb.append("    }\n\n");
			
			if (ad.getIndexSize() == null){
		    	sb.append("    /**\n");
		    	sb.append("     * Adds another " + ad.getName() + " to the specified value.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            setLastValue(attr.add(value));\n");
		    	sb.append("            add(" + ad.getDMSAGReference() + ",attr);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DmcValueException ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");
			}
			else{
		    	sb.append("    /**\n");
		    	sb.append("     * Sets the value at the specified index.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> setNth" + functionName + "(int index, " + typeName + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        if (attr == null){\n");
		    	sb.append("            if (value == null){\n");
		    	sb.append("                if (getModifier() == null)\n");
		    	sb.append("                    throw(new IllegalStateException(\"Calling setNth() on a non-existent attribute with a null value makes no sense!\"));\n");
		    	sb.append("                else{\n");
		    	sb.append("                    nthNullFromEmptyAttribute(" + ad.getDMSAGReference() + ", index);\n");
		    	sb.append("                    return(null);\n");
		    	sb.append("                }\n");
		    	sb.append("            }\n");
		    	sb.append("            else\n");
		    	sb.append("                attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        }\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            " + typeName + " previous = (" + typeName + ") attr.getMVnth(index);\n");
		    	sb.append("            setLastValue(attr.setMVnth(index, value));\n");
		    	sb.append("            nth(" + ad.getDMSAGReference() + ",index ,attr,previous);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DmcValueException ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The type specific setNth() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");
			}
	    	
	    	if (ad.getType().getAltType() != null){
		    	sb.append("    /**\n");
		    	sb.append("     * Adds another " + ad.getName() + " to the specified value.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> add" + functionName + "(" + ad.getType().getAltType() + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            setLastValue(attr.add(value));\n");
		    	sb.append("            add(" + ad.getDMSAGReference() + ",attr);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DmcValueException ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The alternative type specific add() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");	    		
	    	}

	    	sb.append("    /**\n");
	    	sb.append("     * Returns true if we contain a valued keyed by the specified " + typeName + ".\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public boolean " + ad.getName() + "Contains(" + typeName + " value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            return(false);\n");
	    	sb.append("        return(attr.contains(value));\n");
	    	sb.append("    }\n\n");

	    	if (ad.getType().getAltType() != null){
	    		String alt = ad.getType().getAltType();
		    	sb.append("    /**\n");
		    	sb.append("     * Returns true if we contain a valued keyed by the specified " + alt + ".\n");
		    	sb.append("     * @param value " + alt + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public boolean " + ad.getName() + "Contains(" + alt + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            return(false);\n");
		    	sb.append("        return(attr.contains(value));\n");
		    	sb.append("    }\n\n");
	    	}

		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// adder

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value A value compatible with " + typeName + "\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public DmcAttribute<?> add" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
    	sb.append("        \n");
    	sb.append("        setLastValue(attr.add(value));\n");
    	sb.append("        add(" + ad.getDMSAGReference() + ",attr);\n");
    	sb.append("        return(attr);\n");
		sb.append("    }\n\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// size

		sb.append("    /**\n");
		sb.append("     * Returns the number of values in " + ad.getName() + "\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public int get" + functionName + "Size(){\n");
    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
    	sb.append("        if (attr == null){\n");
    	sb.append("            if (" + ad.getDMSAGReference() + ".indexSize == 0)\n");
    	sb.append("                return(0);\n");
    	sb.append("            else\n");
    	sb.append("                return(" + ad.getDMSAGReference() + ".indexSize);\n");
    	sb.append("        }\n");
    	sb.append("        return(attr.getMVSize());\n");
		sb.append("    }\n\n");

    	
    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		if (ad.getType().getIsRefType()){
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(Object value){\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        \n");
				sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
				sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getDMSAGReference() + "), value);\n");
				sb.append("        else\n");
				sb.append("            attr = del(" + ad.getDMSAGReference() + ", value);\n");
				sb.append("        \n");
				sb.append("        return(attr);\n");
				sb.append("    }\n\n");
			}
			else{
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(Object value){\n");
//		    	sb.append("        DmcAttribute<?> attr = del(" + ad.getDMSAGReference() + ", ((DmcNamedObjectIF)value).getObjectName());\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        \n");
				sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
				sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getDMSAGReference() + "), value);\n");
				sb.append("        else\n");
				sb.append("            attr = del(" + ad.getDMSAGReference() + ", value);\n");
				sb.append("        \n");
				sb.append("        return(attr);\n");
				sb.append("    }\n\n");
			}
		}
		else{
			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");//	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> del" + functionName + "(Object value) throws DmcValueException {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        \n");
			sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
			sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getDMSAGReference() + "), value);\n");
			sb.append("        else\n");
			sb.append("            attr = del(" + ad.getDMSAGReference() + ", value);\n");
			sb.append("        \n");
			sb.append("        return(attr);\n");
			sb.append("    }\n\n");
			
	    	sb.append("    /**\n");
	    	sb.append("     * Deletes a " + ad.getName() + " from the specified value.\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public DmcAttribute<?> del" + functionName + "(" + typeName + " value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        \n");
			sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
			sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getDMSAGReference() + "), value);\n");
			sb.append("        else\n");
			sb.append("            attr = del(" + ad.getDMSAGReference() + ", value);\n");
			sb.append("        \n");
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
		sb.append("         rem(" + ad.getDMSAGReference() + ");\n");
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
    	
    	attrType = attrType + "MAP";
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

		if (ad.getType().getIsRefType()){
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + "DMO objects.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    public Iterator<" + typeName + "DMO> get" + functionName + "(){\n");			
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return(Collections.<" + typeName + "DMO> emptyList().iterator());\n");
				sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
			}
			else{
		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public Iterator<" + typeName + "REF> get" + functionName + "(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return( ((List<" + typeName + "REF>) Collections.EMPTY_LIST).iterator() );\n");
		    	sb.append("\n");
		    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
		    	sb.append("            if (attr.doLazyResolution(this)){\n");
		    	sb.append("                rem(attr.getAttributeInfo());\n");
				sb.append("                return( ((List<" + typeName + "REF>) Collections.EMPTY_LIST).iterator() );\n");
		    	sb.append("            }\n");
		    	sb.append("        }\n");
				sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
				
		    	sb.append("    /**\n");
				sb.append("     * @return An Iterator of " + typeName + "REFs without attempting lazy resolution (if it's turned on).\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    public Iterator<" + typeName + "REF> get" + functionName + "REFs(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return( ((List<" + typeName + "REF>) Collections.EMPTY_LIST).iterator() );\n");
		    	sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
			}
		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return( ((List<" + typeName + ">) Collections.EMPTY_LIST).iterator());\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// get by key
		
		if (ad.getType().getIsRefType()){
	    	sb.append("    /**\n");
			sb.append("     * @param key The key of the value you want.\n");
			sb.append("     * @return The " + typeName + " associated with the specified key.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + typeName + "REF get" + functionName + "(Object key){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
	    	sb.append("\n");
			sb.append("        return(attr.getByKey(key));\n");
			sb.append("    }\n\n");
		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @param key The key of the value you want.\n");
			sb.append("     * @return The " + typeName + " associated with the specified key.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + typeName + " get" + functionName + "(Object key){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("\n");
			sb.append("        return(attr.getByKey(key));\n");
			sb.append("    }\n\n");
		}
		
		if (ad.getValueType() == ValueTypeEnum.TREEMAPPED){
			
			String keyClass = ad.getType().getKeyClass();
			if (ad.getType().getIsRefType()){
				keyClass = ad.getType().getOriginalClass().getIsNamedBy().getType().getName().getNameString();
			}
			
	    	sb.append("    /**\n");
			sb.append("     * @return The first key of the map.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//			sb.append("    public " + ad.getType().getKeyClass() + " get" + functionName + "FirstKey(){\n");
			sb.append("    public " + keyClass + " get" + functionName + "FirstKey(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("\n");
			sb.append("        return(attr.firstKey());\n");
			sb.append("    }\n\n");
		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// adder

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value A value compatible with " + typeName + "\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public DmcAttribute<?> add" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
    	sb.append("        \n");
    	sb.append("        setLastValue(attr.add(value));\n");
    	sb.append("        add(" + ad.getDMSAGReference() + ",attr);\n");
    	sb.append("        return(attr);\n");
		sb.append("    }\n\n");

		if (ad.getType().getIsRefType()){
			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName+ "DMO value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            setLastValue(attr.add(value));\n");
	    	sb.append("            add(" + ad.getDMSAGReference() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DmcValueException ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("        return(attr);\n");
			sb.append("    }\n\n");
		}
		else{
			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName+ " value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(" + ad.getDMSAGReference() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            setLastValue(attr.add(value));\n");
	    	sb.append("            add(" + ad.getDMSAGReference() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DmcValueException ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("        return(attr);\n");
			sb.append("    }\n\n");
		}

    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		if (ad.getType().getIsRefType()){
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				DebugInfo.debug("*** Mapped value deletion not yet supported for non object reference types.");
//				sb.append("    /**\n");
//				sb.append("     * Deletes a " + ad.getName() + " value.\n");
//				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
//				sb.append("     */\n");
//		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
//				sb.append("    public DmcAttribute del" + functionName + "(Object value){\n");
//		    	sb.append("        DmcAttribute attr = del(" + ad.getDMSAGReference() + ", value);\n");
//				sb.append("        return(attr);\n");
//				sb.append("    }\n\n");
			}
			else{
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(Object value) throws DmcValueException {\n");
//		    	sb.append("        return(del(" + ad.getDMSAGReference() + ", value));\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        \n");
				sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
				sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getDMSAGReference() + "), value);\n");
				sb.append("        else\n");
				sb.append("            attr = del(" + ad.getDMSAGReference() + ", value);\n");
				sb.append("        \n");
				sb.append("        return(attr);\n");
				sb.append("    }\n\n");
				
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(" + typeName + "DMO value){\n");
//				sb.append("        DmcAttribute<?> rc = null;\n");
//		    	sb.append("        rc = del(" + ad.getDMSAGReference() + ", value);\n");
//				sb.append("        return(rc);\n");
//		    	sb.append("        return(del(" + ad.getDMSAGReference() + ", value));\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
				sb.append("        \n");
				sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
				sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getDMSAGReference() + "), value.getObjectName());\n");
				sb.append("        else\n");
				sb.append("            attr = del(" + ad.getDMSAGReference() + ", value.getObjectName());\n");
				sb.append("        \n");
				sb.append("        return(attr);\n");
				sb.append("    }\n\n");

			}
		}
		else{
			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param key The key of the " + typeName + " to be deleted from the map of attribute values.\n");
			sb.append("     */\n");//	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> del" + functionName + "(Object key){\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        \n");
			sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
			sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getDMSAGReference() + "), key);\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("        \n");
			sb.append("        attr = del(" + ad.getDMSAGReference() + ", key);\n");
			sb.append("        \n");
			sb.append("        return(attr);\n");
			sb.append("    }\n\n");
			
	    	sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
	    	sb.append("     * @param key the " + ad.getType().getKeyClass() + " key value\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public DmcAttribute<?> del" + functionName + "(" + ad.getType().getKeyClass() + " key) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
			sb.append("        \n");
			sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
			sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getDMSAGReference() + "), key);\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("        \n");
			sb.append("        attr = del(" + ad.getDMSAGReference() + ", key);\n");
			sb.append("        \n");
			sb.append("        return(attr);\n");
	    	sb.append("    }\n\n");

	    	
	    	
//	    	sb.append("    /**\n");
//			sb.append("     * Deletes a " + ad.getName() + " value.\n");
//			sb.append("     * @param key The key of the " + typeName + " to be deleted from set of attribute values.\n");
//			sb.append("     */\n");
//			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//			sb.append("    public DmcAttribute<?> del" + functionName + "(Object key) throws DmcValueException {\n");
//	    	sb.append("        DmcAttribute<?> attr = del(" + ad.getDMSAGReference() + ", key);\n");
//			sb.append("        return(attr);\n");
//			sb.append("    }\n\n");
//			
//			sb.append("    /**\n");
//			sb.append("     * Deletes a " + ad.getName() + " value.\n");
//			sb.append("     * @param key The key of the " + typeName + " to be deleted from set of attribute values.\n");
//			sb.append("     */\n");
//			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//			sb.append("    public DmcAttribute<?> del" + functionName + "(" + ad.getType().getKeyClass() + " key){\n");
//			sb.append("        return(del(" + ad.getDMSAGReference() + ", key));\n");
//			sb.append("    }\n\n");			
		}

    	////////////////////////////////////////////////////////////////////////////////
    	// contains
		// TODO: add support for containsKey with MAPPED attributes
//    	sb.append("    /**\n");
//    	sb.append("     * Returns true if we contain a valued keyed by the specified " + typeName + ".\n");
//    	sb.append("     * @param value " + typeName + "\n");
//    	sb.append("     */\n");
//		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//    	sb.append("    public boolean " + ad.getName() + "ContainsKey(" + ad.getType().getKeyClass() + " value) {\n");
//    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
//    	sb.append("        return(attr.contains(value));\n");
//    	sb.append("    }\n\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(" + ad.getDMSAGReference() + ");\n");
		sb.append("    }\n\n");
		
		
	}

//	/**
//	 * @param value the string who first letter should be capitalized.
//	 * @return take a string like hello and return Hello
//	 */
//	static public String capTheName(String value){
//    	StringBuffer 	name 	= new StringBuffer();
//    	name.append(value);
//    	name.setCharAt(0,Character.toUpperCase(name.charAt(0)));
//    	return(name.toString());
//	}
	
	/**
	 * Returns the class or interface name after the last dot in an import statement.
	 * @param value the import statement e.g. org.dmd.dmc.DmcObject
	 * @return the part after the last dot e.g. DmcObject
	 */
	static public String getClassFromImport(String value){
		int lastDot = value.lastIndexOf(".");
		return(value.substring(lastDot+1));
	}
	
	static public void dumpIterable(String dmwdir, String basePackage, String typeImport, String typeName, String genericArgs, String fileHeader, PrintStream progress) throws IOException {
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmwdir, typeName + "IterableDMW.java");
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.dmw;\n\n");
        
        ImportManager imports = new ImportManager();
        	
        imports.addImport("java.util.Iterator", "Beacuse we're iterating");
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

	static public void dumpObjectIterable(String dmwdir, String basePackage, String typeImport, String typeName, String dmwImport, String genericArgs, String fileHeader, PrintStream progress) throws IOException {
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmwdir, typeName + "IterableDMW.java");
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.dmw;\n\n");
        
        out.write("import java.util.Iterator;\n\n");
        out.write("import org.dmd.dmw.DmwObjectIterator;\n");
        if (typeImport != null)
        	out.write("import " + typeImport + ";  // dmo type import\n");
        
        if (dmwImport != null)
        	out.write("import " + dmwImport + ";  // wrapper type import\n");
        
        String suffix = "";
        if ( (dmwImport != null) && (dmwImport.endsWith("DMW"))){
        	suffix = "DMW";
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
        
        
        out.write("public class " + typeName + "IterableDMW extends DmwObjectIterator<" + typeName + suffix + args + ", " + typeName + "DMO" + args + "> {\n");
        out.write("\n");
        out.write("    public final static " + typeName + "IterableDMW emptyList = new " + typeName + "IterableDMW();\n");
        out.write("\n");
        out.write("    protected " + typeName + "IterableDMW(){\n");
        out.write("        super();\n");
        out.write("    }\n");
        out.write("\n");
        out.write("    public " + typeName + "IterableDMW(Iterator<" + typeName + "DMO" + args +"> it){\n");
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
//		String ofn = dmwdir + File.separator + className + "IterableDMW.java";
		
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmwdir, className + "IterableDMW.java");
        
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        String CAST = className + "DMW";
        String REF 	= className + "REF";
        
        out.write("package " + basePackage + ".generated.dmw;\n\n");
        
        ImportManager imports = new ImportManager();
        
        imports.addImport("java.util.Iterator", "Because we're iterating!");
        imports.addImport("org.dmd.dmw.DmwContainerIterator", "Because we're extending the parameterized class");
        imports.addImport(basePackage + ".generated.types." + className + "REF", "To access our reference type");
        
//        out.write("import java.util.Iterator;\n\n");
//        out.write("import org.dmd.dmw.DmwContainerIterator;\n");
//        out.write("import " + basePackage + ".generated.types." + className + "REF;\n");
        
        if (extended){
            imports.addImport(extendedPackage + "." + className, "Because " + className + " uses extended wrappers");
//            out.write("import " + extendedPackage + "." + className + ";\n");
            CAST = className;
        }
        else{
            imports.addImport(basePackage + ".generated.dmw." + className + "DMW", "Because " + className + " is not extended");
//            out.write("import " + basePackage + ".generated.dmw." + className + "DMW;\n");
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
	
	/**
	 * 
	 * @param dmotypedir
	 * @param basePackage
	 * @param baseTypeImport
	 * @param typeName
	 * @param dmcTypeImport
	 * @param nameAttrImport
	 * @param nameAttr
	 * @param nameAttrID
	 * @param genericArgs
	 * @param isRef
	 * @param isNameType
	 * @param isFilterType	if this is a filter type, we overload the nameAttrID to have the ID of the filterAttributeDef from the TypeDefinition
	 * @param fileHeader
	 * @param progress
	 * @throws IOException
	 */
	static public void dumpSVType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String dmcTypeImport, String nameAttrImport, String nameAttr, String nameAttrID, String genericArgs, boolean isRef, boolean isNameType, boolean isFilterType, String fileHeader, PrintStream progress) throws IOException {

		String DMO = "";
		String REF = "";
		boolean dmoREF = false;
		
		if ( (nameAttr == null) && isRef){
			DMO = "DMO";
			REF = "REF";
			dmoREF = true;
		}
		
		
//		String ofn = dmotypedir + File.separator + "DmcType" + typeName + REF + "SV.java";
		
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
        
        
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + REF + "SV.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        out.write("import java.io.Serializable;\n");
        out.write("import org.dmd.dmc.DmcAttribute;\n");
        out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
        out.write("import org.dmd.dmc.DmcValueException;\n");

        if ( (baseTypeImport != null) && (!baseTypeImport.endsWith("DmcAttribute")))
        	out.write("import " + baseTypeImport + ";    // base type import\n");
                 	                
        if (dmcTypeImport != null)
        	out.write("import " + dmcTypeImport + DMO + ";    // DmcType import\n");


//        if (baseTypeImport != null)
//        	out.write("import " + baseTypeImport + ";    // base type import\n");
//                 	                
//        if ((dmcTypeImport != null) && (!dmcTypeImport.endsWith("DmcAttribute")))
//        	out.write("import " + dmcTypeImport + DMO + ";    // DmcType import\n");
                 	                
        out.write("/**\n");
        out.write(" * The DmcType" + typeName + REF + "SV provides storage for a single-valued " + typeName+ "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        out.write("@SuppressWarnings(\"serial\")\n");
        
        out.write("public class DmcType" + typeName + REF + "SV extends DmcType" + typeName + REF + " implements Serializable {\n");
        
        out.write("    \n");
        out.write("    protected " + typeName + DMO + genericArgs + " value;\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SV(){\n");
        out.write("    \n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SV(DmcAttributeInfo ai){\n");
        out.write("        super(ai);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SV getNew(){\n");
        out.write("        return(new DmcType" + typeName + REF + "SV(getAttributeInfo()));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SV getNew(DmcAttributeInfo ai){\n");
        out.write("        return(new DmcType" + typeName + REF + "SV(ai));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        if (dmoREF)
            out.write("    public DmcAttribute<" + typeName + DMO + genericArgs + "> cloneIt(){\n");
        else
        	out.write("    public DmcAttribute<" + typeName + REF + genericArgs + "> cloneIt(){\n");
        out.write("        DmcType" + typeName + REF + "SV rc = getNew();\n");
        out.write("        rc.value = value;\n");
        out.write("        return(rc);\n");
        out.write("    }\n");
        out.write("    \n");

		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        if (dmoREF)
            out.write("    public " + typeName + DMO + genericArgs + " getSVCopy(){\n");
        else
        	out.write("    public " + typeName + REF + genericArgs + " getSVCopy(){\n");
        out.write("        if (value == null)\n");
        out.write("            return(null);\n");
        out.write("        return(cloneValue(value));\n");
        out.write("    }\n");
        out.write("    \n");

        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " set(Object v) throws DmcValueException {\n");
        out.write("        " + typeName + DMO + genericArgs + " rc = typeCheck(v);\n");
        out.write("        // We only return a value if the value actually changed. This supports\n");
        out.write("        // the applyModifier() mechanism on DmcObject where we only return true\n");
        out.write("        // if something changed as a result of the modifier\n");
        out.write("        if (value == null)\n");
        out.write("            value = rc;\n");
        out.write("        else{\n");
        out.write("            if (value.equals(rc))\n");
        out.write("                rc = null;\n");
        out.write("            else\n");
        out.write("                value = rc;\n");
        out.write("        }\n");
        out.write("        return(rc);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public " + typeName + DMO + genericArgs + " getSV(){\n");
        out.write("        return(value);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public int getMVSize(){\n");
        out.write("        return(0);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("}\n\n");
        
        out.close();

//        if (nameAttr != null)
        	dumpSTATICType(dmotypedir, basePackage, baseTypeImport, typeName, dmcTypeImport, nameAttrImport, nameAttr, nameAttrID, genericArgs, isRef, isNameType, isFilterType, fileHeader, progress);

//        	if (!dmoREF)
        		AdapterFormatter.dumpAdapterSV(dmotypedir, typeName, basePackage, REF);

	}

	/**
	 * 
	 * @param dmotypedir
	 * @param basePackage
	 * @param baseTypeImport
	 * @param typeName
	 * @param dmcTypeImport
	 * @param nameAttrImport
	 * @param nameAttr
	 * @param fileHeader
	 * @param progress
	 * @throws IOException
	 */
	static public void dumpSTATICType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String dmcTypeImport, String nameAttrImport, String nameAttr, String nameAttrID, String genericArgs, boolean isRef, boolean isNameType, boolean isFilterType, String fileHeader, PrintStream progress) throws IOException {
		String DMO = "";
		String REF = "";
//		boolean dmoREF = false;
		
		// If this is a reference type but not for a named object, just return
		if ( (nameAttr == null) && isRef){
			return;
//			DMO = "DMO";
//			REF = "REF";
		}
		
//		String ofn = dmotypedir + File.separator + "DmcType" + typeName + REF + "STATIC.java";
		
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
        
        
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + REF + "STATIC.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        out.write("import org.dmd.dmc.DmcValueException;\n");
        out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
        out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");
        
        if (isNameType){
            out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
            out.write("import org.dmd.dmc.DmcObjectName;\n");
            out.write("import org.dmd.dmc.DmcNameBuilderIF;\n");
            out.write("import org.dmd.dmc.types.DmcTypeDmcObjectName;\n");
        }
        
        if (isFilterType){
            out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
            out.write("import org.dmd.dmc.DmcFilter;\n");
            out.write("import org.dmd.dmc.DmcFilterBuilderIF;\n");
            out.write("import org.dmd.dmc.types.DmcTypeDmcFilter;\n");
        }
//        else
//            out.write("import org.dmd.dmc.DmcStaticTypeIF;\n");
        	
                 	                
        if (baseTypeImport != null){
        	if (baseTypeImport.indexOf("DmcType") == -1)
        		out.write("import " + baseTypeImport + ";    // base type import\n");
        }
                 	                
//        if ((primitiveImport != null) && (!primitiveImport.endsWith("DmcAttribute")))
        if (dmcTypeImport != null){
//        	if (dmcTypeImport.indexOf("Enum") != -1)
            if (dmcTypeImport.endsWith("Enum"))
        		out.write("import " + dmcTypeImport + DMO + ";    // DmcType import\n");
        }
                 	                
        out.write("\n");
        out.write("/**\n");
        out.write(" * The DmcType" + typeName + REF + "STATIC provides static access to functions used to manage values of type " + typeName+ "\n");
        out.write(" * These methods are used to support ComplexTypeDefinitions.\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        
        if (isNameType)
            out.write("public class DmcType" + typeName + REF + "STATIC implements DmcNameBuilderIF {\n");
        else if (isFilterType)
            out.write("public class DmcType" + typeName + REF + "STATIC implements DmcFilterBuilderIF {\n");
        else
        	out.write("public class DmcType" + typeName + REF + "STATIC {\n");
        
        out.write("    \n");
        out.write("    public static DmcType" + typeName + REF + "STATIC instance;\n");
        out.write("    static DmcType" + typeName + REF + "SV typeHelper;\n");
        
        if (isNameType){
            out.write("    static String    nameClass = \"" + typeName + "\";\n");
            out.write("    static final int attrID    = " + nameAttrID + ";\n");
        }
        if (isFilterType){
            out.write("    static String    filterClass = \"" + typeName + "\";\n");
            out.write("    static final int attrID      = " + nameAttrID + ";\n");
        }
        	
        out.write("    \n");
        out.write("    static {\n");
        out.write("        instance = new DmcType" + typeName + REF + "STATIC();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    protected DmcType" + typeName + REF + "STATIC() {\n");
        out.write("        typeHelper = new DmcType" + typeName + REF + "SV();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public " + typeName + REF + genericArgs + " typeCheck(Object value) throws DmcValueException {\n");
        out.write("    	   return(typeHelper.typeCheck(value));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public " + typeName + REF + genericArgs + " cloneValue(" + typeName + REF + genericArgs + " value) throws DmcValueException {\n");
        out.write("    	   return(typeHelper.cloneValue(value));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public void serializeValue(DmcOutputStreamIF dos, " + typeName + REF + genericArgs + " value) throws Exception {\n");
        out.write("    	   typeHelper.serializeValue(dos, value);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public " + typeName + REF + genericArgs + " deserializeValue(DmcInputStreamIF dis) throws Exception {\n");
        out.write("    	   return(typeHelper.deserializeValue(dis));\n");
        out.write("    }\n");
        out.write("    \n");
        
        if (isNameType){
            out.write("    @Override\n");
	        out.write("    public DmcTypeDmcObjectName<?> getNewNameHolder(DmcObjectName name, DmcAttributeInfo ai){\n");
	        out.write("        DmcTypeDmcObjectName<?> rc = typeHelper.getNew(ai);\n");
	        out.write("        try {\n");
	        out.write("            rc.set(name);\n");
	        out.write("        } catch (DmcValueException e) {\n");
	        out.write("            throw(new IllegalStateException(\"Shouldn't throw exception when setting a name attribute value in a DmcNameBuilderIF - occurred for type: \" + name.getNameClass(), e));\n");
	        out.write("        }\n");
	        out.write("        return(rc);\n");
	        out.write("    }\n");
	        out.write("    \n");
	        
            out.write("    @Override\n");
	        out.write("    public String getNameClass(){\n");
	        out.write("    	   return(nameClass);\n");
	        out.write("    }\n");
	        out.write("    \n");
	        
            out.write("    @Override\n");
	        out.write("    public int getNameAttributeID(){\n");
	        out.write("    	   return(attrID);\n");
	        out.write("    }\n");
	        out.write("    \n");
        }
        
        if (isFilterType){
            out.write("    @Override\n");
	        out.write("    public DmcTypeDmcFilter<?> getNewFilterHolder(DmcFilter filter, DmcAttributeInfo ai){\n");
	        out.write("        DmcTypeDmcFilter<?> rc = typeHelper.getNew(ai);\n");
	        out.write("        try {\n");
	        out.write("            rc.set(filter);\n");
	        out.write("        } catch (DmcValueException e) {\n");
	        out.write("            throw(new IllegalStateException(\"Shouldn't throw exception when setting a filter attribute value in a DmcFilterBuilderIF - occurred for type: \" + filter.getFilterClass(), e));\n");
	        out.write("        }\n");
	        out.write("        return(rc);\n");
	        out.write("    }\n");
	        out.write("    \n");
	        
            out.write("    @Override\n");
	        out.write("    public String getFilterClass(){\n");
	        out.write("    	   return(filterClass);\n");
	        out.write("    }\n");
	        out.write("    \n");
	        
            out.write("    @Override\n");
	        out.write("    public int getFilterAttributeID(){\n");
	        out.write("    	   return(attrID);\n");
	        out.write("    }\n");
	        out.write("    \n");
        }
        
        out.write("}\n\n");
        
        out.close();

	}

	/**
	 * 
	 * @param dmotypedir
	 * @param basePackage
	 * @param baseTypeImport
	 * @param typeName
	 * @param dmcTypeImport
	 * @param nameAttrImport
	 * @param nameAttr
	 * @param fileHeader
	 * @param progress
	 * @throws IOException
	 */
	static public void dumpMVType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String dmcTypeImport, String nameAttrImport, String nameAttr, String genericArgs, boolean isRef, String fileHeader, PrintStream progress) throws IOException {
		String DMO = "";
		String REF = "";
		boolean dmoREF = false;
		
//		if (typeName.equals("SomeRelation")){
//			System.out.println("HERE");
//		}
		
		if ( (nameAttr == null) && isRef){
			DMO = "DMO";
			REF = "REF";
			dmoREF = true;
		}
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + REF + "MV.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        out.write("import java.io.Serializable;\n");
        out.write("import java.util.ArrayList;\n");
        out.write("import java.util.Iterator;\n");
        out.write("import org.dmd.dmc.DmcAttribute;\n");
        out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
        out.write("import org.dmd.dmc.DmcValueException;\n");
        
        if (typeName.equals("Modifier"))
            out.write("import org.dmd.dms.generated.dmo.MetaDMSAG;\n");
        	

        if ( (baseTypeImport != null) && (!baseTypeImport.endsWith("DmcAttribute")))
        	out.write("import " + baseTypeImport + ";    // base type import\n");
                 	                
        if (dmcTypeImport != null)
        	out.write("import " + dmcTypeImport + DMO + ";    // DmcType import\n");
                 	                
        out.write("/**\n");
        out.write(" * The DmcType" + typeName + REF + "MV provides storage for a multi-valued " + typeName+ "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        out.write("@SuppressWarnings(\"serial\")\n");

        out.write("public class DmcType" + typeName + REF + "MV extends DmcType" + typeName + REF + " implements Serializable {\n");
        out.write("    \n");
        out.write("    private final static Iterator<" + typeName + DMO + genericArgs + "> emptyList = (new ArrayList<" + typeName + DMO + genericArgs + ">()).iterator();\n");
        out.write("    \n");
        out.write("    protected ArrayList<" + typeName + DMO + genericArgs + "> value;\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "MV(){\n");
        if (typeName.equals("Modifier"))
            out.write("        super(MetaDMSAG.__modify);\n");
        out.write("    \n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "MV(DmcAttributeInfo ai){\n");
        out.write("        super(ai);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public DmcType" + typeName + REF + "MV getNew(){\n");
        out.write("        return(new DmcType" + typeName + REF + "MV(getAttributeInfo()));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        if (dmoREF)
        	out.write("    public DmcAttribute<" + typeName + DMO + genericArgs + "> cloneIt(){\n");
        else
        	out.write("    public DmcAttribute<" + typeName + REF + genericArgs + "> cloneIt(){\n");
        out.write("        synchronized(this){\n");
        out.write("            DmcType" + typeName + REF + "MV rc = getNew();\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("    \n");
        out.write("            if (getAttributeInfo().indexSize == 0){\n");
        out.write("                for(" + typeName + DMO + genericArgs + " val: value)\n");
        out.write("                try {\n");
        out.write("                    rc.add(val);\n");
        out.write("                } catch (DmcValueException e) {\n");
        out.write("                    throw(new IllegalStateException(\"typeCheck() should never fail here!\",e));\n");
        out.write("                }\n");
        out.write("            }\n");
        out.write("            else{\n");
        out.write("                for(int index=0; index<value.size(); index++)\n");
        out.write("                    try {\n");
        out.write("                        rc.setMVnth(index, value.get(index));\n");
        out.write("                    } catch (DmcValueException e) {\n");
        out.write("                        throw(new IllegalStateException(\"typeCheck() should never fail here!\",e));\n");
        out.write("                    }\n");
        out.write("            }\n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " add(Object v) throws DmcValueException {\n");
        out.write("        synchronized(this){\n");
        out.write("            " + typeName + DMO + genericArgs + " rc = typeCheck(v);\n");
        out.write("            if (value == null)\n");
        out.write("                value = new ArrayList<" + typeName + DMO + genericArgs + ">();\n");
        out.write("            value.add(rc);\n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " del(Object v){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(null);\n");
        out.write("    \n");
        out.write("            " + typeName + DMO + genericArgs + " key = null;\n");
        out.write("            " + typeName + DMO + genericArgs + " rc = null;\n");
        out.write("            try {\n");
        out.write("                key = typeCheck(v);\n");
        out.write("            } catch (DmcValueException e) {\n");
        out.write("                throw(new IllegalStateException(\"Incompatible type passed to del():\" + getName(),e));\n");
        out.write("            }\n");
        
        
        out.write("            int indexof = value.indexOf(key);\n");
        out.write("            if (indexof != -1){\n");
        out.write("                rc = value.get(indexof);\n");
        out.write("                value.remove(rc);\n");
        out.write("            }\n\n");
        
        
//        out.write("            if (value.contains(rc))\n");
//        out.write("                value.remove(rc);\n");
//        out.write("            else\n");
//        out.write("                rc = null;\n");
        
        
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public Iterator<" + typeName + DMO + genericArgs + "> getMV(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(emptyList);\n");
        out.write("    \n");
        out.write("            ArrayList<" + typeName + DMO + genericArgs + "> clone = new ArrayList<" + typeName + DMO + genericArgs + ">(value);\n");
        out.write("            return(clone.iterator());\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public ArrayList<" + typeName + DMO + genericArgs + "> getMVCopy(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(new ArrayList<" + typeName + DMO + genericArgs + ">());\n");
        out.write("            else \n");
        out.write("                return(new ArrayList<" + typeName + DMO + genericArgs + ">(value));\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public int getMVSize(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (getAttributeInfo().indexSize == 0){\n");
        out.write("                if (value == null)\n");
        out.write("                    return(0);\n");
        out.write("                return(value.size());\n");
        out.write("            }\n");
        out.write("            else\n");
        out.write("                return(getAttributeInfo().indexSize);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " getMVnth(int index){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(null);\n");
        out.write("            return(value.get(index));\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " setMVnth(int index, Object v) throws DmcValueException {\n");
        out.write("        synchronized(this){\n");
        out.write("            if (getAttributeInfo().indexSize == 0)\n");
        out.write("                throw(new IllegalStateException(\"Attribute: \" + getAttributeInfo().name + \" is not indexed. You can't use setMVnth().\"));\n");
        out.write("            \n");
        out.write("            if ( (index < 0) || (index >= getAttributeInfo().indexSize))\n");
        out.write("                throw(new IllegalStateException(\"Index \" + index + \" for attribute: \" + getAttributeInfo().name + \" is out of range: 0 <= index < \" + getAttributeInfo().indexSize));\n");
        out.write("            \n");
        out.write("            " + typeName + DMO + genericArgs + " rc = null;\n");
        out.write("            \n");
        out.write("            if (v != null)\n");
        out.write("                rc = typeCheck(v);\n");
        out.write("            \n");
        out.write("            if (value == null){\n");
        out.write("                value = new ArrayList<" + typeName + DMO + genericArgs + ">(getAttributeInfo().indexSize);\n");
        out.write("                for(int i=0;i<getAttributeInfo().indexSize;i++)\n");
        out.write("                    value.add(null);\n");
        out.write("            }\n");
        out.write("            \n");
        out.write("            value.set(index, rc);\n");
        out.write("            \n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean hasValue(){\n");
        out.write("        synchronized(this){\n");
        out.write("            boolean rc = false;\n");
        out.write("            \n");
        out.write("            if (getAttributeInfo().indexSize == 0)\n");
        out.write("                throw(new IllegalStateException(\"Attribute: \" + getAttributeInfo().name + \" is not indexed. You can't use hasValue().\"));\n");
        out.write("            \n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("            \n");
        out.write("            for(int i=0; i<value.size(); i++){\n");
        out.write("                if (value.get(i) != null){\n");
        out.write("                    rc = true;\n");
        out.write("                    break;\n");
        out.write("                }\n");
        out.write("            }\n");
        out.write("            \n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");

        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean contains(Object v){\n");
        out.write("        synchronized(this){\n");
//        out.write("            boolean rc = false;\n");
//        out.write("            try {\n");
//        out.write("                " + typeName + DMO + genericArgs + " val = typeCheck(v);\n");
//        out.write("                rc = value.contains(val);\n");
//        out.write("            } catch (DmcValueException e) {\n");
//        out.write("            }\n");
//        out.write("            return(rc);\n");
        out.write("            if (value == null)\n");
        out.write("                return(false);\n");
        out.write("\n");
        out.write("            try {\n");
        out.write("                " + typeName + DMO + genericArgs + " val = typeCheck(v);\n");
        out.write("                return(value.contains(val));\n");
        out.write("            } catch (DmcValueException e) {\n");
        out.write("                return(false);\n");
        out.write("            }\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("}\n\n");
        
        out.close();
        
//        if (!dmoREF)
    		AdapterFormatter.dumpAdapterMV(dmotypedir, typeName, basePackage, REF);

	}

	/**
	 * 
	 * @param dmotypedir
	 * @param basePackage
	 * @param baseTypeImport
	 * @param typeName
	 * @param dmcTypeImport
	 * @param nameAttrImport
	 * @param nameAttr
	 * @param fileHeader
	 * @param progress
	 * @throws IOException
	 */
	static public void dumpSETType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String dmcTypeImport, String nameAttrImport, String nameAttr, String genericArgs, boolean isRef, String fileHeader, PrintStream progress) throws IOException {
		String DMO = "";
		String REF = "";
		boolean dmoREF = false;
		
		if ( (nameAttr == null) && isRef){
			DMO = "DMO";
			REF = "REF";
			dmoREF = true;
		}
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + REF + "SET.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        out.write("import java.io.Serializable;\n");
        out.write("import java.util.Set;\n");
        out.write("import java.util.HashSet;\n");
        out.write("import java.util.TreeSet;\n");
        out.write("import java.util.Iterator;\n");
        out.write("import org.dmd.dmc.DmcAttribute;\n");
        out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
        out.write("import org.dmd.dmc.DmcValueException;\n");
        out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");

        if ( (baseTypeImport != null) && (!baseTypeImport.endsWith("DmcAttribute")))
        	out.write("import " + baseTypeImport + ";    // base type import\n");
                 	                
        if (dmcTypeImport != null && (!dmcTypeImport.endsWith("ValueTypeEnum")))
        	out.write("import " + dmcTypeImport + DMO + ";    // DmcType import\n");

        out.write("/**\n");
        out.write(" * The DmcType" + typeName + REF + "SET provides storage for a set of " + typeName + DMO + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        out.write("@SuppressWarnings(\"serial\")\n");

        out.write("public class DmcType" + typeName + REF + "SET extends DmcType" + typeName + REF + " implements Serializable {\n");
        
        out.write("    \n");
        out.write("     private final static Iterator<" + typeName + DMO + genericArgs + "> emptyList =  (new HashSet<" + typeName + DMO + genericArgs + ">()).iterator();\n");
        out.write("    \n");

        out.write("    \n");
        out.write("    protected Set<" + typeName + DMO + genericArgs + "> value;\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SET(){\n");
        out.write("        value = null;\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SET(DmcAttributeInfo ai){\n");
        out.write("        super(ai);\n");
        out.write("        initValue();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    void initValue(){\n");
        out.write("        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)\n");
        out.write("            value = new HashSet<" + typeName + DMO + genericArgs + ">();\n");
        out.write("        else\n");
        out.write("            value = new TreeSet<" + typeName + DMO + genericArgs + ">();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public DmcType" + typeName + REF + "SET getNew(){\n");
        out.write("        return(new DmcType" + typeName + REF + "SET(getAttributeInfo()));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        if (dmoREF)
            out.write("    public DmcAttribute<" + typeName + DMO + genericArgs + "> cloneIt(){\n");
        else
        	out.write("    public DmcAttribute<" + typeName + REF + genericArgs + "> cloneIt(){\n");
        out.write("        synchronized(this){\n");
        out.write("            DmcType" + typeName + REF + "SET rc = getNew();\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("    \n");
        out.write("            for(" + typeName + DMO + genericArgs + " val: value)\n");
        out.write("            try {\n");
        out.write("                rc.add(val);\n");
        out.write("            } catch (DmcValueException e) {\n");
        out.write("                throw(new IllegalStateException(\"typeCheck() should never fail here!\",e));\n");
        out.write("            }\n");
        out.write("            return(rc);\n");
        out.write("       }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " add(Object v) throws DmcValueException {\n");
        out.write("        synchronized(this){\n");
        out.write("            " + typeName + DMO + genericArgs + " rc = typeCheck(v);\n");
        out.write("            if (value == null)\n");
        out.write("                initValue();\n");
        out.write("        \n");
        out.write("            // If false is returned, we didn't modify the set, so return null\n");
        out.write("            if (!value.add(rc))\n");
        out.write("                rc = null;\n");
        out.write("        \n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " del(Object v){\n");
        out.write("        synchronized(this){\n");
        out.write("            " + typeName + DMO + genericArgs + " rc = null;\n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("            \n");
        out.write("            try {\n");
        out.write("                rc = typeCheck(v);\n");
        out.write("            } catch (DmcValueException e) {\n");
        out.write("                throw(new IllegalStateException(\"Incompatible type passed to del():\" + getName(),e));\n");
        out.write("            }\n");
        out.write("            if (value.contains(rc)){\n");
        out.write("                value.remove(rc);\n");
        out.write("                if (value.size() == 0)\n");
        out.write("                    value = null;\n");
        out.write("            }\n");
        out.write("            else\n");
        out.write("                rc = null;\n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public Iterator<" + typeName + DMO + genericArgs + "> getMV(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(emptyList);\n");
        out.write("\n");
        out.write("            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)\n");
        out.write("                return( (new HashSet<" + typeName + DMO + genericArgs + ">(value)).iterator() );\n");
        out.write("            else\n");
        out.write("                return( (new TreeSet<" + typeName + DMO + genericArgs + ">(value)).iterator() );\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public Set<" + typeName + DMO + genericArgs + "> getMVCopy(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){\n");
        out.write("                if (value == null)\n");
        out.write("                    return(new HashSet<" + typeName + DMO + genericArgs + ">());\n");
        out.write("                else\n");
        out.write("                    return(new HashSet<" + typeName + DMO + genericArgs + ">(value));\n");
        out.write("            }\n");
        out.write("            else{\n");
        out.write("                if (value == null)\n");
        out.write("                    return(new TreeSet<" + typeName + DMO + genericArgs + ">(value));\n");
        out.write("                else\n");
        out.write("                    return(new TreeSet<" + typeName + DMO + genericArgs + ">(value));\n");
        out.write("            }\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public int getMVSize(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(0);\n");
        out.write("            return(value.size());\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean contains(Object v){\n");
        out.write("        synchronized(this){\n");
//        out.write("            boolean rc = false;\n");
//        out.write("            if (value == null)\n");
//        out.write("                return(rc);\n");
//        out.write("            \n");
//        out.write("            try {\n");
//        out.write("                " + typeName + DMO + genericArgs + " val = typeCheck(v);\n");
//        out.write("                rc = value.contains(val);\n");
//        out.write("            } catch (DmcValueException e) {\n");
//        out.write("            }\n");
//        out.write("            return(rc);\n");
        out.write("            if (value == null)\n");
        out.write("                return(false);\n");
        out.write("            \n");
        out.write("            try {\n");
        out.write("                " + typeName + DMO + genericArgs + " val = typeCheck(v);\n");
        out.write("                return(value.contains(val));\n");
        out.write("            } catch (DmcValueException e) {\n");
        out.write("                return(false);\n");
        out.write("            }\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("}\n\n");
        
        out.close();

//        if (!dmoREF)
    		AdapterFormatter.dumpAdapterSET(dmotypedir, typeName, basePackage, REF);

	}

	/**
	 * 
	 * @param dmotypedir
	 * @param basePackage
	 * @param baseTypeImport
	 * @param typeName
	 * @param primitiveImport
	 * @param nameAttrImport
	 * @param nameAttr
	 * @param fileHeader
	 * @param progress
	 * @throws IOException
	 */
	static public void dumpMAPType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String primitiveImport, String nameAttrImport, String nameAttr, String genericArgs, String keyClass, String keyImport, String fileHeader, PrintStream progress) throws IOException {		
		AdapterFormatter.dumpAdapterMAP(dmotypedir, typeName, basePackage);
		
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + "MAP.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        out.write("import java.io.Serializable;\n");
        out.write("import java.util.Map;\n");
        out.write("import java.util.HashMap;\n");
        out.write("import java.util.TreeMap;\n");
        out.write("import java.util.Iterator;\n");
        out.write("import org.dmd.dmc.DmcAttribute;\n");
        out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
        out.write("import org.dmd.dmc.DmcValueException;\n");
        out.write("import org.dmd.dmc.DmcMappedAttributeIF;\n");
        out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");

        if (baseTypeImport != null)
        	out.write("import " + baseTypeImport + ";    // base type import\n");
                 	                
        if ((primitiveImport != null) && (!primitiveImport.endsWith("DmcAttribute")))
        	out.write("import " + primitiveImport + ";    // primitive import\n");
                 	                
        if (keyImport != null)
        	out.write("import " + keyImport + ";    // key type import\n");
                 	                
        out.write("/**\n");
        out.write(" * The DmcType" + typeName + "MAP provides storage for a map of " + typeName+ "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        out.write("@SuppressWarnings(\"serial\")\n");
        if(nameAttr == null){
        	out.write("// public class DmcType" + typeName + "MAP extends DmcType" + typeName + "<" + typeName + "> {\n");
            out.write("public class DmcType" + typeName + "MAP extends DmcType" + typeName + " implements Serializable {\n");
        }
        else{
        	out.write("// public class DmcType" + typeName + "MAP extends DmcType" + typeName + "<" + typeName + "," + nameAttr + "> {\n");
            out.write("public class DmcType" + typeName + "MAP extends DmcType" + typeName + " implements Serializable {\n");
        }
        
        out.write("    \n");
        out.write("    private final static Iterator<" + typeName + genericArgs + "> emptyList = (new HashMap<" + keyClass + "," + typeName + genericArgs + ">()).values().iterator();\n");

        out.write("    \n");
        out.write("    protected Map<" + keyClass + "," + typeName + genericArgs + "> value;\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + "MAP(){\n");
        out.write("        value = null;\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + "MAP(DmcAttributeInfo ai){\n");
        out.write("        super(ai);\n");
        out.write("        initValue();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    void initValue(){\n");
        out.write("        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)\n");
        out.write("            value = new HashMap<" + keyClass + "," + typeName + genericArgs + ">();\n");
        out.write("        else\n");
        out.write("            value = new TreeMap<" + keyClass + "," + typeName + genericArgs + ">();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public " + keyClass + " firstKey(){\n");
        out.write("        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){\n");
        out.write("            if (value == null)\n");
        out.write("                return(null);\n");
        out.write("            TreeMap<" + keyClass + "," + typeName + genericArgs + "> map = (TreeMap<" + keyClass + "," + typeName + genericArgs + ">)value;\n");
        out.write("            return(map.firstKey());\n");
        out.write("        }\n");
        out.write("        throw(new IllegalStateException(\"Attribute \" + getAttributeInfo().name + \" is HASHMAPPED and doesn't support firstKey()\"));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public DmcType" + typeName + "MAP getNew(){\n");
        out.write("        return(new DmcType" + typeName + "MAP(getAttributeInfo()));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public DmcAttribute<" + typeName + genericArgs + "> cloneIt(){\n");
        out.write("        synchronized(this){\n");
        out.write("            DmcType" + typeName + "MAP rc = getNew();\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("    \n");
        out.write("            for(" + typeName + genericArgs + " val: value.values())\n");
        out.write("            try {\n");
        out.write("                rc.add(val);\n");
        out.write("            } catch (DmcValueException e) {\n");
        out.write("                throw(new IllegalStateException(\"typeCheck() should never fail here!\",e));\n");
        out.write("            }\n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + genericArgs + " add(Object v) throws DmcValueException {\n");
        out.write("        synchronized(this){\n");
        out.write("            " + typeName + genericArgs + " newval = typeCheck(v);\n");
        out.write("            if (value == null)\n");
        out.write("                initValue();\n");
        out.write("            " + keyClass + " key = (" + keyClass + ")((DmcMappedAttributeIF)newval).getKey();\n");
        out.write("            " + typeName + genericArgs + " oldval = value.put(key,newval);\n");
        out.write("            \n");
        out.write("            if (oldval != null){\n");
        out.write("                // We had a value with this key, ensure that the value actually changed\n");
        out.write("                if (oldval.valuesAreEqual(newval))\n");
        out.write("                    newval = null;\n");
        out.write("            }\n");
        out.write("            \n");
        out.write("            return(newval);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + genericArgs + " del(Object key){\n");
        out.write("        synchronized(this){\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(null);\n");
        out.write("    \n");
        out.write("           if (key instanceof " + keyClass + ")\n");
        out.write("                return(value.remove(key));\n");
        out.write("            else\n");
        out.write("                throw(new IllegalStateException(\"Incompatible key type: \" + key.getClass().getName() + \" passed to del():\" + getName()));\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public Iterator<" + typeName + genericArgs + "> getMV(){\n");
        out.write("        synchronized(this){\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(emptyList);\n");
        out.write("    \n");
        out.write("            Map<" + keyClass + "," + typeName + genericArgs + "> clone = null;\n");
        out.write("            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)\n");
        out.write("                clone = new HashMap<" + keyClass + "," + typeName + genericArgs + ">(value);\n");
        out.write("            else\n");
        out.write("                clone = new TreeMap<" + keyClass + "," + typeName + genericArgs + ">(value);\n");
        out.write("            return(clone.values().iterator());\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public Map<" + keyClass + "," + typeName + genericArgs + "> getMVCopy(){\n");
        out.write("        synchronized(this){\n");
        out.write("            Map<" + keyClass + "," + typeName + genericArgs + "> clone = null;\n");
        out.write("            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){\n");
        out.write("                if (value == null)\n");
        out.write("                    clone = new HashMap<" + keyClass + "," + typeName + genericArgs + ">();\n");
        out.write("                else\n");
        out.write("                    clone = new HashMap<" + keyClass + "," + typeName + genericArgs + ">(value);\n");
        out.write("            }\n");
        out.write("            else{\n");
        out.write("                if (value == null)\n");
        out.write("                    clone = new TreeMap<" + keyClass + "," + typeName + genericArgs + ">();\n");
        out.write("                else\n");
        out.write("                    clone = new TreeMap<" + keyClass + "," + typeName + genericArgs + ">(value);\n");
        out.write("            }\n");
        out.write("            return(clone);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    @Override\n");
        out.write("    public int getMVSize(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(0);\n");
        out.write("            return(value.size());\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + genericArgs + " getByKey(Object key){\n");
        out.write("        synchronized(this){\n");
        out.write("           if (value == null)\n");
        out.write("               return(null);\n");
        out.write("    \n");
        out.write("            if (key instanceof " + keyClass + ")\n");
        out.write("                return(value.get((" + keyClass + ") key));\n");
        out.write("            else\n");
        out.write("                throw(new IllegalStateException(\"Incompatible type: \" + key.getClass().getName() + \" passed to del():\" + getName()));\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean contains(Object v){\n");
        out.write("        synchronized(this){\n");
        out.write("           if (value == null)\n");
        out.write("               return(false);\n");
        out.write("    \n");
        out.write("            try {\n");
        out.write("                " + typeName + genericArgs + " val = typeCheck(v);\n");
        out.write("                return(value.containsValue(val));\n");
        out.write("            } catch (DmcValueException e) {\n");
        out.write("                return(false);\n");
        out.write("            }\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean containsKey(Object key){\n");
        out.write("        synchronized(this){\n");
        out.write("           if (value == null)\n");
        out.write("               return(false);\n");
        out.write("    \n");
        out.write("           if (key instanceof " + keyClass + ")\n");
        out.write("                return(value.containsKey(key));\n");
        out.write("            return(false);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("}\n\n");
        
        out.close();

	}

	/**
	 * Dumps the DmcType required for a generated complex type.
	 * @param header The file header or ""
	 * @param basePackage The base package where this code will be generated - .generated.types will be appended to this package.
	 * @param od The output directory.
	 * @param cn The class name of the complex type.
	 * @param containsRefs a flag to indicate if the complex type contains reference types
	 * @throws IOException
	 */
    static public void dumpComplexTypeDmcType(String header, String basePackage, String od, String cn, boolean containsRefs) throws IOException {
    	BufferedWriter out = FileUpdateManager.instance().getWriter(od, "DmcType" + cn + ".java");

    	if (header != null)
    		out.write(header);
    	
    	ImportManager imports = new ImportManager();
    	
    	out.write("package " + basePackage + ".generated.types;\n\n");
      
		imports.addImport("java.io.Serializable","Marker interface for serialization");
		imports.addImport("java.util.Iterator","For JSON formatting");
		imports.addImport("org.dmd.dmc.DmcInputStreamIF","To support serialization");
		imports.addImport("org.dmd.dmc.DmcOutputStreamIF","To support serialization");

		imports.addImport("org.dmd.dmc.DmcAttributeInfo","Constructor support");
		imports.addImport("org.dmd.dmc.DmcValueException","Type checking");
      	
      	if (containsRefs){
			imports.addImport("org.dmd.dmc.types.DmcTypeComplexTypeWithRefs","Derivation base");
			imports.addImport("org.dmd.dmc.DmcNameResolverWithClashSupportIF","Ambiguous reference resolution");
			imports.addImport("org.dmd.dmc.DmcNameClashResolverIF","Ambiguous reference resolution");
			imports.addImport("org.dmd.dmc.DmcNameResolverIF","Reference resolution");
			imports.addImport("org.dmd.dmc.DmcObject","Ambiguous reference resolution");
			imports.addImport("org.dmd.dmc.DmcValueExceptionSet","Ambiguous reference resolution");
      	}
      	else
			imports.addImport("org.dmd.dmc.DmcAttribute","Derivation base");

      	out.write(imports.getFormattedImports() + "\n\n");

  		out.write("@SuppressWarnings(\"serial\")\n");

  		out.write("/**\n * The DmcType" + cn + " class.\n");
  		out.write(" * This code was auto-generated by the createmeta utility and shouldn't be alterred\n");
  		out.write(" * manually.\n");
  		out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
  		out.write(" *    Called from: " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
  		out.write(" */\n");
      
  		if (containsRefs)
  	  		out.write("abstract public class DmcType" + cn + " extends DmcTypeComplexTypeWithRefs<" + cn + ">" + " implements Serializable {\n\n");
  		else
  			out.write("abstract public class DmcType" + cn + " extends DmcAttribute<" + cn + ">" + " implements Serializable {\n\n");
      	
  		out.write("    /**\n");
  		out.write("     * Default constructor.\n");
  		out.write("     */\n");
      	out.write("    public DmcType" + cn + "(){\n");
      	out.write("    }\n\n");
      		            	
      	out.write("    /**\n");
      	out.write("     * Default constructor.\n");
      	out.write("     */\n");
      	out.write("    public DmcType" + cn + "(DmcAttributeInfo ai){\n");
  		out.write("        super(ai);\n");
  		out.write("    }\n\n");
      		            	
  		out.write("    @Override\n");
  		out.write("    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {\n");
  		out.write("        if (getMVSize() == 0){\n");
  		out.write("            getSV().toJSON(sb,padding,indent);\n");
  		out.write("        }\n");
  		out.write("        else {\n");
  		out.write("            Iterator<" + cn + "> it = getMV();\n");
  		out.write("            while(it.hasNext()){\n");
  		out.write("                " + cn + " value = it.next();\n");
  		out.write("                value.toJSON(sb,padding,indent);\n");
  		out.write("                if (it.hasNext())\n");
  		out.write("                    sb.append(\", \\n\");                    \n");
  		out.write("            }\n");
  		out.write("        }\n");
  		out.write("    }\n\n");

  		out.write("    protected " + cn + " typeCheck(Object value) throws DmcValueException {\n");
  		out.write("        " + cn + " rc = null;\n\n");
  		
  		out.write("        if (value instanceof " + cn + "){\n");
  		out.write("            rc = (" + cn + ")value;\n");
  		out.write("        }\n");
  	
		out.write("        else if (value instanceof String){\n");
		out.write("            rc = new " + cn + "((String)value);\n");
		out.write("        }\n");
  	
		out.write("        else{\n");
		out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + cn + " expected.\"));\n");
		out.write("        }\n");
          
		out.write("        return(rc);\n");
  		out.write("    }\n");

  		out.write("\n");
      
  		out.write("    /**\n");
  		out.write("     * Returns a clone of a value associated with this type.\n");
  		out.write("     */\n");
  		out.write("    public " + cn + " cloneValue(" + cn + " val){\n");
 		out.write("        return(new " + cn + "(val));\n");
  		out.write("    }\n\n");
      	
  		out.write("    /**\n");
  		out.write("     * Writes a " + cn + ".\n");
  		out.write("     */\n");
  		out.write("    @Override\n");
  		out.write("    public void serializeValue(DmcOutputStreamIF dos, " + cn + " value) throws Exception {\n");
  		out.write("        value.serializeIt(dos);\n");
  		out.write("    }\n\n");
  	
  		out.write("    /**\n");
  		out.write("     * Reads a " + cn + ".\n");
      	out.write("     */\n");
      	out.write("    @Override\n");
      	out.write("    public " + cn + " deserializeValue(DmcInputStreamIF dis) throws Exception {\n");
      	out.write("        " + cn + " rc = new " + cn + "();\n");
      	out.write("        rc.deserializeIt(dis);\n");
      	out.write("        return(rc);\n");
      	out.write("    }\n\n");
      	
      	if (containsRefs){
	  		out.write("    /**\n");
	  		out.write("     * Resolves a " + cn + ".\n");
	  		out.write("     */\n");
	  		out.write("    @Override\n");
	  		out.write("    public void resolveValue(DmcNameResolverIF resolver, " + cn + " value, String attrName) throws DmcValueException {\n");
	  		out.write("        value.resolve(resolver,attrName);\n");
	  		out.write("    }\n\n");
	  		
	  		out.write("    /**\n");
	  		out.write("     * Resolves a " + cn + ".\n");
	  		out.write("     */\n");
	  		out.write("    @Override\n");
	  		out.write("    public void resolveValue(DmcNameResolverWithClashSupportIF resolver, " + cn + " value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {\n");
	  		out.write("        value.resolve(resolver,object,ncr,ai);\n");
	  		out.write("    }\n\n");

      	}

  	        		
      	out.write("\n");
      	out.write("\n");

      out.write("}\n");

      out.close();

  }
  
	/**
	 * Dumps the DmcType required for a generated complex type.
	 * @param header The file header or ""
	 * @param basePackage The base package where this code will be generated - .generated.types will be appended to this package.
	 * @param od The output directory.
	 * @param cn The class name of the complex type.
	 * @param containsRefs a flag to indicate if the complex type contains reference types
	 * @throws IOException
	 */
    static public void dumpExtendedReferenceTypeDmcType(String header, String basePackage, String od, String cn, boolean containsRefs, ExtendedReferenceTypeDefinition ertd) throws IOException {
    	BufferedWriter out = FileUpdateManager.instance().getWriter(od, "DmcType" + cn + ".java");
    	ImportManager imports = new ImportManager();
    	
    	imports.addImport("org.dmd.dmc.DmcInputStreamIF", "Serialization support");
    	imports.addImport("org.dmd.dmc.DmcOutputStreamIF", "Serialization support");
    	
    	imports.addImport("org.dmd.dmc.DmcAttributeInfo", "Standard attribute interface");
    	imports.addImport("org.dmd.dmc.DmcValueException", "Value exceptions");
    	imports.addImport("org.dmd.dmc.types.DmcTypeNamedObjectREF", "The class we extend");
    	
    	imports.addImport(ertd.getExtendedReferenceClass().getDmoImport(), "The class we refer to");
    	
      	imports.addImport(ertd.getExtendedReferenceClass().getIsNamedBy().getType().getPrimitiveType(), "Name type");
    	imports.addImport("org.dmd.dmc.DmcOutputStreamIF", "Serialization support");

    	out.write(header);
    	out.write("package " + basePackage + ".generated.types;\n\n");
    	
    	out.write(imports.getFormattedImports() + "\n\n");
    	
      
//    	out.write("import java.io.Serializable;\n");
//    	out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
//      	out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");

//      	out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
//      	out.write("import org.dmd.dmc.DmcValueException;\n");
//      	out.write("import org.dmd.dmc.types.DmcTypeNamedObjectREF;\n");
      	
//      	if (containsRefs){
//          	out.write("import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;\n");
//          	out.write("import org.dmd.dmc.DmcNameResolverIF;\n");
//      	}
//      	else
//          	out.write("import org.dmd.dmc.DmcAttribute;\n");


  		out.write("@SuppressWarnings(\"serial\")\n");

  		out.write("/**\n * The DmcType" + cn + " class.\n");
  		out.write(" * This code was auto-generated and shouldn't be alterred manually.\n");
  		out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
  		out.write(" *    Called from: " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
  		out.write(" */\n");
      
//  		if (containsRefs)
//  	  		out.write("abstract public class DmcType" + cn + " extends DmcTypeComplexTypeWithRefs<" + cn + ">" + " implements Serializable {\n\n");
//  		else
//  			out.write("abstract public class DmcType" + cn + " extends DmcAttribute<" + cn + ">" + " implements Serializable {\n\n");
  		
//  		String ref = ertd.getExtendedReferenceClass().getName().getNameString();
  		String nametype = ertd.getExtendedReferenceClass().getIsNamedBy().getType().getName().getNameString();
  		
		out.write("abstract public class DmcType" + cn + " extends DmcTypeNamedObjectREF<" + ertd.getName() + ", " + nametype + "> {\n\n");
      	
  		out.write("    /**\n");
  		out.write("     * Default constructor.\n");
  		out.write("     */\n");
      	out.write("    public DmcType" + cn + "(){\n");
      	out.write("    }\n\n");
      		            	
      	out.write("    /**\n");
      	out.write("     * Default constructor.\n");
      	out.write("     */\n");
      	out.write("    public DmcType" + cn + "(DmcAttributeInfo ai){\n");
  		out.write("        super(ai);\n");
  		out.write("    }\n\n");
      		            	
      	out.write("    @Override\n");
      	out.write("    protected " + ertd.getName() + " getNewHelper(){\n");
      	out.write("        return(new " + ertd.getName() + "());\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    protected " + nametype + " getNewName(){\n");
      	out.write("        return(new " + nametype + "());\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    protected String getDMOClassName(){\n");
      	out.write("        return(" + ertd.getExtendedReferenceClass().getName() + "DMO.class.getName());\n");
      	out.write("    }\n\n");
      	
      	out.write("    @Override\n");
      	out.write("    protected boolean isDMO(Object value){\n");
      	out.write("        if (value instanceof " + ertd.getExtendedReferenceClass().getName() + "DMO)\n");
      	out.write("            return(true);\n");
      	out.write("        return(false);\n");
    	out.write("    }\n\n");

  		out.write("    protected " + cn + " typeCheck(Object value) throws DmcValueException {\n");
  		out.write("        " + cn + " rc = null;\n\n");
  		
  		out.write("        if (value instanceof " + cn + "){\n");
  		out.write("            rc = (" + cn + ")value;\n");
  		out.write("        }\n");
  	
		out.write("        else if (value instanceof String){\n");
		out.write("            rc = new " + cn + "((String)value);\n");
		out.write("        }\n");
  	
		out.write("        else{\n");
		out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + cn + " expected.\"));\n");
		out.write("        }\n");
          
		out.write("        return(rc);\n");
  		out.write("    }\n");

  		out.write("\n");
      
  		out.write("    /**\n");
  		out.write("     * Returns a clone of a value associated with this type.\n");
  		out.write("     */\n");
  		out.write("    public " + cn + " cloneValue(" + cn + " val){\n");
 		out.write("        return(new " + cn + "(val));\n");
  		out.write("    }\n\n");
      	
  		out.write("    /**\n");
  		out.write("     * Writes a " + cn + ".\n");
  		out.write("     */\n");
  		out.write("    @Override\n");
  		out.write("    public void serializeValue(DmcOutputStreamIF dos, " + cn + " value) throws Exception {\n");
  		out.write("        value.serializeIt(dos);\n");
  		out.write("    }\n\n");
  	
  		out.write("    /**\n");
  		out.write("     * Reads a " + cn + ".\n");
      	out.write("     */\n");
      	out.write("    @Override\n");
      	out.write("    public " + cn + " deserializeValue(DmcInputStreamIF dis) throws Exception {\n");
      	out.write("        " + cn + " rc = new " + cn + "();\n");
      	out.write("        rc.deserializeIt(dis);\n");
      	out.write("        return(rc);\n");
      	out.write("    }\n\n");
      	
      	if (containsRefs){
	  		out.write("    /**\n");
	  		out.write("     * Resolves a " + cn + ".\n");
	  		out.write("     */\n");
	  		out.write("    @Override\n");
	  		out.write("    public void resolveValue(DmcNameResolverIF resolver, " + cn + " value, String attrName) throws DmcValueException {\n");
	  		out.write("        value.resolve(resolver,attrName);\n");
	  		out.write("    }\n\n");
      	}

  	        		
      	out.write("\n");
      	out.write("\n");

      out.write("}\n");

      out.close();

  }
  


}
