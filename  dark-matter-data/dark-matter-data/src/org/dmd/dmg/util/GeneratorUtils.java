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
package org.dmd.dmg.util;

import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.dmd.dmc.types.StringName;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.util.BooleanVar;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The GeneratorUtils class provides a variety of utility functions that
 * come in handy when generating code associated with Dark Matter Objects.
 */
public class GeneratorUtils {

	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd        The class definition of the object.
	 * @param baseClass The base class of the object you're generating or null if there's no base class.
	 * @param allAttr   An array that will be populated with all attribute definitions of the class.
	 * @param sb        The buffer where the import statements are accumulated.
	 */
//	static public void getAttributesAndImports(ClassDefinition cd, String baseClass, ArrayList<AttributeDefinition> allAttr, StringBuffer sb){
	static public void getAttributesAndImports(ClassDefinition cd, String baseClass, TreeMap<StringName,AttributeDefinition> allAttr, StringBuffer sb){
		BooleanVar			needJavaUtil	= new BooleanVar(false);
		TreeMap<StringName,TypeDefinition>	types = new TreeMap<StringName,TypeDefinition>();
		
		collectAllAttributes(cd,allAttr,types,needJavaUtil);
		
//		Iterator<AttributeDefinition> may = cd.getMay();
//		if (may != null){
//			while(may.hasNext()){
//				AttributeDefinition ad = may.next();
//				TypeDefinition td = ad.getType();
//				types.put(td.getName(), td);
//				if (ad.getIsMultiValued())
//					needJavaUtil = true;
//				
//				allAttr.add(ad);
//			}
//		}
//		
//		Iterator<AttributeDefinition> must = cd.getMust();
//		if (must != null){
//			while(must.hasNext()){
//				AttributeDefinition ad = must.next();
//				TypeDefinition td = ad.getType();
//				types.put(td.getName(), td);
//				if (ad.getIsMultiValued())
//					needJavaUtil = true;
//				
//				allAttr.add(ad);
//			}
//		}
		
		if (needJavaUtil.booleanValue())
			sb.append("import java.util.*;\n\n");
		
		if (cd.getIsNamedBy() != null){
			sb.append("import org.dmd.dmc.DmcAttribute;\n");
		}
		
		sb.append("import org.dmd.dmc.DmcValueException;\n");
		
		Iterator<TypeDefinition> t = types.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();
			if (td.getPrimitiveType() != null){
				
//				if (td.getName().equals("AdminGroup")){
//					DebugInfo.debug("type: " + td.getName());
//					DebugInfo.debug("primitive:         " + td.getPrimitiveType());
//					DebugInfo.debug("original.dmoclass: " + td.getOriginalClass().getDmoImport());
//				}
				
//				DebugInfo.debug("TYPE: " + td.getName());
				if (td.getIsRefType()){
					if (td.getOriginalClass().getInternalTypeRef().getHelperClassName() == null){
						DebugInfo.debug("\n\n*** PROBABLY MISSING isNamedBy FQN on a hierarchic object: " + td.getName() + " ***\n\n");
					}
					sb.append("import " + td.getOriginalClass().getInternalTypeRef().getHelperClassName() + ";\n");
				}
				else
					sb.append("import " + td.getPrimitiveType() + ";\n");
			}
			
//			sb.append("import " + td.getTypeClassName() + ";\n");
		}
		
		sb.append("\n");
		
		if (cd.getIsNamedBy() != null){
			sb.append("import org.dmd.dmc.DmcNamedObjectIF;\n");
		}

		if (baseClass != null)
			sb.append("import " + baseClass + ";\n");

		sb.append("import " + cd.getDmoImport() + ";\n");
		
		sb.append("\n");
	}
	
	/**
	 * This method will recursively gather all attribute defintions up the class hierarchy.
	 * @param cd
	 * @param allAttr
	 */
	static void collectAllAttributes(ClassDefinition cd, TreeMap<StringName,AttributeDefinition> allAttr, TreeMap<StringName,TypeDefinition> types, BooleanVar needJavaUtil){
		if (cd.getDerivedFrom() != null){
			collectAllAttributes(cd.getDerivedFrom(),allAttr,types,needJavaUtil);
		}
		
		if (cd.getIsNamedBy() != null){
			TypeDefinition td = cd.getIsNamedBy().getType();
			types.put(td.getName(), td);
		}
		
		Iterator<AttributeDefinition> may = cd.getMay();
		if (may != null){
			while(may.hasNext()){
				AttributeDefinition ad = may.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				
				switch(ad.getValueType()){
				case SINGLE:
					break;
				case MULTI:
					needJavaUtil.set(true);
					break;
				case HASHMAPPED:
					break;
				case TREEMAPPED:
					break;
				}
				
//				if (ad.getIsMultiValued())
//					needJavaUtil.set(true);
				
				allAttr.put(ad.getName(),ad);
			}
		}
		
		Iterator<AttributeDefinition> must = cd.getMust();
		if (must != null){
			while(must.hasNext()){
				AttributeDefinition ad = must.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				
				switch(ad.getValueType()){
				case SINGLE:
					break;
				case MULTI:
					needJavaUtil.set(true);
					break;
				case HASHMAPPED:
					break;
				case TREEMAPPED:
					break;
				}

//				if (ad.getIsMultiValued())
//					needJavaUtil.set(true);
				
				allAttr.put(ad.getName(),ad);
			}
		}

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
	
	/**
	 * This method takes a dot name, for example app.event.explosion and turns it into capitalized
	 * name string like: APP_EVENT_EXPLOSION
	 * @return A camel case string.
	 */
	static public String dotNameToUpperCaseConstant(String in){
		String upper = in.toUpperCase();
		
		return(upper.replaceAll("\\.", "_"));
	}

	static public String getClassNameFromImport(String i){
		int lastDot = i.lastIndexOf(".");
		if (lastDot == -1)
			return("");
		return(i.substring(lastDot + 1));
	}
}
